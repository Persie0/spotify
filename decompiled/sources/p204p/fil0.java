package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class fil0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f69915a;

    public fil0(kil0 kil0Var) {
        this.f69915a = kil0Var;
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
        eil0 eil0Var;
        if (ibkVar instanceof eil0) {
            eil0Var = (eil0) ibkVar;
            int i = eil0Var.f59906b;
            if ((i & Integer.MIN_VALUE) != 0) {
                eil0Var.f59906b = i - Integer.MIN_VALUE;
            } else {
                eil0Var = new eil0(this, ibkVar);
            }
        } else {
            eil0Var = new eil0(this, ibkVar);
        }
        Object objM28900u = eil0Var.f59905a;
        int i2 = eil0Var.f59906b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = eil0Var.f59908d;
                bga.m29073P(objM28900u);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28900u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28900u);
        be41 be41Var = this.f69915a.f123012d;
        eil0Var.f59908d = bqz0Var;
        eil0Var.f59906b = 1;
        objM28900u = be41Var.m28900u((rhl0) obj, eil0Var);
        if (objM28900u != yukVar) {
        }
        return yukVar;
        eil0Var.f59908d = null;
        eil0Var.f59906b = 2;
    }
}
