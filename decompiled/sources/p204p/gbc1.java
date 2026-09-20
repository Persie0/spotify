package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class gbc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mgq f78269a;

    public gbc1(mgq mgqVar) {
        this.f78269a = mgqVar;
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
        fbc1 fbc1Var;
        if (ibkVar instanceof fbc1) {
            fbc1Var = (fbc1) ibkVar;
            int i = fbc1Var.f67791b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fbc1Var.f67791b = i - Integer.MIN_VALUE;
            } else {
                fbc1Var = new fbc1(this, ibkVar);
            }
        } else {
            fbc1Var = new fbc1(this, ibkVar);
        }
        Object objM61729a = fbc1Var.f67790a;
        int i2 = fbc1Var.f67791b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = fbc1Var.f67793d;
                bga.m29073P(objM61729a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61729a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61729a);
        fbc1Var.f67793d = bqz0Var;
        fbc1Var.f67791b = 1;
        objM61729a = this.f78269a.m61729a((mbc1) obj, fbc1Var);
        if (objM61729a != yukVar) {
        }
        return yukVar;
        fbc1Var.f67793d = null;
        fbc1Var.f67791b = 2;
    }
}
