package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kxg1 extends tvg1 {

    /* JADX INFO: renamed from: d */
    public final transient Object f127491d;

    public kxg1(Object obj) {
        this.f127491d = obj;
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: a */
    public final o0f1 mo43014a() {
        return new hwg1(this.f127491d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f127491d.equals(obj);
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: f */
    public final boolean mo43018f() {
        return false;
    }

    @Override // p204p.tvg1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f127491d.hashCode();
    }

    @Override // p204p.oug1
    /* JADX INFO: renamed from: i */
    public final int mo43019i(Object[] objArr) {
        objArr[0] = this.f127491d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new hwg1(this.f127491d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f127491d.toString();
        return dq60.m36618r(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
