package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class oqz0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sad f168404a;

    public oqz0(sad sadVar) {
        this.f168404a = sadVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r7.mo30229d(r3, r0) == r4) goto L27;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        nqz0 nqz0Var;
        pqz0 pqz0Var;
        Object tqz0Var;
        if (ibkVar instanceof nqz0) {
            nqz0Var = (nqz0) ibkVar;
            int i = nqz0Var.f157355b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqz0Var.f157355b = i - Integer.MIN_VALUE;
            } else {
                nqz0Var = new nqz0(this, ibkVar);
            }
        } else {
            nqz0Var = new nqz0(this, ibkVar);
        }
        Object objM77620a = nqz0Var.f157354a;
        int i2 = nqz0Var.f157355b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                pqz0Var = nqz0Var.f157358e;
                bqz0Var = nqz0Var.f157357d;
                bga.m29073P(objM77620a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM77620a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM77620a);
        pqz0Var = (pqz0) obj;
        String str = pqz0Var.f180453a;
        int i3 = pqz0Var.f180454b;
        nqz0Var.f157357d = bqz0Var;
        nqz0Var.f157358e = pqz0Var;
        nqz0Var.f157355b = 1;
        objM77620a = this.f168404a.m77620a(i3, str, nqz0Var);
        if (objM77620a != yukVar) {
        }
        return yukVar;
        yqz0 yqz0Var = (yqz0) objM77620a;
        if (yqz0Var instanceof xqz0) {
            xqz0 xqz0Var = (xqz0) yqz0Var;
            tqz0Var = new tqz0(xqz0Var.f265161b, xqz0Var.f265160a, pqz0Var.f180455c);
        } else {
            if (!wj50.m88271j(yqz0Var, wqz0.f254210a)) {
                throw new NoWhenBranchMatchedException();
            }
            tqz0Var = sqz0.f213193a;
        }
        nqz0Var.f157357d = null;
        nqz0Var.f157358e = null;
        nqz0Var.f157355b = 2;
    }
}
