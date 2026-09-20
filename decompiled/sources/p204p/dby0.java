package p204p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public final class dby0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable f47384a;

    /* JADX INFO: renamed from: b */
    public final float f47385b;

    /* JADX INFO: renamed from: c */
    public final int f47386c;

    /* JADX INFO: renamed from: d */
    public int f47387d;

    public dby0(float f, int i, Drawable drawable) {
        this.f47384a = drawable;
        this.f47385b = f;
        this.f47386c = i;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f47387d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new s10(this.f47384a, this.f47385b, this.f47386c, 2);
    }
}
