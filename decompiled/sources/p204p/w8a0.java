package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class w8a0 implements aaa0 {

    /* JADX INFO: renamed from: a */
    public static final w8a0 f248889a = new w8a0();
    public static final Parcelable.Creator<w8a0> CREATOR = new ra90(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w8a0);
    }

    public final int hashCode() {
        return -461221908;
    }

    public final String toString() {
        return "BackendError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
