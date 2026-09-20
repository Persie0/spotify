package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class vsz0 implements Iterator, fbk, pq60 {

    /* JADX INFO: renamed from: a */
    public int f244514a;

    /* JADX INFO: renamed from: b */
    public Object f244515b;

    /* JADX INFO: renamed from: c */
    public Iterator f244516c;

    /* JADX INFO: renamed from: d */
    public fbk f244517d;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m86366a() {
        int i = this.f244514a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f244514a);
    }

    /* JADX INFO: renamed from: b */
    public final void m86367b(Object obj, fbk fbkVar) {
        this.f244515b = obj;
        this.f244514a = 3;
        this.f244517d = fbkVar;
    }

    @Override // p204p.fbk
    public final juk getContext() {
        return dau.f47107a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f244514a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m86366a();
                }
                Iterator it = this.f244516c;
                wj50.m88279p(it);
                if (it.hasNext()) {
                    this.f244514a = 2;
                    return true;
                }
                this.f244516c = null;
            }
            this.f244514a = 5;
            fbk fbkVar = this.f244517d;
            wj50.m88279p(fbkVar);
            this.f244517d = null;
            fbkVar.resumeWith(w2a1.f247311a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f244514a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f244514a = 1;
            Iterator it = this.f244516c;
            wj50.m88279p(it);
            return it.next();
        }
        if (i != 3) {
            throw m86366a();
        }
        this.f244514a = 0;
        Object obj = this.f244515b;
        this.f244515b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p204p.fbk
    public final void resumeWith(Object obj) {
        bga.m29073P(obj);
        this.f244514a = 4;
    }
}
