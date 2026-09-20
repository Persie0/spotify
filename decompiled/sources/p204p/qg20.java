package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qg20 {

    /* JADX INFO: renamed from: a */
    public final tg20 f188345a;

    /* JADX INFO: renamed from: b */
    public final qe70 f188346b;

    /* JADX INFO: renamed from: c */
    public final th00 f188347c;

    /* JADX INFO: renamed from: d */
    public final th00 f188348d;

    /* JADX INFO: renamed from: e */
    public final th00 f188349e;

    /* JADX INFO: renamed from: f */
    public final th00 f188350f;

    /* JADX WARN: Multi-variable type inference failed */
    public qg20(tg20 tg20Var, th00 th00Var, th00 th00Var2, th00 th00Var3, th00 th00Var4, th00 th00Var5) {
        this.f188345a = tg20Var;
        this.f188346b = (qe70) th00Var;
        this.f188347c = th00Var2;
        this.f188348d = th00Var3;
        this.f188349e = th00Var4;
        this.f188350f = th00Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg20)) {
            return false;
        }
        qg20 qg20Var = (qg20) obj;
        return wj50.m88271j(this.f188345a, qg20Var.f188345a) && wj50.m88271j(this.f188346b, qg20Var.f188346b) && wj50.m88271j(this.f188347c, qg20Var.f188347c) && wj50.m88271j(this.f188348d, qg20Var.f188348d) && wj50.m88271j(this.f188349e, qg20Var.f188349e) && wj50.m88271j(this.f188350f, qg20Var.f188350f);
    }

    public final int hashCode() {
        int iHashCode = (this.f188346b.hashCode() + (this.f188345a.hashCode() * 31)) * 31;
        th00 th00Var = this.f188347c;
        int iHashCode2 = (iHashCode + (th00Var == null ? 0 : th00Var.hashCode())) * 31;
        th00 th00Var2 = this.f188348d;
        int iHashCode3 = (iHashCode2 + (th00Var2 == null ? 0 : th00Var2.hashCode())) * 31;
        th00 th00Var3 = this.f188349e;
        int iHashCode4 = (iHashCode3 + (th00Var3 == null ? 0 : th00Var3.hashCode())) * 31;
        th00 th00Var4 = this.f188350f;
        return iHashCode4 + (th00Var4 != null ? th00Var4.hashCode() : 0);
    }

    public /* synthetic */ qg20(tg20 tg20Var, th00 th00Var, th00 th00Var2, th00 th00Var3, th00 th00Var4, th00 th00Var5, int i) {
        this((i & 1) != 0 ? new rg20(false) : tg20Var, th00Var, th00Var2, (i & 8) != 0 ? null : th00Var3, (i & 16) != 0 ? null : th00Var4, (i & 32) != 0 ? null : th00Var5);
    }
}
