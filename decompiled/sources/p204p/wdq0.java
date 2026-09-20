package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Completable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class wdq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ feq0 f250323a;

    public wdq0(feq0 feq0Var) {
        this.f250323a = feq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.odq0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        udq0 udq0Var;
        Object c6x0Var;
        ?? r6;
        if (ibkVar instanceof udq0) {
            udq0Var = (udq0) ibkVar;
            int i = udq0Var.f229296b;
            if ((i & Integer.MIN_VALUE) != 0) {
                udq0Var.f229296b = i - Integer.MIN_VALUE;
            } else {
                udq0Var = new udq0(this, ibkVar);
            }
        } else {
            udq0Var = new udq0(this, ibkVar);
        }
        Object obj2 = udq0Var.f229295a;
        int i2 = udq0Var.f229296b;
        w2a1 w2a1Var = w2a1.f247311a;
        feq0 feq0Var = this.f250323a;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                mdq0 mdq0Var = (mdq0) obj;
                Completable completableM76740d = feq0Var.f68817a.m76740d(mdq0Var.f142468a, false);
                udq0Var.f229298d = mdq0Var;
                udq0Var.f229296b = 1;
                Object objM96565n = zn91.m96565n(completableM76740d, udq0Var);
                yuk yukVar = yuk.f276404a;
                obj = mdq0Var;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mdq0 mdq0Var2 = udq0Var.f229298d;
                bga.m29073P(obj2);
                obj = mdq0Var2;
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
            Logger.m3967c(thM77348a, "%s", feq0.m41484a(feq0Var, r6));
        }
        return w2a1Var;
    }
}
