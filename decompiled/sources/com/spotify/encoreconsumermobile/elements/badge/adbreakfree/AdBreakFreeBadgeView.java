package com.spotify.encoreconsumermobile.elements.badge.adbreakfree;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.oqs;
import p204p.u171;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/adbreakfree/AdBreakFreeBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "getAdBreakFreeDrawable", "()Landroid/graphics/drawable/Drawable;", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_adbreakfree-adbreakfree"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AdBreakFreeBadgeView extends AppCompatImageView implements oqs {
    public AdBreakFreeBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final Drawable getAdBreakFreeDrawable() {
        return new u171(getContext(), getContext().getString(R.string.ad_break_free_badge_text));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    public AdBreakFreeBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AdBreakFreeBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(getAdBreakFreeDrawable());
        setContentDescription(context.getString(R.string.ad_break_free_badge_content_description));
    }

    public /* synthetic */ AdBreakFreeBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
