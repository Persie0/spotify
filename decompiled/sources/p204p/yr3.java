package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yr3 extends uds {

    /* JADX INFO: renamed from: h1 */
    public qs3 f275374h1;

    /* JADX INFO: renamed from: i1 */
    public vvl0 f275375i1;

    /* JADX INFO: renamed from: j1 */
    public ihz f275376j1;

    /* JADX INFO: renamed from: k1 */
    public ihz f275377k1;

    /* JADX INFO: renamed from: l1 */
    public yqq f275378l1;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c2 */
    public static final Object m94405c2(yr3 yr3Var, float f, ibk ibkVar) {
        vr3 vr3Var;
        olv0 olv0Var;
        if (ibkVar instanceof vr3) {
            vr3Var = (vr3) ibkVar;
            int i = vr3Var.f244056d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vr3Var.f244056d = i - Integer.MIN_VALUE;
            } else {
                vr3Var = new vr3(yr3Var, ibkVar);
            }
        } else {
            vr3Var = new vr3(yr3Var, ibkVar);
        }
        Object obj = vr3Var.f244054b;
        int i2 = vr3Var.f244056d;
        if (i2 == 0) {
            bga.m29073P(obj);
            boolean zM73665d = yr3Var.f275374h1.m73665d();
            yuk yukVar = yuk.f276404a;
            if (zM73665d) {
                qs3 qs3Var = yr3Var.f275374h1;
                vr3Var.f244056d = 1;
                Object objM73670i = qs3Var.m73670i(f, vr3Var);
                if (objM73670i != yukVar) {
                    return objM73670i;
                }
            } else {
                olv0 olv0Var2 = new olv0();
                olv0Var2.f166933a = f;
                qs3 qs3Var2 = yr3Var.f275374h1;
                xr3 xr3Var = new xr3(yr3Var, olv0Var2, f, null);
                vr3Var.f244053a = olv0Var2;
                vr3Var.f244056d = 2;
                Object objM30301b = qs3Var2.f191968f.m30301b(xqi0.f265055a, new gs3(qs3Var2, null, xr3Var), vr3Var);
                if (objM30301b != yukVar) {
                    objM30301b = w2a1.f247311a;
                }
                if (objM30301b != yukVar) {
                    olv0Var = olv0Var2;
                }
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            return obj;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        olv0Var = vr3Var.f244053a;
        bga.m29073P(obj);
        return new Float(olv0Var.f166933a);
    }

    @Override // p204p.uds
    /* JADX INFO: renamed from: O1 */
    public final Object mo38704O1(tds tdsVar, tds tdsVar2) {
        qs3 qs3Var = this.f275374h1;
        Object objM30301b = qs3Var.f191968f.m30301b(xqi0.f265055a, new gs3(qs3Var, null, new C2102lt(tdsVar, this, (fbk) null)), tdsVar2);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM30301b != yukVar) {
            objM30301b = w2a1Var;
        }
        return objM30301b == yukVar ? objM30301b : w2a1Var;
    }

    @Override // p204p.uds
    /* JADX INFO: renamed from: U1 */
    public final void mo38706U1(wcs wcsVar) {
        if (this.f63766L0) {
            x0h1.m89578u(m40262v1(), null, 0, new fa2(this, wcsVar, null, 19), 3);
        }
    }

    @Override // p204p.uds
    /* JADX INFO: renamed from: Z1 */
    public final boolean mo38707Z1() {
        return this.f275374h1.f191974l.getValue() != null;
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m94406d2() {
        return wjg1.m88319I(this).f135666Y0 == ko70.f124557b && this.f275375i1 == vvl0.f245249b;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m94407e2(ihz ihzVar) {
        if (ihzVar == null) {
            im91 im91Var = zq3.f285296a;
            C2126mg c2126mg = zq3.f285297b;
            yqq yqqVar = wjg1.m88319I(this).f135664X0;
            this.f275378l1 = yqqVar;
            dr3 dr3Var = new dr3(this.f275374h1, c2126mg, new br3(yqqVar, 0));
            float f = ca31.f35714a;
            ihzVar = new y931(dr3Var, b04.f21767b, im91Var);
        }
        this.f275377k1 = ihzVar;
    }

    @Override // p204p.jlq
    /* JADX INFO: renamed from: l */
    public final void mo33590l() {
        mo39628M0();
        if (this.f63766L0) {
            yqq yqqVar = wjg1.m88319I(this).f135664X0;
            yqq yqqVar2 = this.f275378l1;
            if (yqqVar2 == null || !yqqVar2.equals(yqqVar)) {
                this.f275378l1 = yqqVar;
                m94407e2(this.f275376j1);
            }
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        m94407e2(this.f275376j1);
    }

    @Override // p204p.uds
    /* JADX INFO: renamed from: T1 */
    public final void mo38705T1(long j) {
    }
}
