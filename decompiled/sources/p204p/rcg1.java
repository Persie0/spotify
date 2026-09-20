package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class rcg1 extends jbg1 {

    /* JADX INFO: renamed from: h */
    public final transient zgf1 f197864h;

    /* JADX INFO: renamed from: i */
    public final transient vcg1 f197865i;

    public rcg1(zgf1 zgf1Var, vcg1 vcg1Var) {
        super(4);
        this.f197864h = zgf1Var;
        this.f197865i = vcg1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f197864h.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f197865i.listIterator(0);
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: o */
    public final int mo28836o(Object[] objArr) {
        return this.f197865i.mo28836o(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f197864h.f282633d;
    }
}
