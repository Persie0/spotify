package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class i2w0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q1w0 f97927a;

    public i2w0(q1w0 q1w0Var) {
        this.f97927a = q1w0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        c2w0 c2w0Var = (c2w0) obj;
        String str = c2w0Var.f33474b;
        String str2 = c2w0Var.f33475c;
        String str3 = c2w0Var.f33473a;
        List list = c2w0Var.f33476d;
        String str4 = c2w0Var.f33477e;
        String str5 = c2w0Var.f33478f;
        dhl dhlVar = c2w0Var.f33479g;
        Map mapM56700m0 = dhlVar.f49126a;
        if (bm51.m29803n0(str2, "spotify:show", false)) {
            mapM56700m0 = kkc0.m56700m0(mapM56700m0, Collections.singletonMap(Context.Metadata.KEY_END_CONTEXT_ACTION, ContextTrack.TrackAction.STOP));
        }
        Object objM71961g = this.f97927a.m71961g(str, str2, str3, list, str4, str5, new u1w0(mapM56700m0, dhlVar.f49127b), ibkVar);
        return objM71961g == yuk.f276404a ? objM71961g : w2a1.f247311a;
    }
}
