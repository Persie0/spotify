package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class ure0 implements vre0 {

    /* JADX INFO: renamed from: a */
    public static final ure0 f233341a = new ure0();
    public static final Parcelable.Creator<ure0> CREATOR = new ube0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ure0);
    }

    public final int hashCode() {
        return -2072414015;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
