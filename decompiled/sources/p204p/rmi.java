package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class rmi implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f200554a;

    public rmi(kni kniVar) {
        this.f200554a = kniVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        String str;
        String str2;
        kni kniVar = this.f200554a;
        kniVar.f124419g.mo47343c();
        if (((xji) obj).f262138a) {
            str = xoc1.f264045a6.f243453a;
            str2 = "?config=BLUEJAY_CONFIRMED_NOTIFICATIONS";
        } else {
            str = xoc1.f264045a6.f243453a;
            str2 = "?config=BLUEJAY_REQUEST_NOTIFICATIONS";
        }
        kniVar.f124421i.m35666d(s571.m77250i(str, str2), null, null);
        return w2a1.f247311a;
    }
}
