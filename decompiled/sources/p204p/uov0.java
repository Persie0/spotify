package p204p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class uov0 extends tov0 implements ce60 {

    /* JADX INFO: renamed from: b */
    public final Method f232526b;

    public uov0(Method method) {
        this.f232526b = method;
    }

    @Override // p204p.ce60
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f232526b.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new zov0(typeVariable));
        }
        return arrayList;
    }

    @Override // p204p.tov0
    /* JADX INFO: renamed from: t */
    public final Member mo70492t() {
        return this.f232526b;
    }

    /* JADX INFO: renamed from: x */
    public final Method m83635x() {
        return this.f232526b;
    }

    /* JADX INFO: renamed from: y */
    public final yov0 m83636y() {
        Type genericReturnType = this.f232526b.getGenericReturnType();
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new wov0(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new gov0(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new bpv0((WildcardType) genericReturnType) : new oov0(genericReturnType);
    }

    /* JADX INFO: renamed from: z */
    public final List m83637z() {
        Method method = this.f232526b;
        return m81221v(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
    }
}
