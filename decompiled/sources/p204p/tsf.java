package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes4.dex */
public final class tsf implements psf {

    /* JADX INFO: renamed from: a */
    public final e940 f223294a;

    /* JADX INFO: renamed from: b */
    public final kcj0 f223295b;

    /* JADX INFO: renamed from: c */
    public final yhv f223296c;

    /* JADX INFO: renamed from: d */
    public final ra9 f223297d;

    /* JADX INFO: renamed from: e */
    public final l89 f223298e;

    /* JADX INFO: renamed from: f */
    public final y8q f223299f;

    /* JADX INFO: renamed from: g */
    public final xiz f223300g;

    /* JADX INFO: renamed from: h */
    public final avt f223301h;

    /* JADX INFO: renamed from: i */
    public final cph f223302i;

    public tsf(e940 e940Var, kcj0 kcj0Var, yhv yhvVar, ra9 ra9Var, l89 l89Var, y8q y8qVar, usf usfVar) {
        this.f223294a = e940Var;
        this.f223295b = kcj0Var;
        this.f223296c = yhvVar;
        this.f223297d = ra9Var;
        this.f223298e = l89Var;
        this.f223299f = y8qVar;
        Flowable flowable = (Flowable) ((opm) kcj0Var.f121500d).get();
        d0k[] d0kVarArr = bmu0.f28619a;
        onc oncVar = new onc(flowable);
        hc80 hc80Var = (hc80) kcj0Var.f121498b;
        ub80 ub80VarM63737m = n5h1.m63737m(hc80Var);
        iq3 iq3Var = hf11.f90581a;
        this.f223300g = axf1.m27397l(bzf1.m31029u(g0g1.m43302g(bzf1.m31029u(oncVar, ub80VarM63737m, iq3Var, ""), bzf1.m31029u(new onc((Flowable) ((opm) kcj0Var.f121501e).get()), n5h1.m63737m(hc80Var), iq3Var, 0L), (zv41) kcj0Var.f121502f, new n6c(4, null)), n5h1.m63737m(hc80Var), iq3Var, new l6c(0, lau.f131415a, true)), rif.f199524b1, jjf.f113015X, null, new vgf(this, 8), 8);
        this.f223301h = usfVar.mo55569a(this);
        fyf fyfVar = new fyf(new bhd(this, 20), true, -1998404576);
        wpi0 wpi0Var = xwt.f266743a;
        this.f223302i = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public static final Object m81415e(tsf tsfVar, nsf nsfVar, fbk fbkVar) {
        ssf ssfVar;
        Object value;
        kcj0 kcj0Var = tsfVar.f223295b;
        if (fbkVar instanceof ssf) {
            ssfVar = (ssf) fbkVar;
            int i = ssfVar.f213593d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssfVar.f213593d = i - Integer.MIN_VALUE;
            } else {
                ssfVar = new ssf(tsfVar, fbkVar);
            }
        } else {
            ssfVar = new ssf(tsfVar, fbkVar);
        }
        Object obj = ssfVar.f213591b;
        int i2 = ssfVar.f213593d;
        if (i2 == 0) {
            bga.m29073P(obj);
            String str = nsfVar.f157760a;
            ssfVar.f213590a = nsfVar;
            ssfVar.f213593d = 1;
            Object objM56091f0 = kcj0Var.m56091f0(str, ssfVar);
            yuk yukVar = yuk.f276404a;
            if (objM56091f0 == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nsfVar = ssfVar.f213590a;
            bga.m29073P(obj);
        }
        if (nsfVar.f157762c) {
            zv41 zv41Var = (zv41) kcj0Var.f121502f;
            do {
                value = zv41Var.getValue();
            } while (!zv41Var.m97089k(value, m6c.m61006a((m6c) value, null, null, false, 11)));
        }
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f223301h;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f223302i;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f223300g;
    }
}
