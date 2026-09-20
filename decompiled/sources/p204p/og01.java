package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class og01 {

    /* JADX INFO: renamed from: a */
    public final fd01 f164965a;

    /* JADX INFO: renamed from: b */
    public final Object f164966b;

    public og01(fd01 fd01Var, Object obj) {
        this.f164965a = fd01Var;
        this.f164966b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og01)) {
            return false;
        }
        og01 og01Var = (og01) obj;
        return wj50.m88271j(this.f164965a, og01Var.f164965a) && wj50.m88271j(this.f164966b, og01Var.f164966b);
    }

    public final int hashCode() {
        int iHashCode = this.f164965a.hashCode() * 31;
        Object obj = this.f164966b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
