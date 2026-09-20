package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lrn0 extends AbstractC2285q9 implements ig40 {

    /* JADX INFO: renamed from: a */
    public final grn0 f136342a;

    public lrn0(grn0 grn0Var) {
        this.f136342a = grn0Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f136342a.mo36659c();
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f136342a.f83800c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new mrn0(this.f136342a);
    }
}
