package p204p;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class llc1 extends mlc1 {

    /* JADX INFO: renamed from: f */
    public boolean f134617f;

    @Override // p204p.mlc1
    /* JADX INFO: renamed from: c */
    public final void mo51010c(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(m62203a(f));
            return;
        }
        if (this.f134617f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f134617f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m62203a(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
