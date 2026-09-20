package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class osx0 implements psx0 {

    /* JADX INFO: renamed from: a */
    public static final osx0 f168916a = new osx0();
    public static final Parcelable.Creator<osx0> CREATOR = new csx0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof osx0);
    }

    public final int hashCode() {
        return -2047554587;
    }

    public final String toString() {
        return "Enabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
