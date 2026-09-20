package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xnl0 implements zev0 {

    /* JADX INFO: renamed from: a */
    public final a9i0 f263685a;

    /* JADX INFO: renamed from: b */
    public final f9d0 f263686b;

    /* JADX INFO: renamed from: c */
    public pjq f263687c;

    /* JADX INFO: renamed from: d */
    public final lsi0 f263688d = msi0.m62770a();

    public xnl0(a9i0 a9i0Var, f9d0 f9d0Var) {
        this.f263685a = a9i0Var;
        this.f263686b = f9d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r6 == r4) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m91507b(xnl0 xnl0Var, ibk ibkVar) {
        wnl0 wnl0Var;
        if (ibkVar instanceof wnl0) {
            wnl0Var = (wnl0) ibkVar;
            int i = wnl0Var.f253215c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wnl0Var.f253215c = i - Integer.MIN_VALUE;
            } else {
                wnl0Var = new wnl0(xnl0Var, ibkVar);
            }
        } else {
            wnl0Var = new wnl0(xnl0Var, ibkVar);
        }
        Object objM25130l = wnl0Var.f253213a;
        int i2 = wnl0Var.f253215c;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bga.m29073P(objM25130l);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM25130l);
            }
            return new yev0(1, (List) objM25130l);
        }
        bga.m29073P(objM25130l);
        a9i0 a9i0Var = xnl0Var.f263685a;
        wnl0Var.f253215c = 1;
        objM25130l = a9i0Var.m25130l();
        if (objM25130l != yukVar) {
        }
        return yukVar;
        o9z o9zVar = (o9z) objM25130l;
        if (!(o9zVar instanceof m9z)) {
            throw new IllegalStateException("Spotify MediaBrowser not found");
        }
        kcj0 kcj0VarMo38873a = xnl0Var.f263686b.mo38873a(((m9z) o9zVar).m61232a());
        wnl0Var.f253215c = 2;
        objM25130l = kcj0VarMo38873a.m56097u(wnl0Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5, types: [p.jsi0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // p204p.zev0
    /* JADX INFO: renamed from: a */
    public final Object mo52454a(ibk ibkVar) {
        vnl0 vnl0Var;
        jsi0 jsi0Var;
        int i;
        ojq ojqVar;
        ?? r1;
        Object objMo26597I;
        if (ibkVar instanceof vnl0) {
            vnl0Var = (vnl0) ibkVar;
            int i2 = vnl0Var.f243162e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vnl0Var.f243162e = i2 - Integer.MIN_VALUE;
            } else {
                vnl0Var = new vnl0(this, ibkVar);
            }
        } else {
            vnl0Var = new vnl0(this, ibkVar);
        }
        Object objM56684z = vnl0Var.f243160c;
        ?? r2 = vnl0Var.f243162e;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        try {
            if (r2 == 0) {
                bga.m29073P(objM56684z);
                lsi0 lsi0Var = this.f263688d;
                vnl0Var.f243158a = lsi0Var;
                vnl0Var.f243159b = 0;
                vnl0Var.f243162e = 1;
                if (lsi0Var.mo54248a(vnl0Var) != yukVar) {
                    jsi0Var = lsi0Var;
                    i = 0;
                }
                return yukVar;
            }
            if (r2 == 1) {
                int i3 = vnl0Var.f243159b;
                jsi0 jsi0Var2 = vnl0Var.f243158a;
                bga.m29073P(objM56684z);
                i = i3;
                jsi0Var = jsi0Var2;
            } else {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM56684z);
                    return objM56684z;
                }
                jsi0 jsi0Var3 = vnl0Var.f243158a;
                bga.m29073P(objM56684z);
                r2 = jsi0Var3;
            }
            r2 = jsi0Var;
            ojqVar = (ojq) objM56684z;
            r1 = r2;
            r1.mo54249c(null);
            vnl0Var.f243158a = null;
            vnl0Var.f243162e = 3;
            objMo26597I = ojqVar.mo26597I(vnl0Var);
            if (objMo26597I == yukVar) {
                return yukVar;
            }
            return objMo26597I;
            ojqVar = this.f263687c;
            if (ojqVar != null) {
                r1 = jsi0Var;
                r1.mo54249c(null);
                vnl0Var.f243158a = null;
                vnl0Var.f243162e = 3;
                objMo26597I = ojqVar.mo26597I(vnl0Var);
                if (objMo26597I == yukVar) {
                    return objMo26597I;
                }
            } else {
                qff0 qff0Var = new qff0(this, fbkVar, 26);
                vnl0Var.f243158a = jsi0Var;
                vnl0Var.f243159b = i;
                vnl0Var.f243162e = 2;
                objM56684z = kk40.m56684z(qff0Var, vnl0Var);
                if (objM56684z == yukVar) {
                    r2 = jsi0Var;
                } else {
                    r2 = jsi0Var;
                    ojqVar = (ojq) objM56684z;
                    r1 = r2;
                    r1.mo54249c(null);
                    vnl0Var.f243158a = null;
                    vnl0Var.f243162e = 3;
                    objMo26597I = ojqVar.mo26597I(vnl0Var);
                    if (objMo26597I == yukVar) {
                        return objMo26597I;
                    }
                }
            }
            return yukVar;
        } catch (Throwable th) {
            r2.mo54249c(null);
            throw th;
        }
    }
}
