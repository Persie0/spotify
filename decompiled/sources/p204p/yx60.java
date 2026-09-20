package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class yx60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f277143a;

    public yx60(iy60 iy60Var) {
        this.f277143a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xx60 xx60Var;
        if (ibkVar instanceof xx60) {
            xx60Var = (xx60) ibkVar;
            int i = xx60Var.f266877b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xx60Var.f266877b = i - Integer.MIN_VALUE;
            } else {
                xx60Var = new xx60(this, ibkVar);
            }
        } else {
            xx60Var = new xx60(this, ibkVar);
        }
        Object obj2 = xx60Var.f266876a;
        int i2 = xx60Var.f266877b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                hx60 hx60Var = (hx60) obj;
                aj2 aj2Var = this.f277143a.f106868b;
                String str = hx60Var.f96147a;
                xx60Var.f266877b = 1;
                Object objM33060Q = ((ck2) aj2Var).m33060Q(str, xx60Var);
                yuk yukVar = yuk.f276404a;
                if (objM33060Q == yukVar) {
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
        } catch (Exception e2) {
            na6.m63972t("Failed to start a new cached conversation", e2);
        }
        return w2a1.f247311a;
    }
}
