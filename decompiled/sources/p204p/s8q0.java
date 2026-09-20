package p204p;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s8q0<T> implements hk60.InterfaceC1945e {

    /* JADX INFO: renamed from: a */
    final Class<T> f206707a;

    /* JADX INFO: renamed from: b */
    final String f206708b;

    /* JADX INFO: renamed from: c */
    final List<String> f206709c;

    /* JADX INFO: renamed from: d */
    final List<Type> f206710d;

    /* JADX INFO: renamed from: e */
    final hk60<Object> f206711e;

    /* JADX INFO: renamed from: p.s8q0$a */
    /* JADX INFO: loaded from: classes11.dex */
    public static final class C2367a extends hk60<Object> {

        /* JADX INFO: renamed from: a */
        final String f206712a;

        /* JADX INFO: renamed from: b */
        final List<String> f206713b;

        /* JADX INFO: renamed from: c */
        final List<Type> f206714c;

        /* JADX INFO: renamed from: d */
        final List<hk60<Object>> f206715d;

        /* JADX INFO: renamed from: e */
        final hk60<Object> f206716e;

        /* JADX INFO: renamed from: f */
        final xl60.C2578b f206717f;

        /* JADX INFO: renamed from: g */
        final xl60.C2578b f206718g;

        public C2367a(String str, List<String> list, List<Type> list2, List<hk60<Object>> list3, hk60<Object> hk60Var) {
            this.f206712a = str;
            this.f206713b = list;
            this.f206714c = list2;
            this.f206715d = list3;
            this.f206716e = hk60Var;
            this.f206717f = xl60.C2578b.m91389a(str);
            this.f206718g = xl60.C2578b.m91389a((String[]) list.toArray(new String[0]));
        }

        /* JADX INFO: renamed from: a */
        private int m77525a(xl60 xl60Var) {
            xl60Var.mo51076c();
            while (xl60Var.mo51079i()) {
                if (xl60Var.mo51071K(this.f206717f) != -1) {
                    int iMo51072L = xl60Var.mo51072L(this.f206718g);
                    if (iMo51072L != -1 || this.f206716e != null) {
                        return iMo51072L;
                    }
                    throw new JsonDataException("Expected one of " + this.f206713b + " for key '" + this.f206712a + "' but found '" + xl60Var.mo51087y() + "'. Register a subtype for this label.");
                }
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
            throw new JsonDataException("Missing label for " + this.f206712a);
        }

        @Override // p204p.hk60
        public Object fromJson(xl60 xl60Var) throws IOException {
            xl60 xl60VarMo51069D = xl60Var.mo51069D();
            xl60VarMo51069D.m91382M(false);
            try {
                int iM77525a = m77525a(xl60VarMo51069D);
                xl60VarMo51069D.close();
                return iM77525a == -1 ? this.f206716e.fromJson(xl60Var) : this.f206715d.get(iM77525a).fromJson(xl60Var);
            } catch (Throwable th) {
                xl60VarMo51069D.close();
                throw th;
            }
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, Object obj) {
            hk60<Object> hk60Var;
            int iIndexOf = this.f206714c.indexOf(obj.getClass());
            if (iIndexOf == -1) {
                hk60Var = this.f206716e;
                if (hk60Var == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f206714c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hk60Var = this.f206715d.get(iIndexOf);
            }
            rm60Var.mo56891e();
            if (hk60Var != this.f206716e) {
                rm60Var.mo56894s(this.f206712a).mo56887N(this.f206713b.get(iIndexOf));
            }
            int iM75906c = rm60Var.m75906c();
            hk60Var.toJson(rm60Var, obj);
            rm60Var.m75908h(iM75906c);
            rm60Var.mo56893i();
        }

        public String toString() {
            return dq60.m36616p(this.f206712a, ")", new StringBuilder("PolymorphicJsonAdapter("));
        }
    }

    public s8q0(Class<T> cls, String str, List<String> list, List<Type> list2, hk60<Object> hk60Var) {
        this.f206707a = cls;
        this.f206708b = str;
        this.f206709c = list;
        this.f206710d = list2;
        this.f206711e = hk60Var;
    }

    /* JADX INFO: renamed from: a */
    public static <T> s8q0<T> m77523a(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new s8q0<>(cls, str, list, list, null);
    }

    /* JADX INFO: renamed from: b */
    public s8q0<T> m77524b(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f206709c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f206709c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f206710d);
        arrayList2.add(cls);
        return new s8q0<>(this.f206707a, this.f206708b, arrayList, arrayList2, this.f206711e);
    }

    @Override // p204p.hk60.InterfaceC1945e
    public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
        if (mp91.m62454g(type) != this.f206707a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f206710d.size());
        int size = this.f206710d.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(p0i0Var.m68704d(this.f206710d.get(i)));
        }
        return new C2367a(this.f206708b, this.f206709c, this.f206710d, arrayList, this.f206711e).nullSafe();
    }
}
