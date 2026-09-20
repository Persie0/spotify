package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lp31 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final lp31 f135609a = new lp31();
    public static final Parcelable.Creator<lp31> CREATOR = new ln31(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
