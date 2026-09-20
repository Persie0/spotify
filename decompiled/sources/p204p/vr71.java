package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class vr71 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f244096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f244097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f244098c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f244099d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ybs f244100e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f244101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr71(long j, float f, boolean z, float f2, ybs ybsVar, float f3) {
        super(1);
        this.f244096a = j;
        this.f244097b = f;
        this.f244098c = z;
        this.f244099d = f2;
        this.f244100e = ybsVar;
        this.f244101f = f3;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        float fMo35989Z0;
        float fMo35989Z1;
        DrawScope drawScope = (DrawScope) obj;
        int iOrdinal = drawScope.getLayoutDirection().ordinal();
        if (iOrdinal == 0) {
            fMo35989Z0 = -drawScope.mo35989Z0(wr71.f254288a);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            fMo35989Z0 = drawScope.mo35989Z0(wr71.f254288a) + Float.intBitsToFloat((int) (drawScope.mo295n() >> 32));
        }
        float f = fMo35989Z0;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) * 0.5f;
        DrawScope.m275e0(drawScope, this.f244096a, drawScope.mo35989Z0(this.f244097b) / 2, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), 0.0f, null, 120);
        if (this.f244098c) {
            float fMo35989Z2 = drawScope.mo35989Z0(this.f244099d) + fIntBitsToFloat;
            ybs ybsVar = this.f244100e;
            if (ybsVar != null) {
                fMo35989Z1 = drawScope.mo35989Z0(ybsVar.f271238a) + Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L));
            } else {
                fMo35989Z1 = drawScope.mo35989Z0(this.f244101f) + fMo35989Z2;
            }
            drawScope.mo296o1(tm4.m81086D(h6f.m46715L(new n6f(n6f.f150870j), new n6f(n6f.m63765b(n6f.f150866f, 0.5f, 0.0f, 0.0f, 0.0f, 14))), fMo35989Z2, fMo35989Z1, 8), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fMo35989Z2)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo35989Z1)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), drawScope.mo35989Z0(1), (496 & 64) != 0 ? 1.0f : 0.0f);
        }
        return w2a1.f247311a;
    }
}
