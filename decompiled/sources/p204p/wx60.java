package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class wx60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f255956a;

    public wx60(iy60 iy60Var) {
        this.f255956a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vx60 vx60Var;
        if (ibkVar instanceof vx60) {
            vx60Var = (vx60) ibkVar;
            int i = vx60Var.f245627b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vx60Var.f245627b = i - Integer.MIN_VALUE;
            } else {
                vx60Var = new vx60(this, ibkVar);
            }
        } else {
            vx60Var = new vx60(this, ibkVar);
        }
        Object obj2 = vx60Var.f245626a;
        int i2 = vx60Var.f245627b;
        w2a1 w2a1Var = w2a1.f247311a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
                return w2a1Var;
            }
            bga.m29073P(obj2);
            aj2 aj2Var = this.f255956a.f106868b;
            vx60Var.f245627b = 1;
            Object objM30139d = ((bpk) ((ck2) aj2Var).f38765d).m30139d(vx60Var);
            yuk yukVar = yuk.f276404a;
            if (objM30139d != yukVar) {
                objM30139d = w2a1Var;
            }
            return objM30139d == yukVar ? yukVar : w2a1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            na6.m63972t("Failed to clear cached response", e2);
            return w2a1Var;
        }
    }
}
