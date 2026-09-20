package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes2.dex */
public final class scs0 implements dfo {

    /* JADX INFO: renamed from: a */
    public final h1k f207791a;

    /* JADX INFO: renamed from: b */
    public final a9i0 f207792b;

    /* JADX INFO: renamed from: c */
    public final Flowable f207793c;

    /* JADX INFO: renamed from: d */
    public final pgo f207794d;

    /* JADX INFO: renamed from: e */
    public final tjo f207795e;

    /* JADX INFO: renamed from: f */
    public final xiz f207796f;

    /* JADX INFO: renamed from: g */
    public final i5x f207797g;

    /* JADX INFO: renamed from: h */
    public final cph f207798h;

    /* JADX INFO: renamed from: i */
    public final tjo f207799i;

    public scs0(z9j0 z9j0Var, e940 e940Var, h1k h1kVar, a9i0 a9i0Var, Flowable flowable, abs0 abs0Var, pgo pgoVar, tjo tjoVar) {
        this.f207791a = h1kVar;
        this.f207792b = a9i0Var;
        this.f207793c = flowable;
        this.f207794d = pgoVar;
        this.f207795e = tjoVar;
        wg61 wg61Var = new wg61(new cgr0(this, 7));
        wg61 wg61Var2 = new wg61(new nzk0(this, 19));
        this.f207796f = jcg1.m52989i(this, new p0r0(this, 23), z9j0Var, abs0Var);
        this.f207797g = wcg1.m87746k(this);
        this.f207798h = scg1.m77778L(e940Var, (n1k) wg61Var.getValue(), (ofo0) wg61Var2.getValue());
        this.f207799i = tjoVar;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f207797g;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f207798h;
    }

    @Override // p204p.izd1
    /* JADX INFO: renamed from: e */
    public final pgo mo24649e() {
        return this.f207794d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f207796f;
    }

    @Override // p204p.izd1
    public final mko getData() {
        return this.f207799i;
    }
}
