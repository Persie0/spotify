package p204p;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zjc1 {

    /* JADX INFO: renamed from: a */
    public kc5 f283416a;

    /* JADX INFO: renamed from: b */
    public String f283417b;

    /* JADX INFO: renamed from: c */
    public int f283418c = 0;

    /* JADX INFO: renamed from: d */
    public String f283419d = null;

    /* JADX INFO: renamed from: e */
    public int f283420e = 0;

    /* JADX INFO: renamed from: f */
    public final ArrayList f283421f = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static zjc1 m96233b(String str) {
        if (str.startsWith("CUSTOM")) {
            wjc1 wjc1Var = new wjc1();
            wjc1Var.f251940g = new float[1];
            return wjc1Var;
        }
        switch (str) {
            case "rotationX":
                return new vjc1(3);
            case "rotationY":
                return new vjc1(4);
            case "translationX":
                return new vjc1(7);
            case "translationY":
                return new vjc1(8);
            case "translationZ":
                return new vjc1(9);
            case "progress":
                yjc1 yjc1Var = new yjc1();
                yjc1Var.f273343g = false;
                return yjc1Var;
            case "scaleX":
                return new vjc1(5);
            case "scaleY":
                return new vjc1(6);
            case "waveVariesBy":
                return new vjc1(0);
            case "rotation":
                return new vjc1(2);
            case "elevation":
                return new vjc1(1);
            case "transitionPathRotate":
                return new xjc1();
            case "alpha":
                return new vjc1(0);
            case "waveOffset":
                return new vjc1(0);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final float m96234a(float f) {
        double dSignum;
        double dAbs;
        kc5 kc5Var = this.f283416a;
        hkf1 hkf1Var = (hkf1) kc5Var.f121372h;
        if (hkf1Var != null) {
            hkf1Var.mo25151r(f, (double[]) kc5Var.f121373i);
        } else {
            double[] dArr = (double[]) kc5Var.f121373i;
            dArr[0] = ((float[]) kc5Var.f121370f)[0];
            dArr[1] = ((float[]) kc5Var.f121371g)[0];
            dArr[2] = ((float[]) kc5Var.f121367c)[0];
        }
        double[] dArr2 = (double[]) kc5Var.f121373i;
        double d = dArr2[0];
        double d2 = dArr2[1];
        hr81 hr81Var = (hr81) kc5Var.f121366b;
        double d3 = f;
        hr81Var.getClass();
        double d4 = 0.0d;
        if (d3 < 0.0d) {
            d3 = 0.0d;
        } else if (d3 > 1.0d) {
            d3 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) hr81Var.f94377d, d3);
        if (iBinarySearch > 0) {
            d4 = 1.0d;
        } else if (iBinarySearch != 0) {
            int i = -iBinarySearch;
            int i2 = i - 1;
            float[] fArr = (float[]) hr81Var.f94376c;
            float f2 = fArr[i2];
            int i3 = i - 2;
            float f3 = fArr[i3];
            double d5 = f2 - f3;
            double[] dArr3 = (double[]) hr81Var.f94377d;
            double d6 = dArr3[i2];
            double d7 = dArr3[i3];
            double d8 = d5 / (d6 - d7);
            d4 = ((((d3 * d3) - (d7 * d7)) * d8) / 2.0d) + ((d3 - d7) * (((double) f3) - (d8 * d7))) + ((double[]) hr81Var.f94378e)[i3];
        }
        double d9 = d4 + d2;
        switch (hr81Var.f94375b) {
            case 1:
                dSignum = Math.signum(0.5d - (d9 % 1.0d));
                break;
            case 2:
                dAbs = Math.abs((((d9 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                dSignum = 1.0d - dAbs;
                break;
            case 3:
                dSignum = (((d9 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                dSignum = 1.0d - (((d9 * 2.0d) + 1.0d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d2 + d9) * 6.283185307179586d);
                break;
            case 6:
                double dAbs2 = 1.0d - Math.abs(((d9 * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                dSignum = 1.0d - dAbs;
                break;
            case 7:
                dSignum = ((byh0) hr81Var.f94379f).mo25150q(d9 % 1.0d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d9);
                break;
        }
        return (float) ((dSignum * ((double[]) kc5Var.f121373i)[2]) + d);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo85750d(View view, float f);

    /* JADX INFO: renamed from: e */
    public final void m96235e() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<au60> arrayList = this.f283421f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new kxy(12));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.f283418c;
        String str = this.f283419d;
        kc5 kc5Var = new kc5();
        hr81 hr81Var = new hr81(13, (byte) 0);
        hr81Var.f94376c = new float[0];
        hr81Var.f94377d = new double[0];
        kc5Var.f121366b = hr81Var;
        hr81Var.f94375b = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double d4 = d2;
                double d5 = ((double) i6) * d4;
                dArr5[i7] = d5;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d5 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d4;
                    dArr5[i9] = (d5 - 1.0d) - d4;
                }
                i6++;
                d2 = d4;
            }
            hr81Var.f94379f = new byh0(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        kc5Var.f121367c = new float[size];
        kc5Var.f121368d = new double[size];
        kc5Var.f121369e = new float[size];
        kc5Var.f121370f = new float[size];
        kc5Var.f121371g = new float[size];
        float[] fArr = new float[size];
        this.f283416a = kc5Var;
        int i10 = i2;
        for (au60 au60Var : arrayList) {
            float f = au60Var.f19873d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i10];
            float f2 = au60Var.f19871b;
            dArr6[i2] = f2;
            float f3 = au60Var.f19872c;
            dArr6[i] = f3;
            float f4 = au60Var.f19874e;
            dArr6[r4] = f4;
            kc5 kc5Var2 = this.f283416a;
            ((double[]) kc5Var2.f121368d)[i10] = ((double) au60Var.f19870a) / 100.0d;
            ((float[]) kc5Var2.f121369e)[i10] = f;
            ((float[]) kc5Var2.f121370f)[i10] = f3;
            ((float[]) kc5Var2.f121371g)[i10] = f4;
            ((float[]) kc5Var2.f121367c)[i10] = f2;
            i10++;
        }
        kc5 kc5Var3 = this.f283416a;
        float[] fArr2 = (float[]) kc5Var3.f121369e;
        hr81 hr81Var2 = (hr81) kc5Var3.f121366b;
        double[] dArr7 = (double[]) kc5Var3.f121368d;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) kc5Var3.f121367c;
        kc5Var3.f121373i = new double[fArr3.length + 2];
        double[] dArr9 = new double[fArr3.length + 2];
        double d6 = 0.0d;
        if (dArr7[i2] > 0.0d) {
            hr81Var2.m48332h(0.0d, fArr2[i2]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            hr81Var2.m48332h(d, fArr2[length4]);
        }
        for (int i11 = i2; i11 < dArr8.length; i11++) {
            double[] dArr10 = dArr8[i11];
            dArr10[i2] = ((float[]) kc5Var3.f121370f)[i11];
            dArr10[i] = ((float[]) kc5Var3.f121371g)[i11];
            dArr10[2] = fArr3[i11];
            hr81Var2.m48332h(dArr7[i11], fArr2[i11]);
        }
        double d7 = 0.0d;
        int i12 = i2;
        while (true) {
            float[] fArr4 = (float[]) hr81Var2.f94376c;
            if (i12 >= fArr4.length) {
                break;
            }
            d7 += (double) fArr4[i12];
            i12++;
        }
        double d8 = 0.0d;
        int i13 = i;
        while (true) {
            float[] fArr5 = (float[]) hr81Var2.f94376c;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f5 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double d9 = d6;
            double[] dArr11 = (double[]) hr81Var2.f94377d;
            d8 = ((dArr11[i13] - dArr11[i14]) * ((double) f5)) + d8;
            i13++;
            d6 = d9;
        }
        double d10 = d6;
        int i15 = i2;
        while (true) {
            float[] fArr6 = (float[]) hr81Var2.f94376c;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = fArr6[i15] * ((float) (d7 / d8));
            i15++;
        }
        ((double[]) hr81Var2.f94378e)[i2] = d10;
        int i16 = i;
        while (true) {
            float[] fArr7 = (float[]) hr81Var2.f94376c;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f6 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr12 = (double[]) hr81Var2.f94377d;
            double d11 = dArr12[i16] - dArr12[i17];
            double[] dArr13 = (double[]) hr81Var2.f94378e;
            dArr13[i16] = (d11 * ((double) f6)) + dArr13[i17];
            i16++;
        }
        if (dArr7.length > i) {
            i3 = i2;
            kc5Var3.f121372h = hkf1.m47806n(i3, dArr7, dArr8);
        } else {
            i3 = i2;
            kc5Var3.f121372h = null;
        }
        hkf1.m47806n(i3, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f283417b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (au60 au60Var : this.f283421f) {
            StringBuilder sbM75191i = rbz.m75191i(string, "[");
            sbM75191i.append(au60Var.f19870a);
            sbM75191i.append(" , ");
            sbM75191i.append(decimalFormat.format(au60Var.f19871b));
            sbM75191i.append("] ");
            string = sbM75191i.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public void mo88289c(d6j d6jVar) {
    }
}
