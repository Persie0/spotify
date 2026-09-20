package p204p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public final class bpv0 extends yov0 implements zd60 {

    /* JADX INFO: renamed from: a */
    public final WildcardType f29616a;

    public bpv0(WildcardType wildcardType) {
        this.f29616a = wildcardType;
    }

    @Override // p204p.yov0
    /* JADX INFO: renamed from: b */
    public final Type mo30166b() {
        return this.f29616a;
    }

    /* JADX INFO: renamed from: c */
    public final yov0 m30167c() {
        WildcardType wildcardType = this.f29616a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Type type = (Type) bk5.m29600W0(lowerBounds);
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new wov0(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new gov0(type);
            }
            return type instanceof WildcardType ? new bpv0((WildcardType) type) : new oov0(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) bk5.m29600W0(upperBounds);
        if (wj50.m88271j(type2, Object.class)) {
            return null;
        }
        wj50.m88279p(type2);
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new wov0(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
            return new gov0(type2);
        }
        return type2 instanceof WildcardType ? new bpv0((WildcardType) type2) : new oov0(type2);
    }

    @Override // p204p.yc60
    public final Collection getAnnotations() {
        return lau.f131415a;
    }
}
