package p204p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class sdc1 implements wc40 {

    /* JADX INFO: renamed from: a */
    public lxe f207978a;

    /* JADX INFO: renamed from: b */
    public k940 f207979b;

    /* JADX INFO: renamed from: c */
    public final jt51 f207980c;

    /* JADX INFO: renamed from: d */
    public final jt51 f207981d;

    /* JADX INFO: renamed from: e */
    public final WeakReference f207982e;

    /* JADX INFO: renamed from: f */
    public boolean f207983f = true;

    public sdc1(ImageView imageView, lxe lxeVar, k940 k940Var, jt51 jt51Var, jt51 jt51Var2) {
        this.f207978a = lxeVar;
        this.f207979b = k940Var;
        this.f207980c = jt51Var;
        this.f207981d = jt51Var2;
        this.f207982e = new WeakReference(imageView);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m77828a() {
        ImageView imageView;
        return this.f207983f && ((Boolean) this.f207980c.invoke(this)).booleanValue() && (imageView = (ImageView) this.f207982e.get()) != null && imageView.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: b */
    public final void m77829b() {
        if (this.f207983f) {
            lxe lxeVar = this.f207978a;
            m77830c();
            if (lxeVar != null) {
                lxeVar.m60177c();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77830c() {
        if (this.f207983f) {
            this.f207983f = false;
            this.f207978a = null;
            this.f207979b = null;
            this.f207981d.invoke(this);
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public final void mo26031h(int i, Bitmap bitmap) {
        if (m77828a()) {
            try {
                k940 k940Var = this.f207979b;
                if (k940Var != null) {
                    k940Var.mo26031h(i, bitmap);
                }
            } finally {
                m77830c();
            }
        }
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public final void mo26033j(Drawable drawable) {
        k940 k940Var;
        if (!m77828a() || (k940Var = this.f207979b) == null) {
            return;
        }
        k940Var.mo26033j(drawable);
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public final void mo26038o(Drawable drawable) {
        if (m77828a()) {
            try {
                k940 k940Var = this.f207979b;
                if (k940Var != null) {
                    k940Var.mo26038o(drawable);
                }
            } finally {
                m77830c();
            }
        }
    }
}
