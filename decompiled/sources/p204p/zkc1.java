package p204p;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zkc1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f283721a;

    public zkc1(View view) {
        this.f283721a = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m96312a(float f) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96313b(float f) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m96314c() {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m96315d(long j) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m96316e(Interpolator interpolator) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m96317f(alc1 alc1Var) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            if (alc1Var != null) {
                view.animate().setListener(new g9p(5, alc1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m96318g() {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m96319h(float f) {
        View view = (View) this.f283721a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
