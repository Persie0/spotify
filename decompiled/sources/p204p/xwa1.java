package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xwa1 {

    /* JADX INFO: renamed from: a */
    public final dut f266625a;

    /* JADX INFO: renamed from: b */
    public final zz41 f266626b;

    /* JADX INFO: renamed from: c */
    public final String f266627c;

    public xwa1(dut dutVar, zz41 zz41Var, String str) {
        this.f266625a = dutVar;
        this.f266626b = zz41Var;
        this.f266627c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwa1)) {
            return false;
        }
        xwa1 xwa1Var = (xwa1) obj;
        return this.f266625a.equals(xwa1Var.f266625a) && this.f266626b.equals(xwa1Var.f266626b) && wj50.m88271j(this.f266627c, xwa1Var.f266627c);
    }

    public final int hashCode() {
        return this.f266627c.hashCode() + ((this.f266626b.hashCode() + (this.f266625a.hashCode() * 31)) * 31);
    }
}
