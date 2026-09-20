package com.spotify.encoreconsumermobile.elements.badge.enhanced;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.iqg1;
import p204p.vc41;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/enhanced/EnhancedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "color", "Lp/w2a1;", "setColor", "(I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_enhanced-enhanced"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EnhancedBadgeView extends AppCompatImageView {
    public EnhancedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void setColor(int color) {
        setImageDrawable(iqg1.m51375q(color, getContext(), vc41.ENHANCE_BADGE));
    }

    public EnhancedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EnhancedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
        setColor(R.color.dark_base_text_brightaccent);
        setContentDescription(context.getString(R.string.enhanced_badge_content_description));
    }

    public /* synthetic */ EnhancedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
