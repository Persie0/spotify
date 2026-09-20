package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class twc1 implements bxc1 {

    /* JADX INFO: renamed from: a */
    public final String f224412a;

    /* JADX INFO: renamed from: b */
    public final double f224413b;

    /* JADX INFO: renamed from: c */
    public final Double f224414c;

    /* JADX INFO: renamed from: d */
    public final int f224415d;

    public twc1(String str, double d, Double d2, int i) {
        this.f224412a = str;
        this.f224413b = d;
        this.f224414c = d2;
        this.f224415d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twc1)) {
            return false;
        }
        twc1 twc1Var = (twc1) obj;
        return wj50.m88271j(this.f224412a, twc1Var.f224412a) && Double.compare(this.f224413b, twc1Var.f224413b) == 0 && wj50.m88271j(this.f224414c, twc1Var.f224414c) && this.f224415d == twc1Var.f224415d;
    }

    public final int hashCode() {
        int iM91399h = xl81.m91399h(this.f224413b, this.f224412a.hashCode() * 31, 31);
        Double d = this.f224414c;
        int iHashCode = (iM91399h + (d == null ? 0 : d.hashCode())) * 31;
        int i = this.f224415d;
        return iHashCode + (i != 0 ? edb.m38547C(i) : 0);
    }
}
