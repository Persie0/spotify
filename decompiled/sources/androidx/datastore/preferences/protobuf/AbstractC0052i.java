package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import p204p.az70;
import p204p.c3a1;
import p204p.dva;
import p204p.mgy0;
import p204p.twe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052i {

    /* JADX INFO: renamed from: a */
    public static final Class f869a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC0053j f870b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC0053j f871c;

    /* JADX INFO: renamed from: d */
    public static final c3a1 f872d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f869a = cls;
        f870b = m585w(false);
        f871c = m585w(true);
        f872d = new c3a1();
    }

    /* JADX INFO: renamed from: a */
    public static int m563a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81677J0 = twe.m81677J0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM81677J0 += twe.m81686k0((dva) list.get(i2));
        }
        return iM81677J0;
    }

    /* JADX INFO: renamed from: b */
    public static int m564b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m565c(list);
    }

    /* JADX INFO: renamed from: c */
    public static int m565c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81689n0 = 0;
        for (int i = 0; i < size; i++) {
            iM81689n0 += twe.m81689n0(((Integer) list.get(i)).intValue());
        }
        return iM81689n0;
    }

    /* JADX INFO: renamed from: d */
    public static int m566d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return twe.m81690o0(i) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m567e(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: f */
    public static int m568f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return twe.m81691p0(i) * size;
    }

    /* JADX INFO: renamed from: g */
    public static int m569g(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: h */
    public static int m570h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m571i(list);
    }

    /* JADX INFO: renamed from: i */
    public static int m571i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81696u0 = 0;
        for (int i = 0; i < size; i++) {
            iM81696u0 += twe.m81696u0(((Integer) list.get(i)).intValue());
        }
        return iM81696u0;
    }

    /* JADX INFO: renamed from: j */
    public static int m572j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * list.size()) + m573k(list);
    }

    /* JADX INFO: renamed from: k */
    public static int m573k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81698w0 = 0;
        for (int i = 0; i < size; i++) {
            iM81698w0 += twe.m81698w0(((Long) list.get(i)).longValue());
        }
        return iM81698w0;
    }

    /* JADX INFO: renamed from: l */
    public static int m574l(int i, List list, mgy0 mgy0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81677J0 = twe.m81677J0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            iM81677J0 += twe.m81701z0((AbstractC0044a) list.get(i2), mgy0Var);
        }
        return iM81677J0;
    }

    /* JADX INFO: renamed from: m */
    public static int m575m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m576n(list);
    }

    /* JADX INFO: renamed from: n */
    public static int m576n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81672E0 = 0;
        for (int i = 0; i < size; i++) {
            iM81672E0 += twe.m81672E0(((Integer) list.get(i)).intValue());
        }
        return iM81672E0;
    }

    /* JADX INFO: renamed from: o */
    public static int m577o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m578p(list);
    }

    /* JADX INFO: renamed from: p */
    public static int m578p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81674G0 = 0;
        for (int i = 0; i < size; i++) {
            iM81674G0 += twe.m81674G0(((Long) list.get(i)).longValue());
        }
        return iM81674G0;
    }

    /* JADX INFO: renamed from: q */
    public static int m579q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM81677J0 = twe.m81677J0(i) * size;
        if (!(list instanceof az70)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                iM81677J0 = (obj instanceof dva ? twe.m81686k0((dva) obj) : twe.m81676I0((String) obj)) + iM81677J0;
                i2++;
            }
            return iM81677J0;
        }
        az70 az70Var = (az70) list;
        while (i2 < size) {
            Object objMo27583k = az70Var.mo27583k(i2);
            iM81677J0 = (objMo27583k instanceof dva ? twe.m81686k0((dva) objMo27583k) : twe.m81676I0((String) objMo27583k)) + iM81677J0;
            i2++;
        }
        return iM81677J0;
    }

    /* JADX INFO: renamed from: r */
    public static int m580r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m581s(list);
    }

    /* JADX INFO: renamed from: s */
    public static int m581s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81679L0 = 0;
        for (int i = 0; i < size; i++) {
            iM81679L0 += twe.m81679L0(((Integer) list.get(i)).intValue());
        }
        return iM81679L0;
    }

    /* JADX INFO: renamed from: t */
    public static int m582t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (twe.m81677J0(i) * size) + m583u(list);
    }

    /* JADX INFO: renamed from: u */
    public static int m583u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM81681N0 = 0;
        for (int i = 0; i < size; i++) {
            iM81681N0 += twe.m81681N0(((Long) list.get(i)).longValue());
        }
        return iM81681N0;
    }

    /* JADX INFO: renamed from: w */
    public static AbstractC0053j m585w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (AbstractC0053j) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static void m586x(AbstractC0053j abstractC0053j, Object obj, Object obj2) {
        ((c3a1) abstractC0053j).getClass();
        AbstractC0048e abstractC0048e = (AbstractC0048e) obj;
        C0054k c0054k = abstractC0048e.unknownFields;
        C0054k c0054k2 = ((AbstractC0048e) obj2).unknownFields;
        if (!c0054k2.equals(C0054k.f873f)) {
            int i = c0054k.f874a + c0054k2.f874a;
            int[] iArrCopyOf = Arrays.copyOf(c0054k.f875b, i);
            System.arraycopy(c0054k2.f875b, 0, iArrCopyOf, c0054k.f874a, c0054k2.f874a);
            Object[] objArrCopyOf = Arrays.copyOf(c0054k.f876c, i);
            System.arraycopy(c0054k2.f876c, 0, objArrCopyOf, c0054k.f874a, c0054k2.f874a);
            c0054k = new C0054k(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0048e.unknownFields = c0054k;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m587y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static Object m584v(int i, List list, Object obj, AbstractC0053j abstractC0053j) {
        return obj;
    }
}
