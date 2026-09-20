package p204p;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class zyl0 {

    /* JADX INFO: renamed from: a */
    public final bzl0 f287622a;

    public zyl0(int i, Surface surface) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            this.f287622a = new gzl0(new OutputConfiguration(i, surface));
            return;
        }
        if (i2 >= 28) {
            this.f287622a = new fzl0(new ezl0(new OutputConfiguration(i, surface)));
        } else if (i2 >= 26) {
            this.f287622a = new dzl0(new czl0(new OutputConfiguration(i, surface)));
        } else {
            this.f287622a = new bzl0(new azl0(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zyl0)) {
            return false;
        }
        return this.f287622a.equals(((zyl0) obj).f287622a);
    }

    public final int hashCode() {
        return this.f287622a.f32535a.hashCode();
    }

    public zyl0(bzl0 bzl0Var) {
        this.f287622a = bzl0Var;
    }
}
