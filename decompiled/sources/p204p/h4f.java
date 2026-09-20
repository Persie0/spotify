package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class h4f<C extends Collection<T>, T> extends hk60<C> {

    /* JADX INFO: renamed from: b */
    public static final hk60.InterfaceC1945e f87523b = new C1922a();

    /* JADX INFO: renamed from: a */
    private final hk60<T> f87524a;

    /* JADX INFO: renamed from: p.h4f$a */
    public class C1922a implements hk60.InterfaceC1945e {
        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
            Class<?> clsM62454g = mp91.m62454g(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsM62454g == List.class || clsM62454g == Collection.class) {
                return h4f.m46641b(type, p0i0Var).nullSafe();
            }
            if (clsM62454g == Set.class) {
                return h4f.m46642d(type, p0i0Var).nullSafe();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: p.h4f$b */
    public class C1923b extends h4f<Collection<T>, T> {
        public C1923b(hk60 hk60Var) {
            super(hk60Var, null);
        }

        @Override // p204p.h4f
        /* JADX INFO: renamed from: c */
        public Collection<T> mo46644c() {
            return new ArrayList();
        }

        @Override // p204p.hk60
        public /* bridge */ /* synthetic */ Object fromJson(xl60 xl60Var) {
            return super.m46643a(xl60Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p204p.hk60
        public /* bridge */ /* synthetic */ void toJson(rm60 rm60Var, Object obj) {
            super.m46645e(rm60Var, (Collection) obj);
        }
    }

    /* JADX INFO: renamed from: p.h4f$c */
    public class C1924c extends h4f<Set<T>, T> {
        public C1924c(hk60 hk60Var) {
            super(hk60Var, null);
        }

        @Override // p204p.h4f
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Set<T> mo46644c() {
            return new LinkedHashSet();
        }

        @Override // p204p.hk60
        public /* bridge */ /* synthetic */ Object fromJson(xl60 xl60Var) {
            return super.m46643a(xl60Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p204p.hk60
        public /* bridge */ /* synthetic */ void toJson(rm60 rm60Var, Object obj) {
            super.m46645e(rm60Var, (Collection) obj);
        }
    }

    public /* synthetic */ h4f(hk60 hk60Var, C1922a c1922a) {
        this(hk60Var);
    }

    /* JADX INFO: renamed from: b */
    public static <T> hk60<Collection<T>> m46641b(Type type, p0i0 p0i0Var) {
        return new C1923b(p0i0Var.m68704d(mp91.m62450c(type, Collection.class)));
    }

    /* JADX INFO: renamed from: d */
    public static <T> hk60<Set<T>> m46642d(Type type, p0i0 p0i0Var) {
        return new C1924c(p0i0Var.m68704d(mp91.m62450c(type, Collection.class)));
    }

    /* JADX INFO: renamed from: a */
    public C m46643a(xl60 xl60Var) {
        C c = (C) mo46644c();
        xl60Var.mo51075a();
        while (xl60Var.mo51079i()) {
            c.add(this.f87524a.fromJson(xl60Var));
        }
        xl60Var.mo51077e();
        return c;
    }

    /* JADX INFO: renamed from: c */
    public abstract C mo46644c();

    /* JADX INFO: renamed from: e */
    public void m46645e(rm60 rm60Var, C c) {
        rm60Var.mo56890a();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            this.f87524a.toJson(rm60Var, (T) it.next());
        }
        rm60Var.mo56892g();
    }

    public String toString() {
        return this.f87524a + ".collection()";
    }

    private h4f(hk60<T> hk60Var) {
        this.f87524a = hk60Var;
    }
}
