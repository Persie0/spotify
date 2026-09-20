package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ray {

    /* JADX INFO: renamed from: a */
    public final String f197402a;

    /* JADX INFO: renamed from: b */
    public final String f197403b;

    /* JADX INFO: renamed from: c */
    public final String f197404c;

    /* JADX INFO: renamed from: d */
    public final cqj0 f197405d;

    /* JADX INFO: renamed from: e */
    public final boolean f197406e;

    public ray(String str, String str2, String str3, cqj0 cqj0Var, int i) {
        str3 = (i & 4) != 0 ? null : str3;
        cqj0Var = (i & 8) != 0 ? new cqj0(255, null, null, null, false, false, false) : cqj0Var;
        boolean z = (i & 16) != 0;
        this.f197402a = str;
        this.f197403b = str2;
        this.f197404c = str3;
        this.f197405d = cqj0Var;
        this.f197406e = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m75124a() {
        return this.f197403b;
    }

    /* JADX INFO: renamed from: b */
    public final cqj0 m75125b() {
        return this.f197405d;
    }

    /* JADX INFO: renamed from: c */
    public final String m75126c() {
        return this.f197404c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m75127d() {
        return this.f197406e;
    }

    /* JADX INFO: renamed from: e */
    public final String m75128e() {
        return this.f197402a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ray)) {
            return false;
        }
        ray rayVar = (ray) obj;
        return wj50.m88271j(this.f197402a, rayVar.f197402a) && wj50.m88271j(this.f197403b, rayVar.f197403b) && wj50.m88271j(this.f197404c, rayVar.f197404c) && wj50.m88271j(this.f197405d, rayVar.f197405d) && this.f197406e == rayVar.f197406e;
    }

    public final int hashCode() {
        int iHashCode = this.f197402a.hashCode() * 31;
        String str = this.f197403b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f197404c;
        return Boolean.hashCode(this.f197406e) + ((this.f197405d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
