package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class iuf1 extends gqf1 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f105961c;

    /* JADX INFO: renamed from: d */
    public final transient int f105962d;

    /* JADX INFO: renamed from: e */
    public final transient int f105963e = 1;

    public iuf1(int i, Object[] objArr) {
        this.f105961c = objArr;
        this.f105962d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jg31.m53260F(i, this.f105963e);
        Object obj = this.f105961c[i + i + this.f105962d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f105963e;
    }
}
