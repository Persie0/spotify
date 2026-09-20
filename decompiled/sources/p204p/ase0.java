package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ase0 implements Parcelable {
    public static final Parcelable.Creator<ase0> CREATOR = new ube0(9);

    /* JADX INFO: renamed from: a */
    public final zre0 f19404a;

    /* JADX INFO: renamed from: b */
    public final vre0 f19405b;

    public ase0(zre0 zre0Var, vre0 vre0Var) {
        this.f19404a = zre0Var;
        this.f19405b = vre0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ase0)) {
            return false;
        }
        ase0 ase0Var = (ase0) obj;
        return wj50.m88271j(this.f19404a, ase0Var.f19404a) && wj50.m88271j(this.f19405b, ase0Var.f19405b);
    }

    public final int hashCode() {
        return this.f19405b.hashCode() + (this.f19404a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f19404a, i);
        parcel.writeParcelable(this.f19405b, i);
    }
}
