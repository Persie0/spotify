package p204p;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xd40 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static uze1 m90407b(View view) {
        if (view instanceof uze1) {
            return (uze1) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (!(viewGroup.getChildCount() > 0)) {
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return m90407b(childAt);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m90408c(pqm0 pqm0Var, View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        PointF pointF = (PointF) pqm0Var.f180350a;
        Point point = new Point((int) pointF.x, (int) pointF.y);
        if (!rect.contains(point.x, point.y)) {
            return false;
        }
        PointF pointF2 = (PointF) pqm0Var.f180351b;
        Point point2 = new Point((int) pointF2.x, (int) pointF2.y);
        return rect.contains(point2.x, point2.y);
    }

    /* JADX INFO: renamed from: a */
    public abstract wd40 mo62185a(pqm0 pqm0Var);
}
