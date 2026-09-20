package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class im2 {

    /* JADX INFO: renamed from: a */
    public final bn2 f103576a;

    /* JADX INFO: renamed from: b */
    public final dl2 f103577b;

    /* JADX INFO: renamed from: c */
    public final Long f103578c;

    public im2(bn2 bn2Var, dl2 dl2Var, Long l) {
        this.f103576a = bn2Var;
        this.f103577b = dl2Var;
        this.f103578c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return wj50.m88271j(this.f103576a, im2Var.f103576a) && wj50.m88271j(this.f103577b, im2Var.f103577b) && wj50.m88271j(this.f103578c, im2Var.f103578c);
    }

    public final int hashCode() {
        bn2 bn2Var = this.f103576a;
        int iHashCode = (bn2Var == null ? 0 : bn2Var.hashCode()) * 31;
        dl2 dl2Var = this.f103577b;
        int iHashCode2 = (iHashCode + (dl2Var == null ? 0 : dl2Var.hashCode())) * 31;
        Long l = this.f103578c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
