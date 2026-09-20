package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final class kjb1 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f123298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f123299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ VideoSurfaceView f123300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjb1(pa9 pa9Var, VideoSurfaceView videoSurfaceView, int i) {
        super(1);
        this.f123298a = i;
        this.f123299b = pa9Var;
        this.f123300c = videoSurfaceView;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f123298a) {
            case 0:
                pa9 pa9Var = this.f123299b;
                VideoSurfaceView videoSurfaceView = this.f123300c;
                pa9Var.m69439d(videoSurfaceView);
                return new jjb1(pa9Var, videoSurfaceView, 0);
            default:
                pa9 pa9Var2 = this.f123299b;
                VideoSurfaceView videoSurfaceView2 = this.f123300c;
                pa9Var2.m69439d(videoSurfaceView2);
                return new jjb1(pa9Var2, videoSurfaceView2, 1);
        }
    }
}
