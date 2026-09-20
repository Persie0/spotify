package p204p;

import androidx.car.app.hardware.common.CarResultStub;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class szb implements sew0, hcd0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f215442a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f215443b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f215444c;

    public /* synthetic */ szb(CarResultStub carResultStub, boolean z, pra praVar) {
        this.f215443b = carResultStub;
        this.f215442a = z;
        this.f215444c = praVar;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public Object mo205b() {
        return ((CarResultStub) this.f215443b).lambda$onCarHardwareResult$0(this.f215442a, (pra) this.f215444c);
    }

    @Override // p204p.hcd0
    /* JADX INFO: renamed from: d */
    public void mo25456d(jv30 jv30Var, int i) {
        jv30Var.mo45833l(((jcd0) this.f215443b).f111081c, i, ((xs6) this.f215444c).m91968d(), this.f215442a);
    }

    public /* synthetic */ szb(jcd0 jcd0Var, xs6 xs6Var, boolean z) {
        this.f215443b = jcd0Var;
        this.f215444c = xs6Var;
        this.f215442a = z;
    }
}
