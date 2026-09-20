package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class px40 implements nx40 {

    /* JADX INFO: renamed from: a */
    public final String f182198a;

    /* JADX INFO: renamed from: b */
    public final sed f182199b;

    /* JADX INFO: renamed from: c */
    public final rx40 f182200c;

    /* JADX INFO: renamed from: d */
    public final String f182201d;

    /* JADX INFO: renamed from: e */
    public final int f182202e;

    /* JADX INFO: renamed from: f */
    public final long f182203f;

    public px40(String str, sed sedVar, rx40 rx40Var, String str2, int i, long j) {
        this.f182198a = str;
        this.f182199b = sedVar;
        this.f182200c = rx40Var;
        this.f182201d = str2;
        this.f182202e = i;
        this.f182203f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px40)) {
            return false;
        }
        px40 px40Var = (px40) obj;
        return wj50.m88271j(this.f182198a, px40Var.f182198a) && wj50.m88271j(this.f182199b, px40Var.f182199b) && this.f182200c.equals(px40Var.f182200c) && wj50.m88271j(this.f182201d, px40Var.f182201d) && this.f182202e == px40Var.f182202e && this.f182203f == px40Var.f182203f;
    }

    @Override // p204p.nx40
    public final String getEntityUri() {
        return this.f182201d;
    }

    @Override // p204p.sx40
    public final String getId() {
        return this.f182198a;
    }

    public final int hashCode() {
        int iHashCode = this.f182198a.hashCode() * 31;
        sed sedVar = this.f182199b;
        return Long.hashCode(this.f182203f) + f710.m40938f(this.f182202e, s571.m77243b((this.f182200c.hashCode() + ((iHashCode + (sedVar == null ? 0 : sedVar.hashCode())) * 31)) * 31, 31, this.f182201d), 31);
    }
}
