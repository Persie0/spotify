package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class lmy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cny f135046a;

    public lmy(cny cnyVar) {
        this.f135046a = cnyVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        toy toyVar;
        zv41 zv41Var = this.f135046a.f40126d.f253613c;
        toy toyVar2 = (toy) zv41Var.getValue();
        if (toyVar2 != null) {
            String str = toyVar2.f222342c;
            toyVar = new toy(toyVar2.f222340a, str, str);
        } else {
            toyVar = null;
        }
        zv41Var.m97090l(toyVar);
        return w2a1.f247311a;
    }
}
