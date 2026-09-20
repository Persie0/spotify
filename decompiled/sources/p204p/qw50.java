package p204p;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class qw50 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f193173a;

    /* JADX INFO: renamed from: b */
    public Iterator f193174b;

    /* JADX INFO: renamed from: c */
    public Iterator f193175c;

    /* JADX INFO: renamed from: d */
    public ArrayDeque f193176d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.f193174b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.f193175c;
                if (it3 != null && it3.hasNext()) {
                    it = this.f193175c;
                    break;
                }
                ArrayDeque arrayDeque = this.f193176d;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    it = null;
                    break;
                }
                this.f193175c = (Iterator) this.f193176d.removeFirst();
            }
            this.f193175c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.f193174b = it4;
            if (it4 instanceof qw50) {
                qw50 qw50Var = (qw50) it4;
                this.f193174b = qw50Var.f193174b;
                if (this.f193176d == null) {
                    this.f193176d = new ArrayDeque();
                }
                this.f193176d.addFirst(this.f193175c);
                if (qw50Var.f193176d != null) {
                    while (!qw50Var.f193176d.isEmpty()) {
                        this.f193176d.addFirst((Iterator) qw50Var.f193176d.removeLast());
                    }
                }
                this.f193175c = qw50Var.f193175c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.f193174b;
        this.f193173a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f193173a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.f193173a = null;
    }
}
