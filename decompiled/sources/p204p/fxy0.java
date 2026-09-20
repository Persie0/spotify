package p204p;

import android.view.View;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fxy0 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final View f74486S0;

    /* JADX INFO: renamed from: T0 */
    public final th00 f74487T0;

    /* JADX INFO: renamed from: U0 */
    public final th00 f74488U0;

    /* JADX INFO: renamed from: V0 */
    public final ArtworkView f74489V0;

    /* JADX INFO: renamed from: W0 */
    public final TextView f74490W0;

    /* JADX INFO: renamed from: X0 */
    public final TextView f74491X0;

    /* JADX INFO: renamed from: Y0 */
    public final ContentRestrictionBadgeView f74492Y0;

    public fxy0(View view, e940 e940Var, hwy0 hwy0Var, hwy0 hwy0Var2) {
        super(view);
        this.f74486S0 = view;
        this.f74487T0 = hwy0Var;
        this.f74488U0 = hwy0Var2;
        ArtworkView artworkView = (ArtworkView) view.findViewById(R.id.artwork);
        artworkView.setViewContext(new r96(e940Var));
        this.f74489V0 = artworkView;
        this.f74490W0 = (TextView) view.findViewById(R.id.title);
        this.f74491X0 = (TextView) view.findViewById(R.id.subtitle);
        this.f74492Y0 = (ContentRestrictionBadgeView) view.findViewById(R.id.restriction_badge);
    }
}
