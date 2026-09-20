package p204p;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.locked.LockedBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.premium.PremiumBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import com.spotify.music.R;
import com.spotify.search.uiusecases.PlayIndicatorComposeView;
import com.spotify.search.uiusecases.actionbarsearch.ActionBarComplexRowSearchView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class vdq implements ovf, ae61 {

    /* JADX INFO: renamed from: a */
    public final e940 f240468a;

    /* JADX INFO: renamed from: b */
    public final boolean f240469b;

    /* JADX INFO: renamed from: c */
    public final v64 f240470c;

    /* JADX INFO: renamed from: d */
    public boolean f240471d;

    /* JADX INFO: renamed from: e */
    public final igz0 f240472e;

    /* JADX INFO: renamed from: f */
    public final u4i f240473f;

    /* JADX INFO: renamed from: g */
    public final ActionBarComplexRowSearchView f240474g;

    /* JADX INFO: renamed from: h */
    public final jij0 f240475h;

    public vdq(Context context, v64 v64Var, e940 e940Var, boolean z) {
        this.f240468a = e940Var;
        this.f240469b = z;
        this.f240470c = v64Var;
        this.f240472e = new igz0(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.track_row_search_layout, (ViewGroup) null, false);
        int i = R.id.action_bar;
        EncoreViewStub encoreViewStub = (EncoreViewStub) vie1.m85629k(viewInflate, R.id.action_bar);
        if (encoreViewStub != null) {
            i = R.id.artwork;
            ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewInflate, R.id.artwork);
            if (artworkView != null) {
                i = R.id.artwork_container_age_restricted;
                ComposeView composeView = (ComposeView) vie1.m85629k(viewInflate, R.id.artwork_container_age_restricted);
                if (composeView != null) {
                    i = R.id.bottom_barrier;
                    if (((Barrier) vie1.m85629k(viewInflate, R.id.bottom_barrier)) != null) {
                        i = R.id.duration_badge;
                        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.duration_badge);
                        if (textView != null) {
                            i = R.id.guide_row_end;
                            if (((Guideline) vie1.m85629k(viewInflate, R.id.guide_row_end)) != null) {
                                i = R.id.locked_badge;
                                LockedBadgeView lockedBadgeView = (LockedBadgeView) vie1.m85629k(viewInflate, R.id.locked_badge);
                                if (lockedBadgeView != null) {
                                    i = R.id.play_indicator;
                                    PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) vie1.m85629k(viewInflate, R.id.play_indicator);
                                    if (playIndicatorComposeView != null) {
                                        i = R.id.premium_badge;
                                        PremiumBadgeView premiumBadgeView = (PremiumBadgeView) vie1.m85629k(viewInflate, R.id.premium_badge);
                                        if (premiumBadgeView != null) {
                                            i = R.id.pretitle;
                                            TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.pretitle);
                                            if (textView2 != null) {
                                                i = R.id.restriction_badge;
                                                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) vie1.m85629k(viewInflate, R.id.restriction_badge);
                                                if (contentRestrictionBadgeView != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                    i = R.id.subtitle;
                                                    TextView textView3 = (TextView) vie1.m85629k(viewInflate, R.id.subtitle);
                                                    if (textView3 != null) {
                                                        i = R.id.title;
                                                        TextView textView4 = (TextView) vie1.m85629k(viewInflate, R.id.title);
                                                        if (textView4 != null) {
                                                            i = R.id.video_badge;
                                                            VideoBadgeView videoBadgeView = (VideoBadgeView) vie1.m85629k(viewInflate, R.id.video_badge);
                                                            if (videoBadgeView != null) {
                                                                i = R.id.warning_text;
                                                                TextView textView5 = (TextView) vie1.m85629k(viewInflate, R.id.warning_text);
                                                                if (textView5 != null) {
                                                                    u4i u4iVar = new u4i(constraintLayout, encoreViewStub, artworkView, composeView, textView, lockedBadgeView, playIndicatorComposeView, premiumBadgeView, textView2, contentRestrictionBadgeView, textView3, textView4, videoBadgeView, textView5);
                                                                    constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                    artworkView.setViewContext(new r96(e940Var));
                                                                    artworkView.setConstrainIconToSmallestDimension(true);
                                                                    ActionBarComplexRowSearchView actionBarComplexRowSearchView = new ActionBarComplexRowSearchView(context, null, 0, 6, null);
                                                                    actionBarComplexRowSearchView.setId(View.generateViewId());
                                                                    psg1.m70832H(encoreViewStub, actionBarComplexRowSearchView);
                                                                    this.f240474g = actionBarComplexRowSearchView;
                                                                    q3r0 q3r0VarM26334q = alf1.m26334q(constraintLayout);
                                                                    Collections.addAll(q3r0VarM26334q.f184932c, textView4, textView3);
                                                                    Collections.addAll(q3r0VarM26334q.f184933d, artworkView);
                                                                    q3r0VarM26334q.f184934e = false;
                                                                    q3r0VarM26334q.m72126a();
                                                                    this.f240473f = u4iVar;
                                                                    this.f240475h = new jij0(constraintLayout.getContext(), 1);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.ae61
    /* JADX INFO: renamed from: b */
    public final vc61 mo25689b() {
        return this.f240475h.m53459f();
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        u4i u4iVar = this.f240473f;
        ((ConstraintLayout) u4iVar.f226723b).setOnClickListener(new v6q(26, gh00Var));
        ((ConstraintLayout) u4iVar.f226723b).setOnLongClickListener(new udq(this, gh00Var));
        this.f240474g.mo2821c(new ycq(14, gh00Var));
        this.f240475h.f112776e = new pfm(22, gh00Var);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        int i;
        int i2;
        int i3;
        iq81 iq81Var = (iq81) obj;
        String str = iq81Var.f104658R0;
        List list = iq81Var.f104654N0;
        String str2 = iq81Var.f104663b;
        String str3 = iq81Var.f104653M0;
        String str4 = iq81Var.f104662a;
        int i4 = iq81Var.f104667f;
        boolean z = iq81Var.f104656P0;
        boolean z2 = iq81Var.f104668g;
        boolean z3 = iq81Var.f104657Q0;
        boolean z4 = iq81Var.f104655O0;
        boolean z5 = iq81Var.f104660Y;
        if (z4 || (z5 && z && z3)) {
            i = R.dimen.video_row_cover_wide_art_width;
            i2 = R.dimen.video_row_cover_wide_art_height;
        } else {
            i = R.dimen.track_row_cover_art_size;
            i2 = R.dimen.track_row_cover_art_size;
        }
        u4i u4iVar = this.f240473f;
        ArtworkView artworkView = (ArtworkView) u4iVar.f226724c;
        PlayIndicatorComposeView playIndicatorComposeView = (PlayIndicatorComposeView) u4iVar.f226727f;
        TextView textView = (TextView) u4iVar.f226730i;
        VideoBadgeView videoBadgeView = (VideoBadgeView) u4iVar.f226721Z;
        PremiumBadgeView premiumBadgeView = (PremiumBadgeView) u4iVar.f226729h;
        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) u4iVar.f226731t;
        LockedBadgeView lockedBadgeView = (LockedBadgeView) u4iVar.f226726e;
        TextView textView2 = (TextView) u4iVar.f226718L0;
        TextView textView3 = (TextView) u4iVar.f226720Y;
        TextView textView4 = (TextView) u4iVar.f226728g;
        ComposeView composeView = (ComposeView) u4iVar.f226725d;
        TextView textView5 = (TextView) u4iVar.f226719X;
        ConstraintLayout constraintLayout = (ConstraintLayout) u4iVar.f226723b;
        ViewGroup.LayoutParams layoutParams = artworkView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = nap.m64021n(constraintLayout, i);
        layoutParams.height = nap.m64021n(constraintLayout, i2);
        artworkView.setLayoutParams(layoutParams);
        boolean z6 = i4 != 3;
        textView3.setText((list.isEmpty() || z6) ? str4 : this.f240472e.m50572a(list, true, this.f240470c));
        if (wl51.m88460J0(str3)) {
            textView5.setText(str2);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) grl0.m45525U(h6f.m46715L(str3, str2)));
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str3.length(), 34);
            textView5.setText(new SpannedString(spannableStringBuilder));
        }
        z56 z56Var = z56.f279483d;
        if (z5 && z3) {
            textView2.setVisibility(0);
            if (z) {
                composeView.setVisibility(8);
                artworkView.setVisibility(0);
                artworkView.mo2820d(new t66(new h66(null, z56Var), new ry30(R.drawable.encore_icon_hidden)));
                i3 = 0;
            } else {
                composeView.setViewCompositionStrategy(mkr0.f144646T0);
                composeView.setContent(new fyf(new apl(19, iq81Var, this), true, -794437519));
                i3 = 0;
                composeView.setVisibility(0);
                artworkView.setVisibility(4);
            }
        } else {
            i3 = 0;
            textView2.setVisibility(8);
            composeView.setVisibility(8);
            artworkView.setVisibility(0);
            h66 h66Var = new h66(z2 ? null : iq81Var.f104664c, z56Var);
            artworkView.mo2820d(z4 ? new p76(h66Var) : new i76(h66Var));
        }
        t10 t10Var = this.f240469b ? new t10(iq81Var.f104652L0) : null;
        u10 u10Var = iq81Var.f104670i ? new u10(4) : null;
        w10 w10Var = new w10(str4, t10Var, u10Var != null ? u10Var.f225633a : i3);
        ActionBarComplexRowSearchView actionBarComplexRowSearchView = this.f240474g;
        actionBarComplexRowSearchView.mo2820d(w10Var);
        lockedBadgeView.m9598e(iq81Var.f104661Z);
        contentRestrictionBadgeView.mo2820d(iq81Var.f104666e);
        premiumBadgeView.m9600e(iq81Var.f104669h);
        videoBadgeView.setVisibility((!z5 || z4) ? 8 : i3);
        textView4.setVisibility((str.length() <= 0 || z3) ? 8 : i3);
        textView4.setText(str);
        textView.setVisibility(iq81Var.f104671t ? i3 : 8);
        constraintLayout.setActivated(z6);
        playIndicatorComposeView.setVisibility(z6 ? 0 : 8);
        playIndicatorComposeView.m20727v(vgg1.m85451G(i4));
        constraintLayout.setSelected(z6);
        boolean z7 = !z2;
        artworkView.setEnabled(z7);
        textView3.setEnabled(z7);
        textView5.setEnabled(z7);
        textView.setEnabled(z7);
        contentRestrictionBadgeView.setEnabled(z7);
        premiumBadgeView.setEnabled(z7);
        lockedBadgeView.setEnabled(z7);
        videoBadgeView.setEnabled(z7);
        textView4.setEnabled(z7);
        actionBarComplexRowSearchView.setEnabled(z7);
        int i5 = 0;
        while (i5 < actionBarComplexRowSearchView.getChildCount()) {
            int i6 = i5 + 1;
            View childAt = actionBarComplexRowSearchView.getChildAt(i5);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            childAt.setEnabled(z7);
            i5 = i6;
        }
        this.f240475h.f112773b = iq81Var.f104659X;
        this.f240471d = z2;
    }

    @Override // p204p.clc1
    public final View getView() {
        return (ConstraintLayout) this.f240473f.f226723b;
    }
}
