package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class xfw implements agw {

    /* JADX INFO: renamed from: a */
    public static final xfw f261107a = new xfw();
    public static final Parcelable.Creator<xfw> CREATOR = new wfw(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xfw);
    }

    public final int hashCode() {
        return -827378572;
    }

    public final String toString() {
        return "TooYoung";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
