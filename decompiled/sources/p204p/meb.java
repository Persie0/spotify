package p204p;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class meb extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142646a;

    /* JADX INFO: renamed from: b */
    public final Object f142647b;

    public /* synthetic */ meb(Object obj, int i) {
        this.f142646a = i;
        this.f142647b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                break;
            case 1:
                vg61 vg61Var = (vg61) this.f142647b;
                vg61Var.m85398k(cameraCaptureSession);
                vg61Var.mo57518a(vg61Var);
                break;
            default:
                super.onActive(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    fz6.m43170z((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
                }
                break;
            case 1:
                vg61 vg61Var = (vg61) this.f142647b;
                vg61Var.m85398k(cameraCaptureSession);
                vg61Var.mo57519b(vg61Var);
                break;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                break;
            case 1:
                vg61 vg61Var = (vg61) this.f142647b;
                vg61Var.m85398k(cameraCaptureSession);
                vg61Var.mo57520c(vg61Var);
                break;
            default:
                super.onClosed(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        gbb gbbVar;
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((vg61) this.f142647b).m85398k(cameraCaptureSession);
                    vg61 vg61Var = (vg61) this.f142647b;
                    vg61Var.mo57521d(vg61Var);
                    synchronized (((vg61) this.f142647b).f241149a) {
                        wj50.m88280q(((vg61) this.f142647b).f241157i, "OpenCaptureSession completer should not null");
                        vg61 vg61Var2 = (vg61) this.f142647b;
                        gbbVar = vg61Var2.f241157i;
                        vg61Var2.f241157i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((vg61) this.f142647b).f241149a) {
                        wj50.m88280q(((vg61) this.f142647b).f241157i, "OpenCaptureSession completer should not null");
                        vg61 vg61Var3 = (vg61) this.f142647b;
                        gbbVar = vg61Var3.f241157i;
                        vg61Var3.f241157i = null;
                        gbbVar.m44212c(new IllegalStateException("onConfigureFailed"));
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        gbb gbbVar;
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((vg61) this.f142647b).m85398k(cameraCaptureSession);
                    vg61 vg61Var = (vg61) this.f142647b;
                    vg61Var.mo57522e(vg61Var);
                    synchronized (((vg61) this.f142647b).f241149a) {
                        wj50.m88280q(((vg61) this.f142647b).f241157i, "OpenCaptureSession completer should not null");
                        vg61 vg61Var2 = (vg61) this.f142647b;
                        gbbVar = vg61Var2.f241157i;
                        vg61Var2.f241157i = null;
                        break;
                    }
                    return;
                } finally {
                    synchronized (((vg61) this.f142647b).f241149a) {
                        wj50.m88280q(((vg61) this.f142647b).f241157i, "OpenCaptureSession completer should not null");
                        vg61 vg61Var3 = (vg61) this.f142647b;
                        gbbVar = vg61Var3.f241157i;
                        vg61Var3.f241157i = null;
                        gbbVar.m44211b(null);
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((fp10) this.f142647b).f71691i = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                break;
            case 1:
                vg61 vg61Var = (vg61) this.f142647b;
                vg61Var.m85398k(cameraCaptureSession);
                vg61Var.mo57523f(vg61Var);
                break;
            default:
                super.onReady(cameraCaptureSession);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f142646a) {
            case 0:
                Iterator it = ((ArrayList) this.f142647b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                break;
            case 1:
                vg61 vg61Var = (vg61) this.f142647b;
                vg61Var.m85398k(cameraCaptureSession);
                vg61Var.mo57525h(vg61Var, surface);
                break;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                break;
        }
    }

    public meb(List list) {
        this.f142646a = 0;
        this.f142647b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof neb)) {
                ((ArrayList) this.f142647b).add(stateCallback);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m61538a(CameraCaptureSession cameraCaptureSession) {
    }
}
