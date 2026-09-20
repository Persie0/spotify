package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mb80 implements q7m, t78, py50, qy50, t160 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ krh f141816a;

    /* JADX INFO: renamed from: b */
    public final q7m f141817b;

    /* JADX INFO: renamed from: c */
    public final t78 f141818c;

    /* JADX INFO: renamed from: d */
    public final py50 f141819d;

    /* JADX INFO: renamed from: e */
    public final qy50 f141820e;

    public mb80(q7m q7mVar, t78 t78Var, py50 py50Var, qy50 qy50Var, xvo xvoVar, lb80 lb80Var, hb80 hb80Var, nb80 nb80Var) {
        this.f141816a = new krh(new t160[]{lb80Var, hb80Var, nb80Var});
        this.f141817b = q7mVar;
        this.f141818c = t78Var;
        this.f141819d = py50Var;
        this.f141820e = qy50Var;
    }

    @Override // p204p.qy50
    /* JADX INFO: renamed from: a */
    public final xv41 mo61350a() {
        return this.f141820e.mo61350a();
    }

    @Override // p204p.t78
    public final xv41 available() {
        return this.f141818c.available();
    }

    @Override // p204p.py50
    /* JADX INFO: renamed from: b */
    public final xv41 mo61351b() {
        return this.f141819d.mo61351b();
    }

    @Override // p204p.q7m
    public final xv41 current() {
        return this.f141817b.current();
    }

    @Override // p204p.t160
    public final void start() {
        this.f141816a.start();
    }

    @Override // p204p.t160
    public final void stop() {
        this.f141816a.stop();
    }
}
