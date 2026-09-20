package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class dc3 extends ec3 {

    /* JADX INFO: renamed from: a */
    public static final dc3 f47410a = new dc3();
    public static final Parcelable.Creator<dc3> CREATOR = new bc3(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
