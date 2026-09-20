package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qw30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final qw30 f193156c = new qw30(1, 2);
    public static final Parcelable.Creator<qw30> CREATOR = new bw30(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
