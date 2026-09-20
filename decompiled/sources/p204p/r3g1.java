package p204p;

import androidx.car.app.model.Alert;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r3g1 extends sxf1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected dcg1 zzc;
    private int zzd;

    public r3g1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = dcg1.f47554f;
    }

    /* JADX INFO: renamed from: f */
    public static void m74640f(Class cls, r3g1 r3g1Var) {
        r3g1Var.m74647e();
        zzb.put(cls, r3g1Var);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m74641i(r3g1 r3g1Var, boolean z) {
        byte bByteValue = ((Byte) r3g1Var.mo29132j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo28475a = l9g1.f131088c.m58515a(r3g1Var.getClass()).mo28475a(r3g1Var);
        if (z) {
            r3g1Var.mo29132j(2);
        }
        return zMo28475a;
    }

    /* JADX INFO: renamed from: m */
    public static r3g1 m74642m(Class cls) {
        Map map = zzb;
        r3g1 r3g1Var = (r3g1) map.get(cls);
        if (r3g1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                r3g1Var = (r3g1) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (r3g1Var != null) {
            return r3g1Var;
        }
        r3g1 r3g1Var2 = (r3g1) ((r3g1) adg1.m25545g(cls)).mo29132j(6);
        if (r3g1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, r3g1Var2);
        return r3g1Var2;
    }

    /* JADX INFO: renamed from: o */
    public static Object m74643o(Method method, r3g1 r3g1Var, Object... objArr) {
        try {
            return method.invoke(r3g1Var, objArr);
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

    @Override // p204p.sxf1
    /* JADX INFO: renamed from: a */
    public final void mo74644a(v0g1 v0g1Var) {
        w9g1 w9g1VarM58515a = l9g1.f131088c.m58515a(getClass());
        use1 use1Var = v0g1Var.f235993c;
        if (use1Var == null) {
            use1Var = new use1();
            Charset charset = a5g1.f12516a;
            use1Var.f233622a = v0g1Var;
            v0g1Var.f235993c = use1Var;
        }
        w9g1VarM58515a.mo28480f(this, use1Var);
    }

    @Override // p204p.sxf1
    /* JADX INFO: renamed from: c */
    public final int mo74645c(w9g1 w9g1Var) {
        if (m74649h()) {
            int iMo28477c = w9g1Var.mo28477c(this);
            if (iMo28477c >= 0) {
                return iMo28477c;
            }
            throw new IllegalStateException(s571.m77246e(iMo28477c, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo28477c2 = w9g1Var.mo28477c(this);
        if (iMo28477c2 < 0) {
            throw new IllegalStateException(s571.m77246e(iMo28477c2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo28477c2;
        return iMo28477c2;
    }

    @Override // p204p.sxf1
    /* JADX INFO: renamed from: d */
    public final int mo74646d() {
        if (m74649h()) {
            int iMo28477c = l9g1.f131088c.m58515a(getClass()).mo28477c(this);
            if (iMo28477c >= 0) {
                return iMo28477c;
            }
            throw new IllegalStateException(s571.m77246e(iMo28477c, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo28477c2 = l9g1.f131088c.m58515a(getClass()).mo28477c(this);
        if (iMo28477c2 < 0) {
            throw new IllegalStateException(s571.m77246e(iMo28477c2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo28477c2;
        return iMo28477c2;
    }

    /* JADX INFO: renamed from: e */
    public final void m74647e() {
        this.zzd &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return l9g1.f131088c.m58515a(getClass()).mo28479e(this, (r3g1) obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m74648g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m74649h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (m74649h()) {
            return l9g1.f131088c.m58515a(getClass()).mo28478d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo28478d = l9g1.f131088c.m58515a(getClass()).mo28478d(this);
        this.zza = iMo28478d;
        return iMo28478d;
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo29132j(int i);

    /* JADX INFO: renamed from: k */
    public final g3g1 m74650k() {
        return (g3g1) mo29132j(5);
    }

    /* JADX INFO: renamed from: l */
    public final g3g1 m74651l() {
        g3g1 g3g1Var = (g3g1) mo29132j(5);
        if (!g3g1Var.f76213a.equals(this)) {
            if (!g3g1Var.f76214b.m74649h()) {
                r3g1 r3g1VarM74652n = g3g1Var.f76213a.m74652n();
                l9g1.f131088c.m58515a(r3g1VarM74652n.getClass()).zzg(r3g1VarM74652n, g3g1Var.f76214b);
                g3g1Var.f76214b = r3g1VarM74652n;
            }
            r3g1 r3g1Var = g3g1Var.f76214b;
            l9g1.f131088c.m58515a(r3g1Var.getClass()).zzg(r3g1Var, this);
        }
        return g3g1Var;
    }

    /* JADX INFO: renamed from: n */
    public final r3g1 m74652n() {
        return (r3g1) mo29132j(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = v8g1.f238576a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        v8g1.m84920c(this, sb, 0);
        return sb.toString();
    }
}
