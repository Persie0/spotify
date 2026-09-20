package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: classes7.dex */
public final class jmh extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113865a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f113866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f113867c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f113868d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ uum0 f113869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmh(float f, float f2, long j, uum0 uum0Var) {
        super(1);
        this.f113867c = f;
        this.f113868d = f2;
        this.f113866b = j;
        this.f113869e = uum0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f113865a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float f = this.f113867c;
                float f2 = this.f113868d;
                if ((f + f2) - this.f113869e.m84031v() > 0.0f) {
                    DrawScope.m277h0(drawScope, this.f113866b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-f2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f2 + 1.0f)) & 4294967295L), 0.0f, null, null, 120);
                }
                break;
            default:
                float fLongValue = ((((Number) obj).longValue() - this.f113866b) / 1000000.0f) + this.f113867c;
                float f3 = this.f113868d;
                if (fLongValue > f3) {
                    fLongValue = f3;
                }
                this.f113869e.m84032w(n0e1.m63436m(fLongValue / f3, 0.0f, 1.0f));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmh(long j, float f, float f2, uum0 uum0Var) {
        super(1);
        this.f113866b = j;
        this.f113867c = f;
        this.f113868d = f2;
        this.f113869e = uum0Var;
    }
}
