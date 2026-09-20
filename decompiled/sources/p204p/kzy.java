package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kzy extends pzy {

    /* JADX INFO: renamed from: a */
    public final jba0 f128233a;

    /* JADX INFO: renamed from: b */
    public final jba0 f128234b;

    public kzy(jba0 jba0Var, jba0 jba0Var2) {
        this.f128233a = jba0Var;
        this.f128234b = jba0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzy)) {
            return false;
        }
        kzy kzyVar = (kzy) obj;
        return wj50.m88271j(this.f128233a, kzyVar.f128233a) && wj50.m88271j(this.f128234b, kzyVar.f128234b);
    }

    public final int hashCode() {
        jba0 jba0Var = this.f128233a;
        int iHashCode = (jba0Var == null ? 0 : jba0Var.hashCode()) * 31;
        jba0 jba0Var2 = this.f128234b;
        return iHashCode + (jba0Var2 != null ? jba0Var2.hashCode() : 0);
    }
}
