package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class ytf0 implements auf0 {

    /* JADX INFO: renamed from: a */
    public static final ytf0 f276114a = new ytf0();
    public static final Parcelable.Creator<ytf0> CREATOR = new r4f0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ytf0);
    }

    public final int hashCode() {
        return 1142465678;
    }

    public final String toString() {
        return "Always";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
