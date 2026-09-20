package p204p;

import android.content.Context;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends i500 implements t061, uz70 {

    /* JADX INFO: renamed from: A1 */
    public final oz0 f127289A1;

    /* JADX INFO: renamed from: E1 */
    public rw1 f127293E1;

    /* JADX INFO: renamed from: F1 */
    public i6m0 f127294F1;

    /* JADX INFO: renamed from: G1 */
    public qoc1 f127295G1;

    /* JADX INFO: renamed from: I1 */
    public sx1 f127297I1;

    /* JADX INFO: renamed from: J1 */
    public t0h1 f127298J1;

    /* JADX INFO: renamed from: K1 */
    public q831 f127299K1;

    /* JADX INFO: renamed from: L1 */
    public o500 f127300L1;

    /* JADX INFO: renamed from: M1 */
    public final qic1 f127301M1;

    /* JADX INFO: renamed from: N1 */
    public roc1 f127302N1;

    /* JADX INFO: renamed from: O1 */
    public bbg0 f127303O1;

    /* JADX INFO: renamed from: P1 */
    public final wg61 f127304P1;

    /* JADX INFO: renamed from: Q1 */
    public boolean f127305Q1;

    /* JADX INFO: renamed from: R1 */
    public final ArrayList f127306R1;

    /* JADX INFO: renamed from: B1 */
    public final BehaviorSubject f127290B1 = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: C1 */
    public final PublishSubject f127291C1 = new PublishSubject();

    /* JADX INFO: renamed from: D1 */
    public final PublishSubject f127292D1 = new PublishSubject();

    /* JADX INFO: renamed from: H1 */
    public final wg61 f127296H1 = new wg61(new bx1(this, 1));

    public kx1(oz0 oz0Var) {
        this.f127289A1 = oz0Var;
        bx1 bx1Var = new bx1(this, 17);
        fr70 fr70VarM72078I = q3d0.m72078I(3, new C2038k3(new bx1(this, 16), 23));
        this.f127301M1 = mgg1.m61716k(this, qpv0.f191387a.mo54112b(MobiusLoopViewModel.class), new jx1(fr70VarM72078I, 0), new jx1(fr70VarM72078I, 1), bx1Var);
        this.f127304P1 = new wg61(new bx1(this, 0));
        this.f127306R1 = new ArrayList();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f127289A1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_address_form, viewGroup, false);
        int i = R.id.address_body;
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.address_body);
        if (textView != null) {
            i = R.id.address_title;
            TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.address_title);
            if (textView2 != null) {
                i = R.id.cancel_btn;
                EncoreButton encoreButton = (EncoreButton) vie1.m85629k(viewInflate, R.id.cancel_btn);
                if (encoreButton != null) {
                    i = R.id.edit_cancel_button;
                    EncoreButton encoreButton2 = (EncoreButton) vie1.m85629k(viewInflate, R.id.edit_cancel_button);
                    if (encoreButton2 != null) {
                        i = R.id.edit_cta;
                        TextView textView3 = (TextView) vie1.m85629k(viewInflate, R.id.edit_cta);
                        if (textView3 != null) {
                            i = R.id.edit_edit_disclaimer;
                            LinearLayout linearLayout = (LinearLayout) vie1.m85629k(viewInflate, R.id.edit_edit_disclaimer);
                            if (linearLayout != null) {
                                i = R.id.edit_edit_disclaimer_text;
                                TextView textView4 = (TextView) vie1.m85629k(viewInflate, R.id.edit_edit_disclaimer_text);
                                if (textView4 != null) {
                                    i = R.id.edit_error;
                                    LinearLayout linearLayout2 = (LinearLayout) vie1.m85629k(viewInflate, R.id.edit_error);
                                    if (linearLayout2 != null) {
                                        i = R.id.edit_error_text;
                                        TextView textView5 = (TextView) vie1.m85629k(viewInflate, R.id.edit_error_text);
                                        if (textView5 != null) {
                                            i = R.id.edit_form;
                                            LinearLayout linearLayout3 = (LinearLayout) vie1.m85629k(viewInflate, R.id.edit_form);
                                            if (linearLayout3 != null) {
                                                i = R.id.edit_mode_container;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.edit_mode_container);
                                                if (constraintLayout != null) {
                                                    i = R.id.edit_save_button;
                                                    EncoreButton encoreButton3 = (EncoreButton) vie1.m85629k(viewInflate, R.id.edit_save_button);
                                                    if (encoreButton3 != null) {
                                                        i = R.id.error_body;
                                                        TextView textView6 = (TextView) vie1.m85629k(viewInflate, R.id.error_body);
                                                        if (textView6 != null) {
                                                            i = R.id.error_container;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.error_container);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.error_title;
                                                                TextView textView7 = (TextView) vie1.m85629k(viewInflate, R.id.error_title);
                                                                if (textView7 != null) {
                                                                    i = R.id.extra_fields_container;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.extra_fields_container);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.extra_learn_more;
                                                                        TextView textView8 = (TextView) vie1.m85629k(viewInflate, R.id.extra_learn_more);
                                                                        if (textView8 != null) {
                                                                            i = R.id.extra_legal_terms;
                                                                            TextView textView9 = (TextView) vie1.m85629k(viewInflate, R.id.extra_legal_terms);
                                                                            if (textView9 != null) {
                                                                                i = R.id.extra_title;
                                                                                TextView textView10 = (TextView) vie1.m85629k(viewInflate, R.id.extra_title);
                                                                                if (textView10 != null) {
                                                                                    i = R.id.loader;
                                                                                    ProgressBar progressBar = (ProgressBar) vie1.m85629k(viewInflate, R.id.loader);
                                                                                    if (progressBar != null) {
                                                                                        i = R.id.retry_btn;
                                                                                        EncoreButton encoreButton4 = (EncoreButton) vie1.m85629k(viewInflate, R.id.retry_btn);
                                                                                        if (encoreButton4 != null) {
                                                                                            i = R.id.view_mode_container;
                                                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) vie1.m85629k(viewInflate, R.id.view_mode_container);
                                                                                            if (constraintLayout4 != null) {
                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) viewInflate;
                                                                                                this.f127300L1 = new o500(constraintLayout5, textView, textView2, encoreButton, encoreButton2, textView3, linearLayout, textView4, linearLayout2, textView5, linearLayout3, constraintLayout, encoreButton3, textView6, constraintLayout2, textView7, constraintLayout3, textView8, textView9, textView10, progressBar, encoreButton4, constraintLayout4);
                                                                                                return constraintLayout5;
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public final void mo878I0() throws Exception {
        this.f98702f1 = true;
        this.f127300L1 = null;
        ArrayList arrayList = this.f127306R1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s571.m77255n((AutoCloseable) it.next());
        }
        arrayList.clear();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: R0 */
    public final void mo881R0(View view, Bundle bundle) {
        rw1 rw1VarM65810a;
        if (this.f127293E1 == null) {
            try {
                View view2 = this.f98706h1;
                if (view2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                qfm0 qfm0VarMo31538a = hug1.m48669n(view2).mo15684j0(nx1.class).mo31538a();
                if (qfm0VarMo31538a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                rw1VarM65810a = ((nx1) qfm0VarMo31538a).m65810a();
                if (rw1VarM65810a == null) {
                    h9y0 h9y0Var = this.f98683V0;
                    rw1VarM65810a = h9y0Var instanceof rw1 ? (rw1) h9y0Var : null;
                    if (rw1VarM65810a == null) {
                        Object objM49717p0 = m49717p0();
                        rw1VarM65810a = objM49717p0 instanceof rw1 ? (rw1) objM49717p0 : null;
                    }
                }
                if (rw1VarM65810a == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f127293E1 = rw1VarM65810a;
                i6m0 i6m0VarMo6696d = rw1VarM65810a.mo6696d();
                this.f127294F1 = i6m0VarMo6696d;
                roc1 roc1Var = this.f127302N1;
                if (roc1Var == null) {
                    wj50.m88260d0("viewUbiImpressionLoggerFactory");
                    throw null;
                }
                this.f127295G1 = roc1Var.m76046a(this, i6m0VarMo6696d);
            } catch (Throwable unused) {
                rw1VarM65810a = null;
            }
        }
        this.f98721u1.m59915g().m41110c("STATE_PROVIDER_VIEW_ID", new dx1(this, 0));
        Bundle bundleM41108a = this.f98721u1.m59915g().m41108a("STATE_TRACKED_DROPDOWN_SEARCH");
        this.f127305Q1 = bundleM41108a != null ? bundleM41108a.getBoolean("STATE_TRACKED_DROPDOWN_SEARCH", false) : false;
        this.f98721u1.m59915g().m41110c("STATE_TRACKED_DROPDOWN_SEARCH", new dx1(this, 1));
        this.f127303O1 = p1m0.m68833n((UUID) this.f127304P1.getValue());
        m57579i1().f5622b.m33099f(m49724w0(), new ex1(this, 0));
        m57579i1().f5623c.mo15614a(this, new ex1(this, 1), new ex1(this, 2));
        o500 o500Var = this.f127300L1;
        if (o500Var != null) {
            o500Var.f161814Q0.setMovementMethod(LinkMovementMethod.getInstance());
        }
        o500 o500Var2 = this.f127300L1;
        if (o500Var2 != null) {
            o500Var2.f161827f.setOnClickListener(new cx1(this, 1));
        }
        o500 o500Var3 = this.f127300L1;
        if (o500Var3 != null) {
            o500Var3.f161821Z.setOnClickListener(new cx1(this, 2));
        }
        o500 o500Var4 = this.f127300L1;
        if (o500Var4 != null) {
            o500Var4.f161826e.setOnClickListener(new cx1(this, 3));
        }
        o500 o500Var5 = this.f127300L1;
        if (o500Var5 != null) {
            o500Var5.f161817T0.setOnClickListener(new cx1(this, 4));
        }
        o500 o500Var6 = this.f127300L1;
        if (o500Var6 != null) {
            o500Var6.f161825d.setOnClickListener(new cx1(this, 0));
        }
        o500 o500Var7 = this.f127300L1;
        if (o500Var7 == null) {
            return;
        }
        qoc1 qoc1Var = this.f127295G1;
        if (qoc1Var == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        ooc1 ooc1VarM73390a = qoc1Var.m73390a(o500Var7.f161822a, new bx1(this, 4));
        ArrayList arrayList = this.f127306R1;
        arrayList.add(ooc1VarM73390a);
        qoc1 qoc1Var2 = this.f127295G1;
        if (qoc1Var2 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var2.m73390a(o500Var7.f161816S0, new bx1(this, 5)));
        qoc1 qoc1Var3 = this.f127295G1;
        if (qoc1Var3 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var3.m73390a(o500Var7.f161810M0, new bx1(this, 6)));
        qoc1 qoc1Var4 = this.f127295G1;
        if (qoc1Var4 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var4.m73390a(o500Var7.f161817T0, new bx1(this, 7)));
        qoc1 qoc1Var5 = this.f127295G1;
        if (qoc1Var5 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var5.m73390a(o500Var7.f161825d, new bx1(this, 8)));
        qoc1 qoc1Var6 = this.f127295G1;
        if (qoc1Var6 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var6.m73390a(o500Var7.f161818U0, new bx1(this, 9)));
        qoc1 qoc1Var7 = this.f127295G1;
        if (qoc1Var7 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var7.m73390a(o500Var7.f161820Y, new bx1(this, 10)));
        qoc1 qoc1Var8 = this.f127295G1;
        if (qoc1Var8 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var8.m73390a(o500Var7.f161830i, new bx1(this, 11)));
        qoc1 qoc1Var9 = this.f127295G1;
        if (qoc1Var9 == null) {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
        arrayList.add(qoc1Var9.m73390a(o500Var7.f161826e, new bx1(this, 12)));
        qoc1 qoc1Var10 = this.f127295G1;
        if (qoc1Var10 != null) {
            arrayList.add(qoc1Var10.m73390a(o500Var7.f161828g, new bx1(this, 3)));
        } else {
            wj50.m88260d0("viewUbiImpressionLogger");
            throw null;
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final t0h1 m57578h1() {
        t0h1 t0h1Var = this.f127298J1;
        if (t0h1Var != null) {
            return t0h1Var;
        }
        wj50.m88260d0("tracking");
        throw null;
    }

    /* JADX INFO: renamed from: i1 */
    public final MobiusLoopViewModel m57579i1() {
        return (MobiusLoopViewModel) this.f127301M1.getValue();
    }

    /* JADX INFO: renamed from: j1 */
    public final void m57580j1(String str) {
        i6m0 i6m0Var = this.f127294F1;
        if (i6m0Var == null) {
            wj50.m88260d0("pageBoundUbiLogger");
            throw null;
        }
        bbg0 bbg0Var = this.f127303O1;
        if (bbg0Var == null) {
            wj50.m88260d0("ubiEventFactory");
            throw null;
        }
        ((zz8) i6m0Var).mo57453r(bbg0Var.m28638i().m77627l().m90251k(str), null);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m57581k1(qmt qmtVar) {
        if (qmtVar instanceof tlt) {
            this.f127290B1.onNext(((tlt) qmtVar).m81069a());
            return;
        }
        boolean z = qmtVar instanceof slt;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            this.f127292D1.onNext(w2a1Var);
            return;
        }
        if (qmtVar instanceof dmt) {
            this.f127291C1.onNext(w2a1Var);
            return;
        }
        if (qmtVar instanceof klt) {
            o500 o500Var = this.f127300L1;
            if (o500Var != null) {
                Iterator it = new ek5(o500Var.f161819X, 8).iterator();
                while (true) {
                    C2042k7 c2042k7 = (C2042k7) it;
                    if (!c2042k7.hasNext()) {
                        break;
                    }
                    View view = (View) c2042k7.next();
                    if (view.hasFocus()) {
                        view.clearFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) lzj.m60332J(m49702X0(), InputMethodManager.class);
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                        }
                    }
                }
            }
            m57579i1().m15621f(xuw.f266185a);
            return;
        }
        if (qmtVar instanceof jmt) {
            jmt jmtVar = (jmt) qmtVar;
            q831 q831Var = this.f127299K1;
            if (q831Var != null) {
                q831Var.m72305j(t0j.m79825f(jmtVar.m53792a()).m52392q());
                return;
            } else {
                wj50.m88260d0("snackbarManager");
                throw null;
            }
        }
        if (!(qmtVar instanceof lmt)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = v061.f235928Y1;
        v061 v061VarM58988o = lhg1.m58988o(new s061(((lmt) qmtVar).m59464a()));
        v061VarM58988o.mo63163q1(m49716o0(), null);
        i6m0 i6m0Var = this.f127294F1;
        if (i6m0Var == null) {
            wj50.m88260d0("pageBoundUbiLogger");
            throw null;
        }
        View view2 = v061VarM58988o.f98706h1;
        if (view2 == null) {
            return;
        }
        roc1 roc1Var = this.f127302N1;
        if (roc1Var != null) {
            roc1Var.m76046a(this, i6m0Var).m73390a(view2, new bx1(this, 2));
        } else {
            wj50.m88260d0("viewUbiImpressionLoggerFactory");
            throw null;
        }
    }
}
