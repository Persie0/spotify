package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class hil0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f91841a;

    public hil0(kil0 kil0Var) {
        this.f91841a = kil0Var;
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
        gil0 gil0Var;
        if (ibkVar instanceof gil0) {
            gil0Var = (gil0) ibkVar;
            int i = gil0Var.f80203b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gil0Var.f80203b = i - Integer.MIN_VALUE;
            } else {
                gil0Var = new gil0(this, ibkVar);
            }
        } else {
            gil0Var = new gil0(this, ibkVar);
        }
        Object objM88078a = gil0Var.f80202a;
        int i2 = gil0Var.f80203b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = gil0Var.f80205d;
                bga.m29073P(objM88078a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88078a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM88078a);
        wgw0 wgw0Var = this.f91841a.f123014f;
        gil0Var.f80205d = bqz0Var;
        gil0Var.f80203b = 1;
        objM88078a = wgw0Var.m88078a((mhl0) obj, gil0Var);
        if (objM88078a != yukVar) {
        }
        return yukVar;
        gil0Var.f80205d = null;
        gil0Var.f80203b = 2;
    }
}
