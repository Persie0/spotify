package p204p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class egs extends Drawable implements Animatable {

    /* JADX INFO: renamed from: X */
    public static final tjc f59388X = new tjc(7, Float.class, "growFraction");

    /* JADX INFO: renamed from: a */
    public final Context f59389a;

    /* JADX INFO: renamed from: b */
    public final j09 f59390b;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f59392d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f59393e;

    /* JADX INFO: renamed from: f */
    public ArrayList f59394f;

    /* JADX INFO: renamed from: g */
    public boolean f59395g;

    /* JADX INFO: renamed from: h */
    public float f59396h;

    /* JADX INFO: renamed from: t */
    public int f59398t;

    /* JADX INFO: renamed from: i */
    public final Paint f59397i = new Paint();

    /* JADX INFO: renamed from: c */
    public b15 f59391c = new b15();

    public egs(Context context, j09 j09Var) {
        this.f59389a = context;
        this.f59390b = j09Var;
        setAlpha(255);
    }

    /* JADX INFO: renamed from: b */
    public final float m38876b() {
        j09 j09Var = this.f59390b;
        if (j09Var.f107389e == 0 && j09Var.f107390f == 0) {
            return 1.0f;
        }
        return this.f59396h;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38877c() {
        ObjectAnimator objectAnimator = this.f59393e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m38878d() {
        ObjectAnimator objectAnimator = this.f59392d;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m38879e(boolean z, boolean z2, boolean z3) {
        b15 b15Var = this.f59391c;
        ContentResolver contentResolver = this.f59389a.getContentResolver();
        b15Var.getClass();
        return mo38880f(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo38880f(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.f59392d;
        int i = 0;
        tjc tjcVar = f59388X;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, tjcVar, 0.0f, 1.0f);
            this.f59392d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f59392d.setInterpolator(r05.f194384b);
            ObjectAnimator objectAnimator2 = this.f59392d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f59392d = objectAnimator2;
            objectAnimator2.addListener(new dgs(this, i));
        }
        int i2 = 1;
        if (this.f59393e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, tjcVar, 1.0f, 0.0f);
            this.f59393e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f59393e.setInterpolator(r05.f194384b);
            ObjectAnimator objectAnimator3 = this.f59393e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f59393e = objectAnimator3;
            objectAnimator3.addListener(new dgs(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.f59392d : this.f59393e;
            if (!z3) {
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z4 = this.f59395g;
                    this.f59395g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f59395g = z4;
                }
                return super.setVisible(z, false);
            }
            if (!z3 || !objectAnimator4.isRunning()) {
                boolean z5 = !z || super.setVisible(z, false);
                j09 j09Var = this.f59390b;
                if (!z ? j09Var.f107390f != 0 : j09Var.f107389e != 0) {
                    boolean z6 = this.f59395g;
                    this.f59395g = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f59395g = z6;
                    return z5;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z5;
                }
                objectAnimator4.resume();
                return z5;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m38881g(h09 h09Var) {
        ArrayList arrayList = this.f59394f;
        if (arrayList == null || !arrayList.contains(h09Var)) {
            return;
        }
        this.f59394f.remove(h09Var);
        if (this.f59394f.isEmpty()) {
            this.f59394f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f59398t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m38878d() || m38877c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f59398t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59397i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return m38879e(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        mo38880f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        mo38880f(false, true, false);
    }
}
