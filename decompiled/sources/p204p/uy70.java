package p204p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class uy70 extends AbstractC1733c9 implements yy70, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final List f235203b;

    static {
        new uy70();
    }

    public uy70(ArrayList arrayList) {
        super(true);
        this.f235203b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m31802a();
        this.f235203b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f235203b.size(), collection);
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: c */
    public final List mo74623c() {
        return Collections.unmodifiableList(this.f235203b);
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m31802a();
        this.f235203b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: g */
    public final yy70 mo74624g() {
        return this.f35342a ? new r3a1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f235203b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof gva) {
            gva gvaVar = (gva) obj;
            String strM45892u = gvaVar.m45892u();
            if (gvaVar.mo34017n()) {
                list.set(i, strM45892u);
            }
            return strM45892u;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, ee50.f58680a);
        if (yza1.f277744a.m87611n(0, bArr, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // p204p.ae50
    /* JADX INFO: renamed from: h */
    public final ae50 mo25687h(int i) {
        List list = this.f235203b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new uy70(arrayList);
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: k */
    public final Object mo74625k(int i) {
        return this.f235203b.get(i);
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m31802a();
        Object objRemove = this.f235203b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof gva ? ((gva) objRemove).m45892u() : new String((byte[]) objRemove, ee50.f58680a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m31802a();
        Object obj2 = this.f235203b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof gva ? ((gva) obj2).m45892u() : new String((byte[]) obj2, ee50.f58680a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f235203b.size();
    }

    @Override // p204p.yy70
    /* JADX INFO: renamed from: u0 */
    public final void mo74626u0(gva gvaVar) {
        m31802a();
        this.f235203b.add(gvaVar);
        ((AbstractList) this).modCount++;
    }

    public uy70() {
        super(false);
        this.f235203b = Collections.EMPTY_LIST;
    }

    @Override // p204p.AbstractC1733c9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m31802a();
        if (collection instanceof yy70) {
            collection = ((yy70) collection).mo74623c();
        }
        boolean zAddAll = this.f235203b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public uy70(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m31802a();
        this.f235203b.add((String) obj);
        ((AbstractList) this).modCount++;
        return true;
    }
}
