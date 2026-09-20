package p204p;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class nj5 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj5 f154440a;

    public nj5(uj5 uj5Var) {
        this.f154440a = uj5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qj5(this.f154440a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f154440a.f13976c;
    }
}
