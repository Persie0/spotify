package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cq3 implements dq3 {

    /* JADX INFO: renamed from: a */
    public final String f40715a;

    /* JADX INFO: renamed from: b */
    public final String f40716b;

    /* JADX INFO: renamed from: c */
    public final boolean f40717c;

    /* JADX INFO: renamed from: d */
    public final String f40718d;

    /* JADX INFO: renamed from: e */
    public final String f40719e;

    public cq3(String str, String str2, String str3, String str4, boolean z) {
        this.f40715a = str;
        this.f40716b = str2;
        this.f40717c = z;
        this.f40718d = str3;
        this.f40719e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq3)) {
            return false;
        }
        cq3 cq3Var = (cq3) obj;
        return wj50.m88271j(this.f40715a, cq3Var.f40715a) && wj50.m88271j(this.f40716b, cq3Var.f40716b) && this.f40717c == cq3Var.f40717c && wj50.m88271j(this.f40718d, cq3Var.f40718d) && wj50.m88271j(this.f40719e, cq3Var.f40719e);
    }

    @Override // p204p.dq3
    public final String getUri() {
        return this.f40715a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f40715a.hashCode() * 31, 31, this.f40716b), 31, this.f40717c);
        String str = this.f40718d;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40719e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
