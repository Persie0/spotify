package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gke1 implements ike1 {

    /* JADX INFO: renamed from: a */
    public final String f80788a;

    /* JADX INFO: renamed from: b */
    public final String f80789b;

    /* JADX INFO: renamed from: c */
    public final String f80790c;

    /* JADX INFO: renamed from: d */
    public final String f80791d;

    /* JADX INFO: renamed from: e */
    public final String f80792e;

    /* JADX INFO: renamed from: f */
    public final fke1 f80793f;

    /* JADX INFO: renamed from: g */
    public final boolean f80794g;

    public gke1(String str, String str2, String str3, String str4, String str5, fke1 fke1Var, boolean z) {
        this.f80788a = str;
        this.f80789b = str2;
        this.f80790c = str3;
        this.f80791d = str4;
        this.f80792e = str5;
        this.f80793f = fke1Var;
        this.f80794g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gke1)) {
            return false;
        }
        gke1 gke1Var = (gke1) obj;
        return wj50.m88271j(this.f80788a, gke1Var.f80788a) && wj50.m88271j(this.f80789b, gke1Var.f80789b) && wj50.m88271j(this.f80790c, gke1Var.f80790c) && wj50.m88271j(this.f80791d, gke1Var.f80791d) && wj50.m88271j(this.f80792e, gke1Var.f80792e) && wj50.m88271j(this.f80793f, gke1Var.f80793f) && this.f80794g == gke1Var.f80794g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f80788a.hashCode() * 31, 31, this.f80789b);
        String str = this.f80790c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80791d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80792e;
        return Boolean.hashCode(this.f80794g) + ((this.f80793f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }
}
