package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class wlc1 implements xlc1 {

    /* JADX INFO: renamed from: a */
    public static final wlc1 f252514a = new wlc1();
    public static final Parcelable.Creator<wlc1> CREATOR = new nlc1(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wlc1);
    }

    public final int hashCode() {
        return 1227092461;
    }

    public final String toString() {
        return "Retry";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
