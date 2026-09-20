package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ht41 implements pu41 {

    /* JADX INFO: renamed from: a */
    public final boolean f94925a;

    /* JADX INFO: renamed from: b */
    public final boolean f94926b;

    /* JADX INFO: renamed from: c */
    public final t2f f94927c;

    /* JADX INFO: renamed from: d */
    public final boolean f94928d;

    /* JADX INFO: renamed from: e */
    public final boolean f94929e;

    public ht41(boolean z, boolean z2, t2f t2fVar, boolean z3, boolean z4) {
        this.f94925a = z;
        this.f94926b = z2;
        this.f94927c = t2fVar;
        this.f94928d = z3;
        this.f94929e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht41)) {
            return false;
        }
        ht41 ht41Var = (ht41) obj;
        return this.f94925a == ht41Var.f94925a && this.f94926b == ht41Var.f94926b && wj50.m88271j(this.f94927c, ht41Var.f94927c) && this.f94928d == ht41Var.f94928d && this.f94929e == ht41Var.f94929e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94929e) + s571.m77245d((this.f94927c.hashCode() + s571.m77245d(Boolean.hashCode(this.f94925a) * 31, 31, this.f94926b)) * 31, 31, this.f94928d);
    }
}
