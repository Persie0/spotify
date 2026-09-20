package p204p;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.follow.EncoreFollowButton;
import com.spotify.encoreconsumermobile.elements.seemoretextview.SeeMoreTextView;
import com.spotify.encoreconsumermobile.elements.settings.SettingsButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconBlend;
import com.spotify.encoremobile.component.icons.IconHidden;
import com.spotify.encoremobile.component.icons.IconVerifiedCheck;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.profile.uiusecases.elements.profiletitletextview.DefaultProfileTitleTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class fxr0 implements rdc1 {

    /* JADX INFO: renamed from: L0 */
    public final LinearLayout f74415L0;

    /* JADX INFO: renamed from: M0 */
    public final EncoreButton f74416M0;

    /* JADX INFO: renamed from: N0 */
    public final SettingsButton f74417N0;

    /* JADX INFO: renamed from: O0 */
    public final ImageView f74418O0;

    /* JADX INFO: renamed from: P0 */
    public final Flow f74419P0;

    /* JADX INFO: renamed from: Q0 */
    public final AppCompatTextView f74420Q0;

    /* JADX INFO: renamed from: R0 */
    public final SeeMoreTextView f74421R0;

    /* JADX INFO: renamed from: S0 */
    public final AppCompatTextView f74422S0;

    /* JADX INFO: renamed from: T0 */
    public final AppCompatTextView f74423T0;

    /* JADX INFO: renamed from: U0 */
    public final Flow f74424U0;

    /* JADX INFO: renamed from: V0 */
    public final AppCompatTextView f74425V0;

    /* JADX INFO: renamed from: W0 */
    public final AppCompatTextView f74426W0;

    /* JADX INFO: renamed from: X */
    public final IconBlend f74427X;

    /* JADX INFO: renamed from: X0 */
    public final AppCompatTextView f74428X0;

    /* JADX INFO: renamed from: Y */
    public final TextView f74429Y;

    /* JADX INFO: renamed from: Y0 */
    public final View f74430Y0;

    /* JADX INFO: renamed from: Z */
    public final IconHidden f74431Z;

    /* JADX INFO: renamed from: Z0 */
    public final View f74432Z0;

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f74433a;

    /* JADX INFO: renamed from: a1 */
    public final FaceView f74434a1;

    /* JADX INFO: renamed from: b */
    public final EncoreButton f74435b;

    /* JADX INFO: renamed from: b1 */
    public final DefaultProfileTitleTextView f74436b1;

    /* JADX INFO: renamed from: c */
    public final ContextMenuButton f74437c;

    /* JADX INFO: renamed from: c1 */
    public final Barrier f74438c1;

    /* JADX INFO: renamed from: d */
    public final EncoreButton f74439d;

    /* JADX INFO: renamed from: d1 */
    public final ConstraintLayout f74440d1;

    /* JADX INFO: renamed from: e */
    public final TextView f74441e;

    /* JADX INFO: renamed from: e1 */
    public final IconVerifiedCheck f74442e1;

    /* JADX INFO: renamed from: f */
    public final EncoreFollowButton f74443f;

    /* JADX INFO: renamed from: g */
    public final TextView f74444g;

    /* JADX INFO: renamed from: h */
    public final TextView f74445h;

    /* JADX INFO: renamed from: i */
    public final TextView f74446i;

    /* JADX INFO: renamed from: t */
    public final Flow f74447t;

    public fxr0(ConstraintLayout constraintLayout, EncoreButton encoreButton, ContextMenuButton contextMenuButton, EncoreButton encoreButton2, TextView textView, EncoreFollowButton encoreFollowButton, TextView textView2, TextView textView3, TextView textView4, Flow flow, IconBlend iconBlend, TextView textView5, IconHidden iconHidden, LinearLayout linearLayout, EncoreButton encoreButton3, SettingsButton settingsButton, ImageView imageView, Flow flow2, AppCompatTextView appCompatTextView, SeeMoreTextView seeMoreTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, Flow flow3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, View view, View view2, FaceView faceView, DefaultProfileTitleTextView defaultProfileTitleTextView, Barrier barrier, ConstraintLayout constraintLayout2, IconVerifiedCheck iconVerifiedCheck) {
        this.f74433a = constraintLayout;
        this.f74435b = encoreButton;
        this.f74437c = contextMenuButton;
        this.f74439d = encoreButton2;
        this.f74441e = textView;
        this.f74443f = encoreFollowButton;
        this.f74444g = textView2;
        this.f74445h = textView3;
        this.f74446i = textView4;
        this.f74447t = flow;
        this.f74427X = iconBlend;
        this.f74429Y = textView5;
        this.f74431Z = iconHidden;
        this.f74415L0 = linearLayout;
        this.f74416M0 = encoreButton3;
        this.f74417N0 = settingsButton;
        this.f74418O0 = imageView;
        this.f74419P0 = flow2;
        this.f74420Q0 = appCompatTextView;
        this.f74421R0 = seeMoreTextView;
        this.f74422S0 = appCompatTextView2;
        this.f74423T0 = appCompatTextView3;
        this.f74424U0 = flow3;
        this.f74425V0 = appCompatTextView4;
        this.f74426W0 = appCompatTextView5;
        this.f74428X0 = appCompatTextView6;
        this.f74430Y0 = view;
        this.f74432Z0 = view2;
        this.f74434a1 = faceView;
        this.f74436b1 = defaultProfileTitleTextView;
        this.f74438c1 = barrier;
        this.f74440d1 = constraintLayout2;
        this.f74442e1 = iconVerifiedCheck;
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        return this.f74433a;
    }
}
