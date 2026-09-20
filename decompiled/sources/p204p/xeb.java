package p204p;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xeb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bdb f260681b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraDevice f260682c;

    public /* synthetic */ xeb(bdb bdbVar, CameraDevice cameraDevice, int i) {
        this.f260680a = i;
        this.f260681b = bdbVar;
        this.f260682c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f260680a) {
            case 0:
                ((CameraDevice.StateCallback) this.f260681b.f26069b).onClosed(this.f260682c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f260681b.f26069b).onDisconnected(this.f260682c);
                break;
            default:
                ((CameraDevice.StateCallback) this.f260681b.f26069b).onOpened(this.f260682c);
                break;
        }
    }
}
