package p204p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p0i0 {

    /* JADX INFO: renamed from: e */
    static final List<hk60.InterfaceC1945e> f172687e;

    /* JADX INFO: renamed from: a */
    private final List<hk60.InterfaceC1945e> f172688a;

    /* JADX INFO: renamed from: b */
    private final int f172689b;

    /* JADX INFO: renamed from: c */
    private final ThreadLocal<C2239d> f172690c = new ThreadLocal<>();

    /* JADX INFO: renamed from: d */
    private final Map<Object, hk60<?>> f172691d = new LinkedHashMap();

    /* JADX INFO: renamed from: p.p0i0$a */
    public class C2236a implements hk60.InterfaceC1945e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Type f172692a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ hk60 f172693b;

        public C2236a(Type type, hk60 hk60Var) {
            this.f172692a = type;
            this.f172693b = hk60Var;
        }

        @Override // p204p.hk60.InterfaceC1945e
        public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
            if (set.isEmpty() && f0b1.m40469w(this.f172692a, type)) {
                return this.f172693b;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: p.p0i0$b */
    public static final class C2237b {

        /* JADX INFO: renamed from: a */
        final List<hk60.InterfaceC1945e> f172694a = new ArrayList();

        /* JADX INFO: renamed from: b */
        int f172695b = 0;

        /* JADX INFO: renamed from: a */
        public C2237b m68709a(Object obj) {
            if (obj != null) {
                return m68711c(ey0.m40278c(obj));
            }
            throw new IllegalArgumentException("adapter == null");
        }

        /* JADX INFO: renamed from: b */
        public <T> C2237b m68710b(Type type, hk60<T> hk60Var) {
            return m68711c(p0i0.m68702h(type, hk60Var));
        }

        /* JADX INFO: renamed from: c */
        public C2237b m68711c(hk60.InterfaceC1945e interfaceC1945e) {
            if (interfaceC1945e == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<hk60.InterfaceC1945e> list = this.f172694a;
            int i = this.f172695b;
            this.f172695b = i + 1;
            list.add(i, interfaceC1945e);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2237b m68712d(hk60.InterfaceC1945e interfaceC1945e) {
            if (interfaceC1945e == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.f172694a.add(interfaceC1945e);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public p0i0 m68713e() {
            return new p0i0(this);
        }
    }

    /* JADX INFO: renamed from: p.p0i0$c */
    public static final class C2238c<T> extends hk60<T> {

        /* JADX INFO: renamed from: a */
        final Type f172696a;

        /* JADX INFO: renamed from: b */
        final String f172697b;

        /* JADX INFO: renamed from: c */
        final Object f172698c;

        /* JADX INFO: renamed from: d */
        hk60<T> f172699d;

        public C2238c(Type type, String str, Object obj) {
            this.f172696a = type;
            this.f172697b = str;
            this.f172698c = obj;
        }

        @Override // p204p.hk60
        public T fromJson(xl60 xl60Var) {
            hk60<T> hk60Var = this.f172699d;
            if (hk60Var != null) {
                return hk60Var.fromJson(xl60Var);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // p204p.hk60
        public void toJson(rm60 rm60Var, T t) {
            hk60<T> hk60Var = this.f172699d;
            if (hk60Var == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            hk60Var.toJson(rm60Var, t);
        }

        public String toString() {
            hk60<T> hk60Var = this.f172699d;
            return hk60Var != null ? hk60Var.toString() : super.toString();
        }
    }

    /* JADX INFO: renamed from: p.p0i0$d */
    public final class C2239d {

        /* JADX INFO: renamed from: a */
        final List<C2238c<?>> f172700a = new ArrayList();

        /* JADX INFO: renamed from: b */
        final Deque<C2238c<?>> f172701b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        boolean f172702c;

        public C2239d() {
        }

        /* JADX INFO: renamed from: a */
        public <T> void m68714a(hk60<T> hk60Var) {
            this.f172701b.getLast().f172699d = hk60Var;
        }

        /* JADX INFO: renamed from: b */
        public IllegalArgumentException m68715b(IllegalArgumentException illegalArgumentException) {
            if (!this.f172702c) {
                this.f172702c = true;
                if (this.f172701b.size() != 1 || this.f172701b.getFirst().f172697b != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<C2238c<?>> itDescendingIterator = this.f172701b.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        C2238c<?> next = itDescendingIterator.next();
                        sb.append("\nfor ");
                        sb.append(next.f172696a);
                        if (next.f172697b != null) {
                            sb.append(' ');
                            sb.append(next.f172697b);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        /* JADX INFO: renamed from: c */
        public void m68716c(boolean z) {
            this.f172701b.removeLast();
            if (this.f172701b.isEmpty()) {
                p0i0.this.f172690c.remove();
                if (z) {
                    synchronized (p0i0.this.f172691d) {
                        try {
                            int size = this.f172700a.size();
                            for (int i = 0; i < size; i++) {
                                C2238c<?> c2238c = this.f172700a.get(i);
                                hk60<T> hk60Var = (hk60) p0i0.this.f172691d.put(c2238c.f172698c, c2238c.f172699d);
                                if (hk60Var != 0) {
                                    c2238c.f172699d = hk60Var;
                                    p0i0.this.f172691d.put(c2238c.f172698c, hk60Var);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public <T> hk60<T> m68717d(Type type, String str, Object obj) {
            int size = this.f172700a.size();
            for (int i = 0; i < size; i++) {
                C2238c<?> c2238c = this.f172700a.get(i);
                if (c2238c.f172698c.equals(obj)) {
                    this.f172701b.add(c2238c);
                    hk60<T> hk60Var = (hk60<T>) c2238c.f172699d;
                    return hk60Var != null ? hk60Var : c2238c;
                }
            }
            C2238c<?> c2238c2 = new C2238c<>(type, str, obj);
            this.f172700a.add(c2238c2);
            this.f172701b.add(c2238c2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f172687e = arrayList;
        arrayList.add(nm41.f155277a);
        arrayList.add(h4f.f87523b);
        arrayList.add(uhc0.f230415c);
        arrayList.add(ij5.f102696c);
        arrayList.add(bhv0.f27247a);
        arrayList.add(wfe.f250816d);
    }

    public p0i0(C2237b c2237b) {
        int size = c2237b.f172694a.size();
        List<hk60.InterfaceC1945e> list = f172687e;
        ArrayList arrayList = new ArrayList(list.size() + size);
        arrayList.addAll(c2237b.f172694a);
        arrayList.addAll(list);
        this.f172688a = Collections.unmodifiableList(arrayList);
        this.f172689b = c2237b.f172695b;
    }

    /* JADX INFO: renamed from: g */
    private Object m68701g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    /* JADX INFO: renamed from: h */
    public static <T> hk60.InterfaceC1945e m68702h(Type type, hk60<T> hk60Var) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (hk60Var != null) {
            return new C2236a(type, hk60Var);
        }
        throw new IllegalArgumentException("jsonAdapter == null");
    }

    /* JADX INFO: renamed from: c */
    public <T> hk60<T> m68703c(Class<T> cls) {
        return m68705e(cls, f0b1.f64586a);
    }

    /* JADX INFO: renamed from: d */
    public <T> hk60<T> m68704d(Type type) {
        return m68705e(type, f0b1.f64586a);
    }

    /* JADX INFO: renamed from: e */
    public <T> hk60<T> m68705e(Type type, Set<? extends Annotation> set) {
        return m68706f(type, set, null);
    }

    /* JADX INFO: renamed from: f */
    public <T> hk60<T> m68706f(Type type, Set<? extends Annotation> set, String str) {
        if (type == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM40462p = f0b1.m40462p(f0b1.m40447a(type));
        Object objM68701g = m68701g(typeM40462p, set);
        synchronized (this.f172691d) {
            try {
                hk60<T> hk60Var = (hk60) this.f172691d.get(objM68701g);
                if (hk60Var != null) {
                    return hk60Var;
                }
                C2239d c2239d = this.f172690c.get();
                if (c2239d == null) {
                    c2239d = new C2239d();
                    this.f172690c.set(c2239d);
                }
                hk60<T> hk60VarM68717d = c2239d.m68717d(typeM40462p, str, objM68701g);
                try {
                    if (hk60VarM68717d != null) {
                        c2239d.m68716c(false);
                        return hk60VarM68717d;
                    }
                    try {
                        int size = this.f172688a.size();
                        for (int i = 0; i < size; i++) {
                            hk60<T> hk60Var2 = (hk60<T>) this.f172688a.get(i).create(typeM40462p, set, this);
                            if (hk60Var2 != null) {
                                c2239d.m68714a(hk60Var2);
                                c2239d.m68716c(true);
                                return hk60Var2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + f0b1.m40467u(typeM40462p, set));
                    } catch (IllegalArgumentException e) {
                        throw c2239d.m68715b(e);
                    }
                } catch (Throwable th) {
                    c2239d.m68716c(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public C2237b m68707i() {
        C2237b c2237b = new C2237b();
        int i = this.f172689b;
        for (int i2 = 0; i2 < i; i2++) {
            c2237b.m68711c(this.f172688a.get(i2));
        }
        int size = this.f172688a.size() - f172687e.size();
        for (int i3 = this.f172689b; i3 < size; i3++) {
            c2237b.m68712d(this.f172688a.get(i3));
        }
        return c2237b;
    }

    /* JADX INFO: renamed from: j */
    public <T> hk60<T> m68708j(hk60.InterfaceC1945e interfaceC1945e, Type type, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeM40462p = f0b1.m40462p(f0b1.m40447a(type));
        int iIndexOf = this.f172688a.indexOf(interfaceC1945e);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + interfaceC1945e);
        }
        int size = this.f172688a.size();
        for (int i = iIndexOf + 1; i < size; i++) {
            hk60<T> hk60Var = (hk60<T>) this.f172688a.get(i).create(typeM40462p, set, this);
            if (hk60Var != null) {
                return hk60Var;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + f0b1.m40467u(typeM40462p, set));
    }
}
