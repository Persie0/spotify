package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class wml0 extends tj5 {

    /* JADX INFO: renamed from: a */
    public final o25 f252927a;

    /* JADX INFO: renamed from: b */
    public final int f252928b;

    public wml0(int i, o25 o25Var) {
        this.f252927a = o25Var;
        this.f252928b = i;
    }

    @Override // p204p.tj5
    /* JADX INFO: renamed from: a */
    public final int mo80970a() {
        return 1;
    }

    @Override // p204p.tj5
    /* JADX INFO: renamed from: b */
    public final void mo80971b(int i, o25 o25Var) {
        throw new IllegalStateException();
    }

    @Override // p204p.tj5
    public final Object get(int i) {
        if (i == this.f252928b) {
            return this.f252927a;
        }
        return null;
    }

    @Override // p204p.tj5, java.lang.Iterable
    public final Iterator iterator() {
        return new vml0(this, 0);
    }
}
