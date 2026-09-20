package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class flc implements glc {

    /* JADX INFO: renamed from: a */
    public static final flc f70752a = new flc();
    public static final Parcelable.Creator<flc> CREATOR = new a5c(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof flc);
    }

    public final int hashCode() {
        return -1299783579;
    }

    public final String toString() {
        return "Valid";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
