package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class xwg1 extends tvg1 {

    /* JADX INFO: renamed from: d */
    public final transient cxg1 f266683d;

    /* JADX INFO: renamed from: e */
    public final transient zwg1 f266684e;

    public xwg1(cxg1 cxg1Var, zwg1 zwg1Var) {
        this.f266683d = cxg1Var;
        this.f266684e = zwg1Var;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: a */
    public final o0f1 mo43014a() {
        return this.f266684e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f266683d.get(obj) != null;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: f */
    public final boolean mo43018f() {
        return true;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: i */
    public final int mo43019i(Object[] objArr) {
        return this.f266684e.mo43019i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f266684e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f266683d.f43037f;
    }
}
