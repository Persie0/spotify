package p204p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public class z65 extends SeekBar {

    /* JADX INFO: renamed from: a */
    private final a75 f279708a;

    public z65(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a75 a75Var = this.f279708a;
        z65 z65Var = a75Var.f12957d;
        Drawable drawable = a75Var.f12958e;
        if (drawable != null && drawable.isStateful() && drawable.setState(z65Var.getDrawableState())) {
            z65Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f279708a.f12958e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f279708a.m24907d(canvas);
    }

    public z65(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eg71.m38806a(getContext(), this);
        a75 a75Var = new a75(this);
        this.f279708a = a75Var;
        a75Var.mo24905a(attributeSet, i);
    }
}
