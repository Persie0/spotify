package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class go90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final go90 f82917a = new go90();
    public static final Parcelable.Creator<go90> CREATOR = new ra90(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
