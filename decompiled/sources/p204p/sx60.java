package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class sx60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f214823a;

    public sx60(iy60 iy60Var) {
        this.f214823a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rx60 rx60Var;
        if (ibkVar instanceof rx60) {
            rx60Var = (rx60) ibkVar;
            int i = rx60Var.f203514b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rx60Var.f203514b = i - Integer.MIN_VALUE;
            } else {
                rx60Var = new rx60(this, ibkVar);
            }
        } else {
            rx60Var = new rx60(this, ibkVar);
        }
        Object obj2 = rx60Var.f203513a;
        int i2 = rx60Var.f203514b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                ov60 ov60Var = this.f214823a.f106869c;
                rx60Var.f203514b = 1;
                Object objM68124a = ov60Var.m68124a(rx60Var);
                yuk yukVar = yuk.f276404a;
                if (objM68124a == yukVar) {
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
            na6.m63972t("Failed to mark disclaimer as seen", e2);
        }
        return w2a1.f247311a;
    }
}
