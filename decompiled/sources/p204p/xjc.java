package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class xjc extends z691 {

    /* JADX INFO: renamed from: d1 */
    public static final String[] f262093d1 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: e1 */
    public static final tjc f262094e1 = new tjc(0);

    /* JADX INFO: renamed from: f1 */
    public static final tjc f262095f1 = new tjc(1);

    /* JADX INFO: renamed from: g1 */
    public static final tjc f262096g1 = new tjc(2);

    /* JADX INFO: renamed from: h1 */
    public static final tjc f262097h1 = new tjc(3);

    /* JADX INFO: renamed from: i1 */
    public static final tjc f262098i1 = new tjc(4);

    /* JADX INFO: renamed from: T */
    public static void m91215T(rb91 rb91Var) {
        View view = rb91Var.f197534b;
        HashMap map = rb91Var.f197533a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: e */
    public final void mo26147e(rb91 rb91Var) {
        m91215T(rb91Var);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: i */
    public final void mo26148i(rb91 rb91Var) {
        m91215T(rb91Var);
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: m */
    public Animator mo30251m(ViewGroup viewGroup, rb91 rb91Var, rb91 rb91Var2) {
        int i;
        xjc xjcVar;
        Animator animatorM97059v;
        if (rb91Var != null) {
            HashMap map = rb91Var.f197533a;
            if (rb91Var2 != null) {
                HashMap map2 = rb91Var2.f197533a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = rb91Var2.f197534b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        bpc1.m30114a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            xjcVar = this;
                            if (i2 == i3 && i4 == i5) {
                                xjcVar.f279792V0.getClass();
                                animatorM97059v = zuj0.m97059v(view, f262096g1, ajp0.m26171a(i6, i8, i7, i9));
                            } else {
                                xjcVar.f279792V0.getClass();
                                animatorM97059v = zuj0.m97059v(view, f262097h1, ajp0.m26171a(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            xjcVar = this;
                            xjcVar.f279792V0.getClass();
                            animatorM97059v = zuj0.m97059v(view, f262098i1, ajp0.m26171a(i2, i4, i3, i5));
                        } else {
                            xjcVar = this;
                            wjc wjcVar = new wjc(view);
                            xjcVar.f279792V0.getClass();
                            ObjectAnimator objectAnimatorM97059v = zuj0.m97059v(wjcVar, f262094e1, ajp0.m26171a(i2, i4, i3, i5));
                            xjcVar.f279792V0.getClass();
                            ObjectAnimator objectAnimatorM97059v2 = zuj0.m97059v(wjcVar, f262095f1, ajp0.m26171a(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM97059v, objectAnimatorM97059v2);
                            animatorSet.addListener(new ujc(wjcVar));
                            animatorM97059v = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            mif1.m61858K(viewGroup4, true);
                            xjcVar.m95492u().m95486b(new vjc(viewGroup4));
                        }
                        return animatorM97059v;
                    }
                }
            }
        }
        return null;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: w */
    public final String[] mo30252w() {
        return f262093d1;
    }

    @Override // p204p.z691
    /* JADX INFO: renamed from: z */
    public final boolean mo55854z() {
        return true;
    }
}
