package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class keb extends nt7 {
    @Override // p204p.nt7
    /* JADX INFO: renamed from: d */
    public final int mo56200d(ArrayList arrayList, htz0 htz0Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f157998b).captureBurstRequests(arrayList, htz0Var, captureCallback);
    }

    @Override // p204p.nt7
    /* JADX INFO: renamed from: l */
    public final int mo56201l(CaptureRequest captureRequest, htz0 htz0Var, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f157998b).setSingleRepeatingRequest(captureRequest, htz0Var, captureCallback);
    }
}
