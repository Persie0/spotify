package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cau0 {

    /* JADX INFO: renamed from: a */
    public final String f35931a;

    /* JADX INFO: renamed from: b */
    public final boolean f35932b;

    /* JADX INFO: renamed from: c */
    public final int f35933c;

    /* JADX INFO: renamed from: d */
    public final Boolean f35934d;

    /* JADX INFO: renamed from: e */
    public final Boolean f35935e;

    public cau0(String str, boolean z, int i, Boolean bool, Boolean bool2) {
        this.f35931a = str;
        this.f35932b = z;
        this.f35933c = i;
        this.f35934d = bool;
        this.f35935e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cau0)) {
            return false;
        }
        cau0 cau0Var = (cau0) obj;
        return wj50.m88271j(this.f35931a, cau0Var.f35931a) && this.f35932b == cau0Var.f35932b && this.f35933c == cau0Var.f35933c && wj50.m88271j(this.f35934d, cau0Var.f35934d) && wj50.m88271j(this.f35935e, cau0Var.f35935e);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f35933c, s571.m77245d(this.f35931a.hashCode() * 31, 31, this.f35932b), 31);
        Boolean bool = this.f35934d;
        int iHashCode = (iM62800g + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f35935e;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
