package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class gdg1 extends jbg1 {

    /* JADX INFO: renamed from: h */
    public final transient Object f78846h;

    public gdg1(Object obj) {
        super(4);
        this.f78846h = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f78846h.equals(obj);
    }

    @Override // p204p.jbg1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f78846h.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new xbg1(this.f78846h);
    }

    @Override // p204p.h0f1
    /* JADX INFO: renamed from: o */
    public final int mo28836o(Object[] objArr) {
        objArr[0] = this.f78846h;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f78846h.toString();
        return dq60.m36618r(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
    }
}
