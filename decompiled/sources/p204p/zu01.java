package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zu01 extends rv01 {

    /* JADX INFO: renamed from: a */
    public static final zu01 f286314a = new zu01();
    public static final Parcelable.Creator<zu01> CREATOR = new sp01(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zu01);
    }

    public final int hashCode() {
        return -629392669;
    }

    public final String toString() {
        return "ExternalLoading";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
