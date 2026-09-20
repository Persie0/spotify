package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ax30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final ax30 f20753c = new ax30(13, 2);
    public static final Parcelable.Creator<ax30> CREATOR = new bw30(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
