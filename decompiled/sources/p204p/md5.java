package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes8.dex */
public final class md5 implements zqa0 {

    /* JADX INFO: renamed from: a */
    public final od5 f142309a;

    /* JADX INFO: renamed from: b */
    public final er70 f142310b;

    /* JADX INFO: renamed from: c */
    public final luk f142311c;

    public md5(od5 od5Var, er70 er70Var, luk lukVar) {
        this.f142309a = od5Var;
        this.f142310b = er70Var;
        this.f142311c = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m61509b(md5 md5Var, gx70 gx70Var, ibk ibkVar) {
        ld5 ld5Var;
        if (ibkVar instanceof ld5) {
            ld5Var = (ld5) ibkVar;
            int i = ld5Var.f132053d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld5Var.f132053d = i - Integer.MIN_VALUE;
            } else {
                ld5Var = new ld5(md5Var, ibkVar);
            }
        } else {
            ld5Var = new ld5(md5Var, ibkVar);
        }
        Object obj = ld5Var.f132051b;
        int i2 = ld5Var.f132053d;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gx70 gx70Var2 = ld5Var.f132050a;
                bga.m29073P(obj);
                return w2a1Var;
            }
            bga.m29073P(obj);
            ld5Var.f132050a = gx70Var;
            ld5Var.f132053d = 1;
            gx70Var.f85209a.f152658a.onSuccess(new rk91("cold_startup"));
            yuk yukVar = yuk.f276404a;
            return w2a1Var == yukVar ? yukVar : w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m3967c(th, "[AppReadiness] Startup settled action failed: ".concat(gx70Var.getClass().getName()), new Object[0]);
            return w2a1Var;
        }
    }

    @Override // p204p.zqa0
    /* JADX INFO: renamed from: a */
    public final void mo61431a(gb80 gb80Var) {
        ub80 ub80VarM58232p = l5h1.m58232p(gb80Var);
        x0h1.m89578u(ub80VarM58232p, this.f142311c, 0, new jr4(this, ub80VarM58232p, null, 3), 2);
    }
}
