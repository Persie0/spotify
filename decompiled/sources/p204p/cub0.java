package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class cub0 extends fub0 {

    /* JADX INFO: renamed from: a */
    public static final cub0 f42083a = new cub0();
    public static final Parcelable.Creator<cub0> CREATOR = new apb0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
