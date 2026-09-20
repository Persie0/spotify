package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wz81 {

    /* JADX INFO: renamed from: a */
    public final String f256526a;

    /* JADX INFO: renamed from: b */
    public final boolean f256527b;

    /* JADX INFO: renamed from: c */
    public final e091 f256528c;

    /* JADX INFO: renamed from: d */
    public final boolean f256529d;

    /* JADX INFO: renamed from: e */
    public final gz81 f256530e;

    /* JADX INFO: renamed from: f */
    public final boolean f256531f;

    /* JADX INFO: renamed from: g */
    public final boolean f256532g;

    /* JADX INFO: renamed from: h */
    public final gh00 f256533h;

    public /* synthetic */ wz81(String str, boolean z, e091 e091Var, gz81 gz81Var, boolean z2) {
        this(str, z, e091Var, true, gz81Var, z2, false, null);
    }

    /* JADX INFO: renamed from: a */
    public static wz81 m89416a(wz81 wz81Var, gz81 gz81Var, gh00 gh00Var, int i) {
        String str = wz81Var.f256526a;
        boolean z = wz81Var.f256527b;
        e091 e091Var = wz81Var.f256528c;
        boolean z2 = wz81Var.f256529d;
        if ((i & 16) != 0) {
            gz81Var = wz81Var.f256530e;
        }
        gz81 gz81Var2 = gz81Var;
        boolean z3 = wz81Var.f256531f;
        boolean z4 = (i & 64) != 0 ? wz81Var.f256532g : true;
        if ((i & 128) != 0) {
            gh00Var = wz81Var.f256533h;
        }
        wz81Var.getClass();
        return new wz81(str, z, e091Var, z2, gz81Var2, z3, z4, gh00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz81)) {
            return false;
        }
        wz81 wz81Var = (wz81) obj;
        return wj50.m88271j(this.f256526a, wz81Var.f256526a) && this.f256527b == wz81Var.f256527b && wj50.m88271j(this.f256528c, wz81Var.f256528c) && this.f256529d == wz81Var.f256529d && wj50.m88271j(this.f256530e, wz81Var.f256530e) && this.f256531f == wz81Var.f256531f && this.f256532g == wz81Var.f256532g && wj50.m88271j(this.f256533h, wz81Var.f256533h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f256530e.hashCode() + s571.m77245d((this.f256528c.hashCode() + s571.m77245d(this.f256526a.hashCode() * 31, 31, this.f256527b)) * 31, 31, this.f256529d)) * 31, 31, this.f256531f), 31, this.f256532g);
        gh00 gh00Var = this.f256533h;
        return iM77245d + (gh00Var == null ? 0 : gh00Var.hashCode());
    }

    public wz81(String str, boolean z, e091 e091Var, boolean z2, gz81 gz81Var, boolean z3, boolean z4, gh00 gh00Var) {
        this.f256526a = str;
        this.f256527b = z;
        this.f256528c = e091Var;
        this.f256529d = z2;
        this.f256530e = gz81Var;
        this.f256531f = z3;
        this.f256532g = z4;
        this.f256533h = gh00Var;
    }
}
