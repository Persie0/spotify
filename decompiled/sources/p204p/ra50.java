package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class ra50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wa50 f197201a;

    public ra50(wa50 wa50Var) {
        this.f197201a = wa50Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.y950] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qa50 qa50Var;
        z650 z650Var;
        if (ibkVar instanceof qa50) {
            qa50Var = (qa50) ibkVar;
            int i = qa50Var.f186755b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa50Var.f186755b = i - Integer.MIN_VALUE;
            } else {
                qa50Var = new qa50(this, ibkVar);
            }
        } else {
            qa50Var = new qa50(this, ibkVar);
        }
        Object objM84053a = qa50Var.f186754a;
        int i2 = qa50Var.f186755b;
        wa50 wa50Var = this.f197201a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM84053a);
                y950 y950Var = (y950) obj;
                uvc uvcVar = wa50Var.f249393c;
                d850 d850Var = y950Var.f270508b;
                String str = (d850Var == null || (z650Var = d850Var.f46380a) == null) ? null : z650Var.f279709a;
                qa50Var.f186757d = y950Var;
                qa50Var.f186755b = 1;
                objM84053a = uvcVar.m84053a(str, qa50Var);
                yuk yukVar = yuk.f276404a;
                obj = y950Var;
                if (objM84053a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y950 y950Var2 = qa50Var.f186757d;
                bga.m29073P(objM84053a);
                obj = y950Var2;
            }
            yvc yvcVar = (yvc) objM84053a;
            if (!(yvcVar instanceof wvc)) {
                d850 d850VarM94684a = yvcVar.m94684a(obj.f270508b);
                Bundle bundle = new Bundle();
                String str2 = obj.f270507a;
                if (str2 != null) {
                    bundle.putString("martini-prompt", str2);
                    bundle.putBoolean("martini-open-with-keyboard", false);
                    bundle.putBoolean("martini-resume-playback-after-tts", obj.f270509c);
                } else {
                    bundle.putBoolean("martini-open-with-keyboard", true);
                }
                n430 n430Var = wa50Var.f249391a;
                he90 he90VarM47528g = hhg1.m47528g(wa50.f249386M0);
                he90VarM47528g.m47295y(d850VarM94684a);
                n430Var.mo47348i(he90VarM47528g.m47272b(), bundle);
            }
        } catch (Exception e) {
            na6.m63972t("Effect handling failed for " + obj, e);
        }
        return w2a1.f247311a;
    }
}
