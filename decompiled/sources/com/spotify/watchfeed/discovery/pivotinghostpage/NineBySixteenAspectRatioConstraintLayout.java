package com.spotify.watchfeed.discovery.pivotinghostpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/watchfeed/discovery/pivotinghostpage/NineBySixteenAspectRatioConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_accessibility_compose-compose"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NineBySixteenAspectRatioConstraintLayout extends ConstraintLayout {
    public NineBySixteenAspectRatioConstraintLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = size2;
        if (size / f <= 0.5625f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (f * 0.5625f), 1073741824), i2);
        }
    }

    public NineBySixteenAspectRatioConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NineBySixteenAspectRatioConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public /* synthetic */ NineBySixteenAspectRatioConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
