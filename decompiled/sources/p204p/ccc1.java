package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ccc1 implements fcc1 {

    /* JADX INFO: renamed from: a */
    public static final ccc1 f36381a = new ccc1();
    public static final Parcelable.Creator<ccc1> CREATOR = new c8b1(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ccc1);
    }

    public final int hashCode() {
        return -776869601;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
