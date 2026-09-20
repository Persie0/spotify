package p204p;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class vdx extends s400 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f240521a = new ArrayDeque(10);

    /* JADX INFO: renamed from: b */
    public final int f240522b = 10;

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        obj.getClass();
        int i = this.f240522b;
        if (i == 0) {
            return true;
        }
        int size = size();
        ArrayDeque arrayDeque = this.f240521a;
        if (size == i) {
            arrayDeque.remove();
        }
        arrayDeque.add(obj);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        int i = this.f240522b;
        if (size < i) {
            return qhg1.m72827r(this, collection.iterator());
        }
        clear();
        return nhg1.m64491k(nhg1.m64503w(size - i, collection), this);
    }

    @Override // p204p.q400
    public final Object delegate() {
        return this.f240521a;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
