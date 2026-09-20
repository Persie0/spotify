package p204p;

import android.view.SurfaceHolder;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class hac1 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iac1 f89192a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoSurfaceView f89193b;

    public hac1(iac1 iac1Var, VideoSurfaceView videoSurfaceView) {
        this.f89192a = iac1Var;
        this.f89193b = videoSurfaceView;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        iac1.m50049a(this.f89192a, this.f89193b, surfaceHolder, true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        iac1.m50049a(this.f89192a, this.f89193b, surfaceHolder, false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
