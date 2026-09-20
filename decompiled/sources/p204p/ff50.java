package p204p;

import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class ff50 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lf50 f68913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f68914c;

    public /* synthetic */ ff50(lf50 lf50Var, boolean z, int i) {
        this.f68912a = i;
        this.f68913b = lf50Var;
        this.f68914c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoSurfaceView videoSurfaceView;
        VideoSurfaceView videoSurfaceView2;
        switch (this.f68912a) {
            case 0:
                lf50 lf50Var = this.f68913b;
                if (lf50Var.f132808R0 && (videoSurfaceView = lf50Var.f132817Y0) != null) {
                    videoSurfaceView.setKeepScreenOn(this.f68914c);
                    break;
                }
                break;
            default:
                lf50 lf50Var2 = this.f68913b;
                if (lf50Var2.f132808R0 && (videoSurfaceView2 = lf50Var2.f132817Y0) != null) {
                    videoSurfaceView2.setKeepScreenOn(this.f68914c);
                    break;
                }
                break;
        }
    }
}
