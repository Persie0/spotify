package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class lea extends qea {

    /* JADX INFO: renamed from: a */
    public static final lea f132496a = new lea();
    public static final Parcelable.Creator<lea> CREATOR = new dc9(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lea);
    }

    public final int hashCode() {
        return 1024699695;
    }

    public final String toString() {
        return "Fx";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
