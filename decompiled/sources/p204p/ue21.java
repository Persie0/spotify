package p204p;

import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class ue21 {

    /* JADX INFO: renamed from: a */
    public final ry71 f229379a;

    /* JADX INFO: renamed from: b */
    public final Object f229380b;

    /* JADX INFO: renamed from: c */
    public final qe70 f229381c;

    /* JADX INFO: renamed from: d */
    public final gh00 f229382d;

    /* JADX INFO: renamed from: e */
    public final c9k f229383e;

    /* JADX INFO: renamed from: f */
    public volatile Object f229384f;

    /* JADX INFO: renamed from: h */
    public volatile int f229386h;

    /* JADX INFO: renamed from: j */
    public ojp f229388j;

    /* JADX INFO: renamed from: g */
    public final AtomicInteger f229385g = new AtomicInteger(0);

    /* JADX INFO: renamed from: i */
    public final lsi0 f229387i = msi0.m62770a();

    /* JADX WARN: Multi-variable type inference failed */
    public ue21(lme lmeVar, ry71 ry71Var, gh00 gh00Var, eh00 eh00Var, o611 o611Var, luk lukVar) {
        this.f229379a = ry71Var;
        this.f229380b = gh00Var;
        this.f229381c = (qe70) eh00Var;
        this.f229382d = o611Var;
        this.f229383e = AbstractC0000a.m16o(lukVar);
        this.f229384f = lmeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [p.eh00, p.qe70] */
    /* JADX INFO: renamed from: a */
    public final Object m82874a(ojq ojqVar, int i, ibk ibkVar) {
        pe21 pe21Var;
        if (ibkVar instanceof pe21) {
            pe21Var = (pe21) ibkVar;
            int i2 = pe21Var.f176616c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pe21Var.f176616c = i2 - Integer.MIN_VALUE;
            } else {
                pe21Var = new pe21(this, ibkVar);
            }
        } else {
            pe21Var = new pe21(this, ibkVar);
        }
        Object objM76980u = pe21Var.f176614a;
        int i3 = pe21Var.f176616c;
        if (i3 == 0) {
            bga.m29073P(objM76980u);
            t9c t9cVar = new t9c(ojqVar, null, 1);
            pe21Var.f176616c = 1;
            objM76980u = s1h1.m76980u(i, t9cVar, pe21Var);
            yuk yukVar = yuk.f276404a;
            if (objM76980u == yukVar) {
                return yukVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM76980u);
        }
        return objM76980u == null ? this.f229381c.invoke() : objM76980u;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[Catch: all -> 0x009d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009d, blocks: (B:22:0x0053, B:34:0x0070), top: B:52:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82875b(int i, ibk ibkVar) throws Throwable {
        re21 re21Var;
        lsi0 lsi0Var;
        int i2;
        Throwable th;
        pjq pjqVarM89574q;
        if (ibkVar instanceof re21) {
            re21Var = (re21) ibkVar;
            int i3 = re21Var.f198260e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                re21Var.f198260e = i3 - Integer.MIN_VALUE;
            } else {
                re21Var = new re21(this, ibkVar);
            }
        } else {
            re21Var = new re21(this, ibkVar);
        }
        Object obj = re21Var.f198258c;
        int i4 = re21Var.f198260e;
        Object obj2 = yuk.f276404a;
        try {
            if (i4 == 0) {
                bga.m29073P(obj);
                lsi0Var = this.f229387i;
                re21Var.f198257b = lsi0Var;
                re21Var.f198256a = i;
                re21Var.f198260e = 1;
                if (lsi0Var.mo54248a(re21Var) == obj2) {
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
                return obj;
            }
            i = re21Var.f198256a;
            lsi0Var = re21Var.f198257b;
            bga.m29073P(obj);
            ojp ojpVar = this.f229388j;
            AtomicInteger atomicInteger = this.f229385g;
            if (ojpVar != null) {
                try {
                    if (ojpVar.f166107a && ojpVar.f166108b == atomicInteger.get()) {
                        pjqVarM89574q = (pjq) ojpVar.f166109c;
                    } else {
                        int iIncrementAndGet = atomicInteger.incrementAndGet();
                        try {
                            pjqVarM89574q = x0h1.m89574q(this.f229383e, null, 0, new se21(true, this, i2, iIncrementAndGet, null), 3);
                            this.f229388j = new ojp(iIncrementAndGet, true, pjqVarM89574q);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            lsi0Var.mo54249c(null);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    lsi0Var.mo54249c(null);
                    throw th;
                }
            } else {
                int iIncrementAndGet2 = atomicInteger.incrementAndGet();
                pjqVarM89574q = x0h1.m89574q(this.f229383e, null, 0, new se21(true, this, i2, iIncrementAndGet2, null), 3);
                this.f229388j = new ojp(iIncrementAndGet2, true, pjqVarM89574q);
            }
            lsi0Var.mo54249c(null);
            re21Var.f198257b = null;
            re21Var.f198256a = i2;
            re21Var.f198260e = 2;
            Object objM82874a = m82874a(pjqVarM89574q, i2, re21Var);
            return objM82874a == obj2 ? obj2 : objM82874a;
        } catch (Throwable th4) {
            th = th4;
        }
        i2 = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, p.gh00] */
    /* JADX INFO: renamed from: c */
    public final Object m82876c(int i, ibk ibkVar) throws Throwable {
        te21 te21Var;
        lsi0 lsi0Var;
        int i2;
        Throwable th;
        int i3;
        pjq pjqVarM89574q;
        if (ibkVar instanceof te21) {
            te21Var = (te21) ibkVar;
            int i4 = te21Var.f219561e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                te21Var.f219561e = i4 - Integer.MIN_VALUE;
            } else {
                te21Var = new te21(this, ibkVar);
            }
        } else {
            te21Var = new te21(this, ibkVar);
        }
        Object obj = te21Var.f219559c;
        Object obj2 = yuk.f276404a;
        int i5 = te21Var.f219561e;
        try {
            try {
                if (i5 == 0) {
                    bga.m29073P(obj);
                    lsi0Var = this.f229387i;
                    te21Var.f219558b = lsi0Var;
                    te21Var.f219557a = i;
                    te21Var.f219561e = 1;
                    if (lsi0Var.mo54248a(te21Var) == obj2) {
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                i = te21Var.f219557a;
                lsi0Var = te21Var.f219558b;
                bga.m29073P(obj);
                if (this.f229386h == i3 && !((Boolean) this.f229380b.invoke(this.f229384f)).booleanValue()) {
                    Object obj3 = this.f229384f;
                    lsi0Var.mo54249c(null);
                    return obj3;
                }
                ojp ojpVar = this.f229388j;
                if (ojpVar == null || ojpVar.f166108b != i3) {
                    try {
                        pjqVarM89574q = x0h1.m89574q(this.f229383e, null, 0, new se21(false, this, i2, i3, null), 3);
                        this.f229388j = new ojp(i3, false, pjqVarM89574q);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    pjqVarM89574q = (pjq) ojpVar.f166109c;
                }
                lsi0Var.mo54249c(null);
                te21Var.f219558b = null;
                te21Var.f219557a = i2;
                te21Var.f219561e = 2;
                Object objM82874a = m82874a(pjqVarM89574q, i2, te21Var);
                return objM82874a == obj2 ? obj2 : objM82874a;
            } catch (Throwable th3) {
                th = th3;
            }
            i3 = this.f229385g.get();
        } catch (Throwable th4) {
            th = th4;
        }
        i2 = i;
        th = th;
        lsi0Var.mo54249c(null);
        throw th;
    }
}
