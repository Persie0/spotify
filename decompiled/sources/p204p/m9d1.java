package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class m9d1 {

    /* JADX INFO: renamed from: a */
    public final String f141279a;

    /* JADX INFO: renamed from: b */
    public final String f141280b;

    /* JADX INFO: renamed from: c */
    public final String f141281c;

    /* JADX INFO: renamed from: d */
    public final String f141282d;

    /* JADX INFO: renamed from: e */
    public final String f141283e;

    public m9d1(String str, String str2, String str3, String str4, String str5) {
        this.f141279a = str;
        this.f141280b = str2;
        this.f141281c = str3;
        this.f141282d = str4;
        this.f141283e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final String m61211a() {
        return this.f141283e;
    }

    /* JADX INFO: renamed from: b */
    public final String m61212b() {
        return this.f141280b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9d1)) {
            return false;
        }
        m9d1 m9d1Var = (m9d1) obj;
        return wj50.m88271j(this.f141279a, m9d1Var.f141279a) && wj50.m88271j(this.f141280b, m9d1Var.f141280b) && wj50.m88271j(this.f141281c, m9d1Var.f141281c) && wj50.m88271j(this.f141282d, m9d1Var.f141282d) && wj50.m88271j(this.f141283e, m9d1Var.f141283e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f141279a.hashCode() * 31, 31, this.f141280b), 31, this.f141281c);
        String str = this.f141282d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f141283e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
