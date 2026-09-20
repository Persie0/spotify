package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class d0r0 implements Parcelable {
    public static final Parcelable.Creator<d0r0> CREATOR = new vzq0(2);

    /* JADX INFO: renamed from: a */
    public final pte0 f44027a;

    /* JADX INFO: renamed from: b */
    public final ase0 f44028b;

    /* JADX INFO: renamed from: c */
    public final gh00 f44029c;

    public d0r0(pte0 pte0Var, ase0 ase0Var, gh00 gh00Var) {
        this.f44027a = pte0Var;
        this.f44028b = ase0Var;
        this.f44029c = gh00Var;
    }

    /* JADX INFO: renamed from: c */
    public final ase0 m34551c() {
        return this.f44028b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0r0)) {
            return false;
        }
        d0r0 d0r0Var = (d0r0) obj;
        return wj50.m88271j(this.f44027a, d0r0Var.f44027a) && wj50.m88271j(this.f44028b, d0r0Var.f44028b) && wj50.m88271j(this.f44029c, d0r0Var.f44029c);
    }

    /* JADX INFO: renamed from: g */
    public final gh00 m34552g() {
        return this.f44029c;
    }

    /* JADX INFO: renamed from: h */
    public final pte0 m34553h() {
        return this.f44027a;
    }

    public final int hashCode() {
        return this.f44029c.hashCode() + ((this.f44028b.hashCode() + (this.f44027a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f44027a, i);
        this.f44028b.writeToParcel(parcel, i);
        parcel.writeSerializable((Serializable) this.f44029c);
    }
}
