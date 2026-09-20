package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ubw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zbw0 f228896a;

    public ubw0(zbw0 zbw0Var) {
        this.f228896a = zbw0Var;
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
        tbw0 tbw0Var;
        if (ibkVar instanceof tbw0) {
            tbw0Var = (tbw0) ibkVar;
            int i = tbw0Var.f218962b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbw0Var.f218962b = i - Integer.MIN_VALUE;
            } else {
                tbw0Var = new tbw0(this, ibkVar);
            }
        } else {
            tbw0Var = new tbw0(this, ibkVar);
        }
        Object objM80150a = tbw0Var.f218961a;
        int i2 = tbw0Var.f218962b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = tbw0Var.f218964d;
                bga.m29073P(objM80150a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM80150a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM80150a);
        t610 t610Var = this.f228896a.f281415f;
        tbw0Var.f218964d = bqz0Var;
        tbw0Var.f218962b = 1;
        objM80150a = t610Var.m80150a((lbw0) obj, tbw0Var);
        if (objM80150a != yukVar) {
        }
        return yukVar;
        tbw0Var.f218964d = null;
        tbw0Var.f218962b = 2;
    }
}
