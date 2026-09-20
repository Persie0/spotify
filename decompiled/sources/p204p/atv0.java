package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class atv0 extends pf40 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f19750c;

    /* JADX INFO: renamed from: d */
    public final transient int f19751d;

    /* JADX INFO: renamed from: e */
    public final transient int f19752e;

    public atv0(int i, int i2, Object[] objArr) {
        this.f19750c = objArr;
        this.f19751d = i;
        this.f19752e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c95.m31847m(i, this.f19752e);
        Object obj = this.f19750c[(i * 2) + this.f19751d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19752e;
    }

    @Override // p204p.pf40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
