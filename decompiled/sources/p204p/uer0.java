package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class uer0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yer0 f229597a;

    public uer0(yer0 yer0Var) {
        this.f229597a = yer0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        int i = ((afr0) obj).f15202a ? R.string.artifact_page_privacy_public : R.string.artifact_page_privacy_private;
        yer0 yer0Var = this.f229597a;
        yer0Var.f272037a.invoke(new rr11(yer0Var.f272040d.getString(i)));
        return w2a1.f247311a;
    }
}
