package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class e6d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f56620a;

    public e6d(h7d h7dVar) {
        this.f56620a = h7dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        d6d d6dVar;
        if (ibkVar instanceof d6d) {
            d6dVar = (d6d) ibkVar;
            int i = d6dVar.f45672b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d6dVar.f45672b = i - Integer.MIN_VALUE;
            } else {
                d6dVar = new d6d(this, ibkVar);
            }
        } else {
            d6dVar = new d6d(this, ibkVar);
        }
        Object obj2 = d6dVar.f45671a;
        int i2 = d6dVar.f45672b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vnt0 vnt0Var = this.f56620a.f88426o;
            String str = ((o4d) obj).f161656a;
            d6dVar.f45672b = 1;
            Object objM86069k = vnt0Var.m86069k(str, d6dVar);
            yuk yukVar = yuk.f276404a;
            if (objM86069k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            ((s6x0) obj2).getClass();
        }
        return w2a1.f247311a;
    }
}
