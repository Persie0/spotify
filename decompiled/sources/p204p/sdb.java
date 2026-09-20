package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class sdb extends gd8 {

    /* JADX INFO: renamed from: c */
    public static final sy7 f207967c = new sy7("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* JADX INFO: renamed from: d */
    public static final sy7 f207968d = new sy7("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* JADX INFO: renamed from: e */
    public static final sy7 f207969e = new sy7("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* JADX INFO: renamed from: f */
    public static final sy7 f207970f = new sy7("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* JADX INFO: renamed from: g */
    public static final sy7 f207971g = new sy7("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* JADX INFO: renamed from: h */
    public static final sy7 f207972h = new sy7("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    /* JADX INFO: renamed from: m0 */
    public static sy7 m77825m0(CaptureRequest.Key key) {
        return new sy7("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
