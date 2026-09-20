package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class ikf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f103114a;

    public ikf0(glf0 glf0Var) {
        this.f103114a = glf0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        z9j0 z9j0Var = this.f103114a.f81083q.f178677a;
        d850 d850Var = ((xlf0) obj).f263140a;
        if (d850Var != null) {
            z9j0Var.mo47342b("spotify:watch-feed:mixing-education-videos:default?entrypointIdentifier=mixing_edit_page:header", d850Var, null);
        } else {
            z9j0Var.mo47346g("spotify:watch-feed:mixing-education-videos:default?entrypointIdentifier=mixing_edit_page:header");
        }
        return w2a1.f247311a;
    }
}
