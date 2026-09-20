package p204p;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class f6f extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final Collection f66392a;

    /* JADX INFO: renamed from: b */
    public final qh00 f66393b;

    public f6f(Collection collection, qh00 qh00Var) {
        collection.getClass();
        this.f66392a = collection;
        this.f66393b = qh00Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f66392a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f66392a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f66392a.iterator();
        qh00 qh00Var = this.f66393b;
        qh00Var.getClass();
        return new ow50(it, qh00Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f66392a.size();
    }
}
