package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class k7l implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ft01 f120159a;

    public k7l(ft01 ft01Var) {
        this.f120159a = ft01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r13.mo30229d(r5, r0) == r4) goto L29;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        j7l j7lVar;
        Object t6lVar;
        if (ibkVar instanceof j7l) {
            j7lVar = (j7l) ibkVar;
            int i = j7lVar.f109626b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7lVar.f109626b = i - Integer.MIN_VALUE;
            } else {
                j7lVar = new j7l(this, ibkVar);
            }
        } else {
            j7lVar = new j7l(this, ibkVar);
        }
        Object objM67756d = j7lVar.f109625a;
        int i2 = j7lVar.f109626b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = j7lVar.f109628d;
                    bga.m29073P(objM67756d);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM67756d);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM67756d);
            ft01 ft01Var = this.f120159a;
            j7lVar.f109628d = bqz0Var;
            j7lVar.f109626b = 1;
            objM67756d = ((ot01) ft01Var).m67756d(j7lVar);
            if (objM67756d == yukVar) {
            }
            return yukVar;
            s7l s7lVar = (s7l) objM67756d;
            gt01 gt01Var = s7lVar.f206398c;
            t6lVar = new t6l(s7lVar.f206396a, s7lVar.f206397b, gt01Var.f84063a, gt01Var.f84066d, gt01Var.f84064b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            t6lVar = s6l.f206141a;
        }
        j7lVar.f109628d = null;
        j7lVar.f109626b = 2;
    }
}
