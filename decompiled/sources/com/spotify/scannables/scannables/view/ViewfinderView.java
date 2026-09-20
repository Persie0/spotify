package com.spotify.scannables.scannables.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes10.dex */
public final class ViewfinderView extends View {

    /* JADX INFO: renamed from: h */
    public static final byte[] f6637h = {0, 63, 116, -106, -75, MessagePack.Code.INT16, -24, -8, -1, -11, -23, MessagePack.Code.MAP16, MessagePack.Code.INT64, MessagePack.Code.EXT32, -65, -73, -80, -84, -86, -84, -80, -73, -65, MessagePack.Code.EXT32, MessagePack.Code.INT64, MessagePack.Code.MAP16, -23, -11, -1, -8, -24, MessagePack.Code.INT16, -75, -106, 116, 63, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public final Paint f6638a;

    /* JADX INFO: renamed from: b */
    public final Paint f6639b;

    /* JADX INFO: renamed from: c */
    public final RectF f6640c;

    /* JADX INFO: renamed from: d */
    public final float f6641d;

    /* JADX INFO: renamed from: e */
    public final PorterDuffXfermode f6642e;

    /* JADX INFO: renamed from: f */
    public Rect f6643f;

    /* JADX INFO: renamed from: g */
    public long f6644g;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6640c = new RectF();
        this.f6642e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        Paint paint = new Paint(1);
        this.f6638a = paint;
        paint.setColor(Color.argb(150, 0, 0, 0));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f6639b = paint2;
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        this.f6641d = fApplyDimension;
        paint2.setStrokeWidth(fApplyDimension * 2.0f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        float f = this.f6643f.left;
        Paint paint = this.f6639b;
        float strokeWidth = f - (paint.getStrokeWidth() / 2.0f);
        RectF rectF = this.f6640c;
        rectF.left = strokeWidth;
        rectF.top = this.f6643f.top - (paint.getStrokeWidth() / 2.0f);
        rectF.right = (paint.getStrokeWidth() / 2.0f) + this.f6643f.right;
        rectF.bottom = (paint.getStrokeWidth() / 2.0f) + this.f6643f.bottom;
        canvas2.drawPaint(this.f6638a);
        canvas2.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        Rect rect = this.f6643f;
        rectF.left = rect.left;
        rectF.top = rect.top;
        rectF.right = rect.right;
        rectF.bottom = rect.bottom;
        paint.setXfermode(this.f6642e);
        paint.setStyle(Paint.Style.FILL);
        canvas2.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        float f2 = this.f6641d;
        int i = (int) (40.0f * f2);
        Rect rect2 = this.f6643f;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int i4 = ((i2 + i3) - i) / 2;
        int i5 = ((i2 + i3) + i) / 2;
        int i6 = rect2.bottom + ((int) (f2 * 20.0f));
        int i7 = i6 + ((int) (35.0f * f2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f6644g == 0) {
            this.f6644g = jCurrentTimeMillis;
        }
        float f3 = ((int) (jCurrentTimeMillis - this.f6644g)) * 5.0E-4f;
        float f4 = 0.5f;
        float f5 = (i6 + i7) * 0.5f;
        int i8 = 0;
        while (i8 < 6) {
            float f6 = i4 + ((i8 + f4) * (i5 - i4) * 0.16666667f);
            float f7 = (i7 - i6) * f4;
            double d = ((((5 - i8) * 0.04f) + f3) % 1.0f) * 60.0f;
            double dFloor = Math.floor(d);
            double d2 = d - dFloor;
            float f8 = f5;
            int iAbs = (int) Math.abs(dFloor);
            byte[] bArr = f6637h;
            int i9 = bArr[iAbs] & 255;
            float f9 = ((((((bArr[iAbs + 1] & 255) - i9) * ((float) d2)) + i9) * 0.003921569f * 0.95f) + 0.05f) * f7;
            canvas2.drawLine(f6, f8 - f9, f6, f8 + f9, paint);
            i8++;
            canvas2 = canvas;
            f5 = f8;
            f4 = 0.5f;
        }
        postInvalidateDelayed(80L, i4, i6, i5, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = i / 10;
        this.f6643f = new Rect(i5, i2 / 8, i - i5, i2 - (i2 / 3));
        super.onSizeChanged(i, i2, i3, i4);
    }
}
