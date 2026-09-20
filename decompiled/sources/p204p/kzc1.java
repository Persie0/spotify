package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class kzc1 implements Parcelable {
    public static final Parcelable.Creator<kzc1> CREATOR = new vmc1(16);

    /* JADX INFO: renamed from: a */
    public final mzc1 f128089a;

    public kzc1(mzc1 mzc1Var) {
        this.f128089a = mzc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzc1) && this.f128089a == ((kzc1) obj).f128089a;
    }

    public final int hashCode() {
        return this.f128089a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f128089a.name());
    }
}
