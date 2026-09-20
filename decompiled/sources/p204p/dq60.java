package p204p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.crypto.tink.shaded.protobuf.C0154c;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dq60 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m36599A(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m36600B(int i) {
        switch (i) {
            case 1:
                return "ACCEPTED";
            case 2:
                return "PROTOBUF_SERIALIZATION_FAILED";
            case 3:
                return "REJECTED_MISSING_NAME";
            case 4:
                return "REJECTED_MISSING_OWNER";
            case 5:
                return "REJECTED_PAYLOAD_TOO_LARGE";
            case 6:
                return "REJECTED_RATE_LIMITED";
            case 7:
                return "OTHER_ERROR";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m36601a(int i, View view, ViewGroup viewGroup) {
        c700.m31595O(2);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (c700.m31595O(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iM38547C == 1) {
            if (c700.m31595O(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (c700.m31595O(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iM38547C == 2) {
            if (c700.m31595O(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iM38547C != 3) {
                return;
            }
            if (c700.m31595O(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m36602b(int i, int i2, int i3) {
        return C0154c.m1742m0(i) + i2 + i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m36603c(int i, int i2, int i3, int i4) {
        return twe.m81679L0(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: d */
    public static int m36604d(int i, int i2, Object obj) {
        return (obj.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m36605e(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m36606f(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static Long m36607g(wy3 wy3Var) {
        wy3Var.getClass();
        return Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: h */
    public static String m36608h(char c, String str, String str2) {
        return str + str2 + c;
    }

    /* JADX INFO: renamed from: i */
    public static String m36609i(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    /* JADX INFO: renamed from: j */
    public static String m36610j(Class cls, String str) {
        return str + cls;
    }

    /* JADX INFO: renamed from: k */
    public static String m36611k(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m36612l(String str, char c) {
        return str + c;
    }

    /* JADX INFO: renamed from: m */
    public static String m36613m(String str, int i, char c) {
        return str + i + c;
    }

    /* JADX INFO: renamed from: n */
    public static String m36614n(String str, String str2, String str3) {
        return Pattern.compile(str).matcher(str2).replaceAll(str3);
    }

    /* JADX INFO: renamed from: o */
    public static String m36615o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: p */
    public static String m36616p(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m36617q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m36618r(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m36619s(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m36620t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: u */
    public static c9k m36621u(luk lukVar) {
        return kk40.m56661c(opo.m67570t(lukVar, njg1.m64613f()));
    }

    /* JADX INFO: renamed from: v */
    public static rlv0 m36622v(Object obj) {
        bga.m29073P(obj);
        return new rlv0();
    }

    /* JADX INFO: renamed from: w */
    public static void m36623w(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: x */
    public static int m36624x(int i, int i2, int i3, int i4) {
        return C0154c.m1743n0(i) + i2 + i3 + i4;
    }

    /* JADX INFO: renamed from: y */
    public static int m36625y(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m36626z(int i) {
        switch (i) {
            case 1:
                return "Standard";
            case 2:
                return "Expanded";
            case 3:
                return "Fullscreen";
            case 4:
                return "Collapsed";
            case 5:
                return "Overlay";
            case 6:
                return "Floating";
            default:
                throw null;
        }
    }
}
