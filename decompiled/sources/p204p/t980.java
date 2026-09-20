package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class t980 extends v980 {

    /* JADX INFO: renamed from: a */
    public static final t980 f218212a = new t980();
    public static final Parcelable.Creator<t980> CREATOR = new i980(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof t980);
    }

    public final int hashCode() {
        return 1516929101;
    }

    public final String toString() {
        return "Gone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
