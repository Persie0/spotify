package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class asx0 implements jsx0 {

    /* JADX INFO: renamed from: a */
    public static final asx0 f19524a = new asx0();
    public static final Parcelable.Creator<asx0> CREATOR = new xxw0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof asx0);
    }

    public final int hashCode() {
        return 434300334;
    }

    public final String toString() {
        return "Fallback";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
