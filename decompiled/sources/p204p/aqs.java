package p204p;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformSpanStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class aqs implements BiFunction, Function, fyv, Predicate, qt8 {

    /* JADX INFO: renamed from: c */
    public static final aqs f18770c = new aqs();

    /* JADX INFO: renamed from: d */
    public static final String[] f18771d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: e */
    public static final aqs f18772e;

    /* JADX INFO: renamed from: f */
    public static final aqs f18773f;

    /* JADX INFO: renamed from: g */
    public static final aqs f18774g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18775a;

    /* JADX INFO: renamed from: b */
    public String f18776b;

    static {
        int i = 1;
        f18772e = new aqs("SHA256", i);
        f18773f = new aqs("SHA384", i);
        f18774g = new aqs("SHA512", i);
    }

    public /* synthetic */ aqs(String str, int i) {
        this.f18775a = i;
        this.f18776b = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m26891a(u010 u010Var, wc01 wc01Var) {
        String str = wc01Var.f249918a;
        if (str != null) {
            u010Var.m82101s("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        u010Var.m82101s("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        u010Var.m82101s("X-CRASHLYTICS-API-CLIENT-VERSION", "19.3.0");
        u010Var.m82101s("Accept", "application/json");
        u010Var.m82101s("X-CRASHLYTICS-DEVICE-MODEL", wc01Var.f249919b);
        String str2 = wc01Var.f249920c;
        if (str2 != null) {
            u010Var.m82101s("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = wc01Var.f249921d;
        if (str3 != null) {
            u010Var.m82101s("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = wc01Var.f249922e.m86870c().f44183a;
        if (str4 != null) {
            u010Var.m82101s("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    /* JADX INFO: renamed from: e */
    public static aqs m26892e(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new zps(str);
        }
        if (str.startsWith("spline")) {
            t151 t151Var = new t151();
            t151Var.f18776b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < dArrCopyOf.length; i2++) {
                double d2 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = ((double) i2) * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            byh0 byh0Var = new byh0(dArr3, dArr2);
            System.out.println(" 0 " + byh0Var.mo25150q(0.0d));
            System.out.println(" 1 " + byh0Var.mo25150q(1.0d));
            t151Var.f216158h = byh0Var;
            return t151Var;
        }
        if (str.startsWith("Schlick")) {
            pgy0 pgy0Var = new pgy0();
            pgy0Var.f18776b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            pgy0Var.f177429h = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            pgy0Var.f177430i = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return pgy0Var;
        }
        switch (str) {
            case "accelerate":
                return new zps("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new zps("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new zps("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new zps("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new zps("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new zps("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f18771d));
                return f18770c;
        }
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m26893g(wc01 wc01Var) {
        HashMap map = new HashMap();
        map.put("build_version", wc01Var.f249925h);
        map.put("display_version", wc01Var.f249924g);
        map.put("source", Integer.toString(wc01Var.f249926i));
        String str = wc01Var.f249923f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static String m26894j(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(String.valueOf(str2));
                str2 = s571.m77252k(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return klh.m56834f(str, " : ", str2);
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v4 java.lang.Object, still in use, count: 2, list:
          (r1v4 java.lang.Object) from 0x0125: PHI (r1 I:??) = (r1v1 java.lang.Object), (r1v4 java.lang.Object) binds: [B:66:0x0124, B:80:0x0125] A[DONT_GENERATE, DONT_INLINE]
          (r1v4 java.lang.Object) from 0x0119: CHECK_CAST (p.pob) (r1v4 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public java.lang.Object mo98394apply(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.aqs.mo98394apply(java.lang.Object):java.lang.Object");
    }

    @Override // p204p.qt8
    /* JADX INFO: renamed from: b */
    public j15 mo26895b(xq00 xq00Var) {
        xq00Var.m91771i0(-545278290);
        String str = this.f18776b;
        StringBuilder sb = new StringBuilder(16);
        ArrayList arrayListM79995j = t3d1.m79995j();
        new ArrayList();
        long j = 0;
        int i = 8;
        int i2 = 0;
        arrayListM79995j.add(new f15(i2, str.length(), i, new ew31(leu.m58815a(xq00Var).f112824b.f138757a, j, leu.m58818d(xq00Var).f64972h.f101704a.f63412c, leu.m58818d(xq00Var).f64972h.f101704a.f63413d, (FontSynthesis) null, leu.m58818d(xq00Var).f64972h.f101704a.f63415f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490), null));
        sb.append(str);
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM79995j.size());
        int size = arrayListM79995j.size();
        for (int iM62683h = 0; iM62683h < size; iM62683h = ms2.m62683h(sb, (f15) arrayListM79995j.get(iM62683h), arrayList, iM62683h, 1)) {
        }
        j15 j15Var = new j15(string, arrayList);
        xq00Var.m91788r(false);
        return j15Var;
    }

    /* JADX INFO: renamed from: d */
    public double mo26897d(double d) {
        return 1.0d;
    }

    @Override // p204p.fyv
    /* JADX INFO: renamed from: f */
    public fiz mo26898f() {
        return new ysk(this.f18776b, 27);
    }

    /* JADX INFO: renamed from: h */
    public void m26899h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m26894j(this.f18776b, str, objArr);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m26900i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            m26894j(this.f18776b, str, objArr);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return wj50.m88271j(((pqm0) obj).f180350a, this.f18776b);
    }

    public String toString() {
        switch (this.f18775a) {
            case 0:
                return this.f18776b;
            case 1:
                return this.f18776b;
            default:
                return super.toString();
        }
    }

    public aqs(zec zecVar, String str) {
        this.f18775a = 5;
        this.f18776b = str;
    }

    public aqs(String str) {
        this.f18775a = 19;
        this.f18776b = edb.m38560i(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public aqs() {
        this.f18775a = 0;
        this.f18776b = "identity";
    }

    public aqs(String str, ui5 ui5Var) {
        this.f18775a = 7;
        this.f18776b = str;
    }

    /* JADX INFO: renamed from: c */
    public double mo26896c(double d) {
        return d;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new pqm0(((gqx) obj).mo45449a(upm0.class, this.f18776b).f72301b, (List) obj2);
    }
}
