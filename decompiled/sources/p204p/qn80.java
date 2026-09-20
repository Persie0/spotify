package p204p;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
final class qn80<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    private static final Comparator<Comparable> f190492i = new C2301a();

    /* JADX INFO: renamed from: a */
    final Comparator<? super K> f190493a;

    /* JADX INFO: renamed from: b */
    C2307g<K, V>[] f190494b;

    /* JADX INFO: renamed from: c */
    final C2307g<K, V> f190495c;

    /* JADX INFO: renamed from: d */
    int f190496d;

    /* JADX INFO: renamed from: e */
    int f190497e;

    /* JADX INFO: renamed from: f */
    int f190498f;

    /* JADX INFO: renamed from: g */
    private qn80<K, V>.C2304d f190499g;

    /* JADX INFO: renamed from: h */
    private qn80<K, V>.C2305e f190500h;

    /* JADX INFO: renamed from: p.qn80$a */
    public class C2301a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: p.qn80$b */
    public static final class C2302b<K, V> {

        /* JADX INFO: renamed from: a */
        private C2307g<K, V> f190501a;

        /* JADX INFO: renamed from: b */
        private int f190502b;

        /* JADX INFO: renamed from: c */
        private int f190503c;

        /* JADX INFO: renamed from: d */
        private int f190504d;

        /* JADX INFO: renamed from: a */
        public void m73331a(C2307g<K, V> c2307g) {
            c2307g.f190516c = null;
            c2307g.f190514a = null;
            c2307g.f190515b = null;
            c2307g.f190522i = 1;
            int i = this.f190502b;
            if (i > 0) {
                int i2 = this.f190504d;
                if ((i2 & 1) == 0) {
                    this.f190504d = i2 + 1;
                    this.f190502b = i - 1;
                    this.f190503c++;
                }
            }
            c2307g.f190514a = this.f190501a;
            this.f190501a = c2307g;
            int i3 = this.f190504d;
            int i4 = i3 + 1;
            this.f190504d = i4;
            int i5 = this.f190502b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.f190504d = i3 + 2;
                this.f190502b = i5 - 1;
                this.f190503c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.f190504d & i7) != i7) {
                    return;
                }
                int i8 = this.f190503c;
                if (i8 == 0) {
                    C2307g<K, V> c2307g2 = this.f190501a;
                    C2307g<K, V> c2307g3 = c2307g2.f190514a;
                    C2307g<K, V> c2307g4 = c2307g3.f190514a;
                    c2307g3.f190514a = c2307g4.f190514a;
                    this.f190501a = c2307g3;
                    c2307g3.f190515b = c2307g4;
                    c2307g3.f190516c = c2307g2;
                    c2307g3.f190522i = c2307g2.f190522i + 1;
                    c2307g4.f190514a = c2307g3;
                    c2307g2.f190514a = c2307g3;
                } else if (i8 == 1) {
                    C2307g<K, V> c2307g5 = this.f190501a;
                    C2307g<K, V> c2307g6 = c2307g5.f190514a;
                    this.f190501a = c2307g6;
                    c2307g6.f190516c = c2307g5;
                    c2307g6.f190522i = c2307g5.f190522i + 1;
                    c2307g5.f190514a = c2307g6;
                    this.f190503c = 0;
                } else if (i8 == 2) {
                    this.f190503c = 0;
                }
                i6 *= 2;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m73332b(int i) {
            this.f190502b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f190504d = 0;
            this.f190503c = 0;
            this.f190501a = null;
        }

        /* JADX INFO: renamed from: c */
        public C2307g<K, V> m73333c() {
            C2307g<K, V> c2307g = this.f190501a;
            if (c2307g.f190514a == null) {
                return c2307g;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: p.qn80$c */
    public static class C2303c<K, V> {

        /* JADX INFO: renamed from: a */
        private C2307g<K, V> f190505a;

        /* JADX INFO: renamed from: a */
        public C2307g<K, V> m73334a() {
            C2307g<K, V> c2307g = this.f190505a;
            if (c2307g == null) {
                return null;
            }
            C2307g<K, V> c2307g2 = c2307g.f190514a;
            c2307g.f190514a = null;
            C2307g<K, V> c2307g3 = c2307g.f190516c;
            while (true) {
                C2307g<K, V> c2307g4 = c2307g2;
                c2307g2 = c2307g3;
                if (c2307g2 == null) {
                    this.f190505a = c2307g4;
                    return c2307g;
                }
                c2307g2.f190514a = c2307g4;
                c2307g3 = c2307g2.f190515b;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m73335b(C2307g<K, V> c2307g) {
            C2307g<K, V> c2307g2 = null;
            while (c2307g != null) {
                c2307g.f190514a = c2307g2;
                c2307g2 = c2307g;
                c2307g = c2307g.f190515b;
            }
            this.f190505a = c2307g2;
        }
    }

    /* JADX INFO: renamed from: p.qn80$d */
    public final class C2304d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: p.qn80$d$a */
        public class a extends qn80<K, V>.AbstractC2306f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m73337a();
            }
        }

        public C2304d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            qn80.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && qn80.this.m73326e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C2307g<K, V> c2307gM73326e;
            if (!(obj instanceof Map.Entry) || (c2307gM73326e = qn80.this.m73326e((Map.Entry) obj)) == null) {
                return false;
            }
            qn80.this.m73328h(c2307gM73326e, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return qn80.this.f190496d;
        }
    }

    /* JADX INFO: renamed from: p.qn80$e */
    public final class C2305e extends AbstractSet<K> {

        /* JADX INFO: renamed from: p.qn80$e$a */
        public class a extends qn80<K, V>.AbstractC2306f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m73337a().f190519f;
            }
        }

        public C2305e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            qn80.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return qn80.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return qn80.this.m73329i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return qn80.this.f190496d;
        }
    }

    /* JADX INFO: renamed from: p.qn80$f */
    public abstract class AbstractC2306f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        C2307g<K, V> f190510a;

        /* JADX INFO: renamed from: b */
        C2307g<K, V> f190511b = null;

        /* JADX INFO: renamed from: c */
        int f190512c;

        public AbstractC2306f() {
            this.f190510a = qn80.this.f190495c.f190517d;
            this.f190512c = qn80.this.f190497e;
        }

        /* JADX INFO: renamed from: a */
        public final C2307g<K, V> m73337a() {
            C2307g<K, V> c2307g = this.f190510a;
            qn80 qn80Var = qn80.this;
            if (c2307g == qn80Var.f190495c) {
                throw new NoSuchElementException();
            }
            if (qn80Var.f190497e != this.f190512c) {
                throw new ConcurrentModificationException();
            }
            this.f190510a = c2307g.f190517d;
            this.f190511b = c2307g;
            return c2307g;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f190510a != qn80.this.f190495c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C2307g<K, V> c2307g = this.f190511b;
            if (c2307g == null) {
                throw new IllegalStateException();
            }
            qn80.this.m73328h(c2307g, true);
            this.f190511b = null;
            this.f190512c = qn80.this.f190497e;
        }
    }

    public qn80() {
        this(null);
    }

    /* JADX INFO: renamed from: a */
    private void m73317a() {
        C2307g<K, V>[] c2307gArrM73318b = m73318b(this.f190494b);
        this.f190494b = c2307gArrM73318b;
        this.f190498f = (c2307gArrM73318b.length / 4) + (c2307gArrM73318b.length / 2);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> C2307g<K, V>[] m73318b(C2307g<K, V>[] c2307gArr) {
        int length = c2307gArr.length;
        C2307g<K, V>[] c2307gArr2 = new C2307g[length * 2];
        C2303c c2303c = new C2303c();
        C2302b c2302b = new C2302b();
        C2302b c2302b2 = new C2302b();
        for (int i = 0; i < length; i++) {
            C2307g<K, V> c2307g = c2307gArr[i];
            if (c2307g != null) {
                c2303c.m73335b(c2307g);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C2307g<K, V> c2307gM73334a = c2303c.m73334a();
                    if (c2307gM73334a == null) {
                        break;
                    }
                    if ((c2307gM73334a.f190520g & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                c2302b.m73332b(i2);
                c2302b2.m73332b(i3);
                c2303c.m73335b(c2307g);
                while (true) {
                    C2307g<K, V> c2307gM73334a2 = c2303c.m73334a();
                    if (c2307gM73334a2 == null) {
                        break;
                    }
                    if ((c2307gM73334a2.f190520g & length) == 0) {
                        c2302b.m73331a(c2307gM73334a2);
                    } else {
                        c2302b2.m73331a(c2307gM73334a2);
                    }
                }
                c2307gArr2[i] = i2 > 0 ? c2302b.m73333c() : null;
                c2307gArr2[i + length] = i3 > 0 ? c2302b2.m73333c() : null;
            }
        }
        return c2307gArr2;
    }

    /* JADX INFO: renamed from: c */
    private boolean m73319c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private void m73320g(C2307g<K, V> c2307g, boolean z) {
        while (c2307g != null) {
            C2307g<K, V> c2307g2 = c2307g.f190515b;
            C2307g<K, V> c2307g3 = c2307g.f190516c;
            int i = c2307g2 != null ? c2307g2.f190522i : 0;
            int i2 = c2307g3 != null ? c2307g3.f190522i : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                C2307g<K, V> c2307g4 = c2307g3.f190515b;
                C2307g<K, V> c2307g5 = c2307g3.f190516c;
                int i4 = (c2307g4 != null ? c2307g4.f190522i : 0) - (c2307g5 != null ? c2307g5.f190522i : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    m73323l(c2307g3);
                }
                m73322k(c2307g);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                C2307g<K, V> c2307g6 = c2307g2.f190515b;
                C2307g<K, V> c2307g7 = c2307g2.f190516c;
                int i5 = (c2307g6 != null ? c2307g6.f190522i : 0) - (c2307g7 != null ? c2307g7.f190522i : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    m73322k(c2307g2);
                }
                m73323l(c2307g);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c2307g.f190522i = i + 1;
                if (z) {
                    return;
                }
            } else {
                c2307g.f190522i = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c2307g = c2307g.f190514a;
        }
    }

    /* JADX INFO: renamed from: j */
    private void m73321j(C2307g<K, V> c2307g, C2307g<K, V> c2307g2) {
        C2307g<K, V> c2307g3 = c2307g.f190514a;
        c2307g.f190514a = null;
        if (c2307g2 != null) {
            c2307g2.f190514a = c2307g3;
        }
        if (c2307g3 == null) {
            int i = c2307g.f190520g;
            C2307g<K, V>[] c2307gArr = this.f190494b;
            c2307gArr[i & (c2307gArr.length - 1)] = c2307g2;
        } else if (c2307g3.f190515b == c2307g) {
            c2307g3.f190515b = c2307g2;
        } else {
            c2307g3.f190516c = c2307g2;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m73322k(C2307g<K, V> c2307g) {
        C2307g<K, V> c2307g2 = c2307g.f190515b;
        C2307g<K, V> c2307g3 = c2307g.f190516c;
        C2307g<K, V> c2307g4 = c2307g3.f190515b;
        C2307g<K, V> c2307g5 = c2307g3.f190516c;
        c2307g.f190516c = c2307g4;
        if (c2307g4 != null) {
            c2307g4.f190514a = c2307g;
        }
        m73321j(c2307g, c2307g3);
        c2307g3.f190515b = c2307g;
        c2307g.f190514a = c2307g3;
        int iMax = Math.max(c2307g2 != null ? c2307g2.f190522i : 0, c2307g4 != null ? c2307g4.f190522i : 0) + 1;
        c2307g.f190522i = iMax;
        c2307g3.f190522i = Math.max(iMax, c2307g5 != null ? c2307g5.f190522i : 0) + 1;
    }

    /* JADX INFO: renamed from: l */
    private void m73323l(C2307g<K, V> c2307g) {
        C2307g<K, V> c2307g2 = c2307g.f190515b;
        C2307g<K, V> c2307g3 = c2307g.f190516c;
        C2307g<K, V> c2307g4 = c2307g2.f190515b;
        C2307g<K, V> c2307g5 = c2307g2.f190516c;
        c2307g.f190515b = c2307g5;
        if (c2307g5 != null) {
            c2307g5.f190514a = c2307g;
        }
        m73321j(c2307g, c2307g2);
        c2307g2.f190516c = c2307g;
        c2307g.f190514a = c2307g2;
        int iMax = Math.max(c2307g3 != null ? c2307g3.f190522i : 0, c2307g5 != null ? c2307g5.f190522i : 0) + 1;
        c2307g.f190522i = iMax;
        c2307g2.f190522i = Math.max(iMax, c2307g4 != null ? c2307g4.f190522i : 0) + 1;
    }

    /* JADX INFO: renamed from: n */
    private static int m73324n(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f190494b, (Object) null);
        this.f190496d = 0;
        this.f190497e++;
        C2307g<K, V> c2307g = this.f190495c;
        C2307g<K, V> c2307g2 = c2307g.f190517d;
        while (c2307g2 != c2307g) {
            C2307g<K, V> c2307g3 = c2307g2.f190517d;
            c2307g2.f190518e = null;
            c2307g2.f190517d = null;
            c2307g2 = c2307g3;
        }
        c2307g.f190518e = c2307g;
        c2307g.f190517d = c2307g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m73327f(obj) != null;
    }

    /* JADX INFO: renamed from: d */
    public C2307g<K, V> m73325d(K k, boolean z) {
        int iCompareTo;
        C2307g<K, V> c2307g;
        Comparator<? super K> comparator = this.f190493a;
        C2307g<K, V>[] c2307gArr = this.f190494b;
        int iM73324n = m73324n(k.hashCode());
        int length = (c2307gArr.length - 1) & iM73324n;
        C2307g<K, V> c2307g2 = c2307gArr[length];
        if (c2307g2 != null) {
            Comparable comparable = comparator == f190492i ? (Comparable) k : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(c2307g2.f190519f) : comparator.compare(k, c2307g2.f190519f);
                if (iCompareTo == 0) {
                    return c2307g2;
                }
                C2307g<K, V> c2307g3 = iCompareTo < 0 ? c2307g2.f190515b : c2307g2.f190516c;
                if (c2307g3 == null) {
                    break;
                }
                c2307g2 = c2307g3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        C2307g<K, V> c2307g4 = this.f190495c;
        if (c2307g2 != null) {
            C2307g<K, V> c2307g5 = c2307g2;
            c2307g = new C2307g<>(c2307g5, k, iM73324n, c2307g4, c2307g4.f190518e);
            if (i < 0) {
                c2307g5.f190515b = c2307g;
            } else {
                c2307g5.f190516c = c2307g;
            }
            m73320g(c2307g5, true);
        } else {
            if (comparator == f190492i && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName().concat(" is not Comparable"));
            }
            c2307g = new C2307g<>(c2307g2, k, iM73324n, c2307g4, c2307g4.f190518e);
            c2307gArr[length] = c2307g;
        }
        int i2 = this.f190496d;
        this.f190496d = i2 + 1;
        if (i2 > this.f190498f) {
            m73317a();
        }
        this.f190497e++;
        return c2307g;
    }

    /* JADX INFO: renamed from: e */
    public C2307g<K, V> m73326e(Map.Entry<?, ?> entry) {
        C2307g<K, V> c2307gM73327f = m73327f(entry.getKey());
        if (c2307gM73327f == null || !m73319c(c2307gM73327f.f190521h, entry.getValue())) {
            return null;
        }
        return c2307gM73327f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        qn80<K, V>.C2304d c2304d = this.f190499g;
        if (c2304d != null) {
            return c2304d;
        }
        qn80<K, V>.C2304d c2304d2 = new C2304d();
        this.f190499g = c2304d2;
        return c2304d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public C2307g<K, V> m73327f(Object obj) {
        if (obj != 0) {
            try {
                return m73325d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C2307g<K, V> c2307gM73327f = m73327f(obj);
        if (c2307gM73327f != null) {
            return c2307gM73327f.f190521h;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m73328h(C2307g<K, V> c2307g, boolean z) {
        int i;
        if (z) {
            C2307g<K, V> c2307g2 = c2307g.f190518e;
            c2307g2.f190517d = c2307g.f190517d;
            c2307g.f190517d.f190518e = c2307g2;
            c2307g.f190518e = null;
            c2307g.f190517d = null;
        }
        C2307g<K, V> c2307g3 = c2307g.f190515b;
        C2307g<K, V> c2307g4 = c2307g.f190516c;
        C2307g<K, V> c2307g5 = c2307g.f190514a;
        int i2 = 0;
        if (c2307g3 == null || c2307g4 == null) {
            if (c2307g3 != null) {
                m73321j(c2307g, c2307g3);
                c2307g.f190515b = null;
            } else if (c2307g4 != null) {
                m73321j(c2307g, c2307g4);
                c2307g.f190516c = null;
            } else {
                m73321j(c2307g, null);
            }
            m73320g(c2307g5, false);
            this.f190496d--;
            this.f190497e++;
            return;
        }
        C2307g<K, V> c2307gM73339b = c2307g3.f190522i > c2307g4.f190522i ? c2307g3.m73339b() : c2307g4.m73338a();
        m73328h(c2307gM73339b, false);
        C2307g<K, V> c2307g6 = c2307g.f190515b;
        if (c2307g6 != null) {
            i = c2307g6.f190522i;
            c2307gM73339b.f190515b = c2307g6;
            c2307g6.f190514a = c2307gM73339b;
            c2307g.f190515b = null;
        } else {
            i = 0;
        }
        C2307g<K, V> c2307g7 = c2307g.f190516c;
        if (c2307g7 != null) {
            i2 = c2307g7.f190522i;
            c2307gM73339b.f190516c = c2307g7;
            c2307g7.f190514a = c2307gM73339b;
            c2307g.f190516c = null;
        }
        c2307gM73339b.f190522i = Math.max(i, i2) + 1;
        m73321j(c2307g, c2307gM73339b);
    }

    /* JADX INFO: renamed from: i */
    public C2307g<K, V> m73329i(Object obj) {
        C2307g<K, V> c2307gM73327f = m73327f(obj);
        if (c2307gM73327f != null) {
            m73328h(c2307gM73327f, true);
        }
        return c2307gM73327f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        qn80<K, V>.C2305e c2305e = this.f190500h;
        if (c2305e != null) {
            return c2305e;
        }
        qn80<K, V>.C2305e c2305e2 = new C2305e();
        this.f190500h = c2305e2;
        return c2305e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C2307g<K, V> c2307gM73325d = m73325d(k, true);
        V v2 = c2307gM73325d.f190521h;
        c2307gM73325d.f190521h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C2307g<K, V> c2307gM73329i = m73329i(obj);
        if (c2307gM73329i != null) {
            return c2307gM73329i.f190521h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f190496d;
    }

    public qn80(Comparator<? super K> comparator) {
        this.f190496d = 0;
        this.f190497e = 0;
        this.f190493a = comparator == null ? f190492i : comparator;
        this.f190495c = new C2307g<>();
        C2307g<K, V>[] c2307gArr = new C2307g[16];
        this.f190494b = c2307gArr;
        this.f190498f = (c2307gArr.length / 4) + (c2307gArr.length / 2);
    }

    /* JADX INFO: renamed from: p.qn80$g */
    public static final class C2307g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        C2307g<K, V> f190514a;

        /* JADX INFO: renamed from: b */
        C2307g<K, V> f190515b;

        /* JADX INFO: renamed from: c */
        C2307g<K, V> f190516c;

        /* JADX INFO: renamed from: d */
        C2307g<K, V> f190517d;

        /* JADX INFO: renamed from: e */
        C2307g<K, V> f190518e;

        /* JADX INFO: renamed from: f */
        final K f190519f;

        /* JADX INFO: renamed from: g */
        final int f190520g;

        /* JADX INFO: renamed from: h */
        V f190521h;

        /* JADX INFO: renamed from: i */
        int f190522i;

        public C2307g() {
            this.f190519f = null;
            this.f190520g = -1;
            this.f190518e = this;
            this.f190517d = this;
        }

        /* JADX INFO: renamed from: a */
        public C2307g<K, V> m73338a() {
            C2307g<K, V> c2307g = this;
            for (C2307g<K, V> c2307g2 = this.f190515b; c2307g2 != null; c2307g2 = c2307g2.f190515b) {
                c2307g = c2307g2;
            }
            return c2307g;
        }

        /* JADX INFO: renamed from: b */
        public C2307g<K, V> m73339b() {
            C2307g<K, V> c2307g = this;
            for (C2307g<K, V> c2307g2 = this.f190516c; c2307g2 != null; c2307g2 = c2307g2.f190516c) {
                c2307g = c2307g2;
            }
            return c2307g;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f190519f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f190521h;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f190519f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f190521h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f190519f;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f190521h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f190521h;
            this.f190521h = v;
            return v2;
        }

        public String toString() {
            return this.f190519f + "=" + this.f190521h;
        }

        public C2307g(C2307g<K, V> c2307g, K k, int i, C2307g<K, V> c2307g2, C2307g<K, V> c2307g3) {
            this.f190514a = c2307g;
            this.f190519f = k;
            this.f190520g = i;
            this.f190522i = 1;
            this.f190517d = c2307g2;
            this.f190518e = c2307g3;
            c2307g3.f190517d = this;
            c2307g2.f190518e = this;
        }
    }
}
