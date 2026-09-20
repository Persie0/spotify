package p204p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes9.dex */
public final class cji0 implements cex {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38591a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f38592b;

    /* JADX INFO: renamed from: c */
    public final Object f38593c;

    /* JADX INFO: renamed from: d */
    public final Object f38594d;

    /* JADX INFO: renamed from: e */
    public final Object f38595e;

    /* JADX INFO: renamed from: f */
    public final Object f38596f;

    /* JADX INFO: renamed from: g */
    public final Object f38597g;

    /* JADX INFO: renamed from: h */
    public final Object f38598h;

    public cji0(yum yumVar, eju ejuVar, q1l0 q1l0Var, nh9 nh9Var, s4k s4kVar, n430 n430Var, qtr qtrVar, g3f g3fVar) {
        this.f38592b = yumVar;
        this.f38593c = ejuVar;
        this.f38594d = q1l0Var;
        this.f38595e = nh9Var;
        this.f38596f = s4kVar;
        this.f38597g = n430Var;
        this.f38598h = g3fVar;
    }

    /* JADX INFO: renamed from: b */
    public static final bjc0 m32989b(cji0 cji0Var, cw41 cw41Var, ofx ofxVar) {
        eym eymVar = (eym) cji0Var.f38592b;
        da80 da80Var = new da80(new ooa0(0, ofxVar.f164925h, ffx.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, 0, 14), ofxVar.f164918a, (eh00) cji0Var.f38597g, new yii0(ofxVar, cji0Var));
        m3e0 m3e0Var = new m3e0(new uem0(((kfx) cji0Var.f38594d).f122237b));
        vym vymVar = (vym) eymVar.f64123a.f276419c;
        r3n0 r3n0VarM86829u = vymVar.m86829u();
        h1k h1kVar = (h1k) vymVar.f246234Z.get();
        hun0 hun0VarM86834z = vymVar.m86834z();
        a9i0 a9i0VarM86831w = vymVar.m86831w();
        e940 e940VarM47387m = vymVar.f246236a.m47387m();
        jg31.m53271i(e940VarM47387m);
        n430 n430VarM86830v = vymVar.m86830v();
        fz3 fz3Var = new fz3(false, 12);
        s4k s4kVarM47379e = vymVar.f246236a.m47379e();
        jg31.m53271i(s4kVarM47379e);
        fcr fcrVarM47380f = vymVar.f246236a.m47380f();
        jg31.m53271i(fcrVarM47380f);
        return new bjc0(new ecm(w9h1.m87517y(new li0(cw41Var, da80Var, m3e0Var, r3n0VarM86829u, h1kVar, hun0VarM86834z, a9i0VarM86831w, e940VarM47387m, n430VarM86830v, fz3Var, s4kVarM47379e, fcrVarM47380f, (m0b) vymVar.f246224U.get(), vymVar.m86805C(), vymVar.m86818j(), (l5r0) vymVar.f246273r0.get(), (pjh) vymVar.f246226V.get()), null, null, 3), new e9f0(cji0Var, 14)), uii0.f230709c);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.cex
    /* JADX INFO: renamed from: a */
    public final f220 mo28297a(ofx ofxVar, f220 f220Var) {
        switch (this.f38591a) {
            case 0:
                hzh0 hzh0Var = hzh0.f96928P0;
                pgo pgoVar = f220Var.f65091a;
                LinkedHashMap linkedHashMap = f220Var.f65092b;
                xp4 xp4Var = (xp4) this.f38596f;
                if (!xp4Var.m91584E()) {
                    bji0 bji0Var = new bji0(this, ofxVar, 0);
                    ?? r13 = ((y20) this.f38595e).f268431b;
                    uii0 uii0Var = uii0.f230712e;
                    linkedHashMap.put(h3e0.class, new e1x0(uii0Var, r13, new z23(bji0Var), hzh0.f96931S0, xp4Var.m91594O() ? hzh0Var : null));
                    linkedHashMap.put(i3e0.class, new e1x0(uii0Var, r13, new z23(new bji0(this, ofxVar, 1)), hzh0.f96932T0, xp4Var.m91594O() ? hzh0Var : null));
                } else {
                    linkedHashMap.put(h3e0.class, new vjo(m32990c(pgoVar, ofxVar), hzh0.f96929Q0, xp4Var.m91594O() ? hzh0Var : null));
                    ggo ggoVarM32990c = m32990c(pgoVar, ofxVar);
                    if (!xp4Var.m91594O()) {
                        hzh0Var = null;
                    }
                    linkedHashMap.put(i3e0.class, new vjo(ggoVarM32990c, hzh0.f96930R0, hzh0Var));
                }
                break;
            case 1:
                f220Var.f65092b.put(z0l0.class, new e1x0(j1l0.f107790b, nau.f152117a, new z23(new k1l0(this, 0)), or40.f168438L0, null));
                break;
            default:
                f220Var.f65092b.put(tws0.class, new e1x0(evs0.f63315O0, nau.f152117a, new z23(new yrs0(this, 4)), rxs0.f203710b, null));
                break;
        }
        return f220Var;
    }

    /* JADX INFO: renamed from: c */
    public ggo m32990c(pgo pgoVar, ofx ofxVar) {
        fym fymVar = (fym) this.f38593c;
        da80 da80Var = new da80(new ooa0(0, ofxVar.f164925h, ffx.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, 0, 15), ofxVar.f164918a, (eh00) this.f38597g, new aji0(ofxVar, this));
        m3e0 m3e0Var = new m3e0(new uem0(((kfx) this.f38594d).f122237b));
        vym vymVar = (vym) fymVar.f74774a.f276419c;
        r3n0 r3n0VarM86829u = vymVar.m86829u();
        h1k h1kVar = (h1k) vymVar.f246234Z.get();
        hun0 hun0VarM86834z = vymVar.m86834z();
        a9i0 a9i0VarM86831w = vymVar.m86831w();
        e940 e940VarM47387m = vymVar.f246236a.m47387m();
        jg31.m53271i(e940VarM47387m);
        n430 n430VarM86830v = vymVar.m86830v();
        fz3 fz3Var = new fz3(false, 12);
        s4k s4kVarM47379e = vymVar.f246236a.m47379e();
        jg31.m53271i(s4kVarM47379e);
        fcr fcrVarM47380f = vymVar.f246236a.m47380f();
        jg31.m53271i(fcrVarM47380f);
        return new ggo(new fcm(opo.m67550G(new hgc(r3n0VarM86829u, h1kVar, hun0VarM86834z, a9i0VarM86831w, e940VarM47387m, n430VarM86830v, fz3Var, s4kVarM47379e, fcrVarM47380f, (m0b) vymVar.f246224U.get(), vymVar.m86805C(), vymVar.m86818j(), (l5r0) vymVar.f246273r0.get(), (pjh) vymVar.f246226V.get(), pgoVar, da80Var, m3e0Var), null, null, 3), new e9f0(this, 15)), uii0.f230711d);
    }

    public cji0(yum yumVar, w9r0 w9r0Var, nfx nfxVar, x9n x9nVar, kfx kfxVar, n430 n430Var, e940 e940Var, epx epxVar) {
        this.f38592b = yumVar;
        this.f38593c = w9r0Var;
        this.f38594d = nfxVar;
        this.f38595e = x9nVar;
        this.f38596f = n430Var;
        this.f38597g = e940Var;
        this.f38598h = epxVar;
    }

    public cji0(eym eymVar, fym fymVar, kfx kfxVar, y20 y20Var, xp4 xp4Var, eh00 eh00Var, opp oppVar) {
        this.f38592b = eymVar;
        this.f38593c = fymVar;
        this.f38594d = kfxVar;
        this.f38595e = y20Var;
        this.f38596f = xp4Var;
        this.f38597g = eh00Var;
        this.f38598h = oppVar;
    }
}
