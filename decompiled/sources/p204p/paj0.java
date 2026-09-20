package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class paj0 implements taj0 {

    /* JADX INFO: renamed from: a */
    public static final paj0 f175544a = new paj0();
    public static final Parcelable.Creator<paj0> CREATOR = new rri0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof paj0);
    }

    public final int hashCode() {
        return 992080887;
    }

    public final String toString() {
        return "DevicePicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
