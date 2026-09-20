package p204p;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class gpi0 implements ListIterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83202a;

    /* JADX INFO: renamed from: b */
    public final Object f83203b;

    /* JADX INFO: renamed from: c */
    public int f83204c;

    public gpi0(l5u0 l5u0Var) {
        this.f83202a = 2;
        this.f83203b = l5u0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f83202a) {
            case 0:
                int i = this.f83204c + 1;
                this.f83204c = i;
                this.f83203b.add(i, obj);
                return;
            case 1:
                this.f83203b.add(this.f83204c, obj);
                this.f83204c++;
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f83202a) {
            case 0:
                return this.f83204c < this.f83203b.size() - 1;
            case 1:
                return this.f83204c < this.f83203b.size();
            default:
                return this.f83204c < ((l5u0) this.f83203b).f130009a.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f83202a) {
            case 0:
                return this.f83204c >= 0;
            case 1:
                return this.f83204c > 0;
            default:
                throw m5u0.f140290a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f83202a) {
            case 0:
                int i = this.f83204c + 1;
                this.f83204c = i;
                return this.f83203b.get(i);
            case 1:
                int i2 = this.f83204c;
                this.f83204c = i2 + 1;
                return this.f83203b.get(i2);
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                l5u0 l5u0Var = (l5u0) this.f83203b;
                int i3 = this.f83204c;
                this.f83204c = i3 + 1;
                return l5u0Var.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f83202a) {
            case 0:
                return this.f83204c + 1;
            case 1:
                return this.f83204c;
            default:
                throw m5u0.f140290a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f83202a) {
            case 0:
                int i = this.f83204c;
                this.f83204c = i - 1;
                return this.f83203b.get(i);
            case 1:
                int i2 = this.f83204c - 1;
                this.f83204c = i2;
                return this.f83203b.get(i2);
            default:
                throw m5u0.f140290a;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f83202a) {
            case 0:
                return this.f83204c;
            case 1:
                return this.f83204c - 1;
            default:
                throw m5u0.f140290a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f83202a) {
            case 0:
                this.f83203b.remove(this.f83204c);
                this.f83204c--;
                return;
            case 1:
                int i = this.f83204c - 1;
                this.f83204c = i;
                this.f83203b.remove(i);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f83202a) {
            case 0:
                this.f83203b.set(this.f83204c, obj);
                return;
            case 1:
                this.f83203b.set(this.f83204c, obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public gpi0(int i, int i2, List list) {
        this.f83202a = i2;
        switch (i2) {
            case 1:
                this.f83203b = list;
                this.f83204c = i;
                break;
            default:
                this.f83203b = list;
                this.f83204c = i - 1;
                break;
        }
    }
}
