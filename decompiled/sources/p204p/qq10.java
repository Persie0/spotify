package p204p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class qq10 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public sq10 f191423a;

    /* JADX INFO: renamed from: b */
    public int f191424b;

    /* JADX INFO: renamed from: c */
    public int f191425c;

    /* JADX INFO: renamed from: d */
    public boolean f191426d;

    /* JADX INFO: renamed from: e */
    public int f191427e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f191427e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new tq10(this.f191423a, this.f191424b, this.f191425c, this.f191426d);
    }
}
