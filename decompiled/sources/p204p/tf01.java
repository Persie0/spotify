package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tf01 {

    /* JADX INFO: renamed from: a */
    public final String f219822a;

    /* JADX INFO: renamed from: b */
    public final String f219823b;

    /* JADX INFO: renamed from: c */
    public final dut f219824c;

    /* JADX INFO: renamed from: d */
    public final Object f219825d;

    public tf01(String str, String str2, dut dutVar, Object obj) {
        this.f219822a = str;
        this.f219823b = str2;
        this.f219824c = dutVar;
        this.f219825d = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m80598a(int i, xq00 xq00Var) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-487153897);
        int i2 = (xq00Var.m91766g(this) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            dut dutVar = this.f219824c;
            xq00Var2 = xq00Var;
            mif1.m61869b(dutVar, this.f219825d, null, ftf1.m42620u(rbz.m75190h(qpv0.f191387a.mo54112b(dutVar.getClass()).mo29110D(), ".", this.f219822a, ".", this.f219823b), dutVar, this.f219825d, xq00Var, 0), xq00Var2, 0, 4);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iox0(this, i, 22);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m80599b() {
        return this.f219822a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m80600c() {
        return this.f219825d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf01)) {
            return false;
        }
        tf01 tf01Var = (tf01) obj;
        return wj50.m88271j(this.f219822a, tf01Var.f219822a) && wj50.m88271j(this.f219823b, tf01Var.f219823b) && wj50.m88271j(this.f219824c, tf01Var.f219824c) && wj50.m88271j(this.f219825d, tf01Var.f219825d);
    }

    public final int hashCode() {
        int iHashCode = this.f219822a.hashCode() * 31;
        String str = this.f219823b;
        int iHashCode2 = (this.f219824c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Object obj = this.f219825d;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }
}
