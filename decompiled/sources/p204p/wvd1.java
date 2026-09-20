package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.spotify.music.R;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wvd1 extends zvd1 {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f255475e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final xdy f255476f = new xdy(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f255477g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f255478h = new AccelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: f */
    public static void m89083f(View view, awd1 awd1Var) {
        ptc ptcVarM89088k = m89088k(view);
        if (ptcVarM89088k != null) {
            ptcVarM89088k.mo46013s0(awd1Var);
            if (ptcVarM89088k.f181099a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m89083f(viewGroup.getChildAt(i), awd1Var);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m89084g(View view, awd1 awd1Var, swd1 swd1Var, boolean z) {
        ptc ptcVarM89088k = m89088k(view);
        if (ptcVarM89088k != null) {
            ptcVarM89088k.f181100b = swd1Var;
            if (!z) {
                ptcVarM89088k.mo46014t0();
                z = ptcVarM89088k.f181099a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m89084g(viewGroup.getChildAt(i), awd1Var, swd1Var, z);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m89085h(View view, swd1 swd1Var, List list) {
        ptc ptcVarM89088k = m89088k(view);
        if (ptcVarM89088k != null) {
            swd1Var = ptcVarM89088k.mo30501u0(swd1Var, list);
            if (ptcVarM89088k.f181099a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m89085h(viewGroup.getChildAt(i), swd1Var, list);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m89086i(View view, awd1 awd1Var, yya1 yya1Var) {
        ptc ptcVarM89088k = m89088k(view);
        if (ptcVarM89088k != null) {
            ptcVarM89088k.mo30502v0(awd1Var, yya1Var);
            if (ptcVarM89088k.f181099a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m89086i(viewGroup.getChildAt(i), awd1Var, yya1Var);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static WindowInsets m89087j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: k */
    public static ptc m89088k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof vvd1) {
            return ((vvd1) tag).f245216a;
        }
        return null;
    }
}
