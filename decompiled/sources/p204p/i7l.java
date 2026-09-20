package p204p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class i7l implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z9j0 f99576a;

    public i7l(z9j0 z9j0Var) {
        this.f99576a = z9j0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        m6l m6lVar = (m6l) obj;
        String str = m6lVar.f140537b;
        Bundle bundleM70529j = pp91.m70529j(new pqm0("OnPlatformShareData", m6lVar.f140539d), new pqm0("group_name", m6lVar.f140536a));
        mjd.m61965a(this.f99576a, str, m6lVar.f140538c, bundleM70529j);
        return w2a1.f247311a;
    }
}
