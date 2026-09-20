package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class clc implements glc {

    /* JADX INFO: renamed from: a */
    public static final clc f39244a = new clc();
    public static final Parcelable.Creator<clc> CREATOR = new a5c(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof clc);
    }

    public final int hashCode() {
        return 2057023594;
    }

    public final String toString() {
        return "Default";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
