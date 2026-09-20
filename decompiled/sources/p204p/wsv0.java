package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wsv0 extends pf40 {

    /* JADX INFO: renamed from: e */
    public static final wsv0 f254763e = new wsv0(0, new Object[0]);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f254764c;

    /* JADX INFO: renamed from: d */
    public final transient int f254765d;

    public wsv0(int i, Object[] objArr) {
        this.f254764c = objArr;
        this.f254765d = i;
    }

    @Override // p204p.pf40, p204p.ef40
    /* JADX INFO: renamed from: b */
    public final int mo38715b(int i, Object[] objArr) {
        Object[] objArr2 = this.f254764c;
        int i2 = this.f254765d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: d */
    public final Object[] mo38716d() {
        return this.f254764c;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: e */
    public final int mo38717e() {
        return this.f254765d;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: f */
    public final int mo38718f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c95.m31847m(i, this.f254765d);
        Object obj = this.f254764c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f254765d;
    }

    @Override // p204p.pf40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
