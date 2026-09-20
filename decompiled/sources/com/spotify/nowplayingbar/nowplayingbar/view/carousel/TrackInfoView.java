package com.spotify.nowplayingbar.nowplayingbar.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.queued.QueuedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.speed.SpeedBadgeIconView;
import com.spotify.encoreconsumermobile.elementscompose.jamlistenalongbadge.JamListenAlongBadgeView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.g6f;
import p204p.h6f;
import p204p.yas0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/nowplayingbar/nowplayingbar/view/carousel/TrackInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/yas0;", "controller", "Lp/w2a1;", "setPromoIndicatorController", "(Lp/yas0;)V", "src_main_java_com_spotify_nowplayingbar_nowplayingbar-nowplayingbar"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TrackInfoView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextView f6323a;

    /* JADX INFO: renamed from: b */
    public final TextView f6324b;

    /* JADX INFO: renamed from: c */
    public final EnhancedBadgeView f6325c;

    /* JADX INFO: renamed from: d */
    public final QueuedBadgeView f6326d;

    /* JADX INFO: renamed from: e */
    public final SpeedBadgeIconView f6327e;

    /* JADX INFO: renamed from: f */
    public final JamListenAlongBadgeView f6328f;

    /* JADX INFO: renamed from: g */
    public final View f6329g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f6330h;

    /* JADX INFO: renamed from: i */
    public final View f6331i;

    /* JADX INFO: renamed from: t */
    public yas0 f6332t;

    public TrackInfoView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final String m16003a(String str, boolean z, boolean z2) {
        return g6f.m43753y0(g6f.m43737o0(h6f.m46715L(str, z ? getContext().getString(R.string.nowplayingbar_recommended_track_content_description) : null, z2 ? getContext().getString(R.string.nowplayingbar_queued_track_content_description) : null)), ", ", null, null, null, 62);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yas0 yas0Var = this.f6332t;
        if (yas0Var != null) {
            yas0Var.m93220c();
        }
    }

    public final void setPromoIndicatorController(yas0 controller) {
        this.f6332t = controller;
    }

    public TrackInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TrackInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.now_playing_bar_track_info_view, this);
        setOrientation(1);
        TextView textView = (TextView) findViewById(R.id.track_info_view_title);
        this.f6323a = textView;
        TextView textView2 = (TextView) findViewById(R.id.track_info_view_subtitle);
        this.f6324b = textView2;
        this.f6325c = (EnhancedBadgeView) findViewById(R.id.enhanced_badge);
        this.f6326d = (QueuedBadgeView) findViewById(R.id.queued_badge);
        this.f6327e = (SpeedBadgeIconView) findViewById(R.id.speed_badge_icon);
        this.f6328f = (JamListenAlongBadgeView) findViewById(R.id.listen_along_badge);
        this.f6329g = findViewById(R.id.subtitle_row);
        this.f6330h = (ViewGroup) findViewById(R.id.subtitle_container);
        this.f6331i = findViewById(R.id.promo_indicator_row);
        textView.setSelected(true);
        textView2.setSelected(true);
    }

    public /* synthetic */ TrackInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
