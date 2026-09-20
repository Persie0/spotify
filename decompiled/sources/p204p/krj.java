package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class krj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1v0 f125660a;

    public krj(s1v0 s1v0Var) {
        this.f125660a = s1v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L31;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        jrj jrjVar;
        Object tqjVar;
        if (ibkVar instanceof jrj) {
            jrjVar = (jrj) ibkVar;
            int i = jrjVar.f115202b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jrjVar.f115202b = i - Integer.MIN_VALUE;
            } else {
                jrjVar = new jrj(this, ibkVar);
            }
        } else {
            jrjVar = new jrj(this, ibkVar);
        }
        Object objM76993b = jrjVar.f115201a;
        int i2 = jrjVar.f115202b;
        Object obj2 = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = jrjVar.f115204d;
                    bga.m29073P(objM76993b);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM76993b);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM76993b);
            s1v0 s1v0Var = this.f125660a;
            jrjVar.f115204d = bqz0Var;
            jrjVar.f115202b = 1;
            objM76993b = s1v0Var.m76993b(jrjVar);
            if (objM76993b == obj2) {
            }
            return obj2;
            tqjVar = new uqj(opo.m67574x((List) objM76993b));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "ChatContentPicker: Failed to load recent searches", new Object[0]);
            tqjVar = new tqj(e2);
        }
        jrjVar.f115204d = null;
        jrjVar.f115202b = 2;
    }
}
