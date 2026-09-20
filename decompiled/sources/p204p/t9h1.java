package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class t9h1 extends m0h1 {

    /* JADX INFO: renamed from: c */
    public final transient jof1 f218301c;

    /* JADX INFO: renamed from: d */
    public final transient dbh1 f218302d;

    public t9h1(jof1 jof1Var, dbh1 dbh1Var) {
        this.f218301c = jof1Var;
        this.f218302d = dbh1Var;
    }

    @Override // p204p.dlg1
    /* JADX INFO: renamed from: a */
    public final int mo36358a(Object[] objArr) {
        return this.f218302d.mo36358a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f218301c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f218302d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f218301c.getClass();
        return 1;
    }
}
