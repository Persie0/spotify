package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class th5 {

    /* JADX INFO: renamed from: a */
    public final Object f220331a;

    /* JADX INFO: renamed from: b */
    public final Object f220332b;

    public th5(Object obj, Object obj2) {
        this.f220331a = obj;
        this.f220332b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th5)) {
            return false;
        }
        th5 th5Var = (th5) obj;
        return wj50.m88271j(this.f220331a, th5Var.f220331a) && wj50.m88271j(this.f220332b, th5Var.f220332b);
    }

    public final int hashCode() {
        Object obj = this.f220331a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f220332b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f220331a + ", upper=" + this.f220332b + ')';
    }
}
