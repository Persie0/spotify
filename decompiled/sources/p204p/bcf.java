package p204p;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bcf {

    /* JADX INFO: renamed from: k */
    public static final String f25856k;

    /* JADX INFO: renamed from: l */
    public static final String f25857l;

    /* JADX INFO: renamed from: m */
    public static final String f25858m;

    /* JADX INFO: renamed from: n */
    public static final String f25859n;

    /* JADX INFO: renamed from: o */
    public static final String f25860o;

    /* JADX INFO: renamed from: p */
    public static final String f25861p;

    /* JADX INFO: renamed from: q */
    public static final String f25862q;

    /* JADX INFO: renamed from: r */
    public static final String f25863r;

    /* JADX INFO: renamed from: s */
    public static final String f25864s;

    /* JADX INFO: renamed from: t */
    public static final String f25865t;

    /* JADX INFO: renamed from: a */
    public final mxz0 f25866a;

    /* JADX INFO: renamed from: b */
    public final int f25867b;

    /* JADX INFO: renamed from: c */
    public final int f25868c;

    /* JADX INFO: renamed from: d */
    public final int f25869d;

    /* JADX INFO: renamed from: e */
    public final Uri f25870e;

    /* JADX INFO: renamed from: f */
    public final CharSequence f25871f;

    /* JADX INFO: renamed from: g */
    public final Bundle f25872g;

    /* JADX INFO: renamed from: h */
    public final if40 f25873h;

    /* JADX INFO: renamed from: i */
    public final boolean f25874i;

    /* JADX INFO: renamed from: j */
    public final Object f25875j;

    static {
        String str = h0b1.f86200a;
        f25856k = Integer.toString(0, 36);
        f25857l = Integer.toString(1, 36);
        f25858m = Integer.toString(2, 36);
        f25859n = Integer.toString(3, 36);
        f25860o = Integer.toString(4, 36);
        f25861p = Integer.toString(5, 36);
        f25862q = Integer.toString(6, 36);
        f25863r = Integer.toString(7, 36);
        f25864s = Integer.toString(8, 36);
        f25865t = Integer.toString(9, 36);
    }

    public bcf(mxz0 mxz0Var, int i, int i2, int i3, Uri uri, CharSequence charSequence, Bundle bundle, boolean z, if40 if40Var, Object obj) {
        this.f25866a = mxz0Var;
        this.f25867b = i;
        this.f25868c = i2;
        this.f25869d = i3;
        this.f25870e = uri;
        this.f25871f = charSequence;
        this.f25872g = new Bundle(bundle);
        this.f25874i = z;
        this.f25873h = if40Var;
        this.f25875j = obj;
    }

    /* JADX INFO: renamed from: a */
    public static Object m28699a(int i, Object obj) {
        if (obj == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (obj instanceof Integer) {
                    obj = Long.valueOf(((Integer) obj).longValue());
                }
                c95.m31844j(obj instanceof Long, "Parameter has incorrect type.");
                return obj;
            case 2:
                c95.m31844j(obj instanceof Integer, "Parameter has incorrect type.");
                return obj;
            case 3:
                c95.m31844j(obj instanceof Boolean, "Parameter has incorrect type.");
                return obj;
            case 4:
                if (obj instanceof Double) {
                    obj = Float.valueOf(((Double) obj).floatValue());
                }
                c95.m31844j(obj instanceof Float, "Parameter has incorrect type.");
                return obj;
            case 5:
                c95.m31844j(obj instanceof a7u0, "Parameter has incorrect type.");
                return obj;
            case 6:
                c95.m31844j(obj instanceof ufd0, "Parameter has incorrect type.");
                return obj;
            case 7:
                c95.m31844j(obj instanceof phd0, "Parameter has incorrect type.");
                return obj;
            case 8:
                c95.m31844j(obj instanceof dr81, "Parameter has incorrect type.");
                return obj;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m28700c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((bcf) list.get(i2)).f25873h.m50417b(0) == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static bcf m28701d(mxz0 mxz0Var) {
        String str = mxz0Var.f148234b;
        Bundle bundle = mxz0Var.f148235c;
        if (!str.startsWith("androidx.media3.session.PLAYER_COMMAND_")) {
            int i = Integer.parseInt(str.substring(40));
            Object objM28705k = m28705k(i == 40010 ? 5 : 0, 10, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
            acf acfVar = new acf(0);
            acfVar.m25468c(new mxz0(i), objM28705k);
            return acfVar.m25466a();
        }
        int i2 = Integer.parseInt(str.substring(39));
        Object objM28705k2 = m28705k(m28706l(i2), 10, bundle, "androidx.media3.session.CUSTOM_COMMAND_PARAMETER");
        acf acfVar2 = new acf(0);
        c95.m31844j(acfVar2.f14343b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
        acfVar2.f14344c = i2;
        acfVar2.f14351j = m28699a(m28706l(i2), objM28705k2);
        return acfVar2.m25466a();
    }

    /* JADX INFO: renamed from: g */
    public static wsv0 m28702g(List list, nxz0 nxz0Var, b7p0 b7p0Var) {
        int i;
        jf40 jf40Var = new jf40(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            bcf bcfVar = (bcf) list.get(i2);
            mxz0 mxz0Var = bcfVar.f25866a;
            if ((mxz0Var == null || !nxz0Var.f159653a.contains(mxz0Var)) && ((i = bcfVar.f25867b) == -1 || !b7p0Var.m28393a(i))) {
                if (bcfVar.f25874i) {
                    bcfVar = new bcf(bcfVar.f25866a, bcfVar.f25867b, bcfVar.f25868c, bcfVar.f25869d, bcfVar.f25870e, bcfVar.f25871f, new Bundle(bcfVar.f25872g), false, bcfVar.f25873h, bcfVar.f25875j);
                }
                jf40Var.m28985c(bcfVar);
            } else {
                jf40Var.m28985c(bcfVar);
            }
        }
        return jf40Var.m53150g();
    }

    /* JADX INFO: renamed from: i */
    public static bcf m28703i(int i, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f25856k);
        mxz0 mxz0VarM63117a = bundle2 == null ? null : mxz0.m63117a(bundle2);
        int i2 = bundle.getInt(f25857l, -1);
        int i3 = bundle.getInt(f25858m, 0);
        CharSequence charSequence = bundle.getCharSequence(f25859n, "");
        Bundle bundleM46328p = h0b1.m46328p(bundle.getBundle(f25860o));
        boolean z = i < 3 || bundle.getBoolean(f25861p, true);
        Uri uri = (Uri) bundle.getParcelable(f25862q);
        int i4 = bundle.getInt(f25863r, 0);
        int[] intArray = bundle.getIntArray(f25864s);
        acf acfVar = new acf(i4, i3);
        String str = f25865t;
        if (mxz0VarM63117a != null) {
            acfVar.m25468c(mxz0VarM63117a, m28705k(mxz0VarM63117a.f148233a == 40010 ? 5 : 0, i, bundle, str));
        }
        if (i2 != -1) {
            Object objM28705k = m28705k(m28706l(i2), i, bundle, str);
            c95.m31844j(acfVar.f14343b == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            acfVar.f14344c = i2;
            acfVar.f14351j = m28699a(m28706l(i2), objM28705k);
        }
        if (uri != null && (Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"))) {
            c95.m31844j(Objects.equals(uri.getScheme(), "content") || Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            acfVar.f14346e = uri;
        }
        acfVar.f14347f = charSequence;
        if (bundleM46328p == null) {
            bundleM46328p = Bundle.EMPTY;
        }
        acfVar.f14348g = new Bundle(bundleM46328p);
        acfVar.f14349h = z;
        if (intArray == null) {
            intArray = new int[]{6};
        }
        acfVar.m25469d(intArray);
        return acfVar.m25466a();
    }

    /* JADX INFO: renamed from: j */
    public static wsv0 m28704j(List list, boolean z, boolean z2, int i) {
        int iM50417b;
        if (list.isEmpty()) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < list.size(); i4++) {
            bcf bcfVar = (bcf) list.get(i4);
            boolean z3 = bcfVar.f25874i;
            if40 if40Var = bcfVar.f25873h;
            if (z3 && bcfVar.m28708b()) {
                for (int i5 = 0; i5 < if40Var.f101647b && (iM50417b = if40Var.m50417b(i5)) != 6; i5++) {
                    if (z && i2 == -1 && iM50417b == 2) {
                        i2 = i4;
                        break;
                    }
                    if (z2 && i3 == -1 && iM50417b == 3) {
                        i3 = i4;
                        break;
                    }
                }
            }
        }
        jf40 jf40VarM69788m = pf40.m69788m();
        if (i2 != -1) {
            jf40VarM69788m.m28985c(((bcf) list.get(i2)).m28709e(2, i));
        }
        if (i3 != -1) {
            jf40VarM69788m.m28985c(((bcf) list.get(i3)).m28709e(3, i));
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            bcf bcfVar2 = (bcf) list.get(i6);
            if (bcfVar2.f25874i && bcfVar2.m28708b() && i6 != i2 && i6 != i3 && bcfVar2.f25873h.m50416a(6)) {
                jf40VarM69788m.m28985c(bcfVar2.m28709e(6, i));
            }
        }
        return jf40VarM69788m.m53150g();
    }

    /* JADX INFO: renamed from: k */
    public static Object m28705k(int i, int i2, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i) {
            case 1:
                return Long.valueOf(bundle.getLong(str));
            case 2:
                return Integer.valueOf(bundle.getInt(str));
            case 3:
                return Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return Float.valueOf(bundle.getFloat(str));
            case 5:
                Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return a7u0.m24998a(bundle2);
            case 6:
                Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return ufd0.m82981b(i2, bundle3);
            case 7:
                Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return phd0.m69978b(i2, bundle4);
            case 8:
                Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return dr81.m36706b(bundle5);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static int m28706l(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 19) {
            return 7;
        }
        if (i == 24) {
            return 4;
        }
        if (i == 29) {
            return 8;
        }
        if (i == 31) {
            return 6;
        }
        switch (i) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m28707m(String str) {
        return str.startsWith("androidx.media3.session.PLAYER_COMMAND_") || str.startsWith("androidx.media3.session.SESSION_COMMAND_");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m28708b() {
        Object obj = this.f25875j;
        mxz0 mxz0Var = this.f25866a;
        if (mxz0Var != null) {
            int i = mxz0Var.f148233a;
            if (i != 0) {
                return i == 40010 && obj != null;
            }
            return true;
        }
        int i2 = this.f25867b;
        if (i2 != 19) {
            if (i2 != 24) {
                if (i2 != 29 && i2 != 31) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: e */
    public final bcf m28709e(int i, int i2) {
        String str;
        mxz0 mxz0Var = this.f25866a;
        if (mxz0Var != null && mxz0Var.f148233a == 0) {
            return m28710f(new if40(new int[]{i}, 1));
        }
        Bundle bundle = Bundle.EMPTY;
        if (this.f25875j != null) {
            bundle = new Bundle();
            m28713o("androidx.media3.session.CUSTOM_COMMAND_PARAMETER", i2, bundle);
        }
        if (mxz0Var != null) {
            str = "androidx.media3.session.SESSION_COMMAND_" + mxz0Var.f148233a;
        } else {
            str = "androidx.media3.session.PLAYER_COMMAND_" + this.f25867b;
        }
        return new bcf(new mxz0(str, bundle), -1, this.f25868c, this.f25869d, this.f25870e, this.f25871f, this.f25872g, this.f25874i, new if40(new int[]{i}, 1), null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcf)) {
            return false;
        }
        bcf bcfVar = (bcf) obj;
        return Objects.equals(this.f25866a, bcfVar.f25866a) && this.f25867b == bcfVar.f25867b && this.f25868c == bcfVar.f25868c && this.f25869d == bcfVar.f25869d && Objects.equals(this.f25870e, bcfVar.f25870e) && TextUtils.equals(this.f25871f, bcfVar.f25871f) && this.f25874i == bcfVar.f25874i && this.f25873h.equals(bcfVar.f25873h) && Objects.equals(this.f25875j, bcfVar.f25875j);
    }

    /* JADX INFO: renamed from: f */
    public final bcf m28710f(if40 if40Var) {
        if (this.f25873h.equals(if40Var)) {
            return this;
        }
        return new bcf(this.f25866a, this.f25867b, this.f25868c, this.f25869d, this.f25870e, this.f25871f, new Bundle(this.f25872g), this.f25874i, if40Var, this.f25875j);
    }

    /* JADX INFO: renamed from: h */
    public final void m28711h(g7p0 g7p0Var) {
        if (this.f25874i) {
            Object obj = this.f25875j;
            int i = this.f25867b;
            if (i == 19) {
                if (obj != null) {
                    g7p0Var.mo43886g0((phd0) obj);
                    return;
                }
                return;
            }
            if (i == 24) {
                if (obj != null) {
                    g7p0Var.mo43904r(((Float) obj).floatValue());
                    return;
                } else if (g7p0Var.mo43879d() == 0.0f) {
                    g7p0Var.mo43848N();
                    return;
                } else {
                    g7p0Var.mo43892k();
                    return;
                }
            }
            if (i == 29) {
                if (obj != null) {
                    g7p0Var.mo43828B0((dr81) obj);
                    return;
                }
                return;
            }
            if (i == 31) {
                if (obj != null) {
                    g7p0Var.mo43852P((ufd0) obj);
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (obj == null) {
                        g7p0Var.mo43845L(!g7p0Var.mo43899o());
                    } else {
                        g7p0Var.mo43845L(((Boolean) obj).booleanValue());
                    }
                    break;
                case 2:
                    g7p0Var.mo43875b();
                    break;
                case 3:
                    g7p0Var.stop();
                    break;
                case 4:
                    g7p0Var.mo43916y();
                    break;
                case 5:
                    if (obj != null) {
                        g7p0Var.mo43883f(((Long) obj).longValue());
                    }
                    break;
                case 6:
                    g7p0Var.mo43914x();
                    break;
                case 7:
                    g7p0Var.mo43841J();
                    break;
                case 8:
                    g7p0Var.mo43854Q();
                    break;
                case 9:
                    g7p0Var.mo43884f0();
                    break;
                case 10:
                    if (obj != null) {
                        g7p0Var.mo43834E0(((Integer) obj).intValue());
                    }
                    break;
                case 11:
                    g7p0Var.mo43866W0();
                    break;
                case 12:
                    g7p0Var.mo43864V0();
                    break;
                case 13:
                    if (obj != null) {
                        g7p0Var.mo43881e(((Float) obj).floatValue());
                    }
                    break;
                case 14:
                    if (obj == null) {
                        g7p0Var.mo43897m0(!g7p0Var.mo43857R0());
                    } else {
                        g7p0Var.mo43897m0(((Boolean) obj).booleanValue());
                    }
                    break;
                case 15:
                    if (obj != null) {
                        g7p0Var.setRepeatMode(((Integer) obj).intValue());
                    }
                    break;
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f25866a, Integer.valueOf(this.f25867b), Integer.valueOf(this.f25868c), Integer.valueOf(this.f25869d), this.f25871f, Boolean.valueOf(this.f25874i), this.f25870e, this.f25873h, this.f25875j);
    }

    /* JADX INFO: renamed from: n */
    public final Bundle m28712n(int i) {
        Bundle bundle = new Bundle();
        mxz0 mxz0Var = this.f25866a;
        if (mxz0Var != null) {
            bundle.putBundle(f25856k, mxz0Var.m63118b());
        }
        int i2 = this.f25867b;
        if (i2 != -1) {
            bundle.putInt(f25857l, i2);
        }
        int i3 = this.f25868c;
        if (i3 != 0) {
            bundle.putInt(f25863r, i3);
        }
        int i4 = this.f25869d;
        if (i4 != 0) {
            bundle.putInt(f25858m, i4);
        }
        CharSequence charSequence = this.f25871f;
        if (charSequence != "") {
            bundle.putCharSequence(f25859n, charSequence);
        }
        Bundle bundle2 = this.f25872g;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f25860o, bundle2);
        }
        Uri uri = this.f25870e;
        if (uri != null) {
            bundle.putParcelable(f25862q, uri);
        }
        boolean z = this.f25874i;
        if (!z) {
            bundle.putBoolean(f25861p, z);
        }
        if40 if40Var = this.f25873h;
        if (if40Var.f101647b != 1 || if40Var.m50417b(0) != 6) {
            bundle.putIntArray(f25864s, Arrays.copyOfRange(if40Var.f101646a, 0, if40Var.f101647b));
        }
        if (this.f25875j != null) {
            m28713o(f25865t, i, bundle);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: o */
    public final void m28713o(String str, int i, Bundle bundle) {
        int iM28706l;
        mxz0 mxz0Var = this.f25866a;
        if (mxz0Var != null) {
            iM28706l = mxz0Var.f148233a == 40010 ? 5 : 0;
        } else {
            iM28706l = m28706l(this.f25867b);
        }
        Object obj = this.f25875j;
        switch (iM28706l) {
            case 1:
                bundle.putLong(str, ((Long) obj).longValue());
                break;
            case 2:
                bundle.putInt(str, ((Integer) obj).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((Float) obj).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((a7u0) obj).mo25000c());
                break;
            case 6:
                bundle.putBundle(str, ((ufd0) obj).m82985e(i, false));
                break;
            case 7:
                bundle.putBundle(str, ((phd0) obj).m69980c(i));
                break;
            case 8:
                bundle.putBundle(str, ((dr81) obj).mo36708c());
                break;
        }
    }
}
