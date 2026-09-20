package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class a1e extends e1e {

    /* JADX INFO: renamed from: b */
    public static final a1e f11392b = new a1e("route_uri");
    public static final Parcelable.Creator<a1e> CREATOR = new j0e(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
