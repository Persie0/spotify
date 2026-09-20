package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class gvc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dw00 f84717a;

    public gvc0(dw00 dw00Var) {
        this.f84717a = dw00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        fvc0 fvc0Var;
        if (ibkVar instanceof fvc0) {
            fvc0Var = (fvc0) ibkVar;
            int i = fvc0Var.f73752b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvc0Var.f73752b = i - Integer.MIN_VALUE;
            } else {
                fvc0Var = new fvc0(this, ibkVar);
            }
        } else {
            fvc0Var = new fvc0(this, ibkVar);
        }
        Object objInvoke = fvc0Var.f73751a;
        int i2 = fvc0Var.f73752b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            fvc0Var.f73754d = bqz0Var;
            fvc0Var.f73752b = 1;
            objInvoke = this.f84717a.invoke(obj, fvc0Var);
            if (objInvoke != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = fvc0Var.f73754d;
            bga.m29073P(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        return w2a1.f247311a;
        fvc0Var.f73754d = null;
        fvc0Var.f73752b = 2;
    }
}
