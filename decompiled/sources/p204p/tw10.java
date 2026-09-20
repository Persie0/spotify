package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tw10 extends uw10 {

    /* JADX INFO: renamed from: a */
    public final double f224296a;

    /* JADX INFO: renamed from: b */
    public final long f224297b;

    /* JADX INFO: renamed from: c */
    public final qf40 f224298c;

    public tw10(double d, long j, qf40 qf40Var) {
        this.f224296a = d;
        this.f224297b = j;
        this.f224298c = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw10)) {
            return false;
        }
        tw10 tw10Var = (tw10) obj;
        return Double.compare(this.f224296a, tw10Var.f224296a) == 0 && this.f224297b == tw10Var.f224297b && wj50.m88271j(this.f224298c, tw10Var.f224298c);
    }

    public final int hashCode() {
        return this.f224298c.hashCode() + dq60.m36605e(Double.hashCode(this.f224296a) * 31, this.f224297b, 31);
    }
}
