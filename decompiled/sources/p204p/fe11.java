package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class fe11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ le11 f68656a;

    public fe11(le11 le11Var) {
        this.f68656a = le11Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ee11 ee11Var;
        if (ibkVar instanceof ee11) {
            ee11Var = (ee11) ibkVar;
            int i = ee11Var.f58648b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ee11Var.f58648b = i - Integer.MIN_VALUE;
            } else {
                ee11Var = new ee11(this, ibkVar);
            }
        } else {
            ee11Var = new ee11(this, ibkVar);
        }
        Object obj2 = ee11Var.f58647a;
        int i2 = ee11Var.f58648b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                CompletableObserveOn completableObserveOnM70885b = this.f68656a.f132428c.m70885b(((vd11) obj).f240298a, "", 2, "");
                ee11Var.f58648b = 1;
                Object objM96565n = zn91.m96565n(completableObserveOnM70885b, ee11Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return w2a1.f247311a;
    }
}
