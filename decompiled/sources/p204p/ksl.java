package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ksl {

    /* JADX INFO: renamed from: a */
    public final String f125971a;

    /* JADX INFO: renamed from: b */
    public final String f125972b;

    /* JADX INFO: renamed from: c */
    public final String f125973c;

    /* JADX INFO: renamed from: d */
    public final int f125974d;

    /* JADX INFO: renamed from: e */
    public final boolean f125975e;

    public ksl(int i, String str, String str2, boolean z, String str3) {
        this.f125971a = str;
        this.f125972b = str2;
        this.f125973c = str3;
        this.f125974d = i;
        this.f125975e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksl)) {
            return false;
        }
        ksl kslVar = (ksl) obj;
        return wj50.m88271j(this.f125971a, kslVar.f125971a) && wj50.m88271j(this.f125972b, kslVar.f125972b) && wj50.m88271j(this.f125973c, kslVar.f125973c) && this.f125974d == kslVar.f125974d && this.f125975e == kslVar.f125975e;
    }

    public final int hashCode() {
        String str = this.f125971a;
        return Boolean.hashCode(this.f125975e) + mt60.m62800g(this.f125974d, s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f125972b), 31, this.f125973c), 31);
    }
}
