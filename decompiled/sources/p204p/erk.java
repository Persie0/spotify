package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class erk extends hrk {

    /* JADX INFO: renamed from: a */
    public static final erk f62143a = new erk();
    public static final Parcelable.Creator<erk> CREATOR = new kck(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof erk);
    }

    public final int hashCode() {
        return 934870787;
    }

    public final String toString() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
