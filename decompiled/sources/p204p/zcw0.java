package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class zcw0 extends adw0 {

    /* JADX INFO: renamed from: a */
    public static final zcw0 f281579a = new zcw0();
    public static final Parcelable.Creator<zcw0> CREATOR = new b8w0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zcw0);
    }

    public final int hashCode() {
        return 2091651101;
    }

    public final String toString() {
        return "WarningMessage";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
