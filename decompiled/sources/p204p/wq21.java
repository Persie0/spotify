package p204p;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class wq21 extends bqc1 {

    /* JADX INFO: renamed from: g1 */
    public static final DecelerateInterpolator f253906g1 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: h1 */
    public static final AccelerateInterpolator f253907h1 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: i1 */
    public static final tq21 f253908i1 = new tq21(0);

    /* JADX INFO: renamed from: j1 */
    public static final tq21 f253909j1 = new tq21(1);

    /* JADX INFO: renamed from: k1 */
    public static final uq21 f253910k1 = new uq21(0);

    /* JADX INFO: renamed from: l1 */
    public static final tq21 f253911l1 = new tq21(2);

    /* JADX INFO: renamed from: m1 */
    public static final tq21 f253912m1 = new tq21(3);

    /* JADX INFO: renamed from: n1 */
    public static final uq21 f253913n1 = new uq21(1);

    /* JADX INFO: renamed from: f1 */
    public vq21 f253914f1 = f253913n1;

    public wq21(int i) {
        m88733X(i);
    }

    @Override // p204p.bqc1
    /* JADX INFO: renamed from: V */
    public final ObjectAnimator mo26145V(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2) {
        if (rb91Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) rb91Var2.f197533a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return vie1.m85623e(view, rb91Var2, iArr[0], iArr[1], this.f253914f1.mo50288a(view, viewGroup), this.f253914f1.mo83757b(view, viewGroup), translationX, translationY, f253906g1, this);
    }

    @Override // p204p.bqc1
    /* JADX INFO: renamed from: W */
    public final ObjectAnimator mo26146W(ViewGroup viewGroup, View view, rb91 rb91Var, rb91 rb91Var2) {
        if (rb91Var == null) {
            return null;
        }
        int[] iArr = (int[]) rb91Var.f197533a.get("android:slide:screenPosition");
        return vie1.m85623e(view, rb91Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f253914f1.mo50288a(view, viewGroup), this.f253914f1.mo83757b(view, viewGroup), f253907h1, this);
    }

    /* JADX INFO: renamed from: X */
    public final void m88733X(int i) {
        if (i == 3) {
            this.f253914f1 = f253908i1;
        } else if (i == 5) {
            this.f253914f1 = f253911l1;
        } else if (i == 48) {
            this.f253914f1 = f253910k1;
        } else if (i == 80) {
            this.f253914f1 = f253913n1;
        } else if (i == 8388611) {
            this.f253914f1 = f253909j1;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f253914f1 = f253912m1;
        }
        zz11 zz11Var = new zz11();
        zz11Var.f287861b = i;
        this.f279790T0 = zz11Var;
    }

    @Override // p204p.bqc1, p204p.z691
    /* JADX INFO: renamed from: e */
    public final void mo26147e(rb91 rb91Var) {
        bqc1.m30248T(rb91Var);
        int[] iArr = new int[2];
        rb91Var.f197534b.getLocationOnScreen(iArr);
        rb91Var.f197533a.put("android:slide:screenPosition", iArr);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: i */
    public final void mo26148i(rb91 rb91Var) {
        bqc1.m30248T(rb91Var);
        int[] iArr = new int[2];
        rb91Var.f197534b.getLocationOnScreen(iArr);
        rb91Var.f197533a.put("android:slide:screenPosition", iArr);
    }
}
