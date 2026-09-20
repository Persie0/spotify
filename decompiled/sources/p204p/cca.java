package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class cca extends dca {

    /* JADX INFO: renamed from: a */
    public static final cca f36362a = new cca();
    public static final Parcelable.Creator<cca> CREATOR = new dc9(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cca);
    }

    public final int hashCode() {
        return -49889884;
    }

    public final String toString() {
        return "SecondaryButtonTapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
