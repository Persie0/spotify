package p204p;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class qpi0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f191326a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f191327b;

    public qpi0(LinkedHashMap linkedHashMap, boolean z) {
        this.f191326a = linkedHashMap;
        this.f191327b = new AtomicBoolean(z);
    }

    /* JADX INFO: renamed from: a */
    public final void m73446a(sgq0 sgq0Var, Object obj) {
        AtomicBoolean atomicBoolean = this.f191327b;
        if (atomicBoolean.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        LinkedHashMap linkedHashMap = this.f191326a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            linkedHashMap.remove(sgq0Var);
        } else if (obj instanceof Set) {
            linkedHashMap.put(sgq0Var, Collections.unmodifiableSet(g6f.m43736n1((Iterable) obj)));
        } else {
            linkedHashMap.put(sgq0Var, obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public final qpi0 m73447b() {
        return new qpi0(kkc0.m56709v0(Collections.unmodifiableMap(this.f191326a)), false);
    }

    /* JADX INFO: renamed from: c */
    public final qpi0 m73448c() {
        return new qpi0(kkc0.m56709v0(Collections.unmodifiableMap(this.f191326a)), true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qpi0)) {
            return false;
        }
        return wj50.m88271j(this.f191326a, ((qpi0) obj).f191326a);
    }

    public final int hashCode() {
        return this.f191326a.hashCode();
    }

    public final String toString() {
        return g6f.m43753y0(this.f191326a.entrySet(), ",\n", "{\n", "\n}", pni0.f179412f, 24);
    }

    public /* synthetic */ qpi0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
