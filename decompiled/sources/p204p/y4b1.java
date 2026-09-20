package p204p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class y4b1 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f269116a;

    public y4b1(Drawable.ConstantState constantState) {
        this.f269116a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f269116a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f269116a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        z4b1 z4b1Var = new z4b1();
        z4b1Var.f185136a = (VectorDrawable) this.f269116a.newDrawable();
        return z4b1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        z4b1 z4b1Var = new z4b1();
        z4b1Var.f185136a = (VectorDrawable) this.f269116a.newDrawable(resources);
        return z4b1Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        z4b1 z4b1Var = new z4b1();
        z4b1Var.f185136a = (VectorDrawable) this.f269116a.newDrawable(resources, theme);
        return z4b1Var;
    }
}
