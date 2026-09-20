package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wjo0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f251992a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f251993b;

    /* JADX INFO: renamed from: c */
    public final o4x f251994c;

    public wjo0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar) {
        this.f251992a = otd0Var;
        this.f251993b = ibp0Var;
        this.f251994c = o4xVar;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m88346a() {
        return this.f251994c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m88347b() {
        return this.f251992a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m88348c() {
        return this.f251993b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjo0)) {
            return false;
        }
        wjo0 wjo0Var = (wjo0) obj;
        return wj50.m88271j(this.f251992a, wjo0Var.f251992a) && wj50.m88271j(this.f251993b, wjo0Var.f251993b) && wj50.m88271j(this.f251994c, wjo0Var.f251994c);
    }

    public final int hashCode() {
        return this.f251994c.hashCode() + ((this.f251993b.hashCode() + (this.f251992a.hashCode() * 31)) * 31);
    }
}
