package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wq01 {

    /* JADX INFO: renamed from: a */
    public final sq01 f253875a;

    /* JADX INFO: renamed from: b */
    public final ybv f253876b;

    public wq01(sq01 sq01Var, ybv ybvVar) {
        this.f253875a = sq01Var;
        this.f253876b = ybvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq01)) {
            return false;
        }
        wq01 wq01Var = (wq01) obj;
        return wj50.m88271j(this.f253875a, wq01Var.f253875a) && wj50.m88271j(this.f253876b, wq01Var.f253876b);
    }

    public final int hashCode() {
        return this.f253876b.hashCode() + (this.f253875a.hashCode() * 31);
    }
}
