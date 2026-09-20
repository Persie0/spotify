package p204p;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wpd1 {

    /* JADX INFO: renamed from: a */
    public static final Field f253747a;

    /* JADX INFO: renamed from: b */
    public static final Method f253748b;

    /* JADX INFO: renamed from: c */
    public static final Method f253749c;

    /* JADX INFO: renamed from: d */
    public static final Constructor f253750d;

    /* JADX INFO: renamed from: e */
    public static final w2b0 f253751e;

    /* JADX INFO: renamed from: f */
    public static final Object f253752f;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f253747a = declaredField;
        f253748b = declaredMethod;
        f253749c = declaredMethod2;
        f253750d = declaredConstructor;
        f253751e = new w2b0(3);
        f253752f = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m88683a(long j) {
        try {
            return (Typeface) f253750d.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static Typeface m88684b(Typeface typeface, int i, boolean z) {
        Typeface typefaceM88683a;
        Field field = f253747a;
        if (field == null) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f253752f) {
            try {
                try {
                    long j = field.getLong(typeface);
                    w2b0 w2b0Var = f253751e;
                    SparseArray sparseArray = (SparseArray) w2b0Var.m87067c(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        w2b0Var.m87070g(j, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i2 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    if (z == typeface.isItalic()) {
                        try {
                            typefaceM88683a = m88683a(((Long) f253749c.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue());
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        typefaceM88683a = m88683a(m88685c(j, z, i));
                    }
                    sparseArray.put(i2 == true ? 1 : 0, typefaceM88683a);
                    return typefaceM88683a;
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m88685c(long j, boolean z, int i) {
        try {
            Long l = (Long) f253748b.invoke(null, Long.valueOf(j), Integer.valueOf(z ? 2 : 0));
            l.longValue();
            return ((Long) f253749c.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
