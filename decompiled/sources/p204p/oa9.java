package p204p;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes5.dex */
public final class oa9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoSurfaceView f163269b;

    public /* synthetic */ oa9(VideoSurfaceView videoSurfaceView, int i) {
        this.f163268a = i;
        this.f163269b = videoSurfaceView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceView surfaceView;
        switch (this.f163268a) {
            case 0:
                VideoSurfaceView videoSurfaceView = this.f163269b;
                videoSurfaceView.setIsBuffering(false);
                if (videoSurfaceView.useSurfaceView && (surfaceView = videoSurfaceView.f3060c) != null) {
                    int width = surfaceView.getWidth();
                    int height = surfaceView.getHeight();
                    if (width > 0 && height > 0) {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                        try {
                            PixelCopy.request(surfaceView, bitmapCreateBitmap, new bjy0(videoSurfaceView, bitmapCreateBitmap), videoSurfaceView.f3041L0);
                        } catch (IllegalArgumentException unused) {
                            bitmapCreateBitmap.recycle();
                        }
                    }
                    break;
                }
                dac1 dac1Var = videoSurfaceView.f3072i;
                if (dac1Var != null) {
                    dac1Var.mo28347a();
                    return;
                }
                return;
            case 1:
                VideoSurfaceView videoSurfaceView2 = this.f163269b;
                ImageView imageView = videoSurfaceView2.f3045P0;
                if (imageView == null) {
                    wj50.m88260d0("frozenFrameView");
                    throw null;
                }
                imageView.setVisibility(8);
                ImageView imageView2 = videoSurfaceView2.f3045P0;
                if (imageView2 == null) {
                    wj50.m88260d0("frozenFrameView");
                    throw null;
                }
                imageView2.setImageBitmap(null);
                Bitmap bitmap = videoSurfaceView2.f3046Q0;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                videoSurfaceView2.f3046Q0 = null;
                return;
            case 2:
                VideoSurfaceView videoSurfaceView3 = this.f163269b;
                videoSurfaceView3.forceLayout();
                ViewParent parent = videoSurfaceView3.getParent();
                if (parent != null) {
                    videoSurfaceView3 = parent;
                }
                videoSurfaceView3.requestLayout();
                return;
            case 3:
                ProgressBar progressBar = this.f163269b.f3068g;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                } else {
                    wj50.m88260d0("throbber");
                    throw null;
                }
            case 4:
                VideoSurfaceView videoSurfaceView4 = this.f163269b;
                if (videoSurfaceView4.f3048S0) {
                    ProgressBar progressBar2 = videoSurfaceView4.f3068g;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(0);
                        return;
                    } else {
                        wj50.m88260d0("throbber");
                        throw null;
                    }
                }
                return;
            default:
                ProgressBar progressBar3 = this.f163269b.f3068g;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(8);
                    return;
                } else {
                    wj50.m88260d0("throbber");
                    throw null;
                }
        }
    }
}
