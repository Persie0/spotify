package p204p;

import android.database.SQLException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class g8n0 implements gy81, abu0 {

    /* JADX INFO: renamed from: a */
    public final ri00 f77559a;

    /* JADX INFO: renamed from: b */
    public final yyx0 f77560b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f77561c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d */
    public fy81 f77562d;

    /* JADX WARN: Multi-variable type inference failed */
    public g8n0(th00 th00Var, yyx0 yyx0Var) {
        this.f77559a = (ri00) th00Var;
        this.f77560b = yyx0Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [p.ri00, p.th00] */
    @Override // p204p.gy81
    /* JADX INFO: renamed from: a */
    public final Object mo43962a(fy81 fy81Var, th00 th00Var, mb61 mb61Var) {
        return this.f77559a.invoke(new js3(this, fy81Var, th00Var, (fbk) null), mb61Var);
    }

    @Override // p204p.abu0
    /* JADX INFO: renamed from: b */
    public final yyx0 mo25389b() {
        return this.f77560b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.ri00, p.th00] */
    @Override // p204p.f9q0
    /* JADX INFO: renamed from: c */
    public final Object mo31798c(String str, gh00 gh00Var, ibk ibkVar) {
        e8n0 e8n0Var;
        if (ibkVar instanceof e8n0) {
            e8n0Var = (e8n0) ibkVar;
            int i = e8n0Var.f57237e;
            if ((i & Integer.MIN_VALUE) != 0) {
                e8n0Var.f57237e = i - Integer.MIN_VALUE;
            } else {
                e8n0Var = new e8n0(this, ibkVar);
            }
        } else {
            e8n0Var = new e8n0(this, ibkVar);
        }
        Object objMo43963d = e8n0Var.f57235c;
        int i2 = e8n0Var.f57237e;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo43963d);
            e8n0Var.f57233a = str;
            e8n0Var.f57234b = gh00Var;
            e8n0Var.f57237e = 1;
            objMo43963d = mo43963d(e8n0Var);
            if (objMo43963d != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo43963d);
            return objMo43963d;
        }
        gh00Var = e8n0Var.f57234b;
        str = e8n0Var.f57233a;
        bga.m29073P(objMo43963d);
        if (((Boolean) objMo43963d).booleanValue()) {
            f8n0 f8n0Var = new f8n0(this, str, gh00Var, null);
            e8n0Var.f57233a = null;
            e8n0Var.f57234b = null;
            e8n0Var.f57237e = 2;
            Object objInvoke = this.f77559a.invoke(f8n0Var, e8n0Var);
            return objInvoke == obj ? obj : objInvoke;
        }
        ezx0 ezx0VarMo63454G1 = this.f77560b.mo63454G1(str);
        try {
            Object objInvoke2 = gh00Var.invoke(ezx0VarMo63454G1);
            mif1.m61875i(ezx0VarMo63454G1, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                mif1.m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    @Override // p204p.gy81
    /* JADX INFO: renamed from: d */
    public final Boolean mo43963d(fbk fbkVar) {
        return qyg1.m74178H(this.f77562d != null || this.f77560b.mo63456w());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m43964e(fy81 fy81Var, th00 th00Var, ibk ibkVar) {
        d8n0 d8n0Var;
        if (ibkVar instanceof d8n0) {
            d8n0Var = (d8n0) ibkVar;
            int i = d8n0Var.f46492d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d8n0Var.f46492d = i - Integer.MIN_VALUE;
            } else {
                d8n0Var = new d8n0(this, ibkVar);
            }
        } else {
            d8n0Var = new d8n0(this, ibkVar);
        }
        Object objInvoke = d8n0Var.f46490b;
        int i2 = d8n0Var.f46492d;
        AtomicInteger atomicInteger = this.f77561c;
        int i3 = 1;
        yyx0 yyx0Var = this.f77560b;
        try {
            if (i2 == 0) {
                bga.m29073P(objInvoke);
                int iOrdinal = fy81Var.ordinal();
                if (iOrdinal == 0) {
                    mif1.m61880o(yyx0Var, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    mif1.m61880o(yyx0Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mif1.m61880o(yyx0Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f77562d = fy81Var;
                }
                Object c8n0Var = new c8n0(this);
                d8n0Var.f46489a = 1;
                d8n0Var.f46492d = 1;
                objInvoke = th00Var.invoke(c8n0Var, d8n0Var);
                Object obj = yuk.f276404a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = d8n0Var.f46489a;
                bga.m29073P(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f77562d = null;
            }
            if (i3 != 0) {
                mif1.m61880o(yyx0Var, "END TRANSACTION");
                return objInvoke;
            }
            mif1.m61880o(yyx0Var, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f77562d = null;
                    }
                    mif1.m61880o(yyx0Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    y85.m93061f(th, e);
                }
                throw th2;
            }
        }
    }
}
