package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sh21 {

    /* JADX INFO: renamed from: a */
    public final String f208984a;

    /* JADX INFO: renamed from: b */
    public final int f208985b;

    /* JADX INFO: renamed from: c */
    public final long f208986c;

    /* JADX INFO: renamed from: d */
    public final String f208987d;

    /* JADX INFO: renamed from: e */
    public final String f208988e;

    /* JADX INFO: renamed from: f */
    public final String f208989f;

    /* JADX INFO: renamed from: g */
    public final String f208990g;

    /* JADX INFO: renamed from: h */
    public final String f208991h;

    public sh21(String str, int i, long j, String str2, String str3, String str4, String str5, String str6) {
        this.f208984a = str;
        this.f208985b = i;
        this.f208986c = j;
        this.f208987d = str2;
        this.f208988e = str3;
        this.f208989f = str4;
        this.f208990g = str5;
        this.f208991h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh21)) {
            return false;
        }
        sh21 sh21Var = (sh21) obj;
        return this.f208984a.equals(sh21Var.f208984a) && this.f208985b == sh21Var.f208985b && this.f208986c == sh21Var.f208986c && this.f208987d.equals(sh21Var.f208987d) && this.f208988e.equals(sh21Var.f208988e) && this.f208989f.equals(sh21Var.f208989f) && this.f208990g.equals(sh21Var.f208990g) && this.f208991h.equals(sh21Var.f208991h);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(dq60.m36605e(dq60.m36605e(mt60.m62800g(this.f208985b, this.f208984a.hashCode() * 31, 31), 0L, 961), this.f208986c, 31), 31, this.f208987d), 31, this.f208988e), 31, this.f208989f), 31, this.f208990g), 31, this.f208991h);
    }
}
