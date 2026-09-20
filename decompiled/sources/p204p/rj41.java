package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rj41 {

    /* JADX INFO: renamed from: a */
    public final ty80 f199720a;

    /* JADX INFO: renamed from: b */
    public final gi20 f199721b;

    /* JADX INFO: renamed from: c */
    public final boolean f199722c;

    public rj41(ty80 ty80Var, gi20 gi20Var, boolean z) {
        this.f199720a = ty80Var;
        this.f199721b = gi20Var;
        this.f199722c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj41)) {
            return false;
        }
        rj41 rj41Var = (rj41) obj;
        return wj50.m88271j(this.f199720a, rj41Var.f199720a) && wj50.m88271j(this.f199721b, rj41Var.f199721b) && this.f199722c == rj41Var.f199722c;
    }

    public final int hashCode() {
        ty80 ty80Var = this.f199720a;
        return Boolean.hashCode(this.f199722c) + ((this.f199721b.hashCode() + ((ty80Var == null ? 0 : ty80Var.hashCode()) * 31)) * 31);
    }
}
