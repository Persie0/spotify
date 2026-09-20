package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class hxt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ixt0 f96310a;

    public hxt0(ixt0 ixt0Var) {
        this.f96310a = ixt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r8.mo30229d(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gxt0 gxt0Var;
        if (ibkVar instanceof gxt0) {
            gxt0Var = (gxt0) ibkVar;
            int i = gxt0Var.f85332b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gxt0Var.f85332b = i - Integer.MIN_VALUE;
            } else {
                gxt0Var = new gxt0(this, ibkVar);
            }
        } else {
            gxt0Var = new gxt0(this, ibkVar);
        }
        Object objM56684z = gxt0Var.f85331a;
        int i2 = gxt0Var.f85332b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = gxt0Var.f85334d;
                bga.m29073P(objM56684z);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56684z);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56684z);
        String str = ((cxt0) obj).f43090g;
        gxt0Var.f85334d = bqz0Var;
        gxt0Var.f85332b = 1;
        objM56684z = kk40.m56684z(new ext0(this.f96310a, str, null), gxt0Var);
        if (objM56684z != yukVar) {
        }
        return yukVar;
        gxt0Var.f85334d = null;
        gxt0Var.f85332b = 2;
    }
}
