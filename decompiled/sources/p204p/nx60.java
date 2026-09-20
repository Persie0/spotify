package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class nx60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        mx60 mx60Var;
        if (ibkVar instanceof mx60) {
            mx60Var = (mx60) ibkVar;
            int i = mx60Var.f147972b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx60Var.f147972b = i - Integer.MIN_VALUE;
            } else {
                mx60Var = new mx60(this, ibkVar);
            }
        } else {
            mx60Var = new mx60(this, ibkVar);
        }
        Object obj2 = mx60Var.f147971a;
        int i2 = mx60Var.f147972b;
        try {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                    return w2a1.f247311a;
                }
                bga.m29073P(obj2);
                if (obj != null) {
                    throw new ClassCastException();
                }
                new Bundle();
                throw null;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Exception e2) {
            na6.m63972t("Failed to navigate to Martini", e2);
        }
    }
}
