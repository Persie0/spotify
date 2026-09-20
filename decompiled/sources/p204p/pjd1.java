package p204p;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class pjd1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public Iterator f178229a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f178229a;
        while (it.hasNext()) {
            ikc0.m50942n(((WeakReference) it.next()).get());
            it.remove();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        return null;
    }
}
