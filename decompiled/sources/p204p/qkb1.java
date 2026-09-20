package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class qkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgq f189523a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k641 f189524b;

    public qkb1(pgq pgqVar, k641 k641Var) {
        this.f189523a = pgqVar;
        this.f189524b = k641Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        VideoSurfaceView videoSurfaceView;
        nn70 nn70Var = (nn70) obj;
        pgq pgqVar = this.f189523a;
        pa9 pa9VarM69901a = pgqVar.m69901a();
        if (pa9VarM69901a != null && (videoSurfaceView = pgqVar.f177383b) != null) {
            pa9VarM69901a.m69446k(videoSurfaceView);
        }
        k9b.m55794a(this.f189524b, (fh0) nn70Var.f156347a.f103342a, null, "open_split", null, 26);
        return w2a1.f247311a;
    }
}
