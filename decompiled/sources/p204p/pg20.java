package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pg20 {

    /* JADX INFO: renamed from: a */
    public final a7f0 f177204a;

    /* JADX INFO: renamed from: b */
    public final a7f0 f177205b;

    /* JADX INFO: renamed from: c */
    public final a7f0 f177206c;

    /* JADX INFO: renamed from: d */
    public final a7f0 f177207d;

    public pg20(a7f0 a7f0Var, a7f0 a7f0Var2, a7f0 a7f0Var3, a7f0 a7f0Var4, int i) {
        a7f0Var4 = (i & 8) != 0 ? null : a7f0Var4;
        this.f177204a = a7f0Var;
        this.f177205b = a7f0Var2;
        this.f177206c = a7f0Var3;
        this.f177207d = a7f0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg20)) {
            return false;
        }
        pg20 pg20Var = (pg20) obj;
        return this.f177204a.equals(pg20Var.f177204a) && this.f177205b.equals(pg20Var.f177205b) && wj50.m88271j(this.f177206c, pg20Var.f177206c) && wj50.m88271j(this.f177207d, pg20Var.f177207d);
    }

    public final int hashCode() {
        int iHashCode = (this.f177205b.hashCode() + (this.f177204a.hashCode() * 31)) * 31;
        a7f0 a7f0Var = this.f177206c;
        int iHashCode2 = (iHashCode + (a7f0Var == null ? 0 : a7f0Var.hashCode())) * 31;
        a7f0 a7f0Var2 = this.f177207d;
        return (iHashCode2 + (a7f0Var2 != null ? a7f0Var2.hashCode() : 0)) * 31;
    }
}
