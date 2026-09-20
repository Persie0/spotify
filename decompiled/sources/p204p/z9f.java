package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class z9f {

    /* JADX INFO: renamed from: a */
    public final tiv0 f280761a;

    /* JADX INFO: renamed from: b */
    public final int f280762b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f280763c;

    /* JADX INFO: renamed from: d */
    public final y9f f280764d;

    /* JADX INFO: renamed from: e */
    public final float f280765e;

    /* JADX INFO: renamed from: f */
    public final int f280766f;

    /* JADX INFO: renamed from: g */
    public final float f280767g;

    /* JADX INFO: renamed from: h */
    public final float f280768h;

    /* JADX INFO: renamed from: i */
    public final float f280769i;

    /* JADX INFO: renamed from: j */
    public final float f280770j;

    /* JADX INFO: renamed from: k */
    public final tiv0 f280771k;

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    public z9f(tiv0 tiv0Var, int i, int i2, float f, long j) {
        this.f280761a = tiv0Var;
        this.f280762b = i;
        this.f280764d = new y9f(i2, i);
        this.f280765e = f / mo70.f145604a;
        this.f280766f = i2 % 2 == 0 ? (-(i2 / 2)) + 1 : -(i2 / 2);
        this.f280767g = Float.MAX_VALUE;
        this.f280768h = Float.MIN_VALUE;
        this.f280769i = Float.MAX_VALUE;
        this.f280770j = Float.MIN_VALUE;
        if (i2 < 0) {
            throw new IllegalArgumentException("rowCount must be > 0");
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("distanceBetweenHexCenters must be > 0");
        }
        this.f280763c = new ArrayList();
        if (i > 0) {
            for (int i3 = 0; i3 < i; i3++) {
                ?? r5 = this.f280764d.f270584a;
                if (i3 < 0 || i3 >= r5.size()) {
                    throw new IllegalArgumentException(edb.m38563l("index must be in range [0, ", r5.size(), ")").toString());
                }
                xq20 xq20Var = (xq20) r5.get(i3);
                float f2 = this.f280765e;
                int i4 = this.f280766f;
                int i5 = xq20Var.f264853b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ms2.m62680e(mo70.f145604a, xq20Var.f264852a, (i5 - i4) % 2 == 1 ? mo70.f145604a / 2.0f : 0.0f, f2))) << 32) | (((long) Float.floatToRawIntBits(i5 * 1.5f * f2)) & 4294967295L);
                int i6 = (int) (jFloatToRawIntBits >> 32);
                int i7 = (int) (j >> 32);
                float f3 = 2;
                float fIntBitsToFloat = Float.intBitsToFloat(i6) - (Float.intBitsToFloat(i7) / f3);
                int i8 = (int) (jFloatToRawIntBits & 4294967295L);
                int i9 = (int) (j & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i8) - (Float.intBitsToFloat(i9) / f3);
                float fIntBitsToFloat3 = (Float.intBitsToFloat(i7) / f3) + Float.intBitsToFloat(i6);
                float fIntBitsToFloat4 = (Float.intBitsToFloat(i9) / f3) + Float.intBitsToFloat(i8);
                tiv0 tiv0Var2 = new tiv0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4);
                this.f280767g = Math.min(this.f280767g, fIntBitsToFloat);
                this.f280768h = Math.max(this.f280768h, fIntBitsToFloat3);
                this.f280769i = Math.min(this.f280769i, fIntBitsToFloat2);
                this.f280770j = Math.max(this.f280770j, fIntBitsToFloat4);
                this.f280763c.add(tiv0Var2);
            }
        } else {
            this.f280767g = 0.0f;
            this.f280768h = 0.0f;
            this.f280769i = 0.0f;
            this.f280770j = 0.0f;
        }
        float f4 = this.f280767g;
        float f5 = this.f280769i;
        float f6 = this.f280768h;
        float f7 = this.f280770j;
        tiv0 tiv0Var3 = this.f280761a;
        this.f280771k = new tiv0(f4 - tiv0Var3.f220751a, f5 - tiv0Var3.f220752b, f6 + tiv0Var3.f220753c, f7 + tiv0Var3.f220754d);
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m95650a(tiv0 tiv0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = this.f280763c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tiv0 tiv0Var2 = (tiv0) arrayList.get(i);
            if (tiv0Var.m80939k(tiv0Var2)) {
                linkedHashMap.put(Integer.valueOf(i), tiv0Var2);
            }
        }
        return linkedHashMap;
    }
}
