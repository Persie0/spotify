package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class whv {

    /* JADX INFO: renamed from: a */
    public final String f251446a;

    /* JADX INFO: renamed from: b */
    public final String f251447b;

    /* JADX INFO: renamed from: c */
    public final String f251448c;

    /* JADX INFO: renamed from: d */
    public final String f251449d;

    /* JADX INFO: renamed from: e */
    public final String f251450e;

    /* JADX INFO: renamed from: f */
    public final String f251451f;

    /* JADX INFO: renamed from: g */
    public final String f251452g;

    /* JADX INFO: renamed from: h */
    public final int f251453h;

    /* JADX INFO: renamed from: i */
    public final boolean f251454i;

    public whv(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.f251446a = str;
        this.f251447b = str2;
        this.f251448c = str3;
        this.f251449d = str4;
        this.f251450e = str5;
        this.f251451f = str6;
        this.f251452g = str7;
        this.f251453h = i;
        this.f251454i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whv)) {
            return false;
        }
        whv whvVar = (whv) obj;
        return wj50.m88271j(this.f251446a, whvVar.f251446a) && wj50.m88271j(this.f251447b, whvVar.f251447b) && wj50.m88271j(this.f251448c, whvVar.f251448c) && wj50.m88271j(this.f251449d, whvVar.f251449d) && wj50.m88271j(this.f251450e, whvVar.f251450e) && wj50.m88271j(this.f251451f, whvVar.f251451f) && wj50.m88271j(this.f251452g, whvVar.f251452g) && this.f251453h == whvVar.f251453h && this.f251454i == whvVar.f251454i;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f251446a.hashCode() * 31, 31, this.f251447b), 31, this.f251448c), 31, this.f251449d);
        String str = this.f251450e;
        return Boolean.hashCode(this.f251454i) + mt60.m62800g(this.f251453h, s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f251451f), 31, this.f251452g), 31);
    }
}
