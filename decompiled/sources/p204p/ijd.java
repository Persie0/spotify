package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ijd extends jjd {

    /* JADX INFO: renamed from: a */
    public static final ijd f102786a = new ijd();
    public static final Parcelable.Creator<ijd> CREATOR = new fjd(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ijd);
    }

    public final int hashCode() {
        return 455509897;
    }

    public final String toString() {
        return "Loading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
