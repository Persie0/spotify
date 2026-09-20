package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r320 {

    /* JADX INFO: renamed from: a */
    public final String f195407a;

    /* JADX INFO: renamed from: b */
    public final String f195408b;

    /* JADX INFO: renamed from: c */
    public final String f195409c;

    /* JADX INFO: renamed from: d */
    public final boolean f195410d;

    /* JADX INFO: renamed from: e */
    public final Long f195411e;

    public r320(String str, String str2, String str3, boolean z, Long l) {
        this.f195407a = str;
        this.f195408b = str2;
        this.f195409c = str3;
        this.f195410d = z;
        this.f195411e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r320)) {
            return false;
        }
        r320 r320Var = (r320) obj;
        return wj50.m88271j(this.f195407a, r320Var.f195407a) && wj50.m88271j(this.f195408b, r320Var.f195408b) && wj50.m88271j(this.f195409c, r320Var.f195409c) && this.f195410d == r320Var.f195410d && wj50.m88271j(this.f195411e, r320Var.f195411e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f195407a.hashCode() * 31, 31, this.f195408b);
        String str = this.f195409c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f195410d);
        Long l = this.f195411e;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
