package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f8f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f66968a;

    /* JADX INFO: renamed from: b */
    public final boolean f66969b;

    /* JADX INFO: renamed from: c */
    public final boolean f66970c;

    /* JADX INFO: renamed from: d */
    public final boolean f66971d;

    /* JADX INFO: renamed from: e */
    public final String f66972e;

    /* JADX INFO: renamed from: f */
    public final boolean f66973f;

    /* JADX INFO: renamed from: g */
    public final fiz f66974g;

    public f8f0(boolean z, boolean z2, String str, fiz fizVar, int i) {
        z = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        z2 = (i & 4) != 0 ? true : z2;
        boolean z4 = (i & 8) == 0;
        str = (i & 16) != 0 ? null : str;
        boolean z5 = (i & 32) == 0;
        fizVar = (i & 64) != 0 ? null : fizVar;
        this.f66968a = z;
        this.f66969b = z3;
        this.f66970c = z2;
        this.f66971d = z4;
        this.f66972e = str;
        this.f66973f = z5;
        this.f66974g = fizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8f0)) {
            return false;
        }
        f8f0 f8f0Var = (f8f0) obj;
        return this.f66968a == f8f0Var.f66968a && this.f66969b == f8f0Var.f66969b && this.f66970c == f8f0Var.f66970c && this.f66971d == f8f0Var.f66971d && wj50.m88271j(this.f66972e, f8f0Var.f66972e) && this.f66973f == f8f0Var.f66973f && wj50.m88271j(this.f66974g, f8f0Var.f66974g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f66968a) * 31, 31, this.f66969b), 31, this.f66970c), 31, this.f66971d);
        String str = this.f66972e;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f66973f);
        fiz fizVar = this.f66974g;
        return iM77245d2 + (fizVar != null ? fizVar.hashCode() : 0);
    }
}
