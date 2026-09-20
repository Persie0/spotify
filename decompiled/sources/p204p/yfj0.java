package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yfj0 {

    /* JADX INFO: renamed from: a */
    public dgj0 f272271a;

    /* JADX INFO: renamed from: b */
    public dgj0 f272272b;

    /* JADX INFO: renamed from: c */
    public qe70 f272273c = new ccj0(this, 6);

    /* JADX INFO: renamed from: d */
    public xuk f272274d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
    
        return r7;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m93563a(long j, long j2, ibk ibkVar) {
        wfj0 wfj0Var;
        long jM60860j;
        if (ibkVar instanceof wfj0) {
            wfj0Var = (wfj0) ibkVar;
            int i = wfj0Var.f250859c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfj0Var.f250859c = i - Integer.MIN_VALUE;
            } else {
                wfj0Var = new wfj0(this, ibkVar);
            }
        } else {
            wfj0Var = new wfj0(this, ibkVar);
        }
        wfj0 wfj0Var2 = wfj0Var;
        Object objMo25862S0 = wfj0Var2.f250857a;
        int i2 = wfj0Var2.f250859c;
        if (i2 == 0) {
            bga.m29073P(objMo25862S0);
            dgj0 dgj0Var = this.f272271a;
            dgj0 dgj0Var2 = null;
            dgj0 dgj0Var3 = (dgj0Var == null || !dgj0Var.f63766L0) ? null : (dgj0) vj50.m85738t(dgj0Var);
            jM60860j = 0;
            yuk yukVar = yuk.f276404a;
            if (dgj0Var3 == null) {
                dgj0 dgj0Var4 = this.f272272b;
                if (dgj0Var4 != null) {
                    wfj0Var2.f250859c = 1;
                    objMo25862S0 = dgj0Var4.mo25862S0(j, j2, wfj0Var2);
                }
            } else {
                dgj0 dgj0Var5 = this.f272271a;
                if (dgj0Var5 != null && dgj0Var5.f63766L0) {
                    dgj0Var2 = (dgj0) vj50.m85738t(dgj0Var5);
                }
                if (dgj0Var2 != null) {
                    wfj0Var2.f250859c = 2;
                    objMo25862S0 = dgj0Var2.mo25862S0(j, j2, wfj0Var2);
                } else {
                    jM60860j = 0;
                }
            }
        } else if (i2 == 1) {
            bga.m29073P(objMo25862S0);
            jM60860j = ((m5b1) objMo25862S0).m60860j();
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo25862S0);
            jM60860j = ((m5b1) objMo25862S0).m60860j();
        }
        return m5b1.m60851a(jM60860j);
    }

    /* JADX INFO: renamed from: b */
    public final long m93564b(int i, long j, long j2) {
        dgj0 dgj0Var = this.f272271a;
        dgj0 dgj0Var2 = null;
        if (dgj0Var != null && dgj0Var.f63766L0) {
            dgj0Var2 = (dgj0) vj50.m85738t(dgj0Var);
        }
        dgj0 dgj0Var3 = dgj0Var2;
        if (dgj0Var3 != null) {
            return dgj0Var3.mo25863k0(i, j, j2);
        }
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m93565c(long j, ibk ibkVar) {
        xfj0 xfj0Var;
        long jM60860j;
        if (ibkVar instanceof xfj0) {
            xfj0Var = (xfj0) ibkVar;
            int i = xfj0Var.f261031c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xfj0Var.f261031c = i - Integer.MIN_VALUE;
            } else {
                xfj0Var = new xfj0(this, ibkVar);
            }
        } else {
            xfj0Var = new xfj0(this, ibkVar);
        }
        Object objMo25864m0 = xfj0Var.f261029a;
        int i2 = xfj0Var.f261031c;
        if (i2 == 0) {
            bga.m29073P(objMo25864m0);
            dgj0 dgj0Var = this.f272271a;
            dgj0 dgj0Var2 = null;
            if (dgj0Var != null && dgj0Var.f63766L0) {
                dgj0Var2 = (dgj0) vj50.m85738t(dgj0Var);
            }
            if (dgj0Var2 != null) {
                xfj0Var.f261031c = 1;
                objMo25864m0 = dgj0Var2.mo25864m0(j, xfj0Var);
                yuk yukVar = yuk.f276404a;
                if (objMo25864m0 == yukVar) {
                    return yukVar;
                }
            } else {
                jM60860j = 0;
            }
            return m5b1.m60851a(jM60860j);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objMo25864m0);
        jM60860j = ((m5b1) objMo25864m0).m60860j();
        return m5b1.m60851a(jM60860j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: d */
    public final xuk m93566d() {
        xuk xukVar = (xuk) this.f272273c.invoke();
        if (xukVar != null) {
            return xukVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
