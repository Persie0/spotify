package p204p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class zeb extends yeb {
    @Override // p204p.yeb
    /* JADX INFO: renamed from: t */
    public final void mo93532t(ayz0 ayz0Var) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) ayz0Var.f21381a.mo92390c();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f79242a).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
