package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fc40 implements vwf, dq70 {

    /* JADX INFO: renamed from: a */
    public final e340 f68000a;

    /* JADX INFO: renamed from: b */
    public final cq70 f68001b;

    public fc40(e340 e340Var) {
        cq70 cq70Var = new cq70(false);
        this.f68000a = e340Var;
        this.f68001b = cq70Var;
    }

    @Override // p204p.dq70
    /* JADX INFO: renamed from: a */
    public final cq70 mo36628a() {
        return this.f68001b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc40)) {
            return false;
        }
        fc40 fc40Var = (fc40) obj;
        return wj50.m88271j(this.f68000a, fc40Var.f68000a) && wj50.m88271j(this.f68001b, fc40Var.f68001b);
    }

    public final int hashCode() {
        return this.f68001b.hashCode() + (this.f68000a.hashCode() * 31);
    }
}
