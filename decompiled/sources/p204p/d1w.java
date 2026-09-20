package p204p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class d1w implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44365a = 0;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f44366b;

    /* JADX INFO: renamed from: c */
    public final ArtworkView f44367c;

    /* JADX INFO: renamed from: d */
    public final TextView f44368d;

    /* JADX INFO: renamed from: e */
    public final TextView f44369e;

    public d1w(ConstraintLayout constraintLayout, ArtworkView artworkView, DownloadBadgeView downloadBadgeView, DownloadBadgeView downloadBadgeView2, TextView textView, TextView textView2) {
        this.f44366b = constraintLayout;
        this.f44367c = artworkView;
        this.f44368d = textView;
        this.f44369e = textView2;
    }

    /* JADX INFO: renamed from: a */
    public static d1w m34671a(View view) {
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) vie1.m85629k(view, R.id.artwork);
        if (artworkView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.download_badge_subtitle;
            DownloadBadgeView downloadBadgeView = (DownloadBadgeView) vie1.m85629k(view, R.id.download_badge_subtitle);
            if (downloadBadgeView != null) {
                i = R.id.download_badge_title;
                DownloadBadgeView downloadBadgeView2 = (DownloadBadgeView) vie1.m85629k(view, R.id.download_badge_title);
                if (downloadBadgeView2 != null) {
                    i = R.id.subtitle;
                    TextView textView = (TextView) vie1.m85629k(view, R.id.subtitle);
                    if (textView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) vie1.m85629k(view, R.id.title);
                        if (textView2 != null) {
                            return new d1w(constraintLayout, artworkView, downloadBadgeView, downloadBadgeView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f44365a) {
            case 0:
                break;
        }
        return this.f44366b;
    }

    public d1w(ConstraintLayout constraintLayout, DownloadBadgeView downloadBadgeView, DownloadBadgeView downloadBadgeView2, ArtworkView artworkView, TextView textView, TextView textView2) {
        this.f44366b = constraintLayout;
        this.f44367c = artworkView;
        this.f44368d = textView;
        this.f44369e = textView2;
    }
}
