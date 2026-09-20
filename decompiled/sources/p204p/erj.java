package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class erj implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ezw0 f62139a;

    public erj(ezw0 ezw0Var) {
        this.f62139a = ezw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r12.mo30229d(r1, r0) == r6) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        drj drjVar;
        Object wqjVar;
        bqz0 bqz0Var2;
        int i;
        if (ibkVar instanceof drj) {
            drjVar = (drj) ibkVar;
            int i2 = drjVar.f52338b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drjVar.f52338b = i2 - Integer.MIN_VALUE;
            } else {
                drjVar = new drj(this, ibkVar);
            }
        } else {
            drjVar = new drj(this, ibkVar);
        }
        Object objM40430z = drjVar.f52337a;
        int i3 = drjVar.f52338b;
        yuk yukVar = yuk.f276404a;
        try {
            try {
                try {
                    if (i3 == 0) {
                        bga.m29073P(objM40430z);
                        hqj hqjVar = (hqj) obj;
                        drjVar.f52340d = bqz0Var;
                        drjVar.f52341e = hqjVar;
                        drjVar.f52342f = 0;
                        drjVar.f52338b = 1;
                        if (njg1.m64619l(300L, drjVar) != yukVar) {
                            bqz0Var2 = bqz0Var;
                            i = 0;
                            obj = hqjVar;
                        }
                        return yukVar;
                    }
                    if (i3 == 1) {
                        int i4 = drjVar.f52342f;
                        hqj hqjVar2 = drjVar.f52341e;
                        bqz0Var2 = drjVar.f52340d;
                        try {
                            bga.m29073P(objM40430z);
                            i = i4;
                            obj = hqjVar2;
                        } catch (Exception e) {
                            e = e;
                            obj = hqjVar2;
                            bqz0Var = bqz0Var2;
                            Logger.m3967c(e, edb.m38564m("ChatContentPicker: Failed to search for query: ", obj.f94195a), new Object[0]);
                            wqjVar = new wqj(e);
                            drjVar.f52340d = null;
                            drjVar.f52341e = null;
                            drjVar.f52338b = 3;
                        }
                    } else if (i3 == 2) {
                        hqj hqjVar3 = drjVar.f52341e;
                        bqz0Var = drjVar.f52340d;
                        bga.m29073P(objM40430z);
                        obj = hqjVar3;
                        wqjVar = new xqj(opo.m67574x(((izy0) objM40430z).f107306a));
                        drjVar.f52340d = null;
                        drjVar.f52341e = null;
                        drjVar.f52338b = 3;
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM40430z);
                    }
                    return w2a1.f247311a;
                    ezw0 ezw0Var = this.f62139a;
                    String str = obj.f94195a;
                    eyy eyyVar = obj.f94196b;
                    drjVar.f52340d = bqz0Var2;
                    drjVar.f52341e = obj;
                    drjVar.f52342f = i;
                    drjVar.f52338b = 2;
                    objM40430z = ezw0Var.m40430z(str, eyyVar, drjVar);
                    if (objM40430z != yukVar) {
                        bqz0Var = bqz0Var2;
                        obj = obj;
                        wqjVar = new xqj(opo.m67574x(((izy0) objM40430z).f107306a));
                        drjVar.f52340d = null;
                        drjVar.f52341e = null;
                        drjVar.f52338b = 3;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bqz0Var = bqz0Var2;
                    Logger.m3967c(e, edb.m38564m("ChatContentPicker: Failed to search for query: ", obj.f94195a), new Object[0]);
                    wqjVar = new wqj(e);
                }
            } catch (Exception e3) {
                e = e3;
            }
            return yukVar;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
