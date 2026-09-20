package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ww51 implements ax51 {

    /* JADX INFO: renamed from: a */
    public final uw51 f255703a;

    /* JADX INFO: renamed from: b */
    public final yw51 f255704b;

    public ww51(uw51 uw51Var, yw51 yw51Var) {
        this.f255703a = uw51Var;
        this.f255704b = yw51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww51)) {
            return false;
        }
        ww51 ww51Var = (ww51) obj;
        return wj50.m88271j(this.f255703a, ww51Var.f255703a) && wj50.m88271j(this.f255704b, ww51Var.f255704b);
    }

    public final int hashCode() {
        return this.f255704b.hashCode() + (this.f255703a.hashCode() * 31);
    }
}
