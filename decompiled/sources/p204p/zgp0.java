package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class zgp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ygp0 ygp0Var;
        if (ibkVar instanceof ygp0) {
            ygp0Var = (ygp0) ibkVar;
            int i = ygp0Var.f272618b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ygp0Var.f272618b = i - Integer.MIN_VALUE;
            } else {
                ygp0Var = new ygp0(this, ibkVar);
            }
        } else {
            ygp0Var = new ygp0(this, ibkVar);
        }
        Object obj2 = ygp0Var.f272617a;
        int i2 = ygp0Var.f272618b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new mep0((php0) obj, null, 1));
            mwa0 mwa0Var = new mwa0(bqz0Var, 28);
            ygp0Var.f272618b = 1;
            Object objCollect = nzx0Var.collect(mwa0Var, ygp0Var);
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
