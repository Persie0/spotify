package p204p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class vs30 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ys30 f244333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f244334b;

    public vs30(ys30 ys30Var, List list) {
        this.f244333a = ys30Var;
        this.f244334b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f244333a.mo25398c((fk30) this.f244334b.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f244334b.size();
    }
}
