package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class nb31 implements Parcelable, vw41, Set, RandomAccess, cr60 {
    public static final Parcelable.Creator<nb31> CREATOR = new fb31(16);

    /* JADX INFO: renamed from: a */
    public px41 f152178a;

    public nb31() {
        prn0 prn0Var = prn0.f180645d;
        px41 px41Var = new px41(ua31.m82674j().mo28818g(), prn0Var);
        if (ua31.f228350b.m27471g() != null) {
            px41Var.f20764b = new px41(1, prn0Var);
        }
        this.f152178a = px41Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        yrn0 yrn0Var;
        oa31 oa31VarM82674j;
        boolean zM82625f;
        do {
            synchronized (u9g1.f228194a) {
                px41 px41Var = (px41) ua31.m82672h(this.f152178a);
                i = px41Var.f182205d;
                yrn0Var = px41Var.f182204c;
            }
            wj50.m88279p(yrn0Var);
            prn0 prn0VarM70729b = ((prn0) yrn0Var).m70729b(obj);
            if (prn0VarM70729b.equals(yrn0Var)) {
                return false;
            }
            px41 px41Var2 = this.f152178a;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                zM82625f = u9g1.m82625f((px41) ua31.m82686v(px41Var2, this, oa31VarM82674j), i, prn0VarM70729b);
            }
            ua31.m82678n(oa31VarM82674j, this);
        } while (!zM82625f);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        yrn0 yrn0Var;
        oa31 oa31VarM82674j;
        boolean zM82625f;
        do {
            synchronized (u9g1.f228194a) {
                px41 px41Var = (px41) ua31.m82672h(this.f152178a);
                i = px41Var.f182205d;
                yrn0Var = px41Var.f182204c;
            }
            wj50.m88279p(yrn0Var);
            rrn0 rrn0Var = new rrn0((prn0) yrn0Var);
            rrn0Var.addAll(collection);
            prn0 prn0VarM76291b = rrn0Var.m76291b();
            if (prn0VarM76291b.equals(yrn0Var)) {
                return false;
            }
            px41 px41Var2 = this.f152178a;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                zM82625f = u9g1.m82625f((px41) ua31.m82686v(px41Var2, this, oa31VarM82674j), i, prn0VarM76291b);
            }
            ua31.m82678n(oa31VarM82674j, this);
        } while (!zM82625f);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        oa31 oa31VarM82674j;
        px41 px41Var = this.f152178a;
        synchronized (ua31.f228351c) {
            oa31VarM82674j = ua31.m82674j();
            px41 px41Var2 = (px41) ua31.m82686v(px41Var, this, oa31VarM82674j);
            synchronized (u9g1.f228194a) {
                px41Var2.f182204c = prn0.f180645d;
                px41Var2.f182205d++;
            }
        }
        ua31.m82678n(oa31VarM82674j, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return ((px41) ua31.m82684t(this.f152178a, this)).f182204c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((px41) ua31.m82684t(this.f152178a, this)).f182204c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return ((px41) ua31.m82684t(this.f152178a, this)).f182204c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ox41(this, ((px41) ua31.m82684t(this.f152178a, this)).f182204c.iterator());
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: j */
    public final ax41 mo44200j() {
        return this.f152178a;
    }

    @Override // p204p.vw41
    /* JADX INFO: renamed from: q */
    public final void mo44202q(ax41 ax41Var) {
        ax41Var.f20764b = this.f152178a;
        this.f152178a = (px41) ax41Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        yrn0 yrn0Var;
        oa31 oa31VarM82674j;
        boolean zM82625f;
        do {
            synchronized (u9g1.f228194a) {
                px41 px41Var = (px41) ua31.m82672h(this.f152178a);
                i = px41Var.f182205d;
                yrn0Var = px41Var.f182204c;
            }
            wj50.m88279p(yrn0Var);
            prn0 prn0VarM70730d = ((prn0) yrn0Var).m70730d(obj);
            if (prn0VarM70730d.equals(yrn0Var)) {
                return false;
            }
            px41 px41Var2 = this.f152178a;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                zM82625f = u9g1.m82625f((px41) ua31.m82686v(px41Var2, this, oa31VarM82674j), i, prn0VarM70730d);
            }
            ua31.m82678n(oa31VarM82674j, this);
        } while (!zM82625f);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        yrn0 yrn0Var;
        oa31 oa31VarM82674j;
        boolean zM82625f;
        do {
            synchronized (u9g1.f228194a) {
                px41 px41Var = (px41) ua31.m82672h(this.f152178a);
                i = px41Var.f182205d;
                yrn0Var = px41Var.f182204c;
            }
            wj50.m88279p(yrn0Var);
            rrn0 rrn0Var = new rrn0((prn0) yrn0Var);
            rrn0Var.removeAll(collection);
            prn0 prn0VarM76291b = rrn0Var.m76291b();
            if (prn0VarM76291b.equals(yrn0Var)) {
                return false;
            }
            px41 px41Var2 = this.f152178a;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                zM82625f = u9g1.m82625f((px41) ua31.m82686v(px41Var2, this, oa31VarM82674j), i, prn0VarM76291b);
            }
            ua31.m82678n(oa31VarM82674j, this);
        } while (!zM82625f);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        yrn0 yrn0Var;
        boolean zRetainAll;
        oa31 oa31VarM82674j;
        boolean zM82625f;
        do {
            synchronized (u9g1.f228194a) {
                px41 px41Var = (px41) ua31.m82672h(this.f152178a);
                i = px41Var.f182205d;
                yrn0Var = px41Var.f182204c;
            }
            if (yrn0Var == null) {
                throw new IllegalStateException("No set to mutate");
            }
            rrn0 rrn0Var = new rrn0((prn0) yrn0Var);
            zRetainAll = rrn0Var.retainAll(g6f.m43736n1(collection));
            prn0 prn0VarM76291b = rrn0Var.m76291b();
            if (prn0VarM76291b.equals(yrn0Var)) {
                break;
            }
            px41 px41Var2 = this.f152178a;
            synchronized (ua31.f228351c) {
                oa31VarM82674j = ua31.m82674j();
                zM82625f = u9g1.m82625f((px41) ua31.m82686v(px41Var2, this, oa31VarM82674j), i, prn0VarM76291b);
            }
            ua31.m82678n(oa31VarM82674j, this);
        } while (!zM82625f);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return ((px41) ua31.m82684t(this.f152178a, this)).f182204c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wj50.m88262e0(this);
    }

    public final String toString() {
        return "SnapshotStateSet(value=" + ((px41) ua31.m82672h(this.f152178a)).f182204c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yrn0 yrn0Var = ((px41) ua31.m82684t(this.f152178a, this)).f182204c;
        parcel.writeInt(size());
        Iterator it = yrn0Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wj50.m88264f0(this, objArr);
    }
}
