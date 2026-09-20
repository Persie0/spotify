package p204p;

import android.animation.ArgbEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.transition.AutoTransition;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.loading.LoadingProgressBarView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class zyp implements ovf {

    /* JADX INFO: renamed from: a */
    public final Context f287646a;

    /* JADX INFO: renamed from: b */
    public final e940 f287647b;

    /* JADX INFO: renamed from: c */
    public final hun0 f287648c;

    /* JADX INFO: renamed from: d */
    public final tw80 f287649d;

    /* JADX INFO: renamed from: e */
    public final i5z f287650e;

    /* JADX INFO: renamed from: f */
    public final o7i f287651f;

    /* JADX INFO: renamed from: g */
    public final k7q0 f287652g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f287653h;

    /* JADX INFO: renamed from: i */
    public gh00 f287654i;

    /* JADX INFO: renamed from: t */
    public final long f287655t;

    public zyp(Context context, e940 e940Var) {
        this.f287646a = context;
        this.f287647b = e940Var;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.poll_card_layout, (ViewGroup) null, false);
        int i = R.id.card_header;
        View viewM85629k = vie1.m85629k(viewInflate, R.id.card_header);
        if (viewM85629k != null) {
            q6u q6uVarM72249d = q6u.m72249d(viewM85629k);
            i = R.id.content;
            LinearLayout linearLayout = (LinearLayout) vie1.m85629k(viewInflate, R.id.content);
            if (linearLayout != null) {
                i = R.id.error;
                View viewM85629k2 = vie1.m85629k(viewInflate, R.id.error);
                if (viewM85629k2 != null) {
                    int i2 = R.id.error_subtitle;
                    if (((TextView) vie1.m85629k(viewM85629k2, R.id.error_subtitle)) != null) {
                        i2 = R.id.error_title;
                        if (((TextView) vie1.m85629k(viewM85629k2, R.id.error_title)) != null) {
                            i2 = R.id.try_again;
                            PrimaryButtonView primaryButtonView = (PrimaryButtonView) vie1.m85629k(viewM85629k2, R.id.try_again);
                            if (primaryButtonView != null) {
                                i5z i5zVar = new i5z(6, (ConstraintLayout) viewM85629k2, primaryButtonView);
                                i = R.id.loaded;
                                View viewM85629k3 = vie1.m85629k(viewInflate, R.id.loaded);
                                if (viewM85629k3 != null) {
                                    int i3 = R.id.button_barrier;
                                    if (((Barrier) vie1.m85629k(viewM85629k3, R.id.button_barrier)) != null) {
                                        i3 = R.id.content_type;
                                        TextView textView = (TextView) vie1.m85629k(viewM85629k3, R.id.content_type);
                                        if (textView != null) {
                                            i3 = R.id.options_container;
                                            LinearLayout linearLayout2 = (LinearLayout) vie1.m85629k(viewM85629k3, R.id.options_container);
                                            if (linearLayout2 != null) {
                                                i3 = R.id.poll_data_barrier;
                                                if (((Barrier) vie1.m85629k(viewM85629k3, R.id.poll_data_barrier)) != null) {
                                                    i3 = R.id.question;
                                                    TextView textView2 = (TextView) vie1.m85629k(viewM85629k3, R.id.question);
                                                    if (textView2 != null) {
                                                        i3 = R.id.subtitle;
                                                        TextView textView3 = (TextView) vie1.m85629k(viewM85629k3, R.id.subtitle);
                                                        if (textView3 != null) {
                                                            i3 = R.id.text_group;
                                                            if (((LinearLayout) vie1.m85629k(viewM85629k3, R.id.text_group)) != null) {
                                                                i3 = R.id.thumbnail;
                                                                ArtworkView artworkView = (ArtworkView) vie1.m85629k(viewM85629k3, R.id.thumbnail);
                                                                if (artworkView != null) {
                                                                    i3 = R.id.thumbnail_row;
                                                                    LinearLayout linearLayout3 = (LinearLayout) vie1.m85629k(viewM85629k3, R.id.thumbnail_row);
                                                                    if (linearLayout3 != null) {
                                                                        i3 = R.id.title;
                                                                        TextView textView4 = (TextView) vie1.m85629k(viewM85629k3, R.id.title);
                                                                        if (textView4 != null) {
                                                                            i3 = R.id.vote_button;
                                                                            EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewM85629k3, R.id.vote_button);
                                                                            if (encoreButton != null) {
                                                                                i3 = R.id.voting_loading_spinner;
                                                                                LoadingProgressBarView loadingProgressBarView = (LoadingProgressBarView) vie1.m85629k(viewM85629k3, R.id.voting_loading_spinner);
                                                                                if (loadingProgressBarView != null) {
                                                                                    tw80 tw80Var = new tw80((ConstraintLayout) viewM85629k3, textView, linearLayout2, textView2, textView3, artworkView, linearLayout3, textView4, encoreButton, loadingProgressBarView);
                                                                                    int i4 = R.id.offline;
                                                                                    View viewM85629k4 = vie1.m85629k(viewInflate, R.id.offline);
                                                                                    if (viewM85629k4 != null) {
                                                                                        int i5 = R.id.offline_subtitle;
                                                                                        if (((TextView) vie1.m85629k(viewM85629k4, R.id.offline_subtitle)) != null) {
                                                                                            i5 = R.id.offline_title;
                                                                                            if (((TextView) vie1.m85629k(viewM85629k4, R.id.offline_title)) != null) {
                                                                                                o7i o7iVar = new o7i((ConstraintLayout) viewM85629k4);
                                                                                                i4 = R.id.section_header;
                                                                                                View viewM85629k5 = vie1.m85629k(viewInflate, R.id.section_header);
                                                                                                if (viewM85629k5 != null) {
                                                                                                    q6u q6uVarM72249d2 = q6u.m72249d(viewM85629k5);
                                                                                                    i4 = R.id.voting_error;
                                                                                                    View viewM85629k6 = vie1.m85629k(viewInflate, R.id.voting_error);
                                                                                                    if (viewM85629k6 != null) {
                                                                                                        int i6 = R.id.try_voting_again;
                                                                                                        PrimaryButtonView primaryButtonView2 = (PrimaryButtonView) vie1.m85629k(viewM85629k6, R.id.try_voting_again);
                                                                                                        if (primaryButtonView2 != null) {
                                                                                                            i6 = R.id.voting_error_subtitle;
                                                                                                            if (((TextView) vie1.m85629k(viewM85629k6, R.id.voting_error_subtitle)) != null) {
                                                                                                                i6 = R.id.voting_error_title;
                                                                                                                if (((TextView) vie1.m85629k(viewM85629k6, R.id.voting_error_title)) != null) {
                                                                                                                    k7q0 k7q0Var = new k7q0(0, (ConstraintLayout) viewM85629k6, primaryButtonView2);
                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) viewInflate;
                                                                                                                    this.f287648c = new hun0(linearLayout4, q6uVarM72249d, linearLayout, i5zVar, tw80Var, o7iVar, q6uVarM72249d2, k7q0Var);
                                                                                                                    this.f287649d = tw80Var;
                                                                                                                    this.f287650e = i5zVar;
                                                                                                                    this.f287651f = o7iVar;
                                                                                                                    this.f287652g = k7q0Var;
                                                                                                                    this.f287653h = new ArrayList();
                                                                                                                    this.f287655t = 600L;
                                                                                                                    linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                                                                                                    artworkView.setViewContext(new r96(e940Var));
                                                                                                                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.widgets_spacer_base);
                                                                                                                    linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                                                                                                                    return;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k6.getResources().getResourceName(i6)));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k4.getResources().getResourceName(i5)));
                                                                                    }
                                                                                    i = i4;
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
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k3.getResources().getResourceName(i3)));
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k2.getResources().getResourceName(i2)));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: a */
    public static final void m97238a(zyp zypVar, ConstraintLayout constraintLayout, boolean z, Integer num) {
        int color = zypVar.f287646a.getColor(R.color.gray_30);
        int iM61221i = m9f.m61221i(Color.argb(76, 0, 0, 0), num != null ? num.intValue() : color);
        if (!z) {
            constraintLayout.findViewById(R.id.percentage_view).getBackground().setColorFilter(new PorterDuffColorFilter(iM61221i, PorterDuff.Mode.SRC));
            return;
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(iM61221i));
        valueAnimatorOfObject.setDuration(zypVar.f287655t);
        valueAnimatorOfObject.addUpdateListener(new rx4(zypVar, constraintLayout));
        valueAnimatorOfObject.start();
    }

    /* JADX INFO: renamed from: b */
    public static void m97239b(ConstraintLayout constraintLayout, j7q0 j7q0Var, int i) {
        float f = i;
        float f2 = f > 0.0f ? j7q0Var.f109652c / f : 0.0f;
        c7j c7jVar = new c7j();
        c7jVar.m31736f(constraintLayout);
        c7jVar.m31740l(R.id.percentage_view).f258686e.f269830e0 = f2;
        c7jVar.m31733b(constraintLayout);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        this.f287654i = gh00Var;
        ((EncoreButton) this.f287649d.f224372h).setOnClickListener(new ndp(9, gh00Var, this));
        ((PrimaryButtonView) this.f287650e.f99060c).setOnClickListener(new bwp(18, gh00Var));
        ((PrimaryButtonView) this.f287652g.f120179c).setOnClickListener(new bwp(19, gh00Var));
        hun0 hun0Var = this.f287648c;
        ((ContextMenuButton) ((q6u) hun0Var.f95432c).f185926c).setOnClickListener(new bwp(20, gh00Var));
        ((ContextMenuButton) ((q6u) hun0Var.f95433d).f185926c).setOnClickListener(new bwp(21, gh00Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v20, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.LayoutInflater] */
    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        ?? r10;
        int i;
        int i2;
        h7q0 h7q0Var = (h7q0) obj;
        int iMo24994b = h7q0Var.mo24994b();
        boolean zMo24993a = h7q0Var.mo24993a();
        int i3 = iMo24994b == 0 ? -1 : wyp.f256331a[edb.m38547C(iMo24994b)];
        int i4 = 2;
        Context context = this.f287646a;
        boolean z = false;
        hun0 hun0Var = this.f287648c;
        if (i3 == 1) {
            q6u q6uVar = (q6u) hun0Var.f95433d;
            q6u q6uVar2 = (q6u) hun0Var.f95432c;
            ((ConstraintLayout) q6uVar.f185925b).setVisibility(8);
            ConstraintLayout constraintLayout = (ConstraintLayout) q6uVar2.f185925b;
            TextView textView = (TextView) q6uVar2.f185927d;
            constraintLayout.setVisibility(0);
            textView.setText(context.getString(R.string.podcast_poll_header_title));
            textView.setTextAppearance(R.style.TextAppearance_Encore_BodyMediumBold);
            ((ContextMenuButton) q6uVar2.f185926c).setVisibility(zMo24993a ? 0 : 8);
        } else if (i3 != 2) {
            ((ConstraintLayout) ((q6u) hun0Var.f95432c).f185925b).setVisibility(8);
            ((ConstraintLayout) ((q6u) hun0Var.f95433d).f185925b).setVisibility(8);
        } else {
            q6u q6uVar3 = (q6u) hun0Var.f95432c;
            q6u q6uVar4 = (q6u) hun0Var.f95433d;
            ((ConstraintLayout) q6uVar3.f185925b).setVisibility(8);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) q6uVar4.f185925b;
            TextView textView2 = (TextView) q6uVar4.f185927d;
            constraintLayout2.setVisibility(0);
            textView2.setText(context.getString(R.string.podcast_poll_header_title));
            textView2.setTextAppearance(R.style.TextAppearance_Encore_TitleSmall);
            ((ContextMenuButton) q6uVar4.f185926c).setVisibility(zMo24993a ? 0 : 8);
        }
        boolean z2 = h7q0Var instanceof g7q0;
        o7i o7iVar = this.f287651f;
        tw80 tw80Var = this.f287649d;
        k7q0 k7q0Var = this.f287652g;
        i5z i5zVar = this.f287650e;
        if (!z2) {
            if (h7q0Var instanceof a7q0) {
                ((LinearLayout) hun0Var.f95431b).setVisibility(8);
                return;
            }
            if (h7q0Var instanceof b7q0) {
                ((LinearLayout) hun0Var.f95431b).setVisibility(0);
                ((ConstraintLayout) i5zVar.f99059b).setVisibility(0);
                ((ConstraintLayout) k7q0Var.f120178b).setVisibility(8);
                ((ConstraintLayout) tw80Var.f224366b).setVisibility(8);
                o7iVar.f162573b.setVisibility(8);
                return;
            }
            if (!(h7q0Var instanceof i7q0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((i7q0) h7q0Var).f99609c) {
                ((LinearLayout) hun0Var.f95431b).setVisibility(8);
                return;
            }
            ((LinearLayout) hun0Var.f95431b).setVisibility(0);
            ((ConstraintLayout) i5zVar.f99059b).setVisibility(8);
            ((ConstraintLayout) k7q0Var.f120178b).setVisibility(8);
            ((ConstraintLayout) tw80Var.f224366b).setVisibility(8);
            o7iVar.f162573b.setVisibility(0);
            return;
        }
        g7q0 g7q0Var = (g7q0) h7q0Var;
        if (g7q0Var.f77326j) {
            ((LinearLayout) hun0Var.f95431b).setVisibility(0);
            ((ConstraintLayout) i5zVar.f99059b).setVisibility(8);
            ((ConstraintLayout) k7q0Var.f120178b).setVisibility(0);
            ((ConstraintLayout) tw80Var.f224366b).setVisibility(8);
            o7iVar.f162573b.setVisibility(8);
            return;
        }
        ((LinearLayout) hun0Var.f95431b).setVisibility(0);
        ((ConstraintLayout) i5zVar.f99059b).setVisibility(8);
        ((ConstraintLayout) k7q0Var.f120178b).setVisibility(8);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) tw80Var.f224366b;
        LoadingProgressBarView loadingProgressBarView = (LoadingProgressBarView) tw80Var.f224373i;
        EncoreButton encoreButton = (EncoreButton) tw80Var.f224372h;
        ?? r11 = (LinearLayout) tw80Var.f224367c;
        constraintLayout3.setVisibility(0);
        o7iVar.f162573b.setVisibility(8);
        TextView textView3 = (TextView) tw80Var.f224368d;
        String str = g7q0Var.f77317a;
        ArrayList<j7q0> arrayList = g7q0Var.f77321e;
        List list = g7q0Var.f77322f;
        textView3.setText(str);
        ((TextView) tw80Var.f224369e).setText(g7q0Var.f77318b);
        boolean z3 = (g7q0Var.f77323g && list.isEmpty()) ? false : true;
        ((ArtworkView) tw80Var.f224370f).setVisibility(8);
        ((LinearLayout) tw80Var.f224371g).setVisibility(8);
        TransitionSet transitionSet = null;
        if (z3) {
            int i5 = g7q0Var.f77324h;
            boolean z4 = g7q0Var.f77328l;
            String str2 = g7q0Var.f77325i;
            r11.removeAllViews();
            encoreButton.setVisibility(8);
            rlv0 rlv0Var = new rlv0();
            if (z4) {
                transitionSet = new TransitionSet();
                transitionSet.setDuration(this.f287655t);
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.setInterpolator((TimeInterpolator) dqs.f52076b);
                transitionSet.addTransition(autoTransition);
                rlv0Var.f200373a = ValueAnimator.ofFloat(0.0f, 1.0f);
                r11.getViewTreeObserver().addOnGlobalLayoutListener(new dnd(i4, this, rlv0Var));
            }
            for (j7q0 j7q0Var : arrayList) {
                float f = i5;
                float f2 = f > 0.0f ? j7q0Var.f109652c / f : 0.0f;
                ConstraintLayout constraintLayout4 = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.poll_result_bar, r11, z);
                ((TextView) constraintLayout4.findViewById(R.id.option_text)).setText(j7q0Var.f109650a);
                ((TextView) constraintLayout4.findViewById(R.id.option_score)).setText(context.getString(R.string.podcast_poll_percentage, Integer.valueOf(q3d0.m72083N(f2 * 100))));
                if (list.contains(Integer.valueOf(j7q0Var.f109651b))) {
                    View viewFindViewById = constraintLayout4.findViewById(R.id.checkmark);
                    tc41 tc41Var = new tc41(viewFindViewById.getContext(), vc41.CHECK_ALT, viewFindViewById.getContext().getResources().getDimensionPixelSize(R.dimen.check_mark_icon_size));
                    tc41Var.m80417b(viewFindViewById.getContext().getColor(R.color.gray_70));
                    viewFindViewById.setBackground(tc41Var);
                    i = 0;
                    viewFindViewById.setVisibility(0);
                } else {
                    i = 0;
                }
                r11.addView(constraintLayout4);
                this.f287647b.mo24613j(str2).m60181g(new xyp(this, constraintLayout4, z4, i), new xyp(this, constraintLayout4, z4, 1));
                ValueAnimator valueAnimator = (ValueAnimator) rlv0Var.f200373a;
                if (transitionSet == 0 || valueAnimator == null) {
                    i2 = i5;
                    m97239b(constraintLayout4, j7q0Var, i2);
                } else {
                    i2 = i5;
                    valueAnimator.addUpdateListener(new yyp(this, constraintLayout4, j7q0Var, i2, transitionSet));
                }
                i5 = i2;
                str2 = str2;
                rlv0Var = rlv0Var;
                transitionSet = transitionSet;
                z = false;
            }
            r10 = z;
        } else {
            loadingProgressBarView = loadingProgressBarView;
            int i6 = g7q0Var.f77320d;
            r11.removeAllViews();
            for (j7q0 j7q0Var2 : arrayList) {
                if (i6 == 1) {
                    Button button = (Button) LayoutInflater.from(context).inflate(R.layout.poll_single_option_button, r11, false);
                    button.setText(j7q0Var2.f109650a);
                    button.setOnClickListener(new ndp(8, this, j7q0Var2));
                    r11.addView(button);
                } else if (i6 == 2) {
                    CheckBox checkBox = (CheckBox) LayoutInflater.from(context).inflate(R.layout.poll_multi_option_button, r11, false);
                    checkBox.setText(j7q0Var2.f109650a);
                    tc41 tc41Var2 = new tc41(checkBox.getContext(), vc41.CHECK_ALT_FILL, checkBox.getContext().getResources().getDimensionPixelSize(R.dimen.checkbox_icon_size));
                    tc41Var2.m80417b(checkBox.getContext().getColor(R.color.black));
                    Drawable drawable = checkBox.getContext().getDrawable(R.drawable.unchecked_circle);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(new int[]{android.R.attr.state_checked}, tc41Var2);
                    stateListDrawable.addState(new int[]{-16842912}, drawable);
                    checkBox.setCompoundDrawablesWithIntrinsicBounds(stateListDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    checkBox.setChecked(this.f287653h.contains(Integer.valueOf(j7q0Var2.f109651b)));
                    checkBox.setOnCheckedChangeListener(new puo(1, this, j7q0Var2));
                    r11.addView(checkBox);
                }
            }
            if (i6 == 2) {
                r10 = 0;
                encoreButton.setVisibility(0);
            } else {
                r10 = 0;
            }
        }
        if (g7q0Var.f77327k) {
            r11.setVisibility(4);
            loadingProgressBarView.setVisibility(r10);
        } else {
            r11.setVisibility(r10);
            loadingProgressBarView.setVisibility(8);
        }
    }

    @Override // p204p.clc1
    public final View getView() {
        return (LinearLayout) this.f287648c.f95431b;
    }
}
