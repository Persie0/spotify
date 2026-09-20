package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class r0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final r0e f194473b = new r0e("membership_checkout");
    public static final Parcelable.Creator<r0e> CREATOR = new j0e(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
