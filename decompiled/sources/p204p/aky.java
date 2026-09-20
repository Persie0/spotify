package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class aky implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final aky f16677a = new aky();
    public static final Parcelable.Creator<aky> CREATOR = new p7y(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aky);
    }

    public final int hashCode() {
        return -958338014;
    }

    public final String toString() {
        return "ReportSuccessResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
