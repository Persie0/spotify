package p204p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class srn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f213363a = 0;

    /* JADX INFO: renamed from: b */
    public int f213364b;

    /* JADX INFO: renamed from: c */
    public Object f213365c;

    /* JADX INFO: renamed from: d */
    public final Object f213366d;

    public srn0(Object obj, Map map) {
        this.f213365c = obj;
        this.f213366d = map;
    }

    /* JADX INFO: renamed from: a */
    public void m79121a() {
        Iterator it = (Iterator) this.f213365c;
        while (this.f213364b < ((hr51) this.f213366d).f94367b && it.hasNext()) {
            it.next();
            this.f213364b++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f213363a) {
            case 0:
                return this.f213364b < ((Map) this.f213366d).size();
            default:
                m79121a();
                return this.f213364b < ((hr51) this.f213366d).f94368c && ((Iterator) this.f213365c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f213363a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f213365c;
                this.f213364b++;
                Object obj2 = ((Map) this.f213366d).get(obj);
                if (obj2 != null) {
                    this.f213365c = ((yn80) obj2).m94225a();
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            default:
                m79121a();
                if (this.f213364b >= ((hr51) this.f213366d).f94368c) {
                    throw new NoSuchElementException();
                }
                this.f213364b++;
                return ((Iterator) this.f213365c).next();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f213363a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public srn0(hr51 hr51Var) {
        this.f213366d = hr51Var;
        this.f213365c = hr51Var.f94366a.iterator();
    }
}
