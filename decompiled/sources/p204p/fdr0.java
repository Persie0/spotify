package p204p;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fdr0 {

    /* JADX INFO: renamed from: a */
    public Size f68546a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f68547b;

    /* JADX INFO: renamed from: c */
    public final wcr0 f68548c;

    /* JADX INFO: renamed from: d */
    public boolean f68549d = false;

    public fdr0(FrameLayout frameLayout, wcr0 wcr0Var) {
        this.f68547b = frameLayout;
        this.f68548c = wcr0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract View mo29051a();

    /* JADX INFO: renamed from: b */
    public abstract Bitmap mo29052b();

    /* JADX INFO: renamed from: c */
    public abstract void mo29053c();

    /* JADX INFO: renamed from: d */
    public abstract void mo29054d();

    /* JADX INFO: renamed from: e */
    public abstract void mo29055e(s861 s861Var, jt4 jt4Var);

    /* JADX INFO: renamed from: f */
    public final void m41377f() {
        View viewMo29051a = mo29051a();
        if (viewMo29051a == null || !this.f68549d) {
            return;
        }
        FrameLayout frameLayout = this.f68547b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        wcr0 wcr0Var = this.f68548c;
        wcr0Var.getClass();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            vie1.m85617F("PreviewTransform");
            return;
        }
        if (wcr0Var.m87757f()) {
            if (viewMo29051a instanceof TextureView) {
                ((TextureView) viewMo29051a).setTransform(wcr0Var.m87755d());
            } else {
                Display display = viewMo29051a.getDisplay();
                boolean z = false;
                boolean z2 = (!wcr0Var.f250094g || display == null || display.getRotation() == wcr0Var.f250092e) ? false : true;
                boolean z3 = wcr0Var.f250094g;
                if (!z3) {
                    if ((!z3 ? wcr0Var.f250090c : -tg1.m80726p(wcr0Var.f250092e)) != 0) {
                        z = true;
                    }
                }
                if (z2 || z) {
                    vie1.m85626h("PreviewTransform");
                }
            }
            RectF rectFM87756e = wcr0Var.m87756e(size, layoutDirection);
            viewMo29051a.setPivotX(0.0f);
            viewMo29051a.setPivotY(0.0f);
            viewMo29051a.setScaleX(rectFM87756e.width() / wcr0Var.f250088a.getWidth());
            viewMo29051a.setScaleY(rectFM87756e.height() / wcr0Var.f250088a.getHeight());
            viewMo29051a.setTranslationX(rectFM87756e.left - viewMo29051a.getLeft());
            viewMo29051a.setTranslationY(rectFM87756e.top - viewMo29051a.getTop());
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract u790 mo29056g();
}
