package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zef1 extends daf1 {

    /* JADX INFO: renamed from: t */
    public static final zef1 f282030t = new zef1(0, new Object[0]);

    /* JADX INFO: renamed from: h */
    public final transient Object[] f282031h;

    /* JADX INFO: renamed from: i */
    public final transient int f282032i;

    public zef1(int i, Object[] objArr) {
        super(1);
        this.f282031h = objArr;
        this.f282032i = i;
    }

    @Override // p204p.daf1, p204p.h0f1
    /* JADX INFO: renamed from: f */
    public final int mo35478f(Object[] objArr) {
        Object[] objArr2 = this.f282031h;
        int i = this.f282032i;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        quf1.m73927s(i, this.f282032i);
        Object obj = this.f282031h[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: i */
    public final int mo46354i() {
        return this.f282032i;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: l */
    public final int mo28834l() {
        return 0;
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: n */
    public final Object[] mo46355n() {
        return this.f282031h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f282032i;
    }
}
