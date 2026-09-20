package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jhi0 {

    /* JADX INFO: renamed from: a */
    public final clt0 f112479a;

    /* JADX INFO: renamed from: b */
    public final boolean f112480b;

    /* JADX INFO: renamed from: c */
    public final boolean f112481c;

    /* JADX INFO: renamed from: d */
    public final eh00 f112482d;

    public jhi0(clt0 clt0Var, boolean z, boolean z2, eh00 eh00Var) {
        this.f112479a = clt0Var;
        this.f112480b = z;
        this.f112481c = z2;
        this.f112482d = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhi0)) {
            return false;
        }
        jhi0 jhi0Var = (jhi0) obj;
        return wj50.m88271j(this.f112479a, jhi0Var.f112479a) && this.f112480b == jhi0Var.f112480b && this.f112481c == jhi0Var.f112481c && wj50.m88271j(this.f112482d, jhi0Var.f112482d);
    }

    public final int hashCode() {
        return this.f112482d.hashCode() + s571.m77245d(s571.m77245d(this.f112479a.hashCode() * 31, 31, this.f112480b), 31, this.f112481c);
    }
}
