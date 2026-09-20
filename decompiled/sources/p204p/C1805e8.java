package p204p;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p.e8 */
/* JADX INFO: loaded from: classes4.dex */
public class C1805e8 extends AbstractC1732c8 implements List {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1888g8 f57026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1805e8(AbstractC1888g8 abstractC1888g8, Object obj, List list, AbstractC1732c8 abstractC1732c8) {
        super(abstractC1888g8, obj, list, abstractC1732c8);
        this.f57026f = abstractC1888g8;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m31766b();
        boolean zIsEmpty = this.f35054b.isEmpty();
        ((List) this.f35054b).add(i, obj);
        this.f57026f.f77372f++;
        if (zIsEmpty) {
            m31765a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f35054b).addAll(i, collection);
        if (zAddAll) {
            this.f57026f.f77372f += this.f35054b.size() - size;
            if (size == 0) {
                m31765a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m31766b();
        return ((List) this.f35054b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m31766b();
        return ((List) this.f35054b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m31766b();
        return ((List) this.f35054b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m31766b();
        return new C1769d8(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m31766b();
        Object objRemove = ((List) this.f35054b).remove(i);
        this.f57026f.f77372f--;
        m31767d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        m31766b();
        return ((List) this.f35054b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        m31766b();
        List listSubList = ((List) this.f35054b).subList(i, i2);
        AbstractC1732c8 abstractC1732c8 = this.f35055c;
        if (abstractC1732c8 == null) {
            abstractC1732c8 = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        AbstractC1888g8 abstractC1888g8 = this.f57026f;
        Object obj = this.f35053a;
        return z ? new C2640z7(abstractC1888g8, obj, listSubList, abstractC1732c8) : new C1805e8(abstractC1888g8, obj, listSubList, abstractC1732c8);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m31766b();
        return new C1769d8(this, i);
    }
}
