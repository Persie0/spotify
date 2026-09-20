package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qcu0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f187407a;

    /* JADX INFO: renamed from: b */
    public final int f187408b;

    public qcu0(int i, qf40 qf40Var) {
        this.f187407a = qf40Var;
        this.f187408b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcu0)) {
            return false;
        }
        qcu0 qcu0Var = (qcu0) obj;
        return wj50.m88271j(this.f187407a, qcu0Var.f187407a) && this.f187408b == qcu0Var.f187408b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187408b) + (this.f187407a.hashCode() * 31);
    }
}
