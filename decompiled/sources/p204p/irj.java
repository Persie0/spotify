package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class irj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ okj0 f105002a;

    public irj(okj0 okj0Var) {
        this.f105002a = okj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hrj hrjVar;
        vqj vqjVar;
        if (ibkVar instanceof hrj) {
            hrjVar = (hrj) ibkVar;
            int i = hrjVar.f94442b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrjVar.f94442b = i - Integer.MIN_VALUE;
            } else {
                hrjVar = new hrj(this, ibkVar);
            }
        } else {
            hrjVar = new hrj(this, ibkVar);
        }
        Object objM67228M = hrjVar.f94441a;
        int i2 = hrjVar.f94442b;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = hrjVar.f94444d;
                    bga.m29073P(objM67228M);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM67228M);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM67228M);
            okj0 okj0Var = this.f105002a;
            hrjVar.f94444d = bqz0Var;
            hrjVar.f94442b = 1;
            objM67228M = okj0Var.m67228M(hrjVar);
            if (objM67228M == obj2) {
            }
            return obj2;
            vqjVar = new vqj(opo.m67574x((List) objM67228M));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "ChatContentPicker: Failed to load recommendations", new Object[0]);
            vqjVar = new vqj(lv21.f137205b);
        }
        hrjVar.f94444d = null;
        hrjVar.f94442b = 2;
    }
}
