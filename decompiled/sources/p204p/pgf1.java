package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class pgf1 extends adf1 {

    /* JADX INFO: renamed from: h */
    public final transient zgf1 f177299h;

    /* JADX INFO: renamed from: i */
    public final transient ugf1 f177300i;

    public pgf1(zgf1 zgf1Var, ugf1 ugf1Var) {
        super(1);
        this.f177299h = zgf1Var;
        this.f177300i = ugf1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f177299h.get(obj) != null;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        return this.f177300i.mo35478f(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f177300i.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f177299h.f282633d;
    }
}
