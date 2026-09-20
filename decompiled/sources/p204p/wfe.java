package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class wfe<T> extends hk60<T> {

    /* JADX INFO: renamed from: d */
    public static final hk60.InterfaceC1945e f250816d = new C2532a();

    /* JADX INFO: renamed from: a */
    private final ufe<T> f250817a;

    /* JADX INFO: renamed from: b */
    private final C2533b<?>[] f250818b;

    /* JADX INFO: renamed from: c */
    private final xl60.C2578b f250819c;

    /* JADX INFO: renamed from: p.wfe$a */
    public class C2532a implements hk60.InterfaceC1945e {
        /* JADX INFO: renamed from: a */
        private void m87974a(p0i0 p0i0Var, Type type, Map<String, C2533b<?>> map) {
            gk60 gk60Var;
            Class<?> clsM62454g = mp91.m62454g(type);
            boolean zM40456j = f0b1.m40456j(clsM62454g);
            for (Field field : clsM62454g.getDeclaredFields()) {
                if (m87975b(zM40456j, field.getModifiers()) && ((gk60Var = (gk60) field.getAnnotation(gk60.class)) == null || !gk60Var.ignore())) {
                    Type typeM40463q = f0b1.m40463q(type, clsM62454g, field.getGenericType());
                    Set<? extends Annotation> setM40457k = f0b1.m40457k(field);
                    String name = field.getName();
                    hk60<T> hk60VarM68706f = p0i0Var.m68706f(typeM40463q, setM40457k, name);
                    field.setAccessible(true);
                    String strM40460n = f0b1.m40460n(name, gk60Var);
                    C2533b<?> c2533b = new C2533b<>(strM40460n, field, hk60VarM68706f);
                    C2533b<?> c2533bPut = map.put(strM40460n, c2533b);
                    if (c2533bPut != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + c2533bPut.f250821b + "\n    " + c2533b.f250821b);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private boolean m87975b(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }

        /* JADX INFO: renamed from: c */
        private void m87976c(Type type, Class<?> cls) {
            Class<?> clsM62454g = mp91.m62454g(type);
            if (cls.isAssignableFrom(clsM62454g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsM62454g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> clsM62454g = mp91.m62454g(type);
            if (clsM62454g.isInterface() || clsM62454g.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (f0b1.m40456j(clsM62454g)) {
                m87976c(type, List.class);
                m87976c(type, Set.class);
                m87976c(type, Map.class);
                m87976c(type, Collection.class);
                String strM36610j = dq60.m36610j(clsM62454g, "Platform ");
                if (type instanceof ParameterizedType) {
                    strM36610j = strM36610j + " in " + type;
                }
                throw new IllegalArgumentException(s571.m77250i(strM36610j, " requires explicit JsonAdapter to be registered"));
            }
            if (clsM62454g.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(clsM62454g.getName()));
            }
            if (clsM62454g.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class ".concat(clsM62454g.getName()));
            }
            if (clsM62454g.getEnclosingClass() != null && !Modifier.isStatic(clsM62454g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(clsM62454g.getName()));
            }
            if (Modifier.isAbstract(clsM62454g.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class ".concat(clsM62454g.getName()));
            }
            if (f0b1.m40455i(clsM62454g)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + clsM62454g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            ufe ufeVarM82986a = ufe.m82986a(clsM62454g);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                m87974a(p0i0Var, type, treeMap);
                type = mp91.m62453f(type);
            }
            return new wfe(ufeVarM82986a, treeMap).nullSafe();
        }
    }

    /* JADX INFO: renamed from: p.wfe$b */
    /* JADX INFO: loaded from: classes11.dex */
    public static class C2533b<T> {

        /* JADX INFO: renamed from: a */
        final String f250820a;

        /* JADX INFO: renamed from: b */
        final Field f250821b;

        /* JADX INFO: renamed from: c */
        final hk60<T> f250822c;

        public C2533b(String str, Field field, hk60<T> hk60Var) {
            this.f250820a = str;
            this.f250821b = field;
            this.f250822c = hk60Var;
        }

        /* JADX INFO: renamed from: a */
        public void m87977a(xl60 xl60Var, Object obj) throws IllegalAccessException {
            this.f250821b.set(obj, this.f250822c.fromJson(xl60Var));
        }

        /* JADX INFO: renamed from: b */
        public void m87978b(rm60 rm60Var, Object obj) throws IllegalAccessException {
            this.f250822c.toJson(rm60Var, (T) this.f250821b.get(obj));
        }
    }

    public wfe(ufe<T> ufeVar, Map<String, C2533b<?>> map) {
        this.f250817a = ufeVar;
        this.f250818b = (C2533b[]) map.values().toArray(new C2533b[map.size()]);
        this.f250819c = xl60.C2578b.m91389a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // p204p.hk60
    public T fromJson(xl60 xl60Var) {
        try {
            T tMo82987b = this.f250817a.mo82987b();
            try {
                xl60Var.mo51076c();
                while (xl60Var.mo51079i()) {
                    int iMo51071K = xl60Var.mo51071K(this.f250819c);
                    if (iMo51071K == -1) {
                        xl60Var.mo51073P();
                        xl60Var.mo51074Q();
                    } else {
                        this.f250818b[iMo51071K].m87977a(xl60Var, tMo82987b);
                    }
                }
                xl60Var.mo51078f();
                return tMo82987b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw f0b1.m40466t(e2);
        }
    }

    @Override // p204p.hk60
    public void toJson(rm60 rm60Var, T t) {
        try {
            rm60Var.mo56891e();
            for (C2533b<?> c2533b : this.f250818b) {
                rm60Var.mo56894s(c2533b.f250820a);
                c2533b.m87978b(rm60Var, t);
            }
            rm60Var.mo56893i();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f250817a + ")";
    }
}
