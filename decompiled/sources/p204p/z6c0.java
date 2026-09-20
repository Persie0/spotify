package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class z6c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f7c0 f279827a;

    public z6c0(f7c0 f7c0Var) {
        this.f279827a = f7c0Var;
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
        y6c0 y6c0Var;
        if (ibkVar instanceof y6c0) {
            y6c0Var = (y6c0) ibkVar;
            int i = y6c0Var.f269727b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y6c0Var.f269727b = i - Integer.MIN_VALUE;
            } else {
                y6c0Var = new y6c0(this, ibkVar);
            }
        } else {
            y6c0Var = new y6c0(this, ibkVar);
        }
        Object objM40962b = y6c0Var.f269726a;
        int i2 = y6c0Var.f269727b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = y6c0Var.f269729d;
                bga.m29073P(objM40962b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40962b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40962b);
        y6c0Var.f269729d = bqz0Var;
        y6c0Var.f269727b = 1;
        objM40962b = f7c0.m40962b(this.f279827a, (j6c0) obj, y6c0Var);
        if (objM40962b != yukVar) {
        }
        return yukVar;
        y6c0Var.f269729d = null;
        y6c0Var.f269727b = 2;
    }
}
