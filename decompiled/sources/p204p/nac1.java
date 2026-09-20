package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes.dex */
public final class nac1 implements d7p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ VideoSurfaceView f152041a;

    public nac1(VideoSurfaceView videoSurfaceView) {
        this.f152041a = videoSurfaceView;
    }

    @Override // p204p.d7p0
    /* JADX INFO: renamed from: N */
    public final void mo34747N() {
        VideoSurfaceView videoSurfaceView = this.f152041a;
        videoSurfaceView.f3041L0.post(new oa9(videoSurfaceView, 1));
        eh00 onFirstFrameRendered = videoSurfaceView.getOnFirstFrameRendered();
        if (onFirstFrameRendered != null) {
            onFirstFrameRendered.invoke();
        }
        dac1 dac1Var = videoSurfaceView.f3072i;
        if (dac1Var != null) {
            dac1Var.mo28351e();
        }
    }
}
