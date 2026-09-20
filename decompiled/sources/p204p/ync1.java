package p204p;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ync1 extends znc1 {

    /* JADX INFO: renamed from: k */
    public boolean f274434k;

    @Override // p204p.znc1
    /* JADX INFO: renamed from: d */
    public final boolean mo86039d(float f, long j, View view, iew0 iew0Var) {
        Method method;
        ync1 ync1Var;
        if (view instanceof MotionLayout) {
            float fM96589b = m96589b(f, j, view, iew0Var);
            ync1Var = this;
            ((MotionLayout) view).setProgress(fM96589b);
        } else {
            if (this.f274434k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f274434k = true;
                method = null;
            }
            if (method != null) {
                try {
                    float fM96589b2 = m96589b(f, j, view, iew0Var);
                    ync1Var = this;
                    try {
                        method.invoke(view, Float.valueOf(fM96589b2));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    ync1Var = this;
                }
            } else {
                ync1Var = this;
            }
        }
        return ync1Var.f284475h;
    }
}
