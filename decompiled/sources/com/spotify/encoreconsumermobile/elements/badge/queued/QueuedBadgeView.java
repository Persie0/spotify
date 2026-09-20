package com.spotify.encoreconsumermobile.elements.badge.queued;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gv90;
import p204p.ihf1;
import p204p.u1x0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/queued/QueuedBadgeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_queued-queued"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class QueuedBadgeView extends AppCompatImageView {
    public QueuedBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public QueuedBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public QueuedBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAdjustViewBounds(true);
        setImageDrawable(ihf1.m50639w(context, R.drawable.encore_icon_queue_badge));
        Resources resources = getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = u1x0.f225931a;
        setColorFilter(gv90.m45880w(resources, R.color.dark_base_text_brightaccent, theme));
        setContentDescription(context.getString(R.string.queued_badge_content_description));
    }

    public /* synthetic */ QueuedBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
