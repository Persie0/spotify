package p204p;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class qde extends Drawable {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f187548f = 0;

    /* JADX INFO: renamed from: a */
    public final Bitmap f187549a;

    /* JADX INFO: renamed from: b */
    public final float f187550b = 1.0f;

    /* JADX INFO: renamed from: c */
    public final BitmapShader f187551c;

    /* JADX INFO: renamed from: d */
    public final Matrix f187552d;

    /* JADX INFO: renamed from: e */
    public final Paint f187553e;

    public qde(Bitmap bitmap) {
        this.f187549a = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f187551c = bitmapShader;
        this.f187552d = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(bitmapShader);
        this.f187553e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fExactCenterX = bounds.exactCenterX();
        float fExactCenterY = bounds.exactCenterY();
        float fMin = Math.min(bounds.width(), bounds.height()) / 2.0f;
        Matrix matrix = this.f187552d;
        matrix.reset();
        matrix.postTranslate(-fExactCenterX, -fExactCenterY);
        this.f187551c.setLocalMatrix(matrix);
        canvas.save();
        canvas.translate(fExactCenterX, fExactCenterY);
        float f = this.f187550b;
        if (f != 1.0f) {
            canvas.scale(f, f);
        }
        canvas.drawCircle(0.0f, 0.0f, fMin, this.f187553e);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f187549a.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f187549a.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.f187553e;
        if (paint.getXfermode() != null) {
            return -3;
        }
        if (paint.getAlpha() == 0) {
            return -2;
        }
        return (paint.getAlpha() != 255 || this.f187549a.hasAlpha()) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f187553e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f187553e.setColorFilter(colorFilter);
    }
}
