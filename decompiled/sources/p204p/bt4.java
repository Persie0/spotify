package p204p;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class bt4 implements cyh0 {

    /* JADX INFO: renamed from: a */
    public final Choreographer f30508a;

    public bt4(Choreographer choreographer) {
        this.f30508a = choreographer;
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: B */
    public final huk mo26595B(iuk iukVar) {
        return xuf1.m92168g(this, iukVar);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: D */
    public final juk mo26596D(iuk iukVar) {
        return xuf1.m92175n(this, iukVar);
    }

    @Override // p204p.cyh0
    /* JADX INFO: renamed from: K */
    public final Object mo30456K(fbk fbkVar, gh00 gh00Var) {
        huk hukVarMo26595B = fbkVar.getContext().mo26595B(hcp0.f89853L0);
        xs4 xs4Var = hukVarMo26595B instanceof xs4 ? (xs4) hukVarMo26595B : null;
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        zs4 zs4Var = new zs4(hqbVar, this, gh00Var);
        if (xs4Var == null || !xs4Var.f265473c.equals(this.f30508a)) {
            this.f30508a.postFrameCallback(zs4Var);
            hqbVar.mo42415l(new C2405t9(4, this, zs4Var));
        } else {
            synchronized (xs4Var.f265475e) {
                xs4Var.f265477g.add(zs4Var);
                if (!xs4Var.f265480t) {
                    xs4Var.f265480t = true;
                    xs4Var.f265473c.postFrameCallback(xs4Var.f265471X);
                }
            }
            hqbVar.mo42415l(new C2405t9(3, xs4Var, zs4Var));
        }
        return hqbVar.m48221p();
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: o */
    public final Object mo26605o(Object obj, th00 th00Var) {
        return xuf1.m92167f(this, obj, th00Var);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: y */
    public final juk mo26608y(juk jukVar) {
        return xuf1.m92177p(this, jukVar);
    }
}
