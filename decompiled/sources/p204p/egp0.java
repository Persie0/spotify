package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class egp0 implements hwf {

    /* JADX INFO: renamed from: a */
    public final boolean f59371a;

    /* JADX INFO: renamed from: b */
    public final int f59372b;

    /* JADX INFO: renamed from: c */
    public final boolean f59373c;

    /* JADX INFO: renamed from: d */
    public final boolean f59374d;

    /* JADX INFO: renamed from: e */
    public final boolean f59375e;

    public egp0(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f59371a = z;
        this.f59372b = i;
        this.f59373c = z2;
        this.f59374d = z3;
        this.f59375e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egp0)) {
            return false;
        }
        egp0 egp0Var = (egp0) obj;
        return this.f59371a == egp0Var.f59371a && this.f59372b == egp0Var.f59372b && this.f59373c == egp0Var.f59373c && this.f59374d == egp0Var.f59374d && this.f59375e == egp0Var.f59375e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59375e) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f59372b, Boolean.hashCode(this.f59371a) * 31, 31), 31, this.f59373c), 31, this.f59374d);
    }
}
