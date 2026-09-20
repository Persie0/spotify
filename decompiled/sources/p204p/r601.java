package p204p;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r601 extends AbstractSet {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196155a;

    public /* synthetic */ r601(int i) {
        this.f196155a = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f196155a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.f196155a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f196155a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f196155a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f196155a) {
            case 0:
                return gmg1.m45238B(this, collection);
            case 1:
                throw new UnsupportedOperationException();
            default:
                return qfc1.m72708r(this, collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.f196155a) {
            case 0:
                collection.getClass();
                return super.retainAll(collection);
            case 1:
                throw new UnsupportedOperationException();
            default:
                collection.getClass();
                return super.retainAll(collection);
        }
    }
}
