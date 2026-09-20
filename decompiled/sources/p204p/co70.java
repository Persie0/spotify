package p204p;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes3.dex */
public final class co70 extends Picture {

    /* JADX INFO: renamed from: a */
    public final rx10 f40197a;

    public co70(rx10 rx10Var) {
        this.f40197a = rx10Var;
    }

    @Override // android.graphics.Picture
    public final Canvas beginRecording(int i, int i2) {
        return new Canvas();
    }

    @Override // android.graphics.Picture
    public final void draw(Canvas canvas) {
        Canvas canvas2 = ly3.f137948a;
        ky3 ky3Var = new ky3();
        ky3Var.f127640a = canvas;
        this.f40197a.m76594c(ky3Var, null);
    }

    @Override // android.graphics.Picture
    public final int getHeight() {
        return (int) (this.f40197a.f203459u & 4294967295L);
    }

    @Override // android.graphics.Picture
    public final int getWidth() {
        return (int) (this.f40197a.f203459u >> 32);
    }

    @Override // android.graphics.Picture
    public final boolean requiresHardwareAcceleration() {
        return true;
    }

    @Override // android.graphics.Picture
    public final void endRecording() {
    }
}
