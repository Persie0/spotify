package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class uph implements qgv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ msh f232691a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q2i0 f232692b;

    public uph(msh mshVar, q2i0 q2i0Var) {
        this.f232691a = mshVar;
        this.f232692b = q2i0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    @Override // p204p.qgv0
    /* JADX INFO: renamed from: c */
    public final int mo62746c(pgv0 pgv0Var, Object obj) {
        int iMo62746c;
        msh mshVar = this.f232691a;
        msh mshVar2 = mshVar instanceof qgv0 ? mshVar : null;
        if (mshVar2 == null || (iMo62746c = mshVar2.mo62746c(pgv0Var, obj)) == 0) {
            iMo62746c = 1;
        }
        if (iMo62746c != 1) {
            return iMo62746c;
        }
        q2i0 q2i0Var = this.f232692b;
        q2i0Var.f184648f = g6f.m43701O0(new pqm0(pgv0Var, obj), q2i0Var.f184648f);
        return 2;
    }

    @Override // p204p.qgv0
    /* JADX INFO: renamed from: a */
    public final void mo62744a() {
    }

    @Override // p204p.qgv0
    /* JADX INFO: renamed from: b */
    public final void mo62745b(Object obj) {
    }
}
