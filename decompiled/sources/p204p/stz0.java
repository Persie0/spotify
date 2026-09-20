package p204p;

import io.reactivex.rxjava3.core.SingleConverter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class stz0 {
    public static int[] _values() {
        return edb.m38551G(13);
    }

    /* JADX INFO: renamed from: a */
    public static int m79347a(int i) {
        if (i == 0) {
            return 13;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        if (i == 6) {
                            return 5;
                        }
                        if (i == 9) {
                            return 6;
                        }
                        if (i == 21) {
                            return 12;
                        }
                        if (i == 17) {
                            return 10;
                        }
                        if (i == 18) {
                            return 11;
                        }
                        switch (i) {
                            case 11:
                                return 7;
                            case 12:
                                return 8;
                            case 13:
                                return 9;
                            default:
                                return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m79348b(int i) {
        if (i != 0) {
            return i != 5 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public static final int m79349c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static final int m79350d(int i) {
        if (i == 1) {
            return 200;
        }
        if (i == 2) {
            return 201;
        }
        if (i == 3) {
            return 202;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m79351e(int i, boolean z, boolean z2, boolean z3) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C != 0) {
            if (iM38547C != 1 && iM38547C != 4 && (z2 || z3)) {
                return false;
            }
        } else if (z && z2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m79352f(int i) {
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static int m79353g(int i, int i2, b450 b450Var) {
        return (b450Var.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static String m79354h(jqv0 jqv0Var, Class cls, StringBuilder sb) {
        sb.append(jqv0Var.mo54112b(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Iterator m79355i() {
        try {
            return Arrays.asList(new g5l0()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: j */
    public static up60 m79356j(Class cls, w8q0 w8q0Var, up60 up60Var, jqv0 jqv0Var, Class cls2) {
        w8q0Var.m87473j(up60Var, qjg1.m72924p(muz0.f147459a, qpv0.m73454a(cls)));
        return jqv0Var.mo54112b(cls2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m79357k(SingleConverter singleConverter) {
        if (singleConverter != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m79358l(c06 c06Var, long j) {
        c06Var.m31107v().mo25279h();
        c06Var.m31095L(j);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Iterator m79359m() {
        try {
            return Arrays.asList(new gd10()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m79360n(int i) {
        if (i == 1) {
            return "Presented";
        }
        if (i == 2) {
            return "Dismissed";
        }
        if (i == 3) {
            return "ConnectClicked";
        }
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ String m79361o(int i) {
        if (i == 1) {
            return "FATAL";
        }
        if (i == 2) {
            return "RECOVERABLE";
        }
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ String m79362p(int i) {
        if (i == 1) {
            return "VISIBLE";
        }
        if (i == 2) {
            return "SELECTED";
        }
        if (i == 3) {
            return "HIDDEN";
        }
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m79363q(int i) {
        if (i == 1) {
            return "NORMAL";
        }
        if (i == 2) {
            return "ALWAYS";
        }
        if (i == 3) {
            return "NEVER";
        }
        if (i != 4) {
            return i != 5 ? "null" : "EXCEEDS_PAD";
        }
        return "NOT_NEGATIVE";
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ String m79364r(int i) {
        if (i == 1) {
            return "FUNCTION";
        }
        if (i != 2) {
            return i != 3 ? "null" : "FIELD_IN_JAVA_CLASS";
        }
        return "PROPERTY";
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ int m79365s(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("VISIBLE")) {
            return 1;
        }
        if (str.equals("SELECTED")) {
            return 2;
        }
        if (str.equals("HIDDEN")) {
            return 3;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.share.models.ShareFormatState.".concat(str));
    }
}
