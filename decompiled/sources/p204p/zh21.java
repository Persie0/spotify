package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zh21 extends hg40 {

    /* JADX INFO: renamed from: d */
    public final transient Object f282787d;

    public zh21(Object obj) {
        obj.getClass();
        this.f282787d = obj;
    }

    @Override // p204p.hg40, p204p.ef40
    /* JADX INFO: renamed from: a */
    public final pf40 mo38714a() {
        return pf40.m69794t(this.f282787d);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        objArr[i] = this.f282787d;
        return i + 1;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f282787d.equals(obj);
    }

    @Override // p204p.hg40, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f282787d.hashCode();
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return false;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return qhg1.m72834y(this.f282787d);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 mo38719j() {
        return qhg1.m72834y(this.f282787d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f282787d.toString() + ']';
    }

    @Override // p204p.hg40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
