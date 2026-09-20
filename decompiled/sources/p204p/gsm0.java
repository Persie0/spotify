package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gsm0 implements hsm0 {

    /* JADX INFO: renamed from: a */
    public final bsm0 f83986a;

    /* JADX INFO: renamed from: b */
    public final esm0 f83987b;

    /* JADX INFO: renamed from: c */
    public final pl80 f83988c;

    /* JADX INFO: renamed from: d */
    public final urm0 f83989d;

    /* JADX INFO: renamed from: e */
    public final float f83990e;

    public gsm0(bsm0 bsm0Var, esm0 esm0Var, pl80 pl80Var, urm0 urm0Var, float f, int i) {
        bsm0Var = (i & 1) != 0 ? new bsm0() : bsm0Var;
        esm0Var = (i & 2) != 0 ? csm0.f41656a : esm0Var;
        pl80Var = (i & 4) != 0 ? nl80.f155023a : pl80Var;
        urm0Var = (i & 8) != 0 ? new urm0() : urm0Var;
        f = (i & 32) != 0 ? 0.0f : f;
        this.f83986a = bsm0Var;
        this.f83987b = esm0Var;
        this.f83988c = pl80Var;
        this.f83989d = urm0Var;
        this.f83990e = f;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: a */
    public final esm0 mo42565a() {
        return this.f83987b;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: b */
    public final urm0 mo42566b() {
        return this.f83989d;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: c */
    public final pl80 mo42567c() {
        return this.f83988c;
    }

    @Override // p204p.hsm0
    /* JADX INFO: renamed from: d */
    public final bsm0 mo42568d() {
        return this.f83986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsm0)) {
            return false;
        }
        gsm0 gsm0Var = (gsm0) obj;
        return wj50.m88271j(this.f83986a, gsm0Var.f83986a) && wj50.m88271j(this.f83987b, gsm0Var.f83987b) && wj50.m88271j(this.f83988c, gsm0Var.f83988c) && wj50.m88271j(this.f83989d, gsm0Var.f83989d) && Float.compare(this.f83990e, gsm0Var.f83990e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f83990e) + ((this.f83989d.hashCode() + ((this.f83988c.hashCode() + ((this.f83987b.hashCode() + (this.f83986a.hashCode() * 31)) * 31)) * 31)) * 961);
    }
}
