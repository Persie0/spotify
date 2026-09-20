package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fe91 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f68722a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Iterator f68723b;

    public fe91(C2042k7 c2042k7) {
        this.f68723b = c2042k7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68723b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f68723b.next();
        Iterator it = (Iterator) sn91.f210865i.invoke(next);
        ArrayList arrayList = this.f68722a;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f68723b);
            this.f68723b = it;
            return next;
        }
        while (!this.f68723b.hasNext() && !arrayList.isEmpty()) {
            this.f68723b = (Iterator) g6f.m43687A0(arrayList);
            j6f.m52570b0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
