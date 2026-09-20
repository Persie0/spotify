package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class r1c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a2c0 f194818a;

    public r1c0(a2c0 a2c0Var) {
        this.f194818a = a2c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        q1c0 q1c0Var;
        if (ibkVar instanceof q1c0) {
            q1c0Var = (q1c0) ibkVar;
            int i = q1c0Var.f184290b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1c0Var.f184290b = i - Integer.MIN_VALUE;
            } else {
                q1c0Var = new q1c0(this, ibkVar);
            }
        } else {
            q1c0Var = new q1c0(this, ibkVar);
        }
        Object obj2 = q1c0Var.f184289a;
        int i2 = q1c0Var.f184290b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            h1c0 h1c0Var = (h1c0) obj;
            nzx0 nzx0Var = new nzx0(new l1c0(this.f194818a.f11623a, h1c0Var.f86562d, h1c0Var.f86563e, h1c0Var.f86561c, h1c0Var.f86564f, null));
            mwa0 mwa0Var = new mwa0(bqz0Var, 3);
            q1c0Var.f184290b = 1;
            Object objCollect = nzx0Var.collect(mwa0Var, q1c0Var);
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
