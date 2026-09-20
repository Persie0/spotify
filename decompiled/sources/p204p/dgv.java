package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class dgv {

    /* JADX INFO: renamed from: a */
    public final Integer f48899a;

    /* JADX INFO: renamed from: b */
    public final Integer f48900b;

    /* JADX INFO: renamed from: c */
    public final Integer f48901c;

    public dgv(int i, Integer num, Integer num2) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        Integer num3 = (i & 4) != 0 ? null : 16;
        this.f48899a = num;
        this.f48900b = num2;
        this.f48901c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgv)) {
            return false;
        }
        dgv dgvVar = (dgv) obj;
        return wj50.m88271j(this.f48899a, dgvVar.f48899a) && wj50.m88271j(this.f48900b, dgvVar.f48900b) && wj50.m88271j(this.f48901c, dgvVar.f48901c);
    }

    public final int hashCode() {
        Integer num = this.f48899a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f48900b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f48901c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }
}
