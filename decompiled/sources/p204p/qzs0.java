package p204p;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class qzs0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f194260b;

    /* JADX INFO: renamed from: c */
    public int f194261c;

    /* JADX INFO: renamed from: d */
    public int f194262d;

    /* JADX INFO: renamed from: e */
    public Object f194263e;

    public /* synthetic */ qzs0(int i) {
        this.f194260b = i;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        switch (this.f194260b) {
            case 0:
                uzs0 uzs0VarM74350e = m74350e();
                if (uzs0VarM74350e.isInitialized()) {
                    return uzs0VarM74350e;
                }
                throw new UninitializedMessageException();
            default:
                a0t0 a0t0VarM74351g = m74351g();
                if (a0t0VarM74351g.isInitialized()) {
                    return a0t0VarM74351g;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        switch (this.f194260b) {
            case 0:
                uzs0 uzs0Var = null;
                try {
                    try {
                        uzs0.f235630h.getClass();
                        m74352h(new uzs0(pweVar, buxVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        uzs0 uzs0Var2 = (uzs0) e.f10912a;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            uzs0Var = uzs0Var2;
                            if (uzs0Var != null) {
                                m74352h(uzs0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (uzs0Var != null) {
                        m74352h(uzs0Var);
                    }
                    throw th;
                }
            default:
                a0t0 a0t0Var = null;
                try {
                    try {
                        a0t0.f11162h.getClass();
                        m74353i(new a0t0(pweVar));
                        return this;
                    } catch (InvalidProtocolBufferException e2) {
                        a0t0 a0t0Var2 = (a0t0) e2.f10912a;
                        try {
                            throw e2;
                        } catch (Throwable th3) {
                            th = th3;
                            a0t0Var = a0t0Var2;
                            if (a0t0Var != null) {
                                m74353i(a0t0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (a0t0Var != null) {
                        m74353i(a0t0Var);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f194260b) {
            case 0:
                qzs0 qzs0Var = new qzs0(0);
                qzs0Var.f194263e = tzs0.f225293N0;
                qzs0Var.m74352h(m74350e());
                return qzs0Var;
            default:
                qzs0 qzs0Var2 = new qzs0(1);
                qzs0Var2.f194263e = hva.f95637a;
                qzs0Var2.m74353i(m74351g());
                return qzs0Var2;
        }
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        switch (this.f194260b) {
            case 0:
                m74352h((uzs0) a210Var);
                break;
            default:
                m74353i((a0t0) a210Var);
                break;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public uzs0 m74350e() {
        uzs0 uzs0Var = new uzs0(this);
        int i = this.f194261c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        uzs0Var.f235633c = this.f194262d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        uzs0Var.f235634d = (tzs0) this.f194263e;
        uzs0Var.f235632b = i2;
        return uzs0Var;
    }

    /* JADX INFO: renamed from: g */
    public a0t0 m74351g() {
        a0t0 a0t0Var = new a0t0(this);
        int i = this.f194261c;
        int i2 = (i & 1) != 1 ? 0 : 1;
        a0t0Var.f11165c = this.f194262d;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        a0t0Var.f11166d = (xj90) this.f194263e;
        a0t0Var.f11164b = i2;
        return a0t0Var;
    }

    /* JADX INFO: renamed from: h */
    public void m74352h(uzs0 uzs0Var) {
        tzs0 tzs0Var;
        if (uzs0Var == uzs0.f235629g) {
            return;
        }
        int i = uzs0Var.f235632b;
        if ((i & 1) == 1) {
            int i2 = uzs0Var.f235633c;
            this.f194261c = 1 | this.f194261c;
            this.f194262d = i2;
        }
        if ((i & 2) == 2) {
            tzs0 tzs0Var2 = uzs0Var.f235634d;
            if ((this.f194261c & 2) != 2 || (tzs0Var = (tzs0) this.f194263e) == tzs0.f225293N0) {
                this.f194263e = tzs0Var2;
            } else {
                rzs0 rzs0VarM82075h = tzs0.m82075h(tzs0Var);
                rzs0VarM82075h.m76833h(tzs0Var2);
                this.f194263e = rzs0VarM82075h.m76832e();
            }
            this.f194261c |= 2;
        }
        this.f149263a = this.f149263a.m48763b(uzs0Var.f235631a);
    }

    /* JADX INFO: renamed from: i */
    public void m74353i(a0t0 a0t0Var) {
        if (a0t0Var == a0t0.f11161g) {
            return;
        }
        int i = a0t0Var.f11164b;
        if ((i & 1) == 1) {
            int i2 = a0t0Var.f11165c;
            this.f194261c = 1 | this.f194261c;
            this.f194262d = i2;
        }
        if ((i & 2) == 2) {
            xj90 xj90Var = a0t0Var.f11166d;
            xj90Var.getClass();
            this.f194261c = 2 | this.f194261c;
            this.f194263e = xj90Var;
        }
        this.f149263a = this.f149263a.m48763b(a0t0Var.f11163a);
    }
}
