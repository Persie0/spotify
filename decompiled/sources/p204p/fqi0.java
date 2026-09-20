package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fqi0 implements cr60, Set, pq60 {

    /* JADX INFO: renamed from: a */
    public final dqi0 f72224a;

    /* JADX INFO: renamed from: b */
    public final dqi0 f72225b;

    public fqi0(dqi0 dqi0Var) {
        this.f72224a = dqi0Var;
        this.f72225b = dqi0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f72225b.m36642a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        dqi0 dqi0Var = this.f72225b;
        int i = dqi0Var.f52021d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dqi0Var.m36651j(it.next());
        }
        return i != dqi0Var.f52021d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f72225b.m36643b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f72224a.m36644c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f72224a.m36644c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fqi0.class != obj.getClass()) {
            return false;
        }
        return wj50.m88271j(this.f72224a, ((fqi0) obj).f72224a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f72224a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f72224a.m36648g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new j310(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f72225b.m36653l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        dqi0 dqi0Var = this.f72225b;
        int i = dqi0Var.f52021d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dqi0Var.m36650i(it.next());
        }
        return i != dqi0Var.f52021d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0011->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053 A[EDGE_INSN: B:24:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0011->B:17:0x0050], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        dqi0 dqi0Var = this.f72225b;
        Object[] objArr = dqi0Var.f52019b;
        int i = dqi0Var.f52021d;
        long[] jArr = dqi0Var.f52018a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!g6f.m43725i0(collection, objArr[i5])) {
                                dqi0Var.m36654m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != dqi0Var.f52021d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f72224a.f52021d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    public final String toString() {
        return this.f72224a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
