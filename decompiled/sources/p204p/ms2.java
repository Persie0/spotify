package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class ms2 {
    public static int[] _values() {
        return edb.m38551G(3);
    }

    /* JADX INFO: renamed from: a */
    public static int m62676a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m62677b(int i) {
        if (i == 1) {
            return "navigate_to_page";
        }
        if (i == 2) {
            return "create_view";
        }
        if (i == 3) {
            return "create_page_content";
        }
        if (i == 4) {
            return "load_data";
        }
        if (i == 5) {
            return "render_content";
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m62678c(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "data_load_failed";
        }
        if (i == 3) {
            return "cancelled";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m62679d(int i) {
        if (i == 1) {
            return "1:1";
        }
        if (i == 2) {
            return "16:9";
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static float m62680e(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    /* JADX INFO: renamed from: f */
    public static int m62681f(float f, float f2, float f3) {
        return Math.round((f + f2) * f3);
    }

    /* JADX INFO: renamed from: g */
    public static int m62682g(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m62683h(StringBuilder sb, f15 f15Var, ArrayList arrayList, int i, int i2) {
        arrayList.add(f15Var.m40521a(sb.length()));
        return i + i2;
    }

    /* JADX INFO: renamed from: i */
    public static String m62684i(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static Set m62685j(Class cls) {
        return Collections.singleton(new eww0(cls));
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC2609yd m62686k(e940 e940Var, qkh qkhVar) {
        jg31.m53271i(e940Var);
        InterfaceC2609yd interfaceC2609ydMo25693e = qkhVar.mo25693e();
        jg31.m53271i(interfaceC2609ydMo25693e);
        return interfaceC2609ydMo25693e;
    }

    /* JADX INFO: renamed from: l */
    public static as4 m62687l(qkh qkhVar) {
        jg31.m53271i(qkhVar.mo25694h());
        as4 as4VarMo25695i = qkhVar.mo25695i();
        jg31.m53271i(as4VarMo25695i);
        return as4VarMo25695i;
    }

    /* JADX INFO: renamed from: m */
    public static fxh0 m62688m(cxh0 cxh0Var, float f, xq00 xq00Var, cxh0 cxh0Var2, float f2) {
        riw0.m75615i(xq00Var, mi21.m61824h(f, cxh0Var));
        return mi21.m61822f(f2, cxh0Var2);
    }

    /* JADX INFO: renamed from: n */
    public static yum0 m62689n(boolean z, xq00 xq00Var) {
        yum0 yum0VarM77645B = sam.m77645B(Boolean.valueOf(z));
        xq00Var.m91793t0(yum0VarM77645B);
        return yum0VarM77645B;
    }

    /* JADX INFO: renamed from: o */
    public static void m62690o(int i, fyf fyfVar, xq00 xq00Var, xq00 xq00Var2, boolean z) {
        fyfVar.invoke(xq00Var, Integer.valueOf(i));
        xq00Var2.m91788r(z);
    }

    /* JADX INFO: renamed from: p */
    public static void m62691p(xq00 xq00Var, int i, int i2, th00 th00Var, xq00 xq00Var2) {
        xq00Var.m91771i0(i);
        th00Var.invoke(xq00Var2, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m62692q(int i) {
        if (i == 1) {
            return "FOREGROUND";
        }
        if (i == 2) {
            return "BACKGROUND";
        }
        throw null;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ int m62693r(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("FOREGROUND")) {
            return 1;
        }
        if (str.equals("BACKGROUND")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant com.spotify.ubi.navigationloggerimpl.mobius.AppForegroundState.".concat(str));
    }
}
