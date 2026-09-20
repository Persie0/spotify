package p204p;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public final class i19 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p19 f97445b;

    public /* synthetic */ i19(p19 p19Var, int i) {
        this.f97444a = i;
        this.f97445b = p19Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i = this.f97444a;
        p19 p19Var = this.f97445b;
        int i2 = 1;
        switch (i) {
            case 0:
                if (p19Var.f172994c != null && (context = p19Var.f172993b) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    int i3 = displayMetrics.heightPixels;
                    int[] iArr = new int[2];
                    o19 o19Var = p19Var.f172994c;
                    o19Var.getLocationOnScreen(iArr);
                    int height = (i3 - (o19Var.getHeight() + iArr[1])) + ((int) p19Var.f172994c.getTranslationY());
                    if (height < p19Var.f173002k) {
                        ViewGroup.LayoutParams layoutParams = p19Var.f172994c.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Handler handler = p19.f172990p;
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (p19Var.f173002k - height) + marginLayoutParams.bottomMargin;
                            p19Var.f172994c.requestLayout();
                        }
                        break;
                    }
                }
                break;
            default:
                o19 o19Var2 = p19Var.f172994c;
                if (o19Var2 != null) {
                    byte b = 0;
                    if (o19Var2.getParent() != null) {
                        o19Var2.setVisibility(0);
                    }
                    if (o19Var2.getAnimationMode() != 1) {
                        int height2 = o19Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = o19Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        o19Var2.setTranslationY(height2);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height2, 0);
                        valueAnimator.setInterpolator(r05.f194384b);
                        valueAnimator.setDuration(250L);
                        valueAnimator.addListener(new e19(p19Var, i2));
                        valueAnimator.addUpdateListener(new g19(p19Var, height2));
                        valueAnimator.start();
                    } else {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setInterpolator(r05.f194383a);
                        valueAnimatorOfFloat.addUpdateListener(new g19(p19Var, b, b));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        valueAnimatorOfFloat2.setInterpolator(r05.f194386d);
                        valueAnimatorOfFloat2.addUpdateListener(new g19(p19Var, i2, b));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
                        animatorSet.setDuration(150L);
                        animatorSet.addListener(new e19(p19Var, b));
                        animatorSet.start();
                    }
                    break;
                }
                break;
        }
    }
}
