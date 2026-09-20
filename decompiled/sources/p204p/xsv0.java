package p204p;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xsv0 extends pf40 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ysv0 f265682c;

    public xsv0(ysv0 ysv0Var) {
        this.f265682c = ysv0Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ysv0 ysv0Var = this.f265682c;
        c95.m31847m(i, ysv0Var.f275892g);
        Object[] objArr = ysv0Var.f275890e;
        int i2 = i * 2;
        int i3 = ysv0Var.f275891f;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: i */
    public final boolean mo1672i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f265682c.f275892g;
    }

    @Override // p204p.pf40, p204p.ef40
    public Object writeReplace() {
        return super.writeReplace();
    }
}
