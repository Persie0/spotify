package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class uj41 implements wj41 {

    /* JADX INFO: renamed from: a */
    public static final uj41 f230902a = new uj41();
    public static final Parcelable.Creator<uj41> CREATOR = new tj41(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof uj41);
    }

    public final int hashCode() {
        return 1128484562;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
