package com.spotify.encoreconsumermobile.elements.badge.trailer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.fw81;
import p204p.oqs;
import p204p.u171;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/trailer/TrailerBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_trailer-trailer"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TrailerBadgeView extends AppCompatImageView implements oqs {
    public TrailerBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: e */
    public final u171 m9602e(String str) {
        Drawable drawable = getDrawable();
        u171 u171Var = drawable instanceof u171 ? (u171) drawable : null;
        if (u171Var != null) {
            u171 u171Var2 = wj50.m88271j(u171Var.f225697a, str) ? u171Var : null;
            if (u171Var2 != null) {
                return u171Var2;
            }
        }
        return new u171(getContext(), str);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void mo2820d(fw81 fw81Var) {
        setVisibility(fw81Var != fw81.f74028c ? 0 : 8);
        int iOrdinal = fw81Var.ordinal();
        if (iOrdinal == 0) {
            setImageDrawable(m9602e(getContext().getString(R.string.show_trailer_badge_view)));
            setContentDescription(getContext().getString(R.string.trailer_badge_content_description));
        } else if (iOrdinal == 1) {
            setImageDrawable(m9602e(getContext().getString(R.string.book_sample_badge_view)));
            setContentDescription(getContext().getString(R.string.sample_badge_content_description));
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setContentDescription(null);
        }
    }

    public TrailerBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrailerBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageDrawable(new u171(context, "TRAILER"));
        setContentDescription(context.getString(R.string.premium_badge_content_description));
    }

    public /* synthetic */ TrailerBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
