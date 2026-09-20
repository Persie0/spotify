package p204p;

import android.content.Context;
import androidx.compose.p002ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes11.dex */
public final class grb extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f83709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f83710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ grb(boolean z, gh00 gh00Var, int i) {
        super(1);
        this.f83708a = i;
        this.f83709b = z;
        this.f83710c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f83708a) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                boolean z = this.f83709b;
                videoSurfaceView.setSupportsSurfaceView(z);
                videoSurfaceView.setUseSurfaceView(z);
                this.f83710c.invoke(videoSurfaceView);
                return videoSurfaceView;
            case 1:
                xz71 xz71Var = (xz71) obj;
                if (this.f83709b) {
                    this.f83710c.invoke(new hav(xz71Var));
                }
                return w2a1.f247311a;
            default:
                jo70 jo70Var = (jo70) obj;
                if (this.f83709b) {
                    this.f83710c.invoke(new Offset(jo70Var.mo30029m(0L)));
                }
                return w2a1.f247311a;
        }
    }
}
