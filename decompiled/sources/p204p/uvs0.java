package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class uvs0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wvs0 f234501a;

    public uvs0(wvs0 wvs0Var) {
        this.f234501a = wvs0Var;
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
        tvs0 tvs0Var;
        if (ibkVar instanceof tvs0) {
            tvs0Var = (tvs0) ibkVar;
            int i = tvs0Var.f224226b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tvs0Var.f224226b = i - Integer.MIN_VALUE;
            } else {
                tvs0Var = new tvs0(this, ibkVar);
            }
        } else {
            tvs0Var = new tvs0(this, ibkVar);
        }
        Object objM89157a = tvs0Var.f224225a;
        int i2 = tvs0Var.f224226b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = tvs0Var.f224228d;
                bga.m29073P(objM89157a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89157a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89157a);
        tvs0Var.f224228d = bqz0Var;
        tvs0Var.f224226b = 1;
        objM89157a = wvs0.m89157a(this.f234501a, (yvs0) obj, tvs0Var);
        if (objM89157a != yukVar) {
        }
        return yukVar;
        tvs0Var.f224228d = null;
        tvs0Var.f224226b = 2;
    }
}
