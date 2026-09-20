package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wn90 {

    /* JADX INFO: renamed from: a */
    public final boolean f253121a;

    /* JADX INFO: renamed from: b */
    public final String f253122b;

    /* JADX INFO: renamed from: c */
    public final ln90 f253123c;

    /* JADX INFO: renamed from: d */
    public final ln90 f253124d;

    public wn90(boolean z, String str, ln90 ln90Var, ln90 ln90Var2) {
        this.f253121a = z;
        this.f253122b = str;
        this.f253123c = ln90Var;
        this.f253124d = ln90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn90)) {
            return false;
        }
        wn90 wn90Var = (wn90) obj;
        return this.f253121a == wn90Var.f253121a && wj50.m88271j(this.f253122b, wn90Var.f253122b) && this.f253123c.equals(wn90Var.f253123c) && this.f253124d.equals(wn90Var.f253124d);
    }

    public final int hashCode() {
        return this.f253124d.hashCode() + ((this.f253123c.hashCode() + s571.m77243b(Boolean.hashCode(this.f253121a) * 31, 31, this.f253122b)) * 31);
    }
}
