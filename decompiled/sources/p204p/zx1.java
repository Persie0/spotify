package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zx1 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f287148b;

    public /* synthetic */ zx1(Object obj, int i) {
        this.f287147a = i;
        this.f287148b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dx40 dx40VarMo51806g;
        int i = this.f287147a;
        Object obj = this.f287148b;
        switch (i) {
            case 0:
                ((vmy0) obj).invoke();
                return;
            case 1:
                m75 m75Var = (m75) obj;
                if (!m75Var.getInternalPopup().mo40949a()) {
                    m75Var.f140666f.mo40957i(d75.m35181b(m75Var), d75.m35180a(m75Var));
                }
                ViewTreeObserver viewTreeObserver = m75Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    c75.m31681a(viewTreeObserver, this);
                    return;
                }
                return;
            case 2:
                j75 j75Var = (j75) obj;
                m75 m75Var2 = j75Var.f109491d1;
                j75Var.getClass();
                WeakHashMap weakHashMap = mec1.f142677a;
                if (!m75Var2.isAttachedToWindow() || !m75Var2.getGlobalVisibleRect(j75Var.f109489b1)) {
                    j75Var.dismiss();
                    return;
                } else {
                    j75Var.m52599s();
                    j75Var.mo42575m();
                    return;
                }
            case 3:
                m9c m9cVar = (m9c) obj;
                ArrayList arrayList = m9cVar.f141269h;
                if (!m9cVar.mo42574a() || arrayList.size() <= 0 || ((l9c) arrayList.get(0)).f131055a.f118566V0) {
                    return;
                }
                View view = m9cVar.f141248M0;
                if (view == null || !view.isShown()) {
                    m9cVar.dismiss();
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l9c) it.next()).f131055a.mo42575m();
                }
                return;
            case 4:
                c7t c7tVar = (c7t) obj;
                View view2 = c7tVar.f35014i;
                c7tVar.getClass();
                WeakHashMap weakHashMap2 = mec1.f142677a;
                swd1 swd1VarM35774a = dec1.m35774a(view2);
                view2.setPadding(view2.getPaddingLeft(), (swd1VarM35774a == null || (dx40VarMo51806g = swd1VarM35774a.f214650a.mo51806g(519)) == null) ? 0 : dx40VarMo51806g.f53849b, view2.getPaddingRight(), view2.getPaddingBottom());
                return;
            case 5:
                tt30 tt30Var = (tt30) obj;
                View view3 = tt30Var.f223506M1;
                if (view3 == null) {
                    wj50.m88260d0("gradient");
                    throw null;
                }
                view3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                tt30.m81493h1(tt30Var);
                kk6 kk6Var = new kk6(tt30Var, 14);
                tt30Var.f223510Q1 = kk6Var;
                View view4 = tt30Var.f223506M1;
                if (view4 != null) {
                    view4.addOnLayoutChangeListener(kk6Var);
                    return;
                } else {
                    wj50.m88260d0("gradient");
                    throw null;
                }
            case 6:
                c170 c170Var = (c170) obj;
                View childAt = ((NestedScrollView) ((clq0) c170Var.f33006c).f39344f).getChildAt(0);
                if (childAt == null) {
                    return;
                }
                ((NestedScrollView) ((clq0) c170Var.f33006c).f39344f).setNestedScrollingEnabled(childAt.getHeight() > ((NestedScrollView) ((clq0) c170Var.f33006c).f39344f).getHeight());
                return;
            case 7:
                pm41 pm41Var = (pm41) obj;
                die0 die0Var = pm41Var.f178895h;
                if (!pm41Var.mo42574a() || die0Var.f118566V0) {
                    return;
                }
                View view5 = pm41Var.f178888Z;
                if (view5 == null || !view5.isShown()) {
                    pm41Var.dismiss();
                    return;
                } else {
                    die0Var.mo42575m();
                    return;
                }
            default:
                w551 w551Var = (w551) obj;
                ConstraintLayout constraintLayout = w551Var.f247999a;
                constraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view6 = w551Var.f248001c;
                View view7 = w551Var.f248002d;
                View view8 = w551Var.f248004f;
                View view9 = w551Var.f248003e;
                View view10 = w551Var.f248005g;
                int iM76550k = rwg1.m76550k(constraintLayout.getContext(), R.dimen.encore_spacer_base);
                int iM76550k2 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.encore_spacer_tighter_2);
                int iM76550k3 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.encore_spacer_tighter_4);
                int iM76550k4 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.tertiary_button_size);
                WeakHashMap weakHashMap3 = mec1.f142677a;
                view6.setId(View.generateViewId());
                if (view8 != null) {
                    view8.setId(View.generateViewId());
                }
                view7.setId(R.id.sticky_header_play_pause_button);
                view9.setId(View.generateViewId());
                if (view10 != null) {
                    view10.setId(View.generateViewId());
                }
                constraintLayout.removeAllViews();
                constraintLayout.setMinHeight(rwg1.m76550k(constraintLayout.getContext(), R.dimen.sticky_header_min_height));
                if (view10 != null) {
                    int iM76550k5 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.sticky_header_video_width);
                    int iM76550k6 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.sticky_header_video_height);
                    view10.setClipToOutline(true);
                    view10.setOutlineProvider(new jmx0(constraintLayout, 1));
                    f6w0 f6w0Var = new f6w0(iM76550k, 6);
                    h6j h6jVar = new h6j(iM76550k5, iM76550k6);
                    f6w0Var.invoke(h6jVar);
                    constraintLayout.addView(view10, h6jVar);
                }
                po70 po70Var = new po70(view10, iM76550k2, iM76550k, 1);
                h6j h6jVar2 = new h6j(0, -2);
                po70Var.invoke(h6jVar2);
                constraintLayout.addView(view6, h6jVar2);
                if (view8 != null) {
                    constraintLayout.addView(view8, iM76550k4, iM76550k4);
                }
                int iM76550k7 = rwg1.m76550k(constraintLayout.getContext(), R.dimen.encore_spacer_tighter_2);
                view7.setPadding(iM76550k7, iM76550k7, iM76550k7, iM76550k7);
                f6w0 f6w0Var2 = new f6w0(iM76550k, 7);
                h6j h6jVar3 = new h6j(iM76550k4, iM76550k4);
                f6w0Var2.invoke(h6jVar3);
                constraintLayout.addView(view7, h6jVar3);
                constraintLayout.addView(view9, -1, rwg1.m76550k(constraintLayout.getContext(), R.dimen.sticky_header_progress_bar_height));
                dxf1.m37223L(constraintLayout, false);
                x551 x551Var = new x551(view10, constraintLayout, iM76550k3, view6, iM76550k, view8, view7, view9);
                c7j c7jVar = new c7j();
                c7jVar.m31736f(constraintLayout);
                x551Var.invoke(c7jVar);
                c7jVar.m31733b(constraintLayout);
                Object parent = constraintLayout.getParent();
                View view11 = parent instanceof View ? (View) parent : null;
                if (view11 == null || !view11.getFitsSystemWindows()) {
                    if (constraintLayout.isAttachedToWindow()) {
                        constraintLayout.requestApplyInsets();
                    } else {
                        constraintLayout.addOnAttachStateChangeListener(new rrp(9, constraintLayout, constraintLayout));
                    }
                    ViewParent parent2 = constraintLayout.getParent();
                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup == null) {
                        viewGroup = constraintLayout;
                    }
                    cec1.m32550n(viewGroup, new jhz0(constraintLayout, 17));
                }
                view9.setImportantForAccessibility(2);
                View view12 = w551Var.f248005g;
                if (view12 != null) {
                    view12.setImportantForAccessibility(2);
                }
                String string = constraintLayout.getContext().getString(R.string.title_accessibility_action_scroll_to_top);
                mec1.m61549a(constraintLayout, string, new mrc0(constraintLayout));
                mec1.m61561m(constraintLayout, C2212of.f164591g, string, new po11(constraintLayout, 11));
                return;
        }
    }

    public zx1(w551 w551Var, mlp mlpVar) {
        this.f287147a = 8;
        this.f287148b = w551Var;
    }
}
