package p204p;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes3.dex */
public final class cdb extends CameraManager.AvailabilityCallback {

    /* JADX INFO: renamed from: a */
    public final String f36844a;

    /* JADX INFO: renamed from: b */
    public boolean f36845b = true;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ idb f36846c;

    public cdb(idb idbVar, String str) {
        this.f36846c = idbVar;
        this.f36844a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.f36844a.equals(str)) {
            this.f36845b = true;
            if (this.f36846c.f101044f1 == 4) {
                this.f36846c.m50323J(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.f36844a.equals(str)) {
            this.f36845b = false;
        }
    }
}
