package p204p;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.enhanced.EnhancedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorComposeView;
import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;

/* JADX INFO: loaded from: classes6.dex */
public interface lq81 {
    /* JADX INFO: renamed from: B */
    void mo33786B();

    /* JADX INFO: renamed from: C */
    LockedBadgeView mo33787C();

    /* JADX INFO: renamed from: a */
    void mo33796a(e940 e940Var);

    /* JADX INFO: renamed from: b */
    void mo33797b();

    /* JADX INFO: renamed from: c */
    ConstraintLayout mo33798c();

    /* JADX INFO: renamed from: d */
    EnhancedBadgeView mo33799d();

    /* JADX INFO: renamed from: e */
    QuickActionView mo33800e();

    /* JADX INFO: renamed from: f */
    ViewStub mo33801f();

    ArtworkView getArtwork();

    ConstraintLayout getRoot();

    TextView getSubtitle();

    TextView getTitle();

    /* JADX INFO: renamed from: i */
    View mo33802i();

    /* JADX INFO: renamed from: j */
    View mo33803j();

    /* JADX INFO: renamed from: m */
    DownloadBadgeView mo33804m();

    /* JADX INFO: renamed from: q */
    ContentRestrictionBadgeView mo33805q();

    /* JADX INFO: renamed from: r */
    PremiumBadgeView mo33806r();

    void setEnabled(boolean z);

    /* JADX INFO: renamed from: u */
    PlayIndicatorComposeView mo33807u();

    /* JADX INFO: renamed from: v */
    void mo33808v();

    /* JADX INFO: renamed from: w */
    FrameLayout mo33809w();

    /* JADX INFO: renamed from: x */
    View mo33810x(int i);
}
