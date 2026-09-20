package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class un40 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public int f232060a;

    /* JADX INFO: renamed from: b */
    public int f232061b;

    /* JADX INFO: renamed from: c */
    public boolean f232062c;

    public un40(int i) {
        this.f232060a = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo67087a(int i);

    /* JADX INFO: renamed from: b */
    public abstract void mo67088b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f232061b < this.f232060a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo67087a = mo67087a(this.f232061b);
        this.f232061b++;
        this.f232062c = true;
        return objMo67087a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f232062c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f232061b - 1;
        this.f232061b = i;
        mo67088b(i);
        this.f232060a--;
        this.f232062c = false;
    }
}
