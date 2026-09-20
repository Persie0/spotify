package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class tva implements Iterator {

    /* JADX INFO: renamed from: a */
    public uva f224102a;

    /* JADX INFO: renamed from: b */
    public int f224103b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f224103b < this.f224102a.f181673e.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        rva rvaVar = (rva) this.f224102a.f181673e.get(this.f224103b);
        this.f224103b++;
        return rvaVar;
    }
}
