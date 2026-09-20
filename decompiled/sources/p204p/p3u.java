package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class p3u implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        o3u o3uVar;
        if (ibkVar instanceof o3u) {
            o3uVar = (o3u) ibkVar;
            int i = o3uVar.f161444b;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3uVar.f161444b = i - Integer.MIN_VALUE;
            } else {
                o3uVar = new o3u(this, ibkVar);
            }
        } else {
            o3uVar = new o3u(this, ibkVar);
        }
        Object obj2 = o3uVar.f161443a;
        int i2 = o3uVar.f161444b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new lzr((dvr) obj, null, 13));
            d6i d6iVar = new d6i(bqz0Var, 24);
            o3uVar.f161444b = 1;
            Object objCollect = nzx0Var.collect(d6iVar, o3uVar);
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
