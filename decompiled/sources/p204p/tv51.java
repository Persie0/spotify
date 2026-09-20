package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class tv51 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224065a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f224066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f224067c;

    public tv51(plv0 plv0Var, j6f0 j6f0Var) {
        this.f224066b = plv0Var;
        this.f224067c = j6f0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f224065a) {
            case 0:
                return ((plv0) this.f224066b).f178796a <= ((j6f0) this.f224067c).f109303a.length - 1;
            default:
                return ((Iterator) this.f224066b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f224065a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                j6f0 j6f0Var = (j6f0) this.f224067c;
                plv0 plv0Var = (plv0) this.f224066b;
                int i = plv0Var.f178796a;
                s5f0 s5f0Var = j6f0Var.f109303a[i];
                plv0Var.f178796a = i + 1;
                return s5f0Var;
            default:
                return ((j691) this.f224067c).f109258b.invoke(((Iterator) this.f224066b).next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f224065a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public tv51(j691 j691Var) {
        this.f224067c = j691Var;
        this.f224066b = j691Var.f109257a.iterator();
    }
}
