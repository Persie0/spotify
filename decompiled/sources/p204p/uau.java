package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes6.dex */
public final class uau extends mqm0 {

    /* JADX INFO: renamed from: f */
    public final pk31 f228549f;

    /* JADX INFO: renamed from: g */
    public final long f228550g;

    public uau(pk31 pk31Var, long j) {
        this.f228549f = pk31Var;
        this.f228550g = j;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: i */
    public final long mo25036i() {
        return this.f228550g;
    }

    @Override // p204p.mqm0
    /* JADX INFO: renamed from: j */
    public final void mo25037j(DrawScope drawScope) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo294i1() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo294i1() & 4294967295L));
        DrawScope.m281t(drawScope, this.f228549f, 350.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, 120);
    }
}
