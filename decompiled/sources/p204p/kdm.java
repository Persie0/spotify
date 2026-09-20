package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class kdm extends n3d0 {

    /* JADX INFO: renamed from: V0 */
    public final Paint f121694V0;

    /* JADX INFO: renamed from: W0 */
    public final RectF f121695W0;

    /* JADX INFO: renamed from: X0 */
    public int f121696X0;

    public kdm(dh01 dh01Var) {
        super(dh01Var == null ? new dh01() : dh01Var);
        Paint paint = new Paint(1);
        this.f121694V0 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f121695W0 = new RectF();
    }

    @Override // p204p.n3d0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.f121696X0 = canvas2.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas2);
        if (getCallback() instanceof View) {
            return;
        }
        canvas2.restoreToCount(this.f121696X0);
    }

    @Override // p204p.n3d0
    /* JADX INFO: renamed from: f */
    public final void mo56175f(Canvas canvas) {
        RectF rectF = this.f121695W0;
        if (rectF.isEmpty()) {
            super.mo56175f(canvas);
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        super.mo56175f(canvas2);
        canvas2.drawRect(rectF, this.f121694V0);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
    }

    /* JADX INFO: renamed from: t */
    public final void m56176t(float f, float f2, float f3, float f4) {
        RectF rectF = this.f121695W0;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
