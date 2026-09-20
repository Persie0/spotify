package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class jdf0 implements Parcelable {
    public static final Parcelable.Creator<jdf0> CREATOR = new r4f0(6);

    /* JADX INFO: renamed from: a */
    public final hdf0 f111345a;

    public jdf0(hdf0 hdf0Var) {
        this.f111345a = hdf0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jdf0) && this.f111345a == ((jdf0) obj).f111345a;
    }

    public final int hashCode() {
        return this.f111345a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f111345a.name());
    }
}
