package p204p;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: p.d8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1769d8 extends C2442u7 implements ListIterator {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1805e8 f46307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769d8(C1805e8 c1805e8) {
        super(c1805e8);
        this.f46307e = c1805e8;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C1805e8 c1805e8 = this.f46307e;
        boolean zIsEmpty = c1805e8.isEmpty();
        m35244c().add(obj);
        c1805e8.f57026f.f77372f++;
        if (zIsEmpty) {
            c1805e8.m31765a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final ListIterator m35244c() {
        m82475a();
        return (ListIterator) this.f227463b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m35244c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m35244c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m35244c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m35244c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m35244c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769d8(C1805e8 c1805e8, int i) {
        super(c1805e8, ((List) c1805e8.f35054b).listIterator(i));
        this.f46307e = c1805e8;
    }
}
