package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class spp0 {

    /* JADX INFO: renamed from: a */
    public final opp0 f212909a;

    /* JADX INFO: renamed from: b */
    public final boolean f212910b;

    /* JADX INFO: renamed from: c */
    public final boolean f212911c;

    /* JADX INFO: renamed from: d */
    public final boolean f212912d;

    public spp0(opp0 opp0Var, boolean z, boolean z2, boolean z3) {
        this.f212909a = opp0Var;
        this.f212910b = z;
        this.f212911c = z2;
        this.f212912d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spp0)) {
            return false;
        }
        spp0 spp0Var = (spp0) obj;
        return wj50.m88271j(this.f212909a, spp0Var.f212909a) && this.f212910b == spp0Var.f212910b && this.f212911c == spp0Var.f212911c && this.f212912d == spp0Var.f212912d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f212912d) + s571.m77245d(s571.m77245d(this.f212909a.hashCode() * 31, 31, this.f212910b), 31, this.f212911c);
    }
}
