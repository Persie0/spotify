package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class rot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mpt f201343a;

    public rot(mpt mptVar) {
        this.f201343a = mptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        kot kotVar;
        if (ibkVar instanceof kot) {
            kotVar = (kot) ibkVar;
            int i = kotVar.f124908b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kotVar.f124908b = i - Integer.MIN_VALUE;
            } else {
                kotVar = new kot(this, ibkVar);
            }
        } else {
            kotVar = new kot(this, ibkVar);
        }
        Object obj2 = kotVar.f124907a;
        int i2 = kotVar.f124908b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new rc10(new rc10(new f2a0(fag1.m41173v((pgo) this.f201343a.f146089c.f281273b, cua1.f42082a, ((jgt) obj).f112261a), 2), 18), 19), new ga2(3, 26, null), 2);
            d6i d6iVar = new d6i(bqz0Var, 16);
            kotVar.f124908b = 1;
            Object objCollect = vjzVar.collect(d6iVar, kotVar);
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
