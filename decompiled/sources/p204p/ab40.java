package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ab40 {

    /* JADX INFO: renamed from: a */
    public final eb40 f13995a;

    /* JADX INFO: renamed from: b */
    public final long f13996b;

    public ab40(eb40 eb40Var, long j) {
        this.f13995a = eb40Var;
        this.f13996b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab40)) {
            return false;
        }
        ab40 ab40Var = (ab40) obj;
        return wj50.m88271j(this.f13995a, ab40Var.f13995a) && this.f13996b == ab40Var.f13996b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13996b) + (this.f13995a.hashCode() * 31);
    }
}
