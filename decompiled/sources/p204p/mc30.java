package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class mc30 extends exh0 implements n6q0 {

    /* JADX INFO: renamed from: M0 */
    public voi0 f142022M0;

    /* JADX INFO: renamed from: N0 */
    public gc30 f142023N0;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H1 */
    public static final Object m61437H1(mc30 mc30Var, ibk ibkVar) {
        jc30 jc30Var;
        gc30 gc30Var;
        if (ibkVar instanceof jc30) {
            jc30Var = (jc30) ibkVar;
            int i = jc30Var.f110949d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc30Var.f110949d = i - Integer.MIN_VALUE;
            } else {
                jc30Var = new jc30(mc30Var, ibkVar);
            }
        } else {
            jc30Var = new jc30(mc30Var, ibkVar);
        }
        Object obj = jc30Var.f110947b;
        int i2 = jc30Var.f110949d;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (mc30Var.f142023N0 == null) {
                gc30 gc30Var2 = new gc30();
                voi0 voi0Var = mc30Var.f142022M0;
                jc30Var.f110946a = gc30Var2;
                jc30Var.f110949d = 1;
                Object objMo86073b = voi0Var.mo86073b(gc30Var2, jc30Var);
                yuk yukVar = yuk.f276404a;
                if (objMo86073b == yukVar) {
                    return yukVar;
                }
                gc30Var = gc30Var2;
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gc30Var = jc30Var.f110946a;
        bga.m29073P(obj);
        mc30Var.f142023N0 = gc30Var;
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I1 */
    public static final Object m61438I1(mc30 mc30Var, ibk ibkVar) {
        kc30 kc30Var;
        if (ibkVar instanceof kc30) {
            kc30Var = (kc30) ibkVar;
            int i = kc30Var.f121354c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kc30Var.f121354c = i - Integer.MIN_VALUE;
            } else {
                kc30Var = new kc30(mc30Var, ibkVar);
            }
        } else {
            kc30Var = new kc30(mc30Var, ibkVar);
        }
        Object obj = kc30Var.f121352a;
        int i2 = kc30Var.f121354c;
        if (i2 == 0) {
            bga.m29073P(obj);
            gc30 gc30Var = mc30Var.f142023N0;
            if (gc30Var != null) {
                hc30 hc30Var = new hc30(gc30Var);
                voi0 voi0Var = mc30Var.f142022M0;
                kc30Var.f121354c = 1;
                Object objMo86073b = voi0Var.mo86073b(hc30Var, kc30Var);
                yuk yukVar = yuk.f276404a;
                if (objMo86073b == yukVar) {
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        mc30Var.f142023N0 = null;
        return w2a1.f247311a;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        m61439J1();
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: E0 */
    public final void mo39625E0(e6q0 e6q0Var, f6q0 f6q0Var, long j) {
        if (f6q0Var == f6q0.f66486b) {
            int i = e6q0Var.f56709f;
            fbk fbkVar = null;
            if (i == 4) {
                x0h1.m89578u(m40262v1(), null, 0, new lc30(this, fbkVar, 0), 3);
            } else if (i == 5) {
                x0h1.m89578u(m40262v1(), null, 0, new lc30(this, fbkVar, 1), 3);
            }
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final void m61439J1() {
        gc30 gc30Var = this.f142023N0;
        if (gc30Var != null) {
            this.f142022M0.mo86072a(new hc30(gc30Var));
            this.f142023N0 = null;
        }
    }

    @Override // p204p.n6q0
    /* JADX INFO: renamed from: M0 */
    public final void mo39628M0() {
        m61439J1();
    }
}
