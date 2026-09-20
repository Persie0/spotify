package p204p;

import io.ably.lib.types.ReadOnlyMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes15.dex */
public abstract class qg50 implements ReadOnlyMap {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f188382a = new ConcurrentHashMap();

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean containsKey(Object obj) {
        return this.f188382a.containsKey(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean containsValue(Object obj) {
        return this.f188382a.containsValue(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable entrySet() {
        return this.f188382a.entrySet();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Object get(Object obj) {
        return this.f188382a.get(obj);
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final boolean isEmpty() {
        return this.f188382a.isEmpty();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable keySet() {
        return this.f188382a.keySet();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final int size() {
        return this.f188382a.size();
    }

    @Override // io.ably.lib.types.ReadOnlyMap
    public final Iterable values() {
        return this.f188382a.values();
    }
}
