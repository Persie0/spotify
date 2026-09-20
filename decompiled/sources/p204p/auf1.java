package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class auf1 extends rqf1 {

    /* JADX INFO: renamed from: c */
    public final transient jof1 f19928c;

    /* JADX INFO: renamed from: d */
    public final transient iuf1 f19929d;

    public auf1(jof1 jof1Var, iuf1 iuf1Var) {
        this.f19928c = jof1Var;
        this.f19929d = iuf1Var;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: a */
    public final int mo27177a(int i, Object[] objArr) {
        return this.f19929d.mo27177a(i, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f19928c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f19929d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
