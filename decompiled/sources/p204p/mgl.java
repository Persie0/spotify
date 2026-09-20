package p204p;

import android.app.Application;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.C1033x3ae6ae8e;
import com.spotify.mobius.coroutines.C1037x558fa59a;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class mgl {

    /* JADX INFO: renamed from: A */
    public final k47 f143560A;

    /* JADX INFO: renamed from: B */
    public final uiq0 f143561B;

    /* JADX INFO: renamed from: C */
    public final qwx0 f143562C;

    /* JADX INFO: renamed from: D */
    public final ean f143563D;

    /* JADX INFO: renamed from: E */
    public final tqn f143564E;

    /* JADX INFO: renamed from: F */
    public final boolean f143565F;

    /* JADX INFO: renamed from: G */
    public final ron0 f143566G;

    /* JADX INFO: renamed from: H */
    public final u4w0 f143567H;

    /* JADX INFO: renamed from: I */
    public final l4w0 f143568I;

    /* JADX INFO: renamed from: a */
    public final Application f143569a;

    /* JADX INFO: renamed from: b */
    public final ryt f143570b;

    /* JADX INFO: renamed from: c */
    public final lbq0 f143571c;

    /* JADX INFO: renamed from: d */
    public final jyp f143572d;

    /* JADX INFO: renamed from: e */
    public final y0q0 f143573e;

    /* JADX INFO: renamed from: f */
    public final e940 f143574f;

    /* JADX INFO: renamed from: g */
    public final eju f143575g;

    /* JADX INFO: renamed from: h */
    public final wbq f143576h;

    /* JADX INFO: renamed from: i */
    public final xre f143577i;

    /* JADX INFO: renamed from: j */
    public final z9j0 f143578j;

    /* JADX INFO: renamed from: k */
    public final Flowable f143579k;

    /* JADX INFO: renamed from: l */
    public final cxb f143580l;

    /* JADX INFO: renamed from: m */
    public final qqn f143581m;

    /* JADX INFO: renamed from: n */
    public final r1w0 f143582n;

    /* JADX INFO: renamed from: o */
    public final gjs0 f143583o;

    /* JADX INFO: renamed from: p */
    public final gw80 f143584p;

    /* JADX INFO: renamed from: q */
    public final u7y f143585q;

    /* JADX INFO: renamed from: r */
    public final e6a0 f143586r;

    /* JADX INFO: renamed from: s */
    public final luk f143587s;

    /* JADX INFO: renamed from: t */
    public final rqn f143588t;

    /* JADX INFO: renamed from: u */
    public final sqn f143589u;

    /* JADX INFO: renamed from: v */
    public final ia7 f143590v;

    /* JADX INFO: renamed from: w */
    public final aaq0 f143591w;

    /* JADX INFO: renamed from: x */
    public final i4t0 f143592x;

    /* JADX INFO: renamed from: y */
    public final i4t0 f143593y;

    /* JADX INFO: renamed from: z */
    public final boolean f143594z;

    public mgl(Application application, ryt rytVar, lbq0 lbq0Var, jyp jypVar, y0q0 y0q0Var, e940 e940Var, eju ejuVar, wbq wbqVar, xre xreVar, z9j0 z9j0Var, Flowable flowable, cxb cxbVar, qqn qqnVar, r1w0 r1w0Var, gjs0 gjs0Var, gw80 gw80Var, u7y u7yVar, e6a0 e6a0Var, luk lukVar, rqn rqnVar, sqn sqnVar, ia7 ia7Var, aaq0 aaq0Var, vfn vfnVar, vfn vfnVar2, boolean z, k47 k47Var, uiq0 uiq0Var, qwx0 qwx0Var, ean eanVar, tqn tqnVar, boolean z2, ron0 ron0Var, u4w0 u4w0Var, l4w0 l4w0Var) {
        this.f143569a = application;
        this.f143570b = rytVar;
        this.f143571c = lbq0Var;
        this.f143572d = jypVar;
        this.f143573e = y0q0Var;
        this.f143574f = e940Var;
        this.f143575g = ejuVar;
        this.f143576h = wbqVar;
        this.f143577i = xreVar;
        this.f143578j = z9j0Var;
        this.f143579k = flowable;
        this.f143580l = cxbVar;
        this.f143581m = qqnVar;
        this.f143582n = r1w0Var;
        this.f143583o = gjs0Var;
        this.f143584p = gw80Var;
        this.f143585q = u7yVar;
        this.f143586r = e6a0Var;
        this.f143587s = lukVar;
        this.f143588t = rqnVar;
        this.f143589u = sqnVar;
        this.f143590v = ia7Var;
        this.f143591w = aaq0Var;
        this.f143592x = vfnVar;
        this.f143593y = vfnVar2;
        this.f143594z = z;
        this.f143560A = k47Var;
        this.f143561B = uiq0Var;
        this.f143562C = qwx0Var;
        this.f143563D = eanVar;
        this.f143564E = tqnVar;
        this.f143565F = z2;
        this.f143566G = ron0Var;
        this.f143567H = u4w0Var;
        this.f143568I = l4w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final jgl m61725a(f1w0 f1w0Var, hc80 hc80Var, ijc1 ijc1Var, t1w0 t1w0Var, ggl gglVar, nv91 nv91Var, pgo pgoVar) {
        int i;
        k851 k851Var = new k851(ijc1Var);
        x0h1.m89578u(n5h1.m63737m(hc80Var), null, 0, new xvd(this, f1w0Var, gglVar, (fbk) null, 28), 3);
        m0y0 m0y0Var = new m0y0();
        int i2 = may.f141718a;
        k851Var.mo30460a(m0y0.class, l0y0.class, k0y0.class, m0y0Var, new ngl(2));
        zam0 zam0Var = t1w0Var.f216370g;
        q1w0 q1w0VarM74492a = this.f143582n.m74492a(hc80Var.getLifecycle(), gglVar.f79695e, gglVar.f79697g, gglVar.f79699i);
        String str = f1w0Var.f64988a;
        String str2 = f1w0Var.f64989b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderM42464h = fr0.m42464h(MobiusCoroutines.f5725a);
        C1037x558fa59a c1037x558fa59a = new C1037x558fa59a();
        n2w0 n2w0Var = new n2w0(q1w0VarM74492a);
        jqv0 jqv0Var = qpv0.f191387a;
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(b2w0.class), c1037x558fa59a.m15633a(n2w0Var));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(a2w0.class), new C1037x558fa59a().m15633a(new h2w0(q1w0VarM74492a)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(c2w0.class), new C1037x558fa59a().m15633a(new i2w0(q1w0VarM74492a)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(d2w0.class), new C1037x558fa59a().m15633a(new j2w0(q1w0VarM74492a)));
        coroutinesSubtypeEffectHandlerBuilderM42464h.m15628a(jqv0Var.mo54112b(e2w0.class), new C1033x3ae6ae8e().m15631a(new l2w0(this.f143583o)));
        luk lukVar = this.f143587s;
        C1044a c1044a = new C1044a(lukVar, coroutinesSubtypeEffectHandlerBuilderM42464h);
        k851Var.mo30461b(nhl.class, new tfv0(new p2w0(q1w0VarM74492a, lukVar), 1));
        k851Var.mo30460a(nhl.class, chl.class, f2w0.class, new khl(str, str2, 120), new taj(c1044a));
        k851Var.mo30461b(pbx0.class, new r72(10));
        k851Var.mo30461b(as21.class, r72.f196415g);
        boolean z = gglVar.f79691a;
        r1b r1bVar = gglVar.f79694d;
        boolean z2 = gglVar.f79700j;
        kbx0 kbx0Var = new kbx0("", rbx0.f197672b);
        eaq eaqVar = new eaq(29);
        sr4 sr4VarMo74475b = r1bVar.mo74475b();
        cxb cxbVar = this.f143580l;
        taj tajVar = new taj(eaqVar, new ybx0(str, new pcb((epx) cxbVar.f42972b, (wt80) cxbVar.f42973c, (zxx0) cxbVar.f42974d, z, new w221(sr4VarMo74475b, 11), r1bVar, z2), this.f143581m, lukVar), 8);
        Flowable flowable = this.f143579k;
        EventSource eventSourceM15655a = RxEventSources.m15655a(AbstractC0000a.m11j(flowable, flowable).map(l6q.f130438Q0));
        k851Var.mo30460a(pbx0.class, jbx0.class, cbx0.class, kbx0Var, tajVar);
        k851Var.mo30461b(pbx0.class, new t82(eventSourceM15655a, 3));
        if (gglVar.f79698h) {
            m72 m72Var = new m72();
            ron0 ron0Var = this.f143566G;
            k851Var.mo30460a(m72.class, j72.class, e72.class, m72Var, new p72(ron0Var));
            k851Var.mo30461b(as21.class, r72.f196410b);
            i = 0;
            k851Var.mo30461b(m72.class, new o72(new l72(ron0Var, 0), i));
        } else {
            i = 0;
        }
        k851Var.mo30460a(as21.class, wr21.class, w2a1.class, zr21.f285528a, new ngl(i));
        k851Var.mo30461b(pbx0.class, r72.f196413e);
        int i3 = t1w0Var.f216372i;
        if (i3 != 1) {
            boolean z3 = i3 == 4 || i3 == 3;
            k851Var.mo30460a(m6s0.class, m5s0.class, v4s0.class, new m6s0(nau.f152117a), new taj(gglVar.f79696f, this, zam0Var));
            k851Var.mo30461b(as21.class, new lgl(z3, str));
            if (z3) {
                k851Var.mo30461b(m6s0.class, new t82(RxEventSources.m15655a(Observable.just(str).map(uwk.f234670R0)), 2));
            }
        }
        return new jgl(k851Var, t1w0Var, this, f1w0Var, hc80Var, gglVar, nv91Var, pgoVar);
    }
}
