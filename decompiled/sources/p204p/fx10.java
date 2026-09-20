package p204p;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class fx10 extends AbstractList {

    /* JADX INFO: renamed from: d */
    public static final AtomicInteger f74218d = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public Handler f74219a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f74220b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f74221c;

    public fx10(List list) {
        f74218d.incrementAndGet();
        this.f74221c = new ArrayList();
        this.f74220b = new ArrayList(list);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f74220b.add(i, (dx10) obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f74220b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof dx10) {
            return super.contains((dx10) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (dx10) this.f74220b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof dx10) {
            return super.indexOf((dx10) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof dx10) {
            return super.lastIndexOf((dx10) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof dx10) {
            return super.remove((dx10) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return (dx10) this.f74220b.set(i, (dx10) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f74220b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        return this.f74220b.add((dx10) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (dx10) this.f74220b.remove(i);
    }

    public fx10(dx10... dx10VarArr) {
        f74218d.incrementAndGet();
        this.f74221c = new ArrayList();
        this.f74220b = new ArrayList(bk5.m29611g0(dx10VarArr));
    }
}
