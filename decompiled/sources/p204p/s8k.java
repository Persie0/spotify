package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s8k {

    /* JADX INFO: renamed from: a */
    public final String f206671a;

    /* JADX INFO: renamed from: b */
    public final String f206672b;

    /* JADX INFO: renamed from: c */
    public final boolean f206673c;

    /* JADX INFO: renamed from: d */
    public final boolean f206674d;

    public s8k(String str, boolean z, String str2, boolean z2) {
        this.f206671a = str;
        this.f206672b = str2;
        this.f206673c = z;
        this.f206674d = z2;
    }

    /* JADX INFO: renamed from: a */
    public final String m77517a() {
        return this.f206671a;
    }

    /* JADX INFO: renamed from: b */
    public final String m77518b() {
        return this.f206672b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m77519c() {
        return this.f206674d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8k)) {
            return false;
        }
        s8k s8kVar = (s8k) obj;
        return wj50.m88271j(this.f206671a, s8kVar.f206671a) && wj50.m88271j(this.f206672b, s8kVar.f206672b) && this.f206673c == s8kVar.f206673c && this.f206674d == s8kVar.f206674d;
    }

    public final int hashCode() {
        String str = this.f206671a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f206672b;
        return Boolean.hashCode(this.f206674d) + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f206673c);
    }
}
