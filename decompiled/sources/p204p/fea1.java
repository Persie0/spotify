package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fea1 {

    /* JADX INFO: renamed from: a */
    public final String f68728a;

    /* JADX INFO: renamed from: b */
    public final long f68729b;

    /* JADX INFO: renamed from: c */
    public final cuw0 f68730c;

    /* JADX INFO: renamed from: d */
    public final dp6 f68731d;

    public fea1(String str, long j, cuw0 cuw0Var, dp6 dp6Var) {
        this.f68728a = str;
        this.f68729b = j;
        this.f68730c = cuw0Var;
        this.f68731d = dp6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea1)) {
            return false;
        }
        fea1 fea1Var = (fea1) obj;
        return this.f68728a.equals(fea1Var.f68728a) && this.f68729b == fea1Var.f68729b && this.f68730c.equals(fea1Var.f68730c) && this.f68731d.equals(fea1Var.f68731d);
    }

    public final int hashCode() {
        return this.f68731d.hashCode() + ((this.f68730c.hashCode() + dq60.m36605e(this.f68728a.hashCode() * 31, this.f68729b, 31)) * 31);
    }
}
