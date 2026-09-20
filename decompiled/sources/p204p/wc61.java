package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wc61 {

    /* JADX INFO: renamed from: a */
    public final int f249971a;

    /* JADX INFO: renamed from: b */
    public final eh00 f249972b;

    /* JADX INFO: renamed from: c */
    public final fyf f249973c;

    public wc61(int i, eh00 eh00Var, wwu wwuVar) {
        fyf fyfVar = new fyf(new c60(wwuVar, 9), true, 1152236047);
        this.f249971a = i;
        this.f249972b = eh00Var;
        this.f249973c = fyfVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m87691a() {
        return this.f249971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc61)) {
            return false;
        }
        wc61 wc61Var = (wc61) obj;
        return this.f249971a == wc61Var.f249971a && wj50.m88271j(this.f249972b, wc61Var.f249972b) && this.f249973c.equals(wc61Var.f249973c);
    }

    public final int hashCode() {
        return this.f249973c.hashCode() + p1v.m68853j(edb.m38547C(this.f249971a) * 31, this.f249972b, 31);
    }
}
