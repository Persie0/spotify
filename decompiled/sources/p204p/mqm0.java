package p204p;

import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes.dex */
public abstract class mqm0 {

    /* JADX INFO: renamed from: a */
    public lk4 f146313a;

    /* JADX INFO: renamed from: b */
    public boolean f146314b;

    /* JADX INFO: renamed from: c */
    public ColorFilter f146315c;

    /* JADX INFO: renamed from: d */
    public float f146316d = 1.0f;

    /* JADX INFO: renamed from: e */
    public ko70 f146317e = ko70.f124556a;

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m62579h(mqm0 mqm0Var, DrawScope drawScope, long j, float f, jm9 jm9Var, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            jm9Var = null;
        }
        mqm0Var.m62581f(drawScope, j, f2, jm9Var);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo25034a(float f) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo25035c(ColorFilter colorFilter) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m62581f(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        if (this.f146316d != f) {
            if (!mo25034a(f)) {
                if (f == 1.0f) {
                    lk4 lk4Var = this.f146313a;
                    if (lk4Var != null) {
                        lk4Var.m59206a(f);
                    }
                    this.f146314b = false;
                } else {
                    lk4 lk4VarM77438l = this.f146313a;
                    if (lk4VarM77438l == null) {
                        lk4VarM77438l = s800.m77438l();
                        this.f146313a = lk4VarM77438l;
                    }
                    lk4VarM77438l.m59206a(f);
                    this.f146314b = true;
                }
            }
            this.f146316d = f;
        }
        if (!wj50.m88271j(this.f146315c, colorFilter)) {
            if (!mo25035c(colorFilter)) {
                if (colorFilter == null) {
                    lk4 lk4Var2 = this.f146313a;
                    if (lk4Var2 != null) {
                        lk4Var2.m59209d(null);
                    }
                    this.f146314b = false;
                } else {
                    lk4 lk4VarM77438l2 = this.f146313a;
                    if (lk4VarM77438l2 == null) {
                        lk4VarM77438l2 = s800.m77438l();
                        this.f146313a = lk4VarM77438l2;
                    }
                    lk4VarM77438l2.m59209d(colorFilter);
                    this.f146314b = true;
                }
            }
            this.f146315c = colorFilter;
        }
        ko70 layoutDirection = drawScope.getLayoutDirection();
        if (this.f146317e != layoutDirection) {
            mo62580e(layoutDirection);
            this.f146317e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) - Float.intBitsToFloat(i2);
        drawScope.mo291d1().m31086C().m56028k(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.f146314b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        tiv0 tiv0VarM71836j = q0f1.m71836j(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        wqb wqbVarM31107v = drawScope.mo291d1().m31107v();
                        lk4 lk4VarM77438l3 = this.f146313a;
                        if (lk4VarM77438l3 == null) {
                            lk4VarM77438l3 = s800.m77438l();
                            this.f146313a = lk4VarM77438l3;
                        }
                        try {
                            wqbVarM31107v.mo25280i(tiv0VarM71836j, lk4VarM77438l3);
                            mo25037j(drawScope);
                            wqbVarM31107v.mo25279h();
                        } catch (Throwable th) {
                            wqbVarM31107v.mo25279h();
                            throw th;
                        }
                    } else {
                        mo25037j(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.mo291d1().m31086C().m56028k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.mo291d1().m31086C().m56028k(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: i */
    public abstract long mo25036i();

    /* JADX INFO: renamed from: j */
    public abstract void mo25037j(DrawScope drawScope);

    /* JADX INFO: renamed from: e */
    public void mo62580e(ko70 ko70Var) {
    }
}
