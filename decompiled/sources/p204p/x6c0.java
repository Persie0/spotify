package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class x6c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f7c0 f258637a;

    public x6c0(f7c0 f7c0Var) {
        this.f258637a = f7c0Var;
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
        w6c0 w6c0Var;
        if (ibkVar instanceof w6c0) {
            w6c0Var = (w6c0) ibkVar;
            int i = w6c0Var.f248326b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w6c0Var.f248326b = i - Integer.MIN_VALUE;
            } else {
                w6c0Var = new w6c0(this, ibkVar);
            }
        } else {
            w6c0Var = new w6c0(this, ibkVar);
        }
        Object objM40963c = w6c0Var.f248325a;
        int i2 = w6c0Var.f248326b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = w6c0Var.f248328d;
                bga.m29073P(objM40963c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40963c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40963c);
        w6c0Var.f248328d = bqz0Var;
        w6c0Var.f248326b = 1;
        objM40963c = f7c0.m40963c(this.f258637a, (k6c0) obj, w6c0Var);
        if (objM40963c != yukVar) {
        }
        return yukVar;
        w6c0Var.f248328d = null;
        w6c0Var.f248326b = 2;
    }
}
