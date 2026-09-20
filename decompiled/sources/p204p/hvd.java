package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hvd {

    /* JADX INFO: renamed from: a */
    public final wc61 f95658a;

    /* JADX INFO: renamed from: b */
    public final wc61 f95659b;

    public hvd(wc61 wc61Var, wc61 wc61Var2) {
        this.f95658a = wc61Var;
        this.f95659b = wc61Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvd)) {
            return false;
        }
        hvd hvdVar = (hvd) obj;
        return wj50.m88271j(this.f95658a, hvdVar.f95658a) && wj50.m88271j(this.f95659b, hvdVar.f95659b);
    }

    public final int hashCode() {
        wc61 wc61Var = this.f95658a;
        int iHashCode = (wc61Var == null ? 0 : wc61Var.hashCode()) * 31;
        wc61 wc61Var2 = this.f95659b;
        return iHashCode + (wc61Var2 != null ? wc61Var2.hashCode() : 0);
    }
}
