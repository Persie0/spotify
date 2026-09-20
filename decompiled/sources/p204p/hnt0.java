package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class hnt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i5z f93390a;

    public hnt0(i5z i5zVar) {
        this.f93390a = i5zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r9.mo30229d(r10, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gnt0 gnt0Var;
        xmt0 xmt0Var;
        if (ibkVar instanceof gnt0) {
            gnt0Var = (gnt0) ibkVar;
            int i = gnt0Var.f82778b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gnt0Var.f82778b = i - Integer.MIN_VALUE;
            } else {
                gnt0Var = new gnt0(this, ibkVar);
            }
        } else {
            gnt0Var = new gnt0(this, ibkVar);
        }
        Object obj2 = gnt0Var.f82777a;
        int i2 = gnt0Var.f82778b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                xmt0Var = gnt0Var.f82781e;
                bqz0Var = gnt0Var.f82780d;
                bga.m29073P(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        xmt0Var = (xmt0) obj;
        d70 d70Var = xmt0Var.f263446a;
        xbf xbfVar = new xbf(d70Var.f45941a, d70Var.f45942b, xmt0Var.f263447b);
        gnt0Var.f82780d = bqz0Var;
        gnt0Var.f82781e = xmt0Var;
        gnt0Var.f82778b = 1;
        if (this.f93390a.m49785q(xbfVar, gnt0Var) != yukVar) {
        }
        return yukVar;
        gpt0 gpt0Var = new gpt0(xmt0Var.f263447b);
        gnt0Var.f82780d = null;
        gnt0Var.f82781e = null;
        gnt0Var.f82778b = 2;
    }
}
