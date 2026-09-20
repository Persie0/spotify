package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vpd1 {

    /* JADX INFO: renamed from: a */
    public static final Field f243674a;

    /* JADX INFO: renamed from: b */
    public static final w2b0 f243675b;

    /* JADX INFO: renamed from: c */
    public static final Object f243676c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        f243674a = declaredField;
        f243675b = new w2b0(3);
        f243676c = new Object();
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
    public static Typeface m86122a(AbstractC1806e9 abstractC1806e9, Context context, Typeface typeface, int i, boolean z) {
        int i2;
        Typeface typefaceMo26668Q0;
        int i3;
        int i4;
        Field field = f243674a;
        if (field == null) {
            return null;
        }
        int i5 = (i << 1) | (z ? 1 : 0);
        synchronized (f243676c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    w2b0 w2b0Var = f243675b;
                    SparseArray sparseArray = (SparseArray) w2b0Var.m87067c(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        w2b0Var.m87070g(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i5 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    long jM38140l1 = AbstractC1806e9.m38140l1(typeface);
                    xzz xzzVar = jM38140l1 == 0 ? null : (xzz) ((ConcurrentHashMap) abstractC1806e9.f57320b).get(Long.valueOf(jM38140l1));
                    if (xzzVar == null) {
                        typefaceMo26668Q0 = null;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        Resources resources = context.getResources();
                        int i6 = Integer.MAX_VALUE;
                        yzz yzzVar = null;
                        i2 = 2;
                        for (yzz yzzVar2 : xzzVar.f267824a) {
                            int iAbs = (Math.abs(yzzVar2.f277917b - i) * 2) + (yzzVar2.f277918c == z ? 0 : 1);
                            if (yzzVar == null || i6 > iAbs) {
                                yzzVar = yzzVar2;
                                i6 = iAbs;
                            }
                        }
                        if (yzzVar == null) {
                            typefaceMo26668Q0 = null;
                            i3 = 0;
                        } else {
                            int i7 = yzzVar.f277921f;
                            String str = yzzVar.f277916a;
                            typefaceMo26668Q0 = wo91.f253411a.mo26668Q0(context, resources, i7, str, 0);
                            if (typefaceMo26668Q0 != null) {
                                i3 = 0;
                                wo91.f253412b.m66542d(wo91.m88659b(resources, i7, str, 0, 0), typefaceMo26668Q0);
                            } else {
                                i3 = 0;
                            }
                            long jM38140l2 = AbstractC1806e9.m38140l1(typefaceMo26668Q0);
                            if (jM38140l2 != 0) {
                                ((ConcurrentHashMap) abstractC1806e9.f57320b).put(Long.valueOf(jM38140l2), xzzVar);
                            }
                        }
                    }
                    if (typefaceMo26668Q0 == null) {
                        int i8 = i >= 600 ? 1 : i3;
                        if (i8 == 0 && !z) {
                            i4 = i3;
                        } else if (i8 == 0) {
                            i4 = i2;
                        } else {
                            i4 = !z ? 1 : 3;
                        }
                        typefaceMo26668Q0 = Typeface.create(typeface, i4);
                    }
                    sparseArray.put(i5 == true ? 1 : 0, typefaceMo26668Q0);
                    return typefaceMo26668Q0;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
