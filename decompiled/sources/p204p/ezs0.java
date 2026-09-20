package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ezs0 {

    /* JADX INFO: renamed from: a */
    public final String f64459a;

    /* JADX INFO: renamed from: b */
    public final String f64460b;

    /* JADX INFO: renamed from: c */
    public final String f64461c;

    /* JADX INFO: renamed from: d */
    public final String f64462d;

    /* JADX INFO: renamed from: e */
    public final un20 f64463e;

    /* JADX INFO: renamed from: f */
    public final String f64464f;

    /* JADX INFO: renamed from: g */
    public final f5u f64465g;

    /* JADX INFO: renamed from: h */
    public final String f64466h;

    /* JADX INFO: renamed from: i */
    public final String f64467i;

    public ezs0(String str, String str2, String str3, String str4, un20 un20Var, String str5, f5u f5uVar, String str6, String str7) {
        this.f64459a = str;
        this.f64460b = str2;
        this.f64461c = str3;
        this.f64462d = str4;
        this.f64463e = un20Var;
        this.f64464f = str5;
        this.f64465g = f5uVar;
        this.f64466h = str6;
        this.f64467i = str7;
    }

    /* JADX INFO: renamed from: a */
    public static ezs0 m40402a(ezs0 ezs0Var) {
        String str = ezs0Var.f64459a;
        String str2 = ezs0Var.f64460b;
        String str3 = ezs0Var.f64461c;
        String str4 = ezs0Var.f64462d;
        String str5 = ezs0Var.f64464f;
        f5u f5uVar = ezs0Var.f64465g;
        String str6 = ezs0Var.f64466h;
        String str7 = ezs0Var.f64467i;
        ezs0Var.getClass();
        return new ezs0(str, str2, str3, str4, null, str5, f5uVar, str6, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezs0)) {
            return false;
        }
        ezs0 ezs0Var = (ezs0) obj;
        return wj50.m88271j(this.f64459a, ezs0Var.f64459a) && wj50.m88271j(this.f64460b, ezs0Var.f64460b) && wj50.m88271j(this.f64461c, ezs0Var.f64461c) && wj50.m88271j(this.f64462d, ezs0Var.f64462d) && wj50.m88271j(this.f64463e, ezs0Var.f64463e) && wj50.m88271j(this.f64464f, ezs0Var.f64464f) && wj50.m88271j(this.f64465g, ezs0Var.f64465g) && wj50.m88271j(this.f64466h, ezs0Var.f64466h) && wj50.m88271j(this.f64467i, ezs0Var.f64467i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f64459a.hashCode() * 31, 31, this.f64460b), 31, this.f64461c), 31, this.f64462d);
        un20 un20Var = this.f64463e;
        int iHashCode = (iM77243b + (un20Var == null ? 0 : un20Var.hashCode())) * 31;
        String str = this.f64464f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f5u f5uVar = this.f64465g;
        int iHashCode3 = (iHashCode2 + (f5uVar == null ? 0 : f5uVar.hashCode())) * 31;
        String str2 = this.f64466h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64467i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ ezs0(String str, String str2, String str3, String str4, un20 un20Var, String str5, f5u f5uVar, String str6, String str7, int i) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : un20Var, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : f5uVar, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
