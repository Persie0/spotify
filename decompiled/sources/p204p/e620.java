package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e620 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final ou21 f56523a;

    /* JADX INFO: renamed from: b */
    public final int f56524b;

    /* JADX INFO: renamed from: c */
    public int f56525c;

    /* JADX INFO: renamed from: d */
    public final int f56526d;

    public e620(ou21 ou21Var, int i, int i2) {
        this.f56523a = ou21Var;
        this.f56524b = i2;
        this.f56525c = i;
        this.f56526d = ou21Var.f170153h;
        if (ou21Var.f170152g) {
            qu21.m73872f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56525c < this.f56524b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ou21 ou21Var = this.f56523a;
        int i = ou21Var.f170153h;
        int i2 = this.f56526d;
        if (i != i2) {
            qu21.m73872f();
        }
        int i3 = this.f56525c;
        this.f56525c = ou21Var.f170146a[(i3 * 5) + 3] + i3;
        return new pu21(ou21Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
