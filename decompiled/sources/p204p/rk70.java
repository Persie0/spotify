package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class rk70 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sk70 f200017a;

    public rk70(sk70 sk70Var) {
        this.f200017a = sk70Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r10.mo30229d(r11, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        qk70 qk70Var;
        if (ibkVar instanceof qk70) {
            qk70Var = (qk70) ibkVar;
            int i = qk70Var.f189486b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk70Var.f189486b = i - Integer.MIN_VALUE;
            } else {
                qk70Var = new qk70(this, ibkVar);
            }
        } else {
            qk70Var = new qk70(this, ibkVar);
        }
        Object objM89557A = qk70Var.f189485a;
        int i2 = qk70Var.f189486b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = qk70Var.f189488d;
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89557A);
        sk70 sk70Var = this.f200017a;
        luk lukVar = sk70Var.f210052e;
        ty20 ty20Var = new ty20((gk70) obj, sk70Var, fbkVar, 20);
        qk70Var.f189488d = bqz0Var;
        qk70Var.f189486b = 1;
        objM89557A = x0h1.m89557A(lukVar, ty20Var, qk70Var);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        qk70Var.f189488d = null;
        qk70Var.f189486b = 2;
    }
}
