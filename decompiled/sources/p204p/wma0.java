package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wma0 {

    /* JADX INFO: renamed from: a */
    public final Object f252763a;

    /* JADX INFO: renamed from: b */
    public final eh00 f252764b;

    public wma0(Object obj, eh00 eh00Var) {
        this.f252763a = obj;
        this.f252764b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wma0.class == obj.getClass() && this.f252763a.equals(((wma0) obj).f252763a);
    }

    public final int hashCode() {
        return this.f252763a.hashCode();
    }
}
