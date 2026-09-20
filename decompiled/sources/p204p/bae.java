package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bae implements cae {
    public static final Parcelable.Creator<bae> CREATOR = new n6e(22);

    /* JADX INFO: renamed from: a */
    public final boolean f25181a;

    /* JADX INFO: renamed from: b */
    public final ok10 f25182b;

    public bae(boolean z, ok10 ok10Var) {
        this.f25181a = z;
        this.f25182b = ok10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bae)) {
            return false;
        }
        bae baeVar = (bae) obj;
        return this.f25181a == baeVar.f25181a && wj50.m88271j(this.f25182b, baeVar.f25182b);
    }

    public final int hashCode() {
        return this.f25182b.hashCode() + (Boolean.hashCode(this.f25181a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25181a ? 1 : 0);
        parcel.writeParcelable(this.f25182b, i);
    }
}
