package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ua30 {

    /* JADX INFO: renamed from: a */
    public final String f228346a;

    /* JADX INFO: renamed from: b */
    public final String f228347b;

    /* JADX INFO: renamed from: c */
    public final String f228348c;

    public ua30(String str, String str2, String str3) {
        this.f228346a = str;
        this.f228347b = str2;
        this.f228348c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua30)) {
            return false;
        }
        ua30 ua30Var = (ua30) obj;
        return wj50.m88271j(this.f228346a, ua30Var.f228346a) && wj50.m88271j(this.f228347b, ua30Var.f228347b) && wj50.m88271j(this.f228348c, ua30Var.f228348c);
    }

    public final int hashCode() {
        int iHashCode = this.f228346a.hashCode() * 31;
        String str = this.f228347b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f228348c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
