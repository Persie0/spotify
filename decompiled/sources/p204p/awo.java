package p204p;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.spotify.artist.uiusecases.artistpick.elements.CommentBubbleView;
import com.spotify.artist.uiusecases.artistpick.elements.DateIconView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.badge.download.DownloadBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconPlay;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import com.spotify.music.R;
import com.spotify.nowplayingmini.uicomponents.trackinfo.TrackInfoView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class awo implements ovf, wi21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20566a;

    /* JADX INFO: renamed from: b */
    public final Object f20567b;

    public awo(Context context, int i) {
        this.f20566a = i;
        switch (i) {
            case 4:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.buy_additional_accounts_row, (ViewGroup) null, false);
                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.buy_additional_accounts_button);
                if (encoreButton == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.buy_additional_accounts_button)));
                }
                this.f20567b = new np7(11, (LinearLayout) viewInflate, encoreButton);
                return;
            case 6:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.empty_section_view_profile_layout, (ViewGroup) null, false);
                int i2 = R.id.empty_section_view_action_button;
                EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate2, R.id.empty_section_view_action_button);
                if (encoreButton2 != null) {
                    i2 = R.id.empty_section_view_subtitle;
                    TextView textView = (TextView) vie1.m85629k(viewInflate2, R.id.empty_section_view_subtitle);
                    if (textView != null) {
                        i2 = R.id.empty_section_view_title;
                        TextView textView2 = (TextView) vie1.m85629k(viewInflate2, R.id.empty_section_view_title);
                        if (textView2 != null) {
                            i2 = R.id.shimmer_image_1;
                            View viewM85629k = vie1.m85629k(viewInflate2, R.id.shimmer_image_1);
                            if (viewM85629k != null) {
                                i2 = R.id.shimmer_image_2;
                                View viewM85629k2 = vie1.m85629k(viewInflate2, R.id.shimmer_image_2);
                                if (viewM85629k2 != null) {
                                    i2 = R.id.shimmer_text_1_subtitle;
                                    View viewM85629k3 = vie1.m85629k(viewInflate2, R.id.shimmer_text_1_subtitle);
                                    if (viewM85629k3 != null) {
                                        i2 = R.id.shimmer_text_1_title;
                                        View viewM85629k4 = vie1.m85629k(viewInflate2, R.id.shimmer_text_1_title);
                                        if (viewM85629k4 != null) {
                                            i2 = R.id.shimmer_text_2_subtitle;
                                            View viewM85629k5 = vie1.m85629k(viewInflate2, R.id.shimmer_text_2_subtitle);
                                            if (viewM85629k5 != null) {
                                                i2 = R.id.shimmer_text_2_title;
                                                View viewM85629k6 = vie1.m85629k(viewInflate2, R.id.shimmer_text_2_title);
                                                if (viewM85629k6 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) viewInflate2;
                                                    ykn yknVar = new ykn(frameLayout, encoreButton2, textView, textView2, viewM85629k, viewM85629k2, viewM85629k3, viewM85629k4, viewM85629k5, viewM85629k6, 9);
                                                    frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    this.f20567b = yknVar;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
            case 9:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.live_room_dialog, (ViewGroup) null, false);
                int i3 = R.id.descriptionTextView;
                TextView textView3 = (TextView) vie1.m85629k(viewInflate3, R.id.descriptionTextView);
                if (textView3 != null) {
                    i3 = R.id.dismissButton;
                    TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) vie1.m85629k(viewInflate3, R.id.dismissButton);
                    if (tertiaryButtonView != null) {
                        i3 = R.id.okButton;
                        PrimaryButtonView primaryButtonView = (PrimaryButtonView) vie1.m85629k(viewInflate3, R.id.okButton);
                        if (primaryButtonView != null) {
                            i3 = R.id.titleTextView;
                            TextView textView4 = (TextView) vie1.m85629k(viewInflate3, R.id.titleTextView);
                            if (textView4 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate3;
                                etz etzVar = new etz(constraintLayout, textView3, tertiaryButtonView, primaryButtonView, textView4, 13);
                                nap.m64024q(-2, -2, constraintLayout);
                                this.f20567b = etzVar;
                                return;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
            case 12:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.premium_offer_cta_button_layout, (ViewGroup) null, false);
                EncoreButton encoreButton3 = (EncoreButton) vie1.m85629k(viewInflate4, R.id.offer_cta);
                if (encoreButton3 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(R.id.offer_cta)));
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate4;
                r3n0 r3n0Var = new r3n0(constraintLayout2, encoreButton3, constraintLayout2, 25);
                constraintLayout2.setLayoutParams(new h6j(-1, -2));
                this.f20567b = r3n0Var;
                return;
            case 13:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.see_all_button_profile_layout, (ViewGroup) null, false);
                EncoreButton encoreButton4 = (EncoreButton) vie1.m85629k(viewInflate5, R.id.encore_button);
                if (encoreButton4 == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(R.id.encore_button)));
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate5;
                oev0 oev0Var = new oev0(constraintLayout3, encoreButton4, 1);
                nap.m64024q(-1, -2, constraintLayout3);
                this.f20567b = oev0Var;
                return;
            case 15:
                this.f20567b = (TextView) LayoutInflater.from(context).inflate(R.layout.topic_chip, (ViewGroup) null);
                return;
            default:
                AddToButtonView addToButtonView = new AddToButtonView(context, null, 0, 6, null);
                int iM73231j = qlk.m73231j(context, R.dimen.spacer_8);
                addToButtonView.setPadding(iM73231j, iM73231j, iM73231j, iM73231j);
                this.f20567b = addToButtonView;
                return;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        switch (this.f20566a) {
            case 0:
                ((AddToButtonView) this.f20567b).mo2821c(new jpj(11, gh00Var));
                break;
            case 1:
                obf0 obf0Var = (obf0) this.f20567b;
                ((ConstraintLayout) obf0Var.f163635b).setOnClickListener(new ViewOnClickListenerC1708bk(19, this, gh00Var));
                ConstraintLayout constraintLayout = (ConstraintLayout) obf0Var.f163635b;
                constraintLayout.setClickable(wj50.m88271j(constraintLayout.getTag(), Boolean.TRUE));
                ((PrimaryButtonView) obf0Var.f163637d).setOnClickListener(new vk0(9, gh00Var));
                break;
            case 2:
                ((cd1) this.f20567b).f36705b.setOnClickListener(new vk0(16, gh00Var));
                break;
            case 3:
                obf0 obf0Var2 = (obf0) this.f20567b;
                ((FrameLayout) obf0Var2.f163635b).setOnClickListener(new vk0(28, gh00Var));
                FrameLayout frameLayout = (FrameLayout) obf0Var2.f163635b;
                mec1.m61561m(frameLayout, C2212of.f164591g, frameLayout.getContext().getString(R.string.artist_pick_click_action_description), null);
                break;
            case 4:
                ((EncoreButton) ((np7) this.f20567b).f156891c).setOnClickListener(new jxo(12, gh00Var));
                break;
            case 5:
                z9p z9pVar = (z9p) this.f20567b;
                ((ConstraintLayout) z9pVar.f280843b).setOnClickListener(new ViewOnClickListenerC1708bk(29, this, gh00Var));
                ConstraintLayout constraintLayout2 = (ConstraintLayout) z9pVar.f280843b;
                constraintLayout2.setClickable(wj50.m88271j(constraintLayout2.getTag(), Boolean.TRUE));
                ((PrimaryButtonView) z9pVar.f280845d).setOnClickListener(new jxo(21, gh00Var));
                break;
            case 6:
                ((EncoreButton) ((ykn) this.f20567b).f273757c).setOnClickListener(new jxo(29, gh00Var));
                break;
            case 7:
                d1w d1wVar = (d1w) this.f20567b;
                d1wVar.f44366b.setOnClickListener(new yep(3, gh00Var));
                d1wVar.f44366b.setOnLongClickListener(new bwo(4, gh00Var));
                break;
            case 8:
                vxx vxxVar = (vxx) this.f20567b;
                ((PrimaryButtonView) vxxVar.f245852e).setOnClickListener(new yep(20, gh00Var));
                ((TertiaryButtonView) vxxVar.f245853f).setOnClickListener(new yep(21, gh00Var));
                break;
            case 9:
                etz etzVar = (etz) this.f20567b;
                ((PrimaryButtonView) etzVar.f62826e).setOnClickListener(new mjp(4, gh00Var));
                ((TertiaryButtonView) etzVar.f62825d).setOnClickListener(new mjp(5, gh00Var));
                break;
            case 10:
                z9p z9pVar2 = (z9p) this.f20567b;
                ((ConstraintLayout) z9pVar2.f280843b).setOnClickListener(new mjp(29, gh00Var));
                ((ConstraintLayout) z9pVar2.f280843b).setOnLongClickListener(new bwo(10, gh00Var));
                ((ContextMenuButton) z9pVar2.f280845d).mo2821c(new u4p(29, gh00Var));
                break;
            case 11:
                d1w d1wVar2 = (d1w) this.f20567b;
                d1wVar2.f44366b.setOnClickListener(new bwp(11, gh00Var));
                d1wVar2.f44366b.setOnLongClickListener(new bwo(12, gh00Var));
                break;
            case 12:
                ((EncoreButton) ((r3n0) this.f20567b).f195526c).setOnClickListener(new bwp(23, gh00Var));
                break;
            case 13:
                ((oev0) this.f20567b).f164567c.setOnClickListener(new z0q(25, gh00Var));
                break;
            case 14:
                ((TrackInfoView) this.f20567b).f6347W0 = gh00Var;
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        int i;
        int i2;
        q76 i76Var;
        int i3 = this.f20566a;
        z56 z56Var = z56.f279483d;
        int i4 = 2;
        boolean z = true;
        int i5 = 8;
        int i6 = 0;
        Object obj2 = this.f20567b;
        switch (i3) {
            case 0:
                xj1 xj1Var = (xj1) obj;
                boolean z2 = xj1Var.f261986a;
                AddToButtonView addToButtonView = (AddToButtonView) obj2;
                addToButtonView.mo2820d(new pi1(xj1Var.f261987b ? qi1.f188893b : qi1.f188892a, false, null, null, ti1.f220528b, 12));
                addToButtonView.setVisibility(z2 ? 0 : 8);
                return;
            case 1:
                uyl uylVar = (uyl) obj;
                String str = uylVar.f235318b;
                String str2 = uylVar.f235320d;
                String str3 = uylVar.f235319c;
                obf0 obf0Var = (obf0) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) obf0Var.f163635b;
                TextView textView = (TextView) obf0Var.f163638e;
                TextView textView2 = (TextView) obf0Var.f163639f;
                boolean z3 = uylVar.f235322f;
                constraintLayout.setTag(Boolean.valueOf(z3));
                ConstraintLayout constraintLayout2 = (ConstraintLayout) obf0Var.f163635b;
                constraintLayout2.setClickable(z3);
                String str4 = uylVar.f235317a;
                String str5 = !wl51.m88460J0(str4) ? str4 : null;
                String str6 = !wl51.m88460J0(str) ? str : null;
                String str7 = !wl51.m88460J0(str3) ? str3 : null;
                String strM43753y0 = g6f.m43753y0(bk5.m29582E0(new String[]{str5, str6}), ": ", null, null, null, 62);
                if (wl51.m88460J0(strM43753y0)) {
                    strM43753y0 = null;
                }
                constraintLayout2.setContentDescription(g6f.m43753y0(bk5.m29582E0(new String[]{strM43753y0, str7}), ", ", null, null, null, 62));
                ((TextView) obf0Var.f163640g).setText(str4);
                textView2.setText(str);
                if (wl51.m88460J0(str3)) {
                    i = 8;
                    textView.setVisibility(8);
                    textView2.setMaxLines(2);
                } else {
                    textView.setText(str3);
                    textView.setVisibility(0);
                    textView2.setMaxLines(1);
                    i = 8;
                }
                PrimaryButtonView primaryButtonView = (PrimaryButtonView) obf0Var.f163637d;
                primaryButtonView.setText(str2);
                if (z3 && str2.length() > 0) {
                    i = 0;
                }
                primaryButtonView.setVisibility(i);
                if (z3) {
                    constraintLayout2.setAccessibilityDelegate(new n4c(0));
                } else {
                    constraintLayout2.setAccessibilityDelegate(null);
                }
                WeakHashMap weakHashMap = mec1.f142677a;
                new xdc1().m77106j(constraintLayout2, Boolean.TRUE);
                if (z3) {
                    if (wl51.m88460J0(str2)) {
                        str2 = null;
                    }
                    mec1.m61561m(constraintLayout2, C2212of.f164591g, str2, null);
                } else {
                    mec1.m61560l(constraintLayout2, C2212of.f164591g.m66803a());
                    mec1.m61556h(constraintLayout2, 0);
                }
                ((ArtworkView) obf0Var.f163636c).mo2820d(new h76(new h66(uylVar.f235321e, new a66(4.0f))));
                return;
            case 2:
                cd1 cd1Var = (cd1) obj2;
                cd1Var.f36706c.mo2820d(j66.f109229a);
                TextView textView3 = cd1Var.f36707d;
                ((bd1) obj).getClass();
                textView3.setText((CharSequence) null);
                return;
            case 3:
                i16 i16Var = (i16) obj;
                String str8 = i16Var.f97415h;
                obf0 obf0Var2 = (obf0) obj2;
                EncoreListRow encoreListRow = (EncoreListRow) obf0Var2.f163640g;
                DateIconView dateIconView = (DateIconView) obf0Var2.f163636c;
                ArtworkView artworkView = (ArtworkView) obf0Var2.f163637d;
                ((TextView) encoreListRow.getBinding().f32321a.findViewById(R.id.title_slot)).setText(i16Var.f97412e);
                EncoreListRow encoreListRow2 = (EncoreListRow) obf0Var2.f163640g;
                ((TextView) encoreListRow2.getBinding().m30906c()).setText(i16Var.f97413f);
                ((FrameLayout) obf0Var2.f163635b).getContext().getResources().getDimensionPixelOffset(R.dimen.encore_spacer_base);
                ((ArtworkView) obf0Var2.f163638e).mo2820d(new z66(new h66(i16Var.f97408a), true));
                int i7 = i16Var.f97414g;
                if (i7 == -1 || str8 == null || str8.length() == 0) {
                    artworkView.setVisibility(0);
                    dateIconView.setVisibility(8);
                    artworkView.mo2820d(cuf1.m33914n(i16Var.f97410c, new h66(i16Var.f97409b, z56Var)));
                } else {
                    artworkView.setVisibility(4);
                    dateIconView.setVisibility(0);
                    dateIconView.f3004a.setText(str8);
                    dateIconView.f3005b.setText(String.valueOf(i7));
                }
                if (i16Var.f97418k) {
                    encoreListRow2.getBinding().m30907d().setVisibility(0);
                } else {
                    encoreListRow2.getBinding().m30907d().setVisibility(8);
                }
                ((CommentBubbleView) obf0Var2.f163639f).mo2820d(new ucf(i16Var.f97411d, i16Var.f97416i, i16Var.f97417j));
                return;
            case 4:
                return;
            case 5:
                uyl uylVar2 = (uyl) obj;
                String str9 = uylVar2.f235318b;
                String str10 = uylVar2.f235320d;
                String str11 = uylVar2.f235319c;
                z9p z9pVar = (z9p) obj2;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) z9pVar.f280843b;
                PrimaryButtonView primaryButtonView2 = (PrimaryButtonView) z9pVar.f280845d;
                TextView textView4 = (TextView) z9pVar.f280848g;
                TextView textView5 = (TextView) z9pVar.f280846e;
                TextView textView6 = (TextView) z9pVar.f280847f;
                boolean z4 = uylVar2.f235322f;
                constraintLayout3.setTag(Boolean.valueOf(z4));
                ConstraintLayout constraintLayout4 = (ConstraintLayout) z9pVar.f280843b;
                constraintLayout4.setClickable(z4);
                String str12 = uylVar2.f235317a;
                String str13 = !wl51.m88460J0(str12) ? str12 : null;
                String str14 = !wl51.m88460J0(str9) ? str9 : null;
                String str15 = !wl51.m88460J0(str11) ? str11 : null;
                String strM43753y1 = g6f.m43753y0(bk5.m29582E0(new String[]{str13, str14}), ": ", null, null, null, 62);
                if (wl51.m88460J0(strM43753y1)) {
                    strM43753y1 = null;
                }
                constraintLayout4.setContentDescription(g6f.m43753y0(bk5.m29582E0(new String[]{strM43753y1, str15}), ", ", null, null, null, 62));
                textView4.setText(str12);
                textView6.setText(str9);
                if (wl51.m88460J0(str11)) {
                    textView5.setVisibility(8);
                    textView6.setMaxLines(2);
                } else {
                    textView5.setText(str11);
                    textView5.setVisibility(0);
                    textView6.setMaxLines(1);
                }
                textView6.setTextColor(textView4.getContext().getColor(R.color.opacity_white_70));
                primaryButtonView2.setVisibility((!z4 || wl51.m88460J0(str10)) ? 4 : 0);
                primaryButtonView2.setText(str10);
                if (z4) {
                    constraintLayout4.setAccessibilityDelegate(new n4c(2));
                } else {
                    constraintLayout4.setAccessibilityDelegate(null);
                }
                WeakHashMap weakHashMap2 = mec1.f142677a;
                new xdc1().m77106j(constraintLayout4, Boolean.TRUE);
                if (z4) {
                    if (wl51.m88460J0(str10)) {
                        str10 = null;
                    }
                    mec1.m61561m(constraintLayout4, C2212of.f164591g, str10, null);
                } else {
                    mec1.m61560l(constraintLayout4, C2212of.f164591g.m66803a());
                    mec1.m61556h(constraintLayout4, 0);
                }
                ((ArtworkView) z9pVar.f280844c).mo2820d(new h76(new h66(uylVar2.f235321e, new a66(4.0f))));
                return;
            case 6:
                dbu dbuVar = (dbu) obj;
                ykn yknVar = (ykn) obj2;
                View view = (View) yknVar.f273760f;
                EncoreButton encoreButton = (EncoreButton) yknVar.f273757c;
                int i8 = dbuVar.f47367c;
                int iM38547C = edb.m38547C(i8);
                int i9 = R.drawable.empty_section_view_shimmer_image_square;
                if (iM38547C == 0) {
                    i2 = R.drawable.empty_section_view_shimmer_image_square;
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.empty_section_view_shimmer_image_circle;
                }
                view.setBackgroundResource(i2);
                View view2 = (View) yknVar.f273761g;
                int iM38547C2 = edb.m38547C(i8);
                if (iM38547C2 != 0) {
                    if (iM38547C2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i9 = R.drawable.empty_section_view_shimmer_image_circle;
                }
                view2.setBackgroundResource(i9);
                TextView textView7 = (TextView) yknVar.f273759e;
                String str16 = dbuVar.f47365a;
                textView7.setText(str16);
                textView7.setVisibility((str16 == null || wl51.m88460J0(str16)) ? 8 : 0);
                TextView textView8 = (TextView) yknVar.f273758d;
                String str17 = dbuVar.f47366b;
                textView8.setText(str17);
                textView8.setVisibility((str17 == null || wl51.m88460J0(str17)) ? 8 : 0);
                String str18 = dbuVar.f47368d;
                if (str18 != null && !wl51.m88460J0(str18)) {
                    z = false;
                }
                encoreButton.setVisibility(z ? 8 : 0);
                if (z) {
                    return;
                }
                encoreButton.setText(str18);
                return;
            case 7:
                a1w a1wVar = (a1w) obj;
                d1w d1wVar = (d1w) obj2;
                TextView textView9 = d1wVar.f44369e;
                String str19 = a1wVar.f11482a;
                textView9.setText(str19);
                TextView textView10 = d1wVar.f44368d;
                String str20 = a1wVar.f11483b;
                textView10.setText(str20);
                d1wVar.f44367c.mo2820d(new u66(a1wVar.f11484c, false));
                TextView textView11 = d1wVar.f44369e;
                if (str19.length() != 0 && str20.length() != 0) {
                    i4 = 1;
                }
                textView11.setLines(i4);
                textView11.setVisibility(str19.length() > 0 ? 0 : 8);
                textView10.setVisibility(str20.length() > 0 ? 0 : 8);
                return;
            case 8:
                gt00 gt00Var = (gt00) obj;
                vxx vxxVar = (vxx) obj2;
                ArtworkView artworkView2 = (ArtworkView) vxxVar.f245850c;
                Uri uri = gt00Var.f84060d;
                artworkView2.mo2820d(new g76(new h66(uri != null ? uri.toString() : null)));
                ((TextView) vxxVar.f245855h).setText(gt00Var.f84057a);
                ((TextView) vxxVar.f245854g).setText(gt00Var.f84058b);
                ((TextView) vxxVar.f245851d).setText(gt00Var.f84059c);
                ((PrimaryButtonView) vxxVar.f245852e).setText(gt00Var.f84061e);
                TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) vxxVar.f245853f;
                tertiaryButtonView.setText(gt00Var.f84062f);
                tertiaryButtonView.setTextColor(e071.f54894a);
                return;
            case 9:
                en90 en90Var = (en90) obj;
                etz etzVar = (etz) obj2;
                TextView textView12 = (TextView) etzVar.f62827f;
                TertiaryButtonView tertiaryButtonView2 = (TertiaryButtonView) etzVar.f62825d;
                textView12.setText(en90Var.f61108a);
                ((TextView) etzVar.f62824c).setText(en90Var.f61109b);
                ((PrimaryButtonView) etzVar.f62826e).setText(en90Var.f61110c);
                String str21 = en90Var.f61111d;
                if (str21 == null || str21.length() == 0) {
                    tertiaryButtonView2.setVisibility(8);
                    return;
                }
                tertiaryButtonView2.setVisibility(0);
                tertiaryButtonView2.setTextColor(e071.f54895b);
                tertiaryButtonView2.setText(str21);
                return;
            case 10:
                f2l0 f2l0Var = (f2l0) obj;
                int i10 = f2l0Var.f65209d;
                boolean z5 = f2l0Var.f65212g;
                z9p z9pVar2 = (z9p) obj2;
                TextView textView13 = (TextView) z9pVar2.f280847f;
                ContextMenuButton contextMenuButton = (ContextMenuButton) z9pVar2.f280845d;
                ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) z9pVar2.f280848g;
                ArtworkView artworkView3 = (ArtworkView) z9pVar2.f280844c;
                TextView textView14 = (TextView) z9pVar2.f280846e;
                String str22 = f2l0Var.f65206a;
                textView13.setText(str22);
                TextView textView15 = (TextView) z9pVar2.f280847f;
                textView15.setActivated(f2l0Var.f65210e != 3);
                textView14.setText(f2l0Var.f65207b);
                h66 h66Var = new h66(z5 ? null : f2l0Var.f65208c, z56Var);
                int iM38547C3 = edb.m38547C(i10);
                if (iM38547C3 == 0) {
                    i76Var = new i76(h66Var);
                } else if (iM38547C3 == 1) {
                    i76Var = new l66(h66Var, false);
                } else if (iM38547C3 == 2) {
                    i76Var = new u66(h66Var, false);
                } else {
                    if (iM38547C3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i76Var = new a76(h66Var, false);
                }
                artworkView3.mo2820d(i76Var);
                contentRestrictionBadgeView.mo2820d(f2l0Var.f65211f);
                int iM38547C4 = edb.m38547C(i10);
                if (iM38547C4 == 0) {
                    i4 = 1;
                } else if (iM38547C4 == 1) {
                    i4 = 3;
                } else if (iM38547C4 != 2) {
                    if (iM38547C4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = 5;
                }
                contextMenuButton.setEnabled(true);
                contextMenuButton.setContentDescription(contextMenuButton.getResources().getString(ydj.m93443b(i4), str22));
                boolean z6 = !z5;
                textView15.setEnabled(z6);
                textView14.setEnabled(z6);
                artworkView3.setEnabled(z6);
                contentRestrictionBadgeView.setEnabled(z6);
                contextMenuButton.setEnabled(z6);
                return;
            case 11:
                nfp0 nfp0Var = (nfp0) obj;
                String str23 = nfp0Var.f153411c;
                String str24 = nfp0Var.f153410b;
                d1w d1wVar2 = (d1w) obj2;
                ArtworkView artworkView4 = d1wVar2.f44367c;
                TextView textView16 = d1wVar2.f44368d;
                TextView textView17 = d1wVar2.f44369e;
                artworkView4.mo2820d(new a76(new h66(nfp0Var.f153409a), false));
                ConstraintLayout constraintLayout5 = d1wVar2.f44366b;
                String strM43753y2 = nfp0Var.f153412d;
                if (strM43753y2 == null || strM43753y2.length() <= 0) {
                    List listM46715L = h6f.m46715L(str24, str23);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listM46715L) {
                        String str25 = (String) obj3;
                        if (str25 != null && str25.length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    strM43753y2 = g6f.m43753y0(arrayList, ", ", null, null, null, 62);
                }
                constraintLayout5.setContentDescription(strM43753y2);
                textView17.setText(str24);
                textView16.setText(str23);
                if (str24 != null && str24.length() != 0 && str23 != null && str23.length() != 0) {
                    i4 = 1;
                }
                textView17.setLines(i4);
                textView17.setVisibility((str24 == null || str24.length() == 0) ? 8 : 0);
                if (str23 != null && str23.length() != 0) {
                    i5 = 0;
                }
                textView16.setVisibility(i5);
                return;
            case 12:
                qmq0 qmq0Var = (qmq0) obj;
                r3n0 r3n0Var = (r3n0) obj2;
                if (qmq0Var.f190380b == 1) {
                    EncoreButton encoreButton2 = (EncoreButton) r3n0Var.f195526c;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) encoreButton2.getLayoutParams();
                    DisplayMetrics displayMetrics = encoreButton2.getContext().getResources().getDisplayMetrics();
                    wj50.m88279p(displayMetrics);
                    int iApplyDimension = (int) TypedValue.applyDimension(1, 16, displayMetrics);
                    int iApplyDimension2 = (int) TypedValue.applyDimension(1, 8, displayMetrics);
                    marginLayoutParams.setMargins(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                    encoreButton2.setLayoutParams(marginLayoutParams);
                } else {
                    EncoreButton encoreButton3 = (EncoreButton) r3n0Var.f195526c;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) encoreButton3.getLayoutParams();
                    DisplayMetrics displayMetrics2 = encoreButton3.getContext().getResources().getDisplayMetrics();
                    wj50.m88279p(displayMetrics2);
                    int iApplyDimension3 = (int) TypedValue.applyDimension(1, 0, displayMetrics2);
                    int iApplyDimension4 = (int) TypedValue.applyDimension(1, 8, displayMetrics2);
                    marginLayoutParams2.setMargins(iApplyDimension3, iApplyDimension4, iApplyDimension3, iApplyDimension4);
                    encoreButton3.setLayoutParams(marginLayoutParams2);
                    i6 = -2;
                }
                EncoreButton encoreButton4 = (EncoreButton) r3n0Var.f195526c;
                ViewGroup.LayoutParams layoutParams = encoreButton4.getLayoutParams();
                layoutParams.width = i6;
                encoreButton4.setLayoutParams(layoutParams);
                encoreButton4.setText(qmq0Var.f190379a);
                return;
            case 13:
                ((oev0) obj2).f164567c.setText(((oaz0) obj).f163498a);
                return;
            case 14:
                ((TrackInfoView) obj2).m16005x((dg81) obj);
                return;
            default:
                throw ei6.m39072i(obj);
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f20566a) {
            case 0:
                return (AddToButtonView) this.f20567b;
            case 1:
                return (ConstraintLayout) ((obf0) this.f20567b).f163635b;
            case 2:
                return ((cd1) this.f20567b).f36705b;
            case 3:
                return (FrameLayout) ((obf0) this.f20567b).f163635b;
            case 4:
                return (LinearLayout) ((np7) this.f20567b).f156890b;
            case 5:
                return (ConstraintLayout) ((z9p) this.f20567b).f280843b;
            case 6:
                return (FrameLayout) ((ykn) this.f20567b).f273756b;
            case 7:
                return ((d1w) this.f20567b).f44366b;
            case 8:
                return (ScrollView) ((vxx) this.f20567b).f245849b;
            case 9:
                return (ConstraintLayout) ((etz) this.f20567b).f62823b;
            case 10:
                return (ConstraintLayout) ((z9p) this.f20567b).f280843b;
            case 11:
                return ((d1w) this.f20567b).f44366b;
            case 12:
                return (ConstraintLayout) ((r3n0) this.f20567b).f195527d;
            case 13:
                return ((oev0) this.f20567b).f164566b;
            case 14:
                return (TrackInfoView) this.f20567b;
            default:
                return (TextView) this.f20567b;
        }
    }

    @Override // p204p.wi21
    /* JADX INFO: renamed from: j */
    public ArtworkView mo27335j() {
        switch (this.f20566a) {
            case 7:
                break;
        }
        return ((d1w) this.f20567b).f44367c;
    }

    /* JADX INFO: renamed from: e */
    private final void m27334e(gh00 gh00Var) {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0153 A[PHI: r5
      0x0153: PHI (r5v43 int) = (r5v42 int), (r5v44 int), (r5v45 int) binds: [B:23:0x00e5, B:25:0x00f1, B:27:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01f7 A[PHI: r5
      0x01f7: PHI (r5v33 int) = (r5v32 int), (r5v34 int) binds: [B:41:0x018c, B:43:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    public awo(Context context, e940 e940Var, int i) {
        int i2;
        d1w d1wVarM34671a;
        int i3;
        this.f20566a = i;
        int i4 = R.id.subtitle;
        int i5 = R.id.cta_title;
        switch (i) {
            case 2:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.add_more_row_blend_playlist, (ViewGroup) null, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewInflate, R.id.artwork);
                if (artworkView != null) {
                    TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.title);
                    if (textView != null) {
                        cd1 cd1Var = new cd1(constraintLayout, artworkView, textView, 0);
                        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        artworkView.setViewContext(new r96(e940Var));
                        q3r0 q3r0VarM26334q = alf1.m26334q(constraintLayout);
                        Collections.addAll(q3r0VarM26334q.f184932c, textView);
                        Collections.addAll(q3r0VarM26334q.f184933d, artworkView);
                        q3r0VarM26334q.m72126a();
                        this.f20567b = cd1Var;
                        return;
                    }
                    i2 = R.id.title;
                } else {
                    i2 = R.id.artwork;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            case 3:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.artist_pick_main_card, (ViewGroup) null, false);
                int i6 = R.id.artist_pick_date;
                DateIconView dateIconView = (DateIconView) vie1.m85629k(viewInflate2, R.id.artist_pick_date);
                if (dateIconView != null) {
                    i6 = R.id.artist_pick_image;
                    ArtworkView artworkView2 = (ArtworkView) vie1.m85629k(viewInflate2, R.id.artist_pick_image);
                    if (artworkView2 != null) {
                        i6 = R.id.background_image;
                        ArtworkView artworkView3 = (ArtworkView) vie1.m85629k(viewInflate2, R.id.background_image);
                        if (artworkView3 != null) {
                            i6 = R.id.card_root;
                            if (((ConstraintLayout) vie1.m85629k(viewInflate2, R.id.card_root)) != null) {
                                i6 = R.id.comment;
                                CommentBubbleView commentBubbleView = (CommentBubbleView) vie1.m85629k(viewInflate2, R.id.comment);
                                if (commentBubbleView != null) {
                                    i6 = R.id.encore_list_row;
                                    EncoreListRow encoreListRow = (EncoreListRow) vie1.m85629k(viewInflate2, R.id.encore_list_row);
                                    if (encoreListRow != null) {
                                        i6 = R.id.left_guide;
                                        if (((Guideline) vie1.m85629k(viewInflate2, R.id.left_guide)) != null) {
                                            i6 = R.id.play_button;
                                            if (((IconPlay) vie1.m85629k(viewInflate2, R.id.play_button)) != null) {
                                                FrameLayout frameLayout = (FrameLayout) viewInflate2;
                                                obf0 obf0Var = new obf0(frameLayout, dateIconView, artworkView2, artworkView3, commentBubbleView, encoreListRow, 5);
                                                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                commentBubbleView.getCommentImage().setViewContext(new r96(e940Var));
                                                artworkView2.setViewContext(new r96(e940Var));
                                                artworkView3.setViewContext(new r96(e940Var));
                                                q3r0 q3r0VarM26333p = alf1.m26333p(frameLayout);
                                                Collections.addAll(q3r0VarM26333p.f184933d, commentBubbleView.getCommentImage(), artworkView2, artworkView3);
                                                q3r0VarM26333p.m72126a();
                                                this.f20567b = obf0Var;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i6)));
            case 4:
            case 6:
            case 9:
            default:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.carousel_cta_ad_card, (ViewGroup) null, false);
                ArtworkView artworkView4 = (ArtworkView) vie1.m85629k(viewInflate3, R.id.cta_artwork);
                if (artworkView4 != null) {
                    PrimaryButtonView primaryButtonView = (PrimaryButtonView) vie1.m85629k(viewInflate3, R.id.cta_button);
                    if (primaryButtonView != null) {
                        TextView textView2 = (TextView) vie1.m85629k(viewInflate3, R.id.cta_secondary_subtitle);
                        if (textView2 != null) {
                            TextView textView3 = (TextView) vie1.m85629k(viewInflate3, R.id.cta_subtitle);
                            if (textView3 != null) {
                                TextView textView4 = (TextView) vie1.m85629k(viewInflate3, R.id.cta_title);
                                if (textView4 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
                                    obf0 obf0Var2 = new obf0(constraintLayout2, artworkView4, primaryButtonView, textView2, textView3, textView4, 10);
                                    constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    artworkView4.setViewContext(new r96(e940Var));
                                    primaryButtonView.setImportantForAccessibility(4);
                                    q3r0 q3r0VarM26333p2 = alf1.m26333p(constraintLayout2);
                                    Collections.addAll(q3r0VarM26333p2.f184932c, textView4, textView3, textView2, primaryButtonView);
                                    Collections.addAll(q3r0VarM26333p2.f184933d, artworkView4);
                                    q3r0VarM26333p2.m72126a();
                                    this.f20567b = obf0Var2;
                                    return;
                                }
                            } else {
                                i5 = R.id.cta_subtitle;
                            }
                        } else {
                            i5 = R.id.cta_secondary_subtitle;
                        }
                    } else {
                        i5 = R.id.cta_button;
                    }
                } else {
                    i5 = R.id.cta_artwork;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i5)));
            case 5:
                View viewInflate4 = LayoutInflater.from(context).inflate(R.layout.default_cta_ad_card, (ViewGroup) null, false);
                ArtworkView artworkView5 = (ArtworkView) vie1.m85629k(viewInflate4, R.id.cta_artwork);
                if (artworkView5 != null) {
                    PrimaryButtonView primaryButtonView2 = (PrimaryButtonView) vie1.m85629k(viewInflate4, R.id.cta_button);
                    if (primaryButtonView2 != null) {
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate4;
                        TextView textView5 = (TextView) vie1.m85629k(viewInflate4, R.id.cta_secondary_subtitle);
                        if (textView5 != null) {
                            TextView textView6 = (TextView) vie1.m85629k(viewInflate4, R.id.cta_subtitle);
                            if (textView6 != null) {
                                TextView textView7 = (TextView) vie1.m85629k(viewInflate4, R.id.cta_title);
                                if (textView7 != null) {
                                    i5 = R.id.guideline_left;
                                    if (((Guideline) vie1.m85629k(viewInflate4, R.id.guideline_left)) != null) {
                                        i5 = R.id.guideline_right;
                                        if (((Guideline) vie1.m85629k(viewInflate4, R.id.guideline_right)) != null) {
                                            z9p z9pVar = new z9p(constraintLayout3, artworkView5, primaryButtonView2, textView5, textView6, textView7, 0);
                                            constraintLayout3.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            artworkView5.setViewContext(new r96(e940Var));
                                            primaryButtonView2.setImportantForAccessibility(4);
                                            q3r0 q3r0VarM26333p3 = alf1.m26333p(constraintLayout3);
                                            Collections.addAll(q3r0VarM26333p3.f184932c, textView7, textView6, textView5, primaryButtonView2);
                                            Collections.addAll(q3r0VarM26333p3.f184933d, artworkView5);
                                            q3r0VarM26333p3.m72126a();
                                            this.f20567b = z9pVar;
                                            return;
                                        }
                                    }
                                }
                            } else {
                                i5 = R.id.cta_subtitle;
                            }
                        } else {
                            i5 = R.id.cta_secondary_subtitle;
                        }
                    } else {
                        i5 = R.id.cta_button;
                    }
                } else {
                    i5 = R.id.cta_artwork;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i5)));
            case 7:
                Trace.beginSection("ECM:EpisodeCard:inflate");
                try {
                    if (((Boolean) moi0.f145685e.getValue()).booleanValue()) {
                        d1wVarM34671a = d1w.m34671a(new j3s0(context));
                    } else {
                        d1wVarM34671a = d1w.m34671a(LayoutInflater.from(context).inflate(R.layout.episode_card_layout, (ViewGroup) null, false));
                    }
                    Trace.endSection();
                    ArtworkView artworkView6 = d1wVarM34671a.f44367c;
                    artworkView6.setViewContext(new r96(e940Var));
                    q3r0 q3r0VarM26333p4 = alf1.m26333p(d1wVarM34671a.f44366b);
                    Collections.addAll(q3r0VarM26333p4.f184932c, d1wVarM34671a.f44369e, d1wVarM34671a.f44368d);
                    Collections.addAll(q3r0VarM26333p4.f184933d, artworkView6);
                    q3r0VarM26333p4.m72126a();
                    this.f20567b = d1wVarM34671a;
                    m88183a();
                    m88184b();
                    return;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 8:
                View viewInflate5 = LayoutInflater.from(context).inflate(R.layout.gated_content_engagement_dialog_layout, (ViewGroup) null, false);
                int i7 = R.id.bookArtwork;
                ArtworkView artworkView7 = (ArtworkView) vie1.m85629k(viewInflate5, R.id.bookArtwork);
                if (artworkView7 != null) {
                    i7 = R.id.descriptionSecondaryTextView;
                    TextView textView8 = (TextView) vie1.m85629k(viewInflate5, R.id.descriptionSecondaryTextView);
                    if (textView8 != null) {
                        i7 = R.id.descriptionTextView;
                        TextView textView9 = (TextView) vie1.m85629k(viewInflate5, R.id.descriptionTextView);
                        if (textView9 != null) {
                            i7 = R.id.dismissButton;
                            TertiaryButtonView tertiaryButtonView = (TertiaryButtonView) vie1.m85629k(viewInflate5, R.id.dismissButton);
                            if (tertiaryButtonView != null) {
                                i7 = R.id.end_guideline;
                                if (((Guideline) vie1.m85629k(viewInflate5, R.id.end_guideline)) != null) {
                                    i7 = R.id.okButton;
                                    PrimaryButtonView primaryButtonView3 = (PrimaryButtonView) vie1.m85629k(viewInflate5, R.id.okButton);
                                    if (primaryButtonView3 != null) {
                                        ScrollView scrollView = (ScrollView) viewInflate5;
                                        i7 = R.id.start_guideline;
                                        if (((Guideline) vie1.m85629k(viewInflate5, R.id.start_guideline)) != null) {
                                            i7 = R.id.titleTextView;
                                            TextView textView10 = (TextView) vie1.m85629k(viewInflate5, R.id.titleTextView);
                                            if (textView10 != null) {
                                                i7 = R.id.top_guideline;
                                                if (((Guideline) vie1.m85629k(viewInflate5, R.id.top_guideline)) != null) {
                                                    vxx vxxVar = new vxx(scrollView, artworkView7, textView8, textView9, tertiaryButtonView, primaryButtonView3, textView10, 7);
                                                    scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                    artworkView7.setViewContext(new r96(e940Var));
                                                    this.f20567b = vxxVar;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i7)));
            case 10:
                View viewInflate6 = LayoutInflater.from(context).inflate(R.layout.offline_row_search_layout, (ViewGroup) null, false);
                ArtworkView artworkView8 = (ArtworkView) vie1.m85629k(viewInflate6, R.id.artwork);
                if (artworkView8 != null) {
                    int i8 = R.id.context_menu_button;
                    ContextMenuButton contextMenuButton = (ContextMenuButton) vie1.m85629k(viewInflate6, R.id.context_menu_button);
                    if (contextMenuButton != null) {
                        i8 = R.id.restriction_badge;
                        ContentRestrictionBadgeView contentRestrictionBadgeView = (ContentRestrictionBadgeView) vie1.m85629k(viewInflate6, R.id.restriction_badge);
                        if (contentRestrictionBadgeView != null) {
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate6;
                            TextView textView11 = (TextView) vie1.m85629k(viewInflate6, R.id.subtitle);
                            if (textView11 != null) {
                                TextView textView12 = (TextView) vie1.m85629k(viewInflate6, R.id.title);
                                if (textView12 != null) {
                                    z9p z9pVar2 = new z9p(constraintLayout4, artworkView8, contextMenuButton, contentRestrictionBadgeView, textView11, textView12);
                                    artworkView8.setViewContext(new r96(e940Var));
                                    q3r0 q3r0VarM26334q2 = alf1.m26334q(constraintLayout4);
                                    Collections.addAll(q3r0VarM26334q2.f184932c, textView12, textView11);
                                    Collections.addAll(q3r0VarM26334q2.f184933d, artworkView8);
                                    q3r0VarM26334q2.m72126a();
                                    constraintLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                    this.f20567b = z9pVar2;
                                    return;
                                }
                                i3 = R.id.title;
                            } else {
                                i3 = R.id.subtitle;
                            }
                        } else {
                            i3 = i8;
                        }
                    } else {
                        i3 = i8;
                    }
                } else {
                    i3 = R.id.artwork;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate6.getResources().getResourceName(i3)));
            case 11:
                View viewInflate7 = LayoutInflater.from(context).inflate(R.layout.playlist_card_layout, (ViewGroup) null, false);
                ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate7;
                int i9 = R.id.download_badge_subtitle;
                DownloadBadgeView downloadBadgeView = (DownloadBadgeView) vie1.m85629k(viewInflate7, R.id.download_badge_subtitle);
                if (downloadBadgeView != null) {
                    i9 = R.id.download_badge_title;
                    DownloadBadgeView downloadBadgeView2 = (DownloadBadgeView) vie1.m85629k(viewInflate7, R.id.download_badge_title);
                    if (downloadBadgeView2 != null) {
                        i9 = R.id.image;
                        ArtworkView artworkView9 = (ArtworkView) vie1.m85629k(viewInflate7, R.id.image);
                        if (artworkView9 != null) {
                            TextView textView13 = (TextView) vie1.m85629k(viewInflate7, R.id.subtitle);
                            if (textView13 != null) {
                                TextView textView14 = (TextView) vie1.m85629k(viewInflate7, R.id.title);
                                if (textView14 != null) {
                                    d1w d1wVar = new d1w(constraintLayout5, downloadBadgeView, downloadBadgeView2, artworkView9, textView13, textView14);
                                    artworkView9.setViewContext(new r96(e940Var));
                                    q3r0 q3r0VarM26333p5 = alf1.m26333p(constraintLayout5);
                                    ArrayList arrayList = q3r0VarM26333p5.f184932c;
                                    Collections.addAll(arrayList, textView14);
                                    Collections.addAll(arrayList, textView13);
                                    Collections.addAll(q3r0VarM26333p5.f184933d, artworkView9);
                                    q3r0VarM26333p5.m72126a();
                                    this.f20567b = d1wVar;
                                    m88183a();
                                    m88184b();
                                    return;
                                }
                                i4 = R.id.title;
                            }
                        } else {
                            i4 = i9;
                        }
                    } else {
                        i4 = i9;
                    }
                } else {
                    i4 = i9;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate7.getResources().getResourceName(i4)));
        }
    }

    public awo(TrackInfoView trackInfoView) {
        this.f20566a = 14;
        this.f20567b = trackInfoView;
    }
}
