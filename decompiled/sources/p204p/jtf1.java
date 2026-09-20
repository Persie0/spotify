package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class jtf1 extends gqf1 {

    /* JADX INFO: renamed from: e */
    public static final jtf1 f115859e = new jtf1(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f115860c;

    /* JADX INFO: renamed from: d */
    public final transient int f115861d;

    public jtf1(int i, Object[] objArr) {
        this.f115860c = objArr;
        this.f115861d = i;
    }

    @Override // p204p.gqf1, p204p.jpf1
    /* JADX INFO: renamed from: a */
    public final int mo27177a(int i, Object[] objArr) {
        Object[] objArr2 = this.f115860c;
        int i2 = this.f115861d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: b */
    public final int mo30259b() {
        return this.f115861d;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: d */
    public final int mo30260d() {
        return 0;
    }

    @Override // p204p.jpf1
    /* JADX INFO: renamed from: e */
    public final Object[] mo30261e() {
        return this.f115860c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jg31.m53260F(i, this.f115861d);
        Object obj = this.f115860c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f115861d;
    }
}
