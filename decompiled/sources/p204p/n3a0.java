package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class n3a0 implements u3a0 {

    /* JADX INFO: renamed from: a */
    public static final n3a0 f149985a = new n3a0();
    public static final Parcelable.Creator<n3a0> CREATOR = new ra90(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n3a0);
    }

    public final int hashCode() {
        return 1587549934;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
