package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tn21 {

    /* JADX INFO: renamed from: a */
    public final d850 f221866a;

    /* JADX INFO: renamed from: b */
    public final long f221867b;

    public tn21(long j, d850 d850Var) {
        this.f221866a = d850Var;
        this.f221867b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn21)) {
            return false;
        }
        tn21 tn21Var = (tn21) obj;
        return wj50.m88271j(this.f221866a, tn21Var.f221866a) && this.f221867b == tn21Var.f221867b;
    }

    public final int hashCode() {
        d850 d850Var = this.f221866a;
        return Long.hashCode(this.f221867b) + ((d850Var == null ? 0 : d850Var.hashCode()) * 31);
    }
}
