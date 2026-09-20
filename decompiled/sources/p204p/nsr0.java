package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class nsr0 extends usr0 {

    /* JADX INFO: renamed from: a */
    public final String f157873a;

    /* JADX INFO: renamed from: b */
    public final String f157874b;

    /* JADX INFO: renamed from: c */
    public final boolean f157875c;

    /* JADX INFO: renamed from: d */
    public final String f157876d;

    /* JADX INFO: renamed from: e */
    public final String f157877e;

    /* JADX INFO: renamed from: f */
    public final String f157878f;

    /* JADX INFO: renamed from: g */
    public final String f157879g;

    public nsr0(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f157873a = str;
        this.f157874b = str2;
        this.f157875c = z;
        this.f157876d = str3;
        this.f157877e = str4;
        this.f157878f = str5;
        this.f157879g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsr0)) {
            return false;
        }
        nsr0 nsr0Var = (nsr0) obj;
        return wj50.m88271j(this.f157873a, nsr0Var.f157873a) && wj50.m88271j(this.f157874b, nsr0Var.f157874b) && this.f157875c == nsr0Var.f157875c && wj50.m88271j(this.f157876d, nsr0Var.f157876d) && wj50.m88271j(this.f157877e, nsr0Var.f157877e) && wj50.m88271j(this.f157878f, nsr0Var.f157878f) && wj50.m88271j(this.f157879g, nsr0Var.f157879g);
    }

    public final int hashCode() {
        int iHashCode = this.f157873a.hashCode() * 31;
        String str = this.f157874b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f157875c);
        String str2 = this.f157876d;
        int iHashCode2 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f157877e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f157878f;
        return this.f157879g.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
