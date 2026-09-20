package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tb60 {

    /* JADX INFO: renamed from: a */
    public final boolean f218763a;

    /* JADX INFO: renamed from: b */
    public final boolean f218764b;

    /* JADX INFO: renamed from: c */
    public final Long f218765c;

    /* JADX INFO: renamed from: d */
    public final Long f218766d;

    public tb60(boolean z, boolean z2, Long l, Long l2) {
        this.f218763a = z;
        this.f218764b = z2;
        this.f218765c = l;
        this.f218766d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb60)) {
            return false;
        }
        tb60 tb60Var = (tb60) obj;
        return this.f218763a == tb60Var.f218763a && this.f218764b == tb60Var.f218764b && wj50.m88271j(this.f218765c, tb60Var.f218765c) && wj50.m88271j(this.f218766d, tb60Var.f218766d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f218763a) * 31, 31, this.f218764b);
        Long l = this.f218765c;
        int iHashCode = (iM77245d + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f218766d;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}
