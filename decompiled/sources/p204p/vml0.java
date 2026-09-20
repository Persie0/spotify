package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class vml0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242872a;

    /* JADX INFO: renamed from: b */
    public boolean f242873b = true;

    /* JADX INFO: renamed from: c */
    public final Object f242874c;

    public /* synthetic */ vml0(Object obj, int i) {
        this.f242872a = i;
        this.f242874c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f242872a) {
            case 0:
                break;
        }
        return this.f242873b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f242872a) {
            case 0:
                if (!this.f242873b) {
                    throw new NoSuchElementException();
                }
                this.f242873b = false;
                return ((wml0) this.f242874c).f252927a;
            default:
                if (!this.f242873b) {
                    throw new NoSuchElementException();
                }
                this.f242873b = false;
                return this.f242874c;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f242872a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
