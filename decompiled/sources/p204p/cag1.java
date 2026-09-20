package p204p;

import com.google.android.gms.internal.play_billing.zzfa;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cag1 {

    /* JADX INFO: renamed from: a */
    public static final ece1 f35818a;

    static {
        int i = dyf1.f54334a;
        f35818a = new ece1();
    }

    /* JADX INFO: renamed from: a */
    public static void m32030a(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84383G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        v0g1Var.m84389M(i3);
        while (i2 < list.size()) {
            v0g1Var.m84384H(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m32031b(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    v0g1Var.m84388L(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int iM84377P = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iM84377P += v0g1.m84377P((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            v0g1Var.m84389M(iM84377P);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                v0g1Var.m84389M((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                int iZze = v3g1Var.zze(i2);
                v0g1Var.m84388L(i, (iZze >> 31) ^ (iZze + iZze));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84377P2 = 0;
        for (int i4 = 0; i4 < v3g1Var.f236886c; i4++) {
            int iZze2 = v3g1Var.zze(i4);
            iM84377P2 += v0g1.m84377P((iZze2 >> 31) ^ (iZze2 + iZze2));
        }
        v0g1Var.m84389M(iM84377P2);
        while (i2 < v3g1Var.f236886c) {
            int iZze3 = v3g1Var.zze(i2);
            v0g1Var.m84389M((iZze3 >> 31) ^ (iZze3 + iZze3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m32032c(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                v0g1Var.m84390N(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84378Q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iM84378Q += v0g1.m84378Q((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        v0g1Var.m84389M(iM84378Q);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            v0g1Var.m84391O((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m32033d(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    v0g1Var.m84388L(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int iM84377P = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84377P += v0g1.m84377P(((Integer) list.get(i3)).intValue());
            }
            v0g1Var.m84389M(iM84377P);
            while (i2 < list.size()) {
                v0g1Var.m84389M(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                v0g1Var.m84388L(i, v3g1Var.zze(i2));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84377P2 = 0;
        for (int i4 = 0; i4 < v3g1Var.f236886c; i4++) {
            iM84377P2 += v0g1.m84377P(v3g1Var.zze(i4));
        }
        v0g1Var.m84389M(iM84377P2);
        while (i2 < v3g1Var.f236886c) {
            v0g1Var.m84389M(v3g1Var.zze(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m32034e(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84390N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84378Q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM84378Q += v0g1.m84378Q(((Long) list.get(i3)).longValue());
        }
        v0g1Var.m84389M(iM84378Q);
        while (i2 < list.size()) {
            v0g1Var.m84391O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m32035f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static int m32036g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v3g1)) {
            int iM84378Q = 0;
            while (i < size) {
                iM84378Q += v0g1.m84378Q(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM84378Q;
        }
        v3g1 v3g1Var = (v3g1) list;
        int iM84378Q2 = 0;
        while (i < size) {
            iM84378Q2 += v0g1.m84378Q(v3g1Var.zze(i));
            i++;
        }
        return iM84378Q2;
    }

    /* JADX INFO: renamed from: h */
    public static int m32037h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v0g1.m84377P(i << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: i */
    public static int m32038i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (v0g1.m84377P(i << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: j */
    public static int m32039j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v3g1)) {
            int iM84378Q = 0;
            while (i < size) {
                iM84378Q += v0g1.m84378Q(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM84378Q;
        }
        v3g1 v3g1Var = (v3g1) list;
        int iM84378Q2 = 0;
        while (i < size) {
            iM84378Q2 += v0g1.m84378Q(v3g1Var.zze(i));
            i++;
        }
        return iM84378Q2;
    }

    /* JADX INFO: renamed from: k */
    public static int m32040k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM84378Q = 0;
        for (int i = 0; i < size; i++) {
            iM84378Q += v0g1.m84378Q(((Long) list.get(i)).longValue());
        }
        return iM84378Q;
    }

    /* JADX INFO: renamed from: l */
    public static int m32041l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v3g1)) {
            int iM84377P = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM84377P += v0g1.m84377P((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
            return iM84377P;
        }
        v3g1 v3g1Var = (v3g1) list;
        int iM84377P2 = 0;
        while (i < size) {
            int iZze = v3g1Var.zze(i);
            iM84377P2 += v0g1.m84377P((iZze >> 31) ^ (iZze + iZze));
            i++;
        }
        return iM84377P2;
    }

    /* JADX INFO: renamed from: m */
    public static int m32042m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM84378Q = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iM84378Q += v0g1.m84378Q((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iM84378Q;
    }

    /* JADX INFO: renamed from: n */
    public static int m32043n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof v3g1)) {
            int iM84377P = 0;
            while (i < size) {
                iM84377P += v0g1.m84377P(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM84377P;
        }
        v3g1 v3g1Var = (v3g1) list;
        int iM84377P2 = 0;
        while (i < size) {
            iM84377P2 += v0g1.m84377P(v3g1Var.zze(i));
            i++;
        }
        return iM84377P2;
    }

    /* JADX INFO: renamed from: o */
    public static int m32044o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM84378Q = 0;
        for (int i = 0; i < size; i++) {
            iM84378Q += v0g1.m84378Q(((Long) list.get(i)).longValue());
        }
        return iM84378Q;
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
    /* JADX INFO: renamed from: p */
    public static void m32045p(Object obj, Object obj2) {
        r3g1 r3g1Var = (r3g1) obj;
        dcg1 dcg1Var = r3g1Var.zzc;
        dcg1 dcg1Var2 = ((r3g1) obj2).zzc;
        dcg1 dcg1Var3 = dcg1.f47554f;
        if (!dcg1Var3.equals(dcg1Var2)) {
            if (dcg1Var3.equals(dcg1Var)) {
                int i = dcg1Var.f47555a + dcg1Var2.f47555a;
                int[] iArrCopyOf = Arrays.copyOf(dcg1Var.f47556b, i);
                System.arraycopy(dcg1Var2.f47556b, 0, iArrCopyOf, dcg1Var.f47555a, dcg1Var2.f47555a);
                Object[] objArrCopyOf = Arrays.copyOf(dcg1Var.f47557c, i);
                System.arraycopy(dcg1Var2.f47557c, 0, objArrCopyOf, dcg1Var.f47555a, dcg1Var2.f47555a);
                dcg1Var = new dcg1(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                dcg1Var.getClass();
                if (!dcg1Var2.equals(dcg1Var3)) {
                    if (!dcg1Var.f47559e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = dcg1Var.f47555a + dcg1Var2.f47555a;
                    dcg1Var.m35657e(i2);
                    System.arraycopy(dcg1Var2.f47556b, 0, dcg1Var.f47556b, dcg1Var.f47555a, dcg1Var2.f47555a);
                    System.arraycopy(dcg1Var2.f47557c, 0, dcg1Var.f47557c, dcg1Var.f47555a, dcg1Var2.f47555a);
                    dcg1Var.f47555a = i2;
                }
            }
        }
        r3g1Var.zzc = dcg1Var;
    }

    /* JADX INFO: renamed from: q */
    public static void m32046q(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                v0g1Var.m84389M(i << 3);
                v0g1Var.m84379C(zBooleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        v0g1Var.m84389M(i3);
        while (i2 < list.size()) {
            v0g1Var.m84379C(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m32047r(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84383G(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        v0g1Var.m84389M(i3);
        while (i2 < list.size()) {
            v0g1Var.m84384H(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m32048s(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    v0g1Var.m84385I(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int iM84378Q = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84378Q += v0g1.m84378Q(((Integer) list.get(i3)).intValue());
            }
            v0g1Var.m84389M(iM84378Q);
            while (i2 < list.size()) {
                v0g1Var.m84386J(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                v0g1Var.m84385I(i, v3g1Var.zze(i2));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84378Q2 = 0;
        for (int i4 = 0; i4 < v3g1Var.f236886c; i4++) {
            iM84378Q2 += v0g1.m84378Q(v3g1Var.zze(i4));
        }
        v0g1Var.m84389M(iM84378Q2);
        while (i2 < v3g1Var.f236886c) {
            v0g1Var.m84386J(v3g1Var.zze(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m32049t(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    v0g1Var.m84381E(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            v0g1Var.m84389M(i3);
            while (i2 < list.size()) {
                v0g1Var.m84382F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                v0g1Var.m84381E(i, v3g1Var.zze(i2));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v3g1Var.f236886c; i6++) {
            v3g1Var.zze(i6);
            i5 += 4;
        }
        v0g1Var.m84389M(i5);
        while (i2 < v3g1Var.f236886c) {
            v0g1Var.m84382F(v3g1Var.zze(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m32050u(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84383G(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        v0g1Var.m84389M(i3);
        while (i2 < list.size()) {
            v0g1Var.m84384H(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m32051v(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84381E(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        v0g1Var.m84389M(i3);
        while (i2 < list.size()) {
            v0g1Var.m84382F(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m32052w(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    v0g1Var.m84385I(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int iM84378Q = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM84378Q += v0g1.m84378Q(((Integer) list.get(i3)).intValue());
            }
            v0g1Var.m84389M(iM84378Q);
            while (i2 < list.size()) {
                v0g1Var.m84386J(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                v0g1Var.m84385I(i, v3g1Var.zze(i2));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84378Q2 = 0;
        for (int i4 = 0; i4 < v3g1Var.f236886c; i4++) {
            iM84378Q2 += v0g1.m84378Q(v3g1Var.zze(i4));
        }
        v0g1Var.m84389M(iM84378Q2);
        while (i2 < v3g1Var.f236886c) {
            v0g1Var.m84386J(v3g1Var.zze(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m32053x(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                v0g1Var.m84390N(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int iM84378Q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM84378Q += v0g1.m84378Q(((Long) list.get(i3)).longValue());
        }
        v0g1Var.m84389M(iM84378Q);
        while (i2 < list.size()) {
            v0g1Var.m84391O(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m32054y(int i, List list, use1 use1Var, boolean z) throws zzfa {
        if (list == null || list.isEmpty()) {
            return;
        }
        v0g1 v0g1Var = (v0g1) use1Var.f233622a;
        int i2 = 0;
        if (!(list instanceof v3g1)) {
            if (!z) {
                while (i2 < list.size()) {
                    v0g1Var.m84381E(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            v0g1Var.m84387K(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            v0g1Var.m84389M(i3);
            while (i2 < list.size()) {
                v0g1Var.m84382F(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        v3g1 v3g1Var = (v3g1) list;
        if (!z) {
            while (i2 < v3g1Var.f236886c) {
                v0g1Var.m84381E(i, v3g1Var.zze(i2));
                i2++;
            }
            return;
        }
        v0g1Var.m84387K(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < v3g1Var.f236886c; i6++) {
            v3g1Var.zze(i6);
            i5 += 4;
        }
        v0g1Var.m84389M(i5);
        while (i2 < v3g1Var.f236886c) {
            v0g1Var.m84382F(v3g1Var.zze(i2));
            i2++;
        }
    }
}
