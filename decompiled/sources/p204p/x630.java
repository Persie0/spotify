package p204p;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: classes2.dex */
public final class x630 extends VideoSurfaceView {

    /* JADX INFO: renamed from: t1 */
    public boolean f258570t1;

    /* JADX INFO: renamed from: u1 */
    public Float f258571u1;

    /* JADX INFO: renamed from: v1 */
    public final Matrix f258572v1;

    /* JADX INFO: renamed from: w1 */
    public final Matrix f258573w1;

    /* JADX INFO: renamed from: x1 */
    public final float[] f258574x1;

    public x630(Context context) {
        super(context, null);
        this.f258572v1 = new Matrix();
        this.f258573w1 = new Matrix();
        this.f258574x1 = new float[9];
    }

    @Override // com.spotify.betamax.player.VideoSurfaceView
    public boolean getSupportsSurfaceView() {
        return this.f258570t1;
    }

    @Override // com.spotify.betamax.player.VideoSurfaceView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextureView f3056a = getF3056a();
        if (f3056a == null) {
            return;
        }
        Matrix matrix = this.f258572v1;
        f3056a.getTransform(matrix);
        float[] fArr = this.f258574x1;
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = fArr[5];
        Float f4 = this.f258571u1;
        float fFloatValue = f4 != null ? f4.floatValue() : 0.5f;
        float width = getWidth();
        float f5 = width * f;
        float fM63436m = f5 > width ? n0e1.m63436m((width / 2.0f) - (fFloatValue * f5), width - f5, 0.0f) : 0.0f;
        Matrix matrix2 = this.f258573w1;
        matrix2.setScale(f, f2);
        matrix2.postTranslate(fM63436m, f3);
        f3056a.setTransform(matrix2);
    }

    public final void setHorizontalFocusPercentage(Float f) {
        this.f258571u1 = f;
        requestLayout();
    }

    @Override // com.spotify.betamax.player.VideoSurfaceView
    public void setSupportsSurfaceView(boolean z) {
        this.f258570t1 = z;
    }
}
