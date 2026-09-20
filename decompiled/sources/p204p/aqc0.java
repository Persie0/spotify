package p204p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.addtobutton.EncoreAddToButtonView;
import com.spotify.marquee.marquee.p107ui.OverlayBackgroundView;
import com.spotify.music.R;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m24212d2 = {"Lp/aqc0;", "Lp/i500;", "Lp/e600;", "Lp/bbm0;", "", "<init>", "()V", "p/m680", "p/kk6", "src_main_java_com_spotify_marquee_marquee-marquee"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class aqc0 extends i500 implements e600, bbm0 {

    /* JADX INFO: renamed from: A1 */
    public View f18192A1;

    /* JADX INFO: renamed from: B1 */
    public OverlayBackgroundView f18193B1;

    /* JADX INFO: renamed from: C1 */
    public TextView f18194C1;

    /* JADX INFO: renamed from: D1 */
    public ImageView f18195D1;

    /* JADX INFO: renamed from: E1 */
    public TextView f18196E1;

    /* JADX INFO: renamed from: F1 */
    public TextView f18197F1;

    /* JADX INFO: renamed from: G1 */
    public Button f18198G1;

    /* JADX INFO: renamed from: H1 */
    public TextView f18199H1;

    /* JADX INFO: renamed from: I1 */
    public View f18200I1;

    /* JADX INFO: renamed from: J1 */
    public View f18201J1;

    /* JADX INFO: renamed from: K1 */
    public TextView f18202K1;

    /* JADX INFO: renamed from: L1 */
    public u12 f18203L1;

    /* JADX INFO: renamed from: M1 */
    public EncoreAddToButtonView f18204M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f18205N1;

    /* JADX INFO: renamed from: O1 */
    public e940 f18206O1;

    /* JADX INFO: renamed from: P1 */
    public uoc0 f18207P1;

    /* JADX INFO: renamed from: Q1 */
    public final m680 f18208Q1 = new m680(this, 14);

    /* JADX INFO: renamed from: R1 */
    public final kk6 f18209R1 = new kk6(this, 17);

    /* JADX INFO: renamed from: S1 */
    public final agy f18210S1 = k0e1.f118003J;

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        jkc0.m53609u(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.f18205N1 = bundle.getBoolean("animation_completed", false);
        }
        View viewInflate = layoutInflater.inflate(R.layout.marquee, viewGroup, false);
        this.f18192A1 = mec1.m61562n(viewInflate, R.id.marquee_overlay_view);
        View viewM61562n = mec1.m61562n(viewInflate, R.id.marquee_overlay_background);
        ConstraintLayout constraintLayout = (ConstraintLayout) mec1.m61562n(viewInflate, R.id.marquee_overlay_content);
        float fM26770h1 = m26770h1(8.0f);
        this.f18200I1 = mec1.m61562n(viewInflate, R.id.marquee_overlay_header);
        OverlayBackgroundView overlayBackgroundView = (OverlayBackgroundView) mec1.m61562n(viewInflate, R.id.marquee_modal_background_view);
        this.f18193B1 = overlayBackgroundView;
        overlayBackgroundView.setRadius(fM26770h1);
        overlayBackgroundView.m13425a(m49702X0().getColor(R.color.marquee_background_default_color), true);
        View view = this.f18192A1;
        if (view == null) {
            wj50.m88260d0("overlayView");
            throw null;
        }
        overlayBackgroundView.setOnTouchListener(new q0m0(view, this.f18208Q1));
        this.f18194C1 = (TextView) mec1.m61562n(viewInflate, R.id.marquee_new_release_description);
        this.f18195D1 = (ImageView) mec1.m61562n(viewInflate, R.id.marquee_new_release_cover_art);
        this.f18204M1 = (EncoreAddToButtonView) mec1.m61562n(viewInflate, R.id.marquee_save_button);
        this.f18196E1 = (TextView) mec1.m61562n(viewInflate, R.id.marquee_new_release_title);
        this.f18197F1 = (TextView) mec1.m61562n(viewInflate, R.id.marquee_artist_name);
        this.f18202K1 = (TextView) mec1.m61562n(viewInflate, R.id.marquee_subheader);
        Button button = (Button) mec1.m61562n(viewInflate, R.id.marquee_cta);
        this.f18198G1 = button;
        button.setOnClickListener(new ypc0(this, 0));
        EncoreAddToButtonView encoreAddToButtonView = this.f18204M1;
        if (encoreAddToButtonView == null) {
            wj50.m88260d0("saveButton");
            throw null;
        }
        encoreAddToButtonView.mo2821c(new b6b0(this, 22));
        this.f18199H1 = (TextView) mec1.m61562n(viewInflate, R.id.marquee_overlay_legal_text);
        View viewM61562n2 = mec1.m61562n(viewInflate, R.id.marquee_overlay_footer_text);
        this.f18201J1 = viewM61562n2;
        viewM61562n2.setOnClickListener(new ypc0(this, 1));
        View view2 = this.f18200I1;
        if (view2 == null) {
            wj50.m88260d0("header");
            throw null;
        }
        View view3 = this.f18201J1;
        if (view3 == null) {
            wj50.m88260d0("footer");
            throw null;
        }
        this.f18203L1 = new u12(view2, view3, viewM61562n, constraintLayout);
        View view4 = this.f18192A1;
        if (view4 == null) {
            wj50.m88260d0("overlayView");
            throw null;
        }
        view4.addOnLayoutChangeListener(this.f18209R1);
        m49699V0().mo31751N().m28385a(m49724w0(), new lx9(this, 15));
        wj50.m88279p(viewInflate);
        return viewInflate;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        u12 u12Var = this.f18203L1;
        if (u12Var != null) {
            u12Var.m82174h();
        } else {
            wj50.m88260d0("animationHelper");
            throw null;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        if (this.f18205N1) {
            return;
        }
        u12 u12Var = this.f18203L1;
        if (u12Var == null) {
            wj50.m88260d0("animationHelper");
            throw null;
        }
        z10 z10Var = new z10(this, 9);
        List listM46715L = h6f.m46715L((ObjectAnimator) u12Var.f225650d, (ObjectAnimator) u12Var.f225648b, (ObjectAnimator) u12Var.f225654h, (ObjectAnimator) u12Var.f225649c, (ObjectAnimator) u12Var.f225656t);
        PathInterpolator pathInterpolator = dqs.f52076b;
        u12Var.m82174h();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listM46715L);
        animatorSet.setDuration(350L);
        animatorSet.setInterpolator(pathInterpolator);
        animatorSet.addListener(z10Var);
        animatorSet.start();
        u12Var.f225646Y = animatorSet;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        bundle.putBoolean("animation_completed", this.f18205N1);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0242  */
    /* JADX WARN: Code duplicated, block: B:144:0x0246 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0248  */
    /* JADX WARN: Code duplicated, block: B:148:0x024d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0255  */
    /* JADX WARN: Code duplicated, block: B:152:0x025e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0266  */
    /* JADX WARN: Code duplicated, block: B:156:0x0271  */
    /* JADX WARN: Code duplicated, block: B:158:0x0281  */
    /* JADX WARN: Code duplicated, block: B:160:0x0285  */
    /* JADX WARN: Code duplicated, block: B:161:0x0292  */
    /* JADX WARN: Code duplicated, block: B:163:0x0298  */
    /* JADX WARN: Code duplicated, block: B:165:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.graphics.drawable.Drawable] */
    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public final void mo3104P0() throws Throwable {
        int color;
        aqc0 aqc0Var;
        TextView textView;
        TextView textView2;
        Context contextM49702X0;
        int color2;
        TextView textView3;
        TextView textView4;
        ?? r7;
        this.f98702f1 = true;
        uoc0 uoc0VarM26771i1 = m26771i1();
        lwr lwrVar = uoc0VarM26771i1.f232395q;
        uoc0VarM26771i1.f232392n = this;
        vnc0 vnc0Var = uoc0VarM26771i1.f232379a;
        String str = vnc0Var.f243040M0;
        String str2 = vnc0Var.f243051c;
        gqc0 gqc0Var = vnc0Var.f243041N0;
        if (str != null) {
            try {
                color = Color.parseColor(str);
            } catch (IllegalArgumentException e) {
                Logger.m3967c(e, "Color is not parcelable", new Object[0]);
                color = -7829368;
            }
            OverlayBackgroundView overlayBackgroundView = this.f18193B1;
            if (overlayBackgroundView == null) {
                wj50.m88260d0("modalBackgroundView");
                throw null;
            }
            overlayBackgroundView.m13425a(color, false);
        } else {
            zk1 zk1Var = uoc0VarM26771i1.f232391m;
            OverlayBackgroundView overlayBackgroundView2 = this.f18193B1;
            if (overlayBackgroundView2 == null) {
                wj50.m88260d0("modalBackgroundView");
                throw null;
            }
            ((e940) zk1Var.f283581d).mo24613j((String) zk1Var.f283579b).m60181g(new lc1(overlayBackgroundView2, 24), new n62(3, overlayBackgroundView2, zk1Var));
        }
        gqc0 gqc0Var2 = gqc0.DARK;
        Throwable th = null;
        if (gqc0Var != null) {
            aqc0 aqc0Var2 = uoc0VarM26771i1.f232392n;
            if (aqc0Var2 == null) {
                wj50.m88260d0("viewBinder");
                throw null;
            }
            int i = gqc0Var == gqc0Var2 ? -16777216 : -1;
            Context contextM49702X1 = aqc0Var2.m49702X0();
            int color3 = gqc0Var == gqc0Var2 ? contextM49702X1.getColor(R.color.opacity_black_70) : contextM49702X1.getColor(R.color.opacity_white_70);
            TextView textView5 = aqc0Var2.f18194C1;
            if (textView5 == null) {
                wj50.m88260d0("newReleaseDescriptionView");
                throw null;
            }
            textView5.setTextColor(i);
            TextView textView6 = aqc0Var2.f18196E1;
            if (textView6 == null) {
                wj50.m88260d0("titleView");
                throw null;
            }
            textView6.setTextColor(i);
            TextView textView7 = aqc0Var2.f18197F1;
            if (textView7 == null) {
                wj50.m88260d0("artistNameView");
                throw null;
            }
            textView7.setTextColor(color3);
            TextView textView8 = aqc0Var2.f18199H1;
            if (textView8 == null) {
                wj50.m88260d0("legalTextView");
                throw null;
            }
            textView8.setTextColor(color3);
            if (gqc0Var == gqc0Var2) {
                Button button = aqc0Var2.f18198G1;
                if (button == null) {
                    wj50.m88260d0("callToActionButton");
                    throw null;
                }
                button.setTextColor(-1);
                ColorStateList colorStateListM60387w = lzj.m60387w(aqc0Var2.m49702X0(), R.color.black_color_state);
                Button button2 = aqc0Var2.f18198G1;
                if (button2 == null) {
                    wj50.m88260d0("callToActionButton");
                    throw null;
                }
                button2.setBackgroundTintList(colorStateListM60387w);
            }
        }
        aqc0 aqc0Var3 = uoc0VarM26771i1.f232392n;
        if (aqc0Var3 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        String str3 = vnc0Var.f243052d;
        e940 e940Var = aqc0Var3.f18206O1;
        if (e940Var == null) {
            wj50.m88260d0("imageLoader");
            throw null;
        }
        lxe lxeVarMo24613j = e940Var.mo24613j(str3);
        ImageView imageView = aqc0Var3.f18195D1;
        if (imageView == null) {
            wj50.m88260d0("coverImageView");
            throw null;
        }
        lxeVarMo24613j.m60185k(imageView, new t180(aqc0Var3, 16));
        aqc0 aqc0Var4 = uoc0VarM26771i1.f232392n;
        if (aqc0Var4 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        String str4 = vnc0Var.f243050b;
        TextView textView9 = aqc0Var4.f18194C1;
        if (textView9 == null) {
            wj50.m88260d0("newReleaseDescriptionView");
            throw null;
        }
        textView9.setText(str4);
        aqc0 aqc0Var5 = uoc0VarM26771i1.f232392n;
        if (aqc0Var5 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        String str5 = vnc0Var.f243056h;
        Button button3 = aqc0Var5.f18198G1;
        if (button3 == null) {
            wj50.m88260d0("callToActionButton");
            throw null;
        }
        button3.setText(str5);
        aqc0 aqc0Var6 = uoc0VarM26771i1.f232392n;
        if (aqc0Var6 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        String str6 = vnc0Var.f243053e;
        TextView textView10 = aqc0Var6.f18196E1;
        if (textView10 == null) {
            wj50.m88260d0("titleView");
            throw null;
        }
        textView10.setText(str6);
        aqc0 aqc0Var7 = uoc0VarM26771i1.f232392n;
        if (aqc0Var7 == null) {
            wj50.m88260d0("viewBinder");
            throw null;
        }
        String str7 = vnc0Var.f243054f;
        TextView textView11 = aqc0Var7.f18197F1;
        if (textView11 == null) {
            wj50.m88260d0("artistNameView");
            throw null;
        }
        textView11.setText(str7);
        Observable observableMo26573a = uoc0VarM26771i1.f232384f.mo26573a(vnc0Var.f243047Y);
        Scheduler scheduler = AndroidSchedulers.f7175a;
        RxAndroidPlugins.m23280b(scheduler);
        lwrVar.m60127a(observableMo26573a.observeOn(scheduler).subscribe(new sgb0(uoc0VarM26771i1, 6), pw90.f181970i));
        if (str2 != null) {
            String str8 = str2.length() > 0 ? str2 : null;
            if (str8 != null) {
                String str9 = vnc0Var.f243042O0;
                gqc0 gqc0Var3 = gqc0.LIGHT;
                if (str9 == null) {
                    aqc0Var = uoc0VarM26771i1.f232392n;
                    if (aqc0Var != null) {
                        wj50.m88260d0("viewBinder");
                        throw null;
                    }
                    if (gqc0Var == null) {
                        gqc0Var = gqc0Var3;
                    }
                    textView = aqc0Var.f18202K1;
                    if (textView != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView.setVisibility(0);
                    textView2 = aqc0Var.f18202K1;
                    if (textView2 != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView2.setText(str8);
                    contextM49702X0 = aqc0Var.m49702X0();
                    if (gqc0Var == gqc0Var2) {
                        color2 = contextM49702X0.getColor(R.color.opacity_black_70);
                    } else {
                        color2 = contextM49702X0.getColor(R.color.opacity_white_70);
                    }
                    textView3 = aqc0Var.f18202K1;
                    if (textView3 != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView3.setTextColor(color2);
                    if (aqc0Var.m49721t0().getConfiguration().orientation == 1) {
                        textView4 = aqc0Var.f18194C1;
                        if (textView4 != null) {
                            wj50.m88260d0("newReleaseDescriptionView");
                            throw null;
                        }
                        ((ViewGroup.MarginLayoutParams) ((h6j) textView4.getLayoutParams())).topMargin = aqc0Var.m26770h1(24.0f);
                    }
                } else {
                    if (!wl51.m88496t0(str9, "icon", true)) {
                        str9 = null;
                    }
                    if (str9 != null) {
                        trc0[] trc0VarArrValues = trc0.values();
                        int length = trc0VarArrValues.length;
                        int i2 = 0;
                        while (i2 < length) {
                            trc0 trc0Var = trc0VarArrValues[i2];
                            if (!str9.equalsIgnoreCase(trc0Var.f223042a)) {
                                i2++;
                                th = null;
                            } else if (trc0.ICON_RELEASED == trc0Var) {
                                aqc0 aqc0Var8 = uoc0VarM26771i1.f232392n;
                                if (aqc0Var8 == null) {
                                    wj50.m88260d0("viewBinder");
                                    throw th;
                                }
                                if (gqc0Var == null) {
                                    gqc0Var = gqc0Var3;
                                }
                                TextView textView12 = aqc0Var8.f18202K1;
                                if (textView12 == null) {
                                    wj50.m88260d0("subheaderView");
                                    throw th;
                                }
                                textView12.setVisibility(0);
                                TextView textView13 = aqc0Var8.f18202K1;
                                if (textView13 == null) {
                                    wj50.m88260d0("subheaderView");
                                    throw th;
                                }
                                textView13.setText(str2);
                                int iM26770h1 = aqc0Var8.m26770h1(12.0f);
                                Context contextM49702X2 = aqc0Var8.m49702X0();
                                int color4 = gqc0Var == gqc0Var2 ? contextM49702X2.getColor(R.color.opacity_black_70) : contextM49702X2.getColor(R.color.opacity_white_70);
                                Drawable drawable = aqc0Var8.m49702X0().getDrawable(R.drawable.encore_icon_released);
                                if (drawable != null) {
                                    drawable.setTint(color4);
                                    drawable.setBounds(0, 0, iM26770h1, iM26770h1);
                                    r7 = drawable;
                                } else {
                                    r7 = th;
                                }
                                ?? r2 = aqc0Var8.f18202K1;
                                if (r2 == 0) {
                                    wj50.m88260d0("subheaderView");
                                    throw th;
                                }
                                ?? r9 = th;
                                r2.setCompoundDrawablesRelative(r7, r9, r9, r9);
                                TextView textView14 = aqc0Var8.f18202K1;
                                if (textView14 == null) {
                                    wj50.m88260d0("subheaderView");
                                    throw null;
                                }
                                textView14.setCompoundDrawablePadding(4);
                                TextView textView15 = aqc0Var8.f18202K1;
                                if (textView15 == null) {
                                    wj50.m88260d0("subheaderView");
                                    throw null;
                                }
                                textView15.setTextColor(color4);
                                if (aqc0Var8.m49721t0().getConfiguration().orientation == 1) {
                                    TextView textView16 = aqc0Var8.f18194C1;
                                    if (textView16 == null) {
                                        wj50.m88260d0("newReleaseDescriptionView");
                                        throw null;
                                    }
                                    ((ViewGroup.MarginLayoutParams) ((h6j) textView16.getLayoutParams())).topMargin = aqc0Var8.m26770h1(24.0f);
                                }
                            }
                        }
                        throw new IllegalArgumentException(s571.m77251j("MarqueeVisualsType ", str9, " not recognized"));
                    }
                    aqc0Var = uoc0VarM26771i1.f232392n;
                    if (aqc0Var != null) {
                        wj50.m88260d0("viewBinder");
                        throw null;
                    }
                    if (gqc0Var == null) {
                        gqc0Var = gqc0Var3;
                    }
                    textView = aqc0Var.f18202K1;
                    if (textView != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView.setVisibility(0);
                    textView2 = aqc0Var.f18202K1;
                    if (textView2 != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView2.setText(str8);
                    contextM49702X0 = aqc0Var.m49702X0();
                    if (gqc0Var == gqc0Var2) {
                        color2 = contextM49702X0.getColor(R.color.opacity_black_70);
                    } else {
                        color2 = contextM49702X0.getColor(R.color.opacity_white_70);
                    }
                    textView3 = aqc0Var.f18202K1;
                    if (textView3 != null) {
                        wj50.m88260d0("subheaderView");
                        throw null;
                    }
                    textView3.setTextColor(color2);
                    if (aqc0Var.m49721t0().getConfiguration().orientation == 1) {
                        textView4 = aqc0Var.f18194C1;
                        if (textView4 != null) {
                            wj50.m88260d0("newReleaseDescriptionView");
                            throw null;
                        }
                        ((ViewGroup.MarginLayoutParams) ((h6j) textView4.getLayoutParams())).topMargin = aqc0Var.m26770h1(24.0f);
                    }
                }
            }
        }
        lwrVar.m60127a(k0e1.m54988g(uoc0VarM26771i1.f232380b.m53488a(), dau.f47107a).take(1L).observeOn(uoc0VarM26771i1.f232381c).subscribe(new ao90(4, uoc0VarM26771i1, this)));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public final void mo3105Q0() {
        this.f98702f1 = true;
        m26771i1().f232395q.m60129c();
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return xgg1.m90719V2();
    }

    @Override // p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90719V2(), null, 4));
    }

    /* JADX INFO: renamed from: h1 */
    public final int m26770h1(float f) {
        return q3d0.m72083N(f * m49721t0().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: i1 */
    public final uoc0 m26771i1() {
        uoc0 uoc0Var = this.f18207P1;
        if (uoc0Var != null) {
            return uoc0Var;
        }
        wj50.m88260d0("presenter");
        throw null;
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: j */
    public final String mo24331j() {
        return xoc1.f264081f2.f243453a;
    }

    /* JADX INFO: renamed from: j1 */
    public final void m26772j1(eh00 eh00Var) {
        u12 u12Var = this.f18203L1;
        if (u12Var == null) {
            wj50.m88260d0("animationHelper");
            throw null;
        }
        zpc0 zpc0Var = new zpc0(eh00Var, this);
        List listM46715L = h6f.m46715L((ObjectAnimator) u12Var.f225651e, (ObjectAnimator) u12Var.f225652f, (ObjectAnimator) u12Var.f225655i, (ObjectAnimator) u12Var.f225653g, (ObjectAnimator) u12Var.f225645X);
        PathInterpolator pathInterpolator = dqs.f52075a;
        u12Var.m82174h();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listM46715L);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(pathInterpolator);
        animatorSet.addListener(zpc0Var);
        animatorSet.start();
        u12Var.f225646Y = animatorSet;
    }

    @Override // p204p.e600
    /* JADX INFO: renamed from: k */
    public final String mo24332k(Context context) {
        return "";
    }

    @Override // p204p.zfy
    /* JADX INFO: renamed from: l, reason: from getter */
    public final agy getF18210S1() {
        return this.f18210S1;
    }
}
