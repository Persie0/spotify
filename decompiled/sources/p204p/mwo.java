package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.adsdisplay.uiusecases.adtag.AdTagView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.followpeople.FollowPeopleButton;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class mwo implements ovf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147828a;

    /* JADX INFO: renamed from: b */
    public Object f147829b;

    /* JADX INFO: renamed from: c */
    public final Object f147830c;

    /* JADX INFO: renamed from: d */
    public Object f147831d;

    /* JADX INFO: renamed from: e */
    public Object f147832e;

    /* JADX INFO: renamed from: f */
    public Object f147833f;

    /* JADX INFO: renamed from: g */
    public Object f147834g;

    public mwo(Context context, e940 e940Var, int i) {
        this.f147828a = i;
        switch (i) {
            case 2:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.people_row_profile_layout, (ViewGroup) null, false);
                int i2 = R.id.action_button_stub;
                ViewStub viewStub = (ViewStub) vie1.m85629k(viewInflate, R.id.action_button_stub);
                if (viewStub != null) {
                    i2 = R.id.context_menu_button;
                    ContextMenuButton contextMenuButton = (ContextMenuButton) vie1.m85629k(viewInflate, R.id.context_menu_button);
                    if (contextMenuButton != null) {
                        i2 = R.id.follow_button;
                        FollowPeopleButton followPeopleButton = (FollowPeopleButton) vie1.m85629k(viewInflate, R.id.follow_button);
                        if (followPeopleButton != null) {
                            i2 = R.id.people_artwork_view;
                            ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewInflate, R.id.people_artwork_view);
                            if (artworkView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i2 = R.id.secondary_action_button_stub;
                                ViewStub viewStub2 = (ViewStub) vie1.m85629k(viewInflate, R.id.secondary_action_button_stub);
                                if (viewStub2 != null) {
                                    i2 = R.id.subtitle_view;
                                    TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.subtitle_view);
                                    if (textView != null) {
                                        i2 = R.id.title_view;
                                        TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.title_view);
                                        if (textView2 != null) {
                                            i2 = R.id.titles_end_barrier;
                                            if (((Barrier) vie1.m85629k(viewInflate, R.id.titles_end_barrier)) != null) {
                                                tw80 tw80Var = new tw80(constraintLayout, viewStub, contextMenuButton, followPeopleButton, artworkView, viewStub2, textView, textView2, 8);
                                                constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                q3r0 q3r0VarM26334q = alf1.m26334q(constraintLayout);
                                                Collections.addAll(q3r0VarM26334q.f184933d, artworkView, followPeopleButton);
                                                Collections.addAll(q3r0VarM26334q.f184932c, textView2, textView);
                                                q3r0VarM26334q.m72126a();
                                                artworkView.setViewContext(new r96(e940Var));
                                                this.f147830c = tw80Var;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            default:
                this.f147829b = context;
                this.f147830c = e940Var;
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.default_embeddedad_image_card, (ViewGroup) null, false);
                int i3 = R.id.ad_tag;
                if (((AdTagView) vie1.m85629k(viewInflate2, R.id.ad_tag)) != null) {
                    i3 = R.id.advertiser;
                    TextView textView3 = (TextView) vie1.m85629k(viewInflate2, R.id.advertiser);
                    if (textView3 != null) {
                        i3 = R.id.close_button;
                        ClearButtonView clearButtonView = (ClearButtonView) vie1.m85629k(viewInflate2, R.id.close_button);
                        if (clearButtonView != null) {
                            i3 = R.id.container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) vie1.m85629k(viewInflate2, R.id.container);
                            if (constraintLayout2 != null) {
                                i3 = R.id.cta_button;
                                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate2, R.id.cta_button);
                                if (encoreButton != null) {
                                    i3 = R.id.image;
                                    ImageView imageView = (ImageView) vie1.m85629k(viewInflate2, R.id.image);
                                    if (imageView != null) {
                                        FrameLayout frameLayout = (FrameLayout) viewInflate2;
                                        d2n d2nVar = new d2n(frameLayout, textView3, clearButtonView, constraintLayout2, encoreButton, imageView);
                                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                        q3r0 q3r0VarM26333p = alf1.m26333p(constraintLayout2);
                                        Collections.addAll(q3r0VarM26333p.f184932c, textView3);
                                        Collections.addAll(q3r0VarM26333p.f184933d, imageView);
                                        q3r0VarM26333p.m72126a();
                                        this.f147831d = d2nVar;
                                        this.f147832e = new wg61(new wep(this, 0));
                                        this.f147833f = q6p.f185893d;
                                        this.f147834g = o9p.f163112d;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m63063a(z4u z4uVar) {
        d2n d2nVar = (d2n) this.f147831d;
        ((TextView) d2nVar.f44587b).setText(z4uVar.f279349a);
        FrameLayout frameLayout = (FrameLayout) d2nVar.f44590e;
        boolean z = z4uVar.f279352d;
        frameLayout.setClickable(z);
        EncoreButton encoreButton = (EncoreButton) d2nVar.f44589d;
        encoreButton.setVisibility(!z ? 4 : 0);
        encoreButton.setClickable(z);
        String string = z4uVar.f279350b;
        if (string == null) {
            string = "";
        }
        if (wl51.m88460J0(string)) {
            string = ((Context) this.f147829b).getString(R.string.default_cta_text);
        }
        encoreButton.setText(string);
        ((ImageView) d2nVar.f44591f).addOnLayoutChangeListener(new j96(7, this, z4uVar));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        switch (this.f147828a) {
            case 0:
                this.f147829b = gh00Var;
                vxx vxxVar = (vxx) this.f147834g;
                ((EncoreButton) vxxVar.f245853f).setOnClickListener(new vk0(23, gh00Var));
                ((EncoreButton) vxxVar.f245854g).setOnClickListener(new vk0(24, gh00Var));
                break;
            case 1:
                d2n d2nVar = (d2n) this.f147831d;
                mxg1.m63111v((FrameLayout) d2nVar.f44590e, 1000, new u4p(6, gh00Var));
                ((ClearButtonView) d2nVar.f44588c).mo2821c(new u4p(7, gh00Var));
                mxg1.m63111v((EncoreButton) d2nVar.f44589d, 1000, new u4p(8, gh00Var));
                this.f147833f = new aog(21, gh00Var);
                this.f147834g = new u4p(9, gh00Var);
                break;
            default:
                this.f147829b = gh00Var;
                tw80 tw80Var = (tw80) this.f147830c;
                ((ConstraintLayout) tw80Var.f224366b).setOnClickListener(new bwp(7, gh00Var));
                ((ConstraintLayout) tw80Var.f224366b).setOnLongClickListener(new bwo(11, gh00Var));
                ((FollowPeopleButton) tw80Var.f224369e).mo2821c(new gxp(0, gh00Var));
                ((ContextMenuButton) tw80Var.f224368d).setOnClickListener(new bwp(8, gh00Var));
                break;
        }
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        q76 l76Var;
        boolean z;
        boolean z2;
        Button buttonM78164N;
        TextView textView;
        int i = this.f147828a;
        Object obj2 = this.f147830c;
        int i2 = 0;
        switch (i) {
            case 0:
                vum0 vum0Var = (vum0) this.f147831d;
                yg3 yg3Var = (yg3) obj;
                ybn ybnVar = (ybn) obj2;
                vxx vxxVar = (vxx) this.f147834g;
                if (yg3Var instanceof wg3) {
                    wg3 wg3Var = (wg3) yg3Var;
                    c7y c7yVar = (c7y) this.f147833f;
                    ConstraintLayout constraintLayout = (ConstraintLayout) vxxVar.f245849b;
                    c7y c7yVarM31764a = c7y.m31764a(c7yVar, constraintLayout.getContext().getString(R.string.library_all_header_title), 1, constraintLayout.getContext().getString(R.string.library_all_header_profile_button_content_description), constraintLayout.getContext().getString(R.string.library_all_header_title_content_description), 40);
                    kt60 kt60Var = new kt60("root_page_state");
                    hxt hxtVar = (hxt) ybnVar.f271219b;
                    up60 up60Var = hxt.f96286w;
                    hxtVar.m49050k(c7yVarM31764a, kt60Var, null);
                    vum0Var.m86438w(R.string.library_all_header_create_playlist_icon_content_description);
                    ((EncoreButton) vxxVar.f245853f).setVisibility(wg3Var.f250955b ? 0 : 8);
                    ((EncoreButton) vxxVar.f245854g).setVisibility(wg3Var.f250956c ? 0 : 8);
                    ((ComposeView) vxxVar.f245852e).setVisibility(wg3Var.f250957d ? 0 : 8);
                    ((ComposeView) vxxVar.f245851d).setVisibility(8);
                    ((ComposeView) vxxVar.f245850c).setVisibility(8);
                } else {
                    if (!(yg3Var instanceof xg3)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xg3 xg3Var = (xg3) yg3Var;
                    c7y c7yVar2 = (c7y) this.f147833f;
                    String str = xg3Var.f261189a;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) vxxVar.f245849b;
                    ComposeView composeView = (ComposeView) vxxVar.f245851d;
                    EncoreButton encoreButton = (EncoreButton) vxxVar.f245853f;
                    c7y c7yVarM31764a2 = c7y.m31764a(c7yVar2, str, 2, null, constraintLayout2.getContext().getString(R.string.library_all_header_folder_name_content_description, xg3Var.f261189a), 44);
                    kt60 kt60Var2 = new kt60("folder_state");
                    hxt hxtVar2 = (hxt) ybnVar.f271219b;
                    up60 up60Var2 = hxt.f96286w;
                    hxtVar2.m49050k(c7yVarM31764a2, kt60Var2, null);
                    vum0Var.m86438w(R.string.f5913x82b3bc21);
                    encoreButton.setVisibility(8);
                    ((EncoreButton) vxxVar.f245854g).setVisibility(8);
                    ((ComposeView) vxxVar.f245852e).setVisibility(8);
                    ((ComposeView) vxxVar.f245850c).setVisibility(0);
                    bh3 bh3Var = xg3Var.f261191c;
                    if (bh3Var instanceof zg3) {
                        composeView.setVisibility(8);
                    } else {
                        if (!(bh3Var instanceof ah3)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        composeView.setVisibility(0);
                        ((yum0) this.f147832e).setValue(Boolean.valueOf(((ah3) bh3Var).f15589a));
                    }
                    encoreButton.setContentDescription(((ConstraintLayout) vxxVar.f245849b).getContext().getString(R.string.library_all_header_play_button_content_description));
                }
                y85.m93050G((ConstraintLayout) vxxVar.f245849b, yg3Var);
                return;
            case 1:
                m63063a((z4u) obj);
                return;
            default:
                zkn0 zkn0Var = (zkn0) obj;
                tw80 tw80Var = (tw80) obj2;
                TextView textView2 = (TextView) tw80Var.f224373i;
                FollowPeopleButton followPeopleButton = (FollowPeopleButton) tw80Var.f224369e;
                textView2.setText(zkn0Var.mo91364d());
                TextView textView3 = (TextView) tw80Var.f224372h;
                String strMo91363c = zkn0Var.mo91363c();
                textView3.setVisibility((strMo91363c == null || strMo91363c.length() == 0) ? 8 : 0);
                textView3.setText(zkn0Var.mo91363c());
                ArtworkView artworkView = (ArtworkView) tw80Var.f224370f;
                boolean z3 = zkn0Var instanceof xkn0;
                if (z3) {
                    l76Var = new m66(new h66(((xkn0) zkn0Var).f262901f), false);
                } else {
                    if (!(zkn0Var instanceof ykn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ykn0 ykn0Var = (ykn0) zkn0Var;
                    l76Var = new l76(ykn0Var.f273768g, ykn0Var.f273765d, new h66(ykn0Var.f273767f));
                }
                artworkView.mo2820d(l76Var);
                boolean z4 = zkn0Var instanceof ykn0;
                ((ContextMenuButton) tw80Var.f224368d).setVisibility((z4 && ((ykn0) zkn0Var).f273769h) ? 0 : 8);
                ykn0 ykn0Var2 = z4 ? (ykn0) zkn0Var : null;
                pvg1 pvg1Var = ykn0Var2 != null ? ykn0Var2.f273770i : null;
                ykn0 ykn0Var3 = z4 ? (ykn0) zkn0Var : null;
                pvg1 pvg1Var2 = ykn0Var3 != null ? ykn0Var3.f273771j : null;
                this.f147833f = pvg1Var;
                Integer numM38968h = pvg1Var != null ? ehg1.m38968h(pvg1Var) : null;
                if (numM38968h != null) {
                    Button button = (Button) this.f147831d;
                    if (button != null) {
                        z = true;
                        textView = button;
                    } else {
                        ViewStub viewStub = (ViewStub) tw80Var.f224367c;
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewStub.getParent();
                        z = true;
                        TextView textViewM78164N = si5.m78164N(pvg1Var, constraintLayout3);
                        textViewM78164N.setId(R.id.action_button_stub);
                        h6j h6jVar = new h6j((h6j) viewStub.getLayoutParams());
                        ((ViewGroup.MarginLayoutParams) h6jVar).height = -2;
                        textViewM78164N.setLayoutParams(h6jVar);
                        int iIndexOfChild = constraintLayout3.indexOfChild(viewStub);
                        constraintLayout3.removeView(viewStub);
                        constraintLayout3.addView(textViewM78164N, iIndexOfChild);
                        this.f147831d = textViewM78164N;
                        textViewM78164N.setOnClickListener(new fxp(this, i2));
                        textView = textViewM78164N;
                    }
                    textView.setText(numM38968h.intValue());
                    textView.setEnabled(!(pvg1Var instanceof skn0));
                    textView.setVisibility(0);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    h6j h6jVar2 = layoutParams instanceof h6j ? (h6j) layoutParams : null;
                    if (h6jVar2 != null) {
                        jhp jhpVar = new jhp(textView, 18);
                        if (pvg1Var2 != null) {
                            h6jVar2.f88165u = R.id.secondary_action_button_stub;
                            h6jVar2.setMarginEnd(((Number) jhpVar.invoke(8)).intValue());
                        } else {
                            h6jVar2.f88165u = R.id.context_menu_button;
                            h6jVar2.setMarginEnd(((Number) jhpVar.invoke(8)).intValue());
                        }
                        textView.setLayoutParams(h6jVar2);
                    }
                } else {
                    z = true;
                    Button button2 = (Button) this.f147831d;
                    if (button2 != null) {
                        button2.setVisibility(8);
                    }
                }
                this.f147834g = pvg1Var2;
                Integer numM38968h2 = pvg1Var2 != null ? ehg1.m38968h(pvg1Var2) : null;
                if (numM38968h2 != null) {
                    Button button3 = (Button) this.f147832e;
                    if (button3 != null) {
                        buttonM78164N = button3;
                        z2 = z;
                    } else {
                        ViewStub viewStub2 = (ViewStub) tw80Var.f224371g;
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewStub2.getParent();
                        buttonM78164N = si5.m78164N(pvg1Var2, constraintLayout4);
                        buttonM78164N.setId(R.id.secondary_action_button_stub);
                        h6j h6jVar3 = new h6j((h6j) viewStub2.getLayoutParams());
                        ((ViewGroup.MarginLayoutParams) h6jVar3).height = -2;
                        buttonM78164N.setLayoutParams(h6jVar3);
                        int iIndexOfChild2 = constraintLayout4.indexOfChild(viewStub2);
                        constraintLayout4.removeView(viewStub2);
                        constraintLayout4.addView(buttonM78164N, iIndexOfChild2);
                        this.f147832e = buttonM78164N;
                        z2 = z;
                        buttonM78164N.setOnClickListener(new fxp(this, z2 ? 1 : 0));
                    }
                    buttonM78164N.setText(numM38968h2.intValue());
                    buttonM78164N.setEnabled(z2);
                    buttonM78164N.setVisibility(0);
                } else {
                    z2 = z;
                    Button button4 = (Button) this.f147832e;
                    if (button4 != null) {
                        button4.setVisibility(8);
                    }
                }
                boolean z5 = (!zkn0Var.mo91362b() || (z3 && !((xkn0) zkn0Var).f262902g)) ? false : z2;
                followPeopleButton.setVisibility(z5 ? 0 : 8);
                if (z5) {
                    followPeopleButton.mo2820d(new zwz(zkn0Var.mo91364d(), zkn0Var.mo91365e(), zkn0Var.mo91361a()));
                    return;
                }
                return;
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        switch (this.f147828a) {
            case 0:
                return (ConstraintLayout) ((vxx) this.f147834g).f245849b;
            case 1:
                return (FrameLayout) ((d2n) this.f147831d).f44590e;
            default:
                return (ConstraintLayout) ((tw80) this.f147830c).f224366b;
        }
    }

    public mwo(Context context, int i, vzn vznVar) {
        int dimensionPixelSize;
        this.f147828a = 0;
        this.f147829b = kko.f123648T0;
        this.f147831d = new vum0(R.string.library_all_header_create_playlist_icon_content_description);
        this.f147832e = sam.m77645B(Boolean.FALSE);
        this.f147833f = new c7y(0, 54, "", (String) null, context.getString(R.string.library_all_header_folder_back_button_content_description), (String) null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.library_all_header_layout, (ViewGroup) null, false);
        int i2 = R.id.button_container;
        if (((ConstraintLayout) vie1.m85629k(viewInflate, R.id.button_container)) != null) {
            i2 = R.id.button_context_menu;
            ComposeView composeView = (ComposeView) vie1.m85629k(viewInflate, R.id.button_context_menu);
            if (composeView != null) {
                i2 = R.id.button_create;
                ComposeView composeView2 = (ComposeView) vie1.m85629k(viewInflate, R.id.button_create);
                if (composeView2 != null) {
                    i2 = R.id.button_create_container;
                    if (((FrameLayout) vie1.m85629k(viewInflate, R.id.button_create_container)) != null) {
                        i2 = R.id.button_play;
                        ComposeView composeView3 = (ComposeView) vie1.m85629k(viewInflate, R.id.button_play);
                        if (composeView3 != null) {
                            i2 = R.id.button_recents;
                            EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.button_recents);
                            if (encoreButton != null) {
                                i2 = R.id.button_search;
                                EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate, R.id.button_search);
                                if (encoreButton2 != null) {
                                    i2 = R.id.button_settings;
                                    ComposeView composeView4 = (ComposeView) vie1.m85629k(viewInflate, R.id.button_settings);
                                    if (composeView4 != null) {
                                        i2 = R.id.face_header;
                                        View viewM85629k = vie1.m85629k(viewInflate, R.id.face_header);
                                        if (viewM85629k != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            vxx vxxVar = new vxx(constraintLayout, composeView, composeView2, composeView3, encoreButton, encoreButton2, composeView4, viewM85629k);
                                            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                            ybn ybnVar = new ybn(context, constraintLayout, (String) vznVar.f246489d, (atn) vznVar.f246487b, (st91) vznVar.f246488c);
                                            ybnVar.f271220c = new cxl(this, 22);
                                            this.f147830c = ybnVar;
                                            psg1.m70832H(viewM85629k, ((hxt) ybnVar.f271219b).f96307t);
                                            composeView.setContent(new fyf(new lwo(this, 1), true, 1696774608));
                                            composeView2.setContent(new fyf(new lwo(this, 3), true, 1152892936));
                                            composeView4.setContent(new fyf(new lwo(this, 8), true, 1972191169));
                                            composeView3.setContent(new fyf(new lwo(this, 6), true, 1318337424));
                                            Resources resources = context.getResources();
                                            ViewGroup.LayoutParams layoutParams = viewM85629k.getLayoutParams();
                                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                            if (marginLayoutParams != null) {
                                                ViewGroup.LayoutParams layoutParams2 = viewM85629k.getLayoutParams();
                                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                                                int i3 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
                                                ViewGroup.LayoutParams layoutParams3 = viewM85629k.getLayoutParams();
                                                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                                                int i4 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                                                int iM38547C = edb.m38547C(i);
                                                if (iM38547C == 0) {
                                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.your_library_page_top_padding_none);
                                                } else if (iM38547C == 1) {
                                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.your_library_page_top_padding_large);
                                                } else if (iM38547C == 2) {
                                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.your_library_page_top_padding_small);
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                int i5 = i4 + dimensionPixelSize;
                                                ViewGroup.LayoutParams layoutParams4 = viewM85629k.getLayoutParams();
                                                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                                                int i6 = marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0;
                                                ViewGroup.LayoutParams layoutParams5 = viewM85629k.getLayoutParams();
                                                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                                                marginLayoutParams.setMargins(i3, i5, i6, marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0);
                                                viewM85629k.setLayoutParams(marginLayoutParams);
                                            }
                                            this.f147834g = vxxVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }
}
