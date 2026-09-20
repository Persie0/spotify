package p204p;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.car.app.model.Alert;
import com.google.android.recaptcha.internal.zzhg;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.TimeoutCancellationException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c95 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f35398a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f35399b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f35400c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f35401d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: A */
    public static final tw70 m31811A(yw70 yw70Var, int i) {
        Object next;
        Iterator it = yw70Var.m94779h().f214605k.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((tw70) next).f224325a == i) {
                return (tw70) next;
            }
        }
        next = null;
        return (tw70) next;
    }

    /* JADX INFO: renamed from: C */
    public static final up60 m31812C(kq60 kq60Var) {
        Object obj;
        if (kq60Var instanceof up60) {
            return (up60) kq60Var;
        }
        if (!(kq60Var instanceof ur60)) {
            throw new cvk("Cannot calculate JVM erasure for type: " + kq60Var);
        }
        List upperBounds = ((ur60) kq60Var).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            kq60 kq60VarMo27067y = ((sr60) next).mo27067y();
            cq60 cq60Var = kq60VarMo27067y instanceof cq60 ? (cq60) kq60VarMo27067y : null;
            if (cq60Var != null && cq60Var.m33606d0() != xfe.INTERFACE && cq60Var.m33606d0() != xfe.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        sr60 sr60Var = (sr60) obj;
        if (sr60Var == null) {
            sr60Var = (sr60) g6f.m43745s0(upperBounds);
        }
        return sr60Var != null ? m31813D(sr60Var) : qpv0.f191387a.mo54112b(Object.class);
    }

    /* JADX INFO: renamed from: D */
    public static final up60 m31813D(sr60 sr60Var) {
        kq60 kq60VarMo27067y = sr60Var.mo27067y();
        if (kq60VarMo27067y != null) {
            return m31812C(kq60VarMo27067y);
        }
        throw new cvk("Cannot calculate JVM erasure for type: " + sr60Var);
    }

    /* JADX INFO: renamed from: E */
    public static final int m31814E(yw70 yw70Var) {
        return (int) (yw70Var.m94779h().m79529g() & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public static final Object m31815G(yw70 yw70Var, int i, boolean z, boolean z2, yqq yqqVar, ibk ibkVar) {
        dny0 dny0Var;
        int i2;
        int i3;
        tw70 tw70VarM31811A;
        yw70 yw70Var2;
        int i4;
        int i5;
        if (ibkVar instanceof dny0) {
            dny0Var = (dny0) ibkVar;
            int i6 = dny0Var.f50898h;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dny0Var.f50898h = i6 - Integer.MIN_VALUE;
            } else {
                dny0Var = new dny0(ibkVar);
            }
        } else {
            dny0Var = new dny0(ibkVar);
        }
        Object obj = dny0Var.f50897g;
        int i7 = dny0Var.f50898h;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (i7 == 0) {
            bga.m29073P(obj);
            if (z) {
                tw70VarM31811A = m31811A(yw70Var, i);
                if (tw70VarM31811A != null) {
                    if (tw70VarM31811A != null) {
                        i4 = tw70VarM31811A.f224325a;
                        float f = tw70VarM31811A.f224341q / 0.83f;
                        if (i4 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 16;
                        }
                        int iMo35989Z0 = (int) (yqqVar.mo35989Z0(yqqVar.mo35987O0(i5)) + f);
                        int iM31814E = m31814E(yw70Var);
                        i3 = iMo35989Z0 <= iM31814E ? (iM31814E - iMo35989Z0) / 2 : 0;
                        dny0Var.f50891a = null;
                        dny0Var.f50892b = null;
                        dny0Var.f50893c = null;
                        dny0Var.f50894d = i;
                        dny0Var.f50895e = z;
                        dny0Var.f50896f = z2;
                        dny0Var.f50898h = 2;
                        if (yw70Var.m94782k(i, -i3, dny0Var) == yukVar) {
                        }
                    }
                    return w2a1Var;
                }
                dny0Var.f50891a = yw70Var;
                dny0Var.f50892b = yqqVar;
                dny0Var.f50893c = yw70Var;
                dny0Var.f50894d = i;
                dny0Var.f50895e = z;
                dny0Var.f50896f = z2;
                dny0Var.f50898h = 1;
                if (yw70Var.m94782k(i, 0, dny0Var) != yukVar) {
                    yw70Var2 = yw70Var;
                }
            } else {
                if (z2) {
                    i2 = i;
                } else {
                    i2 = i + 1;
                    int i8 = yw70Var.m94779h().f214608n - 1;
                    if (i2 > i8) {
                        i2 = i8;
                    }
                    if (i2 < 0) {
                        i2 = 0;
                    }
                }
                i3 = z2 ? 0 : -((yw70Var.m94779h().f214612r / 2) + (m31814E(yw70Var) / 2));
                dny0Var.f50891a = null;
                dny0Var.f50892b = null;
                dny0Var.f50894d = i;
                dny0Var.f50895e = z;
                dny0Var.f50896f = z2;
                dny0Var.f50898h = 3;
                if (yw70Var.m94782k(i2, i3, dny0Var) != yukVar) {
                    return w2a1Var;
                }
            }
            return yukVar;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                bga.m29073P(obj);
                return w2a1Var;
            }
            if (i7 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        z2 = dny0Var.f50896f;
        z = dny0Var.f50895e;
        i = dny0Var.f50894d;
        yw70Var = dny0Var.f50893c;
        yqqVar = dny0Var.f50892b;
        yw70Var2 = dny0Var.f50891a;
        bga.m29073P(obj);
        tw70VarM31811A = m31811A(yw70Var, i);
        yw70Var = yw70Var2;
        if (tw70VarM31811A != null) {
            i4 = tw70VarM31811A.f224325a;
            float f2 = tw70VarM31811A.f224341q / 0.83f;
            if (i4 == 0) {
                i5 = 0;
            } else {
                i5 = 16;
            }
            int iMo35989Z1 = (int) (yqqVar.mo35989Z0(yqqVar.mo35987O0(i5)) + f2);
            int iM31814E2 = m31814E(yw70Var);
            if (iMo35989Z1 <= iM31814E2) {
            }
            dny0Var.f50891a = null;
            dny0Var.f50892b = null;
            dny0Var.f50893c = null;
            dny0Var.f50894d = i;
            dny0Var.f50895e = z;
            dny0Var.f50896f = z2;
            dny0Var.f50898h = 2;
            if (yw70Var.m94782k(i, -i3, dny0Var) == yukVar) {
                return yukVar;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: H */
    public static int m31816H(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f35400c;
        return m9f.m61215c(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: I */
    public static final long m31817I(float f, long j, long j2) {
        float fM88249I = wj50.m88249I(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fM88249I2 = wj50.m88249I(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return (((long) Float.floatToRawIntBits(fM88249I)) << 32) | (((long) Float.floatToRawIntBits(fM88249I2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: J */
    public static float m31818J(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: K */
    public static Handler m31819K() {
        return Build.VERSION.SDK_INT >= 28 ? r35.m74598f(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: L */
    public static int m31820L(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: M */
    public static Map m31821M(pqm0 pqm0Var) {
        return Collections.singletonMap(pqm0Var.f180350a, pqm0Var.f180351b);
    }

    /* JADX INFO: renamed from: N */
    public static final fxh0 m31822N(fxh0 fxh0Var, vfj0 vfj0Var, yfj0 yfj0Var) {
        return fxh0Var.mo34315F(new zfj0(vfj0Var, yfj0Var));
    }

    /* JADX INFO: renamed from: O */
    public static final synchronized void m31823O(C1975id c1975id, b101 b101Var) {
        if (p2l.f173365a.contains(c95.class)) {
            return;
        }
        try {
            dpn0 dpn0VarM93078z = y85.m93078z();
            dpn0VarM93078z.m36580a(c1975id, b101Var.m27860c());
            y85.m93046C(dpn0VarM93078z);
        } catch (Throwable th) {
            p2l.m68953a(c95.class, th);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final synchronized void m31824P(w85 w85Var) {
        if (p2l.f173365a.contains(c95.class)) {
            return;
        }
        try {
            dpn0 dpn0VarM93078z = y85.m93078z();
            for (C1975id c1975id : w85Var.m87452f()) {
                b101 b101VarM87448b = w85Var.m87448b(c1975id);
                if (b101VarM87448b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                dpn0VarM93078z.m36580a(c1975id, b101VarM87448b.m27860c());
            }
            y85.m93046C(dpn0VarM93078z);
        } catch (Throwable th) {
            p2l.m68953a(c95.class, th);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final int m31825U(Context context, int i) {
        float f = context.getResources().getDisplayMetrics().densityDpi / 160;
        if (f < 1.0f) {
            f = 1.0f;
        }
        return (int) (i / f);
    }

    /* JADX INFO: renamed from: V */
    public static whj0 m31826V(vuu0 vuu0Var) {
        int i = Integer.parseInt(vuu0Var.mo45421S(Long.MAX_VALUE));
        long j = Long.parseLong(vuu0Var.mo45421S(Long.MAX_VALUE));
        long j2 = Long.parseLong(vuu0Var.mo45421S(Long.MAX_VALUE));
        cz90 cz90Var = new cz90();
        int i2 = Integer.parseInt(vuu0Var.mo45421S(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strMo45421S = vuu0Var.mo45421S(Long.MAX_VALUE);
            int iM88457G0 = wl51.m88457G0(strMo45421S, ':', 0, 6);
            if (iM88457G0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strMo45421S).toString());
            }
            cz90Var.m34416b(wl51.m88491o1(strMo45421S.substring(0, iM88457G0)).toString(), strMo45421S.substring(iM88457G0 + 1));
        }
        return new whj0(i, j, j2, cz90Var.m34418d());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX INFO: renamed from: W */
    public static final Object m31827W(yw70 yw70Var, int i, boolean z, boolean z2, boolean z3, yqq yqqVar, gjw0 gjw0Var) {
        yw70 yw70Var2;
        gjw0 gjw0Var2;
        float fM31814E;
        Object objM94777f;
        int i2 = yw70Var.m94779h().f214608n - 1;
        if (i > i2) {
            i = i2;
        }
        int i3 = i < 0 ? 0 : i;
        yuk yukVar = yuk.f276404a;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z2) {
            if (z3) {
                if (m31811A(yw70Var, i3 - 1) == null) {
                    objM94777f = yw70Var.m94777f(i3, 0, gjw0Var);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                } else {
                    fM31814E = m31814E(yw70Var);
                    yw70Var2 = yw70Var;
                    gjw0Var2 = gjw0Var;
                    objM94777f = oyf1.m68462g(yw70Var2, fM31814E, jg31.m53259E(400, 0, null, 6), gjw0Var2);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                }
            } else if (z) {
                tw70 tw70VarM31811A = m31811A(yw70Var, i3);
                if (tw70VarM31811A == null) {
                    objM94777f = m31815G(yw70Var, i3, true, true, yqqVar, gjw0Var);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                } else {
                    yw70Var2 = yw70Var;
                    gjw0Var2 = gjw0Var;
                    int i4 = tw70VarM31811A.f224341q;
                    int iMo35989Z0 = (int) (yqqVar.mo35989Z0(yqqVar.mo35987O0(tw70VarM31811A.f224325a == 0 ? 0 : 16)) + (i4 / 0.83f));
                    int iM31814E = m31814E(yw70Var2);
                    fM31814E = (tw70VarM31811A.f224340p - (iMo35989Z0 - i4)) - (iMo35989Z0 > iM31814E ? 0 : (iM31814E - iMo35989Z0) / 2);
                    objM94777f = oyf1.m68462g(yw70Var2, fM31814E, jg31.m53259E(400, 0, null, 6), gjw0Var2);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                }
            } else {
                yw70Var2 = yw70Var;
                gjw0Var2 = gjw0Var;
                tw70 tw70VarM31811A2 = m31811A(yw70Var2, i3);
                if (tw70VarM31811A2 == null) {
                    objM94777f = yw70Var2.m94777f(i3, 0, gjw0Var2);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                } else {
                    int i5 = yw70Var2.m94779h().f214612r / 2;
                    int i6 = tw70VarM31811A2.f224341q;
                    int i7 = tw70VarM31811A2.f224340p + i6 + i5;
                    int iM31814E2 = m31814E(yw70Var2) / 2;
                    int iM31814E3 = m31814E(yw70Var2) / 2;
                    int iMin = i6 <= iM31814E3 ? 0 : Math.min(i6 - iM31814E3, iM31814E3);
                    int i8 = i7 - iM31814E2;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                    fM31814E = i8 - iMin;
                    objM94777f = oyf1.m68462g(yw70Var2, fM31814E, jg31.m53259E(400, 0, null, 6), gjw0Var2);
                    if (objM94777f != yukVar) {
                        objM94777f = w2a1Var;
                    }
                }
            }
            if (objM94777f == yukVar) {
                return objM94777f;
            }
        } else {
            Object objM31815G = m31815G(yw70Var, i3, z, z3, yqqVar, gjw0Var);
            if (objM31815G == yukVar) {
                return objM31815G;
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: X */
    public static final n2x0 m31828X(n2x0 n2x0Var) {
        z1x0 z1x0VarM63572c = n2x0Var.m63572c();
        p3x0 p3x0Var = n2x0Var.f149863g;
        z1x0VarM63572c.f278428g = new b4a1(p3x0Var.mo28082f(), p3x0Var.mo28081e());
        return z1x0VarM63572c.m95164a();
    }

    /* JADX INFO: renamed from: Y */
    public static final void m31829Y(lq9 lq9Var, wg01 wg01Var) {
        lq9Var.m59728N1(lq9Var.mo24619j() * wg01Var.m88002f());
        lq9Var.m59729O1(lq9Var.mo24619j() * wg01Var.m88003g());
        float fMo24619j = lq9Var.mo24619j() * acs.m25482a(wg01Var.m88001e());
        float fMo24619j2 = lq9Var.mo24619j() * acs.m25483b(wg01Var.m88001e());
        lq9Var.m59727M1((((long) Float.floatToRawIntBits(fMo24619j)) << 32) | (((long) Float.floatToRawIntBits(fMo24619j2)) & 4294967295L));
        lq9Var.m59726L1(wg01Var.m88000d());
        lq9Var.m59725K1(wg01Var.m87999c());
        lq9Var.m59723I1(wg01Var.m87997a());
        lq9Var.m59724J1(wg01Var.m87998b());
    }

    /* JADX INFO: renamed from: Z */
    public static Map m31830Z(LinkedHashMap linkedHashMap) {
        return new epi0(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x0112  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m31831a(fxh0 fxh0Var, yw70 yw70Var, kyu kyuVar, int i, f4m0 f4m0Var, aj5 aj5Var, gh00 gh00Var, xq00 xq00Var, int i2, int i3) {
        yw70 yw70Var2;
        int i4;
        int i5;
        aj5 aj5Var2;
        int i6;
        int i7;
        boolean z;
        yw70 yw70Var3;
        aj5 aj5Var3;
        int i8;
        kyu kyuVar2;
        pgv0 pgv0VarM91796v;
        yw70 yw70VarM30763a;
        kyu kyuVar3;
        int i9;
        yw70 yw70Var4;
        int i10;
        aj5 aj5Var4;
        boolean zM91770i;
        kyu kyuVar4 = kyuVar;
        xq00Var.m91775k0(-63649911);
        int i11 = (xq00Var.m91770i(fxh0Var) ? 4 : 2) | i2;
        if ((i3 & 2) == 0) {
            yw70Var2 = yw70Var;
            int i12 = xq00Var.m91770i(yw70Var2) ? 32 : 16;
            int i13 = i11 | i12;
            if ((i3 & 4) != 0) {
                i4 = 128;
            } else {
                if ((i2 & 512) == 0) {
                    zM91770i = xq00Var.m91766g(kyuVar4);
                } else {
                    zM91770i = xq00Var.m91770i(kyuVar4);
                }
                if (zM91770i) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
            }
            int i14 = i13 | i4 | 1024;
            if (xq00Var.m91770i(f4m0Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            int i15 = i14 | i5 | 196608;
            if ((i3 & 64) == 0) {
                aj5Var2 = aj5Var;
                int i16 = xq00Var.m91770i(aj5Var2) ? 1048576 : 524288;
                int i17 = i15 | i16;
                if (xq00Var.m91770i(gh00Var)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i7 = i17 | i6;
                if ((4793491 & i7) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i7 & 1, z)) {
                    xq00Var.m91761d0();
                    if ((i2 & 1) != 0 || xq00Var.m91735E()) {
                        if ((i3 & 2) != 0) {
                            yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                        } else {
                            yw70VarM30763a = yw70Var2;
                        }
                        if ((i3 & 4) != 0) {
                            kyuVar3 = new kyu(null, 0, null, null, 31);
                        } else {
                            kyuVar3 = kyuVar4;
                        }
                        i9 = kyuVar3.m57725c().equals(tju.f221017e) ? 1 : 2;
                        if ((i3 & 64) != 0) {
                            yw70Var4 = yw70VarM30763a;
                            i10 = i9;
                            aj5Var4 = bj5.f27612c;
                            kyuVar4 = kyuVar3;
                        } else {
                            yw70Var4 = yw70VarM30763a;
                            i10 = i9;
                            kyuVar4 = kyuVar3;
                        }
                        xq00Var.m91790s();
                        qqg1.m73532b(lyu.m60276b().mo30068a(kyuVar4), rkk.m75772x(225930313, new xxu(fxh0Var, yw70Var4, f4m0Var, aj5Var4, gh00Var, i10), xq00Var), xq00Var, 56);
                        yw70Var3 = yw70Var4;
                        aj5Var3 = aj5Var4;
                        i8 = i10;
                    } else {
                        xq00Var.m91757b0();
                        i10 = i;
                        yw70Var4 = yw70Var2;
                    }
                    aj5Var4 = aj5Var2;
                    xq00Var.m91790s();
                    qqg1.m73532b(lyu.m60276b().mo30068a(kyuVar4), rkk.m75772x(225930313, new xxu(fxh0Var, yw70Var4, f4m0Var, aj5Var4, gh00Var, i10), xq00Var), xq00Var, 56);
                    yw70Var3 = yw70Var4;
                    aj5Var3 = aj5Var4;
                    i8 = i10;
                } else {
                    xq00Var.m91757b0();
                    yw70Var3 = yw70Var2;
                    aj5Var3 = aj5Var2;
                    i8 = i;
                }
                kyuVar2 = kyuVar4;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new yxu(fxh0Var, yw70Var3, kyuVar2, i8, f4m0Var, aj5Var3, gh00Var, i2, i3);
                }
            }
            aj5Var2 = aj5Var;
            int i18 = i15 | i16;
            if (xq00Var.m91770i(gh00Var)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i7 = i18 | i6;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i7 & 1, z)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                    } else {
                        yw70VarM30763a = yw70Var2;
                    }
                    if ((i3 & 4) != 0) {
                        kyuVar3 = new kyu(null, 0, null, null, 31);
                    } else {
                        kyuVar3 = kyuVar4;
                    }
                    if (kyuVar3.m57725c().equals(tju.f221017e)) {
                    }
                    if ((i3 & 64) != 0) {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        aj5Var4 = bj5.f27612c;
                        kyuVar4 = kyuVar3;
                    } else {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        kyuVar4 = kyuVar3;
                        aj5Var4 = aj5Var2;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                    } else {
                        yw70VarM30763a = yw70Var2;
                    }
                    if ((i3 & 4) != 0) {
                        kyuVar3 = new kyu(null, 0, null, null, 31);
                    } else {
                        kyuVar3 = kyuVar4;
                    }
                    if (kyuVar3.m57725c().equals(tju.f221017e)) {
                    }
                    if ((i3 & 64) != 0) {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        aj5Var4 = bj5.f27612c;
                        kyuVar4 = kyuVar3;
                    } else {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        kyuVar4 = kyuVar3;
                        aj5Var4 = aj5Var2;
                    }
                }
                xq00Var.m91790s();
                qqg1.m73532b(lyu.m60276b().mo30068a(kyuVar4), rkk.m75772x(225930313, new xxu(fxh0Var, yw70Var4, f4m0Var, aj5Var4, gh00Var, i10), xq00Var), xq00Var, 56);
                yw70Var3 = yw70Var4;
                aj5Var3 = aj5Var4;
                i8 = i10;
            } else {
                xq00Var.m91757b0();
                yw70Var3 = yw70Var2;
                aj5Var3 = aj5Var2;
                i8 = i;
            }
            kyuVar2 = kyuVar4;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new yxu(fxh0Var, yw70Var3, kyuVar2, i8, f4m0Var, aj5Var3, gh00Var, i2, i3);
            }
        }
        yw70Var2 = yw70Var;
        int i19 = i11 | i12;
        if ((i3 & 4) != 0) {
            i4 = 128;
        } else {
            if ((i2 & 512) == 0) {
                zM91770i = xq00Var.m91766g(kyuVar4);
            } else {
                zM91770i = xq00Var.m91770i(kyuVar4);
            }
            if (zM91770i) {
                i4 = 256;
            } else {
                i4 = 128;
            }
        }
        int i110 = i19 | i4 | 1024;
        if (xq00Var.m91770i(f4m0Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i111 = i110 | i5 | 196608;
        if ((i3 & 64) == 0) {
            aj5Var2 = aj5Var;
            if (xq00Var.m91770i(aj5Var2)) {
            }
            int i112 = i111 | i16;
            if (xq00Var.m91770i(gh00Var)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i7 = i112 | i6;
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i7 & 1, z)) {
                xq00Var.m91761d0();
                if ((i2 & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                    } else {
                        yw70VarM30763a = yw70Var2;
                    }
                    if ((i3 & 4) != 0) {
                        kyuVar3 = new kyu(null, 0, null, null, 31);
                    } else {
                        kyuVar3 = kyuVar4;
                    }
                    if (kyuVar3.m57725c().equals(tju.f221017e)) {
                    }
                    if ((i3 & 64) != 0) {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        aj5Var4 = bj5.f27612c;
                        kyuVar4 = kyuVar3;
                    } else {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        kyuVar4 = kyuVar3;
                        aj5Var4 = aj5Var2;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                    } else {
                        yw70VarM30763a = yw70Var2;
                    }
                    if ((i3 & 4) != 0) {
                        kyuVar3 = new kyu(null, 0, null, null, 31);
                    } else {
                        kyuVar3 = kyuVar4;
                    }
                    if (kyuVar3.m57725c().equals(tju.f221017e)) {
                    }
                    if ((i3 & 64) != 0) {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        aj5Var4 = bj5.f27612c;
                        kyuVar4 = kyuVar3;
                    } else {
                        yw70Var4 = yw70VarM30763a;
                        i10 = i9;
                        kyuVar4 = kyuVar3;
                        aj5Var4 = aj5Var2;
                    }
                }
                xq00Var.m91790s();
                qqg1.m73532b(lyu.m60276b().mo30068a(kyuVar4), rkk.m75772x(225930313, new xxu(fxh0Var, yw70Var4, f4m0Var, aj5Var4, gh00Var, i10), xq00Var), xq00Var, 56);
                yw70Var3 = yw70Var4;
                aj5Var3 = aj5Var4;
                i8 = i10;
            } else {
                xq00Var.m91757b0();
                yw70Var3 = yw70Var2;
                aj5Var3 = aj5Var2;
                i8 = i;
            }
            kyuVar2 = kyuVar4;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new yxu(fxh0Var, yw70Var3, kyuVar2, i8, f4m0Var, aj5Var3, gh00Var, i2, i3);
            }
        }
        aj5Var2 = aj5Var;
        int i113 = i111 | i16;
        if (xq00Var.m91770i(gh00Var)) {
            i6 = 8388608;
        } else {
            i6 = 4194304;
        }
        i7 = i113 | i6;
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i7 & 1, z)) {
            xq00Var.m91761d0();
            if ((i2 & 1) != 0) {
                if ((i3 & 2) != 0) {
                    yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                } else {
                    yw70VarM30763a = yw70Var2;
                }
                if ((i3 & 4) != 0) {
                    kyuVar3 = new kyu(null, 0, null, null, 31);
                } else {
                    kyuVar3 = kyuVar4;
                }
                if (kyuVar3.m57725c().equals(tju.f221017e)) {
                }
                if ((i3 & 64) != 0) {
                    yw70Var4 = yw70VarM30763a;
                    i10 = i9;
                    aj5Var4 = bj5.f27612c;
                    kyuVar4 = kyuVar3;
                } else {
                    yw70Var4 = yw70VarM30763a;
                    i10 = i9;
                    kyuVar4 = kyuVar3;
                    aj5Var4 = aj5Var2;
                }
            } else {
                if ((i3 & 2) != 0) {
                    yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
                } else {
                    yw70VarM30763a = yw70Var2;
                }
                if ((i3 & 4) != 0) {
                    kyuVar3 = new kyu(null, 0, null, null, 31);
                } else {
                    kyuVar3 = kyuVar4;
                }
                if (kyuVar3.m57725c().equals(tju.f221017e)) {
                }
                if ((i3 & 64) != 0) {
                    yw70Var4 = yw70VarM30763a;
                    i10 = i9;
                    aj5Var4 = bj5.f27612c;
                    kyuVar4 = kyuVar3;
                } else {
                    yw70Var4 = yw70VarM30763a;
                    i10 = i9;
                    kyuVar4 = kyuVar3;
                    aj5Var4 = aj5Var2;
                }
            }
            xq00Var.m91790s();
            qqg1.m73532b(lyu.m60276b().mo30068a(kyuVar4), rkk.m75772x(225930313, new xxu(fxh0Var, yw70Var4, f4m0Var, aj5Var4, gh00Var, i10), xq00Var), xq00Var, 56);
            yw70Var3 = yw70Var4;
            aj5Var3 = aj5Var4;
            i8 = i10;
        } else {
            xq00Var.m91757b0();
            yw70Var3 = yw70Var2;
            aj5Var3 = aj5Var2;
            i8 = i;
        }
        kyuVar2 = kyuVar4;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yxu(fxh0Var, yw70Var3, kyuVar2, i8, f4m0Var, aj5Var3, gh00Var, i2, i3);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static ih10 m31832a0(Context context, CharSequence charSequence, CharSequence charSequence2) {
        pyu pyuVar = new pyu(14);
        charSequence.getClass();
        pyuVar.setTitle(charSequence);
        charSequence2.getClass();
        pyuVar.m71671J(charSequence2);
        return new ih10(context, pyuVar);
    }

    /* JADX INFO: renamed from: b */
    public static final void m31833b(int i, int i2, int i3, eh00 eh00Var, xq00 xq00Var, int i4) {
        xq00 xq00Var2;
        xq00Var.m91775k0(955403777);
        ug5 ug5Var = xq00Var.f264811a;
        int i5 = i4 | (xq00Var.m91762e(i) ? 4 : 2) | (xq00Var.m91762e(i2) ? 32 : 16) | (xq00Var.m91762e(i3) ? 256 : 128) | (xq00Var.m91770i(eh00Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i5 & 1, (i5 & 1171) != 1170)) {
            wb9 wb9Var = d7f0.f46174i;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM64246i = nec.m64246i(mi21.m61820d(1.0f, cxh0Var), n6f.m63765b(leu.m58815a(xq00Var).f112823a.f229876c, 0.5f, 0.0f, 0.0f, 0.0f, 14), kxf1.f127485a);
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM64246i);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27614e, d7f0.f46145P0, xq00Var, 0);
            int iHashCode2 = Long.hashCode(pmg1.m70357p(xq00Var));
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cxh0Var);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            boolean z = false;
            ahf1.m25932d(k0e1.m54977L(i, xq00Var), null, leu.m58818d(xq00Var).f64967c, leu.m58815a(xq00Var).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2018);
            float f = leu.m58816b(xq00Var).f117230b.f224761d;
            ahf1.m25932d(k0e1.m54977L(i2, xq00Var), zsf1.m96866z(mi21.m61822f(1.0f, cxh0Var), f, f), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var, 0, 0, 2016);
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, 0.0f, f, 1);
            if ((i5 & 7168) == 2048) {
                z = true;
            }
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new t2w(20, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            dyu.m37371c(l7l.m58438s((eh00) objM91750T), new tgu(6), fxh0VarM96830A, null, null, null, null, null, null, null, rkk.m75772x(-1694587226, new va1((byte) 0, i3, 20), xq00Var), xq00Var, 0, 48, 2040);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new os2(i, i2, i3, eh00Var, i4);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m31834b0(whj0 whj0Var, tuu0 tuu0Var) {
        tuu0Var.mo42403B0(whj0Var.m88149b());
        tuu0Var.writeByte(10);
        tuu0Var.mo42403B0(whj0Var.m88151d());
        tuu0Var.writeByte(10);
        tuu0Var.mo42403B0(whj0Var.m88152e());
        tuu0Var.writeByte(10);
        Set<Map.Entry> setEntrySet = whj0Var.m88150c().m58996a().entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        tuu0Var.mo42403B0(size);
        tuu0Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                tuu0Var.mo42406b0((String) entry.getKey());
                tuu0Var.mo42406b0(":");
                tuu0Var.mo42406b0(str);
                tuu0Var.writeByte(10);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final long m31835c(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: c0 */
    public static float m31836c0() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: d */
    public static String m31837d(int i, int i2, String str) {
        if (i < 0) {
            return vie1.m85638t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return vie1.m85638t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
    }

    /* JADX INFO: renamed from: d0 */
    public static final zzhg m31838d0(Exception exc, zzhg zzhgVar) {
        if (exc instanceof TimeoutCancellationException) {
            return new zzhg(zz11.f287823d2, zz11.f287824e, exc.getMessage(), 8);
        }
        return exc instanceof zzhg ? (zzhg) exc : zzhgVar;
    }

    /* JADX INFO: renamed from: e */
    public static void m31839e(long j, long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m31840f(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, Long.valueOf(j)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m31841g(String str, int i, int i2, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m31842h(String str, int i, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m31843i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m31844j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m31845k(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, obj));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m31846l(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(vie1.m85638t(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m31847m(int i, int i2) {
        String strM85638t;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM85638t = vie1.m85638t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(s571.m77246e(i2, "negative size: "));
                }
                strM85638t = vie1.m85638t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM85638t);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m31848n(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m31849o(String str, Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(vie1.m85638t(str, obj2));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m31850p(yhd0 yhd0Var) {
        yhd0Var.getClass();
    }

    /* JADX INFO: renamed from: q */
    public static void m31851q(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m31837d(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m31852r(int i, int i2, int i3) {
        String strM31837d;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM31837d = m31837d(i, i3, "start index");
            } else {
                strM31837d = (i2 < 0 || i2 > i3) ? m31837d(i2, i3, "end index") : vie1.m85638t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM31837d);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m31853s(long j, long j2, String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(vie1.m85638t(str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m31854t(String str, int i, boolean z) {
        if (!z) {
            throw new IllegalStateException(vie1.m85638t(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m31855u(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m31856v(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m31857w(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(vie1.m85638t(str, obj));
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m31858x(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(vie1.m85638t(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static lk4 m31859y(lk4 lk4Var, BlurMaskFilter blurMaskFilter, int i) {
        int i2 = n6f.f150872l;
        long jM60218h = ly5.m60218h();
        int i3 = (i & 8) != 0 ? 0 : 1;
        lk4Var.m59208c(jM60218h);
        lk4Var.m59207b(3);
        lk4Var.m59212g(i3);
        zug1.m97035l(lk4Var, blurMaskFilter);
        return lk4Var;
    }

    /* JADX INFO: renamed from: z */
    public static o3x0 m31860z(String str, ayd0 ayd0Var) {
        pqm0 pqm0VarM43269k = g0b1.m43269k(ayd0Var);
        Charset charset = (Charset) pqm0VarM43269k.f180350a;
        ayd0 ayd0Var2 = (ayd0) pqm0VarM43269k.f180351b;
        npa npaVar = new npa();
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(s571.m77247f(length, "endIndex < beginIndex: ", 0, " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder sbM56838j = klh.m56838j(length, "endIndex > string.length: ", " > ");
            sbM56838j.append(str.length());
            throw new IllegalArgumentException(sbM56838j.toString().toString());
        }
        if (charset.equals(vuc.f244913a)) {
            npaVar.m65303P(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            npaVar.write(bytes, 0, bytes.length);
        }
        return new o3x0(ayd0Var2, npaVar.f156904b, npaVar);
    }

    /* JADX INFO: renamed from: B */
    public abstract Object mo31861B(up60 up60Var);

    /* JADX INFO: renamed from: F */
    public abstract nd20 mo25555F();

    /* JADX INFO: renamed from: Q */
    public abstract c95 mo31862Q(up60 up60Var, Object obj);

    /* JADX INFO: renamed from: R */
    public c95 mo31863R(byte[] bArr) {
        return mo25556S(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: S */
    public abstract c95 mo25556S(byte[] bArr, int i);

    /* JADX INFO: renamed from: T */
    public abstract c95 mo25557T(char c);
}
