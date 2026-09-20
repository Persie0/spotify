package p204p;

import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public final class xoa extends mqm0 {

    /* JADX INFO: renamed from: f */
    public final xk80 f263806f;

    /* JADX INFO: renamed from: g */
    public float f263807g = 1.0f;

    /* JADX INFO: renamed from: h */
    public ColorFilter f263808h;

    public xoa(xk80 xk80Var) {
        this.f263806f = xk80Var;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: a */
    public final boolean mo25034a(float f) {
        this.f263807g = f;
        return true;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: c */
    public final boolean mo25035c(ColorFilter colorFilter) {
        this.f263808h = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xoa) {
            return this.f263806f.equals(((xoa) obj).f263806f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f263806f.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    @Override // p204p.mqm0
    /* JADX INFO: renamed from: i */
    public final long mo25036i() {
        float fAbs;
        xk80 xk80Var = this.f263806f;
        long j = xk80Var.f262306g;
        long j2 = xk80Var.f262305f;
        int i = (int) (j2 >> 32);
        float fAbs2 = Float.NaN;
        if (Math.abs(Float.intBitsToFloat(i)) <= Float.MAX_VALUE) {
            int i2 = (int) (j >> 32);
            if (Math.abs(Float.intBitsToFloat(i2)) <= Float.MAX_VALUE) {
                fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
            } else {
                fAbs = Float.NaN;
            }
        } else {
            fAbs = Float.NaN;
        }
        int i3 = (int) (j2 & 4294967295L);
        if (Math.abs(Float.intBitsToFloat(i3)) <= Float.MAX_VALUE) {
            int i4 = (int) (j & 4294967295L);
            if (Math.abs(Float.intBitsToFloat(i4)) <= Float.MAX_VALUE) {
                fAbs2 = Math.abs(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4));
            }
        }
        return (((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & 4294967295L);
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: j */
    public final void mo25037j(DrawScope drawScope) {
        DrawScope.m273U0(drawScope, this.f263806f, 0L, 0L, this.f263807g, null, this.f263808h, 0, 86);
    }

    public final String toString() {
        return "BrushPainter(brush=" + this.f263806f + ')';
    }
}
