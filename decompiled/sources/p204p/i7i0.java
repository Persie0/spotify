package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i7i0 {

    /* JADX INFO: renamed from: a */
    public final Long f99567a;

    /* JADX INFO: renamed from: b */
    public final Long f99568b;

    public i7i0(Long l, Long l2) {
        this.f99567a = l;
        this.f99568b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7i0)) {
            return false;
        }
        i7i0 i7i0Var = (i7i0) obj;
        return wj50.m88271j(this.f99567a, i7i0Var.f99567a) && wj50.m88271j(this.f99568b, i7i0Var.f99568b);
    }

    public final int hashCode() {
        Long l = this.f99567a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f99568b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
