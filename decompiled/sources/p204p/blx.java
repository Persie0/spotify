package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class blx implements dlx {

    /* JADX INFO: renamed from: a */
    public static final blx f28299a = new blx();
    public static final Parcelable.Creator<blx> CREATOR = new wfw(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof blx);
    }

    public final int hashCode() {
        return 182417657;
    }

    public final String toString() {
        return "Free";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
