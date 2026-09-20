package p204p;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class kof1 extends kbf1 implements RandomAccess, nof1 {

    /* JADX INFO: renamed from: b */
    public final ArrayList f124778b;

    static {
        new kof1(10).f121199a = false;
    }

    public kof1(int i) {
        this.f124778b = new ArrayList(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m55944a();
        this.f124778b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m55944a();
        if (collection instanceof nof1) {
            collection = ((nof1) collection).zzh();
        }
        boolean zAddAll = this.f124778b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        String str;
        ArrayList arrayList = this.f124778b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof zhf1)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, nnf1.f156416a);
            ajp0 ajp0Var = wzf1.f256585a;
            int length = bArr.length;
            ajp0Var.getClass();
            if (ajp0.m26172b(0, bArr, length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        zhf1 zhf1Var = (zhf1) obj;
        Charset charset = nnf1.f156416a;
        if (zhf1Var.mo29248d() == 0) {
            str = "";
        } else {
            nhf1 nhf1Var = (nhf1) zhf1Var;
            str = new String(nhf1Var.f154001c, 0, nhf1Var.mo29248d(), charset);
        }
        nhf1 nhf1Var2 = (nhf1) zhf1Var;
        byte[] bArr2 = nhf1Var2.f154001c;
        int iMo29248d = nhf1Var2.mo29248d();
        wzf1.f256585a.getClass();
        if (ajp0.m26172b(0, bArr2, iMo29248d)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m55944a();
        this.f124778b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.nof1
    /* JADX INFO: renamed from: n1 */
    public final void mo49187n1(zhf1 zhf1Var) {
        m55944a();
        this.f124778b.add(zhf1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // p204p.kbf1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m55944a();
        Object objRemove = this.f124778b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof zhf1)) {
            return new String((byte[]) objRemove, nnf1.f156416a);
        }
        zhf1 zhf1Var = (zhf1) objRemove;
        Charset charset = nnf1.f156416a;
        if (zhf1Var.mo29248d() == 0) {
            return "";
        }
        nhf1 nhf1Var = (nhf1) zhf1Var;
        return new String(nhf1Var.f154001c, 0, nhf1Var.mo29248d(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m55944a();
        Object obj2 = this.f124778b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zhf1)) {
            return new String((byte[]) obj2, nnf1.f156416a);
        }
        zhf1 zhf1Var = (zhf1) obj2;
        Charset charset = nnf1.f156416a;
        if (zhf1Var.mo29248d() == 0) {
            return "";
        }
        nhf1 nhf1Var = (nhf1) zhf1Var;
        return new String(nhf1Var.f154001c, 0, nhf1Var.mo29248d(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f124778b.size();
    }

    @Override // p204p.gnf1
    public final gnf1 zzd(int i) {
        ArrayList arrayList = this.f124778b;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new kof1(arrayList2);
    }

    @Override // p204p.nof1
    public final nof1 zze() {
        return this.f121199a ? new hyf1(this) : this;
    }

    @Override // p204p.nof1
    public final Object zzf(int i) {
        return this.f124778b.get(i);
    }

    @Override // p204p.nof1
    public final List zzh() {
        return Collections.unmodifiableList(this.f124778b);
    }

    public kof1(ArrayList arrayList) {
        this.f124778b = arrayList;
    }

    @Override // p204p.kbf1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f124778b.size(), collection);
    }
}
