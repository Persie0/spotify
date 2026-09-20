package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class syc implements uyc {

    /* JADX INFO: renamed from: a */
    public final String f215211a;

    /* JADX INFO: renamed from: b */
    public final String f215212b;

    /* JADX INFO: renamed from: c */
    public final String f215213c;

    /* JADX INFO: renamed from: d */
    public final boolean f215214d;

    public /* synthetic */ syc(String str) {
        this(str, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syc)) {
            return false;
        }
        syc sycVar = (syc) obj;
        return wj50.m88271j(this.f215211a, sycVar.f215211a) && wj50.m88271j(this.f215212b, sycVar.f215212b) && wj50.m88271j(this.f215213c, sycVar.f215213c) && this.f215214d == sycVar.f215214d;
    }

    public final int hashCode() {
        int iHashCode = this.f215211a.hashCode() * 31;
        String str = this.f215212b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215213c;
        return Boolean.hashCode(this.f215214d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public syc(String str, String str2, String str3, boolean z) {
        this.f215211a = str;
        this.f215212b = str2;
        this.f215213c = str3;
        this.f215214d = z;
    }
}
