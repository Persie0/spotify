package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class grk extends hrk {

    /* JADX INFO: renamed from: a */
    public static final grk f83776a = new grk();
    public static final Parcelable.Creator<grk> CREATOR = new kck(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof grk);
    }

    public final int hashCode() {
        return -1716667529;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
