package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class l3a0 implements u3a0 {

    /* JADX INFO: renamed from: a */
    public static final l3a0 f129252a = new l3a0();
    public static final Parcelable.Creator<l3a0> CREATOR = new ra90(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l3a0);
    }

    public final int hashCode() {
        return 189758483;
    }

    public final String toString() {
        return "Loaded";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
