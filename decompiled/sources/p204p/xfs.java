package p204p;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xfs {

    /* JADX INFO: renamed from: a */
    public static final Object f261091a = q3d0.m72078I(3, v8s.f238673d);

    /* JADX INFO: renamed from: a */
    public static final mqm0 m90512a(Drawable drawable, xq00 xq00Var) {
        xq00Var.m91773j0(1756822313);
        xq00Var.m91773j0(1157296644);
        boolean zM91766g = xq00Var.m91766g(drawable);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == t6x0.f217647t) {
            if (drawable == null) {
                objM91750T = vau.f239329f;
            } else {
                objM91750T = drawable instanceof ColorDrawable ? new a8f(rfg1.m75432b(((ColorDrawable) drawable).getColor())) : new wfs(drawable.mutate());
            }
            xq00Var.m91793t0(objM91750T);
        }
        xq00Var.m91788r(false);
        mqm0 mqm0Var = (mqm0) objM91750T;
        xq00Var.m91788r(false);
        return mqm0Var;
    }
}
