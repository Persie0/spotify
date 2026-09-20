package org.tensorflow.lite.gpu;

/* JADX INFO: loaded from: classes14.dex */
abstract class GpuDelegateNative {

    /* JADX INFO: renamed from: a */
    public static final UnsatisfiedLinkError f10966a;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f10967b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_gpu_jni");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        f10966a = e;
    }

    /* JADX INFO: renamed from: a */
    public static void m24302a() {
        if (f10967b) {
            return;
        }
        try {
            nativeDoNothing();
            f10967b = true;
        } catch (UnsatisfiedLinkError e) {
            UnsatisfiedLinkError unsatisfiedLinkError = f10966a;
            if (unsatisfiedLinkError == null) {
                unsatisfiedLinkError = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError2 = new UnsatisfiedLinkError("Failed to load native GpuDelegate methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + unsatisfiedLinkError);
            unsatisfiedLinkError2.initCause(e);
            unsatisfiedLinkError2.addSuppressed(unsatisfiedLinkError);
            throw unsatisfiedLinkError2;
        }
    }

    private static native void nativeDoNothing();
}
