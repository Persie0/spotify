package p204p;

import android.view.View;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public abstract class n551 {

    /* JADX INFO: renamed from: a */
    public static final PathInterpolator f150492a = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static final void m63713a(View view, long j, long j2) {
        view.setTranslationY((-view.getMeasuredHeight()) / 2);
        view.setAlpha(0.0f);
        zkc1 zkc1VarM61551c = mec1.m61551c(view);
        zkc1VarM61551c.m96312a(1.0f);
        View view2 = (View) zkc1VarM61551c.f283721a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(j2);
        }
        zkc1VarM61551c.m96315d(j);
        zkc1VarM61551c.m96319h(0.0f);
        zkc1VarM61551c.m96316e(f150492a);
        zkc1VarM61551c.m96313b(1.0f);
        zkc1VarM61551c.m96318g();
    }

    /* JADX INFO: renamed from: b */
    public static void m63714b(View view, long j) {
        view.setTranslationX(view.getMeasuredWidth() / 4);
        view.setAlpha(0.0f);
        zkc1 zkc1VarM61551c = mec1.m61551c(view);
        zkc1VarM61551c.m96312a(1.0f);
        WeakReference weakReference = zkc1VarM61551c.f283721a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().setStartDelay(j);
        }
        zkc1VarM61551c.m96315d(200L);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().translationX(0.0f);
        }
        zkc1VarM61551c.m96316e(f150492a);
        zkc1VarM61551c.m96313b(1.0f);
        zkc1VarM61551c.m96318g();
    }
}
