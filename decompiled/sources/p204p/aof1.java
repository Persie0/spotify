package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class aof1 extends zmf1 {

    /* JADX INFO: renamed from: c */
    public final transient zgf1 f17678c;

    /* JADX INFO: renamed from: d */
    public final transient eof1 f17679d;

    public aof1(zgf1 zgf1Var, eof1 eof1Var) {
        this.f17678c = zgf1Var;
        this.f17679d = eof1Var;
    }

    @Override // p204p.jlf1
    /* JADX INFO: renamed from: a */
    public final int mo26587a(Object[] objArr) {
        return this.f17679d.mo26587a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f17678c.get(obj) != null;
    }

    @Override // p204p.zmf1, p204p.jlf1
    /* JADX INFO: renamed from: e */
    public final tlf1 mo26588e() {
        return this.f17679d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f17679d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17678c.f282633d;
    }
}
