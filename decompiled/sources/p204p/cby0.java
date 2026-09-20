package p204p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class cby0 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable f36267a;

    /* JADX INFO: renamed from: b */
    public final float f36268b;

    /* JADX INFO: renamed from: c */
    public int f36269c;

    public cby0(Drawable drawable, float f) {
        this.f36267a = drawable;
        this.f36268b = f;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f36269c;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new s10(this.f36267a, this.f36268b);
    }
}
