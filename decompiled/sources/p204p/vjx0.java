package p204p;

import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class vjx0 implements er91, bgo {

    /* JADX INFO: renamed from: a */
    public final bjh f242080a;

    /* JADX INFO: renamed from: b */
    public final ago f242081b;

    /* JADX INFO: renamed from: c */
    public final c9k f242082c;

    /* JADX INFO: renamed from: d */
    public final it9 f242083d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f242084e;

    /* JADX INFO: renamed from: f */
    public final ar91 f242085f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f242086g;

    /* JADX INFO: renamed from: h */
    public final gbc0 f242087h;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection] */
    public vjx0(xuk xukVar, fyf fyfVar, bjh bjhVar, ago agoVar) {
        this.f242080a = bjhVar;
        this.f242081b = agoVar;
        c9k c9kVarM56661c = kk40.m56661c(xukVar.mo31960M().mo26608y(new uf60((tf60) xukVar.mo31960M().mo26595B(gk40.f80712X0))));
        this.f242082c = c9kVarM56661c;
        it9 it9Var = new it9(28);
        this.f242083d = it9Var;
        fbk fbkVar = null;
        gph gphVar = new gph(null, 3);
        zv41 zv41VarM52819d = jag1.m52819d(new lyj(gphVar));
        wgv0 wgv0Var = new wgv0(c9kVarM56661c.f35578a);
        msh mshVar = new msh(wgv0Var, new jph(gphVar));
        mshVar.m62743A(new fyf(new z1i(agoVar, it9Var, fyfVar, 6), true, 1077321724));
        x0h1.m89578u(c9kVarM56661c, null, 0, new qri(wgv0Var, mshVar, fbkVar, 6), 3);
        bxb bxbVar = new bxb(c9kVarM56661c, zv41VarM52819d, gphVar, 28);
        Object obj = b9m.f24975b;
        mshVar = obj.equals(obj) ? mshVar : null;
        if (mshVar != null) {
            synchronized (mshVar.f146794d) {
                C1668ai c1668ai = mshVar.f146784R0;
                c1668ai.f15840c = bxbVar;
                c1668ai.f15839b = true;
            }
        }
        ubj ubjVar = ubj.f228797e;
        synchronized (ua31.f228351c) {
            ua31.f228357i = g6f.m43701O0(ubjVar, ua31.f228357i);
        }
        ua31.m82665a();
        qlg1.m73186B(c9kVarM56661c.f35578a).mo26599N(new q7i(9, new na31(ubjVar, 0), wgv0Var));
        nuu0 nuu0VarM31021m = bzf1.m31021m(zv41VarM52819d);
        this.f242084e = nuu0VarM31021m;
        this.f242087h = new gbc0(agoVar, null);
        if (!wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalArgumentException("RootContentHost must be created on the Main thread.");
        }
        x0h1.m89578u(c9kVarM56661c, null, 0, new ujx0(this, fbkVar, 0), 3);
        agoVar.m25870g(this);
        ArrayList arrayList = new ArrayList();
        iph iphVar = ((lyj) nuu0VarM31021m.f158717a.getValue()).f138071b;
        if ((iphVar instanceof gph ? (gph) iphVar : null) == null) {
            throw new IllegalStateException("ContentDSL shouldn't produce top level item.");
        }
        gph gphVar2 = (gph) iphVar;
        ar91 ar91VarM49327I = i091.m49327I(new esh(gphVar2), gphVar2.f83195e, arrayList);
        this.f242085f = ar91VarM49327I;
        this.f242086g = arrayList;
        ((cfe1) ar91VarM49327I).mo26927i(this);
        x0h1.m89578u(c9kVarM56661c, null, 0, new ujx0(this, fbkVar, 1), 3);
        x0h1.m89578u(c9kVarM56661c, null, 0, new ujx0(this, fbkVar, 2), 3);
    }

    @Override // p204p.bgo
    /* JADX INFO: renamed from: b */
    public final void mo29144b() {
        vum0 vum0Var = (vum0) this.f242083d.f105467b;
        vum0Var.m86438w(vum0Var.m86437v() + 1);
        this.f242085f.mo26926h();
        m85793c();
    }

    /* JADX INFO: renamed from: c */
    public final void m85793c() {
        bjh bjhVar = this.f242080a;
        zv41 zv41Var = bjhVar.f27699a;
        int i = bjhVar.f27700b + 1;
        bjhVar.f27700b = i;
        fr91 fr91Var = new fr91(i, this.f242085f);
        zv41Var.getClass();
        zv41Var.m97091m(null, fr91Var);
    }

    @Override // p204p.er91
    /* JADX INFO: renamed from: d */
    public final void mo30845d(ar91 ar91Var) {
    }
}
