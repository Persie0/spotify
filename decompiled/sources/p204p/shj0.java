package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class shj0 {

    /* JADX INFO: renamed from: a */
    public final String f209228a;

    /* JADX INFO: renamed from: b */
    public final String f209229b;

    /* JADX INFO: renamed from: c */
    public final lhj0 f209230c;

    /* JADX INFO: renamed from: d */
    public final h5y f209231d;

    public shj0(String str, String str2, lhj0 lhj0Var, h5y h5yVar) {
        this.f209228a = str;
        this.f209229b = str2;
        this.f209230c = lhj0Var;
        this.f209231d = h5yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shj0)) {
            return false;
        }
        shj0 shj0Var = (shj0) obj;
        return wj50.m88271j(this.f209228a, shj0Var.f209228a) && wj50.m88271j(this.f209229b, shj0Var.f209229b) && wj50.m88271j(this.f209230c, shj0Var.f209230c) && wj50.m88271j(this.f209231d, shj0Var.f209231d);
    }

    public final int hashCode() {
        return this.f209231d.f87925a.hashCode() + edb.m38557f(s571.m77243b(this.f209228a.hashCode() * 31, 31, this.f209229b), 961, this.f209230c.f133583a);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.f209228a + ", method=" + this.f209229b + ", headers=" + this.f209230c + ", body=null, extras=" + this.f209231d + ')';
    }
}
