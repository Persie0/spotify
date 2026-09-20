package p204p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class wy70 extends AbstractC1770d9 implements az70, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f256227b;

    static {
        new wy70(10).f46559a = false;
    }

    public wy70(int i) {
        this(new ArrayList(i));
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: a1 */
    public final void mo27580a1(dva dvaVar) {
        m35294a();
        this.f256227b.add(dvaVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m35294a();
        this.f256227b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.AbstractC1770d9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f256227b.size(), collection);
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: c */
    public final List mo27581c() {
        return Collections.unmodifiableList(this.f256227b);
    }

    @Override // p204p.AbstractC1770d9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m35294a();
        this.f256227b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: g */
    public final az70 mo27582g() {
        return this.f46559a ? new t3a1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f256227b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof dva)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, ge50.f79023a);
            if (zza1.f287933a.m95794k(0, bArr, bArr.length)) {
                arrayList.set(i, str);
            }
            return str;
        }
        dva dvaVar = (dva) obj;
        String str2 = dvaVar.size() == 0 ? "" : new String(dvaVar.f53405b, dvaVar.m37079b(), dvaVar.size(), ge50.f79023a);
        int iM37079b = dvaVar.m37079b();
        if (zza1.f287933a.m95794k(iM37079b, dvaVar.f53405b, dvaVar.size() + iM37079b)) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // p204p.be50
    /* JADX INFO: renamed from: h */
    public final be50 mo28906h(int i) {
        ArrayList arrayList = this.f256227b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new wy70(arrayList2);
    }

    @Override // p204p.az70
    /* JADX INFO: renamed from: k */
    public final Object mo27583k(int i) {
        return this.f256227b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m35294a();
        Object objRemove = this.f256227b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof dva)) {
            return new String((byte[]) objRemove, ge50.f79023a);
        }
        dva dvaVar = (dva) objRemove;
        return dvaVar.size() == 0 ? "" : new String(dvaVar.f53405b, dvaVar.m37079b(), dvaVar.size(), ge50.f79023a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m35294a();
        Object obj2 = this.f256227b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof dva)) {
            return new String((byte[]) obj2, ge50.f79023a);
        }
        dva dvaVar = (dva) obj2;
        return dvaVar.size() == 0 ? "" : new String(dvaVar.f53405b, dvaVar.m37079b(), dvaVar.size(), ge50.f79023a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f256227b.size();
    }

    public wy70(ArrayList arrayList) {
        this.f256227b = arrayList;
    }

    @Override // p204p.AbstractC1770d9, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m35294a();
        if (collection instanceof az70) {
            collection = ((az70) collection).mo27581c();
        }
        boolean zAddAll = this.f256227b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
