package com.spotify.campaigns.videoview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.mac1;
import p204p.mec1;
import p204p.ysm0;
import p204p.zcc1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/campaigns/videoview/VideoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/zcc1;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lcom/spotify/betamax/player/VideoSurfaceView;", "getVideoSurface", "()Lcom/spotify/betamax/player/VideoSurfaceView;", "Lp/ysm0;", ContextTrack.Metadata.KEY_TITLE, "Lp/w2a1;", "setErrorTitle", "(Lp/ysm0;)V", ContextTrack.Metadata.KEY_SUBTITLE, "setErrorSubtitle", "color", "setErrorBackground", "(I)V", "src_main_java_com_spotify_campaigns_videoview-videoview"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VideoView extends ConstraintLayout implements zcc1 {

    /* JADX INFO: renamed from: R0 */
    public final VideoSurfaceView f3144R0;

    /* JADX INFO: renamed from: S0 */
    public final View f3145S0;

    /* JADX INFO: renamed from: T0 */
    public final ParagraphView f3146T0;

    /* JADX INFO: renamed from: U0 */
    public final ParagraphView f3147U0;

    /* JADX INFO: renamed from: V0 */
    public final EncoreButton f3148V0;

    /* JADX INFO: renamed from: W0 */
    public final View f3149W0;

    public VideoView(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.video_view, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(this, R.id.video_surface);
        this.f3144R0 = videoSurfaceView;
        this.f3145S0 = mec1.m61562n(this, R.id.retry_button);
        this.f3146T0 = (ParagraphView) mec1.m61562n(this, R.id.error_title);
        this.f3147U0 = (ParagraphView) mec1.m61562n(this, R.id.error_subtitle);
        this.f3148V0 = (EncoreButton) mec1.m61562n(this, R.id.error_button);
        this.f3149W0 = mec1.m61562n(this, R.id.error_background);
        videoSurfaceView.setVisibility(8);
        videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
    }

    /* JADX INFO: renamed from: x */
    public static void m4197x(VideoView videoView, boolean z, int i) {
        boolean z2 = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        boolean z4 = (i & 4) == 0;
        boolean z5 = (i & 8) == 0;
        boolean z6 = (i & 16) == 0;
        if ((i & 32) != 0) {
            z = false;
        }
        videoView.f3146T0.setVisibility(z2 ? 0 : 8);
        videoView.f3147U0.setVisibility(z3 ? 0 : 8);
        videoView.f3148V0.setVisibility(z4 ? 0 : 8);
        videoView.f3149W0.setVisibility(z5 ? 0 : 8);
        videoView.f3145S0.setVisibility(z6 ? 0 : 8);
        videoView.f3144R0.setVisibility(z ? 0 : 8);
    }

    @Override // p204p.zcc1
    /* JADX INFO: renamed from: getVideoSurface, reason: from getter */
    public VideoSurfaceView getF3144R0() {
        return this.f3144R0;
    }

    public final void setErrorBackground(int color) {
        this.f3149W0.setBackgroundColor(color);
    }

    public final void setErrorSubtitle(ysm0 subtitle) {
        this.f3146T0.m4191u(subtitle);
    }

    public final void setErrorTitle(ysm0 title) {
        this.f3146T0.m4191u(title);
    }

    /* JADX INFO: renamed from: z */
    public final void m4198z() {
        m4197x(this, true, 31);
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.video_view, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(this, R.id.video_surface);
        this.f3144R0 = videoSurfaceView;
        this.f3145S0 = mec1.m61562n(this, R.id.retry_button);
        this.f3146T0 = (ParagraphView) mec1.m61562n(this, R.id.error_title);
        this.f3147U0 = (ParagraphView) mec1.m61562n(this, R.id.error_subtitle);
        this.f3148V0 = (EncoreButton) mec1.m61562n(this, R.id.error_button);
        this.f3149W0 = mec1.m61562n(this, R.id.error_background);
        videoSurfaceView.setVisibility(8);
        videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.video_view, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(this, R.id.video_surface);
        this.f3144R0 = videoSurfaceView;
        this.f3145S0 = mec1.m61562n(this, R.id.retry_button);
        this.f3146T0 = (ParagraphView) mec1.m61562n(this, R.id.error_title);
        this.f3147U0 = (ParagraphView) mec1.m61562n(this, R.id.error_subtitle);
        this.f3148V0 = (EncoreButton) mec1.m61562n(this, R.id.error_button);
        this.f3149W0 = mec1.m61562n(this, R.id.error_background);
        videoSurfaceView.setVisibility(8);
        videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
    }

    public VideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(getContext()).inflate(R.layout.video_view, (ViewGroup) this, true);
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mec1.m61562n(this, R.id.video_surface);
        this.f3144R0 = videoSurfaceView;
        this.f3145S0 = mec1.m61562n(this, R.id.retry_button);
        this.f3146T0 = (ParagraphView) mec1.m61562n(this, R.id.error_title);
        this.f3147U0 = (ParagraphView) mec1.m61562n(this, R.id.error_subtitle);
        this.f3148V0 = (EncoreButton) mec1.m61562n(this, R.id.error_button);
        this.f3149W0 = mec1.m61562n(this, R.id.error_background);
        videoSurfaceView.setVisibility(8);
        videoSurfaceView.setScaleType(mac1.ASPECT_FILL);
    }
}
