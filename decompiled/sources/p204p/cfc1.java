package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cfc1 implements dgc1 {

    /* JADX INFO: renamed from: a */
    public final int f37322a;

    /* JADX INFO: renamed from: b */
    public final d850 f37323b;

    public cfc1(int i, d850 d850Var) {
        this.f37322a = i;
        this.f37323b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc1)) {
            return false;
        }
        cfc1 cfc1Var = (cfc1) obj;
        return this.f37322a == cfc1Var.f37322a && wj50.m88271j(this.f37323b, cfc1Var.f37323b);
    }

    public final int hashCode() {
        return this.f37323b.hashCode() + (Integer.hashCode(this.f37322a) * 31);
    }
}
