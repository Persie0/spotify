package p204p;

import android.util.Property;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c4b1 implements k591 {

    /* JADX INFO: renamed from: a */
    public final float f33914a;

    /* JADX INFO: renamed from: b */
    public final float f33915b;

    /* JADX INFO: renamed from: d */
    public final float f33917d;

    /* JADX INFO: renamed from: f */
    public List f33919f = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public PathInterpolator f33918e = null;

    /* JADX INFO: renamed from: c */
    public final float f33916c = 1.0f;

    public c4b1(float f, float f2, float f3) {
        this.f33914a = f;
        this.f33915b = f2;
        this.f33917d = f3;
    }

    @Override // p204p.k591
    /* JADX INFO: renamed from: a */
    public final float mo31432a(float f) {
        float f2 = this.f33914a;
        float f3 = this.f33915b;
        float fM72108r = f2 < f3 ? q3d0.m72108r(f2, f3, f) : q3d0.m72108r(f3, f2, f);
        float f4 = f3 - f2;
        if (f4 == 0.0f) {
            f4 = 1.0f / f3;
        }
        float f5 = (fM72108r - f2) / f4;
        float f6 = this.f33916c;
        float f7 = this.f33917d;
        float f8 = (f5 * f7) + ((1.0f - f5) * f6);
        PathInterpolator pathInterpolator = this.f33918e;
        if (pathInterpolator != null) {
            float f9 = f7 - f6;
            if (f9 == 0.0f) {
                f9 = 1.0f / f7;
            }
            float f10 = (f8 - f6) / f9;
            float interpolation = (pathInterpolator.getInterpolation((f10 * 1.0f) + ((1.0f - f10) * 0.0f)) - 0.0f) / 1.0f;
            f8 = (f7 * interpolation) + ((1.0f - interpolation) * f6);
        }
        if (!this.f33919f.isEmpty()) {
            for (bv61 bv61Var : this.f33919f) {
                Iterator it = bv61Var.f31298b.iterator();
                while (it.hasNext()) {
                    ((Property) it.next()).set(bv61Var.f31297a, Float.valueOf(f8));
                }
            }
        }
        return f8;
    }
}
