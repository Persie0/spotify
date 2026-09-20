package p204p;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public class nrn0 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157586a;

    /* JADX INFO: renamed from: b */
    public Object f157587b;

    /* JADX INFO: renamed from: c */
    public final Map f157588c;

    /* JADX INFO: renamed from: d */
    public int f157589d;

    public /* synthetic */ nrn0(Object obj, Map map, int i) {
        this.f157586a = i;
        this.f157587b = obj;
        this.f157588c = map;
    }

    /* JADX INFO: renamed from: a */
    public Object m65484a() {
        return this.f157587b;
    }

    /* JADX INFO: renamed from: b */
    public tn80 m65485b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f157588c.get(this.f157587b);
        if (obj == null) {
            throw new ConcurrentModificationException(edb.m38568q(new StringBuilder("Hash code of a key ("), this.f157587b, ") has changed after it was added to the persistent map."));
        }
        tn80 tn80Var = (tn80) obj;
        this.f157589d++;
        this.f157587b = tn80Var.f221906c;
        return tn80Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f157586a) {
            case 0:
                return this.f157589d < this.f157588c.size();
            default:
                return this.f157589d < this.f157588c.size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f157586a) {
            case 0:
                return m65485b();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f157587b;
                this.f157589d++;
                Object obj2 = this.f157588c.get(obj);
                if (obj2 != null) {
                    this.f157587b = ((zn80) obj2).f284434b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f157586a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
