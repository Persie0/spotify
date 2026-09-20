package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r6g0 implements s6g0 {

    /* JADX INFO: renamed from: a */
    public final String f196270a;

    /* JADX INFO: renamed from: b */
    public final String f196271b;

    /* JADX INFO: renamed from: c */
    public final String f196272c;

    /* JADX INFO: renamed from: d */
    public final String f196273d;

    public r6g0(String str, String str2, String str3, String str4) {
        this.f196270a = str;
        this.f196271b = str2;
        this.f196272c = str3;
        this.f196273d = str4;
    }

    /* JADX INFO: renamed from: a */
    public static r6g0 m74853a(r6g0 r6g0Var, String str, String str2) {
        String str3 = r6g0Var.f196270a;
        String str4 = r6g0Var.f196272c;
        r6g0Var.getClass();
        return new r6g0(str3, str, str4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6g0)) {
            return false;
        }
        r6g0 r6g0Var = (r6g0) obj;
        return wj50.m88271j(this.f196270a, r6g0Var.f196270a) && wj50.m88271j(this.f196271b, r6g0Var.f196271b) && wj50.m88271j(this.f196272c, r6g0Var.f196272c) && wj50.m88271j(this.f196273d, r6g0Var.f196273d);
    }

    public final int hashCode() {
        int iHashCode = this.f196270a.hashCode() * 31;
        String str = this.f196271b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f196272c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f196273d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
