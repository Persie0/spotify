package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class oi1 {

    /* JADX INFO: renamed from: a */
    public final li1 f165636a;

    /* JADX INFO: renamed from: b */
    public final qi1 f165637b;

    public oi1(li1 li1Var, qi1 qi1Var) {
        this.f165636a = li1Var;
        this.f165637b = qi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi1)) {
            return false;
        }
        oi1 oi1Var = (oi1) obj;
        return wj50.m88271j(this.f165636a, oi1Var.f165636a) && this.f165637b == oi1Var.f165637b;
    }

    public final int hashCode() {
        return this.f165637b.hashCode() + (this.f165636a.hashCode() * 31);
    }
}
