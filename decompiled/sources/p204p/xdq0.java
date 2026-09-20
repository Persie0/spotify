package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class xdq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ geq0 f260523a;

    public xdq0(geq0 geq0Var) {
        this.f260523a = geq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.pdq0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vdq0 vdq0Var;
        Object c6x0Var;
        ?? r6;
        if (ibkVar instanceof vdq0) {
            vdq0Var = (vdq0) ibkVar;
            int i = vdq0Var.f240477b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdq0Var.f240477b = i - Integer.MIN_VALUE;
            } else {
                vdq0Var = new vdq0(this, ibkVar);
            }
        } else {
            vdq0Var = new vdq0(this, ibkVar);
        }
        Object obj2 = vdq0Var.f240476a;
        int i2 = vdq0Var.f240477b;
        w2a1 w2a1Var = w2a1.f247311a;
        geq0 geq0Var = this.f260523a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ndq0 ndq0Var = (ndq0) obj;
                Completable completableM76740d = geq0Var.f79170a.m76740d(ndq0Var.f152823a, false);
                vdq0Var.f240479d = ndq0Var;
                vdq0Var.f240477b = 1;
                Object objM96565n = zn91.m96565n(completableM76740d, vdq0Var);
                yuk yukVar = yuk.f276404a;
                obj = ndq0Var;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ndq0 ndq0Var2 = vdq0Var.f240479d;
                bga.m29073P(obj2);
                obj = ndq0Var2;
            }
            c6x0Var = w2a1Var;
            r6 = obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
            r6 = obj;
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "%s", geq0.m44521a(geq0Var, r6));
        }
        return w2a1Var;
    }
}
