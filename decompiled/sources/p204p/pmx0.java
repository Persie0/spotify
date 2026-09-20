package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class pmx0 extends Drawable {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f179248e = 0;

    /* JADX INFO: renamed from: a */
    public final omx0 f179249a;

    /* JADX INFO: renamed from: b */
    public final Matrix f179250b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final RectF f179251c = new RectF();

    /* JADX INFO: renamed from: d */
    public final Paint f179252d = new Paint();

    public pmx0(Bitmap bitmap, float f) {
        this.f179249a = new omx0(bitmap, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.f179251c;
        Matrix matrix = this.f179250b;
        omx0 omx0Var = this.f179249a;
        int iSave = canvas.save();
        try {
            matrix.reset();
            matrix.setScale(getBounds().width() / omx0Var.f167109a.getWidth(), getBounds().height() / omx0Var.f167109a.getHeight());
            omx0Var.f167112d.setLocalMatrix(matrix);
            this.f179252d.setColor(-65536);
            rectF.set(getBounds());
            float f = omx0Var.f167110b;
            canvas.drawRoundRect(rectF, f, f, omx0Var.f167113e);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        int changingConfigurations = getChangingConfigurations();
        omx0 omx0Var = this.f179249a;
        omx0Var.f167111c = changingConfigurations;
        return omx0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        omx0 omx0Var = this.f179249a;
        if (omx0Var.f167113e.getXfermode() == null) {
            if (omx0Var.f167113e.getAlpha() == 0) {
                return -2;
            }
            if (omx0Var.f167113e.getAlpha() == 255 && !omx0Var.f167109a.hasAlpha()) {
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f179249a.f167113e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
