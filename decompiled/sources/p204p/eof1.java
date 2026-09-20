package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class eof1 extends tlf1 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f61419c;

    /* JADX INFO: renamed from: d */
    public final transient int f61420d;

    /* JADX INFO: renamed from: e */
    public final transient int f61421e;

    public eof1(int i, int i2, Object[] objArr) {
        this.f61419c = objArr;
        this.f61420d = i;
        this.f61421e = i2;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: f */
    public final boolean mo39568f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p271.m68894D(i, this.f61421e);
        Object obj = this.f61419c[i + i + this.f61420d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f61421e;
    }
}
