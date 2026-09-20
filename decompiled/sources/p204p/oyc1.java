package p204p;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oyc1 {

    /* JADX INFO: renamed from: a */
    public final int f171729a;

    /* JADX INFO: renamed from: b */
    public final int f171730b;

    /* JADX INFO: renamed from: c */
    public final String f171731c;

    /* JADX INFO: renamed from: d */
    public int f171732d;

    /* JADX INFO: renamed from: e */
    public VolumeProvider f171733e;

    public oyc1(int i, int i2, int i3, String str) {
        this.f171729a = i;
        this.f171730b = i2;
        this.f171732d = i3;
        this.f171731c = str;
    }

    /* JADX INFO: renamed from: a */
    public VolumeProvider mo68416a() {
        oyc1 oyc1Var;
        if (this.f171733e != null) {
            oyc1Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            oyc1Var = this;
            oyc1Var.f171733e = new lyc1(oyc1Var, this.f171729a, this.f171730b, this.f171732d, this.f171731c);
        } else {
            oyc1Var = this;
            oyc1Var.f171733e = new myc1(this, oyc1Var.f171729a, oyc1Var.f171730b, oyc1Var.f171732d);
        }
        return oyc1Var.f171733e;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo44645b(int i);

    /* JADX INFO: renamed from: c */
    public abstract void mo44646c(int i);

    /* JADX INFO: renamed from: d */
    public final void m68417d(int i) {
        this.f171732d = i;
        nyc1.m65872a(mo68416a(), i);
    }
}
