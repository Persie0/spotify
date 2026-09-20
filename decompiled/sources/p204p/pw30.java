package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pw30 extends fx30 {

    /* JADX INFO: renamed from: c */
    public static final pw30 f181895c = new pw30(6, 3);
    public static final Parcelable.Creator<pw30> CREATOR = new bw30(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
