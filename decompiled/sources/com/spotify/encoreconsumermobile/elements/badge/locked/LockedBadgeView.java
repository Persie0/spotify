package com.spotify.encoreconsumermobile.elements.badge.locked;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.cec1;
import p204p.iqg1;
import p204p.lzj;
import p204p.mec1;
import p204p.oqs;
import p204p.s1u0;
import p204p.vc41;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/locked/LockedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_locked-locked"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class LockedBadgeView extends AppCompatImageView implements oqs {
    public LockedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo2820d(Object obj) {
        m9598e(((Boolean) obj).booleanValue());
    }

    /* JADX INFO: renamed from: e */
    public final void m9598e(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public LockedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LockedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.locked_badge_background);
        ColorStateList colorStateListM60387w = lzj.m60387w(context, R.color.encore_lock_badge_bg);
        WeakHashMap weakHashMap = mec1.f142677a;
        cec1.m32546j(this, colorStateListM60387w);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s1u0.f204803a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.dimen.locked_badge_icon_size_default);
        typedArrayObtainStyledAttributes.recycle();
        setImageDrawable(iqg1.m51376r(context, vc41.LOCKED_ACTIVE, R.color.encore_lock_icon_color, context.getResources().getDimensionPixelSize(resourceId)));
        setContentDescription(context.getString(R.string.locked_badge_content_description));
    }

    public /* synthetic */ LockedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
