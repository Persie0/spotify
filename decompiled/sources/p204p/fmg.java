package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes8.dex */
public final class fmg extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f71043b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmg(View view, int i) {
        super(1);
        this.f71042a = i;
        this.f71043b = view;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f71042a) {
            case 0:
                return this.f71043b;
            case 1:
                return this.f71043b;
            case 2:
                this.f71043b.getParent().requestDisallowInterceptTouchEvent(((Boolean) obj).booleanValue());
                return w2a1.f247311a;
            case 3:
                return this.f71043b;
            case 4:
                View view = this.f71043b;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                return view;
            case 5:
                View view2 = this.f71043b;
                ViewParent parent2 = view2.getParent();
                ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(view2);
                }
                return view2;
            case 6:
                View view3 = this.f71043b;
                view3.getViewTreeObserver().addOnWindowFocusChangeListener(n4v0.f150428a);
                return new l56(view3, 3);
            case 7:
                this.f71043b.setTranslationX(((Number) obj).floatValue());
                return w2a1.f247311a;
            case 8:
                zkc1 zkc1Var = (zkc1) obj;
                zkc1Var.m96319h((-this.f71043b.getMeasuredHeight()) / 2);
                zkc1Var.m96316e(n551.f150492a);
                return w2a1.f247311a;
            default:
                this.f71043b.setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return w2a1.f247311a;
        }
    }
}
