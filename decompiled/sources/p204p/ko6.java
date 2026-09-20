package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ko6 implements s6m0 {

    /* JADX INFO: renamed from: a */
    public static final ko6 f124546a = new ko6();
    public static final Parcelable.Creator<ko6> CREATOR = new fi6(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ko6);
    }

    public final int hashCode() {
        return -934192566;
    }

    public final String toString() {
        return "Attachment";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
