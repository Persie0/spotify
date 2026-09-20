package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class b3n0 {

    /* JADX INFO: renamed from: a */
    public final String f23077a;

    /* JADX INFO: renamed from: b */
    public final String f23078b;

    /* JADX INFO: renamed from: c */
    public final String f23079c;

    /* JADX INFO: renamed from: d */
    public final String f23080d;

    /* JADX INFO: renamed from: e */
    public final boolean f23081e;

    /* JADX INFO: renamed from: f */
    public final String f23082f;

    /* JADX INFO: renamed from: g */
    public final boolean f23083g;

    /* JADX INFO: renamed from: h */
    public final boolean f23084h;

    public b3n0(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.f23077a = str;
        this.f23078b = str2;
        this.f23079c = str3;
        this.f23080d = str4;
        this.f23081e = z;
        this.f23082f = str5;
        this.f23083g = z2;
        this.f23084h = z3;
    }

    /* JADX INFO: renamed from: a */
    public final String m28044a() {
        return this.f23078b;
    }

    /* JADX INFO: renamed from: b */
    public final String m28045b() {
        return this.f23077a;
    }

    /* JADX INFO: renamed from: c */
    public final String m28046c() {
        return this.f23079c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28047d() {
        return this.f23083g;
    }

    /* JADX INFO: renamed from: e */
    public final String m28048e() {
        return this.f23082f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3n0)) {
            return false;
        }
        b3n0 b3n0Var = (b3n0) obj;
        return wj50.m88271j(this.f23077a, b3n0Var.f23077a) && wj50.m88271j(this.f23078b, b3n0Var.f23078b) && wj50.m88271j(this.f23079c, b3n0Var.f23079c) && wj50.m88271j(this.f23080d, b3n0Var.f23080d) && this.f23081e == b3n0Var.f23081e && wj50.m88271j(this.f23082f, b3n0Var.f23082f) && this.f23083g == b3n0Var.f23083g && this.f23084h == b3n0Var.f23084h;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m28049f() {
        return this.f23084h;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m28050g() {
        return this.f23081e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f23077a.hashCode() * 31, 31, this.f23078b);
        String str = this.f23079c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23080d;
        return Boolean.hashCode(this.f23084h) + s571.m77245d(s571.m77243b(s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f23081e), 31, this.f23082f), 31, this.f23083g);
    }
}
