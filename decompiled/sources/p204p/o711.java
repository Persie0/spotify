package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class o711 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ msd f162448a;

    public o711(msd msdVar) {
        this.f162448a = msdVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r11.mo30229d(r10, r5) == r8) goto L30;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        n711 n711Var;
        Object b711Var;
        if (ibkVar instanceof n711) {
            n711Var = (n711) ibkVar;
            int i = n711Var.f151034b;
            if ((i & Integer.MIN_VALUE) != 0) {
                n711Var.f151034b = i - Integer.MIN_VALUE;
            } else {
                n711Var = new n711(this, ibkVar);
            }
        } else {
            n711Var = new n711(this, ibkVar);
        }
        n711 n711Var2 = n711Var;
        Object objM42573a = n711Var2.f151033a;
        int i2 = n711Var2.f151034b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    bqz0Var = n711Var2.f151036d;
                    bga.m29073P(objM42573a);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM42573a);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM42573a);
            x611 x611Var = (x611) obj;
            msd msdVar = this.f162448a;
            Set set = dd41.f47702f;
            dd41 dd41VarM74726U = r46.m74726U(x611Var.f258560a);
            boolean z = x611Var.f258561b;
            n711Var2.f151036d = bqz0Var;
            n711Var2.f151034b = 1;
            objM42573a = ft01.m42573a(msdVar.f146755a, dd41VarM74726U, z, null, n711Var2, 10);
            if (objM42573a == yukVar) {
            }
            return yukVar;
            gt01 gt01Var = (gt01) objM42573a;
            b711Var = new b711(gt01Var.f84066d.f178681a, gt01Var.f84063a, gt01Var.f84064b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            b711Var = a711.f12919a;
        }
        n711Var2.f151036d = null;
        n711Var2.f151034b = 2;
    }
}
