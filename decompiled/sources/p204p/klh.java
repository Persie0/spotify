package p204p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.SLF4JLogger;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class klh {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m56825A(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "BACKGROUND_SYNC";
            case 3:
                return "BLOCKING";
            case 4:
                return "ASYNC";
            case 5:
                return "PUSH_INITIATED";
            case 6:
                return "RECONNECT";
            case 7:
                return "UNRECOGNIZED";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m56826B(int i) {
        if (i == 1) {
            return "BANNER";
        }
        if (i == 2) {
            return "FULLSCREEN";
        }
        if (i == 3) {
            return "MODAL";
        }
        if (i == 4) {
            return "SNACKBAR";
        }
        if (i == 5) {
            return "FORMAT_NOT_SET";
        }
        throw null;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m56827C(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ int m56828D(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("FULL")) {
            return 1;
        }
        if (str.equals("REDUCED")) {
            return 2;
        }
        if (str.equals("MINIMAL")) {
            return 3;
        }
        if (str.equals("NONE")) {
            return 4;
        }
        throw new IllegalArgumentException("No enum constant io.branch.referral.Defines.BranchAttributionLevel.".concat(str));
    }

    /* JADX INFO: renamed from: a */
    public static int m56829a(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    /* JADX INFO: renamed from: b */
    public static int m56830b(int i, int i2, Set set) {
        return (set.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static MobiusLoop.Builder m56831c(String str, MobiusLoop.Builder builder) {
        return builder.mo15594f(new SLF4JLogger(str));
    }

    /* JADX INFO: renamed from: d */
    public static String m56832d(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static String m56833e(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: f */
    public static String m56834f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: g */
    public static String m56835g(String str, i500 i500Var, String str2) {
        return str + i500Var + str2;
    }

    /* JADX INFO: renamed from: h */
    public static String m56836h(String str, dz61 dz61Var) {
        return str + dz61Var;
    }

    /* JADX INFO: renamed from: i */
    public static String m56837i(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static StringBuilder m56838j(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: k */
    public static h4t0 m56839k(jhm jhmVar, int i) {
        return b2s.m27972b(new ihm(jhmVar, i, 0));
    }

    /* JADX INFO: renamed from: l */
    public static h4t0 m56840l(frm frmVar, int i) {
        return b2s.m27972b(new ihm(frmVar, i, 2));
    }

    /* JADX INFO: renamed from: m */
    public static h4t0 m56841m(son sonVar, int i) {
        return b2s.m27972b(new ron(sonVar, i));
    }

    /* JADX INFO: renamed from: n */
    public static h4t0 m56842n(son sonVar, otn otnVar, int i) {
        return b2s.m27972b(new vfn(sonVar, otnVar, i, 2));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m56843o(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        wj50.m88253R(nullPointerException, wj50.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: p */
    public static void m56844p(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    /* JADX INFO: renamed from: q */
    public static h4t0 m56845q(son sonVar, int i) {
        return be21.m28868a(new ron(sonVar, i));
    }

    /* JADX INFO: renamed from: r */
    public static h4t0 m56846r(son sonVar, otn otnVar, int i) {
        return be21.m28868a(new vfn(sonVar, otnVar, i, 2));
    }

    /* JADX INFO: renamed from: s */
    public static h4t0 m56847s(son sonVar, int i) {
        return b2s.m27972b(new zpn(sonVar, i, 0));
    }

    /* JADX INFO: renamed from: t */
    public static h4t0 m56848t(son sonVar, otn otnVar, int i) {
        return b2s.m27972b(new pwn(sonVar, otnVar, i, 0));
    }

    /* JADX INFO: renamed from: u */
    public static h4t0 m56849u(son sonVar, int i) {
        return be21.m28868a(new zpn(sonVar, i, 0));
    }

    /* JADX INFO: renamed from: v */
    public static h4t0 m56850v(son sonVar, otn otnVar, int i) {
        return be21.m28868a(new pwn(sonVar, otnVar, i, 0));
    }

    /* JADX INFO: renamed from: w */
    public static h4t0 m56851w(son sonVar, otn otnVar, int i) {
        return b2s.m27972b(new pwn(sonVar, otnVar, i, 1));
    }

    /* JADX INFO: renamed from: x */
    public static h4t0 m56852x(son sonVar, otn otnVar, int i) {
        return be21.m28868a(new pwn(sonVar, otnVar, i, 1));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m56853y(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m56854z(int i) {
        if (i == 1) {
            return "FULL";
        }
        if (i == 2) {
            return "REDUCED";
        }
        if (i == 3) {
            return "MINIMAL";
        }
        if (i == 4) {
            return "NONE";
        }
        throw null;
    }
}
