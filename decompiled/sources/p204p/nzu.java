package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class nzu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f160166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f160167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ozu f160168c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f160169d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ete f160170e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f160171f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f160172g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ jzu f160173h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List f160174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzu(float f, int i, ozu ozuVar, float f2, ete eteVar, long j, long j2, jzu jzuVar, List list) {
        super(1);
        this.f160166a = f;
        this.f160167b = i;
        this.f160168c = ozuVar;
        this.f160169d = f2;
        this.f160170e = eteVar;
        this.f160171f = j;
        this.f160172g = j2;
        this.f160173h = jzuVar;
        this.f160174i = list;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        long jFloatToRawIntBits;
        DrawScope drawScope = (DrawScope) obj;
        float fMo35989Z0 = drawScope.mo35989Z0(this.f160166a);
        int iM38547C = edb.m38547C(this.f160167b);
        if (iM38547C == 0) {
            float f = fMo35989Z0 / 2;
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        } else {
            if (iM38547C != 1) {
                throw new NoWhenBranchMatchedException();
            }
            jFloatToRawIntBits = 0;
        }
        long j = jFloatToRawIntBits;
        float f2 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) - fMo35989Z0) / f2;
        float fIntBitsToFloat2 = (f2 * 0.0f) + Float.intBitsToFloat((int) (drawScope.mo295n() >> 32));
        ete eteVar = this.f160170e;
        float f3 = eteVar.f62692b;
        float f4 = eteVar.f62691a;
        float f5 = f3 - f4;
        float fM63436m = f5 > 0.0f ? n0e1.m63436m((this.f160169d - f4) / f5, 0.0f, 1.0f) : 0.0f;
        float f6 = eteVar.f62692b - f4;
        float fM63436m2 = f6 > 0.0f ? n0e1.m63436m((0.0f - f4) / f6, 0.0f, 1.0f) : 0.0f;
        DrawScope.m274Y(drawScope, this.f160171f, (((long) Float.floatToRawIntBits(-0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L), j, null, 0.0f, 240);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * fM63436m;
        if (fM63436m > 0.0f) {
            DrawScope.m274Y(drawScope, this.f160172g, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(-0.0f)) << 32), (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - (-0.0f))) << 32), j, null, 0.0f, 240);
        }
        float fMax = fM63436m2 > fM63436m ? Math.max((Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * fM63436m2) - fIntBitsToFloat3, 0.0f) : 0.0f;
        jzu jzuVar = this.f160173h;
        if (fMax > 0.0f) {
            drawScope = drawScope;
            DrawScope.m274Y(drawScope, jzuVar.f117798g, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32), j, null, 0.0f, 240);
        }
        Iterator it = this.f160174i.iterator();
        while (it.hasNext()) {
            DrawScope.m277h0(drawScope, jzuVar.f117799h, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * ((Number) it.next()).floatValue())) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(drawScope.mo35989Z0(this.f160168c.f172368c))) << 32) | (((long) Float.floatToRawIntBits(fMo35989Z0)) & 4294967295L), 0.0f, null, null, 120);
        }
        return w2a1.f247311a;
    }
}
