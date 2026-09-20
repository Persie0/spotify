package p204p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class gov0 extends yov0 implements zd60 {

    /* JADX INFO: renamed from: a */
    public final Type f83025a;

    /* JADX INFO: renamed from: b */
    public final yov0 f83026b;

    /* JADX INFO: renamed from: c */
    public final lau f83027c;

    /* JADX WARN: Multi-variable type inference failed */
    public gov0(Type type) {
        yov0 wov0Var;
        yov0 wov0Var2;
        this.f83025a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    wov0Var = componentType.isPrimitive() ? new wov0(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new gov0(componentType) : componentType instanceof WildcardType ? new bpv0((WildcardType) componentType) : new oov0(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            wov0Var2 = cls2.isPrimitive() ? new wov0(cls2) : wov0Var2;
            this.f83026b = wov0Var2;
            this.f83027c = lau.f131415a;
        }
        wov0Var = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new gov0(genericComponentType) : genericComponentType instanceof WildcardType ? new bpv0((WildcardType) genericComponentType) : new oov0(genericComponentType);
        wov0Var2 = wov0Var;
        this.f83026b = wov0Var2;
        this.f83027c = lau.f131415a;
    }

    @Override // p204p.yov0
    /* JADX INFO: renamed from: b */
    public final Type mo30166b() {
        return this.f83025a;
    }

    @Override // p204p.yc60
    public final Collection getAnnotations() {
        return this.f83027c;
    }
}
