package p204p;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mk30 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f144485b;

    public /* synthetic */ mk30(int i, List list) {
        this.f144484a = i;
        this.f144485b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        switch (this.f144484a) {
            case 0:
                return ((ok30) this.f144485b.get(i)).f166261a;
            case 1:
                return ((ok30) this.f144485b.get(i)).f166262b;
            default:
                fk30 fk30Var = (fk30) ((cj30) this.f144485b).f38487b.get(i);
                fk30Var.getClass();
                return fk30Var;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.f144484a) {
            case 0:
                return this.f144485b.size();
            case 1:
                return this.f144485b.size();
            default:
                return ((cj30) this.f144485b).f38487b.size();
        }
    }
}
