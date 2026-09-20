package p204p;

import android.app.Activity;
import androidx.car.app.model.Alert;
import com.google.zxing.WriterException;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class gg5 implements tw91, zd10, Function, i5w0, lh41, ymj0, hd70, pfe1, vd50, cb31 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79535a;

    public /* synthetic */ gg5(int i) {
        this.f79535a = i;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m44651c(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: h */
    public static final ovy m44652h(Activity activity, mab0 mab0Var) {
        File cacheDir = activity.getCacheDir();
        String absolutePath = null;
        if (cacheDir != null && ((cacheDir.isDirectory() && cacheDir.canWrite()) || (cacheDir.mkdirs() && cacheDir.isDirectory() && cacheDir.canWrite()))) {
            absolutePath = cacheDir.getAbsolutePath();
        }
        if (absolutePath != null) {
            return ((m12) mab0Var.f141550b).m60516m(absolutePath, "pses_configuration");
        }
        throw new IllegalStateException("unable to access application cache directory");
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m44653j(Iterable iterable) {
        if (iterable != null) {
            return (iterable instanceof Collection) && ((Collection) iterable).isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static String m44654o(ft90 ft90Var) {
        StringBuilder sb = new StringBuilder();
        String strMo29111F = qpv0.f191387a.mo54112b(ft90Var.getClass()).mo29111F();
        if (strMo29111F != null) {
            int i = 0;
            int i2 = 0;
            while (i < strMo29111F.length()) {
                char cCharAt = strMo29111F.charAt(i);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
                } else if (i2 <= 0 || !Character.isUpperCase(cCharAt)) {
                    sb.append(cCharAt);
                } else {
                    sb.append("_");
                    sb.append(String.valueOf(cCharAt).toLowerCase(Locale.ROOT));
                }
                i++;
                i2 = i3;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static jsa0 m44655s(fk30 fk30Var) {
        Integer numIntValue;
        wj30[] wj30VarArrBundleArray = fk30Var.logging().bundleArray("ubi:path");
        wj30 wj30Var = wj30VarArrBundleArray != null ? (wj30) bk5.m29584G0(wj30VarArrBundleArray) : null;
        int iIntValue = (wj30Var == null || (numIntValue = wj30Var.intValue("position")) == null) ? 0 : numIntValue.intValue();
        return new jsa0(wj30Var != null ? wj30Var.string("id") : null, wj30Var != null ? wj30Var.string("reason") : null, iIntValue, wj30Var != null ? wj30Var.string("uri") : null);
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: a */
    public pv91 mo32461a(yqx0 yqx0Var, int i, String str) {
        return new qgg0(new pgg0(new s8g0(new tgg0()), Integer.valueOf(i), str, ((fg5) yqx0Var.f275324j).f69222a, 1), 0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        switch (this.f79535a) {
            case 8:
                cwi cwiVar = (cwi) obj;
                if (cwiVar.f42760a) {
                    z = false;
                } else {
                    ArrayList<uqi> arrayList = cwiVar.f42762c;
                    if (arrayList.isEmpty()) {
                        z = false;
                    } else {
                        for (uqi uqiVar : arrayList) {
                            if (uqiVar.f233035b && !uqiVar.f233034a) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                Integer num = (Integer) obj;
                return Integer.valueOf(num.intValue() == -1 ? -7829368 : num.intValue());
        }
    }

    @Override // p204p.i5w0
    /* JADX INFO: renamed from: b */
    public p5w0 mo39759b(h9x h9xVar) {
        if (h9xVar.equals(d9x.f46928a)) {
            return m5w0.f140304a;
        }
        return null;
    }

    @Override // p204p.vd50
    public Object convert(int i) {
        cp01 cp01Var;
        switch (i) {
            case 0:
                cp01Var = cp01.COPY_LINK;
                break;
            case 1:
            case 7:
            case 11:
            default:
                cp01Var = null;
                break;
            case 2:
                cp01Var = cp01.WHATSAPP;
                break;
            case 3:
                cp01Var = cp01.SMS;
                break;
            case 4:
                cp01Var = cp01.INSTAGRAM_STORIES;
                break;
            case 5:
                cp01Var = cp01.INSTAGRAM_DM;
                break;
            case 6:
                cp01Var = cp01.SNAPCHAT;
                break;
            case 8:
                cp01Var = cp01.TWITTER;
                break;
            case 9:
                cp01Var = cp01.FACEBOOK_STORIES;
                break;
            case 10:
                cp01Var = cp01.FACEBOOK_MESSENGER;
                break;
            case 12:
                cp01Var = cp01.LINE;
                break;
            case 13:
                cp01Var = cp01.MORE;
                break;
            case 14:
                cp01Var = cp01.DOWNLOAD;
                break;
        }
        return cp01Var == null ? cp01.UNRECOGNIZED : cp01Var;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: d */
    public int mo24960d() {
        return 8;
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: e */
    public av91 mo32464e(yqx0 yqx0Var, int i, String str) {
        return null;
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: f */
    public pv91 mo32465f(yqx0 yqx0Var, int i, String str) {
        return new qgg0(new pgg0(new s8g0(new tgg0()), Integer.valueOf(i), str, ((fg5) yqx0Var.f275324j).f69222a, 1), 0);
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: g */
    public void mo24962g(lp70 lp70Var, long j, g030 g030Var, int i, boolean z) {
        xmj0 xmj0Var = lp70Var.f135674c1;
        bnj0 bnj0Var = xmj0Var.f263386d;
        fdx0 fdx0Var = bnj0.f28845n1;
        xmj0Var.f263386d.m30027j1(lmg1.m59445p(), bnj0Var.m30014X0(j, true), g030Var, 1, z);
    }

    @Override // p204p.lh41
    /* JADX INFO: renamed from: i */
    public StackTraceElement[] mo44656i(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // p204p.hd70
    /* JADX INFO: renamed from: k */
    public boolean mo26034k(jn91 jn91Var, jn91 jn91Var2) {
        if (jn91Var == null) {
            m44651c(0);
            throw null;
        }
        if (jn91Var2 != null) {
            return jn91Var.equals(jn91Var2);
        }
        m44651c(1);
        throw null;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: l */
    public boolean mo24965l(lp70 lp70Var) {
        voz0 voz0VarM59647x = lp70Var.m59647x();
        boolean z = false;
        if (voz0VarM59647x != null && voz0VarM59647x.f243558d) {
            z = true;
        }
        return !z;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: m */
    public boolean mo44657m(exh0 exh0Var) {
        return b0g1.m27772H(pp91.m70522c(wjg1.m88319I(exh0Var), false));
    }

    /* JADX WARN: Code duplicated, block: B:366:0x0678  */
    /* JADX WARN: Code duplicated, block: B:368:0x067f  */
    /* JADX WARN: Code duplicated, block: B:396:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:397:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:455:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9 A[EDGE_INSN: B:57:0x00b9->B:60:0x00c0 BREAK  A[LOOP:0: B:40:0x0091->B:54:0x00b2]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00be A[EDGE_INSN: B:59:0x00be->B:60:0x00c0 BREAK  A[LOOP:0: B:40:0x0091->B:54:0x00b2]] */
    @Override // p204p.pfe1
    /* JADX INFO: renamed from: n */
    public fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        cuh0 cuh0Var;
        int i4;
        int i5;
        aeb1 aeb1VarM25714a;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        ouc oucVar;
        int i10;
        boolean z5;
        boolean z6;
        char cCharAt;
        int i11;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i != 12) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(edb.m38548D(i)));
        }
        if (i2 < 0 || i3 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i2 + 'x' + i3);
        }
        ydu yduVar = ydu.f271831a;
        cew cewVarValueOf = map.containsKey(yduVar) ? cew.valueOf(map.get(yduVar).toString()) : cew.L;
        ydu yduVar2 = ydu.f271836f;
        int i12 = map.containsKey(yduVar2) ? Integer.parseInt(map.get(yduVar2).toString()) : 4;
        ydu yduVar3 = ydu.f271832b;
        boolean zContainsKey = map.containsKey(yduVar3);
        String string = zContainsKey ? map.get(yduVar3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = gv90.f84673a;
        cuh0 cuh0Var2 = cuh0.BYTE;
        if (!zEquals) {
            i10 = 0;
            z5 = false;
            z6 = false;
            while (true) {
                if (i10 < str.length()) {
                    cCharAt = str.charAt(i10);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i11 = iArr[cCharAt];
                        } else {
                            i11 = -1;
                        }
                        if (i11 != -1) {
                            z5 = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i11 = iArr[cCharAt];
                        } else {
                            i11 = -1;
                        }
                        if (i11 != -1) {
                            z5 = true;
                        }
                    }
                    i10++;
                } else {
                    if (z5) {
                        cuh0Var = cuh0.ALPHANUMERIC;
                        break;
                    }
                    if (z6) {
                        cuh0Var = cuh0.NUMERIC;
                        break;
                    }
                }
                cuh0Var = cuh0Var2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i10 = 0;
                z5 = false;
                z6 = false;
                while (true) {
                    if (i10 < str.length()) {
                        cCharAt = str.charAt(i10);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i11 = iArr[cCharAt];
                            } else {
                                i11 = -1;
                            }
                            if (i11 != -1) {
                                z5 = true;
                            }
                        } else {
                            z6 = true;
                        }
                        i10++;
                    } else {
                        if (z5) {
                            cuh0Var = cuh0.ALPHANUMERIC;
                            break;
                        }
                        if (z6) {
                            cuh0Var = cuh0.NUMERIC;
                            break;
                        }
                    }
                    cuh0Var = cuh0Var2;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    cuh0Var = cuh0.KANJI;
                } else {
                    int i14 = bytes[i13] & 255;
                    if ((i14 < 129 || i14 > 159) && (i14 < 224 || i14 > 235)) {
                        i10 = 0;
                        z5 = false;
                        z6 = false;
                        while (true) {
                            if (i10 < str.length()) {
                                cCharAt = str.charAt(i10);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i11 = iArr[cCharAt];
                                    } else {
                                        i11 = -1;
                                    }
                                    if (i11 != -1) {
                                        z5 = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i11 = iArr[cCharAt];
                                    } else {
                                        i11 = -1;
                                    }
                                    if (i11 != -1) {
                                        z5 = true;
                                    }
                                }
                                i10++;
                            } else {
                                if (z5) {
                                    cuh0Var = cuh0.ALPHANUMERIC;
                                    break;
                                }
                                if (z6) {
                                    cuh0Var = cuh0.NUMERIC;
                                    break;
                                }
                            }
                            cuh0Var = cuh0Var2;
                            break;
                        }
                    }
                    i13 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        int[] iArr2 = cuh0Var.f42127a;
        dh9 dh9Var = new dh9();
        if (cuh0Var == cuh0Var2 && zContainsKey && (oucVar = (ouc) ouc.f170248d.get(string)) != null) {
            dh9Var.m36000c(7, 4);
            dh9Var.m36000c(oucVar.f170250a[0], 8);
        }
        ydu yduVar4 = ydu.f271829Y;
        if (map.containsKey(yduVar4) && Boolean.valueOf(map.get(yduVar4).toString()).booleanValue()) {
            i4 = 4;
            dh9Var.m36000c(5, 4);
        } else {
            i4 = 4;
        }
        dh9Var.m36000c(cuh0Var.f42128b, i4);
        dh9 dh9Var2 = new dh9();
        int iOrdinal = cuh0Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i15 = 0;
                while (i15 < length2) {
                    char cCharAt2 = str.charAt(i15);
                    int i16 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i16 == -1) {
                        throw new WriterException();
                    }
                    int i17 = i15 + 1;
                    if (i17 < length2) {
                        char cCharAt3 = str.charAt(i17);
                        int i18 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i18 == -1) {
                            throw new WriterException();
                        }
                        dh9Var2.m36000c((i16 * 45) + i18, 11);
                        i15 += 2;
                    } else {
                        dh9Var2.m36000c(i16, 6);
                        i15 = i17;
                    }
                    i12 = i12;
                }
            } else if (iOrdinal == 4) {
                try {
                    for (byte b : str.getBytes(string)) {
                        dh9Var2.m36000c(b, 8);
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new WriterException(e);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(cuh0Var)));
                }
                try {
                    byte[] bytes2 = str.getBytes("Shift_JIS");
                    int length3 = bytes2.length;
                    for (int i19 = 0; i19 < length3; i19 += 2) {
                        int i20 = ((bytes2[i19] & 255) << 8) | (bytes2[i19 + 1] & 255);
                        int i21 = (i20 < 33088 || i20 > 40956) ? (i20 < 57408 || i20 > 60351) ? -1 : i20 - 49472 : i20 - 33088;
                        if (i21 == -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        dh9Var2.m36000c(((i21 >> 8) * 192) + (i21 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new WriterException(e2);
                }
            }
            i5 = i12;
        } else {
            i5 = i12;
            int length4 = str.length();
            int i22 = 0;
            while (i22 < length4) {
                int iCharAt = str.charAt(i22) - '0';
                int i23 = i22 + 2;
                if (i23 < length4) {
                    dh9Var2.m36000c(klh.m56829a(str.charAt(i22 + 1) - '0', 10, iCharAt * 100, str.charAt(i23) - '0'), 10);
                    i22 += 3;
                } else {
                    i22++;
                    if (i22 < length4) {
                        dh9Var2.m36000c((iCharAt * 10) + (str.charAt(i22) - '0'), 7);
                        i22 = i23;
                    } else {
                        dh9Var2.m36000c(iCharAt, 4);
                    }
                }
            }
        }
        ydu yduVar5 = ydu.f271828X;
        if (map.containsKey(yduVar5)) {
            aeb1VarM25714a = aeb1.m25714a(Integer.parseInt(map.get(yduVar5).toString()));
            int i24 = dh9Var.f49021b;
            int i25 = aeb1VarM25714a.f14827a;
            int i26 = iArr2[i25 <= 9 ? (char) 0 : i25 <= 26 ? (char) 1 : (char) 2] + i24 + dh9Var2.f49021b;
            int i27 = aeb1VarM25714a.f14829c;
            t9w0 t9w0Var = aeb1VarM25714a.f14828b[cewVarValueOf.ordinal()];
            int i28 = t9w0Var.f218381b;
            int i29 = 0;
            for (qr8 qr8Var : (qr8[]) t9w0Var.f218382c) {
                i29 += qr8Var.f191759a;
            }
            if (!(i27 - (i29 * i28) >= (i26 + 7) / 8)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            aeb1 aeb1VarM25714a2 = aeb1.m25714a(1);
            int i30 = dh9Var.f49021b;
            int i31 = aeb1VarM25714a2.f14827a;
            int i32 = iArr2[i31 <= 9 ? (char) 0 : i31 <= 26 ? (char) 1 : (char) 2] + i30 + dh9Var2.f49021b;
            int i33 = 1;
            while (true) {
                if (i33 > 40) {
                    throw new WriterException("Data too big");
                }
                aeb1 aeb1VarM25714a3 = aeb1.m25714a(i33);
                int i34 = aeb1VarM25714a3.f14829c;
                t9w0 t9w0Var2 = aeb1VarM25714a3.f14828b[cewVarValueOf.ordinal()];
                int i35 = t9w0Var2.f218381b;
                qr8[] qr8VarArr = (qr8[]) t9w0Var2.f218382c;
                int length5 = qr8VarArr.length;
                int i36 = 0;
                int i37 = i32;
                int i38 = 0;
                while (i38 < length5) {
                    int i39 = i38;
                    i36 += qr8VarArr[i39].f191759a;
                    i38 = i39 + 1;
                }
                if (i34 - (i36 * i35) >= (i37 + 7) / 8) {
                    int i40 = dh9Var.f49021b;
                    int i41 = aeb1VarM25714a3.f14827a;
                    int i42 = iArr2[i41 <= 9 ? (char) 0 : i41 <= 26 ? (char) 1 : (char) 2] + i40 + dh9Var2.f49021b;
                    int i43 = 1;
                    while (true) {
                        if (i43 > 40) {
                            throw new WriterException("Data too big");
                        }
                        aeb1 aeb1VarM25714a4 = aeb1.m25714a(i43);
                        int i44 = aeb1VarM25714a4.f14829c;
                        t9w0 t9w0Var3 = aeb1VarM25714a4.f14828b[cewVarValueOf.ordinal()];
                        int i45 = t9w0Var3.f218381b;
                        qr8[] qr8VarArr2 = (qr8[]) t9w0Var3.f218382c;
                        int i46 = 0;
                        int i47 = i42;
                        int i48 = 0;
                        for (int length6 = qr8VarArr2.length; i48 < length6; length6 = length6) {
                            i46 += qr8VarArr2[i48].f191759a;
                            i48++;
                        }
                        if (i44 - (i46 * i45) >= (i47 + 7) / 8) {
                            aeb1VarM25714a = aeb1VarM25714a4;
                            break;
                        }
                        i43++;
                        i42 = i47;
                    }
                } else {
                    i33++;
                    i32 = i37;
                }
            }
        }
        int i49 = aeb1VarM25714a.f14827a;
        int i50 = aeb1VarM25714a.f14829c;
        dh9 dh9Var3 = new dh9();
        int i51 = dh9Var.f49021b;
        dh9Var3.m36001d(i51);
        for (int i52 = 0; i52 < i51; i52++) {
            dh9Var3.m35999b(dh9Var.m36002e(i52));
        }
        int iM36003g = cuh0Var == cuh0Var2 ? dh9Var2.m36003g() : str.length();
        int i53 = iArr2[i49 <= 9 ? (char) 0 : i49 <= 26 ? (char) 1 : (char) 2];
        int i54 = 1 << i53;
        if (iM36003g >= i54) {
            StringBuilder sb = new StringBuilder();
            sb.append(iM36003g);
            sb.append(" is bigger than ");
            sb.append(i54 - 1);
            throw new WriterException(sb.toString());
        }
        dh9Var3.m36000c(iM36003g, i53);
        int i55 = dh9Var2.f49021b;
        dh9Var3.m36001d(dh9Var3.f49021b + i55);
        for (int i56 = 0; i56 < i55; i56++) {
            dh9Var3.m35999b(dh9Var2.m36002e(i56));
        }
        t9w0 t9w0Var4 = aeb1VarM25714a.f14828b[cewVarValueOf.ordinal()];
        int i57 = t9w0Var4.f218381b;
        qr8[] qr8VarArr3 = (qr8[]) t9w0Var4.f218382c;
        int i58 = 0;
        for (qr8 qr8Var2 : qr8VarArr3) {
            i58 += qr8Var2.f191759a;
        }
        int i59 = i50 - (i58 * i57);
        int i60 = i59 << 3;
        if (dh9Var3.f49021b > i60) {
            throw new WriterException("data bits cannot fit in the QR Code" + dh9Var3.f49021b + " > " + i60);
        }
        for (int i61 = 0; i61 < 4 && dh9Var3.f49021b < i60; i61++) {
            dh9Var3.m35999b(false);
        }
        boolean z7 = false;
        int i62 = dh9Var3.f49021b & 7;
        if (i62 > 0) {
            while (i62 < 8) {
                dh9Var3.m35999b(z7);
                i62++;
                z7 = false;
            }
        }
        int iM36003g2 = i59 - dh9Var3.m36003g();
        for (int i63 = 0; i63 < iM36003g2; i63++) {
            dh9Var3.m36000c((i63 & 1) == 0 ? 236 : 17, 8);
        }
        if (dh9Var3.f49021b != i60) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i64 = 0;
        for (qr8 qr8Var3 : qr8VarArr3) {
            i64 += qr8Var3.f191759a;
        }
        if (dh9Var3.m36003g() != i59) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i64);
        int i65 = 0;
        int i66 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i65 < i64) {
            int[] iArr3 = new int[1];
            int i67 = i49;
            int[] iArr4 = new int[1];
            if (i65 >= i64) {
                throw new WriterException("Block ID too large");
            }
            int i68 = i50 % i64;
            int i69 = i64 - i68;
            int i70 = i50 / i64;
            int i71 = i59 / i64;
            int i72 = i71 + 1;
            int i73 = i70 - i71;
            int i74 = (i70 + 1) - i72;
            if (i73 != i74) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i64 != i69 + i68) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i50 != ((i72 + i74) * i68) + ((i71 + i73) * i69)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i65 < i69) {
                c = 0;
                iArr3[0] = i71;
                iArr4[0] = i73;
            } else {
                c = 0;
                iArr3[0] = i72;
                iArr4[0] = i74;
            }
            int i75 = iArr3[c];
            byte[] bArr = new byte[i75];
            int i76 = i66 << 3;
            int i77 = 0;
            while (i77 < i75) {
                int i78 = i65;
                int i79 = i77;
                int i80 = i76;
                int i81 = i64;
                int i82 = 0;
                for (int i83 = 0; i83 < 8; i83++) {
                    if (dh9Var3.m36002e(i80)) {
                        i82 = (1 << (7 - i83)) | i82;
                    }
                    i80++;
                }
                bArr[i79] = (byte) i82;
                i64 = i81;
                i65 = i78;
                i76 = i80;
                i77 = i79 + 1;
            }
            int i84 = i65;
            int i85 = i64;
            int i86 = iArr4[0];
            int[] iArr5 = new int[i75 + i86];
            for (int i87 = 0; i87 < i75; i87++) {
                iArr5[i87] = bArr[i87] & 255;
            }
            new w8q0(x310.f257657k).m87472g(iArr5, i86);
            byte[] bArr2 = new byte[i86];
            int i88 = 0;
            while (i88 < i86) {
                int[] iArr6 = iArr5;
                bArr2[i88] = (byte) iArr6[i75 + i88];
                i88++;
                iArr5 = iArr6;
            }
            arrayList.add(new uq9(bArr, bArr2));
            iMax = Math.max(iMax, i75);
            iMax2 = Math.max(iMax2, i86);
            i66 += iArr3[0];
            i65 = i84 + 1;
            i49 = i67;
            i64 = i85;
        }
        int i89 = i49;
        if (i59 != i66) {
            throw new WriterException("Data bytes does not match offset");
        }
        dh9 dh9Var4 = new dh9();
        for (int i90 = 0; i90 < iMax; i90++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((uq9) it.next()).f232947a;
                if (i90 < bArr3.length) {
                    dh9Var4.m36000c(bArr3[i90], 8);
                }
            }
        }
        for (int i91 = 0; i91 < iMax2; i91++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((uq9) it2.next()).f232948b;
                if (i91 < bArr4.length) {
                    dh9Var4.m36000c(bArr4[i91], 8);
                }
            }
        }
        if (i50 != dh9Var4.m36003g()) {
            StringBuilder sbM56838j = klh.m56838j(i50, "Interleaving error: ", " and ");
            sbM56838j.append(dh9Var4.m36003g());
            sbM56838j.append(" differ.");
            throw new WriterException(sbM56838j.toString());
        }
        int i92 = (i89 * 4) + 17;
        p4l0 p4l0Var = new p4l0(i92, i92);
        int i93 = p4l0Var.f173979c;
        int i94 = p4l0Var.f173978b;
        int i95 = Alert.DURATION_SHOW_INDEFINITELY;
        int i96 = 0;
        int i97 = -1;
        while (i96 < 8) {
            fjf1.m41821f(dh9Var4, cewVarValueOf, aeb1VarM25714a, i96, p4l0Var);
            int iM94471g = ysg1.m94471g(p4l0Var, false) + ysg1.m94471g(p4l0Var, true);
            byte[][] bArr5 = (byte[][]) p4l0Var.f173980d;
            int i98 = 0;
            int i99 = 0;
            while (i98 < i93 - 1) {
                byte[] bArr6 = bArr5[i98];
                int i100 = i99;
                int i101 = 0;
                while (i101 < i94 - 1) {
                    byte b2 = bArr6[i101];
                    int i102 = i101 + 1;
                    int i103 = i98;
                    if (b2 == bArr6[i102]) {
                        byte[] bArr7 = bArr5[i103 + 1];
                        if (b2 == bArr7[i101] && b2 == bArr7[i102]) {
                            i100++;
                        }
                    }
                    i101 = i102;
                    i98 = i103;
                }
                i98++;
                i99 = i100;
            }
            int i104 = (i99 * 3) + iM94471g;
            int i105 = 0;
            int i106 = 0;
            while (i105 < i93) {
                int i107 = 0;
                while (i107 < i94) {
                    byte[] bArr8 = bArr5[i105];
                    int i108 = i106;
                    int i109 = i107 + 6;
                    if (i109 < i94) {
                        i6 = i96;
                        if (bArr8[i107] == 1 && bArr8[i107 + 1] == 0 && bArr8[i107 + 2] == 1 && bArr8[i107 + 3] == 1 && bArr8[i107 + 4] == 1 && bArr8[i107 + 5] == 0 && bArr8[i109] == 1) {
                            int iMax3 = Math.max(i107 - 4, 0);
                            int iMin = Math.min(i107, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z3 = true;
                                    break;
                                }
                                int i110 = iMax3;
                                int i111 = iMin;
                                if (bArr8[i110] == 1) {
                                    z3 = false;
                                    break;
                                }
                                iMax3 = i110 + 1;
                                iMin = i111;
                            }
                            if (z3) {
                                i7 = i107;
                            } else {
                                i7 = i107;
                                int iMax4 = Math.max(i107 + 7, 0);
                                int iMin2 = Math.min(i107 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z4 = true;
                                        break;
                                    }
                                    int i112 = iMax4;
                                    if (bArr8[iMax4] == 1) {
                                        z4 = false;
                                        break;
                                    }
                                    iMax4 = i112 + 1;
                                }
                                if (z4) {
                                }
                                i8 = i105 + 6;
                                if (i8 < i93) {
                                    byte b3 = 1;
                                    if (bArr5[i105][i7] != 1 && bArr5[i105 + 1][i7] == 0 && bArr5[i105 + 2][i7] == 1 && bArr5[i105 + 3][i7] == 1 && bArr5[i105 + 4][i7] == 1 && bArr5[i105 + 5][i7] == 0 && bArr5[i8][i7] == 1) {
                                        int iMax5 = Math.max(i105 - 4, 0);
                                        int iMin3 = Math.min(i105, bArr5.length);
                                        while (true) {
                                            if (iMax5 >= iMin3) {
                                                i9 = i105;
                                                z = true;
                                                break;
                                            }
                                            i9 = i105;
                                            if (bArr5[iMax5][i7] == b3) {
                                                z = false;
                                                break;
                                            }
                                            iMax5++;
                                            i105 = i9;
                                            b3 = 1;
                                        }
                                        if (z) {
                                            i106++;
                                        } else {
                                            int iMax6 = Math.max(i9 + 7, 0);
                                            int iMin4 = Math.min(i9 + 11, bArr5.length);
                                            while (true) {
                                                if (iMax6 >= iMin4) {
                                                    z2 = true;
                                                    break;
                                                }
                                                if (bArr5[iMax6][i7] == 1) {
                                                    z2 = false;
                                                    break;
                                                }
                                                iMax6++;
                                            }
                                            if (z2) {
                                                i106++;
                                            }
                                        }
                                    } else {
                                        i9 = i105;
                                    }
                                } else {
                                    i9 = i105;
                                }
                                i107 = i7 + 1;
                                i96 = i6;
                                i105 = i9;
                            }
                            i106 = i108 + 1;
                            i8 = i105 + 6;
                            if (i8 < i93) {
                                byte b4 = 1;
                                if (bArr5[i105][i7] != 1) {
                                    i9 = i105;
                                } else {
                                    i9 = i105;
                                }
                            } else {
                                i9 = i105;
                            }
                            i107 = i7 + 1;
                            i96 = i6;
                            i105 = i9;
                        }
                        i106 = i108;
                        i8 = i105 + 6;
                        if (i8 < i93) {
                            byte b5 = 1;
                            if (bArr5[i105][i7] != 1) {
                                i9 = i105;
                            } else {
                                i9 = i105;
                            }
                        } else {
                            i9 = i105;
                        }
                        i107 = i7 + 1;
                        i96 = i6;
                        i105 = i9;
                    } else {
                        i6 = i96;
                    }
                    i7 = i107;
                    i106 = i108;
                    i8 = i105 + 6;
                    if (i8 < i93) {
                        byte b6 = 1;
                        if (bArr5[i105][i7] != 1) {
                            i9 = i105;
                        } else {
                            i9 = i105;
                        }
                    } else {
                        i9 = i105;
                    }
                    i107 = i7 + 1;
                    i96 = i6;
                    i105 = i9;
                }
                i105++;
            }
            int i113 = i96;
            int i114 = (i106 * 40) + i104;
            int i115 = 0;
            for (int i116 = 0; i116 < i93; i116++) {
                byte[] bArr9 = bArr5[i116];
                for (int i117 = 0; i117 < i94; i117++) {
                    int i118 = i115;
                    i115 = bArr9[i117] == 1 ? i118 + 1 : i118;
                }
            }
            int i119 = i93 * i94;
            int iAbs = (((Math.abs((i115 << 1) - i119) * 10) / i119) * 10) + i114;
            if (iAbs < i95) {
                i95 = iAbs;
                i97 = i113;
            }
            i96 = i113 + 1;
        }
        fjf1.m41821f(dh9Var4, cewVarValueOf, aeb1VarM25714a, i97, p4l0Var);
        int i120 = i5 << 1;
        int i121 = i94 + i120;
        int i122 = i120 + i93;
        int iMax7 = Math.max(i2, i121);
        int iMax8 = Math.max(i3, i122);
        int iMin5 = Math.min(iMax7 / i121, iMax8 / i122);
        int i123 = (iMax7 - (i94 * iMin5)) / 2;
        int i124 = (iMax8 - (i93 * iMin5)) / 2;
        fh9 fh9Var = new fh9(iMax7, iMax8);
        int i125 = 0;
        while (i125 < i93) {
            int i126 = i123;
            int i127 = 0;
            while (i127 < i94) {
                if (p4l0Var.m69142n(i127, i125) == 1) {
                    fh9Var.m41652d(i126, i124, iMin5, iMin5);
                }
                i127++;
                i126 += iMin5;
            }
            i125++;
            i124 += iMin5;
        }
        return fh9Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x003b A[RETURN] */
    @Override // p204p.cb31
    /* JADX INFO: renamed from: p */
    public boolean mo32148p(Object obj, Object obj2) {
        m771 m771Var = (m771) obj;
        m771 m771Var2 = (m771) obj2;
        if (m771Var == null || m771Var2 == null) {
            if ((m771Var == null) ^ (m771Var2 == null)) {
                return false;
            }
            return true;
        }
        if (m771Var.f140725a == m771Var2.f140725a && wj50.m88271j(m771Var.f140726b, m771Var2.f140726b) && m771Var.f140727c == m771Var2.f140727c && m771Var.f140728d == m771Var2.f140728d && m771Var.f140729e == m771Var2.f140729e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public xwl m44658q(jkj jkjVar) {
        if (jkjVar instanceof mij) {
            return new nwl(((mij) jkjVar).f144034a);
        }
        if (jkjVar instanceof oij) {
            return new owl(((oij) jkjVar).f165825a);
        }
        if (jkjVar instanceof qij) {
            return new pwl(((qij) jkjVar).f189018a);
        }
        if (jkjVar instanceof fjj) {
            return new rwl(((fjj) jkjVar).f70298a);
        }
        if (jkjVar instanceof ujj) {
            return new twl(((ujj) jkjVar).f231046a);
        }
        if (jkjVar instanceof bkj) {
            return new uwl(((bkj) jkjVar).f27937a);
        }
        if (jkjVar instanceof dkj) {
            return new vwl(((dkj) jkjVar).f49982a);
        }
        if (jkjVar instanceof wij) {
            return new qwl(((wij) jkjVar).f251638a);
        }
        if (jkjVar instanceof gkj) {
            return new wwl(((gkj) jkjVar).f80814a);
        }
        if (jkjVar instanceof hjj) {
            return new swl(((hjj) jkjVar).f92061a);
        }
        return null;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: r */
    public boolean mo24966r(g030 g030Var, lp70 lp70Var) {
        return false;
    }

    @Override // p204p.ymj0
    /* JADX INFO: renamed from: t */
    public boolean mo24967t(exh0 exh0Var) {
        return false;
    }

    public /* synthetic */ gg5(son sonVar, otn otnVar, int i) {
        this.f79535a = i;
    }

    public gg5(a5y a5yVar) {
        this.f79535a = 11;
    }
}
