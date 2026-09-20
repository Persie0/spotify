package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class de80 {

    /* JADX INFO: renamed from: a */
    public final String f48005a;

    /* JADX INFO: renamed from: b */
    public final boolean f48006b;

    /* JADX INFO: renamed from: c */
    public final int f48007c;

    /* JADX INFO: renamed from: d */
    public final z2l0 f48008d;

    public de80(String str, boolean z, int i, z2l0 z2l0Var) {
        this.f48005a = str;
        this.f48006b = z;
        this.f48007c = i;
        this.f48008d = z2l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de80)) {
            return false;
        }
        de80 de80Var = (de80) obj;
        return wj50.m88271j(this.f48005a, de80Var.f48005a) && this.f48006b == de80Var.f48006b && this.f48007c == de80Var.f48007c && this.f48008d.equals(de80Var.f48008d);
    }

    public final int hashCode() {
        return this.f48008d.hashCode() + f710.m40938f(this.f48007c, s571.m77245d(this.f48005a.hashCode() * 31, 31, this.f48006b), 31);
    }
}
