package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hv00 implements jv00 {

    /* JADX INFO: renamed from: a */
    public final String f95517a;

    /* JADX INFO: renamed from: b */
    public final String f95518b;

    /* JADX INFO: renamed from: c */
    public final boolean f95519c;

    public hv00(String str, String str2, boolean z) {
        this.f95517a = str;
        this.f95518b = str2;
        this.f95519c = z;
    }

    @Override // p204p.jv00
    /* JADX INFO: renamed from: a */
    public final boolean mo40080a() {
        return this.f95519c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv00)) {
            return false;
        }
        hv00 hv00Var = (hv00) obj;
        return wj50.m88271j(this.f95517a, hv00Var.f95517a) && wj50.m88271j(this.f95518b, hv00Var.f95518b) && this.f95519c == hv00Var.f95519c;
    }

    public final int hashCode() {
        int iHashCode = this.f95517a.hashCode() * 31;
        String str = this.f95518b;
        return Boolean.hashCode(this.f95519c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
