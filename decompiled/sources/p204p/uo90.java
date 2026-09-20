package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class uo90 extends wo90 {

    /* JADX INFO: renamed from: a */
    public static final uo90 f232359a = new uo90();
    public static final Parcelable.Creator<uo90> CREATOR = new ra90(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
