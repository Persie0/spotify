package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class emc {

    /* JADX INFO: renamed from: a */
    public final boolean f60871a;

    /* JADX INFO: renamed from: b */
    public final boolean f60872b;

    /* JADX INFO: renamed from: c */
    public final boolean f60873c;

    /* JADX INFO: renamed from: d */
    public final String f60874d;

    /* JADX INFO: renamed from: e */
    public final int f60875e;

    /* JADX INFO: renamed from: f */
    public final int f60876f;

    /* JADX INFO: renamed from: g */
    public final int f60877g;

    public emc(boolean z, boolean z2, boolean z3, String str, int i, int i2, int i3) {
        this.f60871a = z;
        this.f60872b = z2;
        this.f60873c = z3;
        this.f60874d = str;
        this.f60875e = i;
        this.f60876f = i2;
        this.f60877g = i3;
    }

    /* JADX INFO: renamed from: a */
    public static emc m39411a(emc emcVar, boolean z) {
        boolean z2 = emcVar.f60871a;
        boolean z3 = emcVar.f60873c;
        String str = emcVar.f60874d;
        int i = emcVar.f60875e;
        int i2 = emcVar.f60876f;
        int i3 = emcVar.f60877g;
        emcVar.getClass();
        return new emc(z2, z, z3, str, i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc)) {
            return false;
        }
        emc emcVar = (emc) obj;
        return this.f60871a == emcVar.f60871a && this.f60872b == emcVar.f60872b && this.f60873c == emcVar.f60873c && wj50.m88271j(this.f60874d, emcVar.f60874d) && this.f60875e == emcVar.f60875e && this.f60876f == emcVar.f60876f && this.f60877g == emcVar.f60877g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f60877g) + mt60.m62800g(this.f60876f, mt60.m62800g(this.f60875e, s571.m77243b(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f60871a) * 31, 31, this.f60872b), 31, this.f60873c), 31, this.f60874d), 31), 31);
    }
}
