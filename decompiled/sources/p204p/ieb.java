package p204p;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ieb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101365a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jeb f101366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraCaptureSession f101367c;

    public /* synthetic */ ieb(jeb jebVar, CameraCaptureSession cameraCaptureSession, int i) {
        this.f101365a = i;
        this.f101366b = jebVar;
        this.f101367c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101365a) {
            case 0:
                this.f101366b.f111518a.onActive(this.f101367c);
                break;
            case 1:
                this.f101366b.f111518a.onClosed(this.f101367c);
                break;
            case 2:
                fz6.m43170z(this.f101366b.f111518a, this.f101367c);
                break;
            case 3:
                this.f101366b.f111518a.onConfigured(this.f101367c);
                break;
            case 4:
                this.f101366b.f111518a.onReady(this.f101367c);
                break;
            default:
                this.f101366b.f111518a.onConfigureFailed(this.f101367c);
                break;
        }
    }
}
