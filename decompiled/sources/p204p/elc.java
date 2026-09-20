package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class elc implements glc {

    /* JADX INFO: renamed from: a */
    public static final elc f60684a = new elc();
    public static final Parcelable.Creator<elc> CREATOR = new a5c(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof elc);
    }

    public final int hashCode() {
        return 848870245;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
