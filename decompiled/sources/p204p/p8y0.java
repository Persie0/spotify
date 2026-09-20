package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p8y0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f175101a;

    /* JADX INFO: renamed from: b */
    public final Boolean f175102b;

    public p8y0(Boolean bool, Boolean bool2) {
        this.f175101a = bool;
        this.f175102b = bool2;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m69352a() {
        return this.f175101a;
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m69353b() {
        return this.f175102b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8y0)) {
            return false;
        }
        p8y0 p8y0Var = (p8y0) obj;
        return wj50.m88271j(this.f175101a, p8y0Var.f175101a) && wj50.m88271j(this.f175102b, p8y0Var.f175102b);
    }

    public final int hashCode() {
        Boolean bool = this.f175101a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f175102b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
