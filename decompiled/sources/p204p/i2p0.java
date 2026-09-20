package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i2p0 {

    /* JADX INFO: renamed from: a */
    public final Boolean f97908a;

    /* JADX INFO: renamed from: b */
    public final Boolean f97909b;

    public i2p0(Boolean bool, Boolean bool2) {
        this.f97908a = bool;
        this.f97909b = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2p0)) {
            return false;
        }
        i2p0 i2p0Var = (i2p0) obj;
        return wj50.m88271j(this.f97908a, i2p0Var.f97908a) && wj50.m88271j(this.f97909b, i2p0Var.f97909b);
    }

    public final int hashCode() {
        Boolean bool = this.f97908a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f97909b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
