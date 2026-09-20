package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class mnf1 extends tlf1 {

    /* JADX INFO: renamed from: e */
    public static final mnf1 f145422e = new mnf1(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f145423c;

    /* JADX INFO: renamed from: d */
    public final transient int f145424d;

    public mnf1(int i, Object[] objArr) {
        this.f145423c = objArr;
        this.f145424d = i;
    }

    @Override // p204p.tlf1, p204p.jlf1
    /* JADX INFO: renamed from: a */
    public final int mo26587a(Object[] objArr) {
        Object[] objArr2 = this.f145423c;
        int i = this.f145424d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: b */
    public final int mo53679b() {
        return this.f145424d;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: d */
    public final int mo53680d() {
        return 0;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: f */
    public final boolean mo39568f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        p271.m68894D(i, this.f145424d);
        Object obj = this.f145423c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: i */
    public final Object[] mo53681i() {
        return this.f145423c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f145424d;
    }
}
