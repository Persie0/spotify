package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.spotify.music.R;
import p204p.eg71;
import p204p.w65;

/* JADX INFO: loaded from: classes3.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: a */
    private final w65 f181a;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f181a.f248259b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eg71.m38806a(getContext(), this);
        w65 w65Var = new w65(this);
        this.f181a = w65Var;
        w65Var.mo24905a(attributeSet, i);
    }
}
