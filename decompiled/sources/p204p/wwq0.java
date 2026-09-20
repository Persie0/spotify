package p204p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wwq0 implements cex {

    /* JADX INFO: renamed from: a */
    public final h4e0 f255811a;

    /* JADX INFO: renamed from: b */
    public final tgq f255812b;

    /* JADX INFO: renamed from: c */
    public final kfx f255813c;

    /* JADX INFO: renamed from: d */
    public final wm4 f255814d;

    /* JADX INFO: renamed from: e */
    public final xp4 f255815e;

    /* JADX INFO: renamed from: f */
    public final eh00 f255816f;

    /* JADX INFO: renamed from: g */
    public final opp f255817g;

    /* JADX INFO: renamed from: h */
    public final yps f255818h;

    /* JADX INFO: renamed from: i */
    public final xcq0 f255819i;

    public wwq0(h4e0 h4e0Var, tgq tgqVar, kfx kfxVar, wm4 wm4Var, xp4 xp4Var, eh00 eh00Var, opp oppVar, yps ypsVar, xcq0 xcq0Var) {
        this.f255811a = h4e0Var;
        this.f255812b = tgqVar;
        this.f255813c = kfxVar;
        this.f255814d = wm4Var;
        this.f255815e = xp4Var;
        this.f255816f = eh00Var;
        this.f255817g = oppVar;
        this.f255818h = ypsVar;
        this.f255819i = xcq0Var;
    }

    @Override // p204p.cex
    /* JADX INFO: renamed from: a */
    public final f220 mo28297a(ofx ofxVar, f220 f220Var) {
        pgo pgoVar = f220Var.f65091a;
        ggo ggoVarM89212b = m89212b(pgoVar, ofxVar);
        w7q0 w7q0Var = w7q0.f248744U0;
        LinkedHashMap linkedHashMap = f220Var.f65092b;
        linkedHashMap.put(v3e0.class, new vjo(ggoVarM89212b, w7q0Var, (th00) null));
        linkedHashMap.put(w3e0.class, new vjo(m89212b(pgoVar, ofxVar), w7q0.f248745V0, (th00) null));
        return f220Var;
    }

    /* JADX INFO: renamed from: b */
    public final ggo m89212b(pgo pgoVar, ofx ofxVar) {
        z9p z9pVar = new z9p(new e5m0(0, ofxVar.f164925h, ffx.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, 0, 29), ofxVar.f164918a, new wg61(new uvp0(10, this, ofxVar)), this.f255816f, (Object) null, new vwq0(ofxVar, this), 23);
        uem0 uem0Var = new uem0(this.f255813c.f122237b);
        Set set = o6e0.f162337a;
        tgq tgqVar = this.f255812b;
        n7m n7mVar = (n7m) tgqVar.f220238c;
        boolean z = !set.contains(n7mVar.f151186a);
        boolean zM80774h = tgqVar.m80774h();
        wm4 wm4Var = (wm4) tgqVar.f220237b;
        boolean zM88536h = set.contains(n7mVar.f151186a) ? wm4Var.m88536h() : wm4Var.m88537i();
        boolean zM88533e = wm4Var.m88533e();
        xp4 xp4Var = this.f255815e;
        boolean zM91603X = xp4Var.m91603X();
        boolean zM91616f = xp4Var.m91616f();
        wm4 wm4Var2 = this.f255814d;
        return new ggo(new fcm(opo.m67550G(this.f255811a.mo46638a(pgoVar, z9pVar, new b4e0(true, uem0Var, z, zM80774h, zM88536h, zM88533e, zM91603X, zM91616f, wm4Var2.m88529a(), 12), new d4e0(this.f255818h.m94315e(), true, wm4Var2.m88532d())), null, null, 3), new ctn0(this, 6)), etq0.f62781d);
    }
}
