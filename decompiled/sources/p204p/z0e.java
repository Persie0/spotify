package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class z0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final z0e f278073b = new z0e("quicksilver.iap");
    public static final Parcelable.Creator<z0e> CREATOR = new j0e(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
