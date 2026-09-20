package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f3n0 {

    /* JADX INFO: renamed from: a */
    public final String f65536a;

    /* JADX INFO: renamed from: b */
    public final String f65537b;

    /* JADX INFO: renamed from: c */
    public final boolean f65538c;

    /* JADX INFO: renamed from: d */
    public final String f65539d;

    /* JADX INFO: renamed from: e */
    public final sm50 f65540e;

    /* JADX INFO: renamed from: f */
    public final String f65541f;

    /* JADX INFO: renamed from: g */
    public final boolean f65542g;

    /* JADX INFO: renamed from: h */
    public final boolean f65543h;

    /* JADX INFO: renamed from: i */
    public final boolean f65544i;

    public f3n0(String str, String str2, boolean z, String str3, sm50 sm50Var, String str4, boolean z2, boolean z3, boolean z4) {
        this.f65536a = str;
        this.f65537b = str2;
        this.f65538c = z;
        this.f65539d = str3;
        this.f65540e = sm50Var;
        this.f65541f = str4;
        this.f65542g = z2;
        this.f65543h = z3;
        this.f65544i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3n0)) {
            return false;
        }
        f3n0 f3n0Var = (f3n0) obj;
        return wj50.m88271j(this.f65536a, f3n0Var.f65536a) && wj50.m88271j(this.f65537b, f3n0Var.f65537b) && this.f65538c == f3n0Var.f65538c && wj50.m88271j(this.f65539d, f3n0Var.f65539d) && wj50.m88271j(this.f65540e, f3n0Var.f65540e) && wj50.m88271j(this.f65541f, f3n0Var.f65541f) && this.f65542g == f3n0Var.f65542g && this.f65543h == f3n0Var.f65543h && this.f65544i == f3n0Var.f65544i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65544i) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77244c(s571.m77243b(s571.m77245d(s571.m77243b(this.f65536a.hashCode() * 31, 31, this.f65537b), 31, this.f65538c), 31, this.f65539d), 31, this.f65540e.f210567a), 31, this.f65541f), 31, this.f65542g), 31, this.f65543h);
    }
}
