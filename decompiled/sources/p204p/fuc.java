package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class fuc implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final int f73465a;

    /* JADX INFO: renamed from: b */
    public final int f73466b;

    /* JADX INFO: renamed from: c */
    public boolean f73467c;

    /* JADX INFO: renamed from: d */
    public int f73468d;

    public fuc(char c, char c2, int i) {
        this.f73465a = i;
        this.f73466b = c2;
        boolean z = false;
        if (i <= 0 ? wj50.m88282u(c, c2) >= 0 : wj50.m88282u(c, c2) <= 0) {
            z = true;
        }
        this.f73467c = z;
        this.f73468d = z ? c : c2;
    }

    /* JADX INFO: renamed from: a */
    public final char m42728a() {
        int i = this.f73468d;
        if (i != this.f73466b) {
            this.f73468d = this.f73465a + i;
        } else {
            if (!this.f73467c) {
                throw new NoSuchElementException();
            }
            this.f73467c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f73467c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(m42728a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
