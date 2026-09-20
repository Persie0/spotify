package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class g1e {

    /* JADX INFO: renamed from: a */
    public final xp10 f75596a;

    /* JADX INFO: renamed from: b */
    public final zom f75597b;

    /* JADX INFO: renamed from: c */
    public final apm f75598c;

    /* JADX INFO: renamed from: d */
    public final bpm f75599d;

    /* JADX INFO: renamed from: e */
    public final cpm f75600e;

    /* JADX INFO: renamed from: f */
    public final dpm f75601f;

    /* JADX INFO: renamed from: g */
    public final epm f75602g;

    public g1e(xp10 xp10Var, zom zomVar, apm apmVar, bpm bpmVar, cpm cpmVar, dpm dpmVar, epm epmVar) {
        this.f75596a = xp10Var;
        this.f75597b = zomVar;
        this.f75598c = apmVar;
        this.f75599d = bpmVar;
        this.f75600e = cpmVar;
        this.f75601f = dpmVar;
        this.f75602g = epmVar;
    }

    /* JADX INFO: renamed from: c */
    public static toh m43352c(g1e g1eVar, zf0 zf0Var, vbu0 vbu0Var, m500 m500Var, e1e e1eVar, hc80 hc80Var) {
        g1eVar.getClass();
        return g1eVar.m43354b(m500Var, new egb1(zf0Var, 3), vbu0Var, m500Var, e1eVar, true, hc80Var);
    }

    /* JADX INFO: renamed from: a */
    public final f1e m43353a(Context context, rmm0 rmm0Var, k1e k1eVar, e1e e1eVar, boolean z) {
        m500 m500Var;
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                m500Var = null;
                break;
            }
            if (baseContext instanceof m500) {
                m500Var = (m500) baseContext;
                break;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        m500 m500Var2 = m500Var;
        wj50.m88279p(m500Var2);
        k5k0 k5k0Var = new k5k0(rmm0Var);
        return new f1e(m43354b(context, k5k0Var, k1eVar, m500Var2, e1eVar, z, rmm0Var.mo29873e()), k5k0Var);
    }

    /* JADX INFO: renamed from: b */
    public final toh m43354b(Context context, jg0 jg0Var, k1e k1eVar, m500 m500Var, e1e e1eVar, boolean z, hc80 hc80Var) {
        cf0 cf0Var = new cf0(m500Var);
        son sonVar = this.f75596a.f264407a.f82746a.f201303a;
        gae gaeVar = new gae(new qq8((hae) sonVar.f211400Gk.get(), 13), new bxb(jg0Var, k1eVar, e1eVar, (hae) sonVar.f211400Gk.get()));
        this.f75597b.getClass();
        gae gaeVar2 = new gae(new ti5(3), new jsa(k1eVar, 10));
        c700 c700VarMo15683g0 = m500Var.mo15683g0();
        tm4 tm4Var = new tm4(16);
        hpm hpmVar = (hpm) this.f75598c.f17983a.f210441c;
        gae gaeVar3 = new gae(tm4Var, new etz(context, hc80Var, c700VarMo15683g0, k1eVar, (kv91) ((i4t0) hpmVar.f93803a.f286293L0).get(), (k101) hpmVar.f93805c.get()));
        this.f75600e.getClass();
        gae gaeVar4 = new gae(new lwx(), new g2q(28, cf0Var, k1eVar));
        hpm hpmVar2 = (hpm) this.f75601f.f51369a.f210441c;
        hpmVar2.getClass();
        gae gaeVar5 = new gae(new b1y(new av4(false, hpmVar2.f93803a.m96984o())), new yho((jyx0) ((i4t0) hpmVar2.f93803a.f286297Z).get(), cf0Var, k1eVar, hc80Var, context));
        hpm hpmVar3 = (hpm) this.f75602g.f61673a.f210441c;
        hpmVar3.getClass();
        ArrayList arrayListM46717N = h6f.m46717N(gaeVar, gaeVar2, gaeVar3, gaeVar4, gaeVar5, new gae(new ezk0(new hkq0(hpmVar3.f93803a.m96986s()), 20), new m8p0(jg0Var, k1eVar, e1eVar)));
        if (z) {
            ch10 ch10Var = new ch10(m500Var);
            this.f75599d.getClass();
            arrayListM46717N.add(new gae(new kwx(), new tgq(25, cf0Var, ch10Var)));
        }
        return new toh(arrayListM46717N);
    }
}
