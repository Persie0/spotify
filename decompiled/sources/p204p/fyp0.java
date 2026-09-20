package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class fyp0 extends ImageSpan {

    /* JADX INFO: renamed from: a */
    public final int f74795a;

    /* JADX INFO: renamed from: b */
    public final char[] f74796b;

    /* JADX WARN: Illegal instructions before constructor call */
    public fyp0(Context context, int i, int i2) {
        Drawable drawable = context.getDrawable(R.drawable.encore_icon_plus_alt);
        if (drawable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        drawable.setBounds(0, 0, i2, i2);
        drawable.setTint(i);
        super(drawable, 0);
        this.f74795a = i2;
        this.f74796b = new char[]{'E'};
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Rect rect = new Rect();
        paint.getTextBounds(this.f74796b, 0, 1, rect);
        super.draw(canvas, charSequence, i, i2, f, i3, i4, (this.f74795a / 2) + (i4 - (rect.height() / 2)), paint);
    }
}
