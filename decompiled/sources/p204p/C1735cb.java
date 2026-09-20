package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.cb */
/* JADX INFO: loaded from: classes8.dex */
public final class C1735cb extends AbstractC1808eb {
    public static final Parcelable.Creator<C1735cb> CREATOR = new ora(11);

    /* JADX INFO: renamed from: a */
    public final AbstractC1662ac f35960a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2566xb f35961b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2332rb f35962c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2010jc f35963d;

    /* JADX INFO: renamed from: e */
    public final boolean f35964e;

    public C1735cb(AbstractC1662ac abstractC1662ac, AbstractC2566xb abstractC2566xb, AbstractC2332rb abstractC2332rb, AbstractC2010jc abstractC2010jc, boolean z) {
        this.f35960a = abstractC1662ac;
        this.f35961b = abstractC2566xb;
        this.f35962c = abstractC2332rb;
        this.f35963d = abstractC2010jc;
        this.f35964e = z;
    }

    /* JADX INFO: renamed from: l */
    public static C1735cb m32087l(C1735cb c1735cb, C2607yb c2607yb, AbstractC2566xb abstractC2566xb, AbstractC2332rb abstractC2332rb, C1974ic c1974ic, int i) {
        AbstractC1662ac abstractC1662ac = c2607yb;
        if ((i & 1) != 0) {
            abstractC1662ac = c1735cb.f35960a;
        }
        AbstractC1662ac abstractC1662ac2 = abstractC1662ac;
        if ((i & 2) != 0) {
            abstractC2566xb = c1735cb.f35961b;
        }
        AbstractC2566xb abstractC2566xb2 = abstractC2566xb;
        if ((i & 4) != 0) {
            abstractC2332rb = c1735cb.f35962c;
        }
        AbstractC2332rb abstractC2332rb2 = abstractC2332rb;
        AbstractC2010jc abstractC2010jc = c1974ic;
        if ((i & 8) != 0) {
            abstractC2010jc = c1735cb.f35963d;
        }
        boolean z = c1735cb.f35964e;
        c1735cb.getClass();
        return new C1735cb(abstractC1662ac2, abstractC2566xb2, abstractC2332rb2, abstractC2010jc, z);
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: c */
    public final boolean mo32088c() {
        return this.f35960a.mo25408c() && this.f35962c.mo66584c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1735cb)) {
            return false;
        }
        C1735cb c1735cb = (C1735cb) obj;
        return wj50.m88271j(this.f35960a, c1735cb.f35960a) && wj50.m88271j(this.f35961b, c1735cb.f35961b) && wj50.m88271j(this.f35962c, c1735cb.f35962c) && wj50.m88271j(this.f35963d, c1735cb.f35963d) && this.f35964e == c1735cb.f35964e;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: g */
    public final AbstractC2332rb mo32089g() {
        return this.f35962c;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: h */
    public final AbstractC2566xb mo32090h() {
        return this.f35961b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35964e) + ((this.f35963d.hashCode() + ((this.f35962c.hashCode() + ((this.f35961b.hashCode() + (this.f35960a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: j */
    public final boolean mo32091j() {
        return this.f35964e;
    }

    @Override // p204p.AbstractC1808eb
    /* JADX INFO: renamed from: k */
    public final AbstractC2010jc mo32092k() {
        return this.f35963d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f35960a);
        parcel.writeValue(this.f35961b);
        parcel.writeValue(this.f35962c);
        parcel.writeValue(this.f35963d);
        parcel.writeInt(this.f35964e ? 1 : 0);
    }
}
