package p204p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class oqf implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f168281a;

    /* JADX INFO: renamed from: b */
    public int f168282b;

    /* JADX INFO: renamed from: c */
    public int f168283c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pqf f168284d;

    public oqf(pqf pqfVar) {
        this.f168284d = pqfVar;
        this.f168281a = pqfVar.f180321d;
        this.f168282b = pqfVar.isEmpty() ? -1 : 0;
        this.f168283c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f168282b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        pqf pqfVar = this.f168284d;
        if (pqfVar.f180321d != this.f168281a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f168282b;
        this.f168283c = i;
        Object obj = pqfVar.m70650e()[i];
        int i2 = this.f168282b + 1;
        if (i2 >= pqfVar.f180322e) {
            i2 = -1;
        }
        this.f168282b = i2;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        pqf pqfVar = this.f168284d;
        if (pqfVar.f180321d != this.f168281a) {
            throw new ConcurrentModificationException();
        }
        c95.m31856v(this.f168283c >= 0, "no calls to next() since the last call to remove()");
        this.f168281a += 32;
        pqfVar.remove(pqfVar.m70650e()[this.f168283c]);
        this.f168282b--;
        this.f168283c = -1;
    }
}
