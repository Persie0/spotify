package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class lcf0 {

    /* JADX INFO: renamed from: a */
    public final UUID f131917a;

    /* JADX INFO: renamed from: b */
    public final zbf0 f131918b;

    /* JADX INFO: renamed from: c */
    public final String f131919c;

    /* JADX INFO: renamed from: d */
    public final String f131920d;

    /* JADX INFO: renamed from: e */
    public final ybf0 f131921e;

    /* JADX INFO: renamed from: f */
    public final String f131922f;

    /* JADX INFO: renamed from: g */
    public final long f131923g;

    /* JADX INFO: renamed from: h */
    public final long f131924h;

    /* JADX INFO: renamed from: i */
    public final long f131925i;

    /* JADX INFO: renamed from: j */
    public final int f131926j;

    /* JADX INFO: renamed from: k */
    public final String f131927k;

    /* JADX INFO: renamed from: l */
    public final Long f131928l;

    /* JADX INFO: renamed from: m */
    public final String f131929m;

    /* JADX INFO: renamed from: n */
    public final boolean f131930n;

    public lcf0(UUID uuid, zbf0 zbf0Var, String str, String str2, ybf0 ybf0Var, String str3, long j, long j2, long j3, int i, String str4, Long l, String str5, boolean z) {
        this.f131917a = uuid;
        this.f131918b = zbf0Var;
        this.f131919c = str;
        this.f131920d = str2;
        this.f131921e = ybf0Var;
        this.f131922f = str3;
        this.f131923g = j;
        this.f131924h = j2;
        this.f131925i = j3;
        this.f131926j = i;
        this.f131927k = str4;
        this.f131928l = l;
        this.f131929m = str5;
        this.f131930n = z;
    }

    /* JADX INFO: renamed from: a */
    public final ybf0 m58695a() {
        return this.f131921e;
    }

    /* JADX INFO: renamed from: b */
    public final String m58696b() {
        return this.f131927k;
    }

    /* JADX INFO: renamed from: c */
    public final String m58697c() {
        return this.f131920d;
    }

    /* JADX INFO: renamed from: d */
    public final String m58698d() {
        return this.f131922f;
    }

    /* JADX INFO: renamed from: e */
    public final int m58699e() {
        return this.f131926j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcf0)) {
            return false;
        }
        lcf0 lcf0Var = (lcf0) obj;
        return this.f131917a.equals(lcf0Var.f131917a) && wj50.m88271j(this.f131918b, lcf0Var.f131918b) && wj50.m88271j(this.f131919c, lcf0Var.f131919c) && wj50.m88271j(this.f131920d, lcf0Var.f131920d) && wj50.m88271j(this.f131921e, lcf0Var.f131921e) && wj50.m88271j(this.f131922f, lcf0Var.f131922f) && this.f131923g == lcf0Var.f131923g && this.f131924h == lcf0Var.f131924h && this.f131925i == lcf0Var.f131925i && this.f131926j == lcf0Var.f131926j && this.f131927k.equals(lcf0Var.f131927k) && wj50.m88271j(this.f131928l, lcf0Var.f131928l) && this.f131929m.equals(lcf0Var.f131929m) && this.f131930n == lcf0Var.f131930n;
    }

    /* JADX INFO: renamed from: f */
    public final zbf0 m58700f() {
        return this.f131918b;
    }

    /* JADX INFO: renamed from: g */
    public final String m58701g() {
        return this.f131929m;
    }

    /* JADX INFO: renamed from: h */
    public final UUID m58702h() {
        return this.f131917a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b((this.f131918b.hashCode() + (this.f131917a.hashCode() * 31)) * 31, 31, this.f131919c), 31, this.f131920d);
        ybf0 ybf0Var = this.f131921e;
        int iHashCode = (iM77243b + (ybf0Var == null ? 0 : ybf0Var.hashCode())) * 961;
        String str = this.f131922f;
        int iM77243b2 = s571.m77243b(f710.m40938f(this.f131926j, dq60.m36605e(dq60.m36605e(dq60.m36605e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f131923g, 31), this.f131924h, 31), this.f131925i, 31), 31), 31, this.f131927k);
        Long l = this.f131928l;
        return Boolean.hashCode(this.f131930n) + s571.m77243b((iM77243b2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.f131929m);
    }

    /* JADX INFO: renamed from: i */
    public final Long m58703i() {
        return this.f131928l;
    }

    /* JADX INFO: renamed from: j */
    public final String m58704j() {
        return this.f131919c;
    }

    /* JADX INFO: renamed from: k */
    public final long m58705k() {
        return this.f131924h;
    }

    /* JADX INFO: renamed from: l */
    public final long m58706l() {
        return this.f131923g;
    }

    /* JADX INFO: renamed from: m */
    public final long m58707m() {
        return this.f131925i;
    }
}
