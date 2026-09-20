package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.db */
/* JADX INFO: loaded from: classes8.dex */
public final class C1772db extends AbstractC1808eb {
    public static final Parcelable.Creator<C1772db> CREATOR = new ora(12);

    /* JADX INFO: renamed from: a */
    public final AbstractC2209oc f47162a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1892gc f47163b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2010jc f47164c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2566xb f47165d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2332rb f47166e;

    /* JADX INFO: renamed from: f */
    public final boolean f47167f;

    public C1772db(AbstractC2209oc abstractC2209oc, AbstractC1892gc abstractC1892gc, AbstractC2010jc abstractC2010jc, AbstractC2566xb abstractC2566xb, AbstractC2332rb abstractC2332rb, boolean z) {
        this.f47162a = abstractC2209oc;
        this.f47163b = abstractC1892gc;
        this.f47164c = abstractC2010jc;
        this.f47165d = abstractC2566xb;
        this.f47166e = abstractC2332rb;
        this.f47167f = z;
    }

    /* JADX INFO: renamed from: l */
    public static C1772db m35516l(C1772db c1772db, AbstractC2209oc abstractC2209oc, C1699bc c1699bc, C1974ic c1974ic, AbstractC2566xb abstractC2566xb, AbstractC2332rb abstractC2332rb, int i) {
        if ((i & 1) != 0) {
            abstractC2209oc = c1772db.f47162a;
        }
        AbstractC2209oc abstractC2209oc2 = abstractC2209oc;
        AbstractC1892gc abstractC1892gc = c1699bc;
        if ((i & 2) != 0) {
            abstractC1892gc = c1772db.f47163b;
        }
        AbstractC1892gc abstractC1892gc2 = abstractC1892gc;
        AbstractC2010jc abstractC2010jc = c1974ic;
        if ((i & 4) != 0) {
            abstractC2010jc = c1772db.f47164c;
        }
        AbstractC2010jc abstractC2010jc2 = abstractC2010jc;
        if ((i & 8) != 0) {
            abstractC2566xb = c1772db.f47165d;
        }
        AbstractC2566xb abstractC2566xb2 = abstractC2566xb;
        if ((i & 16) != 0) {
            abstractC2332rb = c1772db.f47166e;
        }
        boolean z = c1772db.f47167f;
        c1772db.getClass();
        return new C1772db(abstractC2209oc2, abstractC1892gc2, abstractC2010jc2, abstractC2566xb2, abstractC2332rb, z);
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: c */
    public final boolean mo32088c() {
        return this.f47162a.mo58677c() && this.f47163b.mo28653c() && this.f47166e.mo66584c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1772db)) {
            return false;
        }
        C1772db c1772db = (C1772db) obj;
        return wj50.m88271j(this.f47162a, c1772db.f47162a) && wj50.m88271j(this.f47163b, c1772db.f47163b) && wj50.m88271j(this.f47164c, c1772db.f47164c) && wj50.m88271j(this.f47165d, c1772db.f47165d) && wj50.m88271j(this.f47166e, c1772db.f47166e) && this.f47167f == c1772db.f47167f;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: g */
    public final AbstractC2332rb mo32089g() {
        return this.f47166e;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: h */
    public final AbstractC2566xb mo32090h() {
        return this.f47165d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f47167f) + ((this.f47166e.hashCode() + ((this.f47165d.hashCode() + ((this.f47164c.hashCode() + ((this.f47163b.hashCode() + (this.f47162a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: j */
    public final boolean mo32091j() {
        return this.f47167f;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: k */
    public final AbstractC2010jc mo32092k() {
        return this.f47164c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f47162a);
        parcel.writeValue(this.f47163b);
        parcel.writeValue(this.f47164c);
        parcel.writeValue(this.f47165d);
        parcel.writeValue(this.f47166e);
        parcel.writeInt(this.f47167f ? 1 : 0);
    }
}
