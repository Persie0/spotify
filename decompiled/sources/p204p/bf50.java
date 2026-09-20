package p204p;

import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class bf50 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26578a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoSurfaceView f26579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf50(VideoSurfaceView videoSurfaceView, int i) {
        super(1);
        this.f26578a = i;
        this.f26579b = videoSurfaceView;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f26578a) {
            case 0:
                ((ExoPlayer) obj).mo43839I(this.f26579b.getOnRenderedFirstFrameListener());
                return w2a1.f247311a;
            case 1:
                ((ExoPlayer) obj).mo43850O(this.f26579b.getOnRenderedFirstFrameListener());
                return w2a1.f247311a;
            case 2:
                return this.f26579b;
            case 3:
                return this.f26579b;
            case 4:
                return this.f26579b;
            default:
                ((ExoPlayer) obj).mo765h(this.f26579b.f3083t == mac1.ASPECT_FILL_DISPLAY_AR ? 1 : 2);
                return w2a1.f247311a;
        }
    }
}
