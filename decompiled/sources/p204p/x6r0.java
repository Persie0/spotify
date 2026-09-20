package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x6r0 extends c7r0 {

    /* JADX INFO: renamed from: a */
    public final String f258733a;

    /* JADX INFO: renamed from: b */
    public final String f258734b;

    /* JADX INFO: renamed from: c */
    public final String f258735c;

    /* JADX INFO: renamed from: d */
    public final long f258736d;

    /* JADX INFO: renamed from: e */
    public final boolean f258737e;

    /* JADX INFO: renamed from: f */
    public final boolean f258738f;

    public x6r0(String str, String str2, String str3, long j, boolean z, boolean z2) {
        this.f258733a = str;
        this.f258734b = str2;
        this.f258735c = str3;
        this.f258736d = j;
        this.f258737e = z;
        this.f258738f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6r0)) {
            return false;
        }
        x6r0 x6r0Var = (x6r0) obj;
        return wj50.m88271j(this.f258733a, x6r0Var.f258733a) && wj50.m88271j(this.f258734b, x6r0Var.f258734b) && wj50.m88271j(this.f258735c, x6r0Var.f258735c) && this.f258736d == x6r0Var.f258736d && this.f258737e == x6r0Var.f258737e && this.f258738f == x6r0Var.f258738f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f258733a.hashCode() * 31, 31, this.f258734b);
        String str = this.f258735c;
        return Boolean.hashCode(this.f258738f) + s571.m77245d(dq60.m36605e((iM77243b + (str == null ? 0 : str.hashCode())) * 31, this.f258736d, 31), 31, this.f258737e);
    }
}
