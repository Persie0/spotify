package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l0n0 {

    /* JADX INFO: renamed from: a */
    public final String f128475a;

    /* JADX INFO: renamed from: b */
    public final String f128476b;

    /* JADX INFO: renamed from: c */
    public final String f128477c;

    /* JADX INFO: renamed from: d */
    public final boolean f128478d;

    /* JADX INFO: renamed from: e */
    public final boolean f128479e;

    public l0n0(String str, String str2, String str3, boolean z, boolean z2) {
        this.f128475a = str;
        this.f128476b = str2;
        this.f128477c = str3;
        this.f128478d = z;
        this.f128479e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0n0)) {
            return false;
        }
        l0n0 l0n0Var = (l0n0) obj;
        return wj50.m88271j(this.f128475a, l0n0Var.f128475a) && wj50.m88271j(this.f128476b, l0n0Var.f128476b) && wj50.m88271j(this.f128477c, l0n0Var.f128477c) && this.f128478d == l0n0Var.f128478d && this.f128479e == l0n0Var.f128479e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f128475a.hashCode() * 31, 31, this.f128476b);
        String str = this.f128477c;
        return Boolean.hashCode(this.f128479e) + s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f128478d);
    }
}
