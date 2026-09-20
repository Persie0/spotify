package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class yhw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0d f272985a;

    public yhw0(m0d m0dVar) {
        this.f272985a = m0dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xhw0 xhw0Var;
        Object obj2;
        if (ibkVar instanceof xhw0) {
            xhw0Var = (xhw0) ibkVar;
            int i = xhw0Var.f261722b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xhw0Var.f261722b = i - Integer.MIN_VALUE;
            } else {
                xhw0Var = new xhw0(this, ibkVar);
            }
        } else {
            xhw0Var = new xhw0(this, ibkVar);
        }
        Object objM60464a = xhw0Var.f261721a;
        int i2 = xhw0Var.f261722b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = xhw0Var.f261724d;
                bga.m29073P(objM60464a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM60464a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM60464a);
        diw0 diw0Var = (diw0) obj;
        String str = diw0Var.f49500a;
        String str2 = diw0Var.f49501b;
        xhw0Var.f261724d = bqz0Var;
        xhw0Var.f261722b = 1;
        objM60464a = this.f272985a.m60464a(str, str2, xhw0Var);
        if (objM60464a != yukVar) {
        }
        return yukVar;
        biw0 biw0Var = (biw0) objM60464a;
        if (wj50.m88271j(biw0Var, aiw0.f16101a)) {
            obj2 = jiw0.f112830a;
        } else {
            if (!wj50.m88271j(biw0Var, zhw0.f283016a)) {
                throw new NoWhenBranchMatchedException();
            }
            obj2 = iiw0.f102643a;
        }
        xhw0Var.f261724d = null;
        xhw0Var.f261722b = 2;
    }
}
