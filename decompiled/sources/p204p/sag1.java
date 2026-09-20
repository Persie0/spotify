package p204p;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class sag1 extends o3a1 implements ListIterator {

    /* JADX INFO: renamed from: b */
    public final int f207209b;

    /* JADX INFO: renamed from: c */
    public int f207210c;

    /* JADX INFO: renamed from: d */
    public final yag1 f207211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sag1(yag1 yag1Var, int i) {
        super(2);
        int size = yag1Var.size();
        fjf1.m41813J(i, size);
        this.f207209b = size;
        this.f207210c = i;
        this.f207211d = yag1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m77628a(int i) {
        return this.f207211d.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f207210c < this.f207209b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f207210c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f207210c;
        this.f207210c = i + 1;
        return m77628a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f207210c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f207210c - 1;
        this.f207210c = i;
        return m77628a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f207210c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
