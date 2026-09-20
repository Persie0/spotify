package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class wey0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zey0 f250646a;

    public wey0(zey0 zey0Var) {
        this.f250646a = zey0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r8.mo30229d(r1, r0) == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v8, types: [p.pey0] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vey0 vey0Var;
        Object efy0Var;
        if (ibkVar instanceof vey0) {
            vey0Var = (vey0) ibkVar;
            int i = vey0Var.f240840b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vey0Var.f240840b = i - Integer.MIN_VALUE;
            } else {
                vey0Var = new vey0(this, ibkVar);
            }
        } else {
            vey0Var = new vey0(this, ibkVar);
        }
        Object objM75104a = vey0Var.f240839a;
        int i2 = vey0Var.f240840b;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    pey0 pey0Var = vey0Var.f240843e;
                    bqz0Var = vey0Var.f240842d;
                    bga.m29073P(objM75104a);
                    obj = pey0Var;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(objM75104a);
                }
                return w2a1.f247311a;
            }
            bga.m29073P(objM75104a);
            pey0 pey0Var2 = (pey0) obj;
            raa1 raa1Var = this.f250646a.f282152a;
            p810 p810Var = new p810(pey0Var2.f176889a);
            vey0Var.f240842d = bqz0Var;
            vey0Var.f240843e = pey0Var2;
            vey0Var.f240840b = 1;
            objM75104a = raa1Var.m75104a(p810Var, vey0Var);
            obj = pey0Var2;
            if (objM75104a == yukVar) {
            }
            return yukVar;
            efy0Var = new ffy0(obj.f176889a, ((q810) objM75104a).f186208a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            efy0Var = new efy0(obj.f176889a);
        }
        vey0Var.f240842d = null;
        vey0Var.f240843e = null;
        vey0Var.f240840b = 2;
    }
}
