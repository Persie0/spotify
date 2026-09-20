package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ugf1 extends daf1 {

    /* JADX INFO: renamed from: h */
    public final transient Object[] f230162h;

    /* JADX INFO: renamed from: i */
    public final transient int f230163i;

    /* JADX INFO: renamed from: t */
    public final transient int f230164t;

    public ugf1(int i, int i2, Object[] objArr) {
        super(1);
        this.f230162h = objArr;
        this.f230163i = i;
        this.f230164t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        quf1.m73927s(i, this.f230164t);
        Object obj = this.f230162h[i + i + this.f230163i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f230164t;
    }
}
