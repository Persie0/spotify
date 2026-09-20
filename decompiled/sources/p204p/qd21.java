package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class qd21 implements rd21 {

    /* JADX INFO: renamed from: a */
    public static final qd21 f187465a = new qd21();
    public static final Parcelable.Creator<qd21> CREATOR = new q321(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qd21);
    }

    public final int hashCode() {
        return 901095673;
    }

    public final String toString() {
        return "Unavailable";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
