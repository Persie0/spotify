package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o7r0 implements q7r0 {

    /* JADX INFO: renamed from: a */
    public final String f162600a;

    /* JADX INFO: renamed from: b */
    public final String f162601b;

    /* JADX INFO: renamed from: c */
    public final String f162602c;

    /* JADX INFO: renamed from: d */
    public final int f162603d;

    /* JADX INFO: renamed from: e */
    public final long f162604e;

    public o7r0(int i, long j, String str, String str2, String str3) {
        this.f162600a = str;
        this.f162601b = str2;
        this.f162602c = str3;
        this.f162603d = i;
        this.f162604e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7r0)) {
            return false;
        }
        o7r0 o7r0Var = (o7r0) obj;
        return wj50.m88271j(this.f162600a, o7r0Var.f162600a) && this.f162601b.equals(o7r0Var.f162601b) && wj50.m88271j(this.f162602c, o7r0Var.f162602c) && this.f162603d == o7r0Var.f162603d && this.f162604e == o7r0Var.f162604e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f162600a.hashCode() * 31, 31, this.f162601b);
        String str = this.f162602c;
        return Long.hashCode(this.f162604e) + f710.m40938f(this.f162603d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
