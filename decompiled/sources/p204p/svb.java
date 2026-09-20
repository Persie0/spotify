package p204p;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes3.dex */
public final class svb extends wdb {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureSession.CaptureCallback f214372a;

    public svb(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f214372a = captureCallback;
    }
}
