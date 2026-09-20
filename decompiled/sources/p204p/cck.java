package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class cck implements ick {

    /* JADX INFO: renamed from: a */
    public static final cck f36423a = new cck();
    public static final Parcelable.Creator<cck> CREATOR = new dnj(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cck);
    }

    public final int hashCode() {
        return 1978978687;
    }

    public final String toString() {
        return "DELETED_FOR_ALL";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
