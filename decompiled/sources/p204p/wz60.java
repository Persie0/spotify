package p204p;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class wz60 {

    /* JADX INFO: renamed from: a */
    public final u8b0 f256492a;

    /* JADX INFO: renamed from: b */
    public final Object f256493b;

    /* JADX INFO: renamed from: c */
    public Object f256494c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f256495d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f256496e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f256497f;

    /* JADX INFO: renamed from: g */
    public final float f256498g;

    /* JADX INFO: renamed from: h */
    public Float f256499h;

    /* JADX INFO: renamed from: i */
    public float f256500i;

    /* JADX INFO: renamed from: j */
    public float f256501j;

    /* JADX INFO: renamed from: k */
    public int f256502k;

    /* JADX INFO: renamed from: l */
    public int f256503l;

    /* JADX INFO: renamed from: m */
    public float f256504m;

    /* JADX INFO: renamed from: n */
    public float f256505n;

    /* JADX INFO: renamed from: o */
    public PointF f256506o;

    /* JADX INFO: renamed from: p */
    public PointF f256507p;

    public wz60(u8b0 u8b0Var, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f2) {
        this.f256500i = -3987645.8f;
        this.f256501j = -3987645.8f;
        this.f256502k = 784923401;
        this.f256503l = 784923401;
        this.f256504m = Float.MIN_VALUE;
        this.f256505n = Float.MIN_VALUE;
        this.f256506o = null;
        this.f256507p = null;
        this.f256492a = u8b0Var;
        this.f256493b = obj;
        this.f256494c = obj2;
        this.f256495d = baseInterpolator;
        this.f256496e = null;
        this.f256497f = null;
        this.f256498g = f;
        this.f256499h = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float m89398a() {
        u8b0 u8b0Var = this.f256492a;
        if (u8b0Var == null) {
            return 1.0f;
        }
        if (this.f256505n == Float.MIN_VALUE) {
            if (this.f256499h == null) {
                this.f256505n = 1.0f;
            } else {
                this.f256505n = ((this.f256499h.floatValue() - this.f256498g) / (u8b0Var.f227894m - u8b0Var.f227893l)) + m89399b();
            }
        }
        return this.f256505n;
    }

    /* JADX INFO: renamed from: b */
    public final float m89399b() {
        u8b0 u8b0Var = this.f256492a;
        if (u8b0Var == null) {
            return 0.0f;
        }
        if (this.f256504m == Float.MIN_VALUE) {
            float f = u8b0Var.f227893l;
            this.f256504m = (this.f256498g - f) / (u8b0Var.f227894m - f);
        }
        return this.f256504m;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89400c() {
        return this.f256495d == null && this.f256496e == null && this.f256497f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f256493b + ", endValue=" + this.f256494c + ", startFrame=" + this.f256498g + ", endFrame=" + this.f256499h + ", interpolator=" + this.f256495d + '}';
    }

    public wz60(u8b0 u8b0Var, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.f256500i = -3987645.8f;
        this.f256501j = -3987645.8f;
        this.f256502k = 784923401;
        this.f256503l = 784923401;
        this.f256504m = Float.MIN_VALUE;
        this.f256505n = Float.MIN_VALUE;
        this.f256506o = null;
        this.f256507p = null;
        this.f256492a = u8b0Var;
        this.f256493b = obj;
        this.f256494c = obj2;
        this.f256495d = null;
        this.f256496e = baseInterpolator;
        this.f256497f = baseInterpolator2;
        this.f256498g = f;
        this.f256499h = null;
    }

    public wz60(u8b0 u8b0Var, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f256500i = -3987645.8f;
        this.f256501j = -3987645.8f;
        this.f256502k = 784923401;
        this.f256503l = 784923401;
        this.f256504m = Float.MIN_VALUE;
        this.f256505n = Float.MIN_VALUE;
        this.f256506o = null;
        this.f256507p = null;
        this.f256492a = u8b0Var;
        this.f256493b = obj;
        this.f256494c = obj2;
        this.f256495d = interpolator;
        this.f256496e = interpolator2;
        this.f256497f = interpolator3;
        this.f256498g = f;
        this.f256499h = f2;
    }

    public wz60(Object obj) {
        this.f256500i = -3987645.8f;
        this.f256501j = -3987645.8f;
        this.f256502k = 784923401;
        this.f256503l = 784923401;
        this.f256504m = Float.MIN_VALUE;
        this.f256505n = Float.MIN_VALUE;
        this.f256506o = null;
        this.f256507p = null;
        this.f256492a = null;
        this.f256493b = obj;
        this.f256494c = obj;
        this.f256495d = null;
        this.f256496e = null;
        this.f256497f = null;
        this.f256498g = Float.MIN_VALUE;
        this.f256499h = Float.valueOf(Float.MAX_VALUE);
    }

    public wz60(lq10 lq10Var, lq10 lq10Var2) {
        this.f256500i = -3987645.8f;
        this.f256501j = -3987645.8f;
        this.f256502k = 784923401;
        this.f256503l = 784923401;
        this.f256504m = Float.MIN_VALUE;
        this.f256505n = Float.MIN_VALUE;
        this.f256506o = null;
        this.f256507p = null;
        this.f256492a = null;
        this.f256493b = lq10Var;
        this.f256494c = lq10Var2;
        this.f256495d = null;
        this.f256496e = null;
        this.f256497f = null;
        this.f256498g = Float.MIN_VALUE;
        this.f256499h = Float.valueOf(Float.MAX_VALUE);
    }
}
