package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final String f195596d;

    /* JADX INFO: renamed from: e */
    public final d850 f195597e;

    /* JADX INFO: renamed from: f */
    public final boolean f195598f;

    /* JADX INFO: renamed from: g */
    public final boolean f195599g;

    public r3z0(String str, d850 d850Var, boolean z, boolean z2) {
        this.f195596d = str;
        this.f195597e = d850Var;
        this.f195598f = z;
        this.f195599g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3z0)) {
            return false;
        }
        r3z0 r3z0Var = (r3z0) obj;
        return wj50.m88271j(this.f195596d, r3z0Var.f195596d) && wj50.m88271j(this.f195597e, r3z0Var.f195597e) && this.f195598f == r3z0Var.f195598f && this.f195599g == r3z0Var.f195599g;
    }

    public final int hashCode() {
        int iHashCode = this.f195596d.hashCode() * 31;
        d850 d850Var = this.f195597e;
        return Boolean.hashCode(this.f195599g) + s571.m77245d((iHashCode + (d850Var == null ? 0 : d850Var.hashCode())) * 31, 31, this.f195598f);
    }
}
