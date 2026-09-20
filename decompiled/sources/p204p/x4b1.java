package p204p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class x4b1 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f258046a;

    /* JADX INFO: renamed from: b */
    public w4b1 f258047b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f258048c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f258049d;

    /* JADX INFO: renamed from: e */
    public boolean f258050e;

    /* JADX INFO: renamed from: f */
    public Bitmap f258051f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f258052g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f258053h;

    /* JADX INFO: renamed from: i */
    public int f258054i;

    /* JADX INFO: renamed from: j */
    public boolean f258055j;

    /* JADX INFO: renamed from: k */
    public boolean f258056k;

    /* JADX INFO: renamed from: l */
    public Paint f258057l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f258046a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new z4b1(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new z4b1(this);
    }
}
