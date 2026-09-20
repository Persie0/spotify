package p204p;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Next;
import com.spotify.useraccount.p175v1.AccountAttribute;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vwf1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f245490a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f245491b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: c */
    public static sd40 f245492c;

    /* JADX INFO: renamed from: d */
    public static sd40 f245493d;

    /* JADX INFO: renamed from: A */
    public static void m86563A(ByteArrayOutputStream byteArrayOutputStream, jgr jgrVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m3l.m60693E(byteArrayOutputStream, str.getBytes(charset).length);
        m3l.m60693E(byteArrayOutputStream, jgrVar.f112249e);
        m3l.m60692D(byteArrayOutputStream, jgrVar.f112250f, 4);
        m3l.m60692D(byteArrayOutputStream, jgrVar.f112247c, 4);
        m3l.m60692D(byteArrayOutputStream, jgrVar.f112251g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: B */
    public static void m86564B(ByteArrayOutputStream byteArrayOutputStream, int i, jgr jgrVar) throws IOException {
        int i2 = jgrVar.f112251g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : jgrVar.f112253i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: C */
    public static void m86565C(ByteArrayOutputStream byteArrayOutputStream, jgr jgrVar) {
        int i = 0;
        for (Map.Entry entry : jgrVar.f112253i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m3l.m60693E(byteArrayOutputStream, iIntValue - i);
                m3l.m60693E(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static a9h1 m86566D(ExecutorService executorService) {
        if (executorService instanceof a9h1) {
            return (a9h1) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new i9h1((ScheduledExecutorService) executorService) : new d9h1(executorService);
    }

    /* JADX INFO: renamed from: a */
    public static final void m86567a(int i, String str, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1187820411);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91766g(fxh0Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = BreakIterator.getCharacterInstance();
                xq00Var.m91793t0(objM91750T);
            }
            BreakIterator breakIterator = (BreakIterator) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B("");
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            boolean zM91770i = (i3 == 4) | xq00Var.m91770i(breakIterator) | ((i2 & 896) == 256);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == ia7Var) {
                es1 es1Var = new es1(15, breakIterator, str, eh00Var, kqi0Var, (fbk) null);
                xq00Var.m91793t0(es1Var);
                objM91750T3 = es1Var;
            }
            hz40.m49237i(str, (th00) objM91750T3, xq00Var);
            fxh0Var2 = fxh0Var;
            m86569c(i2 & ContentType.LONG_FORM_ON_DEMAND, (String) kqi0Var.getValue(), xq00Var, fxh0Var2);
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1864fl(str, fxh0Var2, eh00Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m86568b(String str, e940 e940Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-456909038);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i | (xq00Var.m91770i(e940Var) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            qqg1.m73532b(vm6.f242710a.mo30068a(e940Var), rkk.m75772x(423252562, new C1709bl(str, 20), xq00Var), xq00Var, 56);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz4(str, e940Var, fxh0Var2, i, 10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m86569c(int i, String str, xq00 xq00Var, fxh0 fxh0Var) {
        xq00Var.m91775k0(-599327396);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            ahf1.m25932d(str, fxh0Var, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(4), 0, null, xq00Var, (i2 & 14) | 1572864 | (i2 & ContentType.LONG_FORM_ON_DEMAND), 0, 1712);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1780dj(str, fxh0Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m86570d(k150 k150Var, bmh bmhVar, boolean z, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        cxh0 cxh0Var;
        Object obj = t6x0.f217647t;
        boolean z2 = k150Var.f118207c;
        String str = k150Var.f118205a;
        xq00Var.m91775k0(244812446);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(k150Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(bmhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91768h(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z3 = (i3 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z3 || objM91750T == obj) {
                objM91750T = new ms40(k150Var, 4);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) dul.m37018u(objArr, (eh00) objM91750T, xq00Var, 0);
            i150 i150Var = k150Var.f118206b;
            i150 i150Var2 = new i150(i150Var.f97392a, i150Var.f97393b, i150Var.f97394c, i150Var.f97395d, i150Var.f97396e, i150Var.f97397f, i150Var.f97398g, i150Var.f97399h, i150Var.f97400i, i150Var.f97401j, i150Var.f97402k, z2 && !((Boolean) kqi0Var.getValue()).booleanValue(), i150Var.f97404m);
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var2);
            zhi0 zhi0Var = bj5.f27612c;
            ub9 ub9Var = d7f0.f46144O0;
            aaf aafVarM87496a = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61822f);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
            axf1.m27389d((i3 >> 6) & 14, xq00Var, zsf1.m96831B(cxh0Var2, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d), z);
            aaf aafVarM87496a2 = w9f.m87496a(zhi0Var, ub9Var, xq00Var, 0);
            int iHashCode2 = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, cxh0Var2);
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a2, yhhVar, xq00Var);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
            AbstractC0000a.m20s(iHashCode2, xq00Var, yhhVar3, xq00Var, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
            if (!z2 || ((Boolean) kqi0Var.getValue()).booleanValue()) {
                xq00Var.m91771i0(108555144);
                fxh0 fxh0VarM96832C = zsf1.m96832C(cxh0Var2, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 10);
                cxh0Var = cxh0Var2;
                m86569c(0, str, xq00Var, fxh0VarM96832C);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(108234883);
                fxh0 fxh0VarM96832C2 = zsf1.m96832C(cxh0Var2, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 10);
                boolean zM91766g = xq00Var.m91766g(kqi0Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g || objM91750T2 == obj) {
                    objM91750T2 = new pep(kqi0Var, 20);
                    xq00Var.m91793t0(objM91750T2);
                }
                m86567a(0, str, (eh00) objM91750T2, xq00Var, fxh0VarM96832C2);
                xq00Var.m91788r(false);
                cxh0Var = cxh0Var2;
            }
            mif1.m61869b(bmhVar, i150Var2, null, null, xq00Var, (i3 >> 3) & 14, 12);
            xq00Var.m91788r(true);
            ysj0.m94486a(0, 0, xq00Var, zsf1.m96832C(mi21.m61822f(1.0f, cxh0Var), 0.0f, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 5));
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new v20(k150Var, bmhVar, z, fxh0Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m86571e(eh00 eh00Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(-2022972426);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(Boolean.TRUE);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            if (!((Boolean) kqi0Var.getValue()).booleanValue()) {
                pgv0 pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ut21(eh00Var, i, 7);
                    return;
                }
                return;
            }
            fgu fguVarM41474w = fem.m41474w(xq00Var);
            Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
            boolean zM91770i = xq00Var.m91770i(kqi0Var) | ((i2 & 14) == 4);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new puj0(eh00Var, kqi0Var, 16);
                xq00Var.m91793t0(objM91750T2);
            }
            dgu.m35938b((eh00) objM91750T2, fguVarM41474w, null, false, false, 0.0f, false, Boolean.TRUE, false, false, null, rkk.m75772x(1250269941, new bx61(kqi0Var, eh00Var, context, 5), xq00Var), xq00Var, 12582912, 48, 1916);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v2 = xq00Var.m91796v();
        if (pgv0VarM91796v2 != null) {
            pgv0VarM91796v2.f177419d = new ut21(eh00Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m86572f(fyf fyfVar, gh00 gh00Var, kv91 kv91Var, lt91 lt91Var, e940 e940Var, b250 b250Var, xq00 xq00Var, int i) {
        int i2;
        b250 b250Var2;
        Object u201Var;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-1314115708);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fyfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(kv91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(lt91Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(e940Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91766g(b250Var) ? 131072 : 65536;
        }
        int i3 = 1572864 & i;
        cxh0 cxh0Var = cxh0.f43038a;
        if (i3 == 0) {
            i2 |= xq00Var.m91766g(cxh0Var) ? 1048576 : 524288;
        }
        if (xq00Var.m91752Y(i2 & 1, (599187 & i2) != 599186)) {
            fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
            int i4 = 458752 & i2;
            boolean zM91770i = ((i2 & 14) == 4) | xq00Var.m91770i(kv91Var) | xq00Var.m91770i(lt91Var) | xq00Var.m91770i(e940Var) | (i4 == 131072) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == obj) {
                u201Var = new u201(kv91Var, lt91Var, e940Var, b250Var, fyfVar, gh00Var, 3);
                xq00Var.m91793t0(u201Var);
            } else {
                u201Var = objM91750T;
            }
            gh00 gh00Var2 = (gh00) u201Var;
            boolean z = i4 == 131072;
            Object objM91750T2 = xq00Var.m91750T();
            if (z || objM91750T2 == obj) {
                objM91750T2 = new i8p(b250Var, 1);
                xq00Var.m91793t0(objM91750T2);
            }
            g0b1.m43261b(gh00Var2, fxh0VarM61822f, (gh00) objM91750T2, xq00Var, 0, 0);
        } else {
            b250Var2 = b250Var;
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new eh11(fyfVar, gh00Var, kv91Var, lt91Var, e940Var, b250Var2, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static n06 m86573g(dwz dwzVar, iwz iwzVar, dcm0 dcm0Var, w2a1 w2a1Var) {
        dwzVar.getClass();
        dcm0Var.getClass();
        w2a1Var.getClass();
        return new n06(dwzVar, iwzVar, dcm0Var);
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m86574h(jgr[] jgrVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (jgr jgrVar : jgrVarArr) {
            length += ((((jgrVar.f112251g * 2) + 7) & (-8)) / 8) + (jgrVar.f112249e * 2) + m86578l(jgrVar.f112245a, jgrVar.f112246b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + jgrVar.f112250f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, axf1.f20850c)) {
            int length2 = jgrVarArr.length;
            while (i < length2) {
                jgr jgrVar2 = jgrVarArr[i];
                m86563A(byteArrayOutputStream, jgrVar2, m86578l(jgrVar2.f112245a, jgrVar2.f112246b, bArr));
                m86592z(byteArrayOutputStream, jgrVar2);
                i++;
            }
        } else {
            for (jgr jgrVar3 : jgrVarArr) {
                m86563A(byteArrayOutputStream, jgrVar3, m86578l(jgrVar3.f112245a, jgrVar3.f112246b, bArr));
            }
            int length3 = jgrVarArr.length;
            while (i < length3) {
                m86592z(byteArrayOutputStream, jgrVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: i */
    public static xiz m86575i(fiz fizVar, gh00 gh00Var, th00 th00Var, juk jukVar, gh00 gh00Var2, int i) {
        if ((i & 8) != 0) {
            jukVar = xsr.f265652b;
        }
        if ((i & 16) != 0) {
            gh00Var2 = tcz.f219171R0;
        }
        return dxf1.m37242p(fizVar, gh00Var, th00Var, jukVar, gh00Var2);
    }

    /* JADX INFO: renamed from: j */
    public static xiz m86576j(gh00 gh00Var, gh00 gh00Var2, th00 th00Var, gh00 gh00Var3, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        if ((i & 16) != 0) {
            gh00Var3 = m1k.f139001S0;
        }
        return dxf1.m37243q(gh00Var, gh00Var2, th00Var, j1a1Var, gh00Var3);
    }

    /* JADX INFO: renamed from: k */
    public static final void m86577k(Animator animator) {
        if (animator instanceof AnimatorSet) {
            for (Animator animator2 : ((AnimatorSet) animator).getChildAnimations()) {
                wj50.m88279p(animator2);
                m86577k(animator2);
            }
        }
        animator.removeAllListeners();
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).removeAllUpdateListeners();
        }
        animator.cancel();
    }

    /* JADX INFO: renamed from: l */
    public static String m86578l(String str, String str2, byte[] bArr) {
        byte[] bArr2 = axf1.f20852e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = axf1.f20851d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return dq60.m36616p((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2, dq60.m36620t(str));
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m86579m(Type type) {
        if (type == null) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m86579m(type2)) {
                    return true;
                }
            }
        } else if (type instanceof Class) {
            if (ts30.class.isAssignableFrom((Class) type)) {
                return true;
            }
            try {
                return ((Class) type).isAnnotationPresent(ok60.class);
            } catch (NoClassDefFoundError e) {
                Logger.m3967c(e, "Error reading annotation", new Object[0]);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static LinkedHashMap m86580n(Map map) {
        String strValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((AccountAttribute) entry.getValue()).m22096q() != EnumC1863fk.VALUE_NOT_SET) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            AccountAttribute accountAttribute = (AccountAttribute) entry2.getValue();
            EnumC1863fk enumC1863fkM22096q = accountAttribute.m22096q();
            int i = enumC1863fkM22096q == null ? -1 : lkr0.f134440a[enumC1863fkM22096q.ordinal()];
            if (i == -1) {
                throw new IllegalStateException("valuecase is null");
            }
            if (i == 1) {
                strValueOf = accountAttribute.getBoolValue() ? "1" : "0";
            } else if (i == 2) {
                strValueOf = String.valueOf(accountAttribute.m22095p());
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("value not set");
                }
                strValueOf = accountAttribute.getStringValue().toString();
            }
            linkedHashMap2.put(key, strValueOf);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: o */
    public static int[] m86581o(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM60719z = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM60719z += (int) m3l.m60719z(byteArrayInputStream, 2);
            iArr[i2] = iM60719z;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m86582p(FileInputStream fileInputStream, byte[] bArr) {
        if (Arrays.equals(bArr, m3l.m60717x(fileInputStream, bArr.length))) {
            return m3l.m60717x(fileInputStream, 4);
        }
        throw new IllegalStateException("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    public static jgr[] m86583q(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, jgr[] jgrVarArr) throws IOException {
        byte[] bArr3 = axf1.f20853f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, axf1.f20854g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM60719z = (int) m3l.m60719z(fileInputStream, 2);
            byte[] bArrM60718y = m3l.m60718y(fileInputStream, (int) m3l.m60719z(fileInputStream, 4), (int) m3l.m60719z(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM60718y);
            try {
                jgr[] jgrVarArrM86585s = m86585s(byteArrayInputStream, bArr2, iM60719z, jgrVarArr);
                byteArrayInputStream.close();
                return jgrVarArrM86585s;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(axf1.f20848a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM60719z2 = (int) m3l.m60719z(fileInputStream, 1);
        byte[] bArrM60718y2 = m3l.m60718y(fileInputStream, (int) m3l.m60719z(fileInputStream, 4), (int) m3l.m60719z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM60718y2);
        try {
            jgr[] jgrVarArrM86584r = m86584r(byteArrayInputStream2, iM60719z2, jgrVarArr);
            byteArrayInputStream2.close();
            return jgrVarArrM86584r;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: r */
    public static jgr[] m86584r(ByteArrayInputStream byteArrayInputStream, int i, jgr[] jgrVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new jgr[0];
        }
        if (i != jgrVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM60719z = (int) m3l.m60719z(byteArrayInputStream, 2);
            iArr[i2] = (int) m3l.m60719z(byteArrayInputStream, 2);
            strArr[i2] = new String(m3l.m60717x(byteArrayInputStream, iM60719z), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            jgr jgrVar = jgrVarArr[i3];
            if (!jgrVar.f112246b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            jgrVar.f112249e = i4;
            jgrVar.f112252h = m86581o(byteArrayInputStream, i4);
        }
        return jgrVarArr;
    }

    /* JADX INFO: renamed from: s */
    public static jgr[] m86585s(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, jgr[] jgrVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new jgr[0];
        }
        if (i != jgrVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m3l.m60719z(byteArrayInputStream, 2);
            String str = new String(m3l.m60717x(byteArrayInputStream, (int) m3l.m60719z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM60719z = m3l.m60719z(byteArrayInputStream, 4);
            int iM60719z = (int) m3l.m60719z(byteArrayInputStream, 2);
            jgr jgrVar = null;
            if (jgrVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < jgrVarArr.length; i3++) {
                    if (jgrVarArr[i3].f112246b.equals(strSubstring)) {
                        jgrVar = jgrVarArr[i3];
                        break;
                    }
                }
            }
            if (jgrVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            jgrVar.f112248d = jM60719z;
            int[] iArrM86581o = m86581o(byteArrayInputStream, iM60719z);
            if (Arrays.equals(bArr, axf1.f20852e)) {
                jgrVar.f112249e = iM60719z;
                jgrVar.f112252h = iArrM86581o;
            }
        }
        return jgrVarArr;
    }

    /* JADX INFO: renamed from: t */
    public static jgr[] m86586t(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, axf1.f20849b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM60719z = (int) m3l.m60719z(fileInputStream, 1);
        byte[] bArrM60718y = m3l.m60718y(fileInputStream, (int) m3l.m60719z(fileInputStream, 4), (int) m3l.m60719z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM60718y);
        try {
            jgr[] jgrVarArrM86587u = m86587u(byteArrayInputStream, str, iM60719z);
            byteArrayInputStream.close();
            return jgrVarArrM86587u;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public static jgr[] m86587u(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new jgr[0];
        }
        jgr[] jgrVarArr = new jgr[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM60719z = (int) m3l.m60719z(byteArrayInputStream, 2);
            int iM60719z2 = (int) m3l.m60719z(byteArrayInputStream, 2);
            jgrVarArr[i3] = new jgr(str, new String(m3l.m60717x(byteArrayInputStream, iM60719z), StandardCharsets.UTF_8), m3l.m60719z(byteArrayInputStream, 4), iM60719z2, (int) m3l.m60719z(byteArrayInputStream, 4), (int) m3l.m60719z(byteArrayInputStream, 4), new int[iM60719z2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            jgr jgrVar = jgrVarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = jgrVar.f112250f;
            int i6 = jgrVar.f112251g;
            TreeMap treeMap = jgrVar.f112253i;
            int i7 = iAvailable - i5;
            int iM60719z3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM60719z3 += (int) m3l.m60719z(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM60719z3), 1);
                int iM60719z4 = (int) m3l.m60719z(byteArrayInputStream, 2);
                while (iM60719z4 > 0) {
                    m3l.m60719z(byteArrayInputStream, 2);
                    int iM60719z5 = (int) m3l.m60719z(byteArrayInputStream, 1);
                    if (iM60719z5 != 6 && iM60719z5 != 7) {
                        while (iM60719z5 > 0) {
                            m3l.m60719z(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM60719z6 = (int) m3l.m60719z(byteArrayInputStream, 1); iM60719z6 > 0; iM60719z6--) {
                                m3l.m60719z(byteArrayInputStream, 2);
                            }
                            iM60719z5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM60719z4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            jgrVar.f112252h = m86581o(byteArrayInputStream, jgrVar.f112249e);
            BitSet bitSetValueOf = BitSet.valueOf(m3l.m60717x(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return jgrVarArr;
    }

    /* JADX INFO: renamed from: v */
    public static Next m86588v(m6e1 m6e1Var, u90 u90Var, List list) {
        c3e1 c3e1VarMo77540a = u90Var.mo77540a();
        String string = UUID.randomUUID().toString();
        m6e1 m6e1VarM61007a = m6e1.m61007a(m6e1Var, 4, 0, null, null, u90Var, null, null, 2, string, false, null, false, list, 0, null, null, false, 0, 8379613);
        u4e1 u4e1Var = new u4e1(4);
        String str = m6e1Var.f140499l;
        v4e1 v4e1Var = new v4e1(c3e1VarMo77540a, string, str == null ? "" : str);
        String str2 = c3e1VarMo77540a.f33664a;
        n3e1 n3e1Var = m6e1Var.f140507t;
        return Next.m15607i(m6e1VarM61007a, bk5.m29624m1(new a5e1[]{u4e1Var, v4e1Var, new s4e1(new q0m(str2, n3e1Var.f150043b, n3e1Var.f150044c, str == null ? "" : str, string)), c0h1.m31172z(m6e1VarM61007a, 1, new t0m(0, null, null, 0, 0, 31))}));
    }

    /* JADX INFO: renamed from: w */
    public static final Spanned m86589w(List list, boolean z) {
        String str = z ? "• " : "";
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                h6f.m46722S();
                throw null;
            }
            arrayList.add(Html.fromHtml(str + ((String) obj) + (i < list.size() + (-1) ? "<br>" : ""), 0));
            i = i2;
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = new SpannableStringBuilder((Spanned) next).append((CharSequence) it.next());
            }
            Spanned spanned = (Spanned) next;
            if (spanned != null) {
                return spanned;
            }
        }
        return new SpannableStringBuilder("");
    }

    /* JADX INFO: renamed from: x */
    public static boolean m86590x(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, jgr[] jgrVarArr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = axf1.f20848a;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = axf1.f20849b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM86574h = m86574h(jgrVarArr, bArr3);
                m3l.m60692D(byteArrayOutputStream, jgrVarArr.length, 1);
                m3l.m60692D(byteArrayOutputStream, bArrM86574h.length, 4);
                byte[] bArrM60706m = m3l.m60706m(bArrM86574h);
                m3l.m60692D(byteArrayOutputStream, bArrM60706m.length, 4);
                byteArrayOutputStream.write(bArrM60706m);
                return true;
            }
            byte[] bArr4 = axf1.f20851d;
            if (Arrays.equals(bArr, bArr4)) {
                m3l.m60692D(byteArrayOutputStream, jgrVarArr.length, 1);
                for (jgr jgrVar : jgrVarArr) {
                    int size = jgrVar.f112253i.size() * 4;
                    String strM86578l = m86578l(jgrVar.f112245a, jgrVar.f112246b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m3l.m60693E(byteArrayOutputStream, strM86578l.getBytes(charset).length);
                    m3l.m60693E(byteArrayOutputStream, jgrVar.f112252h.length);
                    m3l.m60692D(byteArrayOutputStream, size, 4);
                    m3l.m60692D(byteArrayOutputStream, jgrVar.f112247c, 4);
                    byteArrayOutputStream.write(strM86578l.getBytes(charset));
                    Iterator it = jgrVar.f112253i.keySet().iterator();
                    while (it.hasNext()) {
                        m3l.m60693E(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m3l.m60693E(byteArrayOutputStream, 0);
                    }
                    for (int i2 : jgrVar.f112252h) {
                        m3l.m60693E(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = axf1.f20850c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM86574h2 = m86574h(jgrVarArr, bArr5);
                m3l.m60692D(byteArrayOutputStream, jgrVarArr.length, 1);
                m3l.m60692D(byteArrayOutputStream, bArrM86574h2.length, 4);
                byte[] bArrM60706m2 = m3l.m60706m(bArrM86574h2);
                m3l.m60692D(byteArrayOutputStream, bArrM60706m2.length, 4);
                byteArrayOutputStream.write(bArrM60706m2);
                return true;
            }
            byte[] bArr6 = axf1.f20852e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m3l.m60693E(byteArrayOutputStream, jgrVarArr.length);
            for (jgr jgrVar2 : jgrVarArr) {
                String str = jgrVar2.f112245a;
                TreeMap treeMap = jgrVar2.f112253i;
                String strM86578l2 = m86578l(str, jgrVar2.f112246b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m3l.m60693E(byteArrayOutputStream, strM86578l2.getBytes(charset2).length);
                m3l.m60693E(byteArrayOutputStream, treeMap.size());
                m3l.m60693E(byteArrayOutputStream, jgrVar2.f112252h.length);
                m3l.m60692D(byteArrayOutputStream, jgrVar2.f112247c, 4);
                byteArrayOutputStream.write(strM86578l2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m3l.m60693E(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : jgrVar2.f112252h) {
                    m3l.m60693E(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m3l.m60693E(byteArrayOutputStream2, jgrVarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (jgr jgrVar3 : jgrVarArr) {
                m3l.m60692D(byteArrayOutputStream2, jgrVar3.f112247c, 4);
                m3l.m60692D(byteArrayOutputStream2, jgrVar3.f112248d, 4);
                m3l.m60692D(byteArrayOutputStream2, jgrVar3.f112251g, 4);
                String strM86578l3 = m86578l(jgrVar3.f112245a, jgrVar3.f112246b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM86578l3.getBytes(charset3).length;
                m3l.m60693E(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM86578l3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            hfe1 hfe1Var = new hfe1(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(hfe1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < jgrVarArr.length) {
                try {
                    jgr jgrVar4 = jgrVarArr[i6];
                    m3l.m60693E(byteArrayOutputStream3, i6);
                    m3l.m60693E(byteArrayOutputStream3, jgrVar4.f112249e);
                    i7 = i7 + 4 + (jgrVar4.f112249e * i4);
                    int[] iArr = jgrVar4.f112252h;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        m3l.m60693E(byteArrayOutputStream3, i11 - i8);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            hfe1 hfe1Var2 = new hfe1(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(hfe1Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < jgrVarArr.length) {
                try {
                    jgr jgrVar5 = jgrVarArr[i12];
                    Iterator it3 = jgrVar5.f112253i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m86564B(byteArrayOutputStream5, iIntValue, jgrVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m86565C(byteArrayOutputStream6, jgrVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            m3l.m60693E(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m3l.m60692D(byteArrayOutputStream4, length4, 4);
                            m3l.m60693E(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            hfe1 hfe1Var3 = new hfe1(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(hfe1Var3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
            m3l.m60692D(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                hfe1 hfe1Var4 = (hfe1) arrayList2.get(i15);
                int i16 = hfe1Var4.f90723a;
                byte[] bArr7 = hfe1Var4.f90724b;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == 2) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                m3l.m60692D(byteArrayOutputStream, j, 4);
                m3l.m60692D(byteArrayOutputStream, size2, 4);
                if (hfe1Var4.f90725c) {
                    long length5 = bArr7.length;
                    byte[] bArrM60706m3 = m3l.m60706m(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM60706m3);
                    m3l.m60692D(byteArrayOutputStream, bArrM60706m3.length, 4);
                    m3l.m60692D(byteArrayOutputStream, length5, 4);
                    length = bArrM60706m3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m3l.m60692D(byteArrayOutputStream, bArr7.length, 4);
                    m3l.m60692D(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static final SpannableString m86591y(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* JADX INFO: renamed from: z */
    public static void m86592z(ByteArrayOutputStream byteArrayOutputStream, jgr jgrVar) throws IOException {
        m86565C(byteArrayOutputStream, jgrVar);
        int i = jgrVar.f112251g;
        int[] iArr = jgrVar.f112252h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            m3l.m60693E(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : jgrVar.f112253i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }
}
