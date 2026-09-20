package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class mvc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ei1 f147555a;

    public mvc0(ei1 ei1Var) {
        this.f147555a = ei1Var;
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
        lvc0 lvc0Var;
        if (ibkVar instanceof lvc0) {
            lvc0Var = (lvc0) ibkVar;
            int i = lvc0Var.f137276b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvc0Var.f137276b = i - Integer.MIN_VALUE;
            } else {
                lvc0Var = new lvc0(this, ibkVar);
            }
        } else {
            lvc0Var = new lvc0(this, ibkVar);
        }
        Object objM39055e = lvc0Var.f137275a;
        int i2 = lvc0Var.f137276b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = lvc0Var.f137278d;
                bga.m29073P(objM39055e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM39055e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM39055e);
        lvc0Var.f137278d = bqz0Var;
        lvc0Var.f137276b = 1;
        objM39055e = this.f147555a.m39055e((mtc0) obj, lvc0Var);
        if (objM39055e != yukVar) {
        }
        return yukVar;
        lvc0Var.f137278d = null;
        lvc0Var.f137276b = 2;
    }
}
