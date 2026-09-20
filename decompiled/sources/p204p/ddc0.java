package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ddc0 extends mdc0 {

    /* JADX INFO: renamed from: a */
    public final z5z f47779a;

    /* JADX INFO: renamed from: b */
    public final String f47780b;

    public ddc0(z5z z5zVar, String str) {
        this.f47779a = z5zVar;
        this.f47780b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddc0)) {
            return false;
        }
        ddc0 ddc0Var = (ddc0) obj;
        return wj50.m88271j(this.f47779a, ddc0Var.f47779a) && wj50.m88271j(this.f47780b, ddc0Var.f47780b);
    }

    public final int hashCode() {
        int iHashCode = this.f47779a.hashCode() * 31;
        String str = this.f47780b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
