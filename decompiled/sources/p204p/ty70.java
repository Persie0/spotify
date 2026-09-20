package p204p;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class ty70 extends AbstractC1696b9 implements xy70, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f224869b;

    static {
        new ty70(10).f24728a = false;
    }

    public ty70(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m28442a();
        this.f224869b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1696b9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f224869b.size(), collection);
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: c */
    public final List mo72066c() {
        return Collections.unmodifiableList(this.f224869b);
    }

    @Override // p204p.AbstractC1696b9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m28442a();
        this.f224869b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: g */
    public final xy70 mo72067g() {
        return this.f24728a ? new q3a1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.f224869b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof fva)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, de50.f47970a);
            if (xza1.f267569a.m80364k(0, bArr, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        fva fvaVar = (fva) obj;
        Charset charset = de50.f47970a;
        if (fvaVar.size() == 0) {
            str = "";
        } else {
            bva bvaVar = (bva) fvaVar;
            str = new String(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size(), charset);
        }
        bva bvaVar2 = (bva) fvaVar;
        int iMo30597j = bvaVar2.mo30597j();
        if (xza1.f267569a.m80364k(iMo30597j, bvaVar2.f31316d, bvaVar2.size() + iMo30597j)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // p204p.zd50
    /* JADX INFO: renamed from: h */
    public final zd50 mo46604h(int i) {
        ArrayList arrayList = this.f224869b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new ty70(arrayList2);
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: k */
    public final Object mo72068k(int i) {
        return this.f224869b.get(i);
    }

    @Override // p204p.xy70
    /* JADX INFO: renamed from: n0 */
    public final void mo72069n0(bva bvaVar) {
        m28442a();
        this.f224869b.add(bvaVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m28442a();
        Object objRemove = this.f224869b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof fva)) {
            return new String((byte[]) objRemove, de50.f47970a);
        }
        fva fvaVar = (fva) objRemove;
        Charset charset = de50.f47970a;
        if (fvaVar.size() == 0) {
            return "";
        }
        bva bvaVar = (bva) fvaVar;
        return new String(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m28442a();
        Object obj2 = this.f224869b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof fva)) {
            return new String((byte[]) obj2, de50.f47970a);
        }
        fva fvaVar = (fva) obj2;
        Charset charset = de50.f47970a;
        if (fvaVar.size() == 0) {
            return "";
        }
        bva bvaVar = (bva) fvaVar;
        return new String(bvaVar.f31316d, bvaVar.mo30597j(), bvaVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f224869b.size();
    }

    public ty70(ArrayList arrayList) {
        this.f224869b = arrayList;
    }

    @Override // p204p.AbstractC1696b9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m28442a();
        if (collection instanceof xy70) {
            collection = ((xy70) collection).mo72066c();
        }
        boolean zAddAll = this.f224869b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
