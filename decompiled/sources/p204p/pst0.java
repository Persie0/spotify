package p204p;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import com.spotify.nowplayingqueue.bottomsheet.view.DropShadowContainer;
import com.spotify.nowplayingqueue.bottomsheet.view.EditModeBarContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueControlsLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.SessionModifierContainerView;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes9.dex */
public final class pst0 implements Connectable {

    /* JADX INFO: renamed from: L0 */
    public final hxt f180930L0;

    /* JADX INFO: renamed from: M0 */
    public final bhe f180931M0;

    /* JADX INFO: renamed from: N0 */
    public final ehe f180932N0;

    /* JADX INFO: renamed from: O0 */
    public final uss f180933O0;

    /* JADX INFO: renamed from: P0 */
    public final kse f180934P0;

    /* JADX INFO: renamed from: Q0 */
    public final phe f180935Q0;

    /* JADX INFO: renamed from: R0 */
    public final x3i0 f180936R0;

    /* JADX INFO: renamed from: S0 */
    public final tgw0 f180937S0;

    /* JADX INFO: renamed from: T0 */
    public final hxt f180938T0;

    /* JADX INFO: renamed from: U0 */
    public final rav0 f180939U0;

    /* JADX INFO: renamed from: V0 */
    public kzz0 f180940V0;

    /* JADX INFO: renamed from: W0 */
    public nak0 f180941W0;

    /* JADX INFO: renamed from: X */
    public final h8h0 f180942X;

    /* JADX INFO: renamed from: X0 */
    public final kk6 f180943X0;

    /* JADX INFO: renamed from: Y */
    public final etz f180944Y;

    /* JADX INFO: renamed from: Y0 */
    public rqt0 f180945Y0;

    /* JADX INFO: renamed from: Z */
    public final qbp f180946Z;

    /* JADX INFO: renamed from: Z0 */
    public ValueAnimator f180947Z0;

    /* JADX INFO: renamed from: a */
    public final rq70 f180948a;

    /* JADX INFO: renamed from: a1 */
    public ValueAnimator f180949a1;

    /* JADX INFO: renamed from: b */
    public final gst0 f180950b;

    /* JADX INFO: renamed from: b1 */
    public ValueAnimator f180951b1;

    /* JADX INFO: renamed from: c */
    public final eh00 f180952c;

    /* JADX INFO: renamed from: c1 */
    public int f180953c1;

    /* JADX INFO: renamed from: d */
    public final eh00 f180954d;

    /* JADX INFO: renamed from: e */
    public final zrt0 f180955e;

    /* JADX INFO: renamed from: f */
    public final qqt0 f180956f;

    /* JADX INFO: renamed from: g */
    public final g2q f180957g;

    /* JADX INFO: renamed from: h */
    public final w54 f180958h;

    /* JADX INFO: renamed from: i */
    public final o72 f180959i;

    /* JADX INFO: renamed from: t */
    public final nn40 f180960t;

