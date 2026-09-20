package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iyr implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f107049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f107050c;

    public /* synthetic */ iyr(float f, long j, int i) {
        this.f107048a = i;
        this.f107049b = f;
        this.f107050c = j;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f107048a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float f = this.f107049b;
                float fMo35989Z0 = drawScope.mo35989Z0(f);
                float f2 = 2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(drawScope.mo35989Z0(f) / f2)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo295n() >> 32));
                drawScope.mo293g1(this.f107050c, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(drawScope.mo35989Z0(f) / f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), (496 & 8) != 0 ? 0.0f : fMo35989Z0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                break;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                float f3 = this.f107049b;
                float fMo35989Z1 = drawScope2.mo35989Z0(f3);
                float f4 = 2;
                drawScope2.mo293g1(this.f107050c, (((long) Float.floatToRawIntBits(drawScope2.mo35989Z0(f3) / f4)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(drawScope2.mo35989Z0(f3) / f4)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo295n() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : fMo35989Z1, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                break;
        }
        return w2a1.f247311a;
    }
}
