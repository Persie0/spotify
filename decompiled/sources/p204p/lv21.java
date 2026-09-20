package p204p;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class lv21 extends AbstractC2524w8 implements qf40 {

    /* JADX INFO: renamed from: b */
    public static final lv21 f137205b = new lv21(new Object[0]);

    /* JADX INFO: renamed from: a */
    public final Object[] f137206a;

    public lv21(Object[] objArr) {
        this.f137206a = objArr;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f137206a.length;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 m60045b(Collection collection) {
        Object[] objArr = this.f137206a;
        if (collection.size() + objArr.length > 32) {
            hsn0 hsn0VarM60046d = m60046d();
            hsn0VarM60046d.addAll(collection);
            return hsn0VarM60046d.m48544d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new lv21(objArrCopyOf);
    }

    /* JADX INFO: renamed from: d */
    public final hsn0 m60046d() {
        return new hsn0(this, null, this.f137206a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        hxh.m49022i(i, mo33075a());
        return this.f137206a[i];
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int indexOf(Object obj) {
        return bk5.m29589L0(this.f137206a, obj);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int lastIndexOf(Object obj) {
        return bk5.m29594Q0(this.f137206a, obj);
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f137206a;
        hxh.m49023j(i, objArr.length);
        return new rpa(i, objArr.length, objArr);
    }
}
