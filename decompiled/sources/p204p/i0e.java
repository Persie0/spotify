package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class i0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final i0e f97214b = new i0e("ads");
    public static final Parcelable.Creator<i0e> CREATOR = new fjd(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
