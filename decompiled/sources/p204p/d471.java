package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class d471 extends g471 {

    /* JADX INFO: renamed from: a */
    public static final d471 f45099a = new d471();
    public static final Parcelable.Creator<d471> CREATOR = new c071(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d471);
    }

    public final int hashCode() {
        return -33466785;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
