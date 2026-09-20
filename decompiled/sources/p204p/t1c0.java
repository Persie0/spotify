package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class t1c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a2c0 f216222a;

    public t1c0(a2c0 a2c0Var) {
        this.f216222a = a2c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        s1c0 s1c0Var;
        if (ibkVar instanceof s1c0) {
            s1c0Var = (s1c0) ibkVar;
            int i = s1c0Var.f204681b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s1c0Var.f204681b = i - Integer.MIN_VALUE;
            } else {
                s1c0Var = new s1c0(this, ibkVar);
            }
        } else {
            s1c0Var = new s1c0(this, ibkVar);
        }
        Object obj2 = s1c0Var.f204680a;
        int i2 = s1c0Var.f204681b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            b1c0 b1c0Var = (b1c0) obj;
            nzx0 nzx0Var = new nzx0(new q0a0(this.f216222a.f11623a, b1c0Var.f22289c, b1c0Var.f22290d, null, 9));
            mwa0 mwa0Var = new mwa0(bqz0Var, 4);
            s1c0Var.f204681b = 1;
            Object objCollect = nzx0Var.collect(mwa0Var, s1c0Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