    public pst0(rq70 rq70Var, CoordinatorLayout coordinatorLayout, gst0 gst0Var, eh00 eh00Var, eh00 eh00Var2, zrt0 zrt0Var, qqt0 qqt0Var, g2q g2qVar, w54 w54Var, a3k a3kVar, clq0 clq0Var, tfm0 tfm0Var, eju ejuVar, o72 o72Var, nn40 nn40Var, k231 k231Var, q1x0 q1x0Var, w9r0 w9r0Var, h8h0 h8h0Var) throws Exception {
        FrameLayout frameLayout;
        x3i0 x3i0Var;
        int i;
        ConstraintLayout constraintLayout = rq70Var.f201762b;
        QueueInteractionLayout queueInteractionLayout = rq70Var.f201761a;
        this.f180948a = rq70Var;
        this.f180950b = gst0Var;
        this.f180952c = eh00Var;
        this.f180954d = eh00Var2;
        this.f180955e = zrt0Var;
        this.f180956f = qqt0Var;
        this.f180957g = g2qVar;
        this.f180958h = w54Var;
        this.f180959i = o72Var;
        this.f180960t = nn40Var;
        this.f180942X = h8h0Var;
        LayoutInflater.from(coordinatorLayout.getContext()).inflate(R.layout.layout_queue_controls, coordinatorLayout);
        int i2 = R.id.drop_shadow_container;
        if (((DropShadowContainer) vie1.m85629k(coordinatorLayout, R.id.drop_shadow_container)) != null) {
            i2 = R.id.edit_mode_bar_container;
            EditModeBarContainerView editModeBarContainerView = (EditModeBarContainerView) vie1.m85629k(coordinatorLayout, R.id.edit_mode_bar_container);
            if (editModeBarContainerView != null) {
                i2 = R.id.queue_controls_content_area;
                View viewM85629k = vie1.m85629k(coordinatorLayout, R.id.queue_controls_content_area);
                if (viewM85629k != null) {
                    i2 = R.id.queue_controls_wrapper;
                    QueueControlsLayout queueControlsLayout = (QueueControlsLayout) vie1.m85629k(coordinatorLayout, R.id.queue_controls_wrapper);
                    if (queueControlsLayout != null) {
                        i2 = R.id.reshuffle_button_container;
                        FrameLayout frameLayout2 = (FrameLayout) vie1.m85629k(coordinatorLayout, R.id.reshuffle_button_container);
                        if (frameLayout2 != null) {
                            i2 = R.id.session_modifier_container;
                            SessionModifierContainerView sessionModifierContainerView = (SessionModifierContainerView) vie1.m85629k(coordinatorLayout, R.id.session_modifier_container);
                            if (sessionModifierContainerView != null) {
                                this.f180944Y = new etz(coordinatorLayout, editModeBarContainerView, viewM85629k, queueControlsLayout, frameLayout2, sessionModifierContainerView);
                                dju djuVar = ejuVar.f60295c;
                                qbp qbpVar = new qbp(djuVar.f49744b, djuVar.f49743a, nn40Var);
                                this.f180946Z = qbpVar;
                                up60 up60Var = hxt.f96286w;
                                hxt hxtVarM50020m = ia7.m50020m(constraintLayout.getContext(), constraintLayout, w9h1.m87517y(new lqt0((Flowable) clq0Var.f39340b, ((t1q) clq0Var.f39341c).m79882a(), (l2j0) clq0Var.f39342d, (tpn0) clq0Var.f39343e, (g6p) clq0Var.f39344f, (l6p) clq0Var.f39345g, (zxd1) clq0Var.f39346h, new nst0(this, 0)), null, null, 3), new hqt0(false, iqt0.f104846c, false), null, ContentType.LONG_FORM_ON_DEMAND);
                                this.f180930L0 = hxtVarM50020m;
                                bhe bheVar = new bhe(queueInteractionLayout.getContext());
                                this.f180931M0 = bheVar;
                                ehe eheVar = new ehe(queueInteractionLayout.getContext());
                                this.f180932N0 = eheVar;
                                uss ussVar = new uss(queueInteractionLayout.getContext());
                                this.f180933O0 = ussVar;
                                kse kseVar = new kse(queueInteractionLayout.getContext());
                                this.f180934P0 = kseVar;
                                phe pheVar = new phe(queueInteractionLayout.getContext());
                                this.f180935Q0 = pheVar;
                                x3i0 x3i0Var2 = new x3i0(queueInteractionLayout.getContext());
                                this.f180936R0 = x3i0Var2;
                                tgw0 tgw0Var = new tgw0(queueInteractionLayout.getContext());
                                this.f180937S0 = tgw0Var;
                                hxt hxtVarM50020m2 = ia7.m50020m(frameLayout2.getContext(), frameLayout2, w9h1.m87517y(new z080((hy21) w9r0Var.f249252b, (hrw) w9r0Var.f249253c, (Flowable) w9r0Var.f249254d), null, null, 3), Boolean.FALSE, null, ContentType.LONG_FORM_ON_DEMAND);
                                this.f180938T0 = hxtVarM50020m2;
                                rav0 rav0Var = new rav0(queueInteractionLayout.getContext());
                                rav0Var.setResources(q1x0Var);
                                this.f180939U0 = rav0Var;
                                this.f180943X0 = new kk6(this, 19);
                                nsg1.m65554s(sessionModifierContainerView, new nst0(this, 6));
                                nsg1.m65554s(frameLayout2, new nst0(this, 7));
                                nsg1.m65554s(constraintLayout, new nst0(this, 8));
                                RecyclerView recyclerView = rq70Var.f201763c;
                                recyclerView.setFocusable(false);
                                recyclerView.m1011i(new vgz(recyclerView.getContext()));
                                recyclerView.setAdapter(zrt0Var);
                                hjv0 adapter = recyclerView.getAdapter();
                                if (adapter != null) {
                                    recyclerView.getContext();
                                    frameLayout = frameLayout2;
                                    i = 3;
                                    x3i0Var = x3i0Var2;
                                    recyclerView.setLayoutManager(new StickyHeaderLinearLayoutManager(adapter, new hmm0(1, zrt0Var, yrt0.class, "isStickyHeaderAt", "isStickyHeaderAt(I)Z", 0, 0, 22)));
                                } else {
                                    frameLayout = frameLayout2;
                                    x3i0Var = x3i0Var2;
                                    i = 3;
                                }
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) qbpVar.f187133c.f205039f;
                                View view = d3h1.m34836B(new bjc0(a3kVar, gbt0.f78402b1), r3).f96307t;
                                View view2 = hxtVarM50020m.f96307t;
                                View view3 = ia7.m50020m(r3.getContext(), r3, w9h1.m87517y((kk20) tfm0Var.f220020b, null, null, i), new qf91((zrr0) tfm0Var.f220021c, new nst0(this, 5)), null, ContentType.LONG_FORM_ON_DEMAND).f96307t;
                                View view4 = bheVar.getView();
                                View view5 = eheVar.getView();
                                View view6 = ussVar.getView();
                                View view7 = kseVar.getView();
                                View view8 = rav0Var.getView();
                                int iM64021n = nap.m64021n(r3, R.dimen.spacer_48);
                                int iM64021n2 = nap.m64021n(r3, R.dimen.spacer_16);
                                int iM64021n3 = nap.m64021n(r3, R.dimen.spacer_8);
                                int iM64021n4 = nap.m64021n(r3, R.dimen.spacer_4);
                                View rootView = view2.getRootView();
                                View rootView2 = view3.getRootView();
                                View rootView3 = constraintLayout2.getRootView();
                                View rootView4 = view != null ? view.getRootView() : null;
                                View rootView5 = view4.getRootView();
                                View rootView6 = view5.getRootView();
                                View rootView7 = view6.getRootView();
                                View rootView8 = view7.getRootView();
                                View rootView9 = view8.getRootView();
                                rootView.setId(View.generateViewId());
                                rootView2.setId(View.generateViewId());
                                rootView3.setId(View.generateViewId());
                                if (rootView4 != null) {
                                    rootView4.setId(View.generateViewId());
                                }
                                rootView5.setId(View.generateViewId());
                                rootView6.setId(View.generateViewId());
                                rootView7.setId(View.generateViewId());
                                rootView8.setId(View.generateViewId());
                                rootView9.setId(View.generateViewId());
                                View view9 = rootView4;
                                r3.addView(rootView, new h6j(0, -2));
                                r3.addView(rootView2, new h6j(0, -2));
                                r3.addView(rootView5, new h6j(-2, -2));
                                r3.addView(rootView6, new h6j(-2, -2));
                                r3.addView(rootView7, new h6j(-2, -2));
                                r3.addView(rootView8, new h6j(-2, -2));
                                r430 r430Var = new r430(iM64021n4, 6);
                                h6j h6jVar = new h6j(0, -2);
                                r430Var.invoke(h6jVar);
                                r3.addView(rootView3, h6jVar);
                                sav savVar = new sav(iM64021n2, iM64021n4, 5);
                                h6j h6jVar2 = new h6j(0, -2);
                                savVar.invoke(h6jVar2);
                                r3.addView(rootView9, h6jVar2);
                                if (view != null) {
                                    C2580xm c2580xm = new C2580xm(iM64021n3, view, 14);
                                    h6j h6jVar3 = new h6j(iM64021n, iM64021n);
                                    c2580xm.invoke(h6jVar3);
                                    constraintLayout.addView(view, h6jVar3);
                                }
                                rootView7.setPadding(iM64021n3, 0, iM64021n2, 0);
                                rootView8.setPadding(iM64021n3, 0, iM64021n2, 0);
                                fi50 fi50Var = new fi50(rootView, r3, rootView5, rootView2, rootView9, rootView6, rootView7, rootView8, rootView3, view9, 1);
                                c7j c7jVar = new c7j();
                                c7jVar.m31736f(r3);
                                fi50Var.invoke(c7jVar);
                                c7jVar.m31733b(r3);
                                if (w54Var.m87221e()) {
                                    FrameLayout frameLayout3 = frameLayout;
                                    frameLayout3.addView(hxtVarM50020m2.f96307t);
                                    frameLayout3.setOnHoverListener(ist0.f105314c);
                                }
                                ro80 ro80VarM44508o = geg1.m44508o();
                                ro80VarM44508o.add(pheVar.getView());
                                ro80VarM44508o.add(x3i0Var.getView());
                                ro80VarM44508o.add(tgw0Var.getView());
                                editModeBarContainerView.setEditModeBarButtons(geg1.m44506m(ro80VarM44508o));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(coordinatorLayout.getResources().getResourceName(i2)));
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        nak0 nak0Var = new nak0(6, consumer, this.f180959i);
        eh00 eh00Var = this.f180954d;
        zrt0 zrt0Var = this.f180955e;
        zrt0Var.f285747h = eh00Var;
        zrt0Var.f285746g = new jrs0(this, 21);
        this.f180931M0.f27162L0 = new mst0(nak0Var, 0);
        this.f180932N0.f59557L0 = new mst0(nak0Var, 1);
        this.f180933O0.f233679L0 = new guq0(26, this, nak0Var);
        this.f180934P0.f125934L0 = new mst0(nak0Var, 2);
        this.f180935Q0.f177639L0 = new mst0(nak0Var, 3);
        this.f180936R0.f257819L0 = new mst0(nak0Var, 4);
        this.f180937S0.f220274L0 = new mst0(nak0Var, 5);
        this.f180939U0.f197391L0 = new mst0(nak0Var, 6);
        rm90 rm90Var = new rm90(this, 16);
        this.f180941W0 = nak0Var;
        return rm90Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m70889a(View view, View view2, View view3, eh00 eh00Var, eh00 eh00Var2) {
        ValueAnimator valueAnimator = this.f180949a1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f180951b1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (view2.isAttachedToWindow()) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(view3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view2.getMeasuredHeight();
            view.setImportantForAccessibility(4);
            view2.setImportantForAccessibility(2);
            int height = view.getHeight();
            rxn0 rxn0Var = new rxn0(view, new lst0(this, eh00Var, 0), 1);
            lkr lkrVar = lkr.f134438d;
            this.f180949a1 = erg1.m39804w(view, lkrVar, height, 0, 1.0f, 0.0f, rxn0Var);
            this.f180951b1 = erg1.m39804w(view2, lkrVar, 0, measuredHeight, 0.0f, 1.0f, new ljb1(12, new lst0(this, eh00Var2, 1)));
            return;
        }
        view.setImportantForAccessibility(4);
        view2.setImportantForAccessibility(2);
        view.setVisibility(8);
        view2.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = -2;
        view2.setLayoutParams(layoutParams);
        this.f180949a1 = null;
        this.f180951b1 = null;
        eh00Var.invoke();
        eh00Var2.invoke();
    }
}
