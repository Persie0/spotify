package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t4s {

    /* JADX INFO: renamed from: a */
    public final String f217061a;

    /* JADX INFO: renamed from: b */
    public final String f217062b;

    /* JADX INFO: renamed from: c */
    public final String f217063c;

    public /* synthetic */ t4s(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public final String m80073a() {
        return this.f217062b;
    }

    /* JADX INFO: renamed from: b */
    public final String m80074b() {
        return this.f217063c;
    }

    /* JADX INFO: renamed from: c */
    public final String m80075c() {
        return this.f217061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4s)) {
            return false;
        }
        t4s t4sVar = (t4s) obj;
        return wj50.m88271j(this.f217061a, t4sVar.f217061a) && wj50.m88271j(this.f217062b, t4sVar.f217062b) && wj50.m88271j(this.f217063c, t4sVar.f217063c);
    }

    public final int hashCode() {
        int iHashCode = this.f217061a.hashCode() * 31;
        String str = this.f217062b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217063c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public t4s(String str, String str2, String str3) {
        this.f217061a = str;
        this.f217062b = str2;
        this.f217063c = str3;
    }
}
