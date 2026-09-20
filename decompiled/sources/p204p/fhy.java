package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fhy implements ghy {

    /* JADX INFO: renamed from: a */
    public static final fhy f69729a = new fhy();
    public static final Parcelable.Creator<fhy> CREATOR = new p7y(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fhy);
    }

    public final int hashCode() {
        return 483275649;
    }

    public final String toString() {
        return "Friend";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
