package p204p;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mlc1 {

    /* JADX INFO: renamed from: a */
    public hkf1 f144811a;

    /* JADX INFO: renamed from: b */
    public int[] f144812b = new int[10];

    /* JADX INFO: renamed from: c */
    public float[] f144813c = new float[10];

    /* JADX INFO: renamed from: d */
    public int f144814d;

    /* JADX INFO: renamed from: e */
    public String f144815e;

    /* JADX INFO: renamed from: a */
    public final float m62203a(float f) {
        return (float) this.f144811a.mo25150q(f);
    }

    /* JADX INFO: renamed from: b */
    public void mo53671b(float f, int i) {
        int[] iArr = this.f144812b;
        if (iArr.length < this.f144814d + 1) {
            this.f144812b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f144813c;
            this.f144813c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f144812b;
        int i2 = this.f144814d;
        iArr2[i2] = i;
        this.f144813c[i2] = f;
        this.f144814d = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo51010c(View view, float f);

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX INFO: renamed from: d */
    public void mo53672d(int i) {
        int i2 = this.f144814d;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.f144812b;
        float[] fArr = this.f144813c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            int i6 = i3 - 2;
            int i7 = iArr2[i6];
            if (i5 < i7) {
                int i8 = iArr[i7];
                int i9 = i5;
                int i10 = i9;
                while (i9 < i7) {
                    int i11 = iArr[i9];
                    if (i11 <= i8) {
                        int i12 = iArr[i10];
                        iArr[i10] = i11;
                        iArr[i9] = i12;
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i13 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i13;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
                iArr2[i6] = i10 - 1;
                iArr2[i4] = i5;
                int i14 = i3 + 1;
                iArr2[i3] = i7;
                i3 += 2;
                iArr2[i14] = i10 + 1;
            } else {
                i3 = i6;
            }
        }
        int i15 = 1;
        for (int i16 = 1; i16 < this.f144814d; i16++) {
            int[] iArr3 = this.f144812b;
            if (iArr3[i16 - 1] != iArr3[i16]) {
                i15++;
            }
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i15, 1);
        int i17 = 0;
        for (int i18 = 0; i18 < this.f144814d; i18++) {
            if (i18 > 0) {
                int[] iArr4 = this.f144812b;
                if (iArr4[i18] != iArr4[i18 - 1]) {
                    dArr[i17] = ((double) this.f144812b[i18]) * 0.01d;
                    dArr2[i17][0] = this.f144813c[i18];
                    i17++;
                }
            } else {
                dArr[i17] = ((double) this.f144812b[i18]) * 0.01d;
                dArr2[i17][0] = this.f144813c[i18];
                i17++;
            }
        }
        this.f144811a = hkf1.m47806n(i, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f144815e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f144814d; i++) {
            StringBuilder sbM75191i = rbz.m75191i(string, "[");
            sbM75191i.append(this.f144812b[i]);
            sbM75191i.append(" , ");
            sbM75191i.append(decimalFormat.format(this.f144813c[i]));
            sbM75191i.append("] ");
            string = sbM75191i.toString();
        }
        return string;
    }
}
