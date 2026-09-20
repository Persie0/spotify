package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bx30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final bx30 f31774c = new bx30(14, 2);
    public static final Parcelable.Creator<bx30> CREATOR = new bw30(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
