package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class oea extends qea {

    /* JADX INFO: renamed from: a */
    public static final oea f164390a = new oea();
    public static final Parcelable.Creator<oea> CREATOR = new dc9(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof oea);
    }

    public final int hashCode() {
        return 213975930;
    }

    public final String toString() {
        return "Unspecified";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
