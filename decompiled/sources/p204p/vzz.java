package p204p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vzz {

    /* JADX INFO: renamed from: a */
    public static final oab0 f246594a = new oab0(16);

    /* JADX INFO: renamed from: b */
    public static final ThreadPoolExecutor f246595b;

    /* JADX INFO: renamed from: c */
    public static final Object f246596c;

    /* JADX INFO: renamed from: d */
    public static final ab21 f246597d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new rgy0(3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f246595b = threadPoolExecutor;
        f246596c = new Object();
        f246597d = new ab21(0);
    }

    /* JADX INFO: renamed from: a */
    public static String m86916a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pzz) list.get(i2)).f183866g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static uzz m86917b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceMo26667N0;
        oab0 oab0Var = f246594a;
        Trace.beginSection(k0e1.m54980O("getFontSync"));
        try {
            Typeface typeface = (Typeface) oab0Var.m66541c(str);
            if (typeface != null) {
                uzz uzzVar = new uzz(typeface);
                Trace.endSection();
                return uzzVar;
            }
            try {
                lfq lfqVarM68671a = ozz.m68671a(context, list);
                List list2 = lfqVarM68671a.f132997b;
                int i3 = lfqVarM68671a.f132996a;
                if (i3 == 0) {
                    o000[] o000VarArrM58910f = lfqVarM68671a.m58910f();
                    if (o000VarArrM58910f == null || o000VarArrM58910f.length == 0) {
                        i2 = 1;
                    } else {
                        int length = o000VarArrM58910f.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = o000VarArrM58910f[i4].f160202f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    uzz uzzVar2 = new uzz(i2);
                    Trace.endSection();
                    return uzzVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    o000[] o000VarArrM58910f2 = lfqVarM68671a.m58910f();
                    AbstractC1806e9 abstractC1806e9 = wo91.f253411a;
                    fn1.m42176e(k0e1.m54980O("TypefaceCompat.createFromFontInfo"));
                    try {
                        typefaceMo26667N0 = wo91.f253411a.mo26667N0(context, o000VarArrM58910f2, i);
                        fn1.m42178g();
                    } catch (Throwable th) {
                        fn1.m42178g();
                        throw th;
                    }
                } else {
                    AbstractC1806e9 abstractC1806e10 = wo91.f253411a;
                    Trace.beginSection(k0e1.m54980O("TypefaceCompat.createFromFontInfoWithFallback"));
                    try {
                        typefaceMo26667N0 = wo91.f253411a.mo33552O0(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceMo26667N0 == null) {
                    uzz uzzVar3 = new uzz(-3);
                    Trace.endSection();
                    return uzzVar3;
                }
                oab0Var.m66542d(str, typefaceMo26667N0);
                uzz uzzVar4 = new uzz(typefaceMo26667N0);
                Trace.endSection();
                return uzzVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                uzz uzzVar5 = new uzz(-1);
                Trace.endSection();
                return uzzVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
