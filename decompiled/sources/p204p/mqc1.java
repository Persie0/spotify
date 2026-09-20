package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class mqc1 extends View {

    /* JADX INFO: renamed from: a */
    public RectF f146251a;

    /* JADX INFO: renamed from: b */
    public final Paint f146252b;

    public mqc1(Context context) {
        super(context, null, 0);
        this.f146251a = new RectF();
        Paint paint = new Paint();
        paint.setColor(2130771712);
        paint.setStyle(Paint.Style.FILL);
        this.f146252b = paint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.f146251a, this.f146252b);
    }

    public final void setVisibleRect(RectF rectF) {
        this.f146251a = rectF;
        invalidate();
    }
}
