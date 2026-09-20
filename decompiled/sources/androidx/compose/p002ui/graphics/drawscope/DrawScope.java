package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import p204p.c06;
import p204p.em51;
import p204p.gh00;
import p204p.ko70;
import p204p.q94;
import p204p.qxy;
import p204p.rx10;
import p204p.szp;
import p204p.vbn0;
import p204p.vgg1;
import p204p.vk4;
import p204p.yqq;

/* JADX INFO: loaded from: classes.dex */
public interface DrawScope extends yqq {
    /* JADX INFO: renamed from: A */
    static /* synthetic */ void m269A(DrawScope drawScope, long j, float f, float f2, long j2, long j3, em51 em51Var, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        drawScope.mo292g0(j, f, f2, j4, (i & 32) != 0 ? m272T0(drawScope.mo295n(), j4) : j3, em51Var);
    }

    /* JADX INFO: renamed from: G0 */
    static void m271G0(DrawScope drawScope, q94 q94Var, long j, long j2, long j3, float f, ColorFilter colorFilter, int i, int i2) {
        long height;
        if ((i2 & 4) != 0) {
            height = (((long) q94Var.f186483a.getHeight()) & 4294967295L) | (((long) q94Var.f186483a.getWidth()) << 32);
        } else {
            height = j;
        }
        drawScope.mo288L0(q94Var, 0L, height, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? height : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : colorFilter, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: T0 */
    static long m272T0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: U0 */
    static /* synthetic */ void m273U0(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        drawScope.mo283C0(brush, j3, (i2 & 4) != 0 ? m272T0(drawScope.mo295n(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? qxy.f193763a : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: Y */
    static /* synthetic */ void m274Y(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        drawScope.mo286J(j, j5, (i & 4) != 0 ? m272T0(drawScope.mo295n(), j5) : j3, j4, (i & 16) != 0 ? qxy.f193763a : drawStyle, (i & 32) != 0 ? 1.0f : f, (i & 128) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: e0 */
    static /* synthetic */ void m275e0(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            f = Size.m264e(drawScope.mo295n()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = drawScope.mo294i1();
        }
        drawScope.mo299w0(j, f3, j2, (i & 8) != 0 ? 1.0f : f2, (i & 16) != 0 ? qxy.f193763a : drawStyle, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: f0 */
    static /* synthetic */ void m276f0(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = m272T0(drawScope.mo295n(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            drawStyle = qxy.f193763a;
        }
        drawScope.mo297p0(brush, j, j2, j3, f, drawStyle, (i & 128) != 0 ? 3 : 24);
    }

    /* JADX INFO: renamed from: h0 */
    static /* synthetic */ void m277h0(DrawScope drawScope, long j, long j2, long j3, float f, em51 em51Var, ColorFilter colorFilter, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        drawScope.mo284F0(j, j4, (i & 4) != 0 ? m272T0(drawScope.mo295n(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? qxy.f193763a : em51Var, (i & 32) != 0 ? null : colorFilter, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: k1 */
    static /* synthetic */ void m278k1(DrawScope drawScope, vbn0 vbn0Var, Brush brush, float f, DrawStyle drawStyle, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            drawStyle = qxy.f193763a;
        }
        drawScope.mo298q0(vbn0Var, brush, f2, drawStyle, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ void m279q(DrawScope drawScope, q94 q94Var, long j, float f, ColorFilter colorFilter, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        drawScope.mo285H(q94Var, j2, f2, colorFilter, i);
    }

    /* JADX INFO: renamed from: t */
    static /* synthetic */ void m281t(DrawScope drawScope, Brush brush, float f, long j, float f2, em51 em51Var, int i) {
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        float f3 = f2;
        DrawStyle drawStyle = em51Var;
        if ((i & 16) != 0) {
            drawStyle = qxy.f193763a;
        }
        drawScope.mo289Q(brush, f, j, f3, drawStyle);
    }

    /* JADX INFO: renamed from: x0 */
    static /* synthetic */ void m282x0(DrawScope drawScope, vbn0 vbn0Var, long j, DrawStyle drawStyle, int i) {
        if ((i & 8) != 0) {
            drawStyle = qxy.f193763a;
        }
        drawScope.mo287K0(vbn0Var, j, drawStyle, 3);
    }

    /* JADX INFO: renamed from: C0 */
    void mo283C0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: F0 */
    void mo284F0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: H */
    void mo285H(q94 q94Var, long j, float f, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: J */
    void mo286J(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i);

    /* JADX INFO: renamed from: K0 */
    void mo287K0(vbn0 vbn0Var, long j, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: L0 */
    void mo288L0(q94 q94Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i);

    /* JADX INFO: renamed from: Q */
    void mo289Q(Brush brush, float f, long j, float f2, DrawStyle drawStyle);

    /* JADX INFO: renamed from: Z */
    default void mo290Z(long j, gh00 gh00Var, rx10 rx10Var) {
        rx10Var.m76597f(this, getLayoutDirection(), j, new szp(24, (Object) this, gh00Var));
    }

    /* JADX INFO: renamed from: d1 */
    c06 mo291d1();

    /* JADX INFO: renamed from: g0 */
    void mo292g0(long j, float f, float f2, long j2, long j3, em51 em51Var);

    /* JADX INFO: renamed from: g1 */
    void mo293g1(long j, long j2, long j3, float f, int i, vk4 vk4Var);

    ko70 getLayoutDirection();

    /* JADX INFO: renamed from: i1 */
    default long mo294i1() {
        return vgg1.m85480u(mo291d1().m31085B());
    }

    /* JADX INFO: renamed from: n */
    default long mo295n() {
        return mo291d1().m31085B();
    }

    /* JADX INFO: renamed from: o1 */
    void mo296o1(Brush brush, long j, long j2, float f, float f2);

    /* JADX INFO: renamed from: p0 */
    void mo297p0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: q0 */
    void mo298q0(vbn0 vbn0Var, Brush brush, float f, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: w0 */
    void mo299w0(long j, float f, long j2, float f2, DrawStyle drawStyle, int i);
}
