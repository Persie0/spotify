package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bpv {

    /* JADX INFO: renamed from: a */
    public final String f29608a;

    /* JADX INFO: renamed from: b */
    public final jpv f29609b;

    /* JADX INFO: renamed from: c */
    public final boolean f29610c;

    /* JADX INFO: renamed from: d */
    public final jev f29611d;

    /* JADX INFO: renamed from: e */
    public final boolean f29612e;

    /* JADX INFO: renamed from: f */
    public final g5s0 f29613f;

    /* JADX INFO: renamed from: g */
    public final String f29614g;

    /* JADX INFO: renamed from: h */
    public final boolean f29615h;

    public bpv(String str, jpv jpvVar, boolean z, jev jevVar, boolean z2, g5s0 g5s0Var, String str2, boolean z3) {
        this.f29608a = str;
        this.f29609b = jpvVar;
        this.f29610c = z;
        this.f29611d = jevVar;
        this.f29612e = z2;
        this.f29613f = g5s0Var;
        this.f29614g = str2;
        this.f29615h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpv)) {
            return false;
        }
        bpv bpvVar = (bpv) obj;
        return wj50.m88271j(this.f29608a, bpvVar.f29608a) && wj50.m88271j(this.f29609b, bpvVar.f29609b) && this.f29610c == bpvVar.f29610c && this.f29611d == bpvVar.f29611d && this.f29612e == bpvVar.f29612e && wj50.m88271j(this.f29613f, bpvVar.f29613f) && wj50.m88271j(this.f29614g, bpvVar.f29614g) && this.f29615h == bpvVar.f29615h;
    }

    public final int hashCode() {
        int iHashCode = (this.f29613f.hashCode() + s571.m77245d((this.f29611d.hashCode() + s571.m77245d((this.f29609b.hashCode() + (this.f29608a.hashCode() * 31)) * 31, 31, this.f29610c)) * 31, 31, this.f29612e)) * 31;
        String str = this.f29614g;
        return Boolean.hashCode(this.f29615h) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
