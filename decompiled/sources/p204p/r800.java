package p204p;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r800 {
    /* JADX INFO: renamed from: f */
    public static void m74961f(View view, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        if (cec1.m32542f(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            if (cec1.m32542f(childAt) == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i4) == childAt) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m74962j(Rect rect, View view) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m74963k(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo69314a(View view, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo69315b(Object obj, ArrayList arrayList);

    /* JADX INFO: renamed from: e */
    public abstract void mo69316e(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo69317g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo69318h(Object obj);

    /* JADX INFO: renamed from: i */
    public Object mo74966i(ViewGroup viewGroup, Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo69319l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo69320m(Object obj);

    /* JADX INFO: renamed from: n */
    public abstract Object mo69321n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: o */
    public abstract Object mo69322o(Object obj, Object obj2);

    /* JADX INFO: renamed from: p */
    public abstract void mo69323p(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: q */
    public abstract void mo69324q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    /* JADX INFO: renamed from: s */
    public abstract void mo69325s(View view, Object obj);

    /* JADX INFO: renamed from: t */
    public abstract void mo69326t(Object obj, Rect rect);

    /* JADX INFO: renamed from: u */
    public void mo74968u(Object obj, oqb oqbVar, kep kepVar, Runnable runnable) {
        ((u9q) runnable).run();
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo69327v(i500 i500Var, Object obj, oqb oqbVar, Runnable runnable);

    /* JADX INFO: renamed from: w */
    public abstract void mo69328w(Object obj, View view, ArrayList arrayList);

    /* JADX INFO: renamed from: x */
    public abstract void mo69329x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* JADX INFO: renamed from: y */
    public abstract Object mo69330y(Object obj);

    /* JADX INFO: renamed from: c */
    public void mo74964c(Object obj) {
    }

    /* JADX INFO: renamed from: d */
    public void mo74965d(Object obj, fxf fxfVar) {
    }

    /* JADX INFO: renamed from: r */
    public void mo74967r(Object obj, float f) {
    }
}
