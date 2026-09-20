package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rfc1 implements dgc1 {

    /* JADX INFO: renamed from: a */
    public final boolean f198577a;

    /* JADX INFO: renamed from: b */
    public final d850 f198578b;

    public rfc1(d850 d850Var, boolean z) {
        this.f198577a = z;
        this.f198578b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfc1)) {
            return false;
        }
        rfc1 rfc1Var = (rfc1) obj;
        return this.f198577a == rfc1Var.f198577a && wj50.m88271j(this.f198578b, rfc1Var.f198578b);
    }

    public final int hashCode() {
        return this.f198578b.hashCode() + (Boolean.hashCode(this.f198577a) * 31);
    }
}
