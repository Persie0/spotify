package p204p;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class evg1 extends o0f1 {

    /* JADX INFO: renamed from: b */
    public final rug1 f63266b;

    /* JADX INFO: renamed from: c */
    public Object f63267c;

    /* JADX INFO: renamed from: d */
    public o0f1 f63268d;

    public evg1(bwg1 bwg1Var) {
        super(false);
        Objects.requireNonNull(bwg1Var);
        this.f63266b = bwg1Var.f31654a.entrySet().m81610l().listIterator(0);
        this.f63267c = null;
        this.f63268d = ewg1.f63547e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f63268d.hasNext() || this.f63266b.hasNext();
    }

    @Override // p204p.o0f1, java.util.Iterator, java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f63268d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f63266b.next();
            this.f63267c = entry.getKey();
            this.f63268d = ((oug1) entry.getValue()).mo43014a();
        }
        Object obj = this.f63267c;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.f63268d.next());
    }
}
