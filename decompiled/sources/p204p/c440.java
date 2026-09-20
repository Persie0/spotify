package p204p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class c440 extends x340 {

    /* JADX INFO: renamed from: R0 */
    public final Executor f33839R0;

    /* JADX INFO: renamed from: S0 */
    public final Object f33840S0 = new Object();

    /* JADX INFO: renamed from: T0 */
    public ua40 f33841T0;

    /* JADX INFO: renamed from: U0 */
    public b440 f33842U0;

    public c440(Executor executor) {
        this.f33839R0 = executor;
    }

    @Override // p204p.x340
    /* JADX INFO: renamed from: a */
    public final ua40 mo31420a(nb40 nb40Var) {
        return nb40Var.mo26025a();
    }

    @Override // p204p.x340
    /* JADX INFO: renamed from: c */
    public final void mo31421c() {
        synchronized (this.f33840S0) {
            try {
                ua40 ua40Var = this.f33841T0;
                if (ua40Var != null) {
                    ua40Var.close();
                    this.f33841T0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.x340
    /* JADX INFO: renamed from: e */
    public final void mo31422e(ua40 ua40Var) {
        synchronized (this.f33840S0) {
            try {
                if (!this.f257676Q0) {
                    ua40Var.close();
                    return;
                }
                if (this.f33842U0 != null) {
                    if (ua40Var.mo60750i1().getTimestamp() <= this.f33842U0.f139786b.mo60750i1().getTimestamp()) {
                        ua40Var.close();
                    } else {
                        ua40 ua40Var2 = this.f33841T0;
                        if (ua40Var2 != null) {
                            ua40Var2.close();
                        }
                        this.f33841T0 = ua40Var;
                    }
                    return;
                }
                b440 b440Var = new b440(ua40Var, this);
                this.f33842U0 = b440Var;
                u790 u790VarM89774b = m89774b(b440Var);
                h7u h7uVar = new h7u(b440Var, 23);
                u790VarM89774b.mo28322a(new lk00(0, u790VarM89774b, h7uVar), e95.m38202g());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
