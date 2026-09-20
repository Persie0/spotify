package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.compose.p002ui.platform.ComposeView;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbarLayout;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.C1398e;

/* JADX INFO: loaded from: classes8.dex */
public final class b721 implements Connectable {

    /* JADX INFO: renamed from: L0 */
    public final InterfaceC2363s5 f24123L0;

    /* JADX INFO: renamed from: M0 */
    public final zz00 f24124M0;

    /* JADX INFO: renamed from: N0 */
    public final bvi0 f24125N0;

    /* JADX INFO: renamed from: O0 */
    public final cir f24126O0;

    /* JADX INFO: renamed from: P0 */
    public final StateListAnimatorImageButton f24127P0;

    /* JADX INFO: renamed from: Q0 */
    public final ViewAnimator f24128Q0;

    /* JADX INFO: renamed from: R0 */
    public final TextView f24129R0;

    /* JADX INFO: renamed from: S0 */
    public j621 f24130S0;

    /* JADX INFO: renamed from: T0 */
    public final PublishSubject f24131T0;

    /* JADX INFO: renamed from: U0 */
    public final ArrayList f24132U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f24133V0;

    /* JADX INFO: renamed from: X */
    public final View f24134X;

    /* JADX INFO: renamed from: Y */
    public final u2u f24135Y;

    /* JADX INFO: renamed from: Z */
    public final z9n0 f24136Z;

    /* JADX INFO: renamed from: a */
    public final ubq0 f24137a;

    /* JADX INFO: renamed from: b */
    public final o611 f24138b;

    /* JADX INFO: renamed from: c */
    public final C2251pc f24139c;

    /* JADX INFO: renamed from: d */
    public final C2098lp f24140d;

    /* JADX INFO: renamed from: e */
    public final f68 f24141e;

    /* JADX INFO: renamed from: f */
    public final boolean f24142f;

    /* JADX INFO: renamed from: g */
    public final int f24143g;

    /* JADX INFO: renamed from: h */
    public final vv91 f24144h;

    /* JADX INFO: renamed from: i */
    public final cy11 f24145i;

    /* JADX INFO: renamed from: t */
    public final b7a1 f24146t;

    /* JADX WARN: Multi-variable type inference failed */
    public b721(wz00 wz00Var, LayoutInflater layoutInflater, nz61 nz61Var, cir cirVar, ubq0 ubq0Var, j1u j1uVar, o611 o611Var, C2251pc c2251pc, C2098lp c2098lp, f68 f68Var, boolean z, boolean z2, int i, vv91 vv91Var, cy11 cy11Var, b7a1 b7a1Var) {
        this.f24137a = ubq0Var;
        this.f24138b = o611Var;
        this.f24139c = c2251pc;
        this.f24140d = c2098lp;
        this.f24141e = f68Var;
        this.f24142f = z2;
        this.f24143g = i;
        this.f24144h = vv91Var;
        this.f24145i = cy11Var;
        this.f24146t = b7a1Var;
        int i2 = 1;
        View viewInflate = layoutInflater.inflate(R.layout.sthlm_blk_signup, (ViewGroup) null, true);
        this.f24134X = viewInflate;
        this.f24128Q0 = (ViewAnimator) viewInflate.findViewById(R.id.view_animator);
        this.f24129R0 = (TextView) viewInflate.findViewById(R.id.title);
        this.f24131T0 = new PublishSubject();
        this.f24132U0 = new ArrayList();
        this.f24133V0 = true;
        Object[] objArr = 0;
        this.f24135Y = j1uVar.f107865a ? (u2u) m28346d(R.layout.sthlm_blk_email, new z621(this, 0)) : null;
        this.f24136Z = j1uVar.f107866b ? (z9n0) m28346d(R.layout.sthlm_blk_password, new z621(this, i2)) : null;
        this.f24123L0 = z ? (InterfaceC2363s5) m28346d(R.layout.sthlm_blk_age_assurance, new z621(this, 2)) : (InterfaceC2363s5) m28346d(R.layout.sthlm_blk_age, new z621(this, 3));
        this.f24124M0 = (zz00) m28346d(R.layout.sthlm_blk_gender, new C1398e(23, wz00Var, this));
        this.f24125N0 = (bvi0) m28346d(R.layout.sthlm_blk_name_acceptance_fields, new z621(this, 4));
        this.f24126O0 = cirVar;
        ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.dialog_compose_view);
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        composeView.setContent(new fyf(new g511(cirVar, 13), true, 1191219458));
        GlueToolbar glueToolbarCreateGlueToolbar = GlueToolbars.createGlueToolbar((GlueToolbarLayout) viewInflate.findViewById(R.id.toolbar));
        Context context = viewInflate.getContext();
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        this.f24127P0 = stateListAnimatorImageButton;
        WeakHashMap weakHashMap = mec1.f142677a;
        stateListAnimatorImageButton.setBackground(null);
        tc41 tc41Var = new tc41(context, vc41.ARROW_LEFT, viewInflate.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        tc41Var.m80417b(context.getColor(R.color.white));
        stateListAnimatorImageButton.setImageDrawable(tc41Var);
        stateListAnimatorImageButton.setContentDescription(viewInflate.getContext().getString(R.string.signup_generic_content_description_close));
        glueToolbarCreateGlueToolbar.addView(ToolbarSide.START, stateListAnimatorImageButton, R.id.toolbar_up_button);
        viewInflate.post(new RunnableC2650zh(this, context, objArr == true ? 1 : 0, i2));
        viewInflate.setVisibility(4);
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        u2u u2uVar = this.f24135Y;
        Connection connectionMo3269P = u2uVar != null ? u2uVar.mo3269P(new eo2(consumer, 21)) : null;
        z9n0 z9n0Var = this.f24136Z;
        Connection connectionMo3269P2 = z9n0Var != null ? z9n0Var.mo3269P(new eo2(consumer, 24)) : null;
        Connection connectionMo3269P3 = this.f24123L0.mo3269P(new eo2(consumer, 20));
        Connection connectionMo3269P4 = this.f24124M0.mo3269P(new eo2(consumer, 22));
        Connection connectionMo3269P5 = this.f24125N0.mo3269P(new eo2(consumer, 23));
        Disposable disposableSubscribe = this.f24126O0.f38425f.subscribe(new qw90(consumer, 18));
        Disposable disposableSubscribe2 = this.f24131T0.subscribe(new qw90(consumer, 17));
        this.f24127P0.setOnClickListener(new kl9(consumer, 14));
        return new a721((tg3) connectionMo3269P, (tg3) connectionMo3269P2, connectionMo3269P3, (C2185np) connectionMo3269P4, (avi0) connectionMo3269P5, this, disposableSubscribe2, disposableSubscribe);
    }

    /* JADX INFO: renamed from: c */
    public final View m28345c() {
        return this.f24134X;
    }

    /* JADX INFO: renamed from: d */
    public final ndc1 m28346d(int i, gh00 gh00Var) {
        ViewAnimator viewAnimator = this.f24128Q0;
        View viewInflate = LayoutInflater.from(viewAnimator.getContext()).inflate(i, (ViewGroup) viewAnimator, true);
        wj50.m88279p(viewInflate);
        ndc1 ndc1Var = (ndc1) gh00Var.invoke(viewInflate);
        this.f24132U0.add(ndc1Var);
        return ndc1Var;
    }
}
