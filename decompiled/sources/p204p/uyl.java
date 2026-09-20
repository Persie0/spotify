package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uyl {

    /* JADX INFO: renamed from: a */
    public final String f235317a;

    /* JADX INFO: renamed from: b */
    public final String f235318b;

    /* JADX INFO: renamed from: c */
    public final String f235319c;

    /* JADX INFO: renamed from: d */
    public final String f235320d;

    /* JADX INFO: renamed from: e */
    public final String f235321e;

    /* JADX INFO: renamed from: f */
    public final boolean f235322f;

    /* JADX INFO: renamed from: g */
    public final Integer f235323g;

    public uyl(String str, String str2, String str3, String str4, String str5, boolean z, Integer num, int i) {
        z = (i & 32) != 0 ? true : z;
        num = (i & 64) != 0 ? null : num;
        this.f235317a = str;
        this.f235318b = str2;
        this.f235319c = str3;
        this.f235320d = str4;
        this.f235321e = str5;
        this.f235322f = z;
        this.f235323g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyl)) {
            return false;
        }
        uyl uylVar = (uyl) obj;
        return wj50.m88271j(this.f235317a, uylVar.f235317a) && wj50.m88271j(this.f235318b, uylVar.f235318b) && wj50.m88271j(this.f235319c, uylVar.f235319c) && wj50.m88271j(this.f235320d, uylVar.f235320d) && wj50.m88271j(this.f235321e, uylVar.f235321e) && this.f235322f == uylVar.f235322f && wj50.m88271j(this.f235323g, uylVar.f235323g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f235317a.hashCode() * 31, 31, this.f235318b), 31, this.f235319c), 31, this.f235320d), 31, this.f235321e), 31, this.f235322f);
        Integer num = this.f235323g;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
