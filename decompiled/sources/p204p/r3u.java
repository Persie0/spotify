package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class r3u implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        q3u q3uVar;
        if (ibkVar instanceof q3u) {
            q3uVar = (q3u) ibkVar;
            int i = q3uVar.f184962b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q3uVar.f184962b = i - Integer.MIN_VALUE;
            } else {
                q3uVar = new q3u(this, ibkVar);
            }
        } else {
            q3uVar = new q3u(this, ibkVar);
        }
        Object obj2 = q3uVar.f184961a;
        int i2 = q3uVar.f184962b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new lzr((hrr) obj, null, 12));
            d6i d6iVar = new d6i(bqz0Var, 25);
            q3uVar.f184962b = 1;
            Object objCollect = nzx0Var.collect(d6iVar, q3uVar);
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
