package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class hoq implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ioq f93588a;

    public hoq(ioq ioqVar) {
        this.f93588a = ioqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        goq goqVar;
        if (ibkVar instanceof goq) {
            goqVar = (goq) ibkVar;
            int i = goqVar.f83001b;
            if ((i & Integer.MIN_VALUE) != 0) {
                goqVar.f83001b = i - Integer.MIN_VALUE;
            } else {
                goqVar = new goq(this, ibkVar);
            }
        } else {
            goqVar = new goq(this, ibkVar);
        }
        Object obj2 = goqVar.f83000a;
        int i2 = goqVar.f83001b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new h5q(this.f93588a, (xnq) obj, fbkVar, 12)), new ic0(3, 14, fbkVar), 2);
            d6i d6iVar = new d6i(bqz0Var, 8);
            goqVar.f83001b = 1;
            Object objCollect = vjzVar.collect(d6iVar, goqVar);
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
