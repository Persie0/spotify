package p204p;

import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class wfs extends mqm0 implements e9w0 {

    /* JADX INFO: renamed from: f */
    public final Drawable f250884f;

    /* JADX INFO: renamed from: g */
    public final yum0 f250885g = sam.m77645B(0);

    /* JADX INFO: renamed from: h */
    public final yum0 f250886h;

    /* JADX INFO: renamed from: i */
    public final wg61 f250887i;

    public wfs(Drawable drawable) {
        long jFloatToRawIntBits;
        this.f250884f = drawable;
        Object obj = xfs.f261091a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            jFloatToRawIntBits = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(drawable.getIntrinsicHeight())) & 4294967295L) | (Float.floatToRawIntBits(intrinsicWidth) << 32);
        }
        this.f250886h = sam.m77645B(new Size(jFloatToRawIntBits));
        this.f250887i = new wg61(new edq(this, 24));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: a */
    public final boolean mo25034a(float f) {
        this.f250884f.setAlpha(n0e1.m63437n(q3d0.m72083N(f * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        Drawable.Callback callback = (Drawable.Callback) this.f250887i.getValue();
        Drawable drawable = this.f250884f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: c */
    public final boolean mo25035c(ColorFilter colorFilter) {
        this.f250884f.setColorFilter(colorFilter != null ? colorFilter.f495a : null);
        return true;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
        mo32127g();
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: e */
    public final void mo62580e(ko70 ko70Var) {
        int i;
        int iOrdinal = ko70Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        this.f250884f.setLayoutDirection(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
        Drawable drawable = this.f250884f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: i */
    public final long mo25036i() {
        return ((Size) this.f250886h.getValue()).f494a;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: j */
    public final void mo25037j(DrawScope drawScope) {
        wqb wqbVarM31107v = drawScope.mo291d1().m31107v();
        ((Number) this.f250885g.getValue()).intValue();
        int iM72083N = q3d0.m72083N(Size.m265f(drawScope.mo295n()));
        int iM72083N2 = q3d0.m72083N(Size.m263d(drawScope.mo295n()));
        Drawable drawable = this.f250884f;
        drawable.setBounds(0, 0, iM72083N, iM72083N2);
        try {
            wqbVarM31107v.mo25287p();
            Canvas canvas = ly3.f137948a;
            drawable.draw(((ky3) wqbVarM31107v).f127640a);
        } finally {
            wqbVarM31107v.mo25279h();
        }
    }
}
