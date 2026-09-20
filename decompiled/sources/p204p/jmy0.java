package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class jmy0 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final nny0 f113962a;

    /* JADX INFO: renamed from: b */
    public boolean f113963b;

    public jmy0(nny0 nny0Var, boolean z) {
        this.f113962a = nny0Var;
        this.f113963b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) throws Throwable {
        imy0 imy0Var;
        long jM60856f;
        if (fbkVar instanceof imy0) {
            imy0Var = (imy0) fbkVar;
            int i = imy0Var.f103793d;
            if ((i & Integer.MIN_VALUE) != 0) {
                imy0Var.f103793d = i - Integer.MIN_VALUE;
            } else {
                imy0Var = new imy0(this, (ibk) fbkVar);
            }
        } else {
            imy0Var = new imy0(this, (ibk) fbkVar);
        }
        Object objM65219a = imy0Var.f103791b;
        int i2 = imy0Var.f103793d;
        if (i2 == 0) {
            bga.m29073P(objM65219a);
            jM60856f = 0;
            if (this.f113963b) {
                nny0 nny0Var = this.f113962a;
                if (!nny0Var.f156527i) {
                    imy0Var.f103790a = j2;
                    imy0Var.f103793d = 1;
                    objM65219a = nny0Var.m65219a(j2, imy0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM65219a == yukVar) {
                        return yukVar;
                    }
                }
                jM60856f = m5b1.m60856f(j2, jM60856f);
            }
            return m5b1.m60851a(jM60856f);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = imy0Var.f103790a;
        bga.m29073P(objM65219a);
        jM60856f = ((m5b1) objM65219a).m60860j();
        jM60856f = m5b1.m60856f(j2, jM60856f);
        return m5b1.m60851a(jM60856f);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        if (!this.f113963b) {
            return 0L;
        }
        nny0 nny0Var = this.f113962a;
        if (nny0Var.f156519a.mo28415b()) {
            return 0L;
        }
        return nny0Var.m65226h(nny0Var.m65222d(nny0Var.f156519a.mo28418e(nny0Var.m65222d(nny0Var.m65225g(j2)))));
    }
}
