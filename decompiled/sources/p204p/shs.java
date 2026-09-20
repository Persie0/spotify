package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class shs implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209253a = 1;

    /* JADX INFO: renamed from: b */
    public final Iterator f209254b;

    /* JADX INFO: renamed from: c */
    public int f209255c;

    public shs(ek5 ek5Var) {
        this.f209254b = ((ek5) ek5Var.f60386b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f209253a) {
            case 0:
                break;
            case 1:
                return this.f209254b.hasNext();
            default:
                return this.f209255c > 0 && this.f209254b.hasNext();
        }
        while (true) {
            int i = this.f209255c;
            it = this.f209254b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f209255c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f209253a) {
            case 0:
                break;
            case 1:
                int i = this.f209255c;
                this.f209255c = i + 1;
                if (i >= 0) {
                    return new bo40(i, this.f209254b.next());
                }
                h6f.m46722S();
                throw null;
            default:
                int i2 = this.f209255c;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.f209255c = i2 - 1;
                return this.f209254b.next();
        }
        while (true) {
            int i3 = this.f209255c;
            it = this.f209254b;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f209255c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f209253a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public shs(ths thsVar, byte b) {
        this.f209255c = thsVar.f220476c;
        this.f209254b = thsVar.f220475b.iterator();
    }

    public shs(ths thsVar) {
        this.f209254b = thsVar.f220475b.iterator();
        this.f209255c = thsVar.f220476c;
    }
}
