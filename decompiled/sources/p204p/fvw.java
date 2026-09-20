package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fvw implements c3x {

    /* JADX INFO: renamed from: a */
    public final Long f73888a;

    public fvw(Long l) {
        this.f73888a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvw) && wj50.m88271j(this.f73888a, ((fvw) obj).f73888a);
    }

    public final int hashCode() {
        Long l = this.f73888a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }
}
