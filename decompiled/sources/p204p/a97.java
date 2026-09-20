package p204p;

/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class a97 {
    public static final z87 Companion = new z87();

    /* JADX INFO: renamed from: a */
    public final String f13491a;

    /* JADX INFO: renamed from: b */
    public final String f13492b;

    /* JADX INFO: renamed from: c */
    public final String f13493c;

    /* JADX INFO: renamed from: d */
    public final String f13494d;

    /* JADX INFO: renamed from: e */
    public final String f13495e;

    /* JADX INFO: renamed from: f */
    public final String f13496f;

    /* JADX INFO: renamed from: g */
    public final String f13497g;

    public /* synthetic */ a97(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.f13491a = null;
        } else {
            this.f13491a = str;
        }
        if ((i & 2) == 0) {
            this.f13492b = null;
        } else {
            this.f13492b = str2;
        }
        if ((i & 4) == 0) {
            this.f13493c = null;
        } else {
            this.f13493c = str3;
        }
        if ((i & 8) == 0) {
            this.f13494d = null;
        } else {
            this.f13494d = str4;
        }
        if ((i & 16) == 0) {
            this.f13495e = null;
        } else {
            this.f13495e = str5;
        }
        if ((i & 32) == 0) {
            this.f13496f = null;
        } else {
            this.f13496f = str6;
        }
        if ((i & 64) == 0) {
            this.f13497g = null;
        } else {
            this.f13497g = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a97)) {
            return false;
        }
        a97 a97Var = (a97) obj;
        return wj50.m88271j(this.f13491a, a97Var.f13491a) && wj50.m88271j(this.f13492b, a97Var.f13492b) && wj50.m88271j(this.f13493c, a97Var.f13493c) && wj50.m88271j(this.f13494d, a97Var.f13494d) && wj50.m88271j(this.f13495e, a97Var.f13495e) && wj50.m88271j(this.f13496f, a97Var.f13496f) && wj50.m88271j(this.f13497g, a97Var.f13497g);
    }

    public final int hashCode() {
        String str = this.f13491a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13492b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13493c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13494d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13495e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13496f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f13497g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }
}
