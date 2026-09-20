package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jso0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final rj80 f115525a;

    /* JADX INFO: renamed from: b */
    public final tj80 f115526b;

    public jso0(rj80 rj80Var, tj80 tj80Var) {
        this.f115525a = rj80Var;
        this.f115526b = tj80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jso0)) {
            return false;
        }
        jso0 jso0Var = (jso0) obj;
        return wj50.m88271j(this.f115525a, jso0Var.f115525a) && wj50.m88271j(this.f115526b, jso0Var.f115526b);
    }

    public final int hashCode() {
        return this.f115526b.f220848a.hashCode() + (this.f115525a.hashCode() * 31);
    }
}
