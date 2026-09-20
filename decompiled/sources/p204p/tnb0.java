package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tnb0 {

    /* JADX INFO: renamed from: a */
    public final rpb0 f221929a;

    /* JADX INFO: renamed from: b */
    public final gh00 f221930b;

    public tnb0(rpb0 rpb0Var, gh00 gh00Var) {
        this.f221929a = rpb0Var;
        this.f221930b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb0)) {
            return false;
        }
        tnb0 tnb0Var = (tnb0) obj;
        return wj50.m88271j(this.f221929a, tnb0Var.f221929a) && wj50.m88271j(this.f221930b, tnb0Var.f221930b);
    }

    public final int hashCode() {
        return this.f221930b.hashCode() + (this.f221929a.hashCode() * 31);
    }
}
