package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class gb31 implements Parcelable, vw41, List, RandomAccess, rq60 {
    public static final Parcelable.Creator<gb31> CREATOR = new fb31(0);

    /* JADX INFO: renamed from: a */
    public lw41 f78181a;

    public gb31(AbstractC2563x8 abstractC2563x8) {
        this.f78181a = q9g1.m72377I(abstractC2563x8);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo45652d = abstractC2563x8.mo45652d(obj);
            if (abstractC2563x8Mo45652d.equals(abstractC2563x8)) {
                return false;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i, abstractC2563x8Mo45652d, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return q9g1.m72372D(this, new ie40(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        oa31 oa31VarM58609h;
        lw41 lw41Var = this.f78181a;
        synchronized (ua31.f228351c) {
            oa31VarM58609h = lb5.m58609h();
            lw41 lw41Var2 = (lw41) ua31.m82686v(lw41Var, this, oa31VarM58609h);
            synchronized (q9g1.f186591a) {
                cjc.m32946l();
                lw41Var2.f137446c = mv21.f147495b;
                lw41Var2.f137447d++;
                lw41Var2.f137448e++;
            }
        }
        ua31.m82678n(oa31VarM58609h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return q9g1.m72402y(this).f137446c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return q9g1.m72402y(this).f137446c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return q9g1.m72402y(this).f137446c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return q9g1.m72402y(this).f137446c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return q9g1.m72402y(this).f137446c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f78181a;
    }

    /* JADX INFO: renamed from: l */
    public final void m44201l(int i, int i2) {
        int i3;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i3 = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            isn0 isn0VarMo45653f = abstractC2563x8.mo45653f();
            isn0VarMo45653f.subList(i, i2).clear();
            AbstractC2563x8 abstractC2563x8M51557d = isn0VarMo45653f.m51557d();
            if (wj50.m88271j(abstractC2563x8M51557d, abstractC2563x8)) {
                return;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i3, abstractC2563x8M51557d, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return q9g1.m72402y(this).f137446c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new e030(this, 0);
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        ax41Var.f20764b = this.f78181a;
        this.f78181a = (lw41) ax41Var;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        Object obj = get(i);
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i2 = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo45655j = abstractC2563x8.mo45655j(i);
            if (abstractC2563x8Mo45655j.equals(abstractC2563x8)) {
                break;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i2, abstractC2563x8Mo45655j, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo45654i = abstractC2563x8.mo45654i(new C2486v8(0, collection));
            if (wj50.m88271j(abstractC2563x8Mo45654i, abstractC2563x8)) {
                return false;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i, abstractC2563x8Mo45654i, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return q9g1.m72372D(this, new C2486v8(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        Object obj2 = get(i);
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i2 = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo45656l = abstractC2563x8.mo45656l(i, obj);
            if (abstractC2563x8Mo45656l.equals(abstractC2563x8)) {
                break;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i2, abstractC2563x8Mo45656l, false);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return q9g1.m72402y(this).f137446c.mo33075a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            lfq0.m58913a("fromIndex or toIndex are out of bounds");
        }
        return new fr51(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    public final String toString() {
        return "SnapshotStateList(value=" + ((lw41) ua31.m82672h(this.f78181a)).f137446c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC2563x8 abstractC2563x8 = q9g1.m72402y(this).f137446c;
        int iMo33075a = abstractC2563x8.mo33075a();
        parcel.writeInt(iMo33075a);
        for (int i2 = 0; i2 < iMo33075a; i2++) {
            parcel.writeValue(abstractC2563x8.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo62888e = abstractC2563x8.mo62888e(collection);
            if (wj50.m88271j(abstractC2563x8Mo62888e, abstractC2563x8)) {
                return false;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i, abstractC2563x8Mo62888e, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new e030(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gb31() {
        this(mv21.f147495b);
        cjc.m32946l();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i2 = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            AbstractC2563x8 abstractC2563x8Mo45651b = abstractC2563x8.mo45651b(i, obj);
            if (abstractC2563x8Mo45651b.equals(abstractC2563x8)) {
                return;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i2, abstractC2563x8Mo45651b, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC2563x8 abstractC2563x8;
        oa31 oa31VarM58609h;
        boolean zM72394q;
        do {
            synchronized (q9g1.f186591a) {
                lw41 lw41Var = (lw41) ua31.m82672h(this.f78181a);
                i = lw41Var.f137447d;
                abstractC2563x8 = lw41Var.f137446c;
            }
            wj50.m88279p(abstractC2563x8);
            int iIndexOf = abstractC2563x8.indexOf(obj);
            AbstractC2563x8 abstractC2563x8Mo45655j = iIndexOf != -1 ? abstractC2563x8.mo45655j(iIndexOf) : abstractC2563x8;
            if (abstractC2563x8Mo45655j.equals(abstractC2563x8)) {
                return false;
            }
            lw41 lw41Var2 = this.f78181a;
            synchronized (ua31.f228351c) {
                oa31VarM58609h = lb5.m58609h();
                zM72394q = q9g1.m72394q((lw41) ua31.m82686v(lw41Var2, this, oa31VarM58609h), i, abstractC2563x8Mo45655j, true);
            }
            ua31.m82678n(oa31VarM58609h, this);
        } while (!zM72394q);
        return true;
    }
}
