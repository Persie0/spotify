package p204p;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class yjc1 extends zjc1 {

    /* JADX INFO: renamed from: g */
    public boolean f273343g;

    @Override // p204p.zjc1
    /* JADX INFO: renamed from: d */
    public final void mo85750d(View view, float f) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(m96234a(f));
            return;
        }
        if (this.f273343g) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f273343g = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m96234a(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
