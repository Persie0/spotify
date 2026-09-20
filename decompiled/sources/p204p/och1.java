package p204p;

import com.google.android.gms.internal.cast.zzxo;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class och1 {

    /* JADX INFO: renamed from: a */
    public static final u6d1 f163927a;

    static {
        int i = bah1.f25203a;
        f163927a = new u6d1();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m66692a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static void m66693b(Object obj, Object obj2) {
        gbh1 gbh1Var = (gbh1) obj;
        b7f1 b7f1Var = gbh1Var.zzc;
        b7f1 b7f1Var2 = ((gbh1) obj2).zzc;
        b7f1 b7f1Var3 = b7f1.f24264e;
        if (!b7f1Var3.equals(b7f1Var2)) {
            if (b7f1Var3.equals(b7f1Var)) {
                b7f1Var.getClass();
                b7f1Var2.getClass();
                int[] iArrCopyOf = Arrays.copyOf(b7f1Var.f24265a, 0);
                System.arraycopy(b7f1Var2.f24265a, 0, iArrCopyOf, 0, 0);
                Object[] objArrCopyOf = Arrays.copyOf(b7f1Var.f24266b, 0);
                System.arraycopy(b7f1Var2.f24266b, 0, objArrCopyOf, 0, 0);
                b7f1Var = new b7f1(iArrCopyOf, objArrCopyOf, true);
            } else {
                b7f1Var.getClass();
                if (!b7f1Var2.equals(b7f1Var3)) {
                    if (!b7f1Var.f24268d) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = b7f1Var.f24265a;
                    int length = iArr.length;
                    System.arraycopy(b7f1Var2.f24265a, 0, iArr, 0, 0);
                    System.arraycopy(b7f1Var2.f24266b, 0, b7f1Var.f24266b, 0, 0);
                }
            }
        }
        gbh1Var.zzc = b7f1Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m66694c(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                oah1Var.m66559N(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        oah1Var.m66563R(i3);
        while (i2 < list.size()) {
            oah1Var.m66566U(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m66695d(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof zah1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66557L(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            oah1Var.m66563R(i3);
            while (i2 < list.size()) {
                oah1Var.m66564S(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zah1 zah1Var = (zah1) list;
        if (!z) {
            while (i2 < zah1Var.f281072c) {
                zah1Var.m95795b(i2);
                oah1Var.m66557L(i, Float.floatToRawIntBits(zah1Var.f281071b[i2]));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zah1Var.f281072c; i6++) {
            zah1Var.m95795b(i6);
            float f = zah1Var.f281071b[i6];
            i5 += 4;
        }
        oah1Var.m66563R(i5);
        while (i2 < zah1Var.f281072c) {
            zah1Var.m95795b(i2);
            oah1Var.m66564S(Float.floatToRawIntBits(zah1Var.f281071b[i2]));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m66696e(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof wbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66558M(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66552X = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM66552X += oah1.m66552X(((Long) list.get(i3)).longValue());
            }
            oah1Var.m66563R(iM66552X);
            while (i2 < list.size()) {
                oah1Var.m66565T(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wbh1 wbh1Var = (wbh1) list;
        if (!z) {
            while (i2 < wbh1Var.f249762c) {
                oah1Var.m66558M(i, wbh1Var.m87667b(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66552X2 = 0;
        for (int i4 = 0; i4 < wbh1Var.f249762c; i4++) {
            iM66552X2 += oah1.m66552X(wbh1Var.m87667b(i4));
        }
        oah1Var.m66563R(iM66552X2);
        while (i2 < wbh1Var.f249762c) {
            oah1Var.m66565T(wbh1Var.m87667b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m66697f(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof wbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66558M(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66552X = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM66552X += oah1.m66552X(((Long) list.get(i3)).longValue());
            }
            oah1Var.m66563R(iM66552X);
            while (i2 < list.size()) {
                oah1Var.m66565T(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wbh1 wbh1Var = (wbh1) list;
        if (!z) {
            while (i2 < wbh1Var.f249762c) {
                oah1Var.m66558M(i, wbh1Var.m87667b(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66552X2 = 0;
        for (int i4 = 0; i4 < wbh1Var.f249762c; i4++) {
            iM66552X2 += oah1.m66552X(wbh1Var.m87667b(i4));
        }
        oah1Var.m66563R(iM66552X2);
        while (i2 < wbh1Var.f249762c) {
            oah1Var.m66565T(wbh1Var.m87667b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m66698g(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof wbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    oah1Var.m66558M(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66552X = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iM66552X += oah1.m66552X((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            oah1Var.m66563R(iM66552X);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                oah1Var.m66565T((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        wbh1 wbh1Var = (wbh1) list;
        if (!z) {
            while (i2 < wbh1Var.f249762c) {
                long jM87667b = wbh1Var.m87667b(i2);
                oah1Var.m66558M(i, (jM87667b >> 63) ^ (jM87667b + jM87667b));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66552X2 = 0;
        for (int i4 = 0; i4 < wbh1Var.f249762c; i4++) {
            long jM87667b2 = wbh1Var.m87667b(i4);
            iM66552X2 += oah1.m66552X((jM87667b2 >> 63) ^ (jM87667b2 + jM87667b2));
        }
        oah1Var.m66563R(iM66552X2);
        while (i2 < wbh1Var.f249762c) {
            long jM87667b3 = wbh1Var.m87667b(i2);
            oah1Var.m66565T((jM87667b3 >> 63) ^ (jM87667b3 + jM87667b3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m66699h(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof wbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66559N(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            oah1Var.m66563R(i3);
            while (i2 < list.size()) {
                oah1Var.m66566U(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wbh1 wbh1Var = (wbh1) list;
        if (!z) {
            while (i2 < wbh1Var.f249762c) {
                oah1Var.m66559N(i, wbh1Var.m87667b(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wbh1Var.f249762c; i6++) {
            wbh1Var.m87667b(i6);
            i5 += 8;
        }
        oah1Var.m66563R(i5);
        while (i2 < wbh1Var.f249762c) {
            oah1Var.m66566U(wbh1Var.m87667b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m66700i(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof wbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66559N(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            oah1Var.m66563R(i3);
            while (i2 < list.size()) {
                oah1Var.m66566U(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        wbh1 wbh1Var = (wbh1) list;
        if (!z) {
            while (i2 < wbh1Var.f249762c) {
                oah1Var.m66559N(i, wbh1Var.m87667b(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wbh1Var.f249762c; i6++) {
            wbh1Var.m87667b(i6);
            i5 += 8;
        }
        oah1Var.m66563R(i5);
        while (i2 < wbh1Var.f249762c) {
            oah1Var.m66566U(wbh1Var.m87667b(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m66701j(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66555J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66552X = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM66552X += oah1.m66552X(((Integer) list.get(i3)).intValue());
            }
            oah1Var.m66563R(iM66552X);
            while (i2 < list.size()) {
                oah1Var.m66562Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                oah1Var.m66555J(i, hbh1Var.m47052d(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66552X2 = 0;
        for (int i4 = 0; i4 < hbh1Var.f89543c; i4++) {
            iM66552X2 += oah1.m66552X(hbh1Var.m47052d(i4));
        }
        oah1Var.m66563R(iM66552X2);
        while (i2 < hbh1Var.f89543c) {
            oah1Var.m66562Q(hbh1Var.m47052d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m66702k(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66556K(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66551W = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM66551W += oah1.m66551W(((Integer) list.get(i3)).intValue());
            }
            oah1Var.m66563R(iM66551W);
            while (i2 < list.size()) {
                oah1Var.m66563R(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                oah1Var.m66556K(i, hbh1Var.m47052d(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66551W2 = 0;
        for (int i4 = 0; i4 < hbh1Var.f89543c; i4++) {
            iM66551W2 += oah1.m66551W(hbh1Var.m47052d(i4));
        }
        oah1Var.m66563R(iM66551W2);
        while (i2 < hbh1Var.f89543c) {
            oah1Var.m66563R(hbh1Var.m47052d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m66703l(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    oah1Var.m66556K(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66551W = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM66551W += oah1.m66551W((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            oah1Var.m66563R(iM66551W);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                oah1Var.m66563R((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                int iM47052d = hbh1Var.m47052d(i2);
                oah1Var.m66556K(i, (iM47052d >> 31) ^ (iM47052d + iM47052d));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66551W2 = 0;
        for (int i4 = 0; i4 < hbh1Var.f89543c; i4++) {
            int iM47052d2 = hbh1Var.m47052d(i4);
            iM66551W2 += oah1.m66551W((iM47052d2 >> 31) ^ (iM47052d2 + iM47052d2));
        }
        oah1Var.m66563R(iM66551W2);
        while (i2 < hbh1Var.f89543c) {
            int iM47052d3 = hbh1Var.m47052d(i2);
            oah1Var.m66563R((iM47052d3 >> 31) ^ (iM47052d3 + iM47052d3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m66704m(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66557L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            oah1Var.m66563R(i3);
            while (i2 < list.size()) {
                oah1Var.m66564S(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                oah1Var.m66557L(i, hbh1Var.m47052d(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hbh1Var.f89543c; i6++) {
            hbh1Var.m47052d(i6);
            i5 += 4;
        }
        oah1Var.m66563R(i5);
        while (i2 < hbh1Var.f89543c) {
            oah1Var.m66564S(hbh1Var.m47052d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m66705n(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66557L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            oah1Var.m66563R(i3);
            while (i2 < list.size()) {
                oah1Var.m66564S(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                oah1Var.m66557L(i, hbh1Var.m47052d(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < hbh1Var.f89543c; i6++) {
            hbh1Var.m47052d(i6);
            i5 += 4;
        }
        oah1Var.m66563R(i5);
        while (i2 < hbh1Var.f89543c) {
            oah1Var.m66564S(hbh1Var.m47052d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m66706o(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!(list instanceof hbh1)) {
            if (!z) {
                while (i2 < list.size()) {
                    oah1Var.m66555J(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            oah1Var.m66554I(i, 2);
            int iM66552X = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM66552X += oah1.m66552X(((Integer) list.get(i3)).intValue());
            }
            oah1Var.m66563R(iM66552X);
            while (i2 < list.size()) {
                oah1Var.m66562Q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        hbh1 hbh1Var = (hbh1) list;
        if (!z) {
            while (i2 < hbh1Var.f89543c) {
                oah1Var.m66555J(i, hbh1Var.m47052d(i2));
                i2++;
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int iM66552X2 = 0;
        for (int i4 = 0; i4 < hbh1Var.f89543c; i4++) {
            iM66552X2 += oah1.m66552X(hbh1Var.m47052d(i4));
        }
        oah1Var.m66563R(iM66552X2);
        while (i2 < hbh1Var.f89543c) {
            oah1Var.m66562Q(hbh1Var.m47052d(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m66707p(int i, List list, bnd1 bnd1Var, boolean z) throws zzxo {
        if (list == null || list.isEmpty()) {
            return;
        }
        oah1 oah1Var = (oah1) bnd1Var.f28810a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte bBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                oah1Var.m66563R(i << 3);
                int i3 = oah1Var.f163337g;
                try {
                    int i4 = i3 + 1;
                    try {
                        oah1Var.f163335e[i3] = bBooleanValue;
                        oah1Var.f163337g = i4;
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i4;
                        throw new zzxo(i3, oah1Var.f163336f, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        oah1Var.m66554I(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        oah1Var.m66563R(i5);
        while (i2 < list.size()) {
            byte bBooleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            int i7 = oah1Var.f163337g;
            try {
                int i8 = i7 + 1;
                try {
                    oah1Var.f163335e[i7] = bBooleanValue2;
                    oah1Var.f163337g = i8;
                    i2++;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i7 = i8;
                    throw new zzxo(i7, oah1Var.f163336f, 1, e);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m66708q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wbh1)) {
            int iM66552X = 0;
            while (i < size) {
                iM66552X += oah1.m66552X(((Long) list.get(i)).longValue());
                i++;
            }
            return iM66552X;
        }
        wbh1 wbh1Var = (wbh1) list;
        int iM66552X2 = 0;
        while (i < size) {
            iM66552X2 += oah1.m66552X(wbh1Var.m87667b(i));
            i++;
        }
        return iM66552X2;
    }

    /* JADX INFO: renamed from: r */
    public static int m66709r(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wbh1)) {
            int iM66552X = 0;
            while (i < size) {
                iM66552X += oah1.m66552X(((Long) list.get(i)).longValue());
                i++;
            }
            return iM66552X;
        }
        wbh1 wbh1Var = (wbh1) list;
        int iM66552X2 = 0;
        while (i < size) {
            iM66552X2 += oah1.m66552X(wbh1Var.m87667b(i));
            i++;
        }
        return iM66552X2;
    }

    /* JADX INFO: renamed from: s */
    public static int m66710s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wbh1)) {
            int iM66552X = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM66552X += oah1.m66552X((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
            return iM66552X;
        }
        wbh1 wbh1Var = (wbh1) list;
        int iM66552X2 = 0;
        while (i < size) {
            long jM87667b = wbh1Var.m87667b(i);
            iM66552X2 += oah1.m66552X((jM87667b >> 63) ^ (jM87667b + jM87667b));
            i++;
        }
        return iM66552X2;
    }

    /* JADX INFO: renamed from: t */
    public static int m66711t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hbh1)) {
            int iM66552X = 0;
            while (i < size) {
                iM66552X += oah1.m66552X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM66552X;
        }
        hbh1 hbh1Var = (hbh1) list;
        int iM66552X2 = 0;
        while (i < size) {
            iM66552X2 += oah1.m66552X(hbh1Var.m47052d(i));
            i++;
        }
        return iM66552X2;
    }

    /* JADX INFO: renamed from: u */
    public static int m66712u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hbh1)) {
            int iM66552X = 0;
            while (i < size) {
                iM66552X += oah1.m66552X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM66552X;
        }
        hbh1 hbh1Var = (hbh1) list;
        int iM66552X2 = 0;
        while (i < size) {
            iM66552X2 += oah1.m66552X(hbh1Var.m47052d(i));
            i++;
        }
        return iM66552X2;
    }

    /* JADX INFO: renamed from: v */
    public static int m66713v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hbh1)) {
            int iM66551W = 0;
            while (i < size) {
                iM66551W += oah1.m66551W(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM66551W;
        }
        hbh1 hbh1Var = (hbh1) list;
        int iM66551W2 = 0;
        while (i < size) {
            iM66551W2 += oah1.m66551W(hbh1Var.m47052d(i));
            i++;
        }
        return iM66551W2;
    }

    /* JADX INFO: renamed from: w */
    public static int m66714w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hbh1)) {
            int iM66551W = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM66551W += oah1.m66551W((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM66551W;
        }
        hbh1 hbh1Var = (hbh1) list;
        int iM66551W2 = 0;
        while (i < size) {
            int iM47052d = hbh1Var.m47052d(i);
            iM66551W2 += oah1.m66551W((iM47052d >> 31) ^ (iM47052d + iM47052d));
            i++;
        }
        return iM66551W2;
    }

    /* JADX INFO: renamed from: x */
    public static int m66715x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oah1.m66551W(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: y */
    public static int m66716y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (oah1.m66551W(i << 3) + 8) * size;
    }
}
