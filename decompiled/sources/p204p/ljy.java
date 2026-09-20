package p204p;

import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ljy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ojy f134175a;

    public ljy(ojy ojyVar) {
        this.f134175a = ojyVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/legal/privacy-policy"));
        intent.addFlags(268435456);
        this.f134175a.f166173a.startActivity(intent);
        return w2a1.f247311a;
    }
}
