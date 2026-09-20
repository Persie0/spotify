package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Color;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.compose.p002ui.platform.ComposeView;
import com.comscore.streaming.ContentType;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class mif1 {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f144015a = null;

    /* JADX INFO: renamed from: b */
    public static Thread f144016b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f144017c = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: d */
    public static final int[] f144018d = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: e */
    public static final int[] f144019e = {3, 6};

    /* JADX INFO: renamed from: f */
    public static final int[] f144020f = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: g */
    public static final gey f144021g;

    /* JADX INFO: renamed from: h */
    public static final gey[] f144022h;

    /* JADX INFO: renamed from: i */
    public static boolean f144023i = true;

    static {
        gey geyVar = new gey("app_client", 4L);
        gey geyVar2 = new gey("carrier_auth", 1L);
        gey geyVar3 = new gey("wear3_oem_companion", 1L);
        f144021g = geyVar3;
        f144022h = new gey[]{geyVar, geyVar2, geyVar3, new gey("wear_consent", 2L), new gey("wear_consent_recordoptin", 1L), new gey("wear_consent_supervised", 1L), new gey("wear_fast_pair_account_key_sync", 1L), new gey("wear_get_related_configs", 1L), new gey("wear_get_node_id", 1L), new gey("wear_retry_connection", 1L), new gey("wear_set_cloud_sync_setting_by_node", 1L), new gey("wear_update_config", 1L), new gey("wear_update_connection_retry_strategy", 1L), new gey("wearable_services", 1L)};
    }

    /* JADX INFO: renamed from: C */
    public static final ArrayList m61850C(Map map, gh00 gh00Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            qxi0 qxi0Var = (qxi0) entry.getValue();
            Boolean boolValueOf = qxi0Var != null ? Boolean.valueOf(qxi0Var.m74144b()) : null;
            wj50.m88279p(boolValueOf);
            if (!boolValueOf.booleanValue() && !qxi0Var.m74143a()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) gh00Var.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static final m600 m61851D(int i, String str, String str2, gh00 gh00Var) {
        char cCharAt = str.charAt(i);
        if (((Boolean) gh00Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m61852E(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: E */
    public static final m600 m61852E(String str, String str2) {
        StringBuilder sbM75191i = rbz.m75191i(str2, " when parsing an Instant from \"");
        sbM75191i.append(m61863P(64, str));
        sbM75191i.append('\"');
        return new m600(16, sbM75191i.toString(), str);
    }

    /* JADX INFO: renamed from: F */
    public static final int m61853F(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: G */
    public static void m61854G(a0m a0mVar) {
        a0mVar.m24371d();
        if (a0mVar.m24369b() instanceof Spanned) {
            if (!(a0mVar.m24369b() instanceof Spannable)) {
                a0mVar.m24370c(SpannableString.valueOf(a0mVar.m24369b()));
            }
            CharSequence charSequenceM24369b = a0mVar.m24369b();
            charSequenceM24369b.getClass();
            Spannable spannable = (Spannable) charSequenceM24369b;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static float m61855H(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    /* JADX INFO: renamed from: I */
    public static long m61856I(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: J */
    public static long m61857J(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    /* JADX INFO: renamed from: K */
    public static void m61858K(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            b0b1.m27761h(viewGroup, z);
        } else if (f144023i) {
            try {
                b0b1.m27761h(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f144023i = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m61859L(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    /* JADX INFO: renamed from: M */
    public static byte[] m61860M(qua quaVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = quaVar.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m61877k(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (quaVar.read() == -1) {
            return m61877k(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: N */
    public static final int m61861N(wu11 wu11Var) {
        int iOrdinal = wu11Var.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    /* JADX INFO: renamed from: O */
    public static final int m61862O(xu11 xu11Var) {
        int iOrdinal = xu11Var.ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? 1 : 5;
        }
        return 4;
    }

    /* JADX INFO: renamed from: P */
    public static final String m61863P(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: Q */
    public static final pv91 m61864Q(b250 b250Var) {
        nq91 nq91Var = (nq91) b250Var.mo27941a(f8r0.f67054U0);
        if (nq91Var != null) {
            return nq91Var.f157210b;
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static byte m61865R(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[Catch: all -> 0x009d, PHI: r1
      0x00a1: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v18 java.lang.Thread) binds: [B:7:0x000a, B:46:0x009a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x0098, B:60:0x00c0, B:12:0x001f, B:51:0x00a0, B:52:0x00a1, B:63:0x00c4, B:64:0x00c5, B:53:0x00a2, B:59:0x00bf, B:58:0x00ac, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0073, B:42:0x0083, B:43:0x0096, B:18:0x003c), top: B:78:0x0003, inners: #1, #6 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public static synchronized ClassLoader m61866S() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (f144015a == null) {
            Thread thread2 = f144016b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f144016b.getContextClassLoader();
                    } catch (SecurityException e2) {
                        new StringBuilder(String.valueOf(e2.getMessage()).length() + 41);
                    }
                }
                f144015a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        b6f1 b6f1Var = new b6f1(threadGroup);
                                        try {
                                            b6f1Var.setContextClassLoader(null);
                                            b6f1Var.start();
                                            thread = b6f1Var;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = b6f1Var;
                                            new StringBuilder(String.valueOf(e.getMessage()).length() + 39);
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f144016b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f144016b.getContextClassLoader();
                    }
                }
                f144015a = contextClassLoader;
            }
        }
        return f144015a;
    }

    /* JADX INFO: renamed from: T */
    public static Boolean m61867T(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m61868a(ry8 ry8Var, Object obj, lt60 lt60Var, fxh0 fxh0Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(133760237);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? xq00Var.m91766g(ry8Var) : xq00Var.m91770i(ry8Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? xq00Var.m91766g(obj) : xq00Var.m91770i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(lt60Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            fxh0Var2 = i4 != 0 ? cxh0.f43038a : fxh0Var;
            gw41 gw41VarM42620u = null;
            if (lt60Var instanceof ht60) {
                xq00Var.m91771i0(-878114236);
                Object objM91750T = xq00Var.m91750T();
                if (objM91750T == ia7Var) {
                    objM91750T = ry8Var.getBehavior().mo42333b(null, null, null);
                    xq00Var.m91793t0(objM91750T);
                }
                gw41VarM42620u = (gw41) objM91750T;
                xq00Var.m91788r(false);
            } else if (lt60Var instanceof it60) {
                xq00Var.m91771i0(-878023654);
                it60 it60Var = (it60) lt60Var;
                Object obj2 = it60Var.f105445b;
                boolean zM91766g = xq00Var.m91766g(obj2);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g || objM91750T2 == ia7Var) {
                    objM91750T2 = it60Var.f105444a.m69495a(obj2, ry8Var.getBehavior().mo42334c(), null, new qxt(ry8Var, 0));
                    xq00Var.m91793t0(objM91750T2);
                }
                gw41VarM42620u = (gw41) objM91750T2;
                xq00Var.m91788r(false);
            } else if (lt60Var instanceof kt60) {
                xq00Var.m91771i0(-877762200);
                int i5 = i3 << 3;
                gw41VarM42620u = ftf1.m42620u(((kt60) lt60Var).f126165a.toString(), ry8Var, obj, xq00Var, (i5 & 896) | (i5 & ContentType.LONG_FORM_ON_DEMAND) | (((i3 >> 3) & 8) << 6));
                xq00Var.m91788r(false);
            } else {
                if (!(lt60Var instanceof jt60)) {
                    throw lq51.m59703i(-305422083, xq00Var, false);
                }
                xq00Var.m91771i0(-877560112);
                xq00Var.m91788r(false);
            }
            gw41 gw41Var = gw41VarM42620u;
            int i6 = i3 >> 3;
            m61869b(ry8Var, obj, fxh0Var2, gw41Var, xq00Var, (i3 & 14) | ((i6 & 8) << 3) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | (i6 & 896), 0);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gj0(ry8Var, obj, lt60Var, fxh0Var2, i, i2, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0185  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x0205  */
    /* JADX WARN: Code duplicated, block: B:144:0x021c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0229  */
    /* JADX WARN: Code duplicated, block: B:153:0x0231  */
    /* JADX WARN: Code duplicated, block: B:159:0x023e  */
    /* JADX WARN: Code duplicated, block: B:162:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x024e  */
    /* JADX WARN: Code duplicated, block: B:166:0x025b  */
    /* JADX WARN: Code duplicated, block: B:173:0x026a  */
    /* JADX WARN: Code duplicated, block: B:175:0x026f  */
    /* JADX WARN: Code duplicated, block: B:181:0x027c  */
    /* JADX WARN: Code duplicated, block: B:184:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0291  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:200:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:203:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:204:0x030d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0344  */
    /* JADX WARN: Code duplicated, block: B:215:0x034f  */
    /* JADX WARN: Code duplicated, block: B:217:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x011e  */
    /* JADX INFO: renamed from: b */
    public static final void m61869b(ry8 ry8Var, Object obj, fxh0 fxh0Var, gw41 gw41Var, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        Object obj2;
        int i5;
        int i6;
        boolean z;
        Object obj3;
        Object obj4;
        pgv0 pgv0VarM91796v;
        fxh0 fxh0Var3;
        Object obj5;
        int i7;
        boolean z2;
        Object objM91750T;
        gh00 gh00Var;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objM91750T2;
        gw41 gw41Var2;
        kqi0 kqi0VarM77651H;
        Object objM91750T3;
        Object obj6;
        zx81 zx81Var;
        boolean z6;
        boolean zM91766g;
        Object objM91750T4;
        zx81 zx81Var2;
        Object obj7;
        gw41 gw41Var3;
        Throwable th;
        mjh mjhVar;
        boolean zM91766g2;
        Object objM91750T5;
        kqi0 kqi0Var;
        boolean zM91770i;
        Object objM91750T6;
        boolean zM91770i2;
        Object objM91750T7;
        boolean z7;
        Object objM91750T8;
        boolean zM91766g3;
        Object objM91750T9;
        int iIntValue;
        Object value;
        boolean z8;
        int i8;
        boolean z9;
        boolean zM91766g4;
        Object objM91750T10;
        boolean z10;
        boolean z11;
        boolean zM91770i3;
        Object pekVar;
        kqi0 kqi0Var2;
        mjh mjhVar2;
        boolean zM91766g5;
        Object obj8;
        slv0 slv0Var;
        boolean z12;
        boolean zM91770i4;
        Object objM91750T11;
        ry8 ry8Var2 = ry8Var;
        Object obj9 = t6x0.f217647t;
        xq00Var.m91775k0(-447702630);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? xq00Var.m91766g(ry8Var2) : xq00Var.m91770i(ry8Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? xq00Var.m91766g(obj) : xq00Var.m91770i(obj) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91766g(fxh0Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    obj2 = gw41Var;
                    if (xq00Var.m91766g(obj2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i6 & 1, z)) {
                    if (i9 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj5 = null;
                    } else {
                        obj5 = obj2;
                    }
                    i7 = i6 & 14;
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91766g(ry8Var2))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objM91750T = xq00Var.m91750T();
                    if (z2 || objM91750T == obj9) {
                        objM91750T = m61870c(ry8Var2);
                        xq00Var.m91793t0(objM91750T);
                    }
                    gh00Var = (gh00) objM91750T;
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91766g(ry8Var2))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i6 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z3 | z4;
                    objM91750T2 = xq00Var.m91750T();
                    if (z5 || objM91750T2 == obj9) {
                        if (obj5 == null) {
                            objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                        } else {
                            objM91750T2 = obj5;
                        }
                        xq00Var.m91793t0(objM91750T2);
                    }
                    gw41Var2 = (gw41) objM91750T2;
                    kqi0VarM77651H = sam.m77651H(obj, xq00Var);
                    objM91750T3 = xq00Var.m91750T();
                    if (objM91750T3 == obj9) {
                        objM91750T3 = new slv0();
                        xq00Var.m91793t0(objM91750T3);
                    }
                    obj6 = (slv0) objM91750T3;
                    zx81Var = (zx81) xq00Var.m91774k(vx81.m86649a());
                    Object objMo31974h = gw41Var2.mo31974h();
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91766g(ry8Var2))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zM91766g = z6 | xq00Var.m91766g(objMo31974h);
                    objM91750T4 = xq00Var.m91750T();
                    if (!zM91766g || objM91750T4 == obj9) {
                        zx81Var2 = (zx81) ux81.m84140b().get();
                        ux81.m84140b().set(zx81Var);
                        obj7 = obj6;
                        try {
                            gw41Var3 = gw41Var2;
                            th = null;
                            pek pekVar2 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                            gh00Var = gh00Var;
                            ry8Var2 = ry8Var2;
                            Object objM53562n = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar2);
                            ux81.m84140b().set(zx81Var2);
                            xq00Var.m91793t0(objM53562n);
                            objM91750T4 = objM53562n;
                        } catch (Throwable th2) {
                            ux81.m84140b().set(zx81Var2);
                            throw th2;
                        }
                    } else {
                        obj7 = obj6;
                        gw41Var3 = gw41Var2;
                        th = null;
                    }
                    mjhVar = (mjh) objM91750T4;
                    zM91766g2 = xq00Var.m91766g(mjhVar);
                    objM91750T5 = xq00Var.m91750T();
                    if (zM91766g2 || objM91750T5 == obj9) {
                        objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                        xq00Var.m91793t0(objM91750T5);
                    }
                    kqi0Var = (kqi0) objM91750T5;
                    zM91770i = xq00Var.m91770i(mjhVar) | xq00Var.m91766g(kqi0Var) | xq00Var.m91770i(obj7);
                    objM91750T6 = xq00Var.m91750T();
                    if (zM91770i || objM91750T6 == obj9) {
                        objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                        xq00Var.m91793t0(objM91750T6);
                    }
                    hz40.m49233e(mjhVar, (gh00) objM91750T6, xq00Var);
                    zM91770i2 = xq00Var.m91770i(mjhVar);
                    objM91750T7 = xq00Var.m91750T();
                    if (zM91770i2 || objM91750T7 == obj9) {
                        objM91750T7 = new mcs(mjhVar, 16);
                        xq00Var.m91793t0(objM91750T7);
                    }
                    hz40.m49233e(mjhVar, (gh00) objM91750T7, xq00Var);
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91766g(ry8Var2))) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objM91750T8 = xq00Var.m91750T();
                    if (z7 || objM91750T8 == obj9) {
                        try {
                            objM91750T8 = ry8Var2.mo24359c();
                            xq00Var.m91793t0(objM91750T8);
                        } catch (Exception e) {
                            zuj0.m97048k(e, gh00Var.invoke(obj), mjhVar.f144256b.m60498M(), ry8Var.mo29771b());
                            throw th;
                        }
                    }
                    pwt pwtVar = (pwt) objM91750T8;
                    zM91766g3 = xq00Var.m91766g(mjhVar);
                    objM91750T9 = xq00Var.m91750T();
                    if (zM91766g3 || objM91750T9 == obj9) {
                        objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                        xq00Var.m91793t0(objM91750T9);
                    }
                    iIntValue = ((Number) objM91750T9).intValue();
                    value = kqi0Var.getValue();
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91766g(ry8Var2))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
                    if (i8 != 32 || ((i6 & 64) != 0 && xq00Var.m91766g(obj))) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zM91766g4 = z8 | z9 | xq00Var.m91766g(value);
                    objM91750T10 = xq00Var.m91750T();
                    if (zM91766g4 || objM91750T10 == obj9) {
                        objM91750T10 = new yk91(ry8Var2, obj, value);
                        xq00Var.m91793t0(objM91750T10);
                    }
                    yk91 yk91Var = (yk91) objM91750T10;
                    if (i7 != 4 || ((i6 & 8) != 0 && xq00Var.m91770i(ry8Var2))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i8 != 32 || ((i6 & 64) != 0 && xq00Var.m91770i(obj))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zM91770i3 = z10 | z11 | xq00Var.m91770i(value) | xq00Var.m91766g(gh00Var);
                    Object objM91750T12 = xq00Var.m91750T();
                    if (!zM91770i3 || objM91750T12 == obj9) {
                        kqi0Var2 = kqi0Var;
                        pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                        xq00Var.m91793t0(pekVar);
                    } else {
                        kqi0Var2 = kqi0Var;
                        pekVar = objM91750T12;
                    }
                    mjhVar2 = mjhVar;
                    obj3 = obj;
                    ud6.m82826a(yk91Var, (gh00) pekVar, rkk.m75772x(-667814186, new jri(obj3, mjhVar2, pwtVar, kqi0Var2, gw41Var3, ry8Var, gh00Var, iIntValue, fxh0Var3, i6), xq00Var), xq00Var, 384);
                    zM91766g5 = xq00Var.m91766g(mjhVar2);
                    Object objM91750T13 = xq00Var.m91750T();
                    obj8 = objM91750T13;
                    if (zM91766g5 || objM91750T13 == obj9) {
                        slv0 slv0Var2 = new slv0();
                        slv0Var2.f210497a = obj3;
                        xq00Var.m91793t0(slv0Var2);
                        obj8 = slv0Var2;
                    }
                    slv0Var = (slv0) obj8;
                    if (i8 != 32 || ((i6 & 64) != 0 && xq00Var.m91770i(obj3))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zM91770i4 = xq00Var.m91770i(slv0Var) | z12 | xq00Var.m91770i(mjhVar2) | xq00Var.m91762e(iIntValue);
                    objM91750T11 = xq00Var.m91750T();
                    if (zM91770i4 || objM91750T11 == obj9) {
                        Object dncVar = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                        mjhVar2 = mjhVar2;
                        xq00Var.m91793t0(dncVar);
                        objM91750T11 = dncVar;
                    }
                    hz40.m49236h(obj3, mjhVar2, (th00) objM91750T11, xq00Var);
                    fxh0Var2 = fxh0Var3;
                    obj4 = obj5;
                } else {
                    obj3 = obj;
                    xq00Var.m91757b0();
                    obj4 = obj2;
                }
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new gj0(ry8Var, obj3, fxh0Var2, obj4, i, i2, 19);
                }
            }
            i3 |= 3072;
            obj2 = gw41Var;
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i6 & 1, z)) {
                if (i9 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj5 = null;
                } else {
                    obj5 = obj2;
                }
                i7 = i6 & 14;
                if (i7 != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objM91750T = xq00Var.m91750T();
                if (z2) {
                    objM91750T = m61870c(ry8Var2);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = m61870c(ry8Var2);
                    xq00Var.m91793t0(objM91750T);
                }
                gh00Var = (gh00) objM91750T;
                if (i7 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if ((i6 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objM91750T2 = xq00Var.m91750T();
                if (z5) {
                    if (obj5 == null) {
                        objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                    } else {
                        objM91750T2 = obj5;
                    }
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    if (obj5 == null) {
                        objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                    } else {
                        objM91750T2 = obj5;
                    }
                    xq00Var.m91793t0(objM91750T2);
                }
                gw41Var2 = (gw41) objM91750T2;
                kqi0VarM77651H = sam.m77651H(obj, xq00Var);
                objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == obj9) {
                    objM91750T3 = new slv0();
                    xq00Var.m91793t0(objM91750T3);
                }
                obj6 = (slv0) objM91750T3;
                zx81Var = (zx81) xq00Var.m91774k(vx81.m86649a());
                Object objMo31974h2 = gw41Var2.mo31974h();
                if (i7 != 4) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                zM91766g = z6 | xq00Var.m91766g(objMo31974h2);
                objM91750T4 = xq00Var.m91750T();
                if (zM91766g) {
                    zx81Var2 = (zx81) ux81.m84140b().get();
                    ux81.m84140b().set(zx81Var);
                    obj7 = obj6;
                    gw41Var3 = gw41Var2;
                    th = null;
                    pek pekVar3 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                    gh00Var = gh00Var;
                    ry8Var2 = ry8Var2;
                    Object objM53562n2 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar3);
                    ux81.m84140b().set(zx81Var2);
                    xq00Var.m91793t0(objM53562n2);
                    objM91750T4 = objM53562n2;
                } else {
                    zx81Var2 = (zx81) ux81.m84140b().get();
                    ux81.m84140b().set(zx81Var);
                    obj7 = obj6;
                    gw41Var3 = gw41Var2;
                    th = null;
                    pek pekVar4 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                    gh00Var = gh00Var;
                    ry8Var2 = ry8Var2;
                    Object objM53562n3 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar4);
                    ux81.m84140b().set(zx81Var2);
                    xq00Var.m91793t0(objM53562n3);
                    objM91750T4 = objM53562n3;
                }
                mjhVar = (mjh) objM91750T4;
                zM91766g2 = xq00Var.m91766g(mjhVar);
                objM91750T5 = xq00Var.m91750T();
                if (zM91766g2) {
                    objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                    xq00Var.m91793t0(objM91750T5);
                } else {
                    objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                    xq00Var.m91793t0(objM91750T5);
                }
                kqi0Var = (kqi0) objM91750T5;
                zM91770i = xq00Var.m91770i(mjhVar) | xq00Var.m91766g(kqi0Var) | xq00Var.m91770i(obj7);
                objM91750T6 = xq00Var.m91750T();
                if (zM91770i) {
                    objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                    xq00Var.m91793t0(objM91750T6);
                } else {
                    objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                    xq00Var.m91793t0(objM91750T6);
                }
                hz40.m49233e(mjhVar, (gh00) objM91750T6, xq00Var);
                zM91770i2 = xq00Var.m91770i(mjhVar);
                objM91750T7 = xq00Var.m91750T();
                if (zM91770i2) {
                    objM91750T7 = new mcs(mjhVar, 16);
                    xq00Var.m91793t0(objM91750T7);
                } else {
                    objM91750T7 = new mcs(mjhVar, 16);
                    xq00Var.m91793t0(objM91750T7);
                }
                hz40.m49233e(mjhVar, (gh00) objM91750T7, xq00Var);
                if (i7 != 4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                objM91750T8 = xq00Var.m91750T();
                if (z7) {
                    objM91750T8 = ry8Var2.mo24359c();
                    xq00Var.m91793t0(objM91750T8);
                } else {
                    objM91750T8 = ry8Var2.mo24359c();
                    xq00Var.m91793t0(objM91750T8);
                }
                pwt pwtVar2 = (pwt) objM91750T8;
                zM91766g3 = xq00Var.m91766g(mjhVar);
                objM91750T9 = xq00Var.m91750T();
                if (zM91766g3) {
                    objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                    xq00Var.m91793t0(objM91750T9);
                } else {
                    objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                    xq00Var.m91793t0(objM91750T9);
                }
                iIntValue = ((Number) objM91750T9).intValue();
                value = kqi0Var.getValue();
                if (i7 != 4) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
                if (i8 != 32) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                zM91766g4 = z8 | z9 | xq00Var.m91766g(value);
                objM91750T10 = xq00Var.m91750T();
                if (zM91766g4) {
                    objM91750T10 = new yk91(ry8Var2, obj, value);
                    xq00Var.m91793t0(objM91750T10);
                } else {
                    objM91750T10 = new yk91(ry8Var2, obj, value);
                    xq00Var.m91793t0(objM91750T10);
                }
                yk91 yk91Var2 = (yk91) objM91750T10;
                if (i7 != 4) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (i8 != 32) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                zM91770i3 = z10 | z11 | xq00Var.m91770i(value) | xq00Var.m91766g(gh00Var);
                Object objM91750T14 = xq00Var.m91750T();
                if (zM91770i3) {
                    kqi0Var2 = kqi0Var;
                    pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                    xq00Var.m91793t0(pekVar);
                } else {
                    kqi0Var2 = kqi0Var;
                    pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                    xq00Var.m91793t0(pekVar);
                }
                mjhVar2 = mjhVar;
                obj3 = obj;
                ud6.m82826a(yk91Var2, (gh00) pekVar, rkk.m75772x(-667814186, new jri(obj3, mjhVar2, pwtVar2, kqi0Var2, gw41Var3, ry8Var, gh00Var, iIntValue, fxh0Var3, i6), xq00Var), xq00Var, 384);
                zM91766g5 = xq00Var.m91766g(mjhVar2);
                Object objM91750T15 = xq00Var.m91750T();
                obj8 = objM91750T15;
                if (zM91766g5) {
                    slv0 slv0Var3 = new slv0();
                    slv0Var3.f210497a = obj3;
                    xq00Var.m91793t0(slv0Var3);
                    obj8 = slv0Var3;
                } else {
                    slv0 slv0Var4 = new slv0();
                    slv0Var4.f210497a = obj3;
                    xq00Var.m91793t0(slv0Var4);
                    obj8 = slv0Var4;
                }
                slv0Var = (slv0) obj8;
                if (i8 != 32) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                zM91770i4 = xq00Var.m91770i(slv0Var) | z12 | xq00Var.m91770i(mjhVar2) | xq00Var.m91762e(iIntValue);
                objM91750T11 = xq00Var.m91750T();
                if (zM91770i4) {
                    Object dncVar2 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                    mjhVar2 = mjhVar2;
                    xq00Var.m91793t0(dncVar2);
                    objM91750T11 = dncVar2;
                } else {
                    Object dncVar3 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                    mjhVar2 = mjhVar2;
                    xq00Var.m91793t0(dncVar3);
                    objM91750T11 = dncVar3;
                }
                hz40.m49236h(obj3, mjhVar2, (th00) objM91750T11, xq00Var);
                fxh0Var2 = fxh0Var3;
                obj4 = obj5;
            } else {
                obj3 = obj;
                xq00Var.m91757b0();
                obj4 = obj2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gj0(ry8Var, obj3, fxh0Var2, obj4, i, i2, 19);
            }
        }
        i3 |= 384;
        fxh0Var2 = fxh0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                obj2 = gw41Var;
                if (xq00Var.m91766g(obj2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i6 & 1, z)) {
                if (i9 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj5 = null;
                } else {
                    obj5 = obj2;
                }
                i7 = i6 & 14;
                if (i7 != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objM91750T = xq00Var.m91750T();
                if (z2) {
                    objM91750T = m61870c(ry8Var2);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    objM91750T = m61870c(ry8Var2);
                    xq00Var.m91793t0(objM91750T);
                }
                gh00Var = (gh00) objM91750T;
                if (i7 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if ((i6 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z3 | z4;
                objM91750T2 = xq00Var.m91750T();
                if (z5) {
                    if (obj5 == null) {
                        objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                    } else {
                        objM91750T2 = obj5;
                    }
                    xq00Var.m91793t0(objM91750T2);
                } else {
                    if (obj5 == null) {
                        objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                    } else {
                        objM91750T2 = obj5;
                    }
                    xq00Var.m91793t0(objM91750T2);
                }
                gw41Var2 = (gw41) objM91750T2;
                kqi0VarM77651H = sam.m77651H(obj, xq00Var);
                objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == obj9) {
                    objM91750T3 = new slv0();
                    xq00Var.m91793t0(objM91750T3);
                }
                obj6 = (slv0) objM91750T3;
                zx81Var = (zx81) xq00Var.m91774k(vx81.m86649a());
                Object objMo31974h3 = gw41Var2.mo31974h();
                if (i7 != 4) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                zM91766g = z6 | xq00Var.m91766g(objMo31974h3);
                objM91750T4 = xq00Var.m91750T();
                if (zM91766g) {
                    zx81Var2 = (zx81) ux81.m84140b().get();
                    ux81.m84140b().set(zx81Var);
                    obj7 = obj6;
                    gw41Var3 = gw41Var2;
                    th = null;
                    pek pekVar5 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                    gh00Var = gh00Var;
                    ry8Var2 = ry8Var2;
                    Object objM53562n4 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar5);
                    ux81.m84140b().set(zx81Var2);
                    xq00Var.m91793t0(objM53562n4);
                    objM91750T4 = objM53562n4;
                } else {
                    zx81Var2 = (zx81) ux81.m84140b().get();
                    ux81.m84140b().set(zx81Var);
                    obj7 = obj6;
                    gw41Var3 = gw41Var2;
                    th = null;
                    pek pekVar6 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                    gh00Var = gh00Var;
                    ry8Var2 = ry8Var2;
                    Object objM53562n5 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar6);
                    ux81.m84140b().set(zx81Var2);
                    xq00Var.m91793t0(objM53562n5);
                    objM91750T4 = objM53562n5;
                }
                mjhVar = (mjh) objM91750T4;
                zM91766g2 = xq00Var.m91766g(mjhVar);
                objM91750T5 = xq00Var.m91750T();
                if (zM91766g2) {
                    objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                    xq00Var.m91793t0(objM91750T5);
                } else {
                    objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                    xq00Var.m91793t0(objM91750T5);
                }
                kqi0Var = (kqi0) objM91750T5;
                zM91770i = xq00Var.m91770i(mjhVar) | xq00Var.m91766g(kqi0Var) | xq00Var.m91770i(obj7);
                objM91750T6 = xq00Var.m91750T();
                if (zM91770i) {
                    objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                    xq00Var.m91793t0(objM91750T6);
                } else {
                    objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                    xq00Var.m91793t0(objM91750T6);
                }
                hz40.m49233e(mjhVar, (gh00) objM91750T6, xq00Var);
                zM91770i2 = xq00Var.m91770i(mjhVar);
                objM91750T7 = xq00Var.m91750T();
                if (zM91770i2) {
                    objM91750T7 = new mcs(mjhVar, 16);
                    xq00Var.m91793t0(objM91750T7);
                } else {
                    objM91750T7 = new mcs(mjhVar, 16);
                    xq00Var.m91793t0(objM91750T7);
                }
                hz40.m49233e(mjhVar, (gh00) objM91750T7, xq00Var);
                if (i7 != 4) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                objM91750T8 = xq00Var.m91750T();
                if (z7) {
                    objM91750T8 = ry8Var2.mo24359c();
                    xq00Var.m91793t0(objM91750T8);
                } else {
                    objM91750T8 = ry8Var2.mo24359c();
                    xq00Var.m91793t0(objM91750T8);
                }
                pwt pwtVar3 = (pwt) objM91750T8;
                zM91766g3 = xq00Var.m91766g(mjhVar);
                objM91750T9 = xq00Var.m91750T();
                if (zM91766g3) {
                    objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                    xq00Var.m91793t0(objM91750T9);
                } else {
                    objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                    xq00Var.m91793t0(objM91750T9);
                }
                iIntValue = ((Number) objM91750T9).intValue();
                value = kqi0Var.getValue();
                if (i7 != 4) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
                if (i8 != 32) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                zM91766g4 = z8 | z9 | xq00Var.m91766g(value);
                objM91750T10 = xq00Var.m91750T();
                if (zM91766g4) {
                    objM91750T10 = new yk91(ry8Var2, obj, value);
                    xq00Var.m91793t0(objM91750T10);
                } else {
                    objM91750T10 = new yk91(ry8Var2, obj, value);
                    xq00Var.m91793t0(objM91750T10);
                }
                yk91 yk91Var3 = (yk91) objM91750T10;
                if (i7 != 4) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (i8 != 32) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                zM91770i3 = z10 | z11 | xq00Var.m91770i(value) | xq00Var.m91766g(gh00Var);
                Object objM91750T16 = xq00Var.m91750T();
                if (zM91770i3) {
                    kqi0Var2 = kqi0Var;
                    pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                    xq00Var.m91793t0(pekVar);
                } else {
                    kqi0Var2 = kqi0Var;
                    pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                    xq00Var.m91793t0(pekVar);
                }
                mjhVar2 = mjhVar;
                obj3 = obj;
                ud6.m82826a(yk91Var3, (gh00) pekVar, rkk.m75772x(-667814186, new jri(obj3, mjhVar2, pwtVar3, kqi0Var2, gw41Var3, ry8Var, gh00Var, iIntValue, fxh0Var3, i6), xq00Var), xq00Var, 384);
                zM91766g5 = xq00Var.m91766g(mjhVar2);
                Object objM91750T17 = xq00Var.m91750T();
                obj8 = objM91750T17;
                if (zM91766g5) {
                    slv0 slv0Var5 = new slv0();
                    slv0Var5.f210497a = obj3;
                    xq00Var.m91793t0(slv0Var5);
                    obj8 = slv0Var5;
                } else {
                    slv0 slv0Var6 = new slv0();
                    slv0Var6.f210497a = obj3;
                    xq00Var.m91793t0(slv0Var6);
                    obj8 = slv0Var6;
                }
                slv0Var = (slv0) obj8;
                if (i8 != 32) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                zM91770i4 = xq00Var.m91770i(slv0Var) | z12 | xq00Var.m91770i(mjhVar2) | xq00Var.m91762e(iIntValue);
                objM91750T11 = xq00Var.m91750T();
                if (zM91770i4) {
                    Object dncVar4 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                    mjhVar2 = mjhVar2;
                    xq00Var.m91793t0(dncVar4);
                    objM91750T11 = dncVar4;
                } else {
                    Object dncVar5 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                    mjhVar2 = mjhVar2;
                    xq00Var.m91793t0(dncVar5);
                    objM91750T11 = dncVar5;
                }
                hz40.m49236h(obj3, mjhVar2, (th00) objM91750T11, xq00Var);
                fxh0Var2 = fxh0Var3;
                obj4 = obj5;
            } else {
                obj3 = obj;
                xq00Var.m91757b0();
                obj4 = obj2;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new gj0(ry8Var, obj3, fxh0Var2, obj4, i, i2, 19);
            }
        }
        i3 |= 3072;
        obj2 = gw41Var;
        i6 = i3;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i6 & 1, z)) {
            if (i9 != 0) {
                fxh0Var3 = cxh0.f43038a;
            } else {
                fxh0Var3 = fxh0Var2;
            }
            if (i4 != 0) {
                obj5 = null;
            } else {
                obj5 = obj2;
            }
            i7 = i6 & 14;
            if (i7 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            objM91750T = xq00Var.m91750T();
            if (z2) {
                objM91750T = m61870c(ry8Var2);
                xq00Var.m91793t0(objM91750T);
            } else {
                objM91750T = m61870c(ry8Var2);
                xq00Var.m91793t0(objM91750T);
            }
            gh00Var = (gh00) objM91750T;
            if (i7 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            if ((i6 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = z3 | z4;
            objM91750T2 = xq00Var.m91750T();
            if (z5) {
                if (obj5 == null) {
                    objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                } else {
                    objM91750T2 = obj5;
                }
                xq00Var.m91793t0(objM91750T2);
            } else {
                if (obj5 == null) {
                    objM91750T2 = ry8Var2.getBehavior().mo42333b(null, null, null);
                } else {
                    objM91750T2 = obj5;
                }
                xq00Var.m91793t0(objM91750T2);
            }
            gw41Var2 = (gw41) objM91750T2;
            kqi0VarM77651H = sam.m77651H(obj, xq00Var);
            objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == obj9) {
                objM91750T3 = new slv0();
                xq00Var.m91793t0(objM91750T3);
            }
            obj6 = (slv0) objM91750T3;
            zx81Var = (zx81) xq00Var.m91774k(vx81.m86649a());
            Object objMo31974h4 = gw41Var2.mo31974h();
            if (i7 != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            zM91766g = z6 | xq00Var.m91766g(objMo31974h4);
            objM91750T4 = xq00Var.m91750T();
            if (zM91766g) {
                zx81Var2 = (zx81) ux81.m84140b().get();
                ux81.m84140b().set(zx81Var);
                obj7 = obj6;
                gw41Var3 = gw41Var2;
                th = null;
                pek pekVar7 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                gh00Var = gh00Var;
                ry8Var2 = ry8Var2;
                Object objM53562n6 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar7);
                ux81.m84140b().set(zx81Var2);
                xq00Var.m91793t0(objM53562n6);
                objM91750T4 = objM53562n6;
            } else {
                zx81Var2 = (zx81) ux81.m84140b().get();
                ux81.m84140b().set(zx81Var);
                obj7 = obj6;
                gw41Var3 = gw41Var2;
                th = null;
                pek pekVar8 = new pek((Object) gh00Var, obj7, kqi0VarM77651H, (Object) ry8Var2, 16);
                gh00Var = gh00Var;
                ry8Var2 = ry8Var2;
                Object objM53562n7 = jjf1.m53562n(ry8Var2, obj, gw41Var3, pekVar8);
                ux81.m84140b().set(zx81Var2);
                xq00Var.m91793t0(objM53562n7);
                objM91750T4 = objM53562n7;
            }
            mjhVar = (mjh) objM91750T4;
            zM91766g2 = xq00Var.m91766g(mjhVar);
            objM91750T5 = xq00Var.m91750T();
            if (zM91766g2) {
                objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                xq00Var.m91793t0(objM91750T5);
            } else {
                objM91750T5 = sam.m77645B(mjhVar.f144256b.m60498M());
                xq00Var.m91793t0(objM91750T5);
            }
            kqi0Var = (kqi0) objM91750T5;
            zM91770i = xq00Var.m91770i(mjhVar) | xq00Var.m91766g(kqi0Var) | xq00Var.m91770i(obj7);
            objM91750T6 = xq00Var.m91750T();
            if (zM91770i) {
                objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                xq00Var.m91793t0(objM91750T6);
            } else {
                objM91750T6 = new ziq(mjhVar, kqi0Var, obj7, 14);
                xq00Var.m91793t0(objM91750T6);
            }
            hz40.m49233e(mjhVar, (gh00) objM91750T6, xq00Var);
            zM91770i2 = xq00Var.m91770i(mjhVar);
            objM91750T7 = xq00Var.m91750T();
            if (zM91770i2) {
                objM91750T7 = new mcs(mjhVar, 16);
                xq00Var.m91793t0(objM91750T7);
            } else {
                objM91750T7 = new mcs(mjhVar, 16);
                xq00Var.m91793t0(objM91750T7);
            }
            hz40.m49233e(mjhVar, (gh00) objM91750T7, xq00Var);
            if (i7 != 4) {
                z7 = true;
            } else {
                z7 = true;
            }
            objM91750T8 = xq00Var.m91750T();
            if (z7) {
                objM91750T8 = ry8Var2.mo24359c();
                xq00Var.m91793t0(objM91750T8);
            } else {
                objM91750T8 = ry8Var2.mo24359c();
                xq00Var.m91793t0(objM91750T8);
            }
            pwt pwtVar4 = (pwt) objM91750T8;
            zM91766g3 = xq00Var.m91766g(mjhVar);
            objM91750T9 = xq00Var.m91750T();
            if (zM91766g3) {
                objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                xq00Var.m91793t0(objM91750T9);
            } else {
                objM91750T9 = Integer.valueOf(System.identityHashCode(mjhVar));
                xq00Var.m91793t0(objM91750T9);
            }
            iIntValue = ((Number) objM91750T9).intValue();
            value = kqi0Var.getValue();
            if (i7 != 4) {
                z8 = true;
            } else {
                z8 = true;
            }
            i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
            if (i8 != 32) {
                z9 = true;
            } else {
                z9 = true;
            }
            zM91766g4 = z8 | z9 | xq00Var.m91766g(value);
            objM91750T10 = xq00Var.m91750T();
            if (zM91766g4) {
                objM91750T10 = new yk91(ry8Var2, obj, value);
                xq00Var.m91793t0(objM91750T10);
            } else {
                objM91750T10 = new yk91(ry8Var2, obj, value);
                xq00Var.m91793t0(objM91750T10);
            }
            yk91 yk91Var4 = (yk91) objM91750T10;
            if (i7 != 4) {
                z10 = true;
            } else {
                z10 = true;
            }
            if (i8 != 32) {
                z11 = true;
            } else {
                z11 = true;
            }
            zM91770i3 = z10 | z11 | xq00Var.m91770i(value) | xq00Var.m91766g(gh00Var);
            Object objM91750T18 = xq00Var.m91750T();
            if (zM91770i3) {
                kqi0Var2 = kqi0Var;
                pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                xq00Var.m91793t0(pekVar);
            } else {
                kqi0Var2 = kqi0Var;
                pekVar = new pek(ry8Var2, obj, value, gh00Var, 15);
                xq00Var.m91793t0(pekVar);
            }
            mjhVar2 = mjhVar;
            obj3 = obj;
            ud6.m82826a(yk91Var4, (gh00) pekVar, rkk.m75772x(-667814186, new jri(obj3, mjhVar2, pwtVar4, kqi0Var2, gw41Var3, ry8Var, gh00Var, iIntValue, fxh0Var3, i6), xq00Var), xq00Var, 384);
            zM91766g5 = xq00Var.m91766g(mjhVar2);
            Object objM91750T19 = xq00Var.m91750T();
            obj8 = objM91750T19;
            if (zM91766g5) {
                slv0 slv0Var7 = new slv0();
                slv0Var7.f210497a = obj3;
                xq00Var.m91793t0(slv0Var7);
                obj8 = slv0Var7;
            } else {
                slv0 slv0Var8 = new slv0();
                slv0Var8.f210497a = obj3;
                xq00Var.m91793t0(slv0Var8);
                obj8 = slv0Var8;
            }
            slv0Var = (slv0) obj8;
            if (i8 != 32) {
                z12 = true;
            } else {
                z12 = true;
            }
            zM91770i4 = xq00Var.m91770i(slv0Var) | z12 | xq00Var.m91770i(mjhVar2) | xq00Var.m91762e(iIntValue);
            objM91750T11 = xq00Var.m91750T();
            if (zM91770i4) {
                Object dncVar6 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                mjhVar2 = mjhVar2;
                xq00Var.m91793t0(dncVar6);
                objM91750T11 = dncVar6;
            } else {
                Object dncVar7 = new dnc(obj3, slv0Var, mjhVar2, iIntValue, (fbk) null);
                mjhVar2 = mjhVar2;
                xq00Var.m91793t0(dncVar7);
                objM91750T11 = dncVar7;
            }
            hz40.m49236h(obj3, mjhVar2, (th00) objM91750T11, xq00Var);
            fxh0Var2 = fxh0Var3;
            obj4 = obj5;
        } else {
            obj3 = obj;
            xq00Var.m91757b0();
            obj4 = obj2;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gj0(ry8Var, obj3, fxh0Var2, obj4, i, i2, 19);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final gh00 m61870c(ry8 ry8Var) {
        if (!(ry8Var instanceof cjc0)) {
            return ry8Var instanceof cjc0 ? m61870c(((cjc0) ry8Var).f38561a) : m1k.f138994L0;
        }
        cjc0 cjc0Var = (cjc0) ry8Var;
        gh00 gh00VarM61870c = m61870c(cjc0Var.f38561a);
        gh00 gh00Var = cjc0Var.f38562b;
        zn91.m96579u(1, gh00Var);
        return new dos(gh00Var, gh00VarM61870c, 1);
    }

    /* JADX WARN: Code duplicated, block: B:253:0x0513  */
    /* JADX WARN: Code duplicated, block: B:256:0x0523  */
    /* JADX WARN: Code duplicated, block: B:259:0x0536  */
    /* JADX WARN: Code duplicated, block: B:265:0x0544  */
    /* JADX WARN: Code duplicated, block: B:269:0x0569  */
    /* JADX WARN: Code duplicated, block: B:270:0x056c  */
    /* JADX WARN: Code duplicated, block: B:273:0x0573  */
    /* JADX WARN: Code duplicated, block: B:274:0x0576  */
    /* JADX WARN: Code duplicated, block: B:277:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x0582  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:284:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:287:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:288:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:291:0x05dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x05de  */
    /* JADX INFO: renamed from: d */
    public static final void m61871d(Object obj, mjh mjhVar, pwt pwtVar, rv41 rv41Var, gw41 gw41Var, String str, gh00 gh00Var, int i, fxh0 fxh0Var, xq00 xq00Var, int i2) {
        int i3;
        xq00 xq00Var2;
        yxt yxtVarM57706k;
        eh00 eh00VarM65830i;
        Object gnqVar;
        slv0 slv0Var;
        String str2;
        gw41 gw41Var2;
        kqi0 kqi0Var;
        kqi0 kqi0Var2;
        Object obj2;
        int i4;
        Object mxtVar;
        fmu0 fmu0Var;
        slv0 slv0Var2;
        sqi0 sqi0Var;
        kqi0 kqi0Var3;
        kqi0 kqi0Var4;
        slv0 slv0Var3;
        ia7 ia7Var;
        slv0 slv0Var4;
        rv41 rv41Var2;
        Object oxtVar;
        sqi0 sqi0Var2;
        kqi0 kqi0Var5;
        kqi0 kqi0Var6;
        Object objM91750T;
        slv0 slv0Var5;
        Object objM91750T2;
        slv0 slv0Var6;
        Object obj3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objM91750T3;
        slv0 slv0Var7;
        ia7 ia7Var2;
        int i5;
        slv0 slv0Var8;
        xq00 xq00Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objM91750T4;
        mjh mjhVar2 = mjhVar;
        xq00Var.m91775k0(976896096);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? xq00Var.m91766g(obj) : xq00Var.m91770i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? xq00Var.m91766g(mjhVar2) : xq00Var.m91770i(mjhVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? xq00Var.m91766g(pwtVar) : xq00Var.m91770i(pwtVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq00Var.m91766g(rv41Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq00Var.m91766g(gw41Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= xq00Var.m91766g(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= xq00Var.m91770i(gh00Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= xq00Var.m91762e(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 67108864 : 33554432;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 38347923) != 38347922)) {
            kqi0 kqi0VarM77651H = sam.m77651H(mjhVar2, xq00Var);
            int i6 = i3 & 8;
            int i7 = i3 & 14;
            kqi0 kqi0VarM77651H2 = sam.m77651H(obj, xq00Var);
            wpi0 wpi0Var = xwt.f266743a;
            fmu0 fmu0VarM69676b = pda0.m69676b(xq00Var);
            int i8 = i3;
            Object objM91750T5 = xq00Var.m91750T();
            ia7 ia7Var3 = t6x0.f217647t;
            if (objM91750T5 == ia7Var3) {
                objM91750T5 = new slv0();
                xq00Var.m91793t0(objM91750T5);
            }
            slv0 slv0Var9 = (slv0) objM91750T5;
            slv0Var9.f210497a = fmu0VarM69676b.getValue();
            Object objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == ia7Var3) {
                objM91750T6 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T6);
            }
            kqi0 kqi0Var7 = (kqi0) objM91750T6;
            Object objM91750T7 = xq00Var.m91750T();
            if (objM91750T7 == ia7Var3) {
                objM91750T7 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T7);
            }
            kqi0 kqi0Var8 = (kqi0) objM91750T7;
            Object objM91750T8 = xq00Var.m91750T();
            if (objM91750T8 == ia7Var3) {
                b250 b250Var = (b250) slv0Var9.f210497a;
                objM91750T8 = sam.m77645B(b250Var != null ? pgg1.m69892o(b250Var) : null);
                xq00Var.m91793t0(objM91750T8);
            }
            kqi0 kqi0Var9 = (kqi0) objM91750T8;
            b250 b250Var2 = (b250) slv0Var9.f210497a;
            if (b250Var2 == null || (yxtVarM57706k = kyf1.m57706k(b250Var2)) == null) {
                yxtVarM57706k = (yxt) kqi0Var7.getValue();
                if (yxtVarM57706k == null) {
                    throw new IllegalArgumentException("logger factory is not provided by the environment. You can provide it by calling ViewTreeInstrumentationEnvironment.set(view, InstrumentationLoggerFactory on the root view of the page");
                }
            } else {
                kqi0Var7.setValue(yxtVarM57706k);
            }
            b250 b250Var3 = (b250) slv0Var9.f210497a;
            if (b250Var3 == null || (eh00VarM65830i = nxf1.m65830i(b250Var3)) == null) {
                eh00VarM65830i = (eh00) kqi0Var8.getValue();
                if (eh00VarM65830i == null) {
                    throw new IllegalArgumentException("Container provider for tracking visibility changes is not provided by the environment. You can provide it by calling ViewTreeInstrumentationEnvironment.set(view, InstrumentationContainerProvider on the root view of the page");
                }
            } else {
                kqi0Var8.setValue(eh00VarM65830i);
            }
            Object objM91750T9 = xq00Var.m91750T();
            if (objM91750T9 == ia7Var3) {
                objM91750T9 = new slv0();
                xq00Var.m91793t0(objM91750T9);
            }
            slv0 slv0Var10 = (slv0) objM91750T9;
            Object objM91750T10 = xq00Var.m91750T();
            if (objM91750T10 == ia7Var3) {
                objM91750T10 = new slv0();
                xq00Var.m91793t0(objM91750T10);
            }
            slv0 slv0Var11 = (slv0) objM91750T10;
            Object objM91750T11 = xq00Var.m91750T();
            if (objM91750T11 == ia7Var3) {
                objM91750T11 = new slv0();
                xq00Var.m91793t0(objM91750T11);
            }
            slv0 slv0Var12 = (slv0) objM91750T11;
            if (!wj50.m88271j(slv0Var10.f210497a, yxtVarM57706k) || slv0Var11.f210497a != gw41Var) {
                slv0Var10.f210497a = yxtVarM57706k;
                slv0Var11.f210497a = gw41Var;
                slv0Var12.f210497a = yxtVarM57706k.create();
            }
            kqi0 kqi0VarM77651H3 = sam.m77651H(eh00VarM65830i, xq00Var);
            String strMo31974h = gw41Var.mo31974h();
            Integer numValueOf = Integer.valueOf(i);
            int i9 = i8 & 458752;
            int i10 = i8 & 57344;
            boolean zM91770i = (i9 == 131072) | xq00Var.m91770i(slv0Var9) | (i10 == 16384);
            int i11 = i8 & 29360128;
            boolean zM91766g = zM91770i | (i11 == 8388608) | xq00Var.m91766g(kqi0VarM77651H2) | xq00Var.m91766g(kqi0VarM77651H);
            Object objM91750T12 = xq00Var.m91750T();
            if (zM91766g || objM91750T12 == ia7Var3) {
                gnqVar = new gnq(slv0Var9, str, gw41Var, i, kqi0VarM77651H2, kqi0VarM77651H, (fbk) null);
                slv0Var = slv0Var9;
                str2 = str;
                gw41Var2 = gw41Var;
                kqi0Var = kqi0VarM77651H2;
                kqi0Var2 = kqi0VarM77651H;
                xq00Var.m91793t0(gnqVar);
            } else {
                gw41Var2 = gw41Var;
                kqi0Var2 = kqi0VarM77651H;
                kqi0Var = kqi0VarM77651H2;
                str2 = str;
                gnqVar = objM91750T12;
                slv0Var = slv0Var9;
            }
            hz40.m49235g(str2, strMo31974h, numValueOf, (th00) gnqVar, xq00Var);
            String strMo31974h2 = gw41Var2.mo31974h();
            Integer numValueOf2 = Integer.valueOf(i);
            boolean zM91770i2 = (i11 == 8388608) | xq00Var.m91770i(slv0Var) | (i9 == 131072) | (i10 == 16384);
            Object objM91750T13 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T13 == ia7Var3) {
                objM91750T13 = new kxt(slv0Var, str2, gw41Var2, i);
                xq00Var.m91793t0(objM91750T13);
            }
            hz40.m49231c(str2, strMo31974h2, numValueOf2, (gh00) objM91750T13, xq00Var);
            boolean z8 = (i8 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i8 & 64) != 0 && xq00Var.m91766g(mjhVar2));
            Object objM91750T14 = xq00Var.m91750T();
            if (z8 || objM91750T14 == ia7Var3) {
                loi0 loi0Var = new loi0();
                loi0Var.m59569a(true);
                xq00Var.m91793t0(loi0Var);
                obj2 = loi0Var;
            } else {
                obj2 = objM91750T14;
            }
            loi0 loi0Var2 = (loi0) obj2;
            boolean zM91770i3 = xq00Var.m91770i(loi0Var2);
            Object objM91750T15 = xq00Var.m91750T();
            if (zM91770i3 || objM91750T15 == ia7Var3) {
                objM91750T15 = new mcs(loi0Var2, 15);
                xq00Var.m91793t0(objM91750T15);
            }
            hz40.m49233e(loi0Var2, (gh00) objM91750T15, xq00Var);
            Object objM91750T16 = xq00Var.m91750T();
            if (objM91750T16 == ia7Var3) {
                objM91750T16 = new sqi0();
                xq00Var.m91793t0(objM91750T16);
            }
            sqi0 sqi0Var3 = (sqi0) objM91750T16;
            kqi0 kqi0Var10 = kqi0Var2;
            boolean zM91770i4 = xq00Var.m91770i(fmu0VarM69676b) | xq00Var.m91770i(slv0Var) | xq00Var.m91770i(slv0Var10) | xq00Var.m91770i(slv0Var12) | xq00Var.m91766g(kqi0Var10);
            kqi0 kqi0Var11 = kqi0Var;
            boolean zM91766g2 = (i9 == 131072) | zM91770i4 | xq00Var.m91766g(kqi0Var11) | xq00Var.m91770i(sqi0Var3);
            int i12 = i8 & 3670016;
            boolean z9 = zM91766g2 | (i12 == 1048576);
            Object objM91750T17 = xq00Var.m91750T();
            if (z9 || objM91750T17 == ia7Var3) {
                i4 = i12;
                slv0 slv0Var13 = slv0Var;
                fmu0Var = fmu0VarM69676b;
                mxtVar = new mxt(fmu0Var, slv0Var13, sqi0Var3, slv0Var12, str2, gh00Var, slv0Var10, kqi0Var7, kqi0Var8, kqi0Var9, kqi0Var10, kqi0Var11, null);
                slv0Var2 = slv0Var13;
                sqi0Var = sqi0Var3;
                kqi0Var3 = kqi0Var10;
                kqi0Var4 = kqi0Var11;
                xq00Var.m91793t0(mxtVar);
            } else {
                mxtVar = objM91750T17;
                i4 = i12;
                slv0Var2 = slv0Var;
                sqi0Var = sqi0Var3;
                fmu0Var = fmu0VarM69676b;
                kqi0Var4 = kqi0Var11;
                kqi0Var3 = kqi0Var10;
            }
            hz40.m49237i(fmu0Var, (th00) mxtVar, xq00Var);
            eh00 eh00Var = (eh00) kqi0VarM77651H3.getValue();
            uam0 uam0Var = (uam0) kqi0Var9.getValue();
            slv0 slv0Var14 = slv0Var2;
            boolean zM91766g3 = xq00Var.m91766g(kqi0Var3) | xq00Var.m91770i(sqi0Var) | xq00Var.m91766g(kqi0Var4) | xq00Var.m91770i(slv0Var12) | xq00Var.m91770i(slv0Var2) | (i9 == 131072) | (i4 == 1048576) | xq00Var.m91770i(loi0Var2) | (i11 == 8388608);
            Object objM91750T18 = xq00Var.m91750T();
            if (zM91766g3 || objM91750T18 == ia7Var3) {
                rg1 rg1Var = new rg1(sqi0Var, slv0Var12, slv0Var14, str, gh00Var, loi0Var2, i, kqi0Var3, kqi0Var4);
                slv0Var3 = slv0Var12;
                slv0Var14 = slv0Var14;
                xq00Var.m91793t0(rg1Var);
                objM91750T18 = rg1Var;
            } else {
                slv0Var3 = slv0Var12;
            }
            gh00 gh00Var2 = (gh00) objM91750T18;
            boolean zM91770i5 = xq00Var.m91770i(loi0Var2) | xq00Var.m91766g(kqi0VarM77651H3);
            Object objM91750T19 = xq00Var.m91750T();
            if (zM91770i5 || objM91750T19 == ia7Var3) {
                objM91750T19 = new u0t(6, loi0Var2, kqi0VarM77651H3);
                xq00Var.m91793t0(objM91750T19);
            }
            kqi0 kqi0Var12 = kqi0Var3;
            slv0 slv0Var15 = slv0Var3;
            kqi0 kqi0Var13 = kqi0Var4;
            slv0 slv0Var16 = slv0Var14;
            int i13 = i4;
            sqi0 sqi0Var4 = sqi0Var;
            jfg1.m53182e(eh00Var, uam0Var, gh00Var2, (gh00) objM91750T19, fxh0Var, rkk.m75772x(1823080009, new ipl(gw41Var, loi0Var2, i, pwtVar, rv41Var, kqi0Var13, kqi0Var12, slv0Var15, slv0Var14, str, gh00Var), xq00Var), xq00Var, ((i8 >> 12) & 57344) | 196608);
            boolean zM91770i6 = xq00Var.m91770i(slv0Var16) | ((i8 & 7168) == 2048) | (i9 == 131072) | (i10 == 16384) | xq00Var.m91766g(kqi0Var12) | xq00Var.m91766g(kqi0Var13) | xq00Var.m91770i(sqi0Var4) | xq00Var.m91770i(slv0Var15) | (i13 == 1048576) | (i11 == 8388608);
            Object objM91750T20 = xq00Var.m91750T();
            if (zM91770i6) {
                ia7Var = ia7Var3;
            } else {
                ia7Var = ia7Var3;
                if (objM91750T20 != ia7Var) {
                    slv0Var4 = slv0Var15;
                    sqi0Var2 = sqi0Var4;
                    kqi0Var5 = kqi0Var12;
                    oxtVar = objM91750T20;
                    kqi0Var6 = kqi0Var13;
                    rv41Var2 = rv41Var;
                }
                hz40.m49237i(rv41Var2, (th00) oxtVar, xq00Var);
                objM91750T = xq00Var.m91750T();
                if (objM91750T == ia7Var) {
                    objM91750T = new slv0();
                    xq00Var.m91793t0(objM91750T);
                }
                slv0Var5 = (slv0) objM91750T;
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = new slv0();
                    xq00Var.m91793t0(objM91750T2);
                }
                slv0Var6 = (slv0) objM91750T2;
                boolean zM91770i7 = xq00Var.m91770i(slv0Var5);
                if (i7 != 4) {
                    obj3 = obj;
                    if (i6 != 0 || !xq00Var.m91770i(obj3)) {
                        z = false;
                    }
                    boolean zM91770i8 = zM91770i7 | z | xq00Var.m91770i(slv0Var6) | xq00Var.m91770i(slv0Var16) | xq00Var.m91766g(kqi0Var5) | xq00Var.m91766g(kqi0Var6) | xq00Var.m91770i(sqi0Var2) | xq00Var.m91770i(slv0Var4);
                    if (i9 == 131072) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z10 = zM91770i8 | z2;
                    if (i13 == 1048576) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z10 | z3;
                    objM91750T3 = xq00Var.m91750T();
                    if (!z4 || objM91750T3 == ia7Var) {
                        xq00 xq00Var4 = xq00Var;
                        kqi0 kqi0Var14 = kqi0Var6;
                        slv0Var7 = slv0Var16;
                        ia7Var2 = ia7Var;
                        i5 = 131072;
                        kqi0 kqi0Var15 = kqi0Var5;
                        slv0 slv0Var17 = slv0Var4;
                        pxt pxtVar = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var17, str, gh00Var, kqi0Var15, kqi0Var14);
                        slv0Var8 = slv0Var17;
                        kqi0Var5 = kqi0Var15;
                        kqi0Var6 = kqi0Var14;
                        xq00Var4.m91793t0(pxtVar);
                        objM91750T3 = pxtVar;
                        xq00Var3 = xq00Var4;
                    } else {
                        slv0Var8 = slv0Var4;
                        xq00Var3 = xq00Var;
                        slv0Var7 = slv0Var16;
                        i5 = 131072;
                        ia7Var2 = ia7Var;
                    }
                    hz40.m49245q((eh00) objM91750T3, xq00Var3);
                    boolean zM91766g4 = xq00Var3.m91766g(kqi0Var6) | xq00Var3.m91766g(kqi0Var5) | xq00Var3.m91770i(slv0Var8) | xq00Var3.m91770i(slv0Var7);
                    if (i9 == i5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z11 = zM91766g4 | z5;
                    if (i13 == 1048576) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z11 | z6;
                    objM91750T4 = xq00Var3.m91750T();
                    if (z7 || objM91750T4 == ia7Var2) {
                        jxt jxtVar = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                        xq00Var3.m91793t0(jxtVar);
                        objM91750T4 = jxtVar;
                    }
                    mjhVar2 = mjhVar;
                    hz40.m49233e(mjhVar2, (gh00) objM91750T4, xq00Var3);
                    xq00Var2 = xq00Var3;
                } else {
                    obj3 = obj;
                }
                z = true;
                boolean zM91770i9 = zM91770i7 | z | xq00Var.m91770i(slv0Var6) | xq00Var.m91770i(slv0Var16) | xq00Var.m91766g(kqi0Var5) | xq00Var.m91766g(kqi0Var6) | xq00Var.m91770i(sqi0Var2) | xq00Var.m91770i(slv0Var4);
                if (i9 == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z12 = zM91770i9 | z2;
                if (i13 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z12 | z3;
                objM91750T3 = xq00Var.m91750T();
                if (z4) {
                    xq00 xq00Var5 = xq00Var;
                    kqi0 kqi0Var16 = kqi0Var6;
                    slv0Var7 = slv0Var16;
                    ia7Var2 = ia7Var;
                    i5 = 131072;
                    kqi0 kqi0Var17 = kqi0Var5;
                    slv0 slv0Var18 = slv0Var4;
                    pxt pxtVar2 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var18, str, gh00Var, kqi0Var17, kqi0Var16);
                    slv0Var8 = slv0Var18;
                    kqi0Var5 = kqi0Var17;
                    kqi0Var6 = kqi0Var16;
                    xq00Var5.m91793t0(pxtVar2);
                    objM91750T3 = pxtVar2;
                    xq00Var3 = xq00Var5;
                } else {
                    xq00 xq00Var6 = xq00Var;
                    kqi0 kqi0Var18 = kqi0Var6;
                    slv0Var7 = slv0Var16;
                    ia7Var2 = ia7Var;
                    i5 = 131072;
                    kqi0 kqi0Var19 = kqi0Var5;
                    slv0 slv0Var19 = slv0Var4;
                    pxt pxtVar3 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var19, str, gh00Var, kqi0Var19, kqi0Var18);
                    slv0Var8 = slv0Var19;
                    kqi0Var5 = kqi0Var19;
                    kqi0Var6 = kqi0Var18;
                    xq00Var6.m91793t0(pxtVar3);
                    objM91750T3 = pxtVar3;
                    xq00Var3 = xq00Var6;
                }
                hz40.m49245q((eh00) objM91750T3, xq00Var3);
                boolean zM91766g5 = xq00Var3.m91766g(kqi0Var6) | xq00Var3.m91766g(kqi0Var5) | xq00Var3.m91770i(slv0Var8) | xq00Var3.m91770i(slv0Var7);
                if (i9 == i5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z13 = zM91766g5 | z5;
                if (i13 == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z13 | z6;
                objM91750T4 = xq00Var3.m91750T();
                if (z7) {
                    jxt jxtVar2 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                    xq00Var3.m91793t0(jxtVar2);
                    objM91750T4 = jxtVar2;
                } else {
                    jxt jxtVar3 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                    xq00Var3.m91793t0(jxtVar3);
                    objM91750T4 = jxtVar3;
                }
                mjhVar2 = mjhVar;
                hz40.m49233e(mjhVar2, (gh00) objM91750T4, xq00Var3);
                xq00Var2 = xq00Var3;
            }
            rv41Var2 = rv41Var;
            oxtVar = new oxt(rv41Var2, slv0Var16, str, gw41Var, sqi0Var4, slv0Var15, gh00Var, i, kqi0Var12, kqi0Var13, null);
            sqi0Var2 = sqi0Var4;
            slv0Var4 = slv0Var15;
            kqi0Var5 = kqi0Var12;
            kqi0Var6 = kqi0Var13;
            xq00Var.m91793t0(oxtVar);
            hz40.m49237i(rv41Var2, (th00) oxtVar, xq00Var);
            objM91750T = xq00Var.m91750T();
            if (objM91750T == ia7Var) {
                objM91750T = new slv0();
                xq00Var.m91793t0(objM91750T);
            }
            slv0Var5 = (slv0) objM91750T;
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new slv0();
                xq00Var.m91793t0(objM91750T2);
            }
            slv0Var6 = (slv0) objM91750T2;
            boolean zM91770i10 = xq00Var.m91770i(slv0Var5);
            if (i7 != 4) {
                obj3 = obj;
                if (i6 != 0) {
                }
                z = false;
                boolean zM91770i11 = zM91770i10 | z | xq00Var.m91770i(slv0Var6) | xq00Var.m91770i(slv0Var16) | xq00Var.m91766g(kqi0Var5) | xq00Var.m91766g(kqi0Var6) | xq00Var.m91770i(sqi0Var2) | xq00Var.m91770i(slv0Var4);
                if (i9 == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z14 = zM91770i11 | z2;
                if (i13 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z14 | z3;
                objM91750T3 = xq00Var.m91750T();
                if (z4) {
                    xq00 xq00Var7 = xq00Var;
                    kqi0 kqi0Var110 = kqi0Var6;
                    slv0Var7 = slv0Var16;
                    ia7Var2 = ia7Var;
                    i5 = 131072;
                    kqi0 kqi0Var111 = kqi0Var5;
                    slv0 slv0Var110 = slv0Var4;
                    pxt pxtVar4 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var110, str, gh00Var, kqi0Var111, kqi0Var110);
                    slv0Var8 = slv0Var110;
                    kqi0Var5 = kqi0Var111;
                    kqi0Var6 = kqi0Var110;
                    xq00Var7.m91793t0(pxtVar4);
                    objM91750T3 = pxtVar4;
                    xq00Var3 = xq00Var7;
                } else {
                    xq00 xq00Var8 = xq00Var;
                    kqi0 kqi0Var112 = kqi0Var6;
                    slv0Var7 = slv0Var16;
                    ia7Var2 = ia7Var;
                    i5 = 131072;
                    kqi0 kqi0Var113 = kqi0Var5;
                    slv0 slv0Var111 = slv0Var4;
                    pxt pxtVar5 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var111, str, gh00Var, kqi0Var113, kqi0Var112);
                    slv0Var8 = slv0Var111;
                    kqi0Var5 = kqi0Var113;
                    kqi0Var6 = kqi0Var112;
                    xq00Var8.m91793t0(pxtVar5);
                    objM91750T3 = pxtVar5;
                    xq00Var3 = xq00Var8;
                }
                hz40.m49245q((eh00) objM91750T3, xq00Var3);
                boolean zM91766g6 = xq00Var3.m91766g(kqi0Var6) | xq00Var3.m91766g(kqi0Var5) | xq00Var3.m91770i(slv0Var8) | xq00Var3.m91770i(slv0Var7);
                if (i9 == i5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z15 = zM91766g6 | z5;
                if (i13 == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z15 | z6;
                objM91750T4 = xq00Var3.m91750T();
                if (z7) {
                    jxt jxtVar4 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                    xq00Var3.m91793t0(jxtVar4);
                    objM91750T4 = jxtVar4;
                } else {
                    jxt jxtVar5 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                    xq00Var3.m91793t0(jxtVar5);
                    objM91750T4 = jxtVar5;
                }
                mjhVar2 = mjhVar;
                hz40.m49233e(mjhVar2, (gh00) objM91750T4, xq00Var3);
                xq00Var2 = xq00Var3;
            } else {
                obj3 = obj;
            }
            z = true;
            boolean zM91770i12 = zM91770i10 | z | xq00Var.m91770i(slv0Var6) | xq00Var.m91770i(slv0Var16) | xq00Var.m91766g(kqi0Var5) | xq00Var.m91766g(kqi0Var6) | xq00Var.m91770i(sqi0Var2) | xq00Var.m91770i(slv0Var4);
            if (i9 == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z16 = zM91770i12 | z2;
            if (i13 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z16 | z3;
            objM91750T3 = xq00Var.m91750T();
            if (z4) {
                xq00 xq00Var9 = xq00Var;
                kqi0 kqi0Var114 = kqi0Var6;
                slv0Var7 = slv0Var16;
                ia7Var2 = ia7Var;
                i5 = 131072;
                kqi0 kqi0Var115 = kqi0Var5;
                slv0 slv0Var112 = slv0Var4;
                pxt pxtVar6 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var112, str, gh00Var, kqi0Var115, kqi0Var114);
                slv0Var8 = slv0Var112;
                kqi0Var5 = kqi0Var115;
                kqi0Var6 = kqi0Var114;
                xq00Var9.m91793t0(pxtVar6);
                objM91750T3 = pxtVar6;
                xq00Var3 = xq00Var9;
            } else {
                xq00 xq00Var10 = xq00Var;
                kqi0 kqi0Var116 = kqi0Var6;
                slv0Var7 = slv0Var16;
                ia7Var2 = ia7Var;
                i5 = 131072;
                kqi0 kqi0Var117 = kqi0Var5;
                slv0 slv0Var113 = slv0Var4;
                pxt pxtVar7 = new pxt(slv0Var5, obj3, slv0Var6, slv0Var7, sqi0Var2, slv0Var113, str, gh00Var, kqi0Var117, kqi0Var116);
                slv0Var8 = slv0Var113;
                kqi0Var5 = kqi0Var117;
                kqi0Var6 = kqi0Var116;
                xq00Var10.m91793t0(pxtVar7);
                objM91750T3 = pxtVar7;
                xq00Var3 = xq00Var10;
            }
            hz40.m49245q((eh00) objM91750T3, xq00Var3);
            boolean zM91766g7 = xq00Var3.m91766g(kqi0Var6) | xq00Var3.m91766g(kqi0Var5) | xq00Var3.m91770i(slv0Var8) | xq00Var3.m91770i(slv0Var7);
            if (i9 == i5) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z17 = zM91766g7 | z5;
            if (i13 == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z17 | z6;
            objM91750T4 = xq00Var3.m91750T();
            if (z7) {
                jxt jxtVar6 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                xq00Var3.m91793t0(jxtVar6);
                objM91750T4 = jxtVar6;
            } else {
                jxt jxtVar7 = new jxt(slv0Var8, slv0Var7, str, gh00Var, kqi0Var6, kqi0Var5, 0);
                xq00Var3.m91793t0(jxtVar7);
                objM91750T4 = jxtVar7;
            }
            mjhVar2 = mjhVar;
            hz40.m49233e(mjhVar2, (gh00) objM91750T4, xq00Var3);
            xq00Var2 = xq00Var3;
        } else {
            xq00 xq00Var11 = xq00Var;
            xq00Var11.m91757b0();
            xq00Var2 = xq00Var11;
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jri(obj, mjhVar2, pwtVar, rv41Var, gw41Var, str, gh00Var, i, fxh0Var, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m61872e(Object obj, mjh mjhVar, int i, xxt xxtVar, b250 b250Var, String str, gh00 gh00Var) {
        if (mjhVar.f144256b.m60496J()) {
            throw new IllegalStateException("Can not dispatchVisibilityPercentageChanged because element runtime is already disposed");
        }
        boolean zMo26461c = mjhVar.f144255a.mo24358a().mo26461c(obj, mjhVar.f144256b.m60498M(), b250Var);
        dt1 dt1Var = new dt1(zMo26461c, mjhVar, obj, b250Var, gh00Var, str);
        if (!zMo26461c) {
            i = 0;
        }
        xxtVar.mo47885c(i, b250Var, dt1Var);
    }

    /* JADX INFO: renamed from: g */
    public static int m61873g(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f >= 1.0f) {
            fArr[1] = fArr[1] - 0.1f;
        } else {
            fArr[2] = f + 0.1f;
        }
        return Color.HSVToColor(fArr);
    }

    /* JADX INFO: renamed from: h */
    public static long m61874h(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(ikc0.m50938j(j2, ")", s571.m77254m(j, "overflow: checkedAdd(", ", ")));
    }

    /* JADX INFO: renamed from: i */
    public static final void m61875i(AutoCloseable autoCloseable, Throwable th) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th != null) {
                try {
                    s571.m77255n(autoCloseable);
                    return;
                } catch (Throwable th2) {
                    y85.m93061f(th, th2);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final String m61876j(int i) {
        return String.format("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(4294967295L & ((long) i))}, 1));
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m61877k(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: l */
    public static final ComposeView m61878l(i500 i500Var, fyf fyfVar) {
        ComposeView composeView = new ComposeView(i500Var.m49702X0(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(mkr0.f144646T0);
        composeView.setContent(fyfVar);
        return composeView;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: n */
    public static long m61879n(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (d2b0.f44533a[roundingMode.ordinal()]) {
            case 1:
                jq60.m54068n(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m61880o(yyx0 yyx0Var, String str) {
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1(str);
        try {
            ezx0VarMo63454G1.mo24841E1();
            m61875i(ezx0VarMo63454G1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m61881p(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: q */
    public static long m61882q(long j, long j2) {
        jq60.m54067m(j, "a");
        jq60.m54067m(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    /* JADX INFO: renamed from: r */
    public static final up60 m61883r(Annotation annotation) {
        return qpv0.f191387a.mo54112b(annotation.annotationType());
    }

    /* JADX INFO: renamed from: s */
    public static final Field m61884s(qr60 qr60Var) {
        hpv0 hpv0VarM52044c = j0b1.m52044c(qr60Var);
        if (hpv0VarM52044c != null) {
            return hpv0VarM52044c.mo25524E();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final Method m61885t(oq60 oq60Var) {
        lbb caller;
        cpv0 cpv0VarM52043b = j0b1.m52043b(oq60Var);
        Member memberMo32243l = (cpv0VarM52043b == null || (caller = cpv0VarM52043b.getCaller()) == null) ? null : caller.mo32243l();
        if (memberMo32243l instanceof Method) {
            return (Method) memberMo32243l;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final Class m61886u(up60 up60Var) {
        Class clsMo28587A = ((ife) up60Var).mo28587A();
        if (!clsMo28587A.isPrimitive()) {
            return clsMo28587A;
        }
        String name = clsMo28587A.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsMo28587A : Double.class;
            case 104431:
                return !name.equals("int") ? clsMo28587A : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsMo28587A : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsMo28587A : Character.class;
            case 3327612:
                return !name.equals("long") ? clsMo28587A : Long.class;
            case 3625364:
                return !name.equals("void") ? clsMo28587A : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsMo28587A : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsMo28587A : Float.class;
            case 109413500:
                return !name.equals("short") ? clsMo28587A : Short.class;
            default:
                return clsMo28587A;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: v */
    public static final Class m61887v(up60 up60Var) {
        Class clsMo28587A = ((ife) up60Var).mo28587A();
        if (clsMo28587A.isPrimitive()) {
            return clsMo28587A;
        }
        String name = clsMo28587A.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static final Type m61888w(sr60 sr60Var) {
        Type typeM49825p;
        return (!(sr60Var instanceof AbstractC1969i7) || (typeM49825p = ((AbstractC1969i7) sr60Var).m49825p()) == null) ? pp91.m70530k(sr60Var, false) : typeM49825p;
    }

    /* JADX INFO: renamed from: x */
    public static void m61889x() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    /* JADX INFO: renamed from: y */
    public static String m61890y(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return s571.m77246e(i, "?");
        }
    }

    /* JADX INFO: renamed from: z */
    public static String m61891z(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: A */
    public void m61892A(yyx0 yyx0Var, Iterable iterable) {
        if (iterable == null) {
            return;
        }
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1(mo25450m());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    mo25449f(ezx0VarMo63454G1, obj);
                    ezx0VarMo63454G1.mo24841E1();
                    ezx0VarMo63454G1.reset();
                }
            }
            m61875i(ezx0VarMo63454G1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m61893B(yyx0 yyx0Var, Object obj) {
        if (obj == null) {
            return;
        }
        ezx0 ezx0VarMo63454G1 = yyx0Var.mo63454G1(mo25450m());
        try {
            mo25449f(ezx0VarMo63454G1, obj);
            ezx0VarMo63454G1.mo24841E1();
            m61875i(ezx0VarMo63454G1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                m61875i(ezx0VarMo63454G1, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo25449f(ezx0 ezx0Var, Object obj);

    /* JADX INFO: renamed from: m */
    public abstract String mo25450m();
}
