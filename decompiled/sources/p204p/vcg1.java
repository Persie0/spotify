package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class vcg1 extends yag1 {

    /* JADX INFO: renamed from: h */
    public final transient Object[] f240128h;

    /* JADX INFO: renamed from: i */
    public final transient int f240129i;

    /* JADX INFO: renamed from: t */
    public final transient int f240130t;

    public vcg1(int i, int i2, Object[] objArr) {
        super(4);
        this.f240128h = objArr;
        this.f240129i = i;
        this.f240130t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fjf1.m41812I(i, this.f240130t);
        Object obj = this.f240128h[i + i + this.f240129i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f240130t;
    }
}
