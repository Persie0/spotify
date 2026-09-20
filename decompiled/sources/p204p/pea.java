package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class pea extends qea {

    /* JADX INFO: renamed from: a */
    public static final pea f176688a = new pea();
    public static final Parcelable.Creator<pea> CREATOR = new dc9(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pea);
    }

    public final int hashCode() {
        return 520950007;
    }

    public final String toString() {
        return "Volume";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
