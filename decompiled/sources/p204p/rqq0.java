package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rqq0 {

    /* JADX INFO: renamed from: a */
    public final noq0 f201871a;

    public rqq0(noq0 noq0Var) {
        this.f201871a = noq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rqq0) && this.f201871a.equals(((rqq0) obj).f201871a);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.f201871a.hashCode() * 31);
    }
}
