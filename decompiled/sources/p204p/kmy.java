package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class kmy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cny f124239a;

    public kmy(cny cnyVar) {
        this.f124239a = cnyVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        woy woyVar = this.f124239a.f40126d;
        String str = ((fmy) obj).f71127a;
        zv41 zv41Var = woyVar.f253613c;
        toy toyVar = (toy) zv41Var.getValue();
        zv41Var.m97090l(toyVar != null ? new toy(toyVar.f222340a, str, toyVar.f222342c) : null);
        return w2a1.f247311a;
    }
}
