package p204p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes4.dex */
public final class ls0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136403a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pa9 f136404b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ls0(pa9 pa9Var, int i) {
        super(1);
        this.f136403a = i;
        this.f136404b = pa9Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f136403a) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setIsBuffering(true);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
                this.f136404b.m69439d(videoSurfaceView);
                return videoSurfaceView;
            case 1:
                this.f136404b.m69455u();
                return w2a1.f247311a;
            case 2:
                VideoSurfaceView videoSurfaceView2 = new VideoSurfaceView((Context) obj);
                videoSurfaceView2.setIsBuffering(true);
                videoSurfaceView2.setBufferingThrobberEnabled(false);
                videoSurfaceView2.setScaleType(mac1.ASPECT_FILL);
                this.f136404b.m69439d(videoSurfaceView2);
                return videoSurfaceView2;
            case 3:
                this.f136404b.m69446k((VideoSurfaceView) obj);
                return w2a1.f247311a;
            case 4:
                return new o4b0(this.f136404b, 1);
            default:
                VideoSurfaceView videoSurfaceView3 = new VideoSurfaceView((Context) obj);
                videoSurfaceView3.setScaleType(mac1.ASPECT_FILL);
                videoSurfaceView3.setSupportsSurfaceView(false);
                videoSurfaceView3.setUseSurfaceView(false);
                this.f136404b.m69439d(videoSurfaceView3);
                videoSurfaceView3.setBufferingThrobberEnabled(false);
                return videoSurfaceView3;
        }
    }
}
