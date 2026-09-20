package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.music.R;
import com.spotify.music.SpotifyMainActivity;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class wep extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f250599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wep(Object obj, int i) {
        super(0);
        this.f250598a = i;
        this.f250599b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f250598a;
        int i2 = 6;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f250599b;
        switch (i) {
            case 0:
                return Integer.valueOf(((Context) ((mwo) obj).f147829b).getResources().getDimensionPixelSize(R.dimen.ad_image_corner_radius));
            case 1:
                vzn vznVar = (vzn) obj;
                rh10 rh10VarM80816b = th10.m80816b((Context) vznVar.f246489d, (ViewGroup) vznVar.f246487b);
                wj50.m88279p(rh10VarM80816b);
                sh10 sh10Var = (sh10) rh10VarM80816b;
                sh10Var.getView().setVisibility(8);
                sh10Var.getView().setBackgroundColor(0);
                sh10Var.getView().setId(R.id.view_empty);
                return rh10VarM80816b;
            case 2:
                kfp kfpVar = (kfp) obj;
                return new cjc0(((jim) kfpVar.f122211f).m53469a(new dgv(6, 56, null)), new mgi(kfpVar, 7));
            case 3:
                ViewStub viewStub = (ViewStub) ((x28) ((xzo) obj).f267727b).f257377M0;
                viewStub.setLayoutResource(R.layout.default_episode_row_loading_layout);
                return viewStub.inflate();
            case 4:
                return Boolean.valueOf(((m8w) obj).f141140c <= 0.0f);
            case 5:
                return Boolean.valueOf(((jiq) ((C1771da) obj).f46943b).f112811a.m51356a());
            case 6:
                php phpVar = (php) obj;
                ico icoVar = phpVar.f177699b;
                ycq ycqVar = phpVar.f177698a;
                icoVar.getClass();
                return new ohp(ycqVar);
            case 7:
                ((yjp) obj).f273422a.finish();
                return w2a1Var;
            case 8:
                return Boolean.valueOf(((oba0) ((xvo) obj).f266440b).f163589a.mo48713h(pba0.f175747a, false));
            case 9:
                return (xmd0) ((aqp) obj).f18748b.get();
            case 10:
                return (f1f0) ((yqp) obj).f275271b.get();
            case 11:
                return Integer.valueOf(((qly0) obj).f189945e.m86437v());
            case 12:
                return (kv91) ((gtp) obj).f84253b.get();
            case 13:
                return (xej0) ((tup) obj).f223895a.get();
            case 14:
                jvp jvpVar = (jvp) obj;
                return jvpVar.f116404Z0.m89894j(jvpVar);
            case 15:
                ((qyp) obj).f193973r.onNext(w3q0.f247630a);
                return w2a1Var;
            case 16:
                return (ya60) bzf1.m31021m(((ib60) obj).f100452c).f158717a.getValue();
            case 17:
                p36 p36Var = (p36) obj;
                View viewInflate = LayoutInflater.from((Context) p36Var.f173561b).inflate(R.layout.profile_completion_edit_name_view, (ViewGroup) null, false);
                int i3 = R.id.edit_name_body;
                EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewInflate, R.id.edit_name_body);
                if (encoreTextView != null) {
                    i3 = R.id.edit_name_input;
                    EditText editText = (EditText) vie1.m85629k(viewInflate, R.id.edit_name_input);
                    if (editText != null) {
                        i3 = R.id.edit_name_input_underline;
                        View viewM85629k = vie1.m85629k(viewInflate, R.id.edit_name_input_underline);
                        if (viewM85629k != null) {
                            i3 = R.id.edit_name_primary_button;
                            EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.edit_name_primary_button);
                            if (encoreButton != null) {
                                i3 = R.id.edit_name_title;
                                EncoreTextView encoreTextView2 = (EncoreTextView) vie1.m85629k(viewInflate, R.id.edit_name_title);
                                if (encoreTextView2 != null) {
                                    qnr0 qnr0Var = new qnr0((ConstraintLayout) viewInflate, encoreTextView, editText, viewM85629k, encoreButton, encoreTextView2);
                                    editText.addTextChangedListener(new wo5(p36Var, i2));
                                    return qnr0Var;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
            case 18:
                Context context = ((a1q) obj).f11454b;
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.profile_completion_edit_profile_picture_view, (ViewGroup) null, false);
                int i4 = R.id.edit_picture_body;
                EncoreTextView encoreTextView3 = (EncoreTextView) vie1.m85629k(viewInflate2, R.id.edit_picture_body);
                if (encoreTextView3 != null) {
                    i4 = R.id.edit_picture_display_name;
                    EncoreTextView encoreTextView4 = (EncoreTextView) vie1.m85629k(viewInflate2, R.id.edit_picture_display_name);
                    if (encoreTextView4 != null) {
                        i4 = R.id.edit_picture_faceview;
                        FaceView faceView = (FaceView) vie1.m85629k(viewInflate2, R.id.edit_picture_faceview);
                        if (faceView != null) {
                            i4 = R.id.edit_picture_primary_button;
                            EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate2, R.id.edit_picture_primary_button);
                            if (encoreButton2 != null) {
                                i4 = R.id.edit_picture_secondary_button;
                                EncoreButton encoreButton3 = (EncoreButton) vie1.m85629k(viewInflate2, R.id.edit_picture_secondary_button);
                                if (encoreButton3 != null) {
                                    i4 = R.id.edit_picture_title;
                                    EncoreTextView encoreTextView5 = (EncoreTextView) vie1.m85629k(viewInflate2, R.id.edit_picture_title);
                                    if (encoreTextView5 != null) {
                                        wnr0 wnr0Var = new wnr0((ConstraintLayout) viewInflate2, encoreTextView3, encoreTextView4, faceView, encoreButton2, encoreButton3, encoreTextView5);
                                        mec1.m61561m(faceView, C2212of.f164591g, context.getText(R.string.f5976xae539864), null);
                                        mec1.m61564p(faceView, new usa(5));
                                        return wnr0Var;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i4)));
            case 19:
                View viewInflate3 = LayoutInflater.from(((a1q) obj).f11454b).inflate(R.layout.profile_completion_onboarding_view, (ViewGroup) null, false);
                int i5 = R.id.onboarding_body;
                EncoreTextView encoreTextView6 = (EncoreTextView) vie1.m85629k(viewInflate3, R.id.onboarding_body);
                if (encoreTextView6 != null) {
                    i5 = R.id.onboarding_display_name;
                    EncoreTextView encoreTextView7 = (EncoreTextView) vie1.m85629k(viewInflate3, R.id.onboarding_display_name);
                    if (encoreTextView7 != null) {
                        i5 = R.id.onboarding_faceView;
                        FaceView faceView2 = (FaceView) vie1.m85629k(viewInflate3, R.id.onboarding_faceView);
                        if (faceView2 != null) {
                            i5 = R.id.onboarding_primary_button;
                            EncoreButton encoreButton4 = (EncoreButton) vie1.m85629k(viewInflate3, R.id.onboarding_primary_button);
                            if (encoreButton4 != null) {
                                i5 = R.id.onboarding_secondary_button;
                                EncoreButton encoreButton5 = (EncoreButton) vie1.m85629k(viewInflate3, R.id.onboarding_secondary_button);
                                if (encoreButton5 != null) {
                                    i5 = R.id.onboarding_title;
                                    EncoreTextView encoreTextView8 = (EncoreTextView) vie1.m85629k(viewInflate3, R.id.onboarding_title);
                                    if (encoreTextView8 != null) {
                                        return new tpr0((ConstraintLayout) viewInflate3, encoreTextView6, encoreTextView7, faceView2, encoreButton4, encoreButton5, encoreTextView8);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i5)));
            case 20:
                View viewInflate4 = LayoutInflater.from(((a1q) obj).f11454b).inflate(R.layout.profile_completion_result_view, (ViewGroup) null, false);
                int i6 = R.id.result_body;
                EncoreTextView encoreTextView9 = (EncoreTextView) vie1.m85629k(viewInflate4, R.id.result_body);
                if (encoreTextView9 != null) {
                    i6 = R.id.result_display_name;
                    EncoreTextView encoreTextView10 = (EncoreTextView) vie1.m85629k(viewInflate4, R.id.result_display_name);
                    if (encoreTextView10 != null) {
                        i6 = R.id.result_edit_button;
                        EncoreButton encoreButton6 = (EncoreButton) vie1.m85629k(viewInflate4, R.id.result_edit_button);
                        if (encoreButton6 != null) {
                            i6 = R.id.result_faceview;
                            FaceView faceView3 = (FaceView) vie1.m85629k(viewInflate4, R.id.result_faceview);
                            if (faceView3 != null) {
                                i6 = R.id.result_primary_button;
                                EncoreProgressIndicatorButton encoreProgressIndicatorButton = (EncoreProgressIndicatorButton) vie1.m85629k(viewInflate4, R.id.result_primary_button);
                                if (encoreProgressIndicatorButton != null) {
                                    i6 = R.id.result_title;
                                    EncoreTextView encoreTextView11 = (EncoreTextView) vie1.m85629k(viewInflate4, R.id.result_title);
                                    if (encoreTextView11 != null) {
                                        return new cqr0((ConstraintLayout) viewInflate4, encoreTextView9, encoreTextView10, encoreButton6, faceView3, encoreProgressIndicatorButton, encoreTextView11);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i6)));
            case 21:
                return ((SpotifyMainActivity) ((p2q) obj).f173400c).m15687w0().f60742b.f99396e;
            case 22:
                luk lukVar = ((w2q) obj).f247407d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return opo.m67570t(lukVar, x461VarM64613f);
            case 23:
                zy30 zy30Var = new zy30((Context) ((za7) obj).f280994c, null, 0, R.drawable.encore_icon_external_link);
                Context context2 = zy30Var.getContext();
                WeakHashMap weakHashMap = mec1.f142677a;
                zy30Var.setId(View.generateViewId());
                zy30Var.setImageTintList(lzj.m60387w(context2, R.color.dark_base_text_subdued));
                zy30Var.setContentDescription(context2.getString(R.string.supplementary_content_accessibility_external_link));
                return zy30Var;
            case 24:
                return (acq) ((ccq) obj).f36590a.get();
            case 25:
                ((hcq) obj).f89884a.m95875f();
                return w2a1Var;
            case 26:
                du1 du1Var = ((qr1) obj).f191699h;
                au1 au1Var = du1Var instanceof au1 ? (au1) du1Var : null;
                if (au1Var != null) {
                    return au1Var.f19790a;
                }
                return null;
            case 27:
                ViewStub viewStub2 = (ViewStub) ((w0n) ((z9p) obj).f280844c).f246765Y;
                viewStub2.setLayoutResource(R.layout.pretitle_slot);
                return viewStub2.inflate();
            case 28:
                return ((hlv) ((wg61) ((p36) obj).f173562c).getValue()).f92753c;
            default:
                qxo qxoVar = (qxo) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) ((twy) qxoVar.f193719e).f224510b;
                boolean z = ((yn81) qxoVar.f193718d) instanceof xn81;
                if (z) {
                    constraintLayout.setBackgroundColor(iqg1.m51374p((Context) qxoVar.f193717c, R.attr.baseBackgroundElevatedBase));
                }
                if (!z) {
                    return constraintLayout;
                }
                RoundedConstraintLayout roundedConstraintLayout = new RoundedConstraintLayout(constraintLayout.getContext(), null, 0, 6, null);
                roundedConstraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                constraintLayout.setMinHeight(qxoVar.f193716b);
                roundedConstraintLayout.addView(constraintLayout);
                roundedConstraintLayout.setCornerRadius(constraintLayout.getContext().getResources().getDimension(R.dimen.rounded_row_corner_radius));
                return roundedConstraintLayout;
        }
    }
}
