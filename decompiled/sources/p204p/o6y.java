package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o6y implements p6y {

    /* JADX INFO: renamed from: a */
    public static final o6y f162437a = new o6y();
    public static final Parcelable.Creator<o6y> CREATOR = new wfw(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o6y);
    }

    public final int hashCode() {
        return -1693667252;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
