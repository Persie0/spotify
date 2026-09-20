package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class lec0 extends s2v implements Iterator, pq60 {
    @Override // java.util.Iterator
    public final Object next() {
        m77098b();
        if (m77102f() >= m77104h().f142672f) {
            throw new NoSuchElementException();
        }
        int iM77102f = m77102f();
        m77107k(iM77102f + 1);
        m77108l(iM77102f);
        Object obj = m77104h().f142667a[m77103g()];
        m77105i();
        return obj;
    }
}
