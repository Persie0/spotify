package p204p;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wj90 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251914a = 0;

    /* JADX INFO: renamed from: b */
    public final List f251915b;

    /* JADX INFO: renamed from: c */
    public final Object f251916c;

    public wj90(List list, s4h1 s4h1Var) {
        list.getClass();
        this.f251915b = list;
        this.f251916c = s4h1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        switch (this.f251914a) {
            case 0:
                break;
        }
        return this.f251915b.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f251914a) {
            case 0:
                return new uj90(this, this.f251915b.listIterator(i), 1);
            default:
                return new blf1(this, this.f251915b.listIterator(i), 1);
        }
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        switch (this.f251914a) {
            case 0:
                this.f251915b.subList(i, i2).clear();
                break;
            default:
                this.f251915b.subList(i, i2).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f251914a) {
            case 0:
                break;
        }
        return this.f251915b.size();
    }

    public wj90(List list, qh00 qh00Var) {
        list.getClass();
        this.f251915b = list;
        this.f251916c = qh00Var;
    }
}
