package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class v1u extends b2u {

    /* JADX INFO: renamed from: a */
    public static final v1u f236476a = new v1u();
    public static final Parcelable.Creator<v1u> CREATOR = new qct(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
