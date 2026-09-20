package p204p;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class mf40 extends pf40 {

    /* JADX INFO: renamed from: c */
    public final transient int f142951c;

    /* JADX INFO: renamed from: d */
    public final transient int f142952d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ pf40 f142953e;

    public mf40(pf40 pf40Var, int i, int i2) {
        this.f142953e = pf40Var;
        this.f142951c = i;
        this.f142952d = i2;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: d */
    public final Object[] mo38716d() {
        return this.f142953e.mo38716d();
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: e */
    public final int mo38717e() {
        return this.f142953e.mo38718f() + this.f142951c + this.f142952d;
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: f */
    public final int mo38718f() {
        return this.f142953e.mo38718f() + this.f142951c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c95.m31847m(i, this.f142952d);
        return this.f142953e.get(i + this.f142951c);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // p204p.pf40, p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p204p.pf40, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f142952d;
    }

    @Override // p204p.pf40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // p204p.pf40, java.util.List
    /* JADX INFO: renamed from: x */
    public final pf40 subList(int i, int i2) {
        c95.m31852r(i, i2, this.f142952d);
        int i3 = this.f142951c;
        return this.f142953e.subList(i + i3, i2 + i3);
    }

    @Override // p204p.pf40, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
