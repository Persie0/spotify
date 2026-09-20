package p204p;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes3.dex */
public final class xfb extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public final htz0 f260889a;

    /* JADX INFO: renamed from: b */
    public final cdb f260890b;

    /* JADX INFO: renamed from: c */
    public final Object f260891c = new Object();

    /* JADX INFO: renamed from: d */
    public boolean f260892d = false;

    public xfb(htz0 htz0Var, cdb cdbVar) {
        this.f260889a = htz0Var;
        this.f260890b = cdbVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f260891c) {
            try {
                if (!this.f260892d) {
                    this.f260889a.execute(new RunnableC2210od(this, 15));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f260891c) {
            try {
                if (!this.f260892d) {
                    this.f260889a.execute(new wfb(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f260891c) {
            try {
                if (!this.f260892d) {
                    this.f260889a.execute(new wfb(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
