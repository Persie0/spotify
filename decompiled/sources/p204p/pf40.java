package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class pf40 extends ef40 implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final kf40 f176960b = new kf40(0, wsv0.f254763e);

    /* JADX INFO: renamed from: l */
    public static wsv0 m69787l(int i, Object[] objArr) {
        return i == 0 ? wsv0.f254763e : new wsv0(i, objArr);
    }

    /* JADX INFO: renamed from: m */
    public static jf40 m69788m() {
        return new jf40(4);
    }

    /* JADX INFO: renamed from: n */
    public static jf40 m69789n(int i) {
        ddg1.m35736g(i, "expectedSize");
        return new jf40(i);
    }

    /* JADX INFO: renamed from: o */
    public static pf40 m69790o(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return m69791p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return wsv0.f254763e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m69794t(next);
        }
        jf40 jf40Var = new jf40(4);
        jf40Var.m28985c(next);
        while (it.hasNext()) {
            jf40Var.m28985c(it.next());
        }
        return jf40Var.m53150g();
    }

    /* JADX INFO: renamed from: p */
    public static pf40 m69791p(Collection collection) {
        if (!(collection instanceof ef40)) {
            Object[] array = collection.toArray();
            jhl0.m53416j(array);
            return m69787l(array.length, array);
        }
        pf40 pf40VarMo38714a = ((ef40) collection).mo38714a();
        if (!pf40VarMo38714a.mo1672i()) {
            return pf40VarMo38714a;
        }
        Object[] array2 = pf40VarMo38714a.toArray(ef40.f58934a);
        return m69787l(array2.length, array2);
    }

    /* JADX INFO: renamed from: q */
    public static wsv0 m69792q(Object[] objArr) {
        if (objArr.length == 0) {
            return wsv0.f254763e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        jhl0.m53416j(objArr2);
        return m69787l(objArr2.length, objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: renamed from: s */
    public static wsv0 m69793s(Serializable serializable, Serializable serializable2, Serializable serializable3, Serializable serializable4, Serializable serializable5, Serializable serializable6, Serializable serializable7, Serializable serializable8, Serializable serializable9, Serializable serializable10, Serializable serializable11, Serializable serializable12, Object... objArr) {
        c95.m31844j(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = serializable;
        objArr2[1] = serializable2;
        objArr2[2] = serializable3;
        objArr2[3] = serializable4;
        objArr2[4] = serializable5;
        objArr2[5] = serializable6;
        objArr2[6] = serializable7;
        objArr2[7] = serializable8;
        objArr2[8] = serializable9;
        objArr2[9] = serializable10;
        objArr2[10] = serializable11;
        objArr2[11] = serializable12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        jhl0.m53416j(objArr2);
        return m69787l(length, objArr2);
    }

    /* JADX INFO: renamed from: t */
    public static wsv0 m69794t(Object obj) {
        Object[] objArr = {obj};
        jhl0.m53416j(objArr);
        return m69787l(1, objArr);
    }

    /* JADX INFO: renamed from: u */
    public static wsv0 m69795u(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        jhl0.m53416j(objArr);
        return m69787l(2, objArr);
    }

    /* JADX INFO: renamed from: v */
    public static wsv0 m69796v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        jhl0.m53416j(objArr);
        return m69787l(5, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static wsv0 m69797w(Iterable iterable, Comparator comparator) {
        comparator.getClass();
        Object[] objArrM64505y = nhg1.m64505y(iterable);
        jhl0.m53416j(objArrM64505y);
        Arrays.sort(objArrM64505y, comparator);
        return m69787l(objArrM64505y.length, objArrM64505y);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: b */
    public int mo38715b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return pmf0.m70330p(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return pmf0.m70332r(this, obj);
    }

    @Override // p204p.ef40, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: j */
    public final o3a1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return pmf0.m70333s(this, obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final kf40 listIterator(int i) {
        c95.m31851q(i, size());
        return isEmpty() ? f176960b : new kf40(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.ef40
    public Object writeReplace() {
        return new lf40(toArray(ef40.f58934a));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public pf40 subList(int i, int i2) {
        c95.m31852r(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? wsv0.f254763e : new mf40(this, i, i3);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p204p.ef40
    /* JADX INFO: renamed from: a */
    public final pf40 mo38714a() {
        return this;
    }
}
