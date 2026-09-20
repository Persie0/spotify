package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q08 {

    /* JADX INFO: renamed from: a */
    public final o18 f183925a;

    /* JADX INFO: renamed from: b */
    public final o18 f183926b;

    public q08(o18 o18Var, o18 o18Var2) {
        this.f183925a = o18Var;
        this.f183926b = o18Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q08) {
            q08 q08Var = (q08) obj;
            if (this.f183925a.equals(q08Var.f183925a) && this.f183926b.equals(q08Var.f183926b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f183925a.hashCode() ^ 1000003) * 1000003) ^ this.f183926b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f183925a + ", secondaryOutConfig=" + this.f183926b + "}";
    }
}
