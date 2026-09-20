package com.spotify.yourlibrary.yourlibraryx.shared.offlinesync;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eph;
import p204p.z10;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/yourlibrary/yourlibraryx/shared/offlinesync/DownloadProgressBannerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_accessibility_compose-compose"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DownloadProgressBannerView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f7133e = 0;

    /* JADX INFO: renamed from: a */
    public final TextView f7134a;

    /* JADX INFO: renamed from: b */
    public final TextView f7135b;

    /* JADX INFO: renamed from: c */
    public final ProgressBar f7136c;

    /* JADX INFO: renamed from: d */
    public eph f7137d;

    public DownloadProgressBannerView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m23259a() {
        animate().alpha(0.0f).translationY(-getHeight()).setDuration(300L).setListener(new z10(this, 4)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eph ephVar = this.f7137d;
        if (ephVar != null) {
            removeCallbacks(ephVar);
        }
    }

    public DownloadProgressBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DownloadProgressBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_download_progress_banner, (ViewGroup) this, true);
        this.f7134a = (TextView) viewInflate.findViewById(R.id.status_text);
        this.f7135b = (TextView) viewInflate.findViewById(R.id.detail_text);
        this.f7136c = (ProgressBar) viewInflate.findViewById(R.id.progress_bar);
        setVisibility(8);
    }

    public /* synthetic */ DownloadProgressBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
