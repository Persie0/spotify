package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes11.dex */
public final class qdb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wkb0 f187529a;

    public qdb0(wkb0 wkb0Var) {
        this.f187529a = wkb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r8.mo30229d(r1, r0) == r5) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p.kge1] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        pdb0 pdb0Var;
        Object sge1Var;
        if (ibkVar instanceof pdb0) {
            pdb0Var = (pdb0) ibkVar;
            int i = pdb0Var.f176406b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdb0Var.f176406b = i - Integer.MIN_VALUE;
            } else {
                pdb0Var = new pdb0(this, ibkVar);
            }
        } else {
            pdb0Var = new pdb0(this, ibkVar);
        }
        Object objM96567o = pdb0Var.f176405a;
        int i2 = pdb0Var.f176406b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    kge1 kge1Var = pdb0Var.f176409e;
                    bqz0Var = pdb0Var.f176408d;
                    bga.m29073P(objM96567o);
                    obj = kge1Var;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM96567o);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM96567o);
            kge1 kge1Var2 = (kge1) obj;
            Single singleMo70632b = this.f187529a.mo70632b(kge1Var2.f122383a, null);
            pdb0Var.f176408d = bqz0Var;
            pdb0Var.f176409e = kge1Var2;
            pdb0Var.f176406b = 1;
            objM96567o = zn91.m96567o(singleMo70632b, pdb0Var);
            obj = kge1Var2;
            if (objM96567o == yukVar) {
            }
            return yukVar;
            sge1Var = new tge1(obj.f122383a, (s7f) objM96567o);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            sge1Var = new sge1(obj.f122383a, e2.getMessage());
        }
        pdb0Var.f176408d = null;
        pdb0Var.f176409e = null;
        pdb0Var.f176406b = 2;
    }
}
