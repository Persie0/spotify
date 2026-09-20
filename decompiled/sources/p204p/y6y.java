package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y6y implements b7y {

    /* JADX INFO: renamed from: a */
    public static final y6y f269914a = new y6y();
    public static final Parcelable.Creator<y6y> CREATOR = new wfw(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof y6y);
    }

    public final int hashCode() {
        return 840993576;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
