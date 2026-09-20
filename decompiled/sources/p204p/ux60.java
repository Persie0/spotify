package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class ux60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f234838a;

    public ux60(iy60 iy60Var) {
        this.f234838a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        tx60 tx60Var;
        if (ibkVar instanceof tx60) {
            tx60Var = (tx60) ibkVar;
            int i = tx60Var.f224576b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tx60Var.f224576b = i - Integer.MIN_VALUE;
            } else {
                tx60Var = new tx60(this, ibkVar);
            }
        } else {
            tx60Var = new tx60(this, ibkVar);
        }
        Object obj2 = tx60Var.f224575a;
        int i2 = tx60Var.f224576b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ix60 ix60Var = (ix60) obj;
                wv60 wv60Var = this.f234838a.f106870d;
                String str = ix60Var.f106608a;
                String str2 = ix60Var.f106609b;
                tx60Var.f224576b = 1;
                Object objM89078a = wv60Var.m89078a(str, str2, tx60Var);
                yuk yukVar = yuk.f276404a;
                if (objM89078a == yukVar) {
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
            na6.m63972t("Failed to update draft cache", e2);
        }
        return w2a1.f247311a;
    }
}
