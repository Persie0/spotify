package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ady {

    /* JADX INFO: renamed from: a */
    public final String f14695a;

    /* JADX INFO: renamed from: b */
    public final int f14696b;

    /* JADX INFO: renamed from: c */
    public final int f14697c;

    /* JADX INFO: renamed from: d */
    public final int f14698d;

    /* JADX INFO: renamed from: e */
    public final String f14699e;

    public ady(String str, int i, int i2, int i3, String str2) {
        this.f14695a = str;
        this.f14696b = i;
        this.f14697c = i2;
        this.f14698d = i3;
        this.f14699e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static ady m25632a(ady adyVar, String str, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            str = adyVar.f14695a;
        }
        String str2 = str;
        if ((i4 & 2) != 0) {
            i = adyVar.f14696b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = adyVar.f14697c;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = adyVar.f14698d;
        }
        int i7 = i3;
        String str3 = (i4 & 16) != 0 ? adyVar.f14699e : "https://fan-events-cdn.spotifycdn.com/redemptions/static/redemption-box.webp";
        adyVar.getClass();
        return new ady(str2, i5, i6, i7, str3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25633b() {
        return this.f14696b == 1 && this.f14695a.length() == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ady)) {
            return false;
        }
        ady adyVar = (ady) obj;
        return wj50.m88271j(this.f14695a, adyVar.f14695a) && this.f14696b == adyVar.f14696b && this.f14697c == adyVar.f14697c && this.f14698d == adyVar.f14698d && wj50.m88271j(this.f14699e, adyVar.f14699e);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f14696b, this.f14695a.hashCode() * 31, 31);
        int i = this.f14697c;
        int iM38547C = (iM40938f + (i == 0 ? 0 : edb.m38547C(i))) * 31;
        int i2 = this.f14698d;
        return this.f14699e.hashCode() + ((iM38547C + (i2 != 0 ? edb.m38547C(i2) : 0)) * 31);
    }
}
