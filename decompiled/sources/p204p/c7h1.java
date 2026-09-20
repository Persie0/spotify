package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class c7h1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f34901a;

    /* JADX INFO: renamed from: b */
    public final Iterator f34902b;

    public /* synthetic */ c7h1(Iterator it, Iterator it2) {
        this.f34901a = it;
        this.f34902b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34901a.hasNext() || this.f34902b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f34901a;
        return it.hasNext() ? it.next() : this.f34902b.next();
    }
}
