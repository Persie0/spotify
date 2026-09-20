package p204p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class j3c extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f108346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ra9 f108347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3c(kqi0 kqi0Var, ra9 ra9Var, int i) {
        super(1);
        this.f108345a = i;
        this.f108346b = kqi0Var;
        this.f108347c = ra9Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f108345a) {
            case 0:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                Object tag = videoSurfaceView.getTag(R.id.card_video_container_player);
                pa9 pa9Var = tag instanceof pa9 ? (pa9) tag : null;
                if (pa9Var != null) {
                    pa9Var.m69441f();
                    pa9Var.m69446k(videoSurfaceView);
                    pa9Var.m69455u();
                    this.f108347c.mo72486b(pa9Var);
                }
                this.f108346b.setValue(null);
                videoSurfaceView.setTag(R.id.card_video_container_player, null);
                break;
            default:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                Object tag2 = videoSurfaceView2.getTag(R.id.card_video_container_player);
                pa9 pa9Var2 = tag2 instanceof pa9 ? (pa9) tag2 : null;
                if (pa9Var2 != null) {
                    pa9Var2.m69441f();
                    pa9Var2.m69446k(videoSurfaceView2);
                    pa9Var2.m69455u();
                    this.f108347c.mo72486b(pa9Var2);
                }
                this.f108346b.setValue(null);
                videoSurfaceView2.setTag(R.id.card_video_container_player, null);
                break;
        }
        return w2a1.f247311a;
    }
}
