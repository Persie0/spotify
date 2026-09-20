package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ak11 {

    /* JADX INFO: renamed from: a */
    public final String f16396a;

    /* JADX INFO: renamed from: b */
    public final String f16397b;

    /* JADX INFO: renamed from: c */
    public final String f16398c;

    /* JADX INFO: renamed from: d */
    public final String f16399d;

    /* JADX INFO: renamed from: e */
    public final boolean f16400e;

    /* JADX INFO: renamed from: f */
    public final boolean f16401f;

    /* JADX INFO: renamed from: g */
    public final boolean f16402g;

    public ak11(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f16396a = str;
        this.f16397b = str2;
        this.f16398c = str3;
        this.f16399d = str4;
        this.f16400e = z;
        this.f16401f = z2;
        this.f16402g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak11)) {
            return false;
        }
        ak11 ak11Var = (ak11) obj;
        return wj50.m88271j(this.f16396a, ak11Var.f16396a) && wj50.m88271j(this.f16397b, ak11Var.f16397b) && wj50.m88271j(this.f16398c, ak11Var.f16398c) && wj50.m88271j(this.f16399d, ak11Var.f16399d) && this.f16400e == ak11Var.f16400e && this.f16401f == ak11Var.f16401f && this.f16402g == ak11Var.f16402g;
    }

    public final int hashCode() {
        int iHashCode = this.f16396a.hashCode() * 31;
        String str = this.f16397b;
        return Boolean.hashCode(this.f16402g) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f16398c), 31, this.f16399d), 31, this.f16400e), 31, this.f16401f);
    }
}
