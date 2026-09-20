package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class psb {

    /* JADX INFO: renamed from: a */
    public final String f180797a;

    /* JADX INFO: renamed from: b */
    public final String f180798b;

    /* JADX INFO: renamed from: c */
    public final String f180799c;

    /* JADX INFO: renamed from: d */
    public final String f180800d;

    /* JADX INFO: renamed from: e */
    public final hrb f180801e;

    /* JADX INFO: renamed from: f */
    public final String f180802f;

    /* JADX INFO: renamed from: g */
    public final String f180803g;

    /* JADX INFO: renamed from: h */
    public final String f180804h;

    /* JADX INFO: renamed from: i */
    public final boolean f180805i;

    public psb(String str, String str2, String str3, String str4, hrb hrbVar, String str5, String str6, String str7, boolean z) {
        this.f180797a = str;
        this.f180798b = str2;
        this.f180799c = str3;
        this.f180800d = str4;
        this.f180801e = hrbVar;
        this.f180802f = str5;
        this.f180803g = str6;
        this.f180804h = str7;
        this.f180805i = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m70770a() {
        return this.f180800d;
    }

    /* JADX INFO: renamed from: b */
    public final String m70771b() {
        return this.f180797a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psb)) {
            return false;
        }
        psb psbVar = (psb) obj;
        return wj50.m88271j(this.f180797a, psbVar.f180797a) && wj50.m88271j(this.f180798b, psbVar.f180798b) && wj50.m88271j(this.f180799c, psbVar.f180799c) && wj50.m88271j(this.f180800d, psbVar.f180800d) && this.f180801e == psbVar.f180801e && wj50.m88271j(this.f180802f, psbVar.f180802f) && wj50.m88271j(this.f180803g, psbVar.f180803g) && wj50.m88271j(this.f180804h, psbVar.f180804h) && this.f180805i == psbVar.f180805i;
    }

    public final int hashCode() {
        int iHashCode = this.f180797a.hashCode() * 31;
        String str = this.f180798b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f180799c;
        int iHashCode3 = (this.f180801e.hashCode() + s571.m77243b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f180800d)) * 31;
        String str3 = this.f180802f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f180803g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f180804h;
        return Boolean.hashCode(this.f180805i) + ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
