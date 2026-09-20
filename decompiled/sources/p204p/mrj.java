package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class mrj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1v0 f146571a;

    public mrj(s1v0 s1v0Var) {
        this.f146571a = s1v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r8.mo30229d(r7, r0) == r5) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lrj lrjVar;
        uqj uqjVar;
        if (ibkVar instanceof lrj) {
            lrjVar = (lrj) ibkVar;
            int i = lrjVar.f136322b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrjVar.f136322b = i - Integer.MIN_VALUE;
            } else {
                lrjVar = new lrj(this, ibkVar);
            }
        } else {
            lrjVar = new lrj(this, ibkVar);
        }
        Object obj2 = lrjVar.f136321a;
        int i2 = lrjVar.f136322b;
        lv21 lv21Var = lv21.f137205b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = lrjVar.f136324d;
                    bga.m29073P(obj2);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(obj2);
            s1v0 s1v0Var = this.f146571a;
            lrjVar.f136324d = bqz0Var;
            lrjVar.f136322b = 1;
            if (s1v0Var.m76992a(lrjVar) == yukVar) {
            }
            return yukVar;
            uqjVar = new uqj(lv21Var);
        } catch (Exception e) {
            Logger.m3967c(e, "ChatContentPicker: Failed to clear recent searches", new Object[0]);
            uqjVar = new uqj(lv21Var);
        }
        lrjVar.f136324d = null;
        lrjVar.f136322b = 2;
    }
}
