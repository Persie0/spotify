package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bm2 {

    /* JADX INFO: renamed from: a */
    public final ae50 f28357a;

    /* JADX INFO: renamed from: b */
    public final ae50 f28358b;

    public bm2(ae50 ae50Var, ae50 ae50Var2) {
        this.f28357a = ae50Var;
        this.f28358b = ae50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2)) {
            return false;
        }
        bm2 bm2Var = (bm2) obj;
        return this.f28357a.equals(bm2Var.f28357a) && this.f28358b.equals(bm2Var.f28358b);
    }

    public final int hashCode() {
        return this.f28358b.hashCode() + (this.f28357a.hashCode() * 31);
    }
}
