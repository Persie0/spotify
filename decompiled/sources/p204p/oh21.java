package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oh21 {

    /* JADX INFO: renamed from: a */
    public final String f165316a;

    /* JADX INFO: renamed from: b */
    public final int f165317b;

    /* JADX INFO: renamed from: c */
    public final int f165318c;

    /* JADX INFO: renamed from: d */
    public final int f165319d;

    /* JADX INFO: renamed from: e */
    public final long f165320e;

    /* JADX INFO: renamed from: f */
    public final String f165321f;

    /* JADX INFO: renamed from: g */
    public final String f165322g;

    /* JADX INFO: renamed from: h */
    public final String f165323h;

    /* JADX INFO: renamed from: i */
    public final String f165324i;

    /* JADX INFO: renamed from: j */
    public final String f165325j;

    public oh21(String str, int i, int i2, int i3, long j, String str2, String str3, String str4, String str5, String str6) {
        this.f165316a = str;
        this.f165317b = i;
        this.f165318c = i2;
        this.f165319d = i3;
        this.f165320e = j;
        this.f165321f = str2;
        this.f165322g = str3;
        this.f165323h = str4;
        this.f165324i = str5;
        this.f165325j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh21)) {
            return false;
        }
        oh21 oh21Var = (oh21) obj;
        return this.f165316a.equals(oh21Var.f165316a) && this.f165317b == oh21Var.f165317b && this.f165318c == oh21Var.f165318c && this.f165319d == oh21Var.f165319d && this.f165320e == oh21Var.f165320e && this.f165321f.equals(oh21Var.f165321f) && this.f165322g.equals(oh21Var.f165322g) && this.f165323h.equals(oh21Var.f165323h) && this.f165324i.equals(oh21Var.f165324i) && this.f165325j.equals(oh21Var.f165325j);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(dq60.m36605e(f710.m40938f(this.f165319d, mt60.m62800g(this.f165318c, mt60.m62800g(this.f165317b, this.f165316a.hashCode() * 31, 31), 31), 31), this.f165320e, 31), 31, this.f165321f), 31, this.f165322g), 31, this.f165323h), 31, this.f165324i), 31, this.f165325j);
    }
}
