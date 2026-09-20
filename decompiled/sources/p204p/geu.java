package p204p;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class geu {

    /* JADX INFO: renamed from: a */
    public int f79194a;

    /* JADX INFO: renamed from: b */
    public int f79195b;

    /* JADX INFO: renamed from: c */
    public int f79196c;

    /* JADX INFO: renamed from: d */
    public final Serializable f79197d;

    /* JADX INFO: renamed from: e */
    public Object f79198e;

    /* JADX INFO: renamed from: f */
    public final Serializable f79199f;

    /* JADX INFO: renamed from: g */
    public Object f79200g;

    public geu(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.f79197d = sb.toString();
        this.f79198e = nf61.f153257a;
        this.f79199f = new StringBuilder(str.length());
        this.f79195b = -1;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x011f  */
    /* JADX INFO: renamed from: a */
    public vqm0 m44523a() {
        int i;
        ArrayList arrayList;
        int i2;
        int iMax;
        int i3;
        int i4;
        int i5;
        c7f c7fVar;
        int i6;
        ArrayList arrayList2 = (ArrayList) this.f79200g;
        Bitmap bitmap = (Bitmap) this.f79198e;
        int i7 = 0;
        if (bitmap != null) {
            double dSqrt = -1.0d;
            if (this.f79195b > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                int i8 = this.f79195b;
                if (height > i8) {
                    dSqrt = Math.sqrt(((double) i8) / ((double) height));
                }
            } else if (this.f79196c > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i3 = this.f79196c)) {
                dSqrt = ((double) i3) / ((double) iMax);
            }
            Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
            int width = bitmapCreateScaledBitmap.getWidth();
            int height2 = bitmapCreateScaledBitmap.getHeight();
            int[] iArr = new int[width * height2];
            bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            int i9 = this.f79194a;
            z1b1[] z1b1VarArr = arrayList2.isEmpty() ? null : (z1b1[]) arrayList2.toArray(new z1b1[arrayList2.size()]);
            cxe cxeVar = new cxe();
            cxeVar.f43015e = new float[3];
            cxeVar.f43014d = z1b1VarArr;
            int[] iArr2 = new int[32768];
            cxeVar.f43012b = iArr2;
            int i10 = 0;
            while (true) {
                i4 = 8;
                i5 = 1;
                if (i10 >= iArr.length) {
                    break;
                }
                int i11 = iArr[i10];
                int iM34263A = (cxe.m34263A(Color.red(i11), 8, 5) << 10) | (cxe.m34263A(Color.green(i11), 8, 5) << 5) | cxe.m34263A(Color.blue(i11), 8, 5);
                iArr[i10] = iM34263A;
                iArr2[iM34263A] = iArr2[iM34263A] + 1;
                i10++;
                i7 = i7;
            }
            i = i7;
            int i12 = 0;
            int i13 = 0;
            while (i12 < 32768) {
                if (iArr2[i12] > 0) {
                    int iRgb = Color.rgb(cxe.m34263A((i12 >> 10) & 31, 5, i4), cxe.m34263A((i12 >> 5) & 31, 5, i4), cxe.m34263A(i12 & 31, 5, i4));
                    float[] fArr = (float[]) cxeVar.f43015e;
                    m9f.m61220h(iRgb, fArr);
                    z1b1[] z1b1VarArr2 = (z1b1[]) cxeVar.f43014d;
                    if (z1b1VarArr2 != null) {
                        i6 = i5;
                        if (z1b1VarArr2.length > 0) {
                            for (z1b1 z1b1Var : z1b1VarArr2) {
                                if (!z1b1Var.m95103a(iRgb, fArr)) {
                                    iArr2[i12] = 0;
                                    break;
                                }
                            }
                        }
                    } else {
                        i6 = i5;
                    }
                } else {
                    i6 = i5;
                }
                if (iArr2[i12] > 0) {
                    i13++;
                }
                i12++;
                i5 = i6;
                i4 = 8;
            }
            int i14 = i5;
            int[] iArr3 = new int[i13];
            cxeVar.f43011a = iArr3;
            int i15 = 0;
            for (int i16 = 0; i16 < 32768; i16++) {
                if (iArr2[i16] > 0) {
                    iArr3[i15] = i16;
                    i15++;
                }
            }
            if (i13 <= i9) {
                cxeVar.f43013c = new ArrayList();
                for (int i17 = 0; i17 < i13; i17++) {
                    int i18 = iArr3[i17];
                    ((ArrayList) cxeVar.f43013c).add(new uqm0(Color.rgb(cxe.m34263A((i18 >> 10) & 31, 5, 8), cxe.m34263A((i18 >> 5) & 31, 5, 8), cxe.m34263A(i18 & 31, 5, 8)), iArr2[i18]));
                }
            } else {
                PriorityQueue<c7f> priorityQueue = new PriorityQueue(i9, cxe.f43010h);
                int i19 = 0;
                priorityQueue.offer(new c7f(cxeVar, 0, ((int[]) cxeVar.f43011a).length - 1));
                while (priorityQueue.size() < i9 && (c7fVar = (c7f) priorityQueue.poll()) != null) {
                    int i20 = c7fVar.f34868b;
                    int iMin = c7fVar.f34867a;
                    int i21 = i14;
                    if ((i20 + 1) - iMin <= i21) {
                        break;
                    }
                    cxe cxeVar2 = c7fVar.f34876j;
                    if ((i20 + 1) - iMin <= i21) {
                        throw new IllegalStateException("Can not split a box with only 1 color");
                    }
                    int i22 = c7fVar.f34871e - c7fVar.f34870d;
                    int i23 = c7fVar.f34873g - c7fVar.f34872f;
                    int i24 = c7fVar.f34875i - c7fVar.f34874h;
                    int i25 = (i22 < i23 || i22 < i24) ? (i23 < i22 || i23 < i24) ? -1 : -2 : -3;
                    int[] iArr4 = (int[]) cxeVar2.f43011a;
                    int[] iArr5 = (int[]) cxeVar2.f43012b;
                    cxe.m34267z(i25, iMin, i20, iArr4);
                    i14 = 1;
                    Arrays.sort(iArr4, iMin, c7fVar.f34868b + 1);
                    cxe.m34267z(i25, iMin, c7fVar.f34868b, iArr4);
                    int i26 = c7fVar.f34869c / 2;
                    int i27 = i19;
                    int i28 = iMin;
                    while (true) {
                        int i29 = c7fVar.f34868b;
                        if (i28 > i29) {
                            break;
                        }
                        i27 += iArr5[iArr4[i28]];
                        if (i27 >= i26) {
                            iMin = Math.min(i29 - 1, i28);
                            break;
                        }
                        i28++;
                    }
                    c7f c7fVar2 = new c7f(cxeVar2, iMin + 1, c7fVar.f34868b);
                    c7fVar.f34868b = iMin;
                    c7fVar.m31705a();
                    priorityQueue.offer(c7fVar2);
                    priorityQueue.offer(c7fVar);
                    i19 = 0;
                }
                ArrayList arrayList3 = new ArrayList(priorityQueue.size());
                for (c7f c7fVar3 : priorityQueue) {
                    cxe cxeVar3 = c7fVar3.f34876j;
                    int[] iArr6 = (int[]) cxeVar3.f43011a;
                    int[] iArr7 = (int[]) cxeVar3.f43012b;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    for (int i34 = c7fVar3.f34867a; i34 <= c7fVar3.f34868b; i34++) {
                        int i35 = iArr6[i34];
                        int i36 = iArr7[i35];
                        i31 += i36;
                        i30 = (((i35 >> 10) & 31) * i36) + i30;
                        i32 = (((i35 >> 5) & 31) * i36) + i32;
                        i33 = (i36 * (i35 & 31)) + i33;
                    }
                    float f = i31;
                    uqm0 uqm0Var = new uqm0(Color.rgb(cxe.m34263A(Math.round(i30 / f), 5, 8), cxe.m34263A(Math.round(i32 / f), 5, 8), cxe.m34263A(Math.round(i33 / f), 5, 8)), i31);
                    float[] fArrM83807b = uqm0Var.m83807b();
                    z1b1[] z1b1VarArr3 = (z1b1[]) cxeVar.f43014d;
                    if (z1b1VarArr3 != null && z1b1VarArr3.length > 0) {
                        int length = z1b1VarArr3.length;
                        int i37 = 0;
                        while (true) {
                            if (i37 < length) {
                                if (!z1b1VarArr3[i37].m95103a(uqm0Var.f233081d, fArrM83807b)) {
                                    break;
                                }
                                i37++;
                            }
                        }
                    }
                    arrayList3.add(uqm0Var);
                }
                cxeVar.f43013c = arrayList3;
            }
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmapCreateScaledBitmap.recycle();
            }
            arrayList = (ArrayList) cxeVar.f43013c;
        } else {
            i = 0;
            arrayList = (ArrayList) this.f79197d;
            if (arrayList == null) {
                throw new AssertionError();
            }
        }
        ArrayList arrayList4 = (ArrayList) this.f79199f;
        vqm0 vqm0Var = new vqm0(arrayList4, arrayList);
        int size = arrayList4.size();
        int i38 = i;
        while (true) {
            SparseBooleanArray sparseBooleanArray = vqm0Var.f243966d;
            if (i38 >= size) {
                sparseBooleanArray.clear();
                return vqm0Var;
            }
            ku61 ku61Var = (ku61) arrayList4.get(i38);
            float[] fArr2 = ku61Var.f126474c;
            float[] fArr3 = ku61Var.f126472a;
            int length2 = fArr2.length;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i39 = i; i39 < length2; i39++) {
                float f4 = fArr2[i39];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length3 = fArr2.length;
                for (int i40 = i; i40 < length3; i40++) {
                    float f5 = fArr2[i40];
                    if (f5 > 0.0f) {
                        fArr2[i40] = f5 / f3;
                    }
                }
            }
            List list = vqm0Var.f243963a;
            int size2 = list.size();
            float f6 = 0.0f;
            int i41 = i;
            uqm0 uqm0Var2 = null;
            while (i41 < size2) {
                uqm0 uqm0Var3 = (uqm0) list.get(i41);
                float[] fArrM83807b2 = uqm0Var3.m83807b();
                float f7 = fArrM83807b2[1];
                float f8 = f2;
                float[] fArr4 = ku61Var.f126473b;
                if (f7 < fArr3[i] || f7 > fArr3[2]) {
                    i2 = size;
                } else {
                    float f9 = fArrM83807b2[2];
                    if (f9 < fArr4[i] || f9 > fArr4[2] || sparseBooleanArray.get(uqm0Var3.f233081d)) {
                        i2 = size;
                    } else {
                        float[] fArrM83807b3 = uqm0Var3.m83807b();
                        uqm0 uqm0Var4 = vqm0Var.f243967e;
                        int i42 = uqm0Var4 != null ? uqm0Var4.f233082e : 1;
                        i2 = size;
                        float[] fArr5 = ku61Var.f126474c;
                        float f10 = fArr5[i];
                        float fAbs = f10 > f8 ? (1.0f - Math.abs(fArrM83807b3[1] - fArr3[1])) * f10 : f8;
                        float f11 = fArr5[1];
                        float fAbs2 = f11 > f8 ? (1.0f - Math.abs(fArrM83807b3[2] - fArr4[1])) * f11 : f8;
                        float f12 = fArr5[2];
                        float f13 = fAbs + fAbs2 + (f12 > f8 ? (uqm0Var3.f233082e / i42) * f12 : f8);
                        if (uqm0Var2 == null || f13 > f6) {
                            uqm0Var2 = uqm0Var3;
                            f6 = f13;
                        }
                    }
                }
                i41++;
                size = i2;
                f2 = f8;
            }
            int i43 = size;
            if (uqm0Var2 != null) {
                sparseBooleanArray.append(uqm0Var2.f233081d, true);
            }
            vqm0Var.f243965c.put(ku61Var, uqm0Var2);
            i38++;
            size = i43;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m44524b(tqm0 tqm0Var) {
        new sqm0(this, tqm0Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Bitmap) this.f79198e);
    }

    /* JADX INFO: renamed from: c */
    public char m44525c() {
        return ((String) this.f79197d).charAt(this.f79194a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m44526d() {
        return this.f79194a < ((String) this.f79197d).length() - this.f79196c;
    }

    /* JADX INFO: renamed from: e */
    public void m44527e(int i) {
        mf61 mf61Var = (mf61) this.f79200g;
        if (mf61Var == null || i > mf61Var.f142970b) {
            this.f79200g = mf61.m61614e(i, (nf61) this.f79198e);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m44528f(char c) {
        ((StringBuilder) this.f79199f).append(c);
    }

    public geu(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f79199f = arrayList;
        this.f79194a = 16;
        this.f79195b = 12544;
        this.f79196c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f79200g = arrayList2;
        if (bitmap != null && !bitmap.isRecycled()) {
            arrayList2.add(vqm0.f243962f);
            this.f79198e = bitmap;
            this.f79197d = null;
            arrayList.add(ku61.f126466d);
            arrayList.add(ku61.f126467e);
            arrayList.add(ku61.f126468f);
            arrayList.add(ku61.f126469g);
            arrayList.add(ku61.f126470h);
            arrayList.add(ku61.f126471i);
            return;
        }
        throw new IllegalArgumentException("Bitmap is not valid");
    }

    public geu(ArrayList arrayList) {
        this.f79199f = new ArrayList();
        this.f79194a = 16;
        this.f79195b = 12544;
        this.f79196c = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f79200g = arrayList2;
        if (!arrayList.isEmpty()) {
            arrayList2.add(vqm0.f243962f);
            this.f79197d = arrayList;
            this.f79198e = null;
            return;
        }
        throw new IllegalArgumentException("List of Swatches is not valid");
    }
}
