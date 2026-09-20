package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class pl50 extends ql50 {

    /* JADX INFO: renamed from: a */
    public static final pl50 f178644a = new pl50();
    public static final Parcelable.Creator<pl50> CREATOR = new gd50(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
