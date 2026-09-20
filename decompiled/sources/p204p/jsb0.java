package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class jsb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ msb0 f115470a;

    public jsb0(msb0 msb0Var) {
        this.f115470a = msb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        isb0 isb0Var;
        if (ibkVar instanceof isb0) {
            isb0Var = (isb0) ibkVar;
            int i = isb0Var.f105209b;
            if ((i & Integer.MIN_VALUE) != 0) {
                isb0Var.f105209b = i - Integer.MIN_VALUE;
            } else {
                isb0Var = new isb0(this, ibkVar);
            }
        } else {
            isb0Var = new isb0(this, ibkVar);
        }
        Object obj2 = isb0Var.f105208a;
        int i2 = isb0Var.f105209b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new ml1(this.f115470a.f146742a, ((esb0) obj).f62326c, (fbk) null));
            mwa0 mwa0Var = new mwa0(bqz0Var, 1);
            isb0Var.f105209b = 1;
            Object objCollect = nzx0Var.collect(mwa0Var, isb0Var);
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
