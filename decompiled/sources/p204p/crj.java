package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class crj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1v0 f41304a;

    public crj(s1v0 s1v0Var) {
        this.f41304a = s1v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        brj brjVar;
        if (ibkVar instanceof brj) {
            brjVar = (brj) ibkVar;
            int i = brjVar.f30102b;
            if ((i & Integer.MIN_VALUE) != 0) {
                brjVar.f30102b = i - Integer.MIN_VALUE;
            } else {
                brjVar = new brj(this, ibkVar);
            }
        } else {
            brjVar = new brj(this, ibkVar);
        }
        Object obj2 = brjVar.f30101a;
        int i2 = brjVar.f30102b;
        try {
            if (i2 == 0) {
                bga.m29073P(obj2);
                gqj gqjVar = (gqj) obj;
                s1v0 s1v0Var = this.f41304a;
                vbv vbvVar = gqjVar.f83484a;
                brjVar.f30102b = 1;
                Object objM76994c = s1v0Var.m76994c(vbvVar, brjVar);
                yuk yukVar = yuk.f276404a;
                if (objM76994c == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
        } catch (Exception e) {
            Logger.m3967c(e, "ChatContentPicker: Failed to save recent search", new Object[0]);
        }
        return w2a1.f247311a;
    }
}
