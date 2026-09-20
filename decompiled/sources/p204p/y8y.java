package p204p;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes6.dex */
public final class y8y extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public Context f270410a;

    /* JADX INFO: renamed from: b */
    public String f270411b;

    /* JADX INFO: renamed from: c */
    public int f270412c;

    /* JADX INFO: renamed from: d */
    public int f270413d;

    /* JADX INFO: renamed from: e */
    public int f270414e;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f270414e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new z8y(this.f270410a, this.f270411b, this.f270412c, this.f270413d);
    }
}
