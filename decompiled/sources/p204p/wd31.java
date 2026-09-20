package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wd31 implements yd31 {

    /* JADX INFO: renamed from: a */
    public final vd31 f250198a;

    /* JADX INFO: renamed from: b */
    public final boolean f250199b;

    /* JADX INFO: renamed from: c */
    public final ud31 f250200c;

    public wd31(vd31 vd31Var, boolean z, ud31 ud31Var) {
        this.f250198a = vd31Var;
        this.f250199b = z;
        this.f250200c = ud31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd31)) {
            return false;
        }
        wd31 wd31Var = (wd31) obj;
        return wj50.m88271j(this.f250198a, wd31Var.f250198a) && this.f250199b == wd31Var.f250199b && wj50.m88271j(this.f250200c, wd31Var.f250200c);
    }

    public final int hashCode() {
        return this.f250200c.hashCode() + s571.m77245d(this.f250198a.hashCode() * 31, 31, this.f250199b);
    }
}
