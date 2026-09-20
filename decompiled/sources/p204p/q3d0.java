package p204p;

import androidx.car.app.model.Alert;
import com.comscore.streaming.ContentType;
import com.google.android.gms.tasks.Task;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q3d0 {

    /* JADX INFO: renamed from: a */
    public static final lrl f184847a = new lrl();

    /* JADX INFO: renamed from: b */
    public static final Object f184848b = new Object();

    /* JADX INFO: renamed from: A */
    public static final j15 m72070A(o971 o971Var) {
        j15 j15Var = o971Var.f162953a;
        long j = o971Var.f162954b;
        j15Var.getClass();
        return j15Var.subSequence(ic71.m50239g(j), ic71.m50238f(j));
    }

    /* JADX INFO: renamed from: B */
    public static long m72071B(double d) {
        c95.m31844j(m72076G(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: C */
    public static final j15 m72072C(o971 o971Var, int i) {
        j15 j15Var = o971Var.f162953a;
        j15 j15Var2 = o971Var.f162953a;
        long j = o971Var.f162954b;
        int iM50238f = ic71.m50238f(j);
        int iM50238f2 = ic71.m50238f(j);
        int length = iM50238f2 + i;
        if (((i ^ length) & (iM50238f2 ^ length)) < 0) {
            length = j15Var2.f107641b.length();
        }
        return j15Var.subSequence(iM50238f, Math.min(length, j15Var2.f107641b.length()));
    }

    /* JADX INFO: renamed from: D */
    public static final j15 m72073D(o971 o971Var, int i) {
        j15 j15Var = o971Var.f162953a;
        long j = o971Var.f162954b;
        int iM50239g = ic71.m50239g(j);
        int i2 = iM50239g - i;
        if (((iM50239g ^ i2) & (i ^ iM50239g)) < 0) {
            i2 = 0;
        }
        return j15Var.subSequence(Math.max(0, i2), ic71.m50239g(j));
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m72074E(rzl0 rzl0Var, Map map, Map map2) {
        Double dM29805p0;
        Double dM29805p1;
        if (rzl0Var.m76821h() == 0.0d && rzl0Var.m76822j() == 0.0d) {
            return true;
        }
        String str = (String) map.get("item.speed");
        double dDoubleValue = 1.0d;
        double dDoubleValue2 = (str == null || (dM29805p1 = bm51.m29805p0(str)) == null) ? 1.0d : dM29805p1.doubleValue();
        String str2 = (String) map2.get("item.speed");
        if (str2 != null && (dM29805p0 = bm51.m29805p0(str2)) != null) {
            dDoubleValue = dM29805p0.doubleValue();
        }
        double dM76821h = rzl0Var.m76821h();
        if (dM76821h != 0.0d && Math.abs(dM76821h - dDoubleValue2) > 0.001d) {
            return false;
        }
        double dM76822j = rzl0Var.m76822j();
        return dM76822j == 0.0d || Math.abs(dM76822j - dDoubleValue) <= 0.001d;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m72075F(i0r0 i0r0Var) {
        return (i0r0Var.m49380F() == null && i0r0Var.m49383j() == null && i0r0Var.m49384k() == null && i0r0Var.m49389v() == null && i0r0Var.m49390w() == null && i0r0Var.m49377A() == null && i0r0Var.m49379E() == null && i0r0Var.m49378C() == null && i0r0Var.m49382h() == null && i0r0Var.m49381g() == null && i0r0Var.m49386m() == null && i0r0Var.m49385l() == null && i0r0Var.m49388u() == null && i0r0Var.m49387q() == null) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m72076G(double d) {
        return Math.getExponent(d) <= 1023;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m72077H(zlx0 zlx0Var) {
        long j = zlx0Var.f284099e;
        return (j >>> 32) == (4294967295L & j) && j == zlx0Var.f284100f && j == zlx0Var.f284101g && j == zlx0Var.f284102h;
    }

    /* JADX INFO: renamed from: I */
    public static fr70 m72078I(int i, eh00 eh00Var) {
        hcj0 hcj0Var = hcj0.f89811P0;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return new wg61(eh00Var);
        }
        if (iM38547C == 1) {
            a0y0 a0y0Var = new a0y0();
            a0y0Var.f11214a = eh00Var;
            a0y0Var.f11215b = hcj0Var;
            return a0y0Var;
        }
        if (iM38547C != 2) {
            throw new NoWhenBranchMatchedException();
        }
        f4a1 f4a1Var = new f4a1();
        f4a1Var.f65720a = eh00Var;
        f4a1Var.f65721b = hcj0Var;
        return f4a1Var;
    }

    /* JADX INFO: renamed from: J */
    public static int m72079J(int i) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i <= 0) {
            throw new IllegalArgumentException(edb.m38563l("x (", i, ") must be > 0"));
        }
        switch (v350.f236786a[roundingMode.ordinal()]) {
            case 1:
                jq60.m54068n((i > 0) & (((i + (-1)) & i) == 0));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: K */
    public static final String m72080K(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return bm51.m29795f0(0, bArr, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    zn91.m96584x(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    /* JADX INFO: renamed from: L */
    public static y7h1 m72081L(Task task, Task task2) {
        px0 px0Var = new px0(20);
        ev61 ev61Var = new ev61((c4d1) px0Var.f182174b);
        n4l n4lVar = new n4l(ev61Var, new AtomicBoolean(false), px0Var);
        lrl lrlVar = f184847a;
        task.mo1513e(lrlVar, n4lVar);
        task2.mo1513e(lrlVar, n4lVar);
        return ev61Var.f63172a;
    }

    /* JADX INFO: renamed from: M */
    public static int m72082M(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* JADX INFO: renamed from: N */
    public static int m72083N(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* JADX INFO: renamed from: O */
    public static long m72084O(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    /* JADX INFO: renamed from: P */
    public static mja1 m72085P(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = tbn0.f218907b;
        String strM29801l0 = !wj50.m88271j(str2, "/") ? bm51.m29801l0(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strM29801l0.length()) {
            char cCharAt = strM29801l0.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strM29801l0.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int i8 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strM29801l0.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strM29801l0.substring(0, i6);
            if (i3 != -1) {
                i8 = i3;
            }
            strSubstring = strM29801l0.substring(i5, Math.min(i8, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strM29801l0.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strM29801l0.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strM29801l0.substring(i2, strM29801l0.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strM72080K = strSubstring2 != null ? m72080K(strSubstring2, bArr) : null;
        String strM72080K2 = strSubstring != null ? m72080K(strSubstring, bArr) : null;
        String strM72080K3 = strSubstring3 != null ? m72080K(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            m72080K(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            m72080K(strSubstring5, bArr);
        }
        return new mja1(strM29801l0, str2, strM72080K, strM72080K2, strM72080K3);
    }

    /* JADX INFO: renamed from: Q */
    public static ByteBuffer m72086Q(String str, List list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += ((ByteBuffer) list.get(i)).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: R */
    public static ByteBuffer m72087R(String str, ByteBuffer byteBuffer) {
        return m72088S(byteBuffer, str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: S */
    public static ByteBuffer m72088S(ByteBuffer byteBuffer, byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: T */
    public static final jzf1 m72089T(d0g1 d0g1Var, bgf1 bgf1Var) {
        uff1 uff1Var = (uff1) bgf1Var.m58557j();
        uff1Var.m82998l(d0g1Var.zza());
        return new jzf1(d0g1Var.zza(), (bgf1) uff1Var.m52814g());
    }

    /* JADX INFO: renamed from: U */
    public static final gzf1 m72090U(d0g1 d0g1Var, tff1 tff1Var) {
        sff1 sff1Var = (sff1) tff1Var.m58557j();
        sff1Var.m78004i(d0g1Var.zza());
        return new gzf1(d0g1Var.zza(), (tff1) sff1Var.m52814g());
    }

    /* JADX INFO: renamed from: a */
    public static final void m72091a(dl1 dl1Var, fxh0 fxh0Var, eh00 eh00Var, xq00 xq00Var, int i) {
        dl1 dl1Var2;
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-1025158362);
        if ((i & 6) == 0) {
            dl1Var2 = dl1Var;
            i2 = (xq00Var.m91766g(dl1Var2) ? 4 : 2) | i;
        } else {
            dl1Var2 = dl1Var;
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM39673I = epv0.m39673I("add_to_library_button", cxh0Var);
            rgu rguVarM86517r = vvx.m86517r(xq00Var);
            pi1 pi1Var = new pi1(dl1Var2.m36339b() ? qi1.f188893b : qi1.f188892a, false, dl1Var2.m36338a(), k0e1.m54977L(R.string.action_bar_add_to_library_context_accessibility, xq00Var), null, 18);
            udu qduVar = dl1Var2.m36340c() ? sdu.f208086a : new qdu("TODO");
            boolean z = (i3 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new C1689b2(9, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            bxg1.m30824a(pi1Var, new peu(u40.f226523c, (eh00) objM91750T), fxh0VarM39673I, qduVar, rguVarM86517r, xq00Var, 0, 0);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1967i5((Object) dl1Var2, fxh0Var2, (ai00) eh00Var, i, 12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m72092b(boolean z, eh00 eh00Var, String str, fxh0 fxh0Var, voi0 voi0Var, udu uduVar, th00 th00Var, ch01 ch01Var, ho40 ho40Var, int i, xq00 xq00Var, int i2) {
        fxh0 fxh0Var2;
        voi0 voi0Var2;
        udu uduVar2;
        th00 th00Var2;
        ch01 ch01Var2;
        ho40 ho40Var2;
        int i3;
        int i4;
        fxh0 fxh0Var3;
        int i5;
        ch01 ch01Var3;
        ho40 ho40Var3;
        udu uduVar3;
        voi0 voi0Var3;
        th00 th00Var3;
        xq00Var.m91775k0(-356952923);
        int i6 = i2 | (xq00Var.m91768h(z) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91766g(str) ? 256 : 128) | 316238848;
        if (xq00Var.m91752Y(i6 & 1, (306783379 & i6) != 306783378)) {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                voi0 voi0VarM66157n = o2z0.m66157n(xq00Var);
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == t6x0.f217647t) {
                    objM91750T = uju.f231148t;
                    xq00Var.m91793t0(objM91750T);
                }
                fmx0 fmx0VarM38611j = edo.m38611j(xq00Var);
                ho40 ho40VarM67553c = opo.m67553c(fmx0VarM38611j, xq00Var, 0);
                i4 = i6 & (-2114387969);
                fxh0Var3 = cxh0.f43038a;
                i5 = 1;
                ch01Var3 = fmx0VarM38611j;
                ho40Var3 = ho40VarM67553c;
                uduVar3 = sdu.f208086a;
                voi0Var3 = voi0VarM66157n;
                th00Var3 = (th00) objM91750T;
            } else {
                xq00Var.m91757b0();
                i4 = i6 & (-2114387969);
                fxh0Var3 = fxh0Var;
                voi0Var3 = voi0Var;
                uduVar3 = uduVar;
                th00Var3 = th00Var;
                ch01Var3 = ch01Var;
                ho40Var3 = ho40Var;
                i5 = i;
            }
            xq00Var.m91790s();
            xq00Var.m91771i0(355333145);
            xq00Var.m91788r(false);
            fxh0 fxh0Var4 = fxh0Var3;
            m72093c(z, eh00Var, rkk.m75772x(-341743899, new wuh(str, 19, (byte) 0), xq00Var), fxh0Var4, null, voi0Var3, uduVar3, th00Var3, ch01Var3, ho40Var3, i5, xq00Var, (i4 & ContentType.LONG_FORM_ON_DEMAND) | (i4 & 14) | 384 | 14158848, 6, 0);
            fxh0Var2 = fxh0Var4;
            voi0Var2 = voi0Var3;
            uduVar2 = uduVar3;
            th00Var2 = th00Var3;
            ch01Var2 = ch01Var3;
            ho40Var2 = ho40Var3;
            i3 = i5;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            voi0Var2 = voi0Var;
            uduVar2 = uduVar;
            th00Var2 = th00Var;
            ch01Var2 = ch01Var;
            ho40Var2 = ho40Var;
            i3 = i;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dp5(z, eh00Var, str, fxh0Var2, voi0Var2, uduVar2, th00Var2, ch01Var2, ho40Var2, i3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x011a  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0120  */
    /* JADX WARN: Code duplicated, block: B:108:0x0127  */
    /* JADX WARN: Code duplicated, block: B:111:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0134  */
    /* JADX WARN: Code duplicated, block: B:114:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x014b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:124:0x015e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0170  */
    /* JADX WARN: Code duplicated, block: B:140:0x019b A[PHI: r1 r6 r7 r9 r11 r12 r13 r22
      0x019b: PHI (r1v28 p.fxh0) = (r1v18 p.fxh0), (r1v35 p.fxh0) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r6v13 p.th00) = (r6v5 p.th00), (r6v16 p.th00) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r7v10 p.th00) = (r7v4 p.th00), (r7v11 p.th00) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r9v10 p.udu) = (r9v6 p.udu), (r9v11 p.udu) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r11v11 p.voi0) = (r11v7 p.voi0), (r11v12 p.voi0) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r12v13 p.ch01) = (r12v8 p.ch01), (r12v14 p.ch01) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r13v15 p.ho40) = (r13v6 p.ho40), (r13v16 p.ho40) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]
      0x019b: PHI (r22v8 int) = (r22v3 int), (r22v9 int) binds: [B:168:0x01f1, B:139:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01de  */
    /* JADX WARN: Code duplicated, block: B:166:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:169:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:172:0x0202  */
    /* JADX WARN: Code duplicated, block: B:175:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x0210  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:183:0x02da  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    /* JADX INFO: renamed from: c */
    public static final void m72093c(boolean z, eh00 eh00Var, fyf fyfVar, fxh0 fxh0Var, th00 th00Var, voi0 voi0Var, udu uduVar, th00 th00Var2, ch01 ch01Var, ho40 ho40Var, int i, xq00 xq00Var, int i2, int i3, int i4) {
        int i5;
        eh00 eh00Var2;
        fxh0 fxh0Var2;
        int i6;
        th00 th00Var3;
        int i7;
        voi0 voi0Var2;
        int i8;
        udu uduVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iM38547C;
        int i14;
        int i15;
        boolean z2;
        th00 th00Var4;
        ch01 ch01Var2;
        ho40 ho40Var2;
        fxh0 fxh0Var3;
        th00 th00Var5;
        voi0 voi0Var3;
        int i16;
        pgv0 pgv0VarM91796v;
        int i17;
        sdu sduVar;
        fxh0 fxh0Var4;
        th00 th00Var6;
        voi0 voi0VarM66157n;
        th00 th00Var7;
        ch01 ch01VarM38611j;
        ho40 ho40VarM67553c;
        th00 th00Var8;
        th00 th00Var9;
        udu uduVar3;
        int i18;
        Object objM91750T;
        boolean z3;
        Object objM91750T2;
        th00 th00Var10;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(2036930470);
        if ((i2 & 6) == 0) {
            i5 = (xq00Var.m91768h(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            eh00Var2 = eh00Var;
            i5 |= xq00Var.m91770i(eh00Var2) ? 32 : 16;
        } else {
            eh00Var2 = eh00Var;
        }
        if ((i2 & 384) == 0) {
            i5 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        int i19 = i4 & 8;
        if (i19 == 0) {
            if ((i2 & 3072) == 0) {
                fxh0Var2 = fxh0Var;
                i5 |= xq00Var.m91766g(fxh0Var2) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    th00Var3 = th00Var;
                    if (xq00Var.m91770i(th00Var3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                if ((196608 & i2) == 0) {
                    if ((i4 & 32) == 0) {
                        voi0Var2 = voi0Var;
                        int i20 = xq00Var.m91766g(voi0Var2) ? 131072 : 65536;
                        i5 |= i20;
                    } else {
                        voi0Var2 = voi0Var;
                    }
                    i5 |= i20;
                } else {
                    voi0Var2 = voi0Var;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    uduVar2 = uduVar;
                } else {
                    uduVar2 = uduVar;
                    if ((i2 & 1572864) == 0) {
                        if (xq00Var.m91766g(uduVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i4 & 128;
                if (i10 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (xq00Var.m91770i(th00Var2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
                if ((i2 & 100663296) != 0) {
                    i5 |= ((i4 & 256) == 0 || !xq00Var.m91766g(ch01Var)) ? 33554432 : 67108864;
                }
                if ((i2 & 805306368) != 0) {
                    i5 |= ((i4 & 512) == 0 || !xq00Var.m91766g(ho40Var)) ? 268435456 : 536870912;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    if (i == 0) {
                        iM38547C = -1;
                    } else {
                        iM38547C = edb.m38547C(i);
                    }
                    if (xq00Var.m91762e(iM38547C)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i3 | i14;
                } else {
                    i13 = i3;
                }
                i15 = i5;
                if ((306783379 & i5) == 306783378 || (i13 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (xq00Var.m91752Y(i15 & 1, z2)) {
                    xq00Var.m91761d0();
                    i17 = i2 & 1;
                    sduVar = sdu.f208086a;
                    if (i17 != 0 || xq00Var.m91735E()) {
                        if (i19 != 0) {
                            fxh0Var4 = cxh0.f43038a;
                        } else {
                            fxh0Var4 = fxh0Var2;
                        }
                        if (i6 != 0) {
                            th00Var6 = null;
                        } else {
                            th00Var6 = th00Var3;
                        }
                        if ((i4 & 32) != 0) {
                            voi0VarM66157n = o2z0.m66157n(xq00Var);
                            i15 &= -458753;
                        } else {
                            voi0VarM66157n = voi0Var2;
                        }
                        if (i8 != 0) {
                            uduVar2 = sduVar;
                        }
                        if (i10 != 0) {
                            objM91750T = xq00Var.m91750T();
                            if (objM91750T == ia7Var) {
                                objM91750T = uju.f231147i;
                                xq00Var.m91793t0(objM91750T);
                            }
                            th00Var7 = (th00) objM91750T;
                        } else {
                            th00Var7 = th00Var2;
                        }
                        if ((i4 & 256) != 0) {
                            ch01VarM38611j = edo.m38611j(xq00Var);
                            i15 &= -234881025;
                        } else {
                            ch01VarM38611j = ch01Var;
                        }
                        if ((i4 & 512) != 0) {
                            ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                            i15 &= -1879048193;
                        } else {
                            ho40VarM67553c = ho40Var;
                        }
                        udu uduVar4 = uduVar2;
                        th00Var8 = th00Var7;
                        th00Var9 = th00Var6;
                        uduVar3 = uduVar4;
                        if (i12 != 0) {
                            i18 = 1;
                        }
                        xq00Var.m91790s();
                        fxh0 fxh0Var5 = fxh0Var4;
                        z3 = (i15 & 29360128) == 8388608;
                        objM91750T2 = xq00Var.m91750T();
                        if (!z3 || objM91750T2 == ia7Var) {
                            th00 th00Var11 = th00Var8;
                            objM91750T2 = new rju(0, uju.f231131X, null, th00Var11, 5);
                            th00Var10 = th00Var11;
                            xq00Var.m91793t0(objM91750T2);
                        } else {
                            th00Var10 = th00Var8;
                        }
                        ho40 ho40Var3 = ho40VarM67553c;
                        th00 th00Var12 = th00Var9;
                        ch01 ch01Var3 = ch01VarM38611j;
                        zn91.m96545d(bzf1.m31025q(mi21.m61837u(fxh0Var5, 0.0f, yds.m93474d(i18, xq00Var), 0.0f, 0.0f, 13), z, voi0VarM66157n, ho40Var3, wj50.m88271j(uduVar3, sduVar), new tix0(4), eh00Var2), null, ch01Var3, (wju) objM91750T2, zsf1.m96847g(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), uduVar3, z, voi0VarM66157n, null, null, null, rkk.m75772x(-670541425, new d9j(20, th00Var9, fyfVar), xq00Var), xq00Var, ((i15 >> 18) & 896) | 100663296 | ((i15 >> 3) & 458752) | (3670016 & (i15 << 18)) | ((i15 << 6) & 29360128), 48, 1538);
                        th00Var5 = th00Var12;
                        ho40Var2 = ho40Var3;
                        uduVar2 = uduVar3;
                        th00Var4 = th00Var10;
                        fxh0Var3 = fxh0Var5;
                        ch01Var2 = ch01Var3;
                        voi0Var3 = voi0VarM66157n;
                        i16 = i18;
                    } else {
                        xq00Var.m91757b0();
                        int i21 = (i4 & 32) != 0 ? i15 & (-458753) : i15;
                        if ((i4 & 256) != 0) {
                            i21 &= -234881025;
                        }
                        if ((i4 & 512) != 0) {
                            i21 &= -1879048193;
                        }
                        ch01VarM38611j = ch01Var;
                        i15 = i21;
                        uduVar3 = uduVar2;
                        fxh0Var4 = fxh0Var2;
                        th00Var9 = th00Var3;
                        voi0VarM66157n = voi0Var2;
                        th00Var8 = th00Var2;
                        ho40VarM67553c = ho40Var;
                    }
                    i18 = i;
                    xq00Var.m91790s();
                    fxh0 fxh0Var6 = fxh0Var4;
                    if ((i15 & 29360128) == 8388608) {
                    }
                    objM91750T2 = xq00Var.m91750T();
                    if (z3) {
                        th00 th00Var13 = th00Var8;
                        objM91750T2 = new rju(0, uju.f231131X, null, th00Var13, 5);
                        th00Var10 = th00Var13;
                        xq00Var.m91793t0(objM91750T2);
                    } else {
                        th00 th00Var14 = th00Var8;
                        objM91750T2 = new rju(0, uju.f231131X, null, th00Var14, 5);
                        th00Var10 = th00Var14;
                        xq00Var.m91793t0(objM91750T2);
                    }
                    ho40 ho40Var4 = ho40VarM67553c;
                    th00 th00Var15 = th00Var9;
                    ch01 ch01Var4 = ch01VarM38611j;
                    zn91.m96545d(bzf1.m31025q(mi21.m61837u(fxh0Var6, 0.0f, yds.m93474d(i18, xq00Var), 0.0f, 0.0f, 13), z, voi0VarM66157n, ho40Var4, wj50.m88271j(uduVar3, sduVar), new tix0(4), eh00Var2), null, ch01Var4, (wju) objM91750T2, zsf1.m96847g(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), uduVar3, z, voi0VarM66157n, null, null, null, rkk.m75772x(-670541425, new d9j(20, th00Var9, fyfVar), xq00Var), xq00Var, ((i15 >> 18) & 896) | 100663296 | ((i15 >> 3) & 458752) | (3670016 & (i15 << 18)) | ((i15 << 6) & 29360128), 48, 1538);
                    th00Var5 = th00Var15;
                    ho40Var2 = ho40Var4;
                    uduVar2 = uduVar3;
                    th00Var4 = th00Var10;
                    fxh0Var3 = fxh0Var6;
                    ch01Var2 = ch01Var4;
                    voi0Var3 = voi0VarM66157n;
                    i16 = i18;
                } else {
                    xq00Var.m91757b0();
                    th00Var4 = th00Var2;
                    ch01Var2 = ch01Var;
                    ho40Var2 = ho40Var;
                    fxh0Var3 = fxh0Var2;
                    th00Var5 = th00Var3;
                    voi0Var3 = voi0Var2;
                    i16 = i;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new g0v(z, eh00Var, fyfVar, fxh0Var3, th00Var5, voi0Var3, uduVar2, th00Var4, ch01Var2, ho40Var2, i16, i2, i3, i4);
                }
            }
            i5 |= 24576;
            th00Var3 = th00Var;
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    voi0Var2 = voi0Var;
                    if (xq00Var.m91766g(voi0Var2)) {
                    }
                    i5 |= i20;
                } else {
                    voi0Var2 = voi0Var;
                }
                i5 |= i20;
            } else {
                voi0Var2 = voi0Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                uduVar2 = uduVar;
            } else {
                uduVar2 = uduVar;
                if ((i2 & 1572864) == 0) {
                    if (xq00Var.m91766g(uduVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (xq00Var.m91770i(th00Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((i2 & 100663296) != 0) {
                i5 |= ((i4 & 256) == 0 || !xq00Var.m91766g(ch01Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & 512) == 0 || !xq00Var.m91766g(ho40Var)) ? 268435456 : 536870912;
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
                i13 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (i == 0) {
                    iM38547C = -1;
                } else {
                    iM38547C = edb.m38547C(i);
                }
                if (xq00Var.m91762e(iM38547C)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            i15 = i5;
            if ((306783379 & i5) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (xq00Var.m91752Y(i15 & 1, z2)) {
                xq00Var.m91761d0();
                i17 = i2 & 1;
                sduVar = sdu.f208086a;
                if (i17 != 0) {
                    if (i19 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i6 != 0) {
                        th00Var6 = null;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if ((i4 & 32) != 0) {
                        voi0VarM66157n = o2z0.m66157n(xq00Var);
                        i15 &= -458753;
                    } else {
                        voi0VarM66157n = voi0Var2;
                    }
                    if (i8 != 0) {
                        uduVar2 = sduVar;
                    }
                    if (i10 != 0) {
                        objM91750T = xq00Var.m91750T();
                        if (objM91750T == ia7Var) {
                            objM91750T = uju.f231147i;
                            xq00Var.m91793t0(objM91750T);
                        }
                        th00Var7 = (th00) objM91750T;
                    } else {
                        th00Var7 = th00Var2;
                    }
                    if ((i4 & 256) != 0) {
                        ch01VarM38611j = edo.m38611j(xq00Var);
                        i15 &= -234881025;
                    } else {
                        ch01VarM38611j = ch01Var;
                    }
                    if ((i4 & 512) != 0) {
                        ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                        i15 &= -1879048193;
                    } else {
                        ho40VarM67553c = ho40Var;
                    }
                    udu uduVar5 = uduVar2;
                    th00Var8 = th00Var7;
                    th00Var9 = th00Var6;
                    uduVar3 = uduVar5;
                    if (i12 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                } else {
                    if (i19 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i6 != 0) {
                        th00Var6 = null;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if ((i4 & 32) != 0) {
                        voi0VarM66157n = o2z0.m66157n(xq00Var);
                        i15 &= -458753;
                    } else {
                        voi0VarM66157n = voi0Var2;
                    }
                    if (i8 != 0) {
                        uduVar2 = sduVar;
                    }
                    if (i10 != 0) {
                        objM91750T = xq00Var.m91750T();
                        if (objM91750T == ia7Var) {
                            objM91750T = uju.f231147i;
                            xq00Var.m91793t0(objM91750T);
                        }
                        th00Var7 = (th00) objM91750T;
                    } else {
                        th00Var7 = th00Var2;
                    }
                    if ((i4 & 256) != 0) {
                        ch01VarM38611j = edo.m38611j(xq00Var);
                        i15 &= -234881025;
                    } else {
                        ch01VarM38611j = ch01Var;
                    }
                    if ((i4 & 512) != 0) {
                        ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                        i15 &= -1879048193;
                    } else {
                        ho40VarM67553c = ho40Var;
                    }
                    udu uduVar6 = uduVar2;
                    th00Var8 = th00Var7;
                    th00Var9 = th00Var6;
                    uduVar3 = uduVar6;
                    if (i12 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                }
                xq00Var.m91790s();
                fxh0 fxh0Var7 = fxh0Var4;
                if ((i15 & 29360128) == 8388608) {
                }
                objM91750T2 = xq00Var.m91750T();
                if (z3) {
                    th00 th00Var16 = th00Var8;
                    objM91750T2 = new rju(0, uju.f231131X, null, th00Var16, 5);
                    th00Var10 = th00Var16;
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    th00 th00Var17 = th00Var8;
                    objM91750T2 = new rju(0, uju.f231131X, null, th00Var17, 5);
                    th00Var10 = th00Var17;
                    xq00Var.m91793t0(objM91750T2);
                }
                ho40 ho40Var5 = ho40VarM67553c;
                th00 th00Var18 = th00Var9;
                ch01 ch01Var5 = ch01VarM38611j;
                zn91.m96545d(bzf1.m31025q(mi21.m61837u(fxh0Var7, 0.0f, yds.m93474d(i18, xq00Var), 0.0f, 0.0f, 13), z, voi0VarM66157n, ho40Var5, wj50.m88271j(uduVar3, sduVar), new tix0(4), eh00Var2), null, ch01Var5, (wju) objM91750T2, zsf1.m96847g(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), uduVar3, z, voi0VarM66157n, null, null, null, rkk.m75772x(-670541425, new d9j(20, th00Var9, fyfVar), xq00Var), xq00Var, ((i15 >> 18) & 896) | 100663296 | ((i15 >> 3) & 458752) | (3670016 & (i15 << 18)) | ((i15 << 6) & 29360128), 48, 1538);
                th00Var5 = th00Var18;
                ho40Var2 = ho40Var5;
                uduVar2 = uduVar3;
                th00Var4 = th00Var10;
                fxh0Var3 = fxh0Var7;
                ch01Var2 = ch01Var5;
                voi0Var3 = voi0VarM66157n;
                i16 = i18;
            } else {
                xq00Var.m91757b0();
                th00Var4 = th00Var2;
                ch01Var2 = ch01Var;
                ho40Var2 = ho40Var;
                fxh0Var3 = fxh0Var2;
                th00Var5 = th00Var3;
                voi0Var3 = voi0Var2;
                i16 = i;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new g0v(z, eh00Var, fyfVar, fxh0Var3, th00Var5, voi0Var3, uduVar2, th00Var4, ch01Var2, ho40Var2, i16, i2, i3, i4);
            }
        }
        i5 |= 3072;
        fxh0Var2 = fxh0Var;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                th00Var3 = th00Var;
                if (xq00Var.m91770i(th00Var3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            if ((196608 & i2) == 0) {
                if ((i4 & 32) == 0) {
                    voi0Var2 = voi0Var;
                    if (xq00Var.m91766g(voi0Var2)) {
                    }
                    i5 |= i20;
                } else {
                    voi0Var2 = voi0Var;
                }
                i5 |= i20;
            } else {
                voi0Var2 = voi0Var;
            }
            i8 = i4 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                uduVar2 = uduVar;
            } else {
                uduVar2 = uduVar;
                if ((i2 & 1572864) == 0) {
                    if (xq00Var.m91766g(uduVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i4 & 128;
            if (i10 != 0) {
                i5 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (xq00Var.m91770i(th00Var2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
            if ((i2 & 100663296) != 0) {
                i5 |= ((i4 & 256) == 0 || !xq00Var.m91766g(ch01Var)) ? 33554432 : 67108864;
            }
            if ((i2 & 805306368) != 0) {
                i5 |= ((i4 & 512) == 0 || !xq00Var.m91766g(ho40Var)) ? 268435456 : 536870912;
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
                i13 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                if (i == 0) {
                    iM38547C = -1;
                } else {
                    iM38547C = edb.m38547C(i);
                }
                if (xq00Var.m91762e(iM38547C)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i3 | i14;
            } else {
                i13 = i3;
            }
            i15 = i5;
            if ((306783379 & i5) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (xq00Var.m91752Y(i15 & 1, z2)) {
                xq00Var.m91761d0();
                i17 = i2 & 1;
                sduVar = sdu.f208086a;
                if (i17 != 0) {
                    if (i19 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i6 != 0) {
                        th00Var6 = null;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if ((i4 & 32) != 0) {
                        voi0VarM66157n = o2z0.m66157n(xq00Var);
                        i15 &= -458753;
                    } else {
                        voi0VarM66157n = voi0Var2;
                    }
                    if (i8 != 0) {
                        uduVar2 = sduVar;
                    }
                    if (i10 != 0) {
                        objM91750T = xq00Var.m91750T();
                        if (objM91750T == ia7Var) {
                            objM91750T = uju.f231147i;
                            xq00Var.m91793t0(objM91750T);
                        }
                        th00Var7 = (th00) objM91750T;
                    } else {
                        th00Var7 = th00Var2;
                    }
                    if ((i4 & 256) != 0) {
                        ch01VarM38611j = edo.m38611j(xq00Var);
                        i15 &= -234881025;
                    } else {
                        ch01VarM38611j = ch01Var;
                    }
                    if ((i4 & 512) != 0) {
                        ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                        i15 &= -1879048193;
                    } else {
                        ho40VarM67553c = ho40Var;
                    }
                    udu uduVar7 = uduVar2;
                    th00Var8 = th00Var7;
                    th00Var9 = th00Var6;
                    uduVar3 = uduVar7;
                    if (i12 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                } else {
                    if (i19 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    if (i6 != 0) {
                        th00Var6 = null;
                    } else {
                        th00Var6 = th00Var3;
                    }
                    if ((i4 & 32) != 0) {
                        voi0VarM66157n = o2z0.m66157n(xq00Var);
                        i15 &= -458753;
                    } else {
                        voi0VarM66157n = voi0Var2;
                    }
                    if (i8 != 0) {
                        uduVar2 = sduVar;
                    }
                    if (i10 != 0) {
                        objM91750T = xq00Var.m91750T();
                        if (objM91750T == ia7Var) {
                            objM91750T = uju.f231147i;
                            xq00Var.m91793t0(objM91750T);
                        }
                        th00Var7 = (th00) objM91750T;
                    } else {
                        th00Var7 = th00Var2;
                    }
                    if ((i4 & 256) != 0) {
                        ch01VarM38611j = edo.m38611j(xq00Var);
                        i15 &= -234881025;
                    } else {
                        ch01VarM38611j = ch01Var;
                    }
                    if ((i4 & 512) != 0) {
                        ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                        i15 &= -1879048193;
                    } else {
                        ho40VarM67553c = ho40Var;
                    }
                    udu uduVar8 = uduVar2;
                    th00Var8 = th00Var7;
                    th00Var9 = th00Var6;
                    uduVar3 = uduVar8;
                    if (i12 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                }
                xq00Var.m91790s();
                fxh0 fxh0Var8 = fxh0Var4;
                if ((i15 & 29360128) == 8388608) {
                }
                objM91750T2 = xq00Var.m91750T();
                if (z3) {
                    th00 th00Var19 = th00Var8;
                    objM91750T2 = new rju(0, uju.f231131X, null, th00Var19, 5);
                    th00Var10 = th00Var19;
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    th00 th00Var110 = th00Var8;
                    objM91750T2 = new rju(0, uju.f231131X, null, th00Var110, 5);
                    th00Var10 = th00Var110;
                    xq00Var.m91793t0(objM91750T2);
                }
                ho40 ho40Var6 = ho40VarM67553c;
                th00 th00Var111 = th00Var9;
                ch01 ch01Var6 = ch01VarM38611j;
                zn91.m96545d(bzf1.m31025q(mi21.m61837u(fxh0Var8, 0.0f, yds.m93474d(i18, xq00Var), 0.0f, 0.0f, 13), z, voi0VarM66157n, ho40Var6, wj50.m88271j(uduVar3, sduVar), new tix0(4), eh00Var2), null, ch01Var6, (wju) objM91750T2, zsf1.m96847g(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), uduVar3, z, voi0VarM66157n, null, null, null, rkk.m75772x(-670541425, new d9j(20, th00Var9, fyfVar), xq00Var), xq00Var, ((i15 >> 18) & 896) | 100663296 | ((i15 >> 3) & 458752) | (3670016 & (i15 << 18)) | ((i15 << 6) & 29360128), 48, 1538);
                th00Var5 = th00Var111;
                ho40Var2 = ho40Var6;
                uduVar2 = uduVar3;
                th00Var4 = th00Var10;
                fxh0Var3 = fxh0Var8;
                ch01Var2 = ch01Var6;
                voi0Var3 = voi0VarM66157n;
                i16 = i18;
            } else {
                xq00Var.m91757b0();
                th00Var4 = th00Var2;
                ch01Var2 = ch01Var;
                ho40Var2 = ho40Var;
                fxh0Var3 = fxh0Var2;
                th00Var5 = th00Var3;
                voi0Var3 = voi0Var2;
                i16 = i;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new g0v(z, eh00Var, fyfVar, fxh0Var3, th00Var5, voi0Var3, uduVar2, th00Var4, ch01Var2, ho40Var2, i16, i2, i3, i4);
            }
        }
        i5 |= 24576;
        th00Var3 = th00Var;
        if ((196608 & i2) == 0) {
            if ((i4 & 32) == 0) {
                voi0Var2 = voi0Var;
                if (xq00Var.m91766g(voi0Var2)) {
                }
                i5 |= i20;
            } else {
                voi0Var2 = voi0Var;
            }
            i5 |= i20;
        } else {
            voi0Var2 = voi0Var;
        }
        i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            uduVar2 = uduVar;
        } else {
            uduVar2 = uduVar;
            if ((i2 & 1572864) == 0) {
                if (xq00Var.m91766g(uduVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
        }
        i10 = i4 & 128;
        if (i10 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (xq00Var.m91770i(th00Var2)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        if ((i2 & 100663296) != 0) {
            i5 |= ((i4 & 256) == 0 || !xq00Var.m91766g(ch01Var)) ? 33554432 : 67108864;
        }
        if ((i2 & 805306368) != 0) {
            i5 |= ((i4 & 512) == 0 || !xq00Var.m91766g(ho40Var)) ? 268435456 : 536870912;
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
            i13 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            if (i == 0) {
                iM38547C = -1;
            } else {
                iM38547C = edb.m38547C(i);
            }
            if (xq00Var.m91762e(iM38547C)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i3 | i14;
        } else {
            i13 = i3;
        }
        i15 = i5;
        if ((306783379 & i5) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (xq00Var.m91752Y(i15 & 1, z2)) {
            xq00Var.m91761d0();
            i17 = i2 & 1;
            sduVar = sdu.f208086a;
            if (i17 != 0) {
                if (i19 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i6 != 0) {
                    th00Var6 = null;
                } else {
                    th00Var6 = th00Var3;
                }
                if ((i4 & 32) != 0) {
                    voi0VarM66157n = o2z0.m66157n(xq00Var);
                    i15 &= -458753;
                } else {
                    voi0VarM66157n = voi0Var2;
                }
                if (i8 != 0) {
                    uduVar2 = sduVar;
                }
                if (i10 != 0) {
                    objM91750T = xq00Var.m91750T();
                    if (objM91750T == ia7Var) {
                        objM91750T = uju.f231147i;
                        xq00Var.m91793t0(objM91750T);
                    }
                    th00Var7 = (th00) objM91750T;
                } else {
                    th00Var7 = th00Var2;
                }
                if ((i4 & 256) != 0) {
                    ch01VarM38611j = edo.m38611j(xq00Var);
                    i15 &= -234881025;
                } else {
                    ch01VarM38611j = ch01Var;
                }
                if ((i4 & 512) != 0) {
                    ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                    i15 &= -1879048193;
                } else {
                    ho40VarM67553c = ho40Var;
                }
                udu uduVar9 = uduVar2;
                th00Var8 = th00Var7;
                th00Var9 = th00Var6;
                uduVar3 = uduVar9;
                if (i12 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
            } else {
                if (i19 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                if (i6 != 0) {
                    th00Var6 = null;
                } else {
                    th00Var6 = th00Var3;
                }
                if ((i4 & 32) != 0) {
                    voi0VarM66157n = o2z0.m66157n(xq00Var);
                    i15 &= -458753;
                } else {
                    voi0VarM66157n = voi0Var2;
                }
                if (i8 != 0) {
                    uduVar2 = sduVar;
                }
                if (i10 != 0) {
                    objM91750T = xq00Var.m91750T();
                    if (objM91750T == ia7Var) {
                        objM91750T = uju.f231147i;
                        xq00Var.m91793t0(objM91750T);
                    }
                    th00Var7 = (th00) objM91750T;
                } else {
                    th00Var7 = th00Var2;
                }
                if ((i4 & 256) != 0) {
                    ch01VarM38611j = edo.m38611j(xq00Var);
                    i15 &= -234881025;
                } else {
                    ch01VarM38611j = ch01Var;
                }
                if ((i4 & 512) != 0) {
                    ho40VarM67553c = opo.m67553c(ch01VarM38611j, xq00Var, (i15 >> 24) & 14);
                    i15 &= -1879048193;
                } else {
                    ho40VarM67553c = ho40Var;
                }
                udu uduVar10 = uduVar2;
                th00Var8 = th00Var7;
                th00Var9 = th00Var6;
                uduVar3 = uduVar10;
                if (i12 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
            }
            xq00Var.m91790s();
            fxh0 fxh0Var9 = fxh0Var4;
            if ((i15 & 29360128) == 8388608) {
            }
            objM91750T2 = xq00Var.m91750T();
            if (z3) {
                th00 th00Var112 = th00Var8;
                objM91750T2 = new rju(0, uju.f231131X, null, th00Var112, 5);
                th00Var10 = th00Var112;
                xq00Var.m91793t0(objM91750T2);
            } else {
                th00 th00Var113 = th00Var8;
                objM91750T2 = new rju(0, uju.f231131X, null, th00Var113, 5);
                th00Var10 = th00Var113;
                xq00Var.m91793t0(objM91750T2);
            }
            ho40 ho40Var7 = ho40VarM67553c;
            th00 th00Var114 = th00Var9;
            ch01 ch01Var7 = ch01VarM38611j;
            zn91.m96545d(bzf1.m31025q(mi21.m61837u(fxh0Var9, 0.0f, yds.m93474d(i18, xq00Var), 0.0f, 0.0f, 13), z, voi0VarM66157n, ho40Var7, wj50.m88271j(uduVar3, sduVar), new tix0(4), eh00Var2), null, ch01Var7, (wju) objM91750T2, zsf1.m96847g(leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224760c), uduVar3, z, voi0VarM66157n, null, null, null, rkk.m75772x(-670541425, new d9j(20, th00Var9, fyfVar), xq00Var), xq00Var, ((i15 >> 18) & 896) | 100663296 | ((i15 >> 3) & 458752) | (3670016 & (i15 << 18)) | ((i15 << 6) & 29360128), 48, 1538);
            th00Var5 = th00Var114;
            ho40Var2 = ho40Var7;
            uduVar2 = uduVar3;
            th00Var4 = th00Var10;
            fxh0Var3 = fxh0Var9;
            ch01Var2 = ch01Var7;
            voi0Var3 = voi0VarM66157n;
            i16 = i18;
        } else {
            xq00Var.m91757b0();
            th00Var4 = th00Var2;
            ch01Var2 = ch01Var;
            ho40Var2 = ho40Var;
            fxh0Var3 = fxh0Var2;
            th00Var5 = th00Var3;
            voi0Var3 = voi0Var2;
            i16 = i;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new g0v(z, eh00Var, fyfVar, fxh0Var3, th00Var5, voi0Var3, uduVar2, th00Var4, ch01Var2, ho40Var2, i16, i2, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m72094d(boolean z, peu peuVar, fyf fyfVar, fxh0 fxh0Var, voi0 voi0Var, udu uduVar, long j, long j2, xq00 xq00Var, int i, int i2) {
        fxh0 fxh0Var2;
        int i3;
        int i4;
        boolean z2;
        udu uduVar2;
        long j3;
        long j4;
        fxh0 fxh0Var3;
        voi0 voi0Var2;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var4;
        long j5;
        int i5;
        fxh0 fxh0Var5;
        voi0 voi0Var3;
        udu uduVar3;
        long j6;
        boolean zM91764f;
        Object objM91750T;
        xq00Var.m91775k0(-1937033379);
        int i6 = (xq00Var.m91768h(z) ? 4 : 2) | i | (xq00Var.m91766g(peuVar) ? 32 : 16);
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                fxh0Var2 = fxh0Var;
                i6 |= xq00Var.m91766g(fxh0Var2) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i6 |= 24576;
            } else if ((i & 24576) == 0) {
                if (xq00Var.m91770i(null)) {
                    i3 = 16384;
                } else {
                    i3 = 8192;
                }
                i6 |= i3;
            }
            i4 = i6 | 39387136;
            if ((38347923 & i4) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z2)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i7 != 0) {
                        fxh0Var4 = cxh0.f43038a;
                    } else {
                        fxh0Var4 = fxh0Var2;
                    }
                    voi0 voi0VarM66157n = o2z0.m66157n(xq00Var);
                    long j7 = leu.m58815a(xq00Var).f112824b.f138757a;
                    j5 = leu.m58815a(xq00Var).f112824b.f138758b;
                    i5 = i4 & (-264699905);
                    fxh0Var5 = fxh0Var4;
                    voi0Var3 = voi0VarM66157n;
                    uduVar3 = sdu.f208086a;
                    j6 = j7;
                } else {
                    xq00Var.m91757b0();
                    i5 = i4 & (-264699905);
                    voi0Var3 = voi0Var;
                    uduVar3 = uduVar;
                    j5 = j2;
                    fxh0Var5 = fxh0Var2;
                    j6 = j;
                }
                xq00Var.m91790s();
                eh00 eh00Var = peuVar.f176849b;
                zM91764f = xq00Var.m91764f(j5) | xq00Var.m91764f(j6);
                objM91750T = xq00Var.m91750T();
                if (zM91764f || objM91750T == t6x0.f217647t) {
                    objM91750T = new ex0(j5, j6);
                    xq00Var.m91793t0(objM91750T);
                }
                long j8 = j6;
                m72093c(z, eh00Var, fyfVar, fxh0Var5, null, voi0Var3, uduVar3, (th00) objM91750T, null, null, 0, xq00Var, i5 & 4194190, 0, 1792);
                fxh0Var3 = fxh0Var5;
                voi0Var2 = voi0Var3;
                uduVar2 = uduVar3;
                j3 = j8;
                j4 = j5;
            } else {
                xq00Var.m91757b0();
                uduVar2 = uduVar;
                j3 = j;
                j4 = j2;
                fxh0Var3 = fxh0Var2;
                voi0Var2 = voi0Var;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new rfu(z, peuVar, fyfVar, fxh0Var3, voi0Var2, uduVar2, j3, j4, i, i2);
            }
        }
        i6 |= 3072;
        fxh0Var2 = fxh0Var;
        if ((i2 & 16) != 0) {
            i6 |= 24576;
        } else if ((i & 24576) == 0) {
            if (xq00Var.m91770i(null)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i6 |= i3;
        }
        i4 = i6 | 39387136;
        if ((38347923 & i4) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z2)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                voi0 voi0VarM66157n2 = o2z0.m66157n(xq00Var);
                long j9 = leu.m58815a(xq00Var).f112824b.f138757a;
                j5 = leu.m58815a(xq00Var).f112824b.f138758b;
                i5 = i4 & (-264699905);
                fxh0Var5 = fxh0Var4;
                voi0Var3 = voi0VarM66157n2;
                uduVar3 = sdu.f208086a;
                j6 = j9;
            } else {
                if (i7 != 0) {
                    fxh0Var4 = cxh0.f43038a;
                } else {
                    fxh0Var4 = fxh0Var2;
                }
                voi0 voi0VarM66157n3 = o2z0.m66157n(xq00Var);
                long j10 = leu.m58815a(xq00Var).f112824b.f138757a;
                j5 = leu.m58815a(xq00Var).f112824b.f138758b;
                i5 = i4 & (-264699905);
                fxh0Var5 = fxh0Var4;
                voi0Var3 = voi0VarM66157n3;
                uduVar3 = sdu.f208086a;
                j6 = j10;
            }
            xq00Var.m91790s();
            eh00 eh00Var2 = peuVar.f176849b;
            zM91764f = xq00Var.m91764f(j5) | xq00Var.m91764f(j6);
            objM91750T = xq00Var.m91750T();
            if (zM91764f) {
                objM91750T = new ex0(j5, j6);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = new ex0(j5, j6);
                xq00Var.m91793t0(objM91750T);
            }
            long j11 = j6;
            m72093c(z, eh00Var2, fyfVar, fxh0Var5, null, voi0Var3, uduVar3, (th00) objM91750T, null, null, 0, xq00Var, i5 & 4194190, 0, 1792);
            fxh0Var3 = fxh0Var5;
            voi0Var2 = voi0Var3;
            uduVar2 = uduVar3;
            j3 = j11;
            j4 = j5;
        } else {
            xq00Var.m91757b0();
            uduVar2 = uduVar;
            j3 = j;
            j4 = j2;
            fxh0Var3 = fxh0Var2;
            voi0Var2 = voi0Var;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rfu(z, peuVar, fyfVar, fxh0Var3, voi0Var2, uduVar2, j3, j4, i, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m72095e(tmj tmjVar, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        int i3;
        xq00Var.m91775k0(1693144901);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(tmjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                tmjVar = rmj.f200567a;
            }
            spg1.m78896e(tmjVar, fyfVar, xq00Var, i3 & 126);
        } else {
            xq00Var.m91757b0();
        }
        tmj tmjVar2 = tmjVar;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(tmjVar2, fyfVar, i, i2, 11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final zlx0 m72096f(float f, float f2, float f3, float f4, float f5, float f6) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        return new zlx0(f, f2, f3, f4, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: g */
    public static final zlx0 m72097g(tiv0 tiv0Var, long j, long j2, long j3, long j4) {
        return new zlx0(tiv0Var.f220751a, tiv0Var.f220752b, tiv0Var.f220753c, tiv0Var.f220754d, j, j2, j3, j4);
    }

    /* JADX INFO: renamed from: h */
    public static final zlx0 m72098h(float f, float f2, float f3, float f4, long j) {
        return m72096f(f, f2, f3, f4, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: i */
    public static final zlx0 m72099i(long j, tiv0 tiv0Var) {
        return m72096f(tiv0Var.f220751a, tiv0Var.f220752b, tiv0Var.f220753c, tiv0Var.f220754d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX INFO: renamed from: j */
    public static mja1 m72100j(String str) {
        String str2 = tbn0.f218907b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new mja1(sb.toString(), str2, "file", null, str);
    }

    /* JADX INFO: renamed from: k */
    public static final void m72101k(fiz fizVar, fxh0 fxh0Var, int i, float f, boolean z, float f2, ghd1 ghd1Var, xq00 xq00Var, int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        float[] fArr;
        int i5;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-192687937);
        int i6 = (i2 & 6) == 0 ? (xq00Var.m91770i(fizVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        int i7 = i6 | 384;
        if ((i2 & 3072) == 0) {
            i7 |= xq00Var.m91760d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= xq00Var.m91768h(z) ? 16384 : 8192;
        }
        int i8 = i7 | 196608;
        if ((1572864 & i2) == 0) {
            i8 |= xq00Var.m91766g(ghd1Var) ? 1048576 : 524288;
        }
        int i9 = i8;
        if (xq00Var.m91752Y(i9 & 1, (599187 & i9) != 599186)) {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                i4 = 120;
                f4 = 0.3f;
            } else {
                xq00Var.m91757b0();
                i4 = i;
                f4 = f2;
            }
            xq00Var.m91790s();
            int i10 = i9 & 896;
            int i11 = i9 & 7168;
            boolean z2 = (i10 == 256) | (i11 == 2048);
            Object objM91750T = xq00Var.m91750T();
            Object obj2 = objM91750T;
            if (z2 || objM91750T == obj) {
                float[] fArr2 = new float[i4];
                for (int i12 = 0; i12 < i4; i12++) {
                    fArr2[i12] = f;
                }
                xq00Var.m91793t0(fArr2);
                obj2 = fArr2;
            }
            float[] fArr3 = (float[]) obj2;
            boolean z3 = (i11 == 2048) | (i10 == 256);
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == obj) {
                float[] fArr4 = new float[i4];
                for (int i13 = 0; i13 < i4; i13++) {
                    fArr4[i13] = f;
                }
                objM91750T2 = sam.m77645B(fArr4);
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0 kqi0Var = (kqi0) objM91750T2;
            boolean zM91770i = xq00Var.m91770i(fizVar) | xq00Var.m91770i(fArr3) | (i10 == 256) | ((57344 & i9) == 16384) | xq00Var.m91770i(kqi0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91770i || objM91750T3 == obj) {
                i3 = i4;
                fArr = fArr3;
                i5 = 256;
                Object wemVar = new wem(fizVar, fArr, i3, z, kqi0Var, (fbk) null);
                xq00Var.m91793t0(wemVar);
                objM91750T3 = wemVar;
            } else {
                fArr = fArr3;
                i3 = i4;
                i5 = 256;
            }
            hz40.m49237i(fizVar, (th00) objM91750T3, xq00Var);
            if (z) {
                xq00Var.m91771i0(2005831954);
                boolean zM91770i2 = xq00Var.m91770i(kqi0Var) | (i10 == i5) | xq00Var.m91770i(fArr) | ((458752 & i9) == 131072);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T4 == obj) {
                    objM91750T4 = new yy4(i3, fArr, f4, kqi0Var, null);
                    xq00Var.m91793t0(objM91750T4);
                }
                hz40.m49237i(w2a1.f247311a, (th00) objM91750T4, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(2006125059);
                xq00Var.m91788r(false);
            }
            m72102l((float[]) kqi0Var.getValue(), fxh0Var, ghd1Var, xq00Var, (i9 & ContentType.LONG_FORM_ON_DEMAND) | ((i9 >> 12) & 896));
            f3 = f4;
        } else {
            xq00Var.m91757b0();
            i3 = i;
            f3 = f2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zhd1(fizVar, fxh0Var, i3, f, z, f3, ghd1Var, i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m72102l(float[] fArr, fxh0 fxh0Var, ghd1 ghd1Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(1681913873);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(fArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(ghd1Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0 && !xq00Var.m91735E()) {
                xq00Var.m91757b0();
            }
            xq00Var.m91790s();
            boolean zM91770i = xq00Var.m91770i(fArr) | ((((i2 & 896) ^ 384) > 256 && xq00Var.m91766g(ghd1Var)) || (i2 & 384) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new k8c1(14, ghd1Var, fArr);
                xq00Var.m91793t0(objM91750T);
            }
            xud.m92135b((i2 >> 3) & 14, (gh00) objM91750T, xq00Var, fxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new af91(fArr, fxh0Var, ghd1Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Disposable m72103m(xuk xukVar, Runnable runnable, long j, gh00 gh00Var) {
        juk jukVarMo31960M = xukVar.mo31960M();
        Objects.requireNonNull(runnable, "run is null");
        AtomicReference atomicReference = new AtomicReference(null);
        Runnable runnable2 = (Runnable) gh00Var.invoke(new zwx0(atomicReference, jukVarMo31960M, runnable));
        if (!kk40.m56650L(xukVar)) {
            return EmptyDisposable.f7220a;
        }
        if (j <= 0) {
            runnable2.run();
            Disposable disposableM23399e = Disposable.m23399e(Functions.f7226b);
            atomicReference.set(disposableM23399e);
            return disposableM23399e;
        }
        hwr hwrVarMo38886g = njg1.m64623p(jukVarMo31960M).mo38886g(j, runnable2, jukVarMo31960M);
        hwr hwrVarM73219x = qlg1.m73219x(qlg1.m73186B(jukVarMo31960M), hwrVarMo38886g);
        a2e1 a2e1Var = new a2e1(hwrVarMo38886g, hwrVarM73219x);
        if (mrx0.m62658l(atomicReference, a2e1Var)) {
            return a2e1Var;
        }
        hwrVarM73219x.dispose();
        return Disposable.m23399e(Functions.f7226b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [p.juk] */
    /* JADX WARN: Type inference failed for: r6v1, types: [p.juk] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX INFO: renamed from: n */
    public static final Object m72104n(AtomicReference atomicReference, juk jukVar, Runnable runnable, fbk fbkVar) {
        ywx0 ywx0Var;
        hwr hwrVarM24511a;
        hwr hwrVarM24511a2;
        if (fbkVar instanceof ywx0) {
            ywx0Var = (ywx0) fbkVar;
            int i = ywx0Var.f277075d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ywx0Var.f277075d = i - Integer.MIN_VALUE;
            } else {
                ywx0Var = new ywx0(fbkVar);
            }
        } else {
            ywx0Var = new ywx0(fbkVar);
        }
        Object obj = ywx0Var.f277074c;
        int i2 = ywx0Var.f277075d;
        w2a1 w2a1Var = w2a1.f247311a;
        a2e1 a2e1Var = null;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                Object obj2 = atomicReference.get();
                Disposable disposable = obj2 instanceof Disposable ? (Disposable) obj2 : null;
                if (disposable == null || !disposable.isDisposed()) {
                    hjx0 hjx0Var = new hjx0(1, runnable);
                    ywx0Var.f277072a = atomicReference;
                    ywx0Var.f277073b = (juk) jukVar;
                    ywx0Var.f277075d = 1;
                    Object objM87844r = wdg1.m87844r(hjx0Var, ywx0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objM87844r == yukVar) {
                        return yukVar;
                    }
                }
                return w2a1Var;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            juk jukVar2 = ywx0Var.f277073b;
            atomicReference = ywx0Var.f277072a;
            bga.m29073P(obj);
            jukVar = mrx0.m62657k(atomicReference);
            if (jukVar == 0) {
                Object obj3 = atomicReference.get();
                a2e1Var = obj3 instanceof a2e1 ? (a2e1) obj3 : null;
                if (a2e1Var != null && (hwrVarM24511a2 = a2e1Var.m24511a()) != null) {
                    hwrVarM24511a2.dispose();
                    return w2a1Var;
                }
            }
        } catch (Throwable th) {
            try {
                pp91.m70540u(th, jukVar);
            } finally {
                if (!mrx0.m62657k(atomicReference)) {
                    Object obj4 = atomicReference.get();
                    a2e1Var = obj4 instanceof a2e1 ? (a2e1) obj4 : null;
                    if (a2e1Var != null && (hwrVarM24511a = a2e1Var.m24511a()) != null) {
                        hwrVarM24511a.dispose();
                    }
                }
            }
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: o */
    public static final luk m72105o(Scheduler scheduler) {
        return scheduler instanceof usr ? ((usr) scheduler).f233676c : new egy0(scheduler);
    }

    /* JADX INFO: renamed from: p */
    public static final int m72106p(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: q */
    public static int m72107q(int i, int i2) {
        long j = ((long) i) + ((long) i2);
        int i3 = (int) j;
        if (j == ((long) i3)) {
            return i3;
        }
        throw new ArithmeticException(edb.m38560i(i, i2, "overflow: checkedAdd(", ", ", ")"));
    }

    /* JADX INFO: renamed from: r */
    public static float m72108r(float f, float f2, float f3) {
        if (f > f2) {
            f2 = f;
            f = f2;
        }
        if (f3 <= f) {
            return f;
        }
        return f3 >= f2 ? f2 : f3;
    }

    /* JADX INFO: renamed from: t */
    public static ByteBuffer m72109t(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: u */
    public static int m72110u(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (v350.f236786a[roundingMode.ordinal()]) {
            case 1:
                jq60.m54068n(i4 == 0);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i5;
    }

    /* JADX INFO: renamed from: v */
    public static final float m72111v(rzl0 rzl0Var) {
        float fM76821h = rzl0Var.m76821h() > 0.0d ? (float) rzl0Var.m76821h() : 1.0f;
        if (rzl0Var.m76820g() > 0.0f) {
            return rzl0Var.m76820g() * fM76821h;
        }
        return 120.0f;
    }

    /* JADX INFO: renamed from: w */
    public static long m72112w(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    e8j.m38121l(i6);
                    throw new KotlinNothingValueException();
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return e8j.m38110a(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    /* JADX INFO: renamed from: x */
    public static long m72113x(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    e8j.m38121l(i6);
                    throw new KotlinNothingValueException();
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return e8j.m38110a(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    /* JADX INFO: renamed from: y */
    public static final String m72114y(mja1 mja1Var) {
        List listM72115z = m72115z(mja1Var);
        String str = mja1Var.f144214b;
        if (listM72115z.isEmpty()) {
            return null;
        }
        String str2 = mja1Var.f144217e;
        wj50.m88279p(str2);
        if (!bm51.m29803n0(str2, str, false)) {
            str = "";
        }
        return g6f.m43753y0(listM72115z, mja1Var.f144214b, str, null, null, 60);
    }

    /* JADX INFO: renamed from: z */
    public static final List m72115z(mja1 mja1Var) {
        String str = mja1Var.f144217e;
        if (str == null) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iM88457G0 = wl51.m88457G0(str, '/', i2, 4);
            if (iM88457G0 == -1) {
                iM88457G0 = str.length();
            }
            String strSubstring = str.substring(i2, iM88457G0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iM88457G0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public abstract List mo24506s(String str, List list);
}
