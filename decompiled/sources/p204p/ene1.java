package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class ene1 implements pxf {

    /* JADX INFO: renamed from: a */
    public final dne1 f61149a;

    /* JADX INFO: renamed from: b */
    public final qe70 f61150b;

    /* JADX WARN: Multi-variable type inference failed */
    public ene1(dne1 dne1Var, gh00 gh00Var) {
        this.f61149a = dne1Var;
        this.f61150b = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    @Override // p204p.pxf
    /* JADX INFO: renamed from: f */
    public final void mo36190f(nxf nxfVar) {
        zle1 zle1Var = (zle1) nxfVar.f159462d;
        if (zle1Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        this.f61150b.invoke(zle1Var);
        String str = ((ame1) nxfVar.f159461c).f17126a;
        this.f61149a.mo29958a(nxfVar.f159460b, str);
    }

    @Override // p204p.pxf
    /* JADX INFO: renamed from: i */
    public final void mo39493i(oxf oxfVar) {
        super.mo39493i(oxfVar);
        String str = ((ame1) oxfVar.f170974c).f17126a;
        this.f61149a.mo29961e(oxfVar.f170973b, str);
    }
}
