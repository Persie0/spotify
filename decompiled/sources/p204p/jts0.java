package p204p;

import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class jts0 implements fwz0 {

    /* JADX INFO: renamed from: X */
    public final ConcurrentHashMap f115956X;

    /* JADX INFO: renamed from: a */
    public final wt80 f115957a;

    /* JADX INFO: renamed from: b */
    public final yz80 f115958b;

    /* JADX INFO: renamed from: c */
    public final q831 f115959c;

    /* JADX INFO: renamed from: d */
    public final luk f115960d;

    /* JADX INFO: renamed from: e */
    public final jts0 f115961e = this;

    /* JADX INFO: renamed from: f */
    public final jts0 f115962f = this;

    /* JADX INFO: renamed from: g */
    public final jts0 f115963g = this;

    /* JADX INFO: renamed from: h */
    public final jts0 f115964h = this;

    /* JADX INFO: renamed from: i */
    public final c9k f115965i;

    /* JADX INFO: renamed from: t */
    public final LinkedHashMap f115966t;

    public jts0(wt80 wt80Var, yz80 yz80Var, q831 q831Var, luk lukVar, luk lukVar2) {
        this.f115957a = wt80Var;
        this.f115958b = yz80Var;
        this.f115959c = q831Var;
        this.f115960d = lukVar2;
        x461 x461VarM64613f = njg1.m64613f();
        kuk kukVar = luk.f137098b;
        this.f115965i = kk40.m56661c(opo.m67570t(x461VarM64613f, lukVar.mo40637Q(1)));
        this.f115966t = new LinkedHashMap();
        this.f115956X = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final hts0 m54306a(String str) {
        hts0 hts0Var = new hts0(str, UUID.randomUUID());
        x0h1.m89578u(this.f115965i, null, 0, new rgp0(this, str, hts0Var, null, 9), 3);
        return hts0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m54307b(hts0 hts0Var) {
        x0h1.m89578u(this.f115965i, null, 0, new s6r0(this, hts0Var, null, 14), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m54308c(String str) {
        tf60 tf60Var;
        its0 its0Var = (its0) this.f115966t.remove(str);
        if (its0Var != null && (tf60Var = its0Var.f105735e) != null) {
            tf60Var.mo26601e(null);
        }
        ((zv41) m54310e(str)).m97090l(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m54309d(int i, String str, UUID uuid) {
        m54308c(str);
        m54311f(str, new its0(uuid, new kts0(str, i, false, false), false, null, null));
        di41 di41VarM89578u = x0h1.m89578u(this.f115965i, null, 0, new kga(this, str, uuid, (fbk) null, 16), 3);
        LinkedHashMap linkedHashMap = this.f115966t;
        its0 its0Var = (its0) linkedHashMap.get(str);
        if (wj50.m88271j(its0Var != null ? its0Var.f105731a : null, uuid)) {
            linkedHashMap.put(str, its0.m51639a(its0Var, null, false, null, di41VarM89578u, 15));
        } else {
            di41VarM89578u.mo26601e(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final lqi0 m54310e(String str) {
        return (lqi0) this.f115956X.computeIfAbsent(str, rer.f198421g);
    }

    /* JADX INFO: renamed from: f */
    public final void m54311f(String str, its0 its0Var) {
        this.f115966t.put(str, its0Var);
        ((zv41) m54310e(str)).m97090l(its0Var.f105732b);
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this.f115961e;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        kk40.m56680v(this.f115965i, null);
    }
}
