package p204p;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class yd40 implements ob91, onp, iu61 {

    /* JADX INFO: renamed from: a */
    public boolean f271634a;

    /* JADX INFO: renamed from: b */
    public final ImageView f271635b;

    public yd40(ImageView imageView) {
        this.f271635b = imageView;
    }

    @Override // p204p.iu61
    /* JADX INFO: renamed from: a */
    public final void mo48984a(p340 p340Var) {
        m93383e(p340Var);
    }

    @Override // p204p.iu61
    /* JADX INFO: renamed from: b */
    public void mo47849b(p340 p340Var) {
        m93383e(p340Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m93382c() {
        Object drawable = this.f271635b.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f271634a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    @Override // p204p.iu61
    /* JADX INFO: renamed from: d */
    public final void mo48985d(p340 p340Var) {
        m93383e(p340Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m93383e(p340 p340Var) {
        ImageView imageView = this.f271635b;
        Drawable drawableM82966d = p340Var != null ? ufc1.m82966d(p340Var, imageView.getResources()) : null;
        Object drawable = imageView.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawableM82966d);
        m93382c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd40) && wj50.m88271j(this.f271635b, ((yd40) obj).f271635b);
    }

    @Override // p204p.ob91
    public final View getView() {
        return this.f271635b;
    }

    @Override // p204p.ob91
    /* JADX INFO: renamed from: h */
    public final Drawable mo66627h() {
        return this.f271635b.getDrawable();
    }

    public final int hashCode() {
        return this.f271635b.hashCode();
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        this.f271634a = true;
        m93382c();
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        this.f271634a = false;
        m93382c();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.f271635b + ')';
    }
}
