package com.spotify.encoreconsumermobile.elements.badge.video;

import android.content.Context;
import android.util.AttributeSet;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.lzj;
import p204p.zy8;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/encoreconsumermobile/elements/badge/video/VideoBadgeView;", "Lp/zy8;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_encoreconsumermobile_elements_badge_video-video"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VideoBadgeView extends zy8 {
    public VideoBadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public VideoBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public VideoBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.drawable.encore_icon_video);
        setAdjustViewBounds(true);
        setImageTintList(lzj.m60387w(context, R.color.video_badge_color));
        setContentDescription(getResources().getString(R.string.video_badge_content_description));
    }

    public /* synthetic */ VideoBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
