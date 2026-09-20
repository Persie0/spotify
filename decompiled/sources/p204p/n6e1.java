package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n6e1 {

    /* JADX INFO: renamed from: a */
    public final Integer f150856a;

    /* JADX INFO: renamed from: b */
    public final y3e1 f150857b;

    /* JADX INFO: renamed from: c */
    public final Boolean f150858c;

    /* JADX INFO: renamed from: d */
    public final Boolean f150859d;

    /* JADX INFO: renamed from: e */
    public final Integer f150860e;

    /* JADX INFO: renamed from: f */
    public final Boolean f150861f;

    public /* synthetic */ n6e1(Integer num, y3e1 y3e1Var, Boolean bool, Boolean bool2, Integer num2, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : y3e1Var, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : num2, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6e1)) {
            return false;
        }
        n6e1 n6e1Var = (n6e1) obj;
        return wj50.m88271j(this.f150856a, n6e1Var.f150856a) && this.f150857b == n6e1Var.f150857b && wj50.m88271j(this.f150858c, n6e1Var.f150858c) && wj50.m88271j(this.f150859d, n6e1Var.f150859d) && wj50.m88271j(this.f150860e, n6e1Var.f150860e) && wj50.m88271j(this.f150861f, n6e1Var.f150861f);
    }

    public final int hashCode() {
        Integer num = this.f150856a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        y3e1 y3e1Var = this.f150857b;
        int iHashCode2 = (iHashCode + (y3e1Var == null ? 0 : y3e1Var.hashCode())) * 31;
        Boolean bool = this.f150858c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f150859d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.f150860e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.f150861f;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public n6e1(Integer num, y3e1 y3e1Var, Boolean bool, Boolean bool2, Integer num2, Boolean bool3) {
        this.f150856a = num;
        this.f150857b = y3e1Var;
        this.f150858c = bool;
        this.f150859d = bool2;
        this.f150860e = num2;
        this.f150861f = bool3;
    }
}
