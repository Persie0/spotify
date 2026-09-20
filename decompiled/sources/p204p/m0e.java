package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class m0e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final m0e f138646b = new m0e("client_messaging_platform");
    public static final Parcelable.Creator<m0e> CREATOR = new j0e(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
