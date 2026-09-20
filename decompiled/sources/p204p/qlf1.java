package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class qlf1 extends vaf1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected oxf1 zzc;
    protected int zzd;

    public qlf1() {
        this.zza = 0;
        this.zzc = oxf1.f170975f;
        this.zzd = -1;
    }

    /* JADX INFO: renamed from: c */
    public static qlf1 m73180c(Class cls) {
        Map map = zzb;
        qlf1 qlf1Var = (qlf1) map.get(cls);
        if (qlf1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                qlf1Var = (qlf1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (qlf1Var != null) {
            return qlf1Var;
        }
        qlf1 qlf1Var2 = (qlf1) ((qlf1) czf1.m34440e(cls)).mo58162b(6, null);
        if (qlf1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, qlf1Var2);
        return qlf1Var2;
    }

    /* JADX INFO: renamed from: d */
    public static gnf1 m73181d(gnf1 gnf1Var) {
        int size = gnf1Var.size();
        return gnf1Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: e */
    public static Object m73182e(Method method, qlf1 qlf1Var, Object... objArr) {
        try {
            return method.invoke(qlf1Var, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m73183f(Class cls, qlf1 qlf1Var) {
        zzb.put(cls, qlf1Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo58162b(int i, qlf1 qlf1Var);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return mtf1.f147064c.m62822a(getClass()).mo36935c(this, (qlf1) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m73184g() {
        byte bByteValue = ((Byte) mo58162b(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo36933a = mtf1.f147064c.m62822a(getClass()).mo36933a(this);
        mo58162b(2, true == zMo36933a ? this : null);
        return zMo36933a;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo36938f = mtf1.f147064c.m62822a(getClass()).mo36938f(this);
        this.zza = iMo36938f;
        return iMo36938f;
    }

    public final String toString() {
        return ahg1.m25982y(this, super.toString());
    }
}
