package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ak1 {

    /* JADX INFO: renamed from: a */
    public final String f16386a;

    /* JADX INFO: renamed from: b */
    public final String f16387b;

    /* JADX INFO: renamed from: c */
    public final boolean f16388c;

    /* JADX INFO: renamed from: d */
    public final String f16389d;

    /* JADX INFO: renamed from: e */
    public final boolean f16390e;

    /* JADX INFO: renamed from: f */
    public final String f16391f;

    public ak1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f16386a = str;
        this.f16387b = str2;
        this.f16388c = z;
        this.f16389d = str3;
        this.f16390e = z2;
        this.f16391f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return wj50.m88271j(this.f16386a, ak1Var.f16386a) && wj50.m88271j(this.f16387b, ak1Var.f16387b) && this.f16388c == ak1Var.f16388c && wj50.m88271j(this.f16389d, ak1Var.f16389d) && this.f16390e == ak1Var.f16390e && wj50.m88271j(this.f16391f, ak1Var.f16391f);
    }

    public final int hashCode() {
        int iHashCode = this.f16386a.hashCode() * 31;
        String str = this.f16387b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16388c);
        String str2 = this.f16389d;
        int iM77245d2 = s571.m77245d((iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f16390e);
        String str3 = this.f16391f;
        return iM77245d2 + (str3 != null ? str3.hashCode() : 0);
    }
}
