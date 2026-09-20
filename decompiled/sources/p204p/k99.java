package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes8.dex */
public final class k99 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120538a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f120539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f120540c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f120541d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f120542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k99(e4p0 e4p0Var, boolean z, long j, long j2) {
        super(1);
        this.f120542e = e4p0Var;
        this.f120539b = z;
        this.f120540c = j;
        this.f120541d = j2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        eac1 configuration;
        switch (this.f120538a) {
            case 0:
                sh50 sh50Var = (sh50) obj;
                Long l = (Long) ((rlv0) this.f120542e).f200373a;
                return sh50.m78126a(sh50Var, null, false, null, this.f120539b, l != null ? l.longValue() : this.f120540c, 0L, 0.0f, this.f120541d, null, 359);
            default:
                z3p0 z3p0Var = (z3p0) obj;
                VideoSurfaceView videoSurfaceView = this.f120539b ? null : ((e4p0) this.f120542e).f56129d;
                return z3p0.m95286b(z3p0Var, this.f120540c, Long.valueOf(this.f120541d), null, false, 0.0f, false, null, null, (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null) ? "unknown" : ((v8k) configuration).f238595a, null, 0, false, this.f120539b, 15865);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k99(boolean z, long j, long j2, rlv0 rlv0Var) {
        super(1);
        this.f120539b = z;
        this.f120540c = j;
        this.f120541d = j2;
        this.f120542e = rlv0Var;
    }
}
