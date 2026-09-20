package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class w0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final w0e f246706b = new w0e("payment_callback");
    public static final Parcelable.Creator<w0e> CREATOR = new j0e(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
