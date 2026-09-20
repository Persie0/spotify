package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pm80 {

    /* JADX INFO: renamed from: a */
    public final String f178974a;

    /* JADX INFO: renamed from: b */
    public final String f178975b;

    /* JADX INFO: renamed from: c */
    public final String f178976c;

    /* JADX INFO: renamed from: d */
    public final String f178977d;

    /* JADX INFO: renamed from: e */
    public final String f178978e;

    /* JADX INFO: renamed from: f */
    public final String f178979f;

    public /* synthetic */ pm80(String str, String str2, int i, String str3) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm80)) {
            return false;
        }
        pm80 pm80Var = (pm80) obj;
        return wj50.m88271j(this.f178974a, pm80Var.f178974a) && wj50.m88271j(this.f178975b, pm80Var.f178975b) && wj50.m88271j(this.f178976c, pm80Var.f178976c) && wj50.m88271j(this.f178977d, pm80Var.f178977d) && wj50.m88271j(this.f178978e, pm80Var.f178978e) && wj50.m88271j(this.f178979f, pm80Var.f178979f);
    }

    public final int hashCode() {
        int iHashCode = this.f178974a.hashCode() * 31;
        String str = this.f178975b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f178976c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f178977d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f178978e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f178979f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public pm80(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f178974a = str;
        this.f178975b = str2;
        this.f178976c = str3;
        this.f178977d = str4;
        this.f178978e = str5;
        this.f178979f = str6;
    }
}
