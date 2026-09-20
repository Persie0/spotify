package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class xbg1 extends o3a1 {

    /* JADX INFO: renamed from: b */
    public final Object f259911b;

    /* JADX INFO: renamed from: c */
    public boolean f259912c;

    public xbg1(Object obj) {
        super(2);
        this.f259911b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f259912c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f259912c) {
            throw new NoSuchElementException();
        }
        this.f259912c = true;
        return this.f259911b;
    }
}
