package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class sdq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ feq0 f208073a;

    public sdq0(feq0 feq0Var) {
        this.f208073a = feq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.odq0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qdq0 qdq0Var;
        Object c6x0Var;
        ?? r5;
        if (ibkVar instanceof qdq0) {
            qdq0Var = (qdq0) ibkVar;
            int i = qdq0Var.f187739b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qdq0Var.f187739b = i - Integer.MIN_VALUE;
            } else {
                qdq0Var = new qdq0(this, ibkVar);
            }
        } else {
            qdq0Var = new qdq0(this, ibkVar);
        }
        Object obj2 = qdq0Var.f187738a;
        int i2 = qdq0Var.f187739b;
        w2a1 w2a1Var = w2a1.f247311a;
        feq0 feq0Var = this.f208073a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                kdq0 kdq0Var = (kdq0) obj;
                Completable completableM76740d = feq0Var.f68817a.m76740d(kdq0Var.f121722a, true);
                qdq0Var.f187741d = kdq0Var;
                qdq0Var.f187739b = 1;
                Object objM96565n = zn91.m96565n(completableM76740d, qdq0Var);
                yuk yukVar = yuk.f276404a;
                obj = kdq0Var;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kdq0 kdq0Var2 = qdq0Var.f187741d;
                bga.m29073P(obj2);
                obj = kdq0Var2;
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
            Logger.m3967c(thM77348a, "%s", feq0.m41484a(feq0Var, r5));
        }
        return w2a1Var;
    }
}
