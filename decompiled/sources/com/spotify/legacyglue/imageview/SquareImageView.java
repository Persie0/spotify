package com.spotify.legacyglue.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class SquareImageView extends AppCompatImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = true;
        boolean z2 = View.MeasureSpec.getSize(i) == 0 || getLayoutParams().width == -2;
        if (View.MeasureSpec.getSize(i2) != 0 && getLayoutParams().height != -2) {
            z = false;
        }
        if (z2) {
            i = View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(getSuggestedMinimumWidth(), i2), 1073741824);
        } else if (z) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.getDefaultSize(getSuggestedMinimumHeight(), i), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
