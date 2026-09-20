package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rfz0 {

    /* JADX INFO: renamed from: a */
    public final String f198764a;

    /* JADX INFO: renamed from: b */
    public final int f198765b;

    /* JADX INFO: renamed from: c */
    public final String f198766c;

    /* JADX INFO: renamed from: d */
    public final String f198767d;

    /* JADX INFO: renamed from: e */
    public final int f198768e;

    /* JADX INFO: renamed from: f */
    public final String f198769f;

    /* JADX INFO: renamed from: g */
    public final ci20 f198770g;

    /* JADX INFO: renamed from: h */
    public final boolean f198771h;

    /* JADX INFO: renamed from: i */
    public final Long f198772i;

    public rfz0(String str, int i, String str2, String str3, int i2, String str4, ci20 ci20Var, boolean z, Long l) {
        this.f198764a = str;
        this.f198765b = i;
        this.f198766c = str2;
        this.f198767d = str3;
        this.f198768e = i2;
        this.f198769f = str4;
        this.f198770g = ci20Var;
        this.f198771h = z;
        this.f198772i = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfz0)) {
            return false;
        }
        rfz0 rfz0Var = (rfz0) obj;
        return wj50.m88271j(this.f198764a, rfz0Var.f198764a) && this.f198765b == rfz0Var.f198765b && wj50.m88271j(this.f198766c, rfz0Var.f198766c) && wj50.m88271j(this.f198767d, rfz0Var.f198767d) && this.f198768e == rfz0Var.f198768e && wj50.m88271j(this.f198769f, rfz0Var.f198769f) && this.f198770g.equals(rfz0Var.f198770g) && this.f198771h == rfz0Var.f198771h && wj50.m88271j(this.f198772i, rfz0Var.f198772i);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f198765b, this.f198764a.hashCode() * 31, 31);
        String str = this.f198766c;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198767d;
        int iM40938f2 = f710.m40938f(this.f198768e, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.f198769f;
        int iM77245d = s571.m77245d((this.f198770g.hashCode() + ((iM40938f2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f198771h);
        Long l = this.f198772i;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }
}
