package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.e7 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC1804e7 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public int f56782a;

    /* JADX INFO: renamed from: b */
    public Object f56783b;

    /* JADX INFO: renamed from: a */
    public abstract void mo37275a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f56782a;
        if (i == 0) {
            this.f56782a = 3;
            mo37275a();
            return this.f56782a == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f56782a;
        if (i == 1) {
            this.f56782a = 0;
            return this.f56783b;
        }
        if (i != 2) {
            this.f56782a = 3;
            mo37275a();
            if (this.f56782a == 1) {
                this.f56782a = 0;
                return this.f56783b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
