package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class cw50 extends dw50 {

    /* JADX INFO: renamed from: a */
    public static final cw50 f42648a = new cw50();
    public static final Parcelable.Creator<cw50> CREATOR = new pq50(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
