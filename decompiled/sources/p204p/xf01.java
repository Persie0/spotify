package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xf01 {

    /* JADX INFO: renamed from: a */
    public final tf01 f260801a;

    /* JADX INFO: renamed from: b */
    public final tf01 f260802b;

    /* JADX INFO: renamed from: c */
    public final qf40 f260803c;

    public xf01(tf01 tf01Var, tf01 tf01Var2, qf40 qf40Var) {
        this.f260801a = tf01Var;
        this.f260802b = tf01Var2;
        this.f260803c = qf40Var;
    }

    /* JADX INFO: renamed from: a */
    public final tf01 m90443a() {
        return this.f260802b;
    }

    /* JADX INFO: renamed from: b */
    public final qf40 m90444b() {
        return this.f260803c;
    }

    /* JADX INFO: renamed from: c */
    public final tf01 m90445c() {
        return this.f260801a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf01)) {
            return false;
        }
        xf01 xf01Var = (xf01) obj;
        return wj50.m88271j(this.f260801a, xf01Var.f260801a) && wj50.m88271j(this.f260802b, xf01Var.f260802b) && wj50.m88271j(this.f260803c, xf01Var.f260803c);
    }

    public final int hashCode() {
        tf01 tf01Var = this.f260801a;
        return this.f260803c.hashCode() + ((this.f260802b.hashCode() + ((tf01Var == null ? 0 : tf01Var.hashCode()) * 31)) * 31);
    }
}
