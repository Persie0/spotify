package p204p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class omy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cny f167114a;

    public omy(cny cnyVar) {
        this.f167114a = cnyVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((wly) obj).f252642a));
        intent.addFlags(268435456);
        this.f167114a.f40123a.mo35747a(intent);
        return w2a1.f247311a;
    }
}
