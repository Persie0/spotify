package p204p;

import androidx.car.app.model.Alert;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gbh1 extends r9h1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected b7f1 zzc;

    public gbh1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = b7f1.f24264e;
    }

    /* JADX INFO: renamed from: g */
    public static gbh1 m44222g(Class cls) {
        Map map = zzd;
        gbh1 gbh1Var = (gbh1) map.get(cls);
        if (gbh1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gbh1Var = (gbh1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (gbh1Var != null) {
            return gbh1Var;
        }
        gbh1 gbh1Var2 = (gbh1) ((gbh1) k7f1.m55648e(cls)).mo24628j(6, null);
        if (gbh1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, gbh1Var2);
        return gbh1Var2;
    }

    /* JADX INFO: renamed from: h */
    public static void m44223h(Class cls, gbh1 gbh1Var) {
        gbh1Var.m44230l();
        zzd.put(cls, gbh1Var);
    }

    /* JADX INFO: renamed from: i */
    public static Object m44224i(Method method, gbh1 gbh1Var, Object... objArr) {
        try {
            return method.invoke(gbh1Var, objArr);
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

    @Override // p204p.r9h1
    /* JADX INFO: renamed from: a */
    public final int mo44225a() {
        if (m44229k()) {
            int iMo32264g = hch1.f89793c.m47121a(getClass()).mo32264g(this);
            if (iMo32264g >= 0) {
                return iMo32264g;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iMo32264g).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo32264g);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo32264g2 = hch1.f89793c.m47121a(getClass()).mo32264g(this);
        if (iMo32264g2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo32264g2;
            return iMo32264g2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMo32264g2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo32264g2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // p204p.r9h1
    /* JADX INFO: renamed from: c */
    public final int mo44226c(lch1 lch1Var) {
        if (m44229k()) {
            int iMo32264g = lch1Var.mo32264g(this);
            if (iMo32264g >= 0) {
                return iMo32264g;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iMo32264g).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iMo32264g);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo32264g2 = lch1Var.mo32264g(this);
        if (iMo32264g2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo32264g2;
            return iMo32264g2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMo32264g2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iMo32264g2);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX INFO: renamed from: e */
    public final ebh1 m44227e() {
        return (ebh1) mo24628j(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hch1.f89793c.m47121a(getClass()).mo32258a(this, (gbh1) obj);
    }

    /* JADX INFO: renamed from: f */
    public final void m44228f() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final int hashCode() {
        if (m44229k()) {
            return hch1.f89793c.m47121a(getClass()).mo32260c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo32260c = hch1.f89793c.m47121a(getClass()).mo32260c(this);
        this.zza = iMo32260c;
        return iMo32260c;
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo24628j(int i, gbh1 gbh1Var);

    /* JADX INFO: renamed from: k */
    public final boolean m44229k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m44230l() {
        this.zzb &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = bch1.f25893a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        bch1.m28747b(this, sb, 0);
        return sb.toString();
    }
}
