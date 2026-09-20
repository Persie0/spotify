package p204p;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class oov0 extends yov0 implements zd60 {

    /* JADX INFO: renamed from: a */
    public final Type f167703a;

    /* JADX INFO: renamed from: b */
    public final y0h1 f167704b;

    public oov0(Type type) {
        y0h1 mov0Var;
        this.f167703a = type;
        if (type instanceof Class) {
            mov0Var = new mov0((Class) type);
        } else if (type instanceof TypeVariable) {
            mov0Var = new zov0((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            mov0Var = new mov0((Class) ((ParameterizedType) type).getRawType());
        }
        this.f167704b = mov0Var;
    }

    @Override // p204p.yov0, p204p.yc60
    /* JADX INFO: renamed from: a */
    public final cov0 mo26729a(y400 y400Var) {
        return null;
    }

    @Override // p204p.yov0
    /* JADX INFO: renamed from: b */
    public final Type mo30166b() {
        return this.f167703a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX INFO: renamed from: c */
    public final ArrayList m67510c() {
        yov0 gov0Var;
        yov0 wov0Var;
        List<Type> listM30095c = bov0.m30095c(this.f167703a);
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM30095c, 10));
        for (Type type : listM30095c) {
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    wov0Var = new wov0(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                        gov0Var = new gov0(type);
                    } else {
                        gov0Var = type instanceof WildcardType ? new bpv0((WildcardType) type) : new oov0(type);
                    }
                    wov0Var = gov0Var;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    gov0Var = new gov0(type);
                } else {
                    gov0Var = new gov0(type);
                }
                wov0Var = gov0Var;
            }
            arrayList.add(wov0Var);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67511d() {
        Type type = this.f167703a;
        if (type instanceof Class) {
            if (!(((Class) type).getTypeParameters().length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p204p.yc60
    public final Collection getAnnotations() {
        return lau.f131415a;
    }
}
