package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zwg1 extends vug1 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f286981c;

    /* JADX INFO: renamed from: d */
    public final transient int f286982d;

    /* JADX INFO: renamed from: e */
    public final transient int f286983e;

    public zwg1(int i, int i2, Object[] objArr) {
        this.f286981c = objArr;
        this.f286982d = i;
        this.f286983e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bnf1.m29985u(i, this.f286983e);
        Object obj = this.f286981c[i + i + this.f286982d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f286983e;
    }
}
