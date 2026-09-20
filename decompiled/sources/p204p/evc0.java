package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class evc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ei1 f63204a;

    public evc0(ei1 ei1Var) {
        this.f63204a = ei1Var;
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
        dvc0 dvc0Var;
        if (ibkVar instanceof dvc0) {
            dvc0Var = (dvc0) ibkVar;
            int i = dvc0Var.f53417b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvc0Var.f53417b = i - Integer.MIN_VALUE;
            } else {
                dvc0Var = new dvc0(this, ibkVar);
            }
        } else {
            dvc0Var = new dvc0(this, ibkVar);
        }
        Object objM39057g = dvc0Var.f53416a;
        int i2 = dvc0Var.f53417b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dvc0Var.f53419d;
                bga.m29073P(objM39057g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM39057g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM39057g);
        dvc0Var.f53419d = bqz0Var;
        dvc0Var.f53417b = 1;
        objM39057g = this.f63204a.m39057g(dvc0Var);
        if (objM39057g != yukVar) {
        }
        return yukVar;
        dvc0Var.f53419d = null;
        dvc0Var.f53417b = 2;
    }
}
