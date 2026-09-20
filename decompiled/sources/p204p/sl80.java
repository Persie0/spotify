package p204p;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class sl80 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public String f210317a;

    /* JADX INFO: renamed from: b */
    public boolean f210318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tl80 f210319c;

    public sl80(tl80 tl80Var) {
        this.f210319c = tl80Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f210317a == null && !this.f210318b) {
            String line = this.f210319c.f221387a.readLine();
            this.f210317a = line;
            if (line == null) {
                this.f210318b = true;
            }
        }
        return this.f210317a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f210317a;
        this.f210317a = null;
        wj50.m88279p(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
