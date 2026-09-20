package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qqm0 {

    /* JADX INFO: renamed from: a */
    public final Object f191620a;

    /* JADX INFO: renamed from: b */
    public final Object f191621b;

    public qqm0(Object obj, Object obj2) {
        this.f191620a = obj;
        this.f191621b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qqm0)) {
            return false;
        }
        qqm0 qqm0Var = (qqm0) obj;
        return p1m0.m68831l(qqm0Var.f191620a, this.f191620a) && p1m0.m68831l(qqm0Var.f191621b, this.f191621b);
    }

    public final int hashCode() {
        Object obj = this.f191620a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f191621b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.f191620a);
        sb.append(" ");
        return edb.m38568q(sb, this.f191621b, "}");
    }
}
