package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fva0 {

    /* JADX INFO: renamed from: a */
    public final String f73742a;

    /* JADX INFO: renamed from: b */
    public final voc1 f73743b;

    /* JADX INFO: renamed from: c */
    public final int f73744c;

    /* JADX INFO: renamed from: d */
    public final tyv f73745d;

    /* JADX INFO: renamed from: e */
    public final Boolean f73746e;

    public fva0(String str, voc1 voc1Var, int i, tyv tyvVar, Boolean bool) {
        this.f73742a = str;
        this.f73743b = voc1Var;
        this.f73744c = i;
        this.f73745d = tyvVar;
        this.f73746e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fva0)) {
            return false;
        }
        fva0 fva0Var = (fva0) obj;
        return wj50.m88271j(this.f73742a, fva0Var.f73742a) && wj50.m88271j(this.f73743b, fva0Var.f73743b) && this.f73744c == fva0Var.f73744c && wj50.m88271j(this.f73745d, fva0Var.f73745d) && wj50.m88271j(this.f73746e, fva0Var.f73746e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f73744c, s571.m77243b(this.f73742a.hashCode() * 31, 31, this.f73743b.f243453a), 31);
        tyv tyvVar = this.f73745d;
        int iHashCode = (iM40938f + (tyvVar == null ? 0 : tyvVar.hashCode())) * 31;
        Boolean bool = this.f73746e;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
