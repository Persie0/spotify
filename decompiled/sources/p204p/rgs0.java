package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f199008a;

    /* JADX INFO: renamed from: b */
    public final String f199009b;

    /* JADX INFO: renamed from: c */
    public final long f199010c;

    /* JADX INFO: renamed from: d */
    public final boolean f199011d;

    public rgs0(String str, String str2, long j, boolean z) {
        this.f199008a = str;
        this.f199009b = str2;
        this.f199010c = j;
        this.f199011d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgs0)) {
            return false;
        }
        rgs0 rgs0Var = (rgs0) obj;
        return this.f199008a.equals(rgs0Var.f199008a) && this.f199009b.equals(rgs0Var.f199009b) && this.f199010c == rgs0Var.f199010c && this.f199011d == rgs0Var.f199011d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f199011d) + dq60.m36605e(s571.m77243b(this.f199008a.hashCode() * 31, 31, this.f199009b), this.f199010c, 31);
    }
}
