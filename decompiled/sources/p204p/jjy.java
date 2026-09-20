package p204p;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class jjy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ojy f113116a;

    public jjy(ojy ojyVar) {
        this.f113116a = ojyVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ((ClipboardManager) this.f113116a.f166173a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, ((bjy) obj).f27782a));
        return w2a1.f247311a;
    }
}
