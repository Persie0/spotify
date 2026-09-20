package p204p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes11.dex */
@rtz0(with = ql60.class)
public final class nl60 extends yk60 implements Map<String, yk60>, pq60 {
    public static final ml60 Companion = new ml60();

    /* JADX INFO: renamed from: a */
    public final Map f155012a;

    public nl60(Map map) {
        this.f155012a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 compute(String str, BiFunction<? super String, ? super yk60, ? extends yk60> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 computeIfAbsent(String str, Function<? super String, ? extends yk60> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 computeIfPresent(String str, BiFunction<? super String, ? super yk60, ? extends yk60> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f155012a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof yk60)) {
            return false;
        }
        return this.f155012a.containsValue((yk60) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, yk60>> entrySet() {
        return this.f155012a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return wj50.m88271j(this.f155012a, obj);
    }

    @Override // java.util.Map
    public final yk60 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (yk60) this.f155012a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f155012a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f155012a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f155012a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 merge(String str, yk60 yk60Var, BiFunction<? super yk60, ? super yk60, ? extends yk60> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 put(String str, yk60 yk60Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends yk60> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 putIfAbsent(String str, yk60 yk60Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final yk60 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ yk60 replace(String str, yk60 yk60Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super yk60, ? extends yk60> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f155012a.size();
    }

    public final String toString() {
        return g6f.m43753y0(this.f155012a.entrySet(), ",", "{", "}", new f150(6), 24);
    }

    @Override // java.util.Map
    public final Collection<yk60> values() {
        return this.f155012a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, yk60 yk60Var, yk60 yk60Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
