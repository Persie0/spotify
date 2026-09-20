package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c0w0 {

    /* JADX INFO: renamed from: a */
    public final boolean f32890a;

    /* JADX INFO: renamed from: b */
    public final String f32891b;

    /* JADX INFO: renamed from: c */
    public final String f32892c;

    /* JADX INFO: renamed from: d */
    public final String f32893d;

    /* JADX INFO: renamed from: e */
    public final String f32894e;

    /* JADX INFO: renamed from: f */
    public final long f32895f;

    /* JADX INFO: renamed from: g */
    public final long f32896g;

    /* JADX INFO: renamed from: h */
    public final String f32897h;

    /* JADX INFO: renamed from: i */
    public final String f32898i;

    /* JADX INFO: renamed from: j */
    public final vzv0 f32899j;

    public c0w0(boolean z, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, vzv0 vzv0Var) {
        this.f32890a = z;
        this.f32891b = str;
        this.f32892c = str2;
        this.f32893d = str3;
        this.f32894e = str4;
        this.f32895f = j;
        this.f32896g = j2;
        this.f32897h = str5;
        this.f32898i = str6;
        this.f32899j = vzv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0w0)) {
            return false;
        }
        c0w0 c0w0Var = (c0w0) obj;
        return this.f32890a == c0w0Var.f32890a && wj50.m88271j(this.f32891b, c0w0Var.f32891b) && wj50.m88271j(this.f32892c, c0w0Var.f32892c) && wj50.m88271j(this.f32893d, c0w0Var.f32893d) && wj50.m88271j(this.f32894e, c0w0Var.f32894e) && this.f32895f == c0w0Var.f32895f && this.f32896g == c0w0Var.f32896g && wj50.m88271j(this.f32897h, c0w0Var.f32897h) && wj50.m88271j(this.f32898i, c0w0Var.f32898i) && this.f32899j == c0w0Var.f32899j;
    }

    public final int hashCode() {
        return this.f32899j.hashCode() + s571.m77243b(dq60.m36605e(s571.m77243b(dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(Boolean.hashCode(this.f32890a) * 31, 31, this.f32891b), 31, this.f32892c), 31, this.f32893d), 31, this.f32894e), this.f32895f, 31), this.f32896g, 31), 31, this.f32897h), 0L, 31), 31, this.f32898i);
    }
}
