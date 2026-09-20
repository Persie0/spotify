package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xsc0 {

    /* JADX INFO: renamed from: a */
    public final String f265559a;

    /* JADX INFO: renamed from: b */
    public final boolean f265560b;

    /* JADX INFO: renamed from: c */
    public final qho f265561c;

    /* JADX INFO: renamed from: d */
    public final gtc0 f265562d;

    public xsc0(String str, boolean z, qho qhoVar, gtc0 gtc0Var) {
        this.f265559a = str;
        this.f265560b = z;
        this.f265561c = qhoVar;
        this.f265562d = gtc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsc0)) {
            return false;
        }
        xsc0 xsc0Var = (xsc0) obj;
        return wj50.m88271j(this.f265559a, xsc0Var.f265559a) && this.f265560b == xsc0Var.f265560b && wj50.m88271j(this.f265561c, xsc0Var.f265561c) && wj50.m88271j(this.f265562d, xsc0Var.f265562d);
    }

    public final int hashCode() {
        int iHashCode = (this.f265561c.hashCode() + s571.m77245d(this.f265559a.hashCode() * 31, 31, this.f265560b)) * 31;
        gtc0 gtc0Var = this.f265562d;
        return iHashCode + (gtc0Var == null ? 0 : gtc0Var.hashCode());
    }
}
