package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: classes6.dex */
public abstract class snh0 {

    /* JADX INFO: renamed from: a */
    public final luk f210936a;

    /* JADX INFO: renamed from: b */
    public final luk f210937b;

    /* JADX INFO: renamed from: c */
    public final nuu0 f210938c;

    /* JADX INFO: renamed from: d */
    public final nuu0 f210939d;

    public snh0(Update update, Connectable connectable, Object obj, Connectable connectable2, luk lukVar, luk lukVar2, xuk xukVar) {
        this.f210936a = lukVar;
        this.f210937b = lukVar2;
        MobiusLoop.Builder builderM15582d = Mobius.m15582d(update, connectable);
        MobiusLoop mobiusLoopMo15595g = (connectable2 != null ? builderM15582d.mo15597i(connectable2) : builderM15582d).mo15592d(new mj70(this, 24)).mo15590b(new pj70(this, 25)).mo15595g(obj);
        fbk fbkVar = null;
        nuu0 nuu0VarM31029u = bzf1.m31029u(new nzx0(new gdp(mobiusLoopMo15595g, fbkVar, 2)), xukVar, hf11.f90581a, mobiusLoopMo15595g);
        this.f210938c = nuu0VarM31029u;
        this.f210939d = bzf1.m31029u(xtm0.m92074U(nuu0VarM31029u, new zv3(3, 10, fbkVar)), xukVar, hf11.m47320a(3, 0L), obj);
    }

    /* JADX INFO: renamed from: a */
    public final xv41 m78555a() {
        return this.f210939d;
    }
}
