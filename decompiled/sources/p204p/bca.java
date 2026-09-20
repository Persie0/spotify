package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bca extends dca {

    /* JADX INFO: renamed from: a */
    public static final bca f25813a = new bca();
    public static final Parcelable.Creator<bca> CREATOR = new dc9(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bca);
    }

    public final int hashCode() {
        return 29931954;
    }

    public final String toString() {
        return "PrimaryButtonTapped";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
