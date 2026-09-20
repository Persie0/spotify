package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n3m0 extends rqo implements m3m0 {

    /* JADX INFO: renamed from: f */
    public final y400 f150085f;

    /* JADX INFO: renamed from: g */
    public final String f150086g;

    /* JADX WARN: Illegal instructions before constructor call */
    public n3m0(mxh0 mxh0Var, y400 y400Var) {
        k25 k25Var = e370.f55667h;
        z400 z400Var = y400Var.f269048a;
        super(mxh0Var, k25Var, z400Var.m95303c() ? z400.f279079e : z400Var.m95306g(), du31.f52959o0);
        this.f150085f = y400Var;
        this.f150086g = "package " + y400Var + " of " + mxh0Var;
    }

    /* JADX INFO: renamed from: H1 */
    public final mxh0 m63635H1() {
        return (mxh0) super.mo27379o();
    }

    @Override // p204p.rqo, p204p.qqo
    public du31 getSource() {
        return du31.f52959o0;
    }

    @Override // p204p.rqo, p204p.oqo
    /* JADX INFO: renamed from: o */
    public final oqo mo27379o() {
        return (mxh0) super.mo27379o();
    }

    @Override // p204p.pqo, p204p.AbstractC1806e9
    public String toString() {
        return this.f150086g;
    }

    @Override // p204p.oqo
    /* JADX INFO: renamed from: y */
    public final Object mo27381y(sqo sqoVar, Object obj) {
        return sqoVar.mo28189m(this, obj);
    }
}
