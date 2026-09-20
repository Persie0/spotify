package p204p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class x55 {

    /* JADX INFO: renamed from: a */
    public final w55 f258295a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f258296b = null;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f258297c = null;

    /* JADX INFO: renamed from: d */
    public boolean f258298d = false;

    /* JADX INFO: renamed from: e */
    public boolean f258299e = false;

    /* JADX INFO: renamed from: f */
    public boolean f258300f;

    public x55(w55 w55Var) {
        this.f258295a = w55Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m89963a() {
        w55 w55Var = this.f258295a;
        Drawable checkMarkDrawable = w55Var.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f258298d || this.f258299e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f258298d) {
                    drawableMutate.setTintList(this.f258296b);
                }
                if (this.f258299e) {
                    drawableMutate.setTintMode(this.f258297c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(w55Var.getDrawableState());
                }
                w55Var.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
