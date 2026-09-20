package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ttm0 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final ttm0 f223644a = new ttm0();
    public static final Parcelable.Creator<ttm0> CREATOR = new luh0(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
