package com.spotify.encoreconsumermobile.elements.badge.speed;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.az31;
import p204p.bz31;
import p204p.edb;
import p204p.t1u0;
import p204p.zy31;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/speed/SpeedBadgeIconView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_speed-speed"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SpeedBadgeIconView extends AppCompatImageView {

    /* JADX INFO: renamed from: d */
    public final int f3626d;

    /* JADX INFO: renamed from: e */
    public int f3627e;

    /* JADX INFO: renamed from: f */
    public int f3628f;

    public SpeedBadgeIconView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m9601e(bz31 bz31Var) {
        int i;
        if (bz31Var.equals(zy31.f287482a)) {
            setVisibility(8);
            return;
        }
        if (!(bz31Var instanceof az31)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = ((az31) bz31Var).f21413b;
        if (i2 != this.f3627e) {
            int iM38547C = edb.m38547C(i2);
            if (iM38547C == 0) {
                i = R.drawable.ic_speed_badge_up;
            } else {
                if (iM38547C != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.drawable.ic_speed_badge_down;
            }
            setImageResource(i);
            this.f3627e = i2;
        }
        int i3 = (int) (this.f3626d * getResources().getConfiguration().fontScale);
        if (i3 != this.f3628f) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i3;
            layoutParams.height = i3;
            setLayoutParams(layoutParams);
            this.f3628f = i3;
        }
        setVisibility(0);
    }

    public SpeedBadgeIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SpeedBadgeIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t1u0.f216359a, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, getResources().getDimensionPixelSize(R.dimen.encore_graphic_size_decorative_smaller));
        typedArrayObtainStyledAttributes.recycle();
        this.f3626d = dimensionPixelSize;
        this.f3628f = -1;
        setAdjustViewBounds(true);
    }

    public /* synthetic */ SpeedBadgeIconView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
