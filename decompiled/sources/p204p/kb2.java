package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class kb2 extends ob2 {

    /* JADX INFO: renamed from: a */
    public static final kb2 f121033a = new kb2();
    public static final Parcelable.Creator<kb2> CREATOR = new zt1(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof kb2);
    }

    public final int hashCode() {
        return -1466251092;
    }

    public final String toString() {
        return "NotValidated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
