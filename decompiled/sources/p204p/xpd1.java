package p204p;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xpd1 {

    /* JADX INFO: renamed from: a */
    public static final Field f264612a;

    /* JADX INFO: renamed from: b */
    public static final Method f264613b;

    /* JADX INFO: renamed from: c */
    public static final Constructor f264614c;

    /* JADX INFO: renamed from: d */
    public static final w2b0 f264615d;

    /* JADX INFO: renamed from: e */
    public static final Object f264616e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f264612a = declaredField;
        f264613b = declaredMethod;
        f264614c = declaredConstructor;
        f264615d = new w2b0(3);
        f264616e = new Object();
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
    /* JADX INFO: renamed from: a */
    public static Typeface m91669a(Typeface typeface, int i, boolean z) {
        Field field = f264612a;
        Typeface typeface2 = null;
        if (field == null) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f264616e) {
            try {
                try {
                    long j = field.getLong(typeface);
                    w2b0 w2b0Var = f264615d;
                    SparseArray sparseArray = (SparseArray) w2b0Var.m87067c(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        w2b0Var.m87070g(j, sparseArray);
                    } else {
                        Typeface typeface3 = (Typeface) sparseArray.get(i2 == true ? 1 : 0);
                        if (typeface3 != null) {
                            return typeface3;
                        }
                    }
                    try {
                        try {
                            Long l = (Long) f264613b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
                            l.longValue();
                            try {
                                typeface2 = (Typeface) f264614c.newInstance(l);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArray.put(i2 == true ? 1 : 0, typeface2);
                            return typeface2;
                        } catch (InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
