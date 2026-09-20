package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.qb */
/* JADX INFO: loaded from: classes8.dex */
public final class C2287qb extends AbstractC2332rb implements Parcelable {
    public static final Parcelable.Creator<C2287qb> CREATOR = new ora(15);

    /* JADX INFO: renamed from: a */
    public final boolean f186954a;

    /* JADX INFO: renamed from: b */
    public final boolean f186955b;

    /* JADX INFO: renamed from: c */
    public final boolean f186956c;

    public C2287qb(boolean z, boolean z2, boolean z3) {
        this.f186954a = z;
        this.f186955b = z2;
        this.f186956c = z3;
    }

    /* JADX INFO: renamed from: g */
    public static C2287qb m72478g(C2287qb c2287qb, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = c2287qb.f186954a;
        }
        if ((i & 2) != 0) {
            z2 = c2287qb.f186955b;
        }
        boolean z3 = c2287qb.f186956c;
        c2287qb.getClass();
        return new C2287qb(z, z2, z3);
    }

    @Override // p204p.AbstractC2332rb
    /* JADX INFO: renamed from: c */
    public final boolean mo66584c() {
        return this.f186954a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2287qb)) {
            return false;
        }
        C2287qb c2287qb = (C2287qb) obj;
        return this.f186954a == c2287qb.f186954a && this.f186955b == c2287qb.f186955b && this.f186956c == c2287qb.f186956c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186956c) + s571.m77245d(Boolean.hashCode(this.f186954a) * 31, 31, this.f186955b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f186954a ? 1 : 0);
        parcel.writeInt(this.f186955b ? 1 : 0);
        parcel.writeInt(this.f186956c ? 1 : 0);
    }
}
