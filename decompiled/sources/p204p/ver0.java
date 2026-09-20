package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ver0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yer0 f240791a;

    public ver0(yer0 yer0Var) {
        this.f240791a = yer0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        k5m0 k5m0Var = this.f240791a.f272038b;
        qum0 qum0Var = new qum0(((bfr0) obj).f26773a);
        Bundle bundle = new Bundle();
        bundle.putParcelable("privacy_result", qum0Var);
        k5m0.m55541i(k5m0Var, "spotify:internal:magpie:update-privacy", null, bundle, false, 10);
        return w2a1.f247311a;
    }
}
