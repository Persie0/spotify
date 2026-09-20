package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class mhy implements ohy {

    /* JADX INFO: renamed from: a */
    public static final mhy f143887a = new mhy();
    public static final Parcelable.Creator<mhy> CREATOR = new p7y(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mhy);
    }

    public final int hashCode() {
        return 97493093;
    }

    public final String toString() {
        return "Hidden";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
