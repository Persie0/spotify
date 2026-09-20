package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public final class k940 implements wc40 {

    /* JADX INFO: renamed from: a */
    public final ImageView f120514a;

    /* JADX INFO: renamed from: b */
    public tfs f120515b;

    /* JADX INFO: renamed from: c */
    public mu61 f120516c;

    public k940(ImageView imageView, tfs tfsVar) {
        this.f120514a = imageView;
        this.f120515b = tfsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof k940)) {
            return false;
        }
        k940 k940Var = (k940) obj;
        return k940Var.f120514a == this.f120514a && k940Var.f120515b == this.f120515b;
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public final void mo26031h(int i, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        mu61 mu61Var = this.f120516c;
        if (mu61Var != null) {
            mu61Var.onSuccess();
        }
        Drawable drawableMo54267e = this.f120515b.mo54267e(bitmap);
        ImageView imageView = this.f120514a;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new uf50(drawableMo54267e, drawable, i));
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final int hashCode() {
        return this.f120514a.hashCode();
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public final void mo26033j(Drawable drawable) {
        ImageView imageView = this.f120514a;
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public final void mo26038o(Drawable drawable) {
        mu61 mu61Var = this.f120516c;
        if (mu61Var != null) {
            mu61Var.mo25096p(null);
        }
        this.f120514a.setImageDrawable(drawable);
    }
}
