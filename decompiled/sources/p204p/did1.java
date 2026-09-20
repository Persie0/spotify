package p204p;

import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class did1 {

    /* JADX INFO: renamed from: a */
    public static final long f49323a = nhd1.f153990a;

    /* JADX INFO: renamed from: b */
    public static final long f49324b = nhd1.f153991b;

    /* JADX INFO: renamed from: c */
    public static final long f49325c = nhd1.f153992c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f49326d = 0;

    /* JADX INFO: renamed from: a */
    public static final void m36075a(int i, o690 o690Var, int i2, int i3, int i4, int i5, boolean z, vh00 vh00Var, fxh0 fxh0Var, gh71 gh71Var, k69 k69Var, xq00 xq00Var, int i6) {
        fxh0 fxh0Var2;
        ArrayList arrayList;
        Float fValueOf;
        Object ch71Var;
        Object obj = t6x0.f217647t;
        List list = o690Var.f162290c;
        xq00Var.m91775k0(343069418);
        int i7 = i6 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91770i(o690Var) ? 32 : 16) | (xq00Var.m91762e(i2) ? 256 : 128) | (xq00Var.m91762e(i3) ? 2048 : 1024) | (xq00Var.m91762e(i4) ? 16384 : 8192) | (xq00Var.m91762e(i5) ? 131072 : 65536) | (xq00Var.m91768h(z) ? 1048576 : 524288) | (xq00Var.m91770i(vh00Var) ? 8388608 : 4194304) | 100663296 | (xq00Var.m91770i(gh71Var) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i7 & 1, ((i7 & 306783379) == 306783378 && ((xq00Var.m91770i(k69Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean zM91766g = xq00Var.m91766g(list);
            Object objM91750T = xq00Var.m91750T();
            lau lauVar = lau.f131415a;
            if (zM91766g || objM91750T == obj) {
                if (list.isEmpty()) {
                    objM91750T = lauVar;
                } else {
                    Integer num = (Integer) g6f.m43693G0(list);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) g6f.m43690D0(list);
                    int iIntValue2 = (num2 != null ? num2.intValue() : 0) - iIntValue;
                    if (iIntValue2 == 0) {
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((Number) it.next()).intValue();
                            arrayList.add(Float.valueOf(0.5f));
                        }
                    } else {
                        int i8 = iIntValue;
                        arrayList = new ArrayList(i6f.m49804T(list, 10));
                        for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                            arrayList.add(Float.valueOf((((Number) it2.next()).intValue() - i8) / iIntValue2));
                        }
                    }
                    if (arrayList.size() > 200) {
                        int size = arrayList.size() / 200;
                        arrayList = g6f.m43742q1(arrayList, size, size, true, ngd1.f153676c);
                    }
                    objM91750T = arrayList;
                }
                xq00Var.m91793t0(objM91750T);
            }
            List list2 = (List) objM91750T;
            boolean zM91766g2 = xq00Var.m91766g(gh71Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T2 == obj) {
                if (gh71Var != null) {
                    ArrayList arrayList2 = gh71Var.f79849c;
                    ArrayList arrayList3 = gh71Var.f79850d;
                    ArrayList arrayList4 = gh71Var.f79851e;
                    if (arrayList2.isEmpty()) {
                        ch71Var = new ch71(lauVar, lauVar, lauVar);
                        i7 = i7;
                    } else {
                        Iterator it3 = n0e1.m63417Y(0, arrayList2.size()).iterator();
                        a450 a450Var = (a450) it3;
                        if (a450Var.f12141c) {
                            t350 t350Var = (t350) it3;
                            int iNextInt = t350Var.nextInt();
                            float fMax = (((uq91) arrayList2.get(iNextInt)).f232950a & 255) + (((uq91) ((iNextInt < 0 || iNextInt >= arrayList3.size()) ? new uq91((byte) 0) : arrayList3.get(iNextInt))).f232950a & 255) + (((uq91) ((iNextInt < 0 || iNextInt >= arrayList4.size()) ? new uq91((byte) 0) : arrayList4.get(iNextInt))).f232950a & 255);
                            while (a450Var.f12141c) {
                                int iNextInt2 = t350Var.nextInt();
                                a450 a450Var2 = a450Var;
                                fMax = Math.max(fMax, (((uq91) arrayList2.get(iNextInt2)).f232950a & 255) + (((uq91) ((iNextInt2 < 0 || iNextInt2 >= arrayList3.size()) ? new uq91((byte) 0) : arrayList3.get(iNextInt2))).f232950a & 255) + (((uq91) ((iNextInt2 < 0 || iNextInt2 >= arrayList4.size()) ? new uq91((byte) 0) : arrayList4.get(iNextInt2))).f232950a & 255));
                                a450Var = a450Var2;
                            }
                            fValueOf = Float.valueOf(fMax);
                        } else {
                            fValueOf = null;
                        }
                        float f = 1.0f;
                        if (fValueOf != null) {
                            float fFloatValue = fValueOf.floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                        }
                        ch71Var = new ch71(m36079e(f, arrayList2), m36079e(f, arrayList3), m36079e(f, arrayList4));
                    }
                    objM91750T2 = ch71Var;
                } else {
                    i7 = i7;
                    objM91750T2 = null;
                }
                xq00Var.m91793t0(objM91750T2);
            } else {
                i7 = i7;
            }
            ch71 ch71Var2 = (ch71) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj) {
                objM91750T3 = sam.m77645B(0);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0 kqi0VarM77651H = sam.m77651H(Integer.valueOf(i), xq00Var);
            kqi0 kqi0VarM77651H2 = sam.m77651H(Integer.valueOf(i4), xq00Var);
            kqi0 kqi0VarM77651H3 = sam.m77651H(Integer.valueOf(i5), xq00Var);
            kqi0 kqi0VarM77651H4 = sam.m77651H(k69Var, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            z96.m95630j(z, cxh0Var, kbv.m55958d(jg31.m53259E(300, 0, null, 6), 2), kbv.m55959e(jg31.m53259E(300, 0, null, 6), 2), null, rkk.m75772x(-643364414, new bid1(kqi0VarM77651H, kqi0VarM77651H2, kqi0VarM77651H3, kqi0VarM77651H4, vh00Var, (kqi0) objM91750T3, i, i4, i5, i3, i2, ch71Var2, list2), xq00Var), xq00Var, ((i7 >> 18) & 14) | 200112, 16);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cid1(i, o690Var, i2, i3, i4, i5, z, vh00Var, fxh0Var2, gh71Var, k69Var, i6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m36076b(kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, kqi0 kqi0Var4, float f, float f2) {
        if (((Number) kqi0Var.getValue()).intValue() <= 0 || f2 <= 0.0f) {
            return ((Number) kqi0Var2.getValue()).intValue();
        }
        int iM63437n = n0e1.m63437n((int) ((f / f2) * ((Number) kqi0Var.getValue()).intValue()), ((Number) kqi0Var2.getValue()).intValue(), ((Number) kqi0Var3.getValue()).intValue());
        k69 k69Var = (k69) kqi0Var4.getValue();
        f69 f69VarM38663C = null;
        if (k69Var != null) {
            ArrayList arrayList = k69Var.f119694b;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                f69VarM38663C = eem.m38663C(iM63437n, arrayList, true);
            }
        }
        return f69VarM38663C != null ? n0e1.m63437n(mpg1.m62480p(f69VarM38663C), ((Number) kqi0Var2.getValue()).intValue(), ((Number) kqi0Var3.getValue()).intValue()) : iM63437n;
    }

    /* JADX INFO: renamed from: c */
    public static final void m36077c(DrawScope drawScope, float f, float f2, float f3) {
        if (f2 >= f3) {
            return;
        }
        float fMo35989Z0 = drawScope.mo35989Z0(2);
        long jM63765b = n6f.m63765b(n6f.f150866f, 0.9f, 0.0f, 0.0f, 0.0f, 14);
        drawScope.mo293g1(jM63765b, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (496 & 8) != 0 ? 0.0f : fMo35989Z0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        drawScope.mo293g1(jM63765b, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (496 & 8) != 0 ? 0.0f : fMo35989Z0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m36078d(DrawScope drawScope, vbn0 vbn0Var, long j, float f, float f2, float f3, float f4, float f5) {
        DrawScope.m282x0(drawScope, vbn0Var, n6f.m63765b(j, 0.15f, 0.0f, 0.0f, 0.0f, 14), null, 60);
        if (f2 < f3) {
            c06 c06VarMo291d1 = drawScope.mo291d1();
            long jM31085B = c06VarMo291d1.m31085B();
            c06VarMo291d1.m31107v().mo25287p();
            try {
                ((kca) c06VarMo291d1.f32694b).m56024e(f2, 0.0f, f3, f, 1);
                DrawScope.m282x0(drawScope, vbn0Var, n6f.m63765b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14), null, 60);
                stz0.m79358l(c06VarMo291d1, jM31085B);
            } catch (Throwable th) {
                stz0.m79358l(c06VarMo291d1, jM31085B);
                throw th;
            }
        }
        if (f4 < f5) {
            c06 c06VarMo291d2 = drawScope.mo291d1();
            long jM31085B2 = c06VarMo291d2.m31085B();
            c06VarMo291d2.m31107v().mo25287p();
            try {
                ((kca) c06VarMo291d2.f32694b).m56024e(f4, 0.0f, f5, f, 1);
                DrawScope.m282x0(drawScope, vbn0Var, n6f.m63765b(j, 0.55f, 0.0f, 0.0f, 0.0f, 14), null, 60);
            } finally {
                stz0.m79358l(c06VarMo291d2, jM31085B2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final ArrayList m36079e(float f, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf((((uq91) it.next()).f232950a & 255) / f));
        }
        if (arrayList2.size() <= 200) {
            return arrayList2;
        }
        int size = arrayList2.size() / 200;
        return g6f.m43742q1(arrayList2, size, size, true, ngd1.f153678d);
    }
}
