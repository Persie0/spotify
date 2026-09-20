package p204p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class tq10 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f222652a;

    /* JADX INFO: renamed from: b */
    public final qq10 f222653b;

    /* JADX INFO: renamed from: c */
    public final a470 f222654c;

    public tq10(sq10 sq10Var, int i, int i2, boolean z) {
        Paint paint = new Paint();
        this.f222652a = paint;
        qq10 qq10Var = new qq10();
        qq10Var.f191423a = sq10Var;
        qq10Var.f191426d = z;
        this.f222653b = qq10Var;
        qq10Var.f191424b = i;
        qq10Var.f191425c = i2;
        ((rq10) sq10Var).getClass();
        this.f222654c = new a470(i, i2);
        invalidateSelf();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -15592942, Shader.TileMode.REPEAT));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f222654c.m24678d(canvas, bounds);
        if (this.f222653b.f191426d) {
            canvas.save();
            canvas.scale(bounds.width(), bounds.height() + 1);
            canvas.drawRect(0.0f, 0.0f, 1.0f, 1.0f, this.f222652a);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        int changingConfigurations = getChangingConfigurations();
        qq10 qq10Var = this.f222653b;
        qq10Var.f191427e = changingConfigurations;
        return qq10Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        return getConstantState().newDrawable();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
