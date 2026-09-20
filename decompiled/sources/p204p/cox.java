package p204p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class cox implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public boolean f40361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f40362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f40363c;

    public cox(View view, eh00 eh00Var) {
        this.f40362b = view;
        this.f40363c = eh00Var;
        view.addOnAttachStateChangeListener(this);
        if (this.f40361a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f40361a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f40363c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f40361a) {
            return;
        }
        View view2 = this.f40362b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f40361a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f40361a) {
            this.f40362b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f40361a = false;
        }
    }
}
