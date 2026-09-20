package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b7u0 {

    /* JADX INFO: renamed from: a */
    public final Double f24391a;

    /* JADX INFO: renamed from: b */
    public final Long f24392b;

    /* JADX INFO: renamed from: c */
    public final Boolean f24393c;

    public b7u0(Double d, Long l, Boolean bool) {
        this.f24391a = d;
        this.f24392b = l;
        this.f24393c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7u0)) {
            return false;
        }
        b7u0 b7u0Var = (b7u0) obj;
        return wj50.m88271j(this.f24391a, b7u0Var.f24391a) && wj50.m88271j(this.f24392b, b7u0Var.f24392b) && wj50.m88271j(this.f24393c, b7u0Var.f24393c);
    }

    public final int hashCode() {
        Double d = this.f24391a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Long l = this.f24392b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.f24393c;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
