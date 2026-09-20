package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f1819a;

    /* JADX INFO: renamed from: b */
    public float f1820b;

    /* JADX INFO: renamed from: c */
    public float f1821c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f1820b + 0.0f, this.f1821c + 0.0f, 0.0f * this.f1819a, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
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
    public void setScale(float f) {
        this.f1819a = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.f1820b = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.f1821c = f;
        invalidateSelf();
    }
}
