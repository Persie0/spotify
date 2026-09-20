package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes11.dex */
public final class moe0 extends qxf {

    /* JADX INFO: renamed from: X0 */
    public final dcm0 f145659X0;

    /* JADX INFO: renamed from: Y0 */
    public final m500 f145660Y0;

    /* JADX INFO: renamed from: Z0 */
    public final zb6 f145661Z0;

    /* JADX INFO: renamed from: a1 */
    public final jr40 f145662a1;

    /* JADX INFO: renamed from: b1 */
    public final lwr f145663b1;

    /* JADX INFO: renamed from: c1 */
    public final PublishSubject f145664c1;

    public moe0(t290 t290Var, ovf ovfVar, dcm0 dcm0Var, m500 m500Var, zb6 zb6Var, jr40 jr40Var) {
        super(ovfVar, qpv0.f191387a.mo54112b(hhv.class), t290Var);
        this.f145659X0 = dcm0Var;
        this.f145660Y0 = m500Var;
        this.f145661Z0 = zb6Var;
        this.f145662a1 = jr40Var;
        lwr lwrVar = new lwr();
        this.f145663b1 = lwrVar;
        PublishSubject publishSubject = new PublishSubject();
        this.f145664c1 = publishSubject;
        dcm0Var.f47583d.f68149c.getLifecycle().mo31986a(new dz2(this, 13));
        lwrVar.m60127a(publishSubject.ofType(koe0.class).distinctUntilChanged().flatMap(new a470(26, this, ovfVar)).subscribe());
    }

    @Override // p204p.qxf
    /* JADX INFO: renamed from: F */
    public final void mo46735F(mhv mhvVar, e2a e2aVar) {
        this.f145664c1.onNext(new koe0((hhv) mhvVar, e2aVar));
    }

    @Override // p204p.qxf
    /* JADX INFO: renamed from: G */
    public final /* bridge */ /* synthetic */ Object mo46736G(mhv mhvVar) {
        return twa.f224389a;
    }
}
