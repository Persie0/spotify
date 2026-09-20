package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class s2b0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final long f204956a;

    /* JADX INFO: renamed from: b */
    public final long f204957b;

    /* JADX INFO: renamed from: c */
    public boolean f204958c;

    /* JADX INFO: renamed from: d */
    public long f204959d;

    public s2b0(long j, long j2, long j3) {
        this.f204956a = j3;
        this.f204957b = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f204958c = z;
        this.f204959d = z ? j : j2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f204958c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f204959d;
        if (j != this.f204957b) {
            this.f204959d = this.f204956a + j;
        } else {
            if (!this.f204958c) {
                throw new NoSuchElementException();
            }
            this.f204958c = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
