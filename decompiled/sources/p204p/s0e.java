package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class s0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final s0e f204363b = new s0e("messaging_utils");
    public static final Parcelable.Creator<s0e> CREATOR = new j0e(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
