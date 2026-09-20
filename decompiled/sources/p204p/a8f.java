package p204p;

import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes.dex */
public final class a8f extends mqm0 {

    /* JADX INFO: renamed from: f */
    public final long f13273f;

    /* JADX INFO: renamed from: g */
    public float f13274g = 1.0f;

    /* JADX INFO: renamed from: h */
    public ColorFilter f13275h;

    public a8f(long j) {
        this.f13273f = j;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: a */
    public final boolean mo25034a(float f) {
        this.f13274g = f;
        return true;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: c */
    public final boolean mo25035c(ColorFilter colorFilter) {
        this.f13275h = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8f)) {
            return false;
        }
        long j = ((a8f) obj).f13273f;
        int i = n6f.f150872l;
        return as91.m27074b(this.f13273f, j);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        return as91.m27075c(this.f13273f);
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: i */
    public final long mo25036i() {
        return 9205357640488583168L;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: j */
    public final void mo25037j(DrawScope drawScope) {
        DrawScope.m277h0(drawScope, this.f13273f, 0L, 0L, this.f13274g, null, this.f13275h, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) n6f.m63771h(this.f13273f)) + ')';
    }
}
