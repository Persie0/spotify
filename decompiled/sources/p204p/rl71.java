package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rl71 {

    /* JADX INFO: renamed from: a */
    public final Long f200231a;

    /* JADX INFO: renamed from: b */
    public final Long f200232b;

    public rl71(Long l, Long l2) {
        this.f200231a = l;
        this.f200232b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl71)) {
            return false;
        }
        rl71 rl71Var = (rl71) obj;
        return wj50.m88271j(this.f200231a, rl71Var.f200231a) && wj50.m88271j(this.f200232b, rl71Var.f200232b);
    }

    public final int hashCode() {
        Long l = this.f200231a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f200232b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
