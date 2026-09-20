package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qnj0 {

    /* JADX INFO: renamed from: a */
    public final String f190621a;

    /* JADX INFO: renamed from: b */
    public final String f190622b;

    /* JADX INFO: renamed from: c */
    public final String f190623c;

    /* JADX INFO: renamed from: d */
    public final String f190624d;

    /* JADX INFO: renamed from: e */
    public final int f190625e;

    /* JADX INFO: renamed from: f */
    public final boolean f190626f;

    /* JADX INFO: renamed from: g */
    public final boolean f190627g;

    /* JADX INFO: renamed from: h */
    public final String f190628h;

    /* JADX INFO: renamed from: i */
    public final String f190629i;

    /* JADX INFO: renamed from: j */
    public final String f190630j;

    /* JADX INFO: renamed from: k */
    public final String f190631k;

    public qnj0(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, String str5, String str6, String str7, String str8) {
        this.f190621a = str;
        this.f190622b = str2;
        this.f190623c = str3;
        this.f190624d = str4;
        this.f190625e = i;
        this.f190626f = z;
        this.f190627g = z2;
        this.f190628h = str5;
        this.f190629i = str6;
        this.f190630j = str7;
        this.f190631k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnj0)) {
            return false;
        }
        qnj0 qnj0Var = (qnj0) obj;
        return wj50.m88271j(this.f190621a, qnj0Var.f190621a) && wj50.m88271j(this.f190622b, qnj0Var.f190622b) && wj50.m88271j(this.f190623c, qnj0Var.f190623c) && wj50.m88271j(this.f190624d, qnj0Var.f190624d) && this.f190625e == qnj0Var.f190625e && this.f190626f == qnj0Var.f190626f && this.f190627g == qnj0Var.f190627g && wj50.m88271j(this.f190628h, qnj0Var.f190628h) && wj50.m88271j(this.f190629i, qnj0Var.f190629i) && wj50.m88271j(this.f190630j, qnj0Var.f190630j) && wj50.m88271j(this.f190631k, qnj0Var.f190631k);
    }

    public final int hashCode() {
        return this.f190631k.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d(s571.m77245d(mt60.m62800g(this.f190625e, s571.m77243b(s571.m77243b(s571.m77243b(this.f190621a.hashCode() * 31, 31, this.f190622b), 31, this.f190623c), 31, this.f190624d), 31), 31, this.f190626f), 31, this.f190627g), 31, this.f190628h), 31, this.f190629i), 31, this.f190630j);
    }
}
