package p204p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c5r0 implements cex {

    /* JADX INFO: renamed from: a */
    public final c4e0 f34255a;

    /* JADX INFO: renamed from: b */
    public final h4e0 f34256b;

    /* JADX INFO: renamed from: c */
    public final tgq f34257c;

    /* JADX INFO: renamed from: d */
    public final kfx f34258d;

    /* JADX INFO: renamed from: e */
    public final wm4 f34259e;

    /* JADX INFO: renamed from: f */
    public final xp4 f34260f;

    /* JADX INFO: renamed from: g */
    public final eh00 f34261g;

    /* JADX INFO: renamed from: h */
    public final y20 f34262h;

    /* JADX INFO: renamed from: i */
    public final v6z0 f34263i;

    /* JADX INFO: renamed from: j */
    public final zs0 f34264j;

    /* JADX INFO: renamed from: k */
    public final fcr f34265k;

    /* JADX INFO: renamed from: l */
    public final hc80 f34266l;

    /* JADX INFO: renamed from: m */
    public final opp f34267m;

    /* JADX INFO: renamed from: n */
    public final yps f34268n;

    /* JADX INFO: renamed from: o */
    public final xcq0 f34269o;

    /* JADX INFO: renamed from: p */
    public final wg61 f34270p = new wg61(new x4r0(this, 0));

    /* JADX INFO: renamed from: q */
    public final etq0 f34271q = etq0.f62760N0;

    public c5r0(c4e0 c4e0Var, h4e0 h4e0Var, tgq tgqVar, kfx kfxVar, wm4 wm4Var, xp4 xp4Var, eh00 eh00Var, y20 y20Var, v6z0 v6z0Var, zs0 zs0Var, fcr fcrVar, hc80 hc80Var, opp oppVar, yps ypsVar, xcq0 xcq0Var) {
        this.f34255a = c4e0Var;
        this.f34256b = h4e0Var;
        this.f34257c = tgqVar;
        this.f34258d = kfxVar;
        this.f34259e = wm4Var;
        this.f34260f = xp4Var;
        this.f34261g = eh00Var;
        this.f34262h = y20Var;
        this.f34263i = v6z0Var;
        this.f34264j = zs0Var;
        this.f34265k = fcrVar;
        this.f34266l = hc80Var;
        this.f34267m = oppVar;
        this.f34268n = ypsVar;
        this.f34269o = xcq0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final bmh m31490b(c5r0 c5r0Var, cw41 cw41Var, ofx ofxVar) {
        return c5r0Var.f34255a.mo31441a(cw41Var, new z9p(new s4r0(0, ofxVar.f164925h, ffx.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, 0, 0), ofxVar.f164918a, new wg61(new r4r0(c5r0Var, ofxVar, 0)), c5r0Var.f34261g, c5r0Var.f34260f.m91633n0() ? ofxVar.f164929l : null, new u4r0(ofxVar, c5r0Var), 23), c5r0Var.m31491c());
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    @Override // p204p.cex
    /* JADX INFO: renamed from: a */
    public final f220 mo28297a(ofx ofxVar, f220 f220Var) {
        pgo pgoVar = f220Var.f65091a;
        LinkedHashMap linkedHashMap = f220Var.f65092b;
        if (this.f34260f.m91589J()) {
            linkedHashMap.put(y3e0.class, new vjo(m31492d(pgoVar, ofxVar), w7q0.f248753a1, m31493e()));
            linkedHashMap.put(z3e0.class, new vjo(m31492d(pgoVar, ofxVar), w7q0.f248755b1, m31493e()));
            return f220Var;
        }
        a5r0 a5r0Var = new a5r0(this, ofxVar, 0);
        ?? r7 = this.f34262h.f268431b;
        znn0 znn0VarM31493e = m31493e();
        w7q0 w7q0Var = w7q0.f248757c1;
        z23 z23Var = new z23(a5r0Var);
        etq0 etq0Var = this.f34271q;
        linkedHashMap.put(y3e0.class, new e1x0(etq0Var, r7, z23Var, w7q0Var, znn0VarM31493e));
        a5r0 a5r0Var2 = new a5r0(this, ofxVar, 1);
        znn0 znn0VarM31493e2 = m31493e();
        linkedHashMap.put(z3e0.class, new e1x0(etq0Var, r7, new z23(a5r0Var2), b5r0.f23672b, znn0VarM31493e2));
        return f220Var;
    }

    /* JADX INFO: renamed from: c */
    public final b4e0 m31491c() {
        uem0 uem0Var = new uem0(this.f34258d.f122237b);
        Set set = o6e0.f162337a;
        tgq tgqVar = this.f34257c;
        n7m n7mVar = (n7m) tgqVar.f220238c;
        boolean z = !set.contains(n7mVar.f151186a);
        boolean zM80774h = tgqVar.m80774h();
        wm4 wm4Var = (wm4) tgqVar.f220237b;
        boolean zM88536h = set.contains(n7mVar.f151186a) ? wm4Var.m88536h() : wm4Var.m88537i();
        boolean zM88533e = wm4Var.m88533e();
        xp4 xp4Var = this.f34260f;
        return new b4e0(true, uem0Var, z, zM80774h, zM88536h, zM88533e, xp4Var.m91603X(), xp4Var.m91616f(), this.f34259e.m88529a(), 12);
    }

    /* JADX INFO: renamed from: d */
    public final ggo m31492d(pgo pgoVar, ofx ofxVar) {
        v5m v5mVar = ofxVar.f164918a;
        wg61 wg61Var = new wg61(new r4r0(this, ofxVar, 1));
        return new ggo(new fcm(opo.m67550G(this.f34256b.mo46638a(pgoVar, new z9p(new s4r0(0, ofxVar.f164925h, ffx.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, 0, 1), v5mVar, wg61Var, this.f34261g, this.f34260f.m91633n0() ? ofxVar.f164929l : null, new w4r0(ofxVar, this), 23), m31491c(), new d4e0(this.f34268n.m94315e(), this.f34259e.m88532d(), 4)), null, null, 3), new ctn0(this, 7)), etq0.f62759M0);
    }

    /* JADX INFO: renamed from: e */
    public final znn0 m31493e() {
        if (!this.f34260f.m91594O()) {
            return null;
        }
        return new znn0(etq0.f62761O0, new x4r0(this, 1));
    }
}
