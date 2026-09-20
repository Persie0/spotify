package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lfc1 implements dgc1 {

    /* JADX INFO: renamed from: a */
    public final String f132901a;

    /* JADX INFO: renamed from: b */
    public final d850 f132902b;

    public lfc1(String str, d850 d850Var) {
        this.f132901a = str;
        this.f132902b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfc1)) {
            return false;
        }
        lfc1 lfc1Var = (lfc1) obj;
        return wj50.m88271j(this.f132901a, lfc1Var.f132901a) && wj50.m88271j(this.f132902b, lfc1Var.f132902b);
    }

    public final int hashCode() {
        return this.f132902b.hashCode() + (this.f132901a.hashCode() * 31);
    }
}
