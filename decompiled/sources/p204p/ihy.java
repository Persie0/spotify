package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ihy implements jhy {

    /* JADX INFO: renamed from: a */
    public static final ihy f102379a = new ihy();
    public static final Parcelable.Creator<ihy> CREATOR = new p7y(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ihy);
    }

    public final int hashCode() {
        return 385367295;
    }

    public final String toString() {
        return "Playing";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
