package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class jo90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final jo90 f114374a = new jo90();
    public static final Parcelable.Creator<jo90> CREATOR = new ra90(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
