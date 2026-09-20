package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class s281 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final View f204930a;

    /* JADX INFO: renamed from: b */
    public final wep f204931b;

    /* JADX INFO: renamed from: c */
    public final Rect f204932c = new Rect();

    public s281(View view, wep wepVar) {
        this.f204930a = view;
        this.f204931b = wepVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f204930a;
        if (view.isShown() && view.getGlobalVisibleRect(this.f204932c)) {
            return;
        }
        this.f204931b.invoke();
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
