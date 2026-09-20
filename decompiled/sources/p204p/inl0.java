package p204p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class inl0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final View f104029a;

    /* JADX INFO: renamed from: b */
    public ViewTreeObserver f104030b;

    /* JADX INFO: renamed from: c */
    public final Runnable f104031c;

    public inl0(View view, Runnable runnable) {
        this.f104029a = view;
        this.f104030b = view.getViewTreeObserver();
        this.f104031c = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static inl0 m51135a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        inl0 inl0Var = new inl0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(inl0Var);
        view.addOnAttachStateChangeListener(inl0Var);
        return inl0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f104030b.isAlive();
        View view = this.f104029a;
        if (zIsAlive) {
            this.f104030b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f104031c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f104030b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f104030b.isAlive();
        View view2 = this.f104029a;
        if (zIsAlive) {
            this.f104030b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
