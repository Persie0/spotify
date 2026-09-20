package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: loaded from: classes9.dex */
public final class w091 implements LineBackgroundSpan {

    /* JADX INFO: renamed from: a */
    public final float f246673a;

    /* JADX INFO: renamed from: b */
    public final Paint f246674b;

    /* JADX INFO: renamed from: c */
    public final RectF f246675c;

    public w091(int i, float f) {
        this.f246673a = f;
        Paint paint = new Paint();
        paint.setColor(i);
        this.f246674b = paint;
        this.f246675c = new RectF();
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        RectF rectF = this.f246675c;
        rectF.set(i, i3 + 2.0f, i2, i5 - 2.0f);
        float f = this.f246673a;
        canvas.drawRoundRect(rectF, f, f, this.f246674b);
    }
}
