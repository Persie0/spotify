package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nvh {

    /* JADX INFO: renamed from: a */
    public final String f158901a;

    /* JADX INFO: renamed from: b */
    public final String f158902b;

    /* JADX INFO: renamed from: c */
    public final boolean f158903c;

    /* JADX INFO: renamed from: d */
    public final boolean f158904d;

    /* JADX INFO: renamed from: e */
    public final String f158905e;

    /* JADX INFO: renamed from: f */
    public final String f158906f;

    public nvh(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f158901a = str;
        this.f158902b = str2;
        this.f158903c = z;
        this.f158904d = z2;
        this.f158905e = str3;
        this.f158906f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvh)) {
            return false;
        }
        nvh nvhVar = (nvh) obj;
        return wj50.m88271j(this.f158901a, nvhVar.f158901a) && wj50.m88271j(this.f158902b, nvhVar.f158902b) && this.f158903c == nvhVar.f158903c && this.f158904d == nvhVar.f158904d && wj50.m88271j(this.f158905e, nvhVar.f158905e) && wj50.m88271j(this.f158906f, nvhVar.f158906f);
    }

    public final int hashCode() {
        int iHashCode = this.f158901a.hashCode() * 31;
        String str = this.f158902b;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f158903c), 31, this.f158904d);
        String str2 = this.f158905e;
        int iHashCode2 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f158906f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
