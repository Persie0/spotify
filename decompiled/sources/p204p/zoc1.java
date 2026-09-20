package p204p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class zoc1 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w8j f284764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f284765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewTreeObserver f284766c;

    public zoc1(w8j w8jVar, View view, ViewTreeObserver viewTreeObserver) {
        this.f284764a = w8jVar;
        this.f284765b = view;
        this.f284766c = viewTreeObserver;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        w8j w8jVar = this.f284764a;
        View view = this.f284765b;
        w8jVar.accept(view);
        ViewTreeObserver viewTreeObserver = this.f284766c;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
            return false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
