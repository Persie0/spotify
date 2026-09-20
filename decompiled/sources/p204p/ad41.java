package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ad41 {

    /* JADX INFO: renamed from: a */
    public final String f14518a;

    /* JADX INFO: renamed from: b */
    public final String f14519b;

    /* JADX INFO: renamed from: c */
    public final String f14520c;

    /* JADX INFO: renamed from: d */
    public final String f14521d;

    public ad41(int i, String str, String str2, String str3, String str4) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        this.f14518a = str;
        this.f14519b = str2;
        this.f14520c = str3;
        this.f14521d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m25517a() {
        return this.f14521d;
    }

    /* JADX INFO: renamed from: b */
    public final String m25518b() {
        return this.f14518a;
    }

    /* JADX INFO: renamed from: c */
    public final String m25519c() {
        return this.f14520c;
    }

    /* JADX INFO: renamed from: d */
    public final String m25520d() {
        return this.f14519b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad41)) {
            return false;
        }
        ad41 ad41Var = (ad41) obj;
        return wj50.m88271j(this.f14518a, ad41Var.f14518a) && wj50.m88271j(this.f14519b, ad41Var.f14519b) && wj50.m88271j(this.f14520c, ad41Var.f14520c) && wj50.m88271j(this.f14521d, ad41Var.f14521d);
    }

    public final int hashCode() {
        int iHashCode = this.f14518a.hashCode() * 31;
        String str = this.f14519b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14520c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14521d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
