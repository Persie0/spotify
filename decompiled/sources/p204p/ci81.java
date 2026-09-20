package p204p;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconAddBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.IconRemoveBadgeView;
import com.spotify.aiplaylist.promptcreation.presentation.tracklist.PlayIndicatorView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.previewbutton.PreviewOverlayView;
import com.spotify.encoremobile.component.icons.IconEnhanceBadge;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ci81 extends go80 {

    /* JADX INFO: renamed from: e */
    public final xre f38247e;

    /* JADX INFO: renamed from: f */
    public final e940 f38248f;

    /* JADX INFO: renamed from: g */
    public final kiv0 f38249g;

    /* JADX INFO: renamed from: h */
    public qe70 f38250h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f38251i;

    /* JADX INFO: renamed from: t */
    public boolean f38252t;

    public ci81(xre xreVar, e940 e940Var, kiv0 kiv0Var) {
        super(ia5.f100157k);
        this.f38247e = xreVar;
        this.f38248f = e940Var;
        this.f38249g = kiv0Var;
        this.f38250h = ug81.f230039d;
        this.f38251i = new LinkedHashSet();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        u9r0 t9r0Var;
        boolean z;
        float f;
        bi81 bi81Var = (bi81) dkv0Var;
        mh81 mh81Var = (mh81) m45324A(i);
        wj50.m88279p(mh81Var);
        EncoreListRow encoreListRow = bi81Var.f27353T0;
        oa81 oa81Var = bi81Var.f27352S0;
        LinearLayout linearLayout = bi81Var.f27356W0;
        PlayIndicatorView playIndicatorView = bi81Var.f27357X0;
        ci81 ci81Var = bi81Var.f27359Z0;
        LinkedHashSet linkedHashSet = ci81Var.f38251i;
        String str = mh81Var.f143725a;
        String str2 = mh81Var.f143733i;
        lh81 lh81Var = mh81Var.f143730f;
        int i2 = lh81Var.f133418a;
        TextView textView = bi81Var.f27354U0;
        String str3 = mh81Var.f143726b;
        textView.setText(str3);
        LinearLayout linearLayout2 = bi81Var.f27355V0;
        TextView textView2 = (TextView) linearLayout2.findViewById(R.id.subtitle_slot_text);
        String str4 = mh81Var.f143728d;
        textView2.setText(str4);
        IconEnhanceBadge iconEnhanceBadge = (IconEnhanceBadge) linearLayout2.findViewById(R.id.subtitle_slot_enhance_icon);
        boolean z2 = mh81Var.f143727c;
        iconEnhanceBadge.setVisibility((z2 || !mh81Var.f143734j) ? 8 : 0);
        iconEnhanceBadge.setX(0.0f);
        h66 h66Var = new h66(mh81Var.f143729e, new a66(4.0f));
        d5a0 d5a0Var = playIndicatorView.f2763a;
        ((ArtworkView) d5a0Var.f45381c).mo2820d(new i76(h66Var));
        linearLayout.setVisibility(0);
        IconRemoveBadgeView iconRemoveBadgeView = (IconRemoveBadgeView) linearLayout.findViewById(R.id.trailing_slot_remove);
        iconRemoveBadgeView.setIconVisible(!z2);
        iconRemoveBadgeView.setVisibility(!z2 ? 0 : 8);
        iconRemoveBadgeView.setOnClickListener(new zh81(ci81Var, mh81Var, i, 0));
        IconAddBadgeView iconAddBadgeView = (IconAddBadgeView) linearLayout.findViewById(R.id.trailing_slot_add);
        iconAddBadgeView.setIconActive(z2);
        iconAddBadgeView.setOnClickListener(new ai81(ci81Var, mh81Var, i, iconAddBadgeView, iconRemoveBadgeView, iconEnhanceBadge));
        long j = lh81Var.f133419b;
        if (i2 != 1 || j == 0) {
            t9r0Var = new t9r0(new v9r0(str3, Collections.singletonList(str4)));
        } else {
            if (playIndicatorView.f2764b == null) {
                wj50.m88260d0("clock");
                throw null;
            }
            t9r0Var = new r9r0(j, ((SystemClock.uptimeMillis() - lh81Var.f133421d) + lh81Var.f133420c) / j);
        }
        ((PreviewOverlayView) d5a0Var.f45383e).mo2820d(t9r0Var);
        encoreListRow.setOnClickListener(new zh81(ci81Var, mh81Var, i, 1));
        playIndicatorView.setOnClickListener(new p7w0(ci81Var, mh81Var, i, 10));
        encoreListRow.setAdditionalAccessibilityActions(Collections.singletonList(new C1857fe(((ConstraintLayout) oa81Var.f163265b).getContext().getString(R.string.accessibility_action_remove_track, str3, str4), new ob31(i, ci81Var, mh81Var))));
        ArtworkView artworkView = (ArtworkView) d5a0Var.f45381c;
        int iM38547C = edb.m38547C(i2);
        if (iM38547C != 0) {
            z = true;
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.54f;
        } else {
            z = true;
            f = 0.3f;
        }
        artworkView.setAlpha(f);
        if (str2 == null || wl51.m88460J0(str2) || z2) {
            z = false;
        }
        ((ComposeView) oa81Var.f163267d).setVisibility(z ? 0 : 8);
        bi81Var.f27358Y0.setValue((!z || str2 == null) ? "" : str2);
        if (!linkedHashSet.contains(str) && z2) {
            ConstraintLayout constraintLayout = (ConstraintLayout) oa81Var.f163265b;
            int color = constraintLayout.getContext().getColor(R.color.dark_base_background_base);
            int color2 = constraintLayout.getContext().getColor(R.color.dark_base_background_elevated_base);
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(constraintLayout, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(color2));
            objectAnimatorOfObject.setDuration(150L);
            objectAnimatorOfObject.setStartDelay(500L);
            objectAnimatorOfObject.start();
            objectAnimatorOfObject.addListener(new z10(new po70(bi81Var, color2, color, 2), 17));
        }
        linkedHashSet.add(str);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        View viewM25591c = adn.m25591c(viewGroup, R.layout.track_item, viewGroup, false);
        int i2 = R.id.encore_list_row;
        EncoreListRow encoreListRow = (EncoreListRow) vie1.m85629k(viewM25591c, R.id.encore_list_row);
        if (encoreListRow != null) {
            i2 = R.id.media_slot;
            if (((PlayIndicatorView) vie1.m85629k(viewM25591c, R.id.media_slot)) != null) {
                i2 = R.id.note_view;
                ComposeView composeView = (ComposeView) vie1.m85629k(viewM25591c, R.id.note_view);
                if (composeView != null) {
                    i2 = R.id.subtitle_slot;
                    if (((LinearLayout) vie1.m85629k(viewM25591c, R.id.subtitle_slot)) != null) {
                        i2 = R.id.subtitle_slot_enhance_icon;
                        if (((IconEnhanceBadge) vie1.m85629k(viewM25591c, R.id.subtitle_slot_enhance_icon)) != null) {
                            i2 = R.id.subtitle_slot_text;
                            if (((EncoreTextView) vie1.m85629k(viewM25591c, R.id.subtitle_slot_text)) != null) {
                                i2 = R.id.title_slot;
                                if (((EncoreTextView) vie1.m85629k(viewM25591c, R.id.title_slot)) != null) {
                                    i2 = R.id.trailing_slot;
                                    if (((LinearLayout) vie1.m85629k(viewM25591c, R.id.trailing_slot)) != null) {
                                        i2 = R.id.trailing_slot_add;
                                        if (((IconAddBadgeView) vie1.m85629k(viewM25591c, R.id.trailing_slot_add)) != null) {
                                            i2 = R.id.trailing_slot_remove;
                                            if (((IconRemoveBadgeView) vie1.m85629k(viewM25591c, R.id.trailing_slot_remove)) != null) {
                                                return new bi81(this, new oa81((ConstraintLayout) viewM25591c, encoreListRow, composeView, 2), this.f38247e);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
    }
}
