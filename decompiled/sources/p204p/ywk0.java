package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ywk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f276979a;

    /* JADX INFO: renamed from: b */
    public final Object f276980b;

    public ywk0(Object obj, boolean z) {
        this.f276979a = z;
        this.f276980b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywk0)) {
            return false;
        }
        ywk0 ywk0Var = (ywk0) obj;
        return this.f276979a == ywk0Var.f276979a && wj50.m88271j(this.f276980b, ywk0Var.f276980b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f276979a) * 31;
        Object obj = this.f276980b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
