package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v270 implements b370 {

    /* JADX INFO: renamed from: a */
    public static final v270 f236557a = new v270();
    public static final Parcelable.Creator<v270> CREATOR = new pq50(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
