package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class z6z implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final Iterator f280027a;

    /* JADX INFO: renamed from: b */
    public int f280028b = -1;

    /* JADX INFO: renamed from: c */
    public Object f280029c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ a7z f280030d;

    public z6z(a7z a7zVar) {
        this.f280030d = a7zVar;
        this.f280027a = a7zVar.f13149a.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m95521a() {
        Object next;
        a7z a7zVar;
        do {
            Iterator it = this.f280027a;
            if (!it.hasNext()) {
                this.f280028b = 0;
                return;
            } else {
                next = it.next();
                a7zVar = this.f280030d;
            }
        } while (((Boolean) a7zVar.f13151c.invoke(next)).booleanValue() != a7zVar.f13150b);
        this.f280029c = next;
        this.f280028b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f280028b == -1) {
            m95521a();
        }
        return this.f280028b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f280028b == -1) {
            m95521a();
        }
        if (this.f280028b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f280029c;
        this.f280029c = null;
        this.f280028b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
