package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f1817a;

    /* JADX INFO: renamed from: b */
    public float f1818b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1818b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f1817a * 0.0f, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f1818b = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f1817a = f;
        invalidateSelf();
    }
}
