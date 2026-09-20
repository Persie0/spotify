package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class kg7 extends geg1 {

    /* JADX INFO: renamed from: l */
    public final String f122309l;

    /* JADX INFO: renamed from: m */
    public final int f122310m;

    /* JADX INFO: renamed from: n */
    public final int f122311n;

    /* JADX INFO: renamed from: o */
    public final Date f122312o;

    /* JADX INFO: renamed from: p */
    public final long f122313p;

    /* JADX INFO: renamed from: q */
    public final ug7 f122314q;

    /* JADX INFO: renamed from: r */
    public final sr5 f122315r;

    /* JADX INFO: renamed from: s */
    public final og7 f122316s;

    /* JADX INFO: renamed from: t */
    public final sg7 f122317t;

    public kg7(String str, int i, int i2, Date date, long j, ug7 ug7Var, sr5 sr5Var, og7 og7Var, sg7 sg7Var) {
        this.f122309l = str;
        this.f122310m = i;
        this.f122311n = i2;
        this.f122312o = date;
        this.f122313p = j;
        this.f122314q = ug7Var;
        this.f122315r = sr5Var;
        this.f122316s = og7Var;
        this.f122317t = sg7Var;
    }

    /* JADX INFO: renamed from: G */
    public final eh00 m56308G() {
        return this.f122316s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg7)) {
            return false;
        }
        kg7 kg7Var = (kg7) obj;
        return wj50.m88271j(this.f122309l, kg7Var.f122309l) && this.f122310m == kg7Var.f122310m && this.f122311n == kg7Var.f122311n && this.f122312o.equals(kg7Var.f122312o) && this.f122313p == kg7Var.f122313p && this.f122314q.equals(kg7Var.f122314q) && this.f122315r.equals(kg7Var.f122315r) && this.f122316s.equals(kg7Var.f122316s) && this.f122317t.equals(kg7Var.f122317t);
    }

    public final int hashCode() {
        return this.f122317t.hashCode() + ((this.f122316s.hashCode() + ((this.f122315r.hashCode() + ((this.f122314q.hashCode() + dq60.m36605e((this.f122312o.hashCode() + mt60.m62800g(this.f122311n, mt60.m62800g(this.f122310m, this.f122309l.hashCode() * 31, 31), 31)) * 31, this.f122313p, 31)) * 31)) * 31)) * 31);
    }
}
