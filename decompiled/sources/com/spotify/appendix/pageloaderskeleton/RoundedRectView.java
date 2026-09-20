package com.spotify.appendix.pageloaderskeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import p204p.k1u0;

/* JADX INFO: loaded from: classes3.dex */
public class RoundedRectView extends View {

    /* JADX INFO: renamed from: a */
    public final Paint f2989a;

    /* JADX INFO: renamed from: b */
    public float f2990b;

    public RoundedRectView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f2989a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-65536);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        float height = getHeight();
        float f = this.f2990b;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f2989a);
    }

    public void setColor(int i) {
        this.f2989a.setColor(i);
    }

    public void setCornerRadius(float f) {
        this.f2990b = f;
    }

    public RoundedRectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f2989a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-65536);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1u0.f118437a);
        for (int i = 0; i < typedArrayObtainStyledAttributes.getIndexCount(); i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                setColor(typedArrayObtainStyledAttributes.getColor(index, this.f2989a.getColor()));
            } else if (index == 1) {
                setCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
