package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class eo90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final eo90 f61346a = new eo90();
    public static final Parcelable.Creator<eo90> CREATOR = new ra90(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
