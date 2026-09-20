package com.spotify.encoreconsumermobile.elements.badge.contentrestriction;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gh00;
import p204p.oc2;
import p204p.oqs;
import p204p.qsj;
import p204p.u171;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/contentrestriction/ContentRestrictionBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/oc2;", "getOrCreateAgeRestrictionDrawable", "()Lp/oc2;", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_contentrestriction-contentrestriction"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContentRestrictionBadgeView extends AppCompatImageView implements oqs {
    /* JADX WARN: Multi-variable type inference failed */
    public ContentRestrictionBadgeView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    private final oc2 getOrCreateAgeRestrictionDrawable() {
        Drawable drawable = getDrawable();
        return drawable instanceof oc2 ? (oc2) drawable : new oc2(getContext());
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(qsj qsjVar) {
        int iOrdinal = qsjVar.ordinal();
        if (iOrdinal == 0) {
            setImageDrawable(getOrCreateAgeRestrictionDrawable());
            setContentDescription(getContext().getString(R.string.over_19_badge_content_description));
            setVisibility(0);
            return;
        }
        if (iOrdinal == 1) {
            String string = getContext().getString(R.string.explicit_badge_text_short);
            Drawable drawable = getDrawable();
            setImageDrawable(drawable instanceof u171 ? (u171) drawable : new u171(getContext(), string));
            setContentDescription(getContext().getString(R.string.explicit_badge_content_description));
            setVisibility(0);
            return;
        }
        if (iOrdinal != 2) {
            setImageDrawable(null);
            setVisibility(8);
            return;
        }
        String string2 = getContext().getString(R.string.explicit_badge_text_long);
        Drawable drawable2 = getDrawable();
        setImageDrawable(drawable2 instanceof u171 ? (u171) drawable2 : new u171(getContext(), string2));
        setContentDescription(string2);
        setVisibility(0);
    }

    public ContentRestrictionBadgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    public /* synthetic */ ContentRestrictionBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
    }
}
