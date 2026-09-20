package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class lkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgq f134310a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ llb1 f134311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ up0 f134312c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hrw f134313d;

    public lkb1(pgq pgqVar, llb1 llb1Var, up0 up0Var, hrw hrwVar) {
        this.f134310a = pgqVar;
        this.f134311b = llb1Var;
        this.f134312c = up0Var;
        this.f134313d = hrwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kkb1 kkb1Var;
        VideoSurfaceView videoSurfaceView;
        if (ibkVar instanceof kkb1) {
            kkb1Var = (kkb1) ibkVar;
            int i = kkb1Var.f123561b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkb1Var.f123561b = i - Integer.MIN_VALUE;
            } else {
                kkb1Var = new kkb1(this, ibkVar);
            }
        } else {
            kkb1Var = new kkb1(this, ibkVar);
        }
        Object obj2 = kkb1Var.f123560a;
        int i2 = kkb1Var.f123561b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            hyd hydVar = (hyd) obj;
            pgq pgqVar = this.f134310a;
            pa9 pa9VarM69901a = pgqVar.m69901a();
            if ((pa9VarM69901a != null ? pa9VarM69901a.m69440e() : null) != null) {
                pa9 pa9VarM69901a2 = pgqVar.m69901a();
                if (pa9VarM69901a2 != null && (videoSurfaceView = pgqVar.f177383b) != null) {
                    pa9VarM69901a2.m69439d(videoSurfaceView);
                }
                pa9VarM69901a.m69447l();
            } else {
                uo5 uo5Var = this.f134311b.f134609a.f123854b;
                hydVar.f96568a.mo29280c();
                kkb1Var.f123561b = 1;
                uo5Var.getClass();
                new uo5(uo5Var.f232333b, kkb1Var, 6).invokeSuspend(w2a1Var);
                yuk yukVar = yuk.f276404a;
                if (w2a1Var == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        this.f134312c.m83641b(this.f134313d);
        return w2a1Var;
    }
}
