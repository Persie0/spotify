package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class erc1 implements ktx {

    /* JADX INFO: renamed from: a */
    public final m340 f62079a;

    /* JADX INFO: renamed from: b */
    public final m340 f62080b;

    /* JADX INFO: renamed from: c */
    public final ihb1 f62081c;

    /* JADX INFO: renamed from: d */
    public final w240 f62082d;

    /* JADX INFO: renamed from: e */
    public final m340 f62083e;

    /* JADX INFO: renamed from: f */
    public final m340 f62084f;

    public erc1(m340 m340Var, m340 m340Var2, ihb1 ihb1Var, w240 w240Var, m340 m340Var3, m340 m340Var4) {
        this.f62079a = m340Var;
        this.f62080b = m340Var2;
        this.f62081c = ihb1Var;
        this.f62082d = w240Var;
        this.f62083e = m340Var3;
        this.f62084f = m340Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erc1)) {
            return false;
        }
        erc1 erc1Var = (erc1) obj;
        return wj50.m88271j(this.f62079a, erc1Var.f62079a) && wj50.m88271j(this.f62080b, erc1Var.f62080b) && wj50.m88271j(this.f62081c, erc1Var.f62081c) && wj50.m88271j(this.f62082d, erc1Var.f62082d) && wj50.m88271j(this.f62083e, erc1Var.f62083e) && wj50.m88271j(this.f62084f, erc1Var.f62084f);
    }

    public final int hashCode() {
        int iHashCode = this.f62079a.hashCode() * 31;
        m340 m340Var = this.f62080b;
        int iHashCode2 = (iHashCode + (m340Var == null ? 0 : m340Var.hashCode())) * 31;
        ihb1 ihb1Var = this.f62081c;
        int iHashCode3 = (iHashCode2 + (ihb1Var == null ? 0 : ihb1Var.hashCode())) * 31;
        w240 w240Var = this.f62082d;
        int iHashCode4 = (iHashCode3 + (w240Var == null ? 0 : w240Var.hashCode())) * 31;
        m340 m340Var2 = this.f62083e;
        int iHashCode5 = (iHashCode4 + (m340Var2 == null ? 0 : m340Var2.hashCode())) * 31;
        m340 m340Var3 = this.f62084f;
        return iHashCode5 + (m340Var3 != null ? m340Var3.hashCode() : 0);
    }

    public /* synthetic */ erc1(m340 m340Var, w240 w240Var, m340 m340Var2, m340 m340Var3, int i) {
        this((i & 1) != 0 ? new m340(7, null) : m340Var, null, null, (i & 8) != 0 ? null : w240Var, (i & 16) != 0 ? null : m340Var2, (i & 32) != 0 ? null : m340Var3);
    }
}
