package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tes implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rv41 f219787a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qs3 f219788b;

    public tes(rv41 rv41Var, qs3 qs3Var) {
        this.f219787a = rv41Var;
        this.f219788b = qs3Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (i != 1) {
            return 0L;
        }
        eep eepVar = (eep) this.f219787a.getValue();
        if (Math.abs(eepVar.m38700d()) > Float.MAX_VALUE || Math.abs(eepVar.m38701e()) > Float.MAX_VALUE) {
            return 0L;
        }
        qs3 qs3Var = this.f219788b;
        if (Math.abs(qs3Var.f191972j.m84031v()) > Float.MAX_VALUE) {
            return 0L;
        }
        float fM73663b = qs3Var.m73663b(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM73663b)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) {
        ses sesVar;
        if (fbkVar instanceof ses) {
            sesVar = (ses) fbkVar;
            int i = sesVar.f208384c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sesVar.f208384c = i - Integer.MIN_VALUE;
            } else {
                sesVar = new ses(this, (ibk) fbkVar);
            }
        } else {
            sesVar = new ses(this, (ibk) fbkVar);
        }
        Object objM73670i = sesVar.f208382a;
        int i2 = sesVar.f208384c;
        if (i2 == 0) {
            bga.m29073P(objM73670i);
            eep eepVar = (eep) this.f219787a.getValue();
            if (Math.abs(eepVar.m38700d()) <= Float.MAX_VALUE && Math.abs(eepVar.m38701e()) <= Float.MAX_VALUE) {
                qs3 qs3Var = this.f219788b;
                if (Math.abs(qs3Var.f191972j.m84031v()) <= Float.MAX_VALUE) {
                    float fM60855e = m5b1.m60855e(j);
                    sesVar.f208384c = 1;
                    objM73670i = qs3Var.m73670i(fM60855e, sesVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM73670i == yukVar) {
                        return yukVar;
                    }
                }
            }
            return new m5b1(0L);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM73670i);
        return new m5b1(pp91.m70524e(0.0f, ((Number) objM73670i).floatValue()));
    }
}
