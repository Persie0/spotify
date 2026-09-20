package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class sct implements vct {

    /* JADX INFO: renamed from: a */
    public static final sct f207800a = new sct();
    public static final Parcelable.Creator<sct> CREATOR = new qct(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
