package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;

/* JADX INFO: loaded from: classes5.dex */
public final class azo0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo0 f21657b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f21658c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f21659d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f21660e;

    public /* synthetic */ azo0(ozo0 ozo0Var, Object obj, long j, long j2, int i) {
        this.f21656a = i;
        this.f21657b = ozo0Var;
        this.f21660e = obj;
        this.f21658c = j;
        this.f21659d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21656a) {
            case 0:
                this.f21657b.mo28575L((rx6) this.f21660e, this.f21658c, this.f21659d);
                break;
            case 1:
                this.f21657b.mo25535I((BetamaxException) this.f21660e, this.f21658c, this.f21659d);
                break;
            case 2:
                this.f21657b.mo25536O((BetamaxPlaybackException) this.f21660e, this.f21658c, this.f21659d);
                break;
            case 3:
                this.f21657b.mo37788q((fv51) this.f21660e, this.f21658c, this.f21659d);
                break;
            case 4:
                this.f21657b.mo36163F((VideoSurfaceView) this.f21660e, this.f21658c, this.f21659d);
                break;
            default:
                mxb1 mxb1Var = (mxb1) this.f21660e;
                this.f21657b.mo28574K(this.f21658c, this.f21659d, mxb1Var);
                break;
        }
    }
}
