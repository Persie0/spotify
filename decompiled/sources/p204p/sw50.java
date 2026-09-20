package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class sw50 extends o3a1 {

    /* JADX INFO: renamed from: b */
    public final Object f214586b;

    /* JADX INFO: renamed from: c */
    public boolean f214587c;

    public sw50(Object obj) {
        super(0);
        this.f214586b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f214587c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f214587c) {
            throw new NoSuchElementException();
        }
        this.f214587c = true;
        return this.f214586b;
    }
}
