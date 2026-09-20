package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ue50 {

    /* JADX INFO: renamed from: a */
    public final oab0 f229407a = new oab0(10);

    /* JADX INFO: renamed from: b */
    public final oab0 f229408b = new oab0(10);

    /* JADX INFO: renamed from: c */
    public final lsi0 f229409c = msi0.m62770a();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m82889a(qpu0 qpu0Var, ibk ibkVar) {
        se50 se50Var;
        lsi0 lsi0Var;
        if (ibkVar instanceof se50) {
            se50Var = (se50) ibkVar;
            int i = se50Var.f208215e;
            if ((i & Integer.MIN_VALUE) != 0) {
                se50Var.f208215e = i - Integer.MIN_VALUE;
            } else {
                se50Var = new se50(this, ibkVar);
            }
        } else {
            se50Var = new se50(this, ibkVar);
        }
        Object obj = se50Var.f208213c;
        int i2 = se50Var.f208215e;
        if (i2 == 0) {
            bga.m29073P(obj);
            se50Var.f208211a = qpu0Var;
            lsi0Var = this.f229409c;
            se50Var.f208212b = lsi0Var;
            se50Var.f208215e = 1;
            Object objMo54248a = lsi0Var.mo54248a(se50Var);
            yuk yukVar = yuk.f276404a;
            if (objMo54248a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lsi0 lsi0Var2 = se50Var.f208212b;
            qpu0 qpu0Var2 = se50Var.f208211a;
            bga.m29073P(obj);
            lsi0Var = lsi0Var2;
            qpu0Var = qpu0Var2;
        }
        try {
            return (vy81) this.f229408b.m66541c(qpu0Var);
        } finally {
            lsi0Var.mo54249c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82890b(qpu0 qpu0Var, vy81 vy81Var, ibk ibkVar) throws Throwable {
        te50 te50Var;
        int i;
        vy81 vy81Var2;
        jsi0 jsi0Var;
        Throwable th;
        jsi0 jsi0Var2;
        qpu0 qpu0Var2;
        vy81 vy81Var3;
        if (ibkVar instanceof te50) {
            te50Var = (te50) ibkVar;
            int i2 = te50Var.f219584g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                te50Var.f219584g = i2 - Integer.MIN_VALUE;
            } else {
                te50Var = new te50(this, ibkVar);
            }
        } else {
            te50Var = new te50(this, ibkVar);
        }
        Object obj = te50Var.f219582e;
        int i3 = te50Var.f219584g;
        yuk yukVar = yuk.f276404a;
        try {
            if (i3 == 0) {
                bga.m29073P(obj);
                te50Var.f219578a = qpu0Var;
                te50Var.f219579b = vy81Var;
                lsi0 lsi0Var = this.f229409c;
                te50Var.f219580c = lsi0Var;
                i = 0;
                te50Var.f219581d = 0;
                te50Var.f219584g = 1;
                if (lsi0Var.mo54248a(te50Var) != yukVar) {
                    vy81Var2 = vy81Var;
                    jsi0Var = lsi0Var;
                }
                return yukVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsi0Var2 = te50Var.f219580c;
                vy81Var3 = te50Var.f219579b;
                qpu0Var2 = te50Var.f219578a;
                try {
                    bga.m29073P(obj);
                    jsi0Var2.mo54249c(null);
                    return w2a1.f247311a;
                } catch (Throwable th2) {
                    th = th2;
                    jsi0Var2.mo54249c(null);
                    throw th;
                }
            }
            int i4 = te50Var.f219581d;
            jsi0Var = te50Var.f219580c;
            vy81 vy81Var4 = te50Var.f219579b;
            qpu0 qpu0Var3 = te50Var.f219578a;
            bga.m29073P(obj);
            vy81Var2 = vy81Var4;
            i = i4;
            qpu0Var = qpu0Var3;
            te50Var.f219578a = qpu0Var;
            te50Var.f219579b = vy81Var2;
            te50Var.f219580c = jsi0Var;
            te50Var.f219581d = i;
            te50Var.f219584g = 2;
            if (njg1.m64619l(0L, te50Var) != yukVar) {
                qpu0Var2 = qpu0Var;
                jsi0Var2 = jsi0Var;
                vy81Var3 = vy81Var2;
                jsi0Var2.mo54249c(null);
                return w2a1.f247311a;
            }
            return yukVar;
        } catch (Throwable th3) {
            jsi0 jsi0Var3 = jsi0Var;
            th = th3;
            jsi0Var2 = jsi0Var3;
            jsi0Var2.mo54249c(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82891c(String str, boolean z, vy81 vy81Var) {
        this.f229407a.m66542d(str + z, vy81Var);
    }
}
