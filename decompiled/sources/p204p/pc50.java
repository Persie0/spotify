package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class pc50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z9j0 f175958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f175959b;

    public pc50(z9j0 z9j0Var, boolean z) {
        this.f175958a = z9j0Var;
        this.f175959b = z;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        iht ihtVar = (iht) obj;
        String str = ihtVar.f102361a;
        if (str == null) {
            throw new IllegalStateException("uri was not set!");
        }
        p6j0 p6j0Var = new p6j0(str, "", false, false, 0, 0, false, null, null, null);
        Bundle bundleM70529j = pp91.m70529j(new pqm0("extra_internal_injected", Boolean.TRUE), new pqm0("bypass_product_state_check", Boolean.valueOf(this.f175959b)), new pqm0("ChatSource", ihtVar.f102362b));
        z9j0 z9j0Var = this.f175958a;
        z9j0Var.mo47348i(p6j0Var, bundleM70529j);
        z9j0Var.mo47344d(gn80.CHAT_INTERCEPTOR);
        return w2a1.f247311a;
    }
}
