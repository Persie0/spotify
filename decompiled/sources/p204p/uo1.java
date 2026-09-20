package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class uo1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x7q0 f232306a;

    public uo1(x7q0 x7q0Var) {
        this.f232306a = x7q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        to1 to1Var;
        if (ibkVar instanceof to1) {
            to1Var = (to1) ibkVar;
            int i = to1Var.f222129b;
            if ((i & Integer.MIN_VALUE) != 0) {
                to1Var.f222129b = i - Integer.MIN_VALUE;
            } else {
                to1Var = new to1(this, ibkVar);
            }
        } else {
            to1Var = new to1(this, ibkVar);
        }
        Object objM90170b = to1Var.f222128a;
        int i2 = to1Var.f222129b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = to1Var.f222131d;
                bga.m29073P(objM90170b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM90170b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM90170b);
        to1Var.f222131d = bqz0Var;
        to1Var.f222129b = 1;
        objM90170b = this.f232306a.m90170b((bn1) obj, to1Var);
        if (objM90170b != yukVar) {
        }
        return yukVar;
        to1Var.f222131d = null;
        to1Var.f222129b = 2;
    }
}
