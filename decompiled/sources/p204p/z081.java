package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class z081 implements c181 {

    /* JADX INFO: renamed from: a */
    public static final z081 f278018a = new z081();
    public static final Parcelable.Creator<z081> CREATOR = new sr71(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof z081);
    }

    public final int hashCode() {
        return -1213251893;
    }

    public final String toString() {
        return "Default";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
