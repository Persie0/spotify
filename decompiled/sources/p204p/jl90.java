package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class jl90 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f113557b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f113558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl90(ArrayList arrayList, ArrayList arrayList2, int i) {
        super(1);
        this.f113556a = i;
        this.f113557b = arrayList;
        this.f113558c = arrayList2;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f113556a) {
            case 0:
                cqx cqxVar = (cqx) obj;
                ArrayList arrayList = this.f113557b;
                cqxVar.m33647b(luh.class, arrayList, false);
                cqxVar.m33647b(pfa0.class, arrayList, false);
                ArrayList arrayList2 = this.f113558c;
                cqxVar.m33647b(v140.class, arrayList2, false);
                cqxVar.m33647b(erc1.class, arrayList2, false);
                break;
            default:
                DrawScope drawScope = (DrawScope) obj;
                char c = ' ';
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) * 0.03f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope.mo295n() >> 32)) - (12 * fIntBitsToFloat)) / 13;
                float f = 0.45f * fIntBitsToFloat2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                int i = 0;
                while (i < 13) {
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) * ((Number) this.f113557b.get(i)).floatValue();
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo295n() & 4294967295L)) - fIntBitsToFloat3;
                    char c2 = c;
                    drawScope = drawScope;
                    DrawScope.m274Y(drawScope, ((n6f) this.f113558c.get(i)).f150873a, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L) | (Float.floatToRawIntBits((fIntBitsToFloat2 + fIntBitsToFloat) * i) << c2), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << c2), jFloatToRawIntBits, null, 0.0f, 240);
                    i++;
                    c = c2;
                }
                break;
        }
        return w2a1.f247311a;
    }
}
