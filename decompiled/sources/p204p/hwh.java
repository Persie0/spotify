package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class hwh implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hm90 f95943a;

    public hwh(hm90 hm90Var) {
        this.f95943a = hm90Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        gwh gwhVar;
        if (ibkVar instanceof gwh) {
            gwhVar = (gwh) ibkVar;
            int i = gwhVar.f85009b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gwhVar.f85009b = i - Integer.MIN_VALUE;
            } else {
                gwhVar = new gwh(this, ibkVar);
            }
        } else {
            gwhVar = new gwh(this, ibkVar);
        }
        Object obj2 = gwhVar.f85008a;
        int i2 = gwhVar.f85009b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new xvd(this.f95943a, (fvh) obj, (fbk) null, 14));
            z6d z6dVar = new z6d(bqz0Var, 19);
            gwhVar.f85009b = 1;
            Object objCollect = nzx0Var.collect(z6dVar, gwhVar);
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
