package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class xot implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qpt f264360a;

    public xot(qpt qptVar) {
        this.f264360a = qptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        uot uotVar;
        if (ibkVar instanceof uot) {
            uotVar = (uot) ibkVar;
            int i = uotVar.f232517b;
            if ((i & Integer.MIN_VALUE) != 0) {
                uotVar.f232517b = i - Integer.MIN_VALUE;
            } else {
                uotVar = new uot(this, ibkVar);
            }
        } else {
            uotVar = new uot(this, ibkVar);
        }
        Object obj2 = uotVar.f232516a;
        int i2 = uotVar.f232517b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            a470 a470Var = this.f264360a.f191375b;
            Long l = ((okt) obj).f166663a;
            fiz g6aVar = l != null ? new g6a(new nzx0(new gj70(false, l, (xre) a470Var.f12149b, (zf90) a470Var.f12150c, false, null)), 8) : new ysk(new v420(null, null), 27);
            d6i d6iVar = new d6i(bqz0Var, 19);
            uotVar.f232517b = 1;
            Object objCollect = g6aVar.collect(d6iVar, uotVar);
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
