package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vam implements wam {

    /* JADX INFO: renamed from: b */
    public final qe70 f239299b;

    /* JADX WARN: Multi-variable type inference failed */
    public vam(gh00 gh00Var) {
        this.f239299b = (qe70) gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vam) && this.f239299b.equals(((vam) obj).f239299b);
    }

    public final int hashCode() {
        return this.f239299b.hashCode();
    }
}
