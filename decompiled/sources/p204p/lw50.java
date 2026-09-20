package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class lw50 implements Iterator {

    /* JADX INFO: renamed from: a */
    public boolean f137452a = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Iterator f137453b;

    public lw50(Iterator it) {
        this.f137453b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f137453b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.f137453b.next();
        this.f137452a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        c95.m31856v(!this.f137452a, "no calls to next() since the last call to remove()");
        this.f137453b.remove();
    }
}
