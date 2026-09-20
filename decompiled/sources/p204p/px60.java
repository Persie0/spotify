package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class px60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f182221a;

    public px60(iy60 iy60Var) {
        this.f182221a = iy60Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ox60 ox60Var;
        if (ibkVar instanceof ox60) {
            ox60Var = (ox60) ibkVar;
            int i = ox60Var.f170899b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox60Var.f170899b = i - Integer.MIN_VALUE;
            } else {
                ox60Var = new ox60(this, ibkVar);
            }
        } else {
            ox60Var = new ox60(this, ibkVar);
        }
        Object obj2 = ox60Var.f170898a;
        int i2 = ox60Var.f170899b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                fx60 fx60Var = (fx60) obj;
                Bundle bundle = new Bundle();
                List list = fx60Var.f74272a;
                fbk fbkVar = null;
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        bundle.putStringArrayList("martini-chat-suggestions", new ArrayList<>(list));
                    }
                }
                h400 h400Var = fx60Var.f74273b;
                if (h400Var != null) {
                    bundle.putParcelable("martini-intent-groups", h400Var);
                }
                bundle.putBoolean("martini-open-with-keyboard", true);
                if (bundle.isEmpty()) {
                    bundle = null;
                }
                n5q n5qVar = xsr.f265651a;
                rb20 rb20Var = pvb0.f181680a;
                he30 he30Var = new he30(this.f182221a, bundle, fbkVar, 11);
                ox60Var.f170899b = 1;
                Object objM89557A = x0h1.m89557A(rb20Var, he30Var, ox60Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
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
            na6.m63972t("Failed to navigate to Martini chat", e2);
        }
        return w2a1.f247311a;
    }
}
