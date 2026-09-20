package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r591 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196001a;

    /* JADX INFO: renamed from: b */
    public final Iterator f196002b;

    public r591(Iterator it, int i) {
        this.f196001a = i;
        switch (i) {
            case 1:
                it.getClass();
                this.f196002b = it;
                break;
            default:
                it.getClass();
                this.f196002b = it;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo41890a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo29758b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f196001a) {
            case 0:
                break;
        }
        return this.f196002b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f196001a) {
            case 0:
                return mo41890a(this.f196002b.next());
            default:
                return mo29758b(this.f196002b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f196001a) {
            case 0:
                this.f196002b.remove();
                break;
            default:
                this.f196002b.remove();
                break;
        }
    }
}
