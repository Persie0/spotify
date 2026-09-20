package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aes extends bes {

    /* JADX INFO: renamed from: a */
    public static final aes f14944a = new aes();
    public static final Parcelable.Creator<aes> CREATOR = new f9s(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aes);
    }

    public final int hashCode() {
        return -1500651140;
    }

    public final String toString() {
        return "Idle";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
