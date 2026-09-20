package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class v6c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f7c0 f237811a;

    public v6c0(f7c0 f7c0Var) {
        this.f237811a = f7c0Var;
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
        u6c0 u6c0Var;
        if (ibkVar instanceof u6c0) {
            u6c0Var = (u6c0) ibkVar;
            int i = u6c0Var.f227266b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u6c0Var.f227266b = i - Integer.MIN_VALUE;
            } else {
                u6c0Var = new u6c0(this, ibkVar);
            }
        } else {
            u6c0Var = new u6c0(this, ibkVar);
        }
        Object objM40964d = u6c0Var.f227265a;
        int i2 = u6c0Var.f227266b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = u6c0Var.f227268d;
                bga.m29073P(objM40964d);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40964d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40964d);
        u6c0Var.f227268d = bqz0Var;
        u6c0Var.f227266b = 1;
        objM40964d = f7c0.m40964d(this.f237811a, (l6c0) obj, u6c0Var);
        if (objM40964d != yukVar) {
        }
        return yukVar;
        u6c0Var.f227268d = null;
        u6c0Var.f227266b = 2;
    }
}
