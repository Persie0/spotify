package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fv20 implements gv20 {

    /* JADX INFO: renamed from: a */
    public final c96 f73621a;

    /* JADX INFO: renamed from: b */
    public final c96 f73622b;

    /* JADX INFO: renamed from: c */
    public final c96 f73623c;

    public fv20(c96 c96Var, c96 c96Var2, c96 c96Var3) {
        this.f73621a = c96Var;
        this.f73622b = c96Var2;
        this.f73623c = c96Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv20)) {
            return false;
        }
        fv20 fv20Var = (fv20) obj;
        return wj50.m88271j(this.f73621a, fv20Var.f73621a) && wj50.m88271j(this.f73622b, fv20Var.f73622b) && wj50.m88271j(this.f73623c, fv20Var.f73623c);
    }

    public final int hashCode() {
        return this.f73623c.hashCode() + ((this.f73622b.hashCode() + (this.f73621a.hashCode() * 31)) * 31);
    }
}
