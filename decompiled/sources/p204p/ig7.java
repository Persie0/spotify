package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class ig7 extends geg1 {

    /* JADX INFO: renamed from: l */
    public final String f101903l;

    /* JADX INFO: renamed from: m */
    public final int f101904m;

    /* JADX INFO: renamed from: n */
    public final int f101905n;

    /* JADX INFO: renamed from: o */
    public final Date f101906o;

    /* JADX INFO: renamed from: p */
    public final long f101907p;

    /* JADX INFO: renamed from: q */
    public final ug7 f101908q;

    /* JADX INFO: renamed from: r */
    public final qg7 f101909r;

    /* JADX INFO: renamed from: s */
    public final og7 f101910s;

    public ig7(String str, int i, int i2, Date date, long j, ug7 ug7Var, qg7 qg7Var, og7 og7Var) {
        this.f101903l = str;
        this.f101904m = i;
        this.f101905n = i2;
        this.f101906o = date;
        this.f101907p = j;
        this.f101908q = ug7Var;
        this.f101909r = qg7Var;
        this.f101910s = og7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig7)) {
            return false;
        }
        ig7 ig7Var = (ig7) obj;
        return wj50.m88271j(this.f101903l, ig7Var.f101903l) && this.f101904m == ig7Var.f101904m && this.f101905n == ig7Var.f101905n && this.f101906o.equals(ig7Var.f101906o) && this.f101907p == ig7Var.f101907p && this.f101908q.equals(ig7Var.f101908q) && this.f101909r.equals(ig7Var.f101909r) && this.f101910s.equals(ig7Var.f101910s);
    }

    public final int hashCode() {
        return this.f101910s.hashCode() + ((this.f101909r.hashCode() + ((this.f101908q.hashCode() + dq60.m36605e((this.f101906o.hashCode() + mt60.m62800g(this.f101905n, mt60.m62800g(this.f101904m, this.f101903l.hashCode() * 31, 31), 31)) * 31, this.f101907p, 31)) * 31)) * 31);
    }
}
