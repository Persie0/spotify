package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rh11 {

    /* JADX INFO: renamed from: a */
    public final String f199084a;

    /* JADX INFO: renamed from: b */
    public final String f199085b;

    /* JADX INFO: renamed from: c */
    public final String f199086c;

    /* JADX INFO: renamed from: d */
    public final boolean f199087d;

    /* JADX INFO: renamed from: e */
    public final ph11 f199088e;

    /* JADX INFO: renamed from: f */
    public final ih11 f199089f;

    /* JADX INFO: renamed from: g */
    public final boolean f199090g;

    public rh11(String str, String str2, String str3, boolean z, ph11 ph11Var, ih11 ih11Var, boolean z2) {
        this.f199084a = str;
        this.f199085b = str2;
        this.f199086c = str3;
        this.f199087d = z;
        this.f199088e = ph11Var;
        this.f199089f = ih11Var;
        this.f199090g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh11)) {
            return false;
        }
        rh11 rh11Var = (rh11) obj;
        return wj50.m88271j(this.f199084a, rh11Var.f199084a) && wj50.m88271j(this.f199085b, rh11Var.f199085b) && wj50.m88271j(this.f199086c, rh11Var.f199086c) && this.f199087d == rh11Var.f199087d && wj50.m88271j(this.f199088e, rh11Var.f199088e) && wj50.m88271j(this.f199089f, rh11Var.f199089f) && this.f199090g == rh11Var.f199090g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199090g) + ((this.f199089f.hashCode() + ((this.f199088e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f199084a.hashCode() * 31, 31, this.f199085b), 31, this.f199086c), 31, this.f199087d)) * 31)) * 31);
    }
}
