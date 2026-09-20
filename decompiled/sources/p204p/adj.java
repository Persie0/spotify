package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class adj implements hdj {

    /* JADX INFO: renamed from: a */
    public static final adj f14637a = new adj();
    public static final Parcelable.Creator<adj> CREATOR = new wcj(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof adj);
    }

    public final int hashCode() {
        return 943961672;
    }

    public final String toString() {
        return "InviteLinkCreated";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
