package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kw90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f127032a;

    /* JADX INFO: renamed from: b */
    public final d850 f127033b;

    public kw90(String str, d850 d850Var) {
        this.f127032a = str;
        this.f127033b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw90)) {
            return false;
        }
        kw90 kw90Var = (kw90) obj;
        return wj50.m88271j(this.f127032a, kw90Var.f127032a) && wj50.m88271j(this.f127033b, kw90Var.f127033b);
    }

    public final int hashCode() {
        int iHashCode = this.f127032a.hashCode() * 31;
        d850 d850Var = this.f127033b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
