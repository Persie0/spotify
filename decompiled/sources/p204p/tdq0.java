package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class tdq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ geq0 f219462a;

    public tdq0(geq0 geq0Var) {
        this.f219462a = geq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.pdq0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rdq0 rdq0Var;
        Object c6x0Var;
        ?? r5;
        if (ibkVar instanceof rdq0) {
            rdq0Var = (rdq0) ibkVar;
            int i = rdq0Var.f198192b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rdq0Var.f198192b = i - Integer.MIN_VALUE;
            } else {
                rdq0Var = new rdq0(this, ibkVar);
            }
        } else {
            rdq0Var = new rdq0(this, ibkVar);
        }
        Object obj2 = rdq0Var.f198191a;
        int i2 = rdq0Var.f198192b;
        w2a1 w2a1Var = w2a1.f247311a;
        geq0 geq0Var = this.f219462a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ldq0 ldq0Var = (ldq0) obj;
                Completable completableM76740d = geq0Var.f79170a.m76740d(ldq0Var.f132320a, true);
                rdq0Var.f198194d = ldq0Var;
                rdq0Var.f198192b = 1;
                Object objM96565n = zn91.m96565n(completableM76740d, rdq0Var);
                yuk yukVar = yuk.f276404a;
                obj = ldq0Var;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ldq0 ldq0Var2 = rdq0Var.f198194d;
                bga.m29073P(obj2);
                obj = ldq0Var2;
            }
            c6x0Var = w2a1Var;
            r5 = obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
            r5 = obj;
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "%s", geq0.m44521a(geq0Var, r5));
        }
        return w2a1Var;
    }
}
