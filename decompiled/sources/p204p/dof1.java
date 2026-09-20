package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class dof1 extends rkf1 {

    /* JADX INFO: renamed from: h */
    public final transient jof1 f51036h;

    /* JADX INFO: renamed from: i */
    public final transient hof1 f51037i;

    public dof1(jof1 jof1Var, hof1 hof1Var) {
        super(3);
        this.f51036h = jof1Var;
        this.f51037i = hof1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f51036h.get(obj) != null;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        return this.f51037i.mo35478f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f51037i.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
