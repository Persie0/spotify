package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class l8c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m8c0 f130843a;

    public l8c0(m8c0 m8c0Var) {
        this.f130843a = m8c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r3.mo30229d(r7, r2) == r6) goto L43;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        k8c0 k8c0Var;
        bqz0 bqz0Var2;
        bqz0 bqz0Var3;
        Object c6x0Var;
        Boolean bool;
        if (ibkVar instanceof k8c0) {
            k8c0Var = (k8c0) ibkVar;
            int i = k8c0Var.f120303b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k8c0Var.f120303b = i - Integer.MIN_VALUE;
            } else {
                k8c0Var = new k8c0(this, ibkVar);
            }
        } else {
            k8c0Var = new k8c0(this, ibkVar);
        }
        Object objM55635b = k8c0Var.f120302a;
        int i2 = k8c0Var.f120303b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var3 = k8c0Var.f120305d;
                    try {
                        bga.m29073P(objM55635b);
                    } catch (Throwable th) {
                        th = th;
                        bqz0Var2 = bqz0Var3;
                        c6x0Var = new c6x0(th);
                        bqz0Var3 = bqz0Var2;
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM55635b);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM55635b);
            h8c0 h8c0Var = (h8c0) obj;
            try {
                k770 k770Var = this.f130843a.f141017a;
                String str = h8c0Var.f88676c;
                z5c0 z5c0Var = h8c0Var.f88677d;
                C1940hk c1940hk = new C1940hk(null, null, null, null, Boolean.valueOf(h8c0Var.f88678e), null, null, ContentType.SHORT_FORM_ON_DEMAND);
                bqz0Var2 = bqz0Var;
                try {
                    k8c0Var.f120305d = bqz0Var2;
                    k8c0Var.f120303b = 1;
                    objM55635b = k770Var.m55635b(str, z5c0Var, c1940hk, k8c0Var);
                    if (objM55635b != yukVar) {
                        bqz0Var3 = bqz0Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c6x0Var = new c6x0(th);
                    bqz0Var3 = bqz0Var2;
                }
            } catch (Throwable th3) {
                th = th3;
                bqz0Var2 = bqz0Var;
            }
            return yukVar;
            c6x0Var = (C1940hk) objM55635b;
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            Object o8c0Var = n8c0.f151495a;
            if (thM77348a == null && (bool = ((C1940hk) c6x0Var).f92300e) != null) {
                o8c0Var = new o8c0(bool.booleanValue());
            }
            k8c0Var.f120305d = null;
            k8c0Var.f120303b = 2;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
