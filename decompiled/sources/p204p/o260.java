package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o260 implements p260 {

    /* JADX INFO: renamed from: a */
    public final String f160948a;

    /* JADX INFO: renamed from: b */
    public final String f160949b;

    /* JADX INFO: renamed from: c */
    public final String f160950c;

    /* JADX INFO: renamed from: d */
    public final boolean f160951d;

    /* JADX INFO: renamed from: e */
    public final boolean f160952e;

    /* JADX INFO: renamed from: f */
    public final boolean f160953f;

    /* JADX INFO: renamed from: g */
    public final String f160954g;

    /* JADX INFO: renamed from: h */
    public final boolean f160955h;

    public o260(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4) {
        this.f160948a = str;
        this.f160949b = str2;
        this.f160950c = str3;
        this.f160951d = z;
        this.f160952e = z2;
        this.f160953f = z3;
        this.f160954g = str4;
        this.f160955h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o260)) {
            return false;
        }
        o260 o260Var = (o260) obj;
        return wj50.m88271j(this.f160948a, o260Var.f160948a) && wj50.m88271j(this.f160949b, o260Var.f160949b) && wj50.m88271j(this.f160950c, o260Var.f160950c) && this.f160951d == o260Var.f160951d && this.f160952e == o260Var.f160952e && this.f160953f == o260Var.f160953f && wj50.m88271j(this.f160954g, o260Var.f160954g) && this.f160955h == o260Var.f160955h;
    }

    public final int hashCode() {
        int iHashCode = this.f160948a.hashCode() * 31;
        String str = this.f160949b;
        return Boolean.hashCode(this.f160955h) + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f160950c), 31, this.f160951d), 31, this.f160952e), 31, this.f160953f), 31, this.f160954g);
    }
}
