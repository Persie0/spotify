package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fw30 extends iw30 {

    /* JADX INFO: renamed from: c */
    public static final fw30 f73927c = new fw30(23, 1);
    public static final Parcelable.Creator<fw30> CREATOR = new bw30(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof fw30);
    }

    public final int hashCode() {
        return 1449961153;
    }

    public final String toString() {
        return "AskToJoinJamFullError";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
