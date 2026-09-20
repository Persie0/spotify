package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class wnw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ znw0 f253306a;

    public wnw0(znw0 znw0Var) {
        this.f253306a = znw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vnw0 vnw0Var;
        if (ibkVar instanceof vnw0) {
            vnw0Var = (vnw0) ibkVar;
            int i = vnw0Var.f243259b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnw0Var.f243259b = i - Integer.MIN_VALUE;
            } else {
                vnw0Var = new vnw0(this, ibkVar);
            }
        } else {
            vnw0Var = new vnw0(this, ibkVar);
        }
        Object objM92265n = vnw0Var.f243258a;
        int i2 = vnw0Var.f243259b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = vnw0Var.f243261d;
                bga.m29073P(objM92265n);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM92265n);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM92265n);
        xvx0 xvx0Var = this.f253306a.f284568a;
        vnw0Var.f243261d = bqz0Var;
        vnw0Var.f243259b = 1;
        objM92265n = xvx0Var.m92265n((snw0) obj, vnw0Var);
        if (objM92265n != yukVar) {
        }
        return yukVar;
        vnw0Var.f243261d = null;
        vnw0Var.f243259b = 2;
    }
}
