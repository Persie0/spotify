package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vzk {

    /* JADX INFO: renamed from: a */
    public final String f246475a;

    /* JADX INFO: renamed from: b */
    public final String f246476b;

    /* JADX INFO: renamed from: c */
    public final String f246477c;

    /* JADX INFO: renamed from: d */
    public final String f246478d;

    public vzk(String str, String str2, String str3, String str4) {
        this.f246475a = str;
        this.f246476b = str2;
        this.f246477c = str3;
        this.f246478d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m86903a(int i) {
        String str;
        String str2;
        String str3;
        if (i == 4 && (str3 = this.f246478d) != null && str3.length() != 0) {
            return str3;
        }
        if ((i != 3 && i != 4) || (str = this.f246477c) == null || str.length() == 0) {
            return (i != 2 || (str2 = this.f246476b) == null || str2.length() == 0) ? this.f246475a : str2;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzk)) {
            return false;
        }
        vzk vzkVar = (vzk) obj;
        return wj50.m88271j(this.f246475a, vzkVar.f246475a) && wj50.m88271j(this.f246476b, vzkVar.f246476b) && wj50.m88271j(this.f246477c, vzkVar.f246477c) && wj50.m88271j(this.f246478d, vzkVar.f246478d);
    }

    public final int hashCode() {
        int iHashCode = this.f246475a.hashCode() * 31;
        String str = this.f246476b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f246477c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f246478d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ vzk() {
        this("", null, null, null);
    }
}
