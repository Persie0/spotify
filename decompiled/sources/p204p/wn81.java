package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wn81 {

    /* JADX INFO: renamed from: a */
    public final String f253113a;

    /* JADX INFO: renamed from: b */
    public final boolean f253114b;

    /* JADX INFO: renamed from: c */
    public final akv f253115c;

    /* JADX INFO: renamed from: d */
    public final iut0 f253116d;

    public wn81(String str, boolean z, akv akvVar, iut0 iut0Var) {
        this.f253113a = str;
        this.f253114b = z;
        this.f253115c = akvVar;
        this.f253116d = iut0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn81)) {
            return false;
        }
        wn81 wn81Var = (wn81) obj;
        return wj50.m88271j(this.f253113a, wn81Var.f253113a) && this.f253114b == wn81Var.f253114b && wj50.m88271j(this.f253115c, wn81Var.f253115c) && wj50.m88271j(this.f253116d, wn81Var.f253116d);
    }

    public final int hashCode() {
        return this.f253116d.hashCode() + ((this.f253115c.hashCode() + s571.m77245d(this.f253113a.hashCode() * 31, 31, this.f253114b)) * 31);
    }
}
