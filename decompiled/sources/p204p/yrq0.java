package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yrq0 {

    /* JADX INFO: renamed from: a */
    public final String f275573a;

    /* JADX INFO: renamed from: b */
    public final String f275574b;

    /* JADX INFO: renamed from: c */
    public final String f275575c;

    /* JADX INFO: renamed from: d */
    public final String f275576d;

    /* JADX INFO: renamed from: e */
    public final jba0 f275577e;

    /* JADX INFO: renamed from: f */
    public final long f275578f;

    /* JADX INFO: renamed from: g */
    public final int f275579g;

    /* JADX INFO: renamed from: h */
    public final boolean f275580h;

    /* JADX INFO: renamed from: i */
    public final ebf0 f275581i;

    public yrq0(String str, String str2, String str3, String str4, jba0 jba0Var, long j, int i, boolean z, ebf0 ebf0Var) {
        this.f275573a = str;
        this.f275574b = str2;
        this.f275575c = str3;
        this.f275576d = str4;
        this.f275577e = jba0Var;
        this.f275578f = j;
        this.f275579g = i;
        this.f275580h = z;
        this.f275581i = ebf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrq0)) {
            return false;
        }
        yrq0 yrq0Var = (yrq0) obj;
        return wj50.m88271j(this.f275573a, yrq0Var.f275573a) && wj50.m88271j(this.f275574b, yrq0Var.f275574b) && wj50.m88271j(this.f275575c, yrq0Var.f275575c) && wj50.m88271j(this.f275576d, yrq0Var.f275576d) && wj50.m88271j(this.f275577e, yrq0Var.f275577e) && this.f275578f == yrq0Var.f275578f && this.f275579g == yrq0Var.f275579g && this.f275580h == yrq0Var.f275580h && wj50.m88271j(this.f275581i, yrq0Var.f275581i);
    }

    public final int hashCode() {
        return this.f275581i.f57921a.hashCode() + s571.m77245d(mt60.m62800g(this.f275579g, dq60.m36605e((this.f275577e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f275573a.hashCode() * 31, 31, this.f275574b), 31, this.f275575c), 31, this.f275576d)) * 31, this.f275578f, 31), 31), 31, this.f275580h);
    }
}
