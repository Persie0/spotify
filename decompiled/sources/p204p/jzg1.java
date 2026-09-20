package p204p;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jzg1 implements ezg1 {

    /* JADX INFO: renamed from: a */
    public static final jzg1 f117728a;

    /* JADX INFO: renamed from: b */
    public static final jzg1 f117729b;

    /* JADX INFO: renamed from: c */
    public static final Unsafe f117730c;

    /* JADX INFO: renamed from: d */
    public static final int f117731d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ jzg1[] f117732e;

    static {
        Unsafe unsafeM54883b;
        jzg1 jzg1Var = new jzg1("UNSAFE_LITTLE_ENDIAN", 0);
        f117728a = jzg1Var;
        jzg1 jzg1Var2 = new jzg1("UNSAFE_BIG_ENDIAN", 1);
        f117729b = jzg1Var2;
        f117732e = new jzg1[]{jzg1Var, jzg1Var2};
        try {
            try {
                unsafeM54883b = Unsafe.getUnsafe();
            } catch (Exception e) {
                throw new RuntimeException("Could not initialize intrinsics", e);
            }
        } catch (SecurityException unused) {
            try {
                unsafeM54883b = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, gzg1.f85943a);
            } catch (Exception unused2) {
                unsafeM54883b = m54883b();
                Unsafe unsafe = unsafeM54883b;
            }
        }
        f117730c = unsafeM54883b;
        f117731d = unsafeM54883b.arrayBaseOffset(byte[].class);
        if (unsafeM54883b.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unsafe m54883b() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    public static jzg1[] values() {
        return (jzg1[]) f117732e.clone();
    }

    @Override // p204p.ezg1
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long mo31032a(byte[] bArr, int i) {
        int iOrdinal = ordinal();
        int i2 = f117731d;
        if (iOrdinal == 0) {
            return f117730c.getLong(bArr, ((long) i) + ((long) i2));
        }
        if (iOrdinal != 1) {
            throw null;
        }
        return Long.reverseBytes(f117730c.getLong(bArr, ((long) i) + ((long) i2)));
    }
}
