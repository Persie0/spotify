package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jmv0 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f113952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qly0 f113953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pg41 f113954c;

    public jmv0(float f, qly0 qly0Var, pg41 pg41Var) {
        this.f113952a = f;
        this.f113953b = qly0Var;
        this.f113954c = pg41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        imv0 imv0Var;
        if (fbkVar instanceof imv0) {
            imv0Var = (imv0) fbkVar;
            int i = imv0Var.f103783c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imv0Var.f103783c = i - Integer.MIN_VALUE;
            } else {
                imv0Var = new imv0(this, (ibk) fbkVar);
            }
        } else {
            imv0Var = new imv0(this, (ibk) fbkVar);
        }
        Object obj = imv0Var.f103781a;
        int i2 = imv0Var.f103783c;
        if (i2 == 0) {
            bga.m29073P(obj);
            qly0 qly0Var = this.f113953b;
            int iMin = (int) Math.min(this.f113952a, qly0Var.f189945e.m86437v());
            int iM86437v = qly0Var.f189941a.m86437v();
            if (iMin > 0 && iM86437v > 0 && iM86437v < iMin) {
                if (iM86437v < iMin / 2) {
                    iMin = 0;
                }
                imv0Var.f103783c = 1;
                Object objM73259f = qly0Var.m73259f(iMin, this.f113954c, imv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM73259f == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return new m5b1(0L);
    }
}
