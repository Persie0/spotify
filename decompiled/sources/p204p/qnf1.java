package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qnf1 extends dkf1 {

    /* JADX INFO: renamed from: t */
    public static final qnf1 f190576t = new qnf1(0, new Object[0]);

    /* JADX INFO: renamed from: h */
    public final transient Object[] f190577h;

    /* JADX INFO: renamed from: i */
    public final transient int f190578i;

    public qnf1(int i, Object[] objArr) {
        super(3);
        this.f190577h = objArr;
        this.f190578i = i;
    }

    @Override // p204p.dkf1, p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        Object[] objArr2 = this.f190577h;
        int i = this.f190578i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        gxf1.m46088r(i, this.f190578i);
        Object obj = this.f190577h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: i */
    public final int mo46354i() {
        return this.f190578i;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: l */
    public final int mo28834l() {
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: n */
    public final Object[] mo46355n() {
        return this.f190577h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f190578i;
    }
}
