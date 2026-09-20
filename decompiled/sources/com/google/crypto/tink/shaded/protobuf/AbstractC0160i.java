package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import p204p.AbstractC2205o8;
import p204p.b3a1;
import p204p.fva;
import p204p.kgy0;
import p204p.o350;
import p204p.xy70;
import p204p.z1b0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0160i {

    /* JADX INFO: renamed from: a */
    public static final Class f2378a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0161j f2379b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC0161j f2380c;

    /* JADX INFO: renamed from: d */
    public static final b3a1 f2381d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f2378a = cls;
        f2379b = m1873v(false);
        f2380c = m1873v(true);
        f2381d = new b3a1();
    }

    /* JADX INFO: renamed from: a */
    public static int m1852a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1742m0 = C0154c.m1742m0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM1742m0 += C0154c.m1736g0((fva) list.get(i2));
        }
        return iM1742m0;
    }

    /* JADX INFO: renamed from: b */
    public static int m1853b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1854c(list);
    }

    /* JADX INFO: renamed from: c */
    public static int m1854c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o350)) {
            int iM1740k0 = 0;
            while (i < size) {
                iM1740k0 += C0154c.m1740k0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM1740k0;
        }
        o350 o350Var = (o350) list;
        int iM1740k1 = 0;
        while (i < size) {
            iM1740k1 += C0154c.m1740k0(o350Var.m66185d(i));
            i++;
        }
        return iM1740k1;
    }

    /* JADX INFO: renamed from: d */
    public static int m1855d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0154c.m1737h0(i) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m1856e(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m1857f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0154c.m1738i0(i) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m1858g(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m1859h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1860i(list);
    }

    /* JADX INFO: renamed from: i */
    public static int m1860i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o350)) {
            int iM1740k0 = 0;
            while (i < size) {
                iM1740k0 += C0154c.m1740k0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM1740k0;
        }
        o350 o350Var = (o350) list;
        int iM1740k1 = 0;
        while (i < size) {
            iM1740k1 += C0154c.m1740k0(o350Var.m66185d(i));
            i++;
        }
        return iM1740k1;
    }

    /* JADX INFO: renamed from: j */
    public static int m1861j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * list.size()) + m1862k(list);
    }

    /* JADX INFO: renamed from: k */
    public static int m1862k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1b0)) {
            int iM1744o0 = 0;
            while (i < size) {
                iM1744o0 += C0154c.m1744o0(((Long) list.get(i)).longValue());
                i++;
            }
            return iM1744o0;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM1744o1 = 0;
        while (i < size) {
            iM1744o1 += C0154c.m1744o0(z1b0Var.m95102d(i));
            i++;
        }
        return iM1744o1;
    }

    /* JADX INFO: renamed from: l */
    public static int m1863l(int i, List list, kgy0 kgy0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM1742m0 = C0154c.m1742m0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC2205o8 abstractC2205o8 = (AbstractC2205o8) list.get(i2);
            abstractC2205o8.getClass();
            AbstractC0156e abstractC0156e = (AbstractC0156e) abstractC2205o8;
            int iMo1835g = abstractC0156e.memoizedSerializedSize;
            if (iMo1835g == -1) {
                iMo1835g = kgy0Var.mo1835g(abstractC2205o8);
                abstractC0156e.memoizedSerializedSize = iMo1835g;
            }
            iM1742m0 += C0154c.m1743n0(iMo1835g) + iMo1835g;
        }
        return iM1742m0;
    }

    /* JADX INFO: renamed from: m */
    public static int m1864m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1865n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m1865n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o350)) {
            int iM1743n0 = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iM1743n0 += C0154c.m1743n0((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
            return iM1743n0;
        }
        o350 o350Var = (o350) list;
        int iM1743n1 = 0;
        while (i < size) {
            int iM66185d = o350Var.m66185d(i);
            iM1743n1 += C0154c.m1743n0((iM66185d >> 31) ^ (iM66185d << 1));
            i++;
        }
        return iM1743n1;
    }

    /* JADX INFO: renamed from: o */
    public static int m1866o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1867p(list);
    }

    /* JADX INFO: renamed from: p */
    public static int m1867p(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1b0)) {
            int iM1744o0 = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iM1744o0 += C0154c.m1744o0((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
            return iM1744o0;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM1744o1 = 0;
        while (i < size) {
            long jM95102d = z1b0Var.m95102d(i);
            iM1744o1 += C0154c.m1744o0((jM95102d >> 63) ^ (jM95102d << 1));
            i++;
        }
        return iM1744o1;
    }

    /* JADX INFO: renamed from: q */
    public static int m1868q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM1742m0 = C0154c.m1742m0(i) * size;
        if (!(list instanceof xy70)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof fva) {
                    int size2 = ((fva) obj).size();
                    iM1742m0 = C0154c.m1743n0(size2) + size2 + iM1742m0;
                } else {
                    iM1742m0 = C0154c.m1741l0((String) obj) + iM1742m0;
                }
                i2++;
            }
            return iM1742m0;
        }
        xy70 xy70Var = (xy70) list;
        while (i2 < size) {
            Object objMo72068k = xy70Var.mo72068k(i2);
            if (objMo72068k instanceof fva) {
                int size3 = ((fva) objMo72068k).size();
                iM1742m0 = C0154c.m1743n0(size3) + size3 + iM1742m0;
            } else {
                iM1742m0 = C0154c.m1741l0((String) objMo72068k) + iM1742m0;
            }
            i2++;
        }
        return iM1742m0;
    }

    /* JADX INFO: renamed from: r */
    public static int m1869r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1870s(list);
    }

    /* JADX INFO: renamed from: s */
    public static int m1870s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof o350)) {
            int iM1743n0 = 0;
            while (i < size) {
                iM1743n0 += C0154c.m1743n0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM1743n0;
        }
        o350 o350Var = (o350) list;
        int iM1743n1 = 0;
        while (i < size) {
            iM1743n1 += C0154c.m1743n0(o350Var.m66185d(i));
            i++;
        }
        return iM1743n1;
    }

    /* JADX INFO: renamed from: t */
    public static int m1871t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0154c.m1742m0(i) * size) + m1872u(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m1872u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z1b0)) {
            int iM1744o0 = 0;
            while (i < size) {
                iM1744o0 += C0154c.m1744o0(((Long) list.get(i)).longValue());
                i++;
            }
            return iM1744o0;
        }
        z1b0 z1b0Var = (z1b0) list;
        int iM1744o1 = 0;
        while (i < size) {
            iM1744o1 += C0154c.m1744o0(z1b0Var.m95102d(i));
            i++;
        }
        return iM1744o1;
    }

    /* JADX INFO: renamed from: v */
    public static AbstractC0161j m1873v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AbstractC0161j) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static void m1874w(AbstractC0161j abstractC0161j, Object obj, Object obj2) {
        ((b3a1) abstractC0161j).getClass();
        AbstractC0156e abstractC0156e = (AbstractC0156e) obj;
        C0162k c0162k = abstractC0156e.unknownFields;
        C0162k c0162k2 = ((AbstractC0156e) obj2).unknownFields;
        if (!c0162k2.equals(C0162k.f2382f)) {
            int i = c0162k.f2383a + c0162k2.f2383a;
            int[] iArrCopyOf = Arrays.copyOf(c0162k.f2384b, i);
            System.arraycopy(c0162k2.f2384b, 0, iArrCopyOf, c0162k.f2383a, c0162k2.f2383a);
            Object[] objArrCopyOf = Arrays.copyOf(c0162k.f2385c, i);
            System.arraycopy(c0162k2.f2385c, 0, objArrCopyOf, c0162k.f2383a, c0162k2.f2383a);
            c0162k = new C0162k(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0156e.unknownFields = c0162k;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m1875x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
