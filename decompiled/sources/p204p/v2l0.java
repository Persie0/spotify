package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class v2l0 extends z2l0 {

    /* JADX INFO: renamed from: a */
    public static final v2l0 f236696a = new v2l0();
    public static final Parcelable.Creator<v2l0> CREATOR = new oxk0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
