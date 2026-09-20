package p204p;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class p3a1 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173598a;

    /* JADX INFO: renamed from: b */
    public ListIterator f173599b;

    public /* synthetic */ p3a1(int i) {
        this.f173598a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f173598a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f173599b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f173599b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return (String) this.f173599b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f173599b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return (String) this.f173599b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f173598a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f173599b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f173598a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f173598a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public p3a1(hyf1 hyf1Var, int i) {
        this.f173598a = 4;
        this.f173599b = hyf1Var.f96581a.listIterator(i);
    }
}
