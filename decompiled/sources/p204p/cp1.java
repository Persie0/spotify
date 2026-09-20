package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class cp1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i391 f40400a;

    public cp1(i391 i391Var) {
        this.f40400a = i391Var;
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
        bp1 bp1Var;
        if (ibkVar instanceof bp1) {
            bp1Var = (bp1) ibkVar;
            int i = bp1Var.f29292b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp1Var.f29292b = i - Integer.MIN_VALUE;
            } else {
                bp1Var = new bp1(this, ibkVar);
            }
        } else {
            bp1Var = new bp1(this, ibkVar);
        }
        Object objM49581b = bp1Var.f29291a;
        int i2 = bp1Var.f29292b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = bp1Var.f29294d;
                bga.m29073P(objM49581b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM49581b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM49581b);
        bp1Var.f29294d = bqz0Var;
        bp1Var.f29292b = 1;
        objM49581b = this.f40400a.m49581b((pn1) obj, bp1Var);
        if (objM49581b != yukVar) {
        }
        return yukVar;
        bp1Var.f29294d = null;
        bp1Var.f29292b = 2;
    }
}
