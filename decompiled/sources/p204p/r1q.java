package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r1q implements fft0 {

    /* JADX INFO: renamed from: a */
    public final twy f194892a;

    /* JADX INFO: renamed from: b */
    public final yho f194893b;

    /* JADX INFO: renamed from: c */
    public final up60 f194894c = qpv0.f191387a.mo54112b(j2k0.class);

    public r1q(twy twyVar, yho yhoVar) {
        this.f194892a = twyVar;
        this.f194893b = yhoVar;
    }

    @Override // p204p.fft0
    /* JADX INFO: renamed from: a */
    public final up60 mo36355a() {
        return this.f194894c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fft0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object mo36356b(j2k0 j2k0Var, ibk ibkVar) {
        p1q p1qVar;
        if (ibkVar instanceof p1q) {
            p1qVar = (p1q) ibkVar;
            int i = p1qVar.f173147d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1qVar.f173147d = i - Integer.MIN_VALUE;
            } else {
                p1qVar = new p1q(this, ibkVar);
            }
        } else {
            p1qVar = new p1q(this, ibkVar);
        }
        Object obj = p1qVar.f173145b;
        int i2 = p1qVar.f173147d;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            p1qVar.f173144a = j2k0Var;
            p1qVar.f173147d = 1;
            if (mlg1.m62222o("presenter_type", "simple", p1qVar) != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        j2k0Var = p1qVar.f173144a;
        bga.m29073P(obj);
        cd21 cd21Var = new cd21(j2k0Var.f108098c, new q1q(this, j2k0Var, 0), new q1q(this, j2k0Var, 1), j2k0Var.f108100e, j2k0Var.f108099d, 96);
        p1qVar.f173144a = null;
        p1qVar.f173147d = 2;
        Object objM81781A = this.f194892a.m81781A(cd21Var, p1qVar);
        return objM81781A == yukVar ? yukVar : objM81781A;
    }
}
