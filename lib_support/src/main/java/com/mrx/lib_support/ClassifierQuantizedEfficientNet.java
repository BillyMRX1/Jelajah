package com.mrx.lib_support;

import android.app.Activity;

import org.tensorflow.lite.support.common.TensorOperator;
import org.tensorflow.lite.support.common.ops.NormalizeOp;

import java.io.IOException;

public class ClassifierQuantizedEfficientNet extends Classifier {

    /**
     * The quantized model does not require normalization, thus set mean as 0.0f, and std as 1.0f to
     * bypass the normalization.
     */
    private static final float IMAGE_MEAN = 0.0f;

    private static final float IMAGE_STD = 1.0f;

    /** Quantized MobileNet requires additional dequantization to the output probability. */
    private static final float PROBABILITY_MEAN = 0.0f;

    private static final float PROBABILITY_STD = 255.0f;

    /**
     * Initializes a {@code ClassifierQuantizedMobileNet}.
     *
     * @param activity
     */
    public ClassifierQuantizedEfficientNet(Activity activity, Device device, int numThreads)
            throws IOException {
        super(activity, device, numThreads);
    }

    @Override
    protected String getModelPath() {
        return "model.tflite";
    }

    @Override
    protected String getLabelPath() {
        return "labels.txt";
    }

    @Override
    protected TensorOperator getPreprocessNormalizeOp() {
        return new NormalizeOp(IMAGE_MEAN, IMAGE_STD);
    }

    @Override
    protected TensorOperator getPostprocessNormalizeOp() {
        return new NormalizeOp(PROBABILITY_MEAN, PROBABILITY_STD);
    }
}
