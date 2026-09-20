package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class wzv extends i5j {

    /* JADX INFO: renamed from: b */
    public final vfe f256690b;

    /* JADX INFO: renamed from: c */
    public final qti0 f256691c;

    public wzv(vfe vfeVar, qti0 qti0Var) {
        super(new pqm0(vfeVar, qti0Var));
        this.f256690b = vfeVar;
        this.f256691c = qti0Var;
    }

    @Override // p204p.i5j
    /* JADX INFO: renamed from: a */
    public final gd70 mo26195a(mxh0 mxh0Var) {
        jd21 jd21VarMo27380q;
        vfe vfeVar = this.f256690b;
        nfe nfeVarM65521g = nsf1.m65521g(mxh0Var, vfeVar);
        if (nfeVarM65521g != null) {
            if (!rxq.m76674l(nfeVarM65521g, 3)) {
                nfeVarM65521g = null;
            }
            if (nfeVarM65521g != null && (jd21VarMo27380q = nfeVarM65521g.mo27380q()) != null) {
                return jd21VarMo27380q;
            }
        }
        return ehw.m39006b(chw.ERROR_ENUM_TYPE, vfeVar.toString(), this.f256691c.f192387a);
    }

    @Override // p204p.i5j
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f256690b.m85358f());
        sb.append('.');
        sb.append(this.f256691c);
        return sb.toString();
    }
}
