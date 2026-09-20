package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class czl {

    /* JADX INFO: renamed from: g */
    public static final czl f43582g = new czl(null, null, null, null, null, null);

    /* JADX INFO: renamed from: a */
    public final String f43583a;

    /* JADX INFO: renamed from: b */
    public final String f43584b;

    /* JADX INFO: renamed from: c */
    public final String f43585c;

    /* JADX INFO: renamed from: d */
    public final String f43586d;

    /* JADX INFO: renamed from: e */
    public final gh0 f43587e;

    /* JADX INFO: renamed from: f */
    public final it91 f43588f;

    public czl(String str, String str2, String str3, String str4, gh0 gh0Var, it91 it91Var) {
        this.f43583a = str;
        this.f43584b = str2;
        this.f43585c = str3;
        this.f43586d = str4;
        this.f43587e = gh0Var;
        this.f43588f = it91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czl)) {
            return false;
        }
        czl czlVar = (czl) obj;
        return wj50.m88271j(this.f43583a, czlVar.f43583a) && wj50.m88271j(this.f43584b, czlVar.f43584b) && wj50.m88271j(this.f43585c, czlVar.f43585c) && wj50.m88271j(this.f43586d, czlVar.f43586d) && wj50.m88271j(this.f43587e, czlVar.f43587e) && wj50.m88271j(this.f43588f, czlVar.f43588f);
    }

    public final int hashCode() {
        String str = this.f43583a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f43584b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f43585c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f43586d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        gh0 gh0Var = this.f43587e;
        int iHashCode5 = (iHashCode4 + (gh0Var == null ? 0 : gh0Var.hashCode())) * 31;
        it91 it91Var = this.f43588f;
        return iHashCode5 + (it91Var != null ? it91Var.hashCode() : 0);
    }
}
