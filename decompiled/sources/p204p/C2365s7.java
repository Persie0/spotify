package p204p;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: p.s7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2365s7 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f206242a;

    /* JADX INFO: renamed from: b */
    public Object f206243b = null;

    /* JADX INFO: renamed from: c */
    public Collection f206244c = null;

    /* JADX INFO: renamed from: d */
    public Iterator f206245d = rw50.f203263a;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC1888g8 f206246e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f206247f;

    public C2365s7(AbstractC1888g8 abstractC1888g8, int i) {
        this.f206247f = i;
        this.f206246e = abstractC1888g8;
        this.f206242a = abstractC1888g8.f77371e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f206242a.hasNext() || this.f206245d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f206245d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f206242a.next();
            this.f206243b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f206244c = collection;
            this.f206245d = collection.iterator();
        }
        Object obj = this.f206243b;
        Object next = this.f206245d.next();
        switch (this.f206247f) {
            case 0:
                return next;
            default:
                return new hf40(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f206245d.remove();
        Collection collection = this.f206244c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f206242a.remove();
        }
        this.f206246e.f77372f--;
    }
}
