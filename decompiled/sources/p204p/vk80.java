package p204p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public final class vk80 extends tgs {

    /* JADX INFO: renamed from: c */
    public float f242166c;

    /* JADX INFO: renamed from: d */
    public float f242167d;

    /* JADX INFO: renamed from: e */
    public float f242168e;

    public vk80(gl80 gl80Var) {
        super(gl80Var);
        this.f242166c = 300.0f;
    }

    @Override // p204p.tgs
    /* JADX INFO: renamed from: a */
    public final void mo80775a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f242166c = clipBounds.width();
        gl80 gl80Var = (gl80) this.f220243a;
        float f2 = gl80Var.f107385a;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - gl80Var.f107385a) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (gl80Var.f81021i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f220244b.m38878d() && gl80Var.f107389e == 1) || (this.f220244b.m38877c() && gl80Var.f107390f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f220244b.m38878d() || this.f220244b.m38877c()) {
            canvas.translate(0.0f, ((f - 1.0f) * gl80Var.f107385a) / 2.0f);
        }
        float f3 = this.f242166c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        this.f242167d = gl80Var.f107385a * f;
        this.f242168e = gl80Var.f107386b * f;
    }

    @Override // p204p.tgs
    /* JADX INFO: renamed from: b */
    public final void mo80776b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f242166c;
        float f4 = (-f3) / 2.0f;
        float f5 = this.f242168e * 2.0f;
        float f6 = f3 - f5;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f7 = this.f242167d;
        RectF rectF = new RectF((f * f6) + f4, (-f7) / 2.0f, (f6 * f2) + f4 + f5, f7 / 2.0f);
        float f8 = this.f242168e;
        canvas.drawRoundRect(rectF, f8, f8, paint);
    }

    @Override // p204p.tgs
    /* JADX INFO: renamed from: c */
    public final void mo80777c(Canvas canvas, Paint paint) {
        int iM86385l = vtg1.m86385l(((gl80) this.f220243a).f107388d, this.f220244b.f59398t);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iM86385l);
        float f = this.f242166c;
        float f2 = this.f242167d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f242168e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // p204p.tgs
    /* JADX INFO: renamed from: d */
    public final int mo80778d() {
        return ((gl80) this.f220243a).f107385a;
    }

    @Override // p204p.tgs
    /* JADX INFO: renamed from: e */
    public final int mo80779e() {
        return -1;
    }
}
