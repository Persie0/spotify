package p204p;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gas0 {

    /* JADX INFO: renamed from: a */
    public static final double f78092a = Math.log(2.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f78093b = 0;

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX INFO: renamed from: a */
    public static ArrayList m44182a(l2n0 l2n0Var) {
        char c;
        ArrayList arrayList;
        boolean z;
        Object eas0Var;
        l2n0 l2n0Var2 = l2n0Var;
        ArrayList arrayList2 = null;
        if (l2n0Var2.m57917E() == 0) {
            char c2 = 7;
            l2n0Var2.m57931S(7);
            int iM57945q = l2n0Var2.m57945q();
            boolean z2 = true;
            if (iM57945q == 1684433976) {
                l2n0 l2n0Var3 = new l2n0();
                Inflater inflater = new Inflater(true);
                try {
                    if (!h0b1.m46287O(l2n0Var2, l2n0Var3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    l2n0Var2 = l2n0Var3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM57945q == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i = l2n0Var2.f129055b;
            int i2 = l2n0Var2.f129056c;
            while (i < i2) {
                int iM57945q2 = l2n0Var2.m57945q() + i;
                if (iM57945q2 > i && iM57945q2 <= i2) {
                    if (l2n0Var2.m57945q() == 1835365224) {
                        int iM57945q3 = l2n0Var2.m57945q();
                        if (iM57945q3 <= 0 || iM57945q3 > 10000) {
                            c = c2;
                            arrayList = arrayList2;
                            z = z2;
                            eas0Var = arrayList;
                            break;
                        }
                        float[] fArr = new float[iM57945q3];
                        for (int i3 = 0; i3 < iM57945q3; i3++) {
                            fArr[i3] = Float.intBitsToFloat(l2n0Var2.m57945q());
                        }
                        int iM57945q4 = l2n0Var2.m57945q();
                        if (iM57945q4 > 0 && iM57945q4 <= 32000) {
                            double dLog = Math.log(((double) iM57945q3) * 2.0d);
                            double d = f78092a;
                            int iCeil = (int) Math.ceil(dLog / d);
                            c = c2;
                            byte[] bArr = l2n0Var2.f129054a;
                            arrayList = arrayList2;
                            ohc ohcVar = new ohc(bArr, bArr.length);
                            ohcVar.m66960m(l2n0Var2.f129055b * 8);
                            float[] fArr2 = new float[iM57945q4 * 5];
                            z = z2;
                            int i4 = 5;
                            int[] iArr = new int[5];
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                if (i5 >= iM57945q4) {
                                    ohcVar.m66960m((ohcVar.m66952e() + 7) & (-8));
                                    int i7 = 32;
                                    int iM66954g = ohcVar.m66954g(32);
                                    if (iM66954g <= 0) {
                                        break;
                                    }
                                    w780[] w780VarArr = new w780[iM66954g];
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 >= iM66954g) {
                                            eas0Var = new eas0(w780VarArr);
                                            break;
                                        }
                                        int iM66954g2 = ohcVar.m66954g(8);
                                        int iM66954g3 = ohcVar.m66954g(8);
                                        int iM66954g4 = ohcVar.m66954g(i7);
                                        if (iM66954g4 > 0 && iM66954g4 <= 128000) {
                                            float[] fArr3 = fArr2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iM57945q4) * 2.0d) / d);
                                            float[] fArr4 = new float[iM66954g4 * 3];
                                            float[] fArr5 = new float[iM66954g4 * 2];
                                            int i9 = iM66954g;
                                            int i10 = 0;
                                            int i11 = 0;
                                            while (true) {
                                                if (i10 < iM66954g4) {
                                                    int iM66954g5 = ohcVar.m66954g(iCeil2);
                                                    int i12 = iCeil2;
                                                    int i13 = ((iM66954g5 >> 1) ^ (-(iM66954g5 & 1))) + i11;
                                                    if (i13 >= 0 && i13 < iM57945q4) {
                                                        int i14 = i10 * 3;
                                                        int i15 = i13 * 5;
                                                        fArr4[i14] = fArr3[i15];
                                                        fArr4[i14 + 1] = fArr3[i15 + 1];
                                                        fArr4[i14 + 2] = fArr3[i15 + 2];
                                                        int i16 = i10 * 2;
                                                        fArr5[i16] = fArr3[i15 + 3];
                                                        fArr5[i16 + 1] = fArr3[i15 + 4];
                                                        i10++;
                                                        i11 = i13;
                                                        iCeil2 = i12;
                                                    }
                                                } else {
                                                    w780VarArr[i8] = new w780(iM66954g2, iM66954g3, fArr4, fArr5);
                                                    i8++;
                                                    fArr2 = fArr3;
                                                    iM66954g = i9;
                                                    i7 = 32;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < i4) {
                                            int i18 = iArr[i17];
                                            int iM66954g6 = ohcVar.m66954g(iCeil);
                                            int i19 = ((iM66954g6 >> 1) ^ (-(iM66954g6 & 1))) + i18;
                                            if (i19 < iM57945q3 && i19 >= 0) {
                                                fArr2[i6] = fArr[i19];
                                                iArr[i17] = i19;
                                                i17++;
                                                i6++;
                                                i4 = 5;
                                            }
                                        } else {
                                            i5++;
                                            i4 = 5;
                                        }
                                    }
                                }
                            }
                        } else {
                            c = c2;
                            arrayList = arrayList2;
                            z = z2;
                        }
                        eas0Var = arrayList;
                        break;
                        if (eas0Var == null) {
                            return arrayList;
                        }
                        arrayList3.add(eas0Var);
                    } else {
                        c = c2;
                        arrayList = arrayList2;
                        z = z2;
                    }
                    l2n0Var2.m57930R(iM57945q2);
                    i = iM57945q2;
                    c2 = c;
                    arrayList2 = arrayList;
                    z2 = z;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }
}
