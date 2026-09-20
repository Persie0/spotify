package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class grs implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e99 f83824a;

    public grs(e99 e99Var) {
        this.f83824a = e99Var;
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
        frs frsVar;
        if (ibkVar instanceof frs) {
            frsVar = (frs) ibkVar;
            int i = frsVar.f72657b;
            if ((i & Integer.MIN_VALUE) != 0) {
                frsVar.f72657b = i - Integer.MIN_VALUE;
            } else {
                frsVar = new frs(this, ibkVar);
            }
        } else {
            frsVar = new frs(this, ibkVar);
        }
        Object objM51469a = frsVar.f72656a;
        int i2 = frsVar.f72657b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = frsVar.f72659d;
                bga.m29073P(objM51469a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM51469a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM51469a);
        frsVar.f72659d = bqz0Var;
        frsVar.f72657b = 1;
        objM51469a = irs.m51469a(this.f83824a, (lrs) obj, frsVar);
        if (objM51469a != yukVar) {
        }
        return yukVar;
        frsVar.f72659d = null;
        frsVar.f72657b = 2;
    }
}
