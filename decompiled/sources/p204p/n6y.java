package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n6y implements p6y {

    /* JADX INFO: renamed from: a */
    public static final n6y f150981a = new n6y();
    public static final Parcelable.Creator<n6y> CREATOR = new wfw(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n6y);
    }

    public final int hashCode() {
        return -331738699;
    }

    public final String toString() {
        return "Dot";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
