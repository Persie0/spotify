package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tga1 {

    /* JADX INFO: renamed from: a */
    public final String f220153a;

    /* JADX INFO: renamed from: b */
    public final String f220154b;

    /* JADX INFO: renamed from: c */
    public final String f220155c;

    /* JADX INFO: renamed from: d */
    public final String f220156d;

    /* JADX INFO: renamed from: e */
    public final String f220157e;

    /* JADX INFO: renamed from: f */
    public final String f220158f;

    /* JADX INFO: renamed from: g */
    public final int f220159g;

    public tga1(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f220153a = str;
        this.f220154b = str2;
        this.f220155c = str3;
        this.f220156d = str4;
        this.f220157e = str5;
        this.f220158f = str6;
        this.f220159g = i;
    }

    /* JADX INFO: renamed from: a */
    public static tga1 m80764a(tga1 tga1Var, int i) {
        tga1Var.getClass();
        String str = tga1Var.f220153a;
        String str2 = tga1Var.f220154b;
        String str3 = tga1Var.f220155c;
        String str4 = tga1Var.f220156d;
        String str5 = tga1Var.f220157e;
        String str6 = tga1Var.f220158f;
        tga1Var.getClass();
        return new tga1(str, str2, str3, str4, i, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tga1)) {
            return false;
        }
        tga1 tga1Var = (tga1) obj;
        return wj50.m88271j(this.f220153a, tga1Var.f220153a) && wj50.m88271j(this.f220154b, tga1Var.f220154b) && wj50.m88271j(this.f220155c, tga1Var.f220155c) && wj50.m88271j(this.f220156d, tga1Var.f220156d) && wj50.m88271j(this.f220157e, tga1Var.f220157e) && wj50.m88271j(this.f220158f, tga1Var.f220158f) && this.f220159g == tga1Var.f220159g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f220159g) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(false) * 31, 31, this.f220153a), 31, this.f220154b), 31, this.f220155c), 31, this.f220156d), 31, this.f220157e), 31, this.f220158f);
    }

    public /* synthetic */ tga1() {
        this("#FFFFFF", "", "", "", 0, "", "");
    }
}
